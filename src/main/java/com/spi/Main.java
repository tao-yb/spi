package com.spi;

import com.spi.common.ExtensionLoader;
import com.spi.compile.Compiler;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Method;

@Slf4j
public class Main {

    @SneakyThrows
    public static void main(String[] args) {
        final Compiler compiler = ExtensionLoader.getExtensionLoader(Compiler.class).getDefaultExtension();
        final Class<?> testClass = compiler.compile(generateCode(),
                Thread.currentThread().getContextClassLoader());
        final Method[] declaredMethods = testClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            declaredMethod.invoke(testClass.newInstance(),"abc");
        }
        log.info(compiler.toString());
    }

    static String generateCode() {
        return "package com.spi;\n" +
                "\n" +
                "public class Test {\n" +
                "    public void print(String arg) {\n" +
                "        System.out.println(\"com.spi.Test print msg:\" + arg);\n" +
                "    }\n" +
                "}\n";
    }
}
