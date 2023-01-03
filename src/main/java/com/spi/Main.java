package com.spi;

import com.spi.common.Compiler;
import com.spi.common.ExtensionLoader;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

    public static void main(String[] args) {
        final Compiler compiler = ExtensionLoader.getExtensionLoader(Compiler.class).getAdaptiveExtension();
        log.info(compiler.toString());
    }
}
