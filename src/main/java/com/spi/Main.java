package com.spi;

import com.spi.compile.Compiler;
import com.spi.common.ExtensionLoader;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

    public static void main(String[] args) {
        final Compiler compiler = ExtensionLoader.getExtensionLoader(Compiler.class).getDefaultExtension();
        log.info(compiler.toString());
    }
}
