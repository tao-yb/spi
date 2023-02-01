package com.spi.compile;

import com.spi.common.SPI;

@SPI("javassist")
public interface Compiler {


    /**
     * Compile java source code.
     *
     * @param code        Java source code
     * @param classLoader classloader
     * @return Compiled class
     */
    Class<?> compile(String code, ClassLoader classLoader);
}
