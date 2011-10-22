#!/bin/sh
gcc -m32 -c -fPIC -I/System/Library/Frameworks/JavaVM.framework/Headers src/test/c/testLib.c
gcc -m32 -dynamiclib -current_version 1.0  testLib.o  -o libtestLib.dylib
