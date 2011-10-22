#!/bin/sh
gcc -m64 -c -fPIC -I/System/Library/Frameworks/JavaVM.framework/Headers src/test/c/testLib.c
gcc -m64 -dynamiclib -current_version 1.0  testLib.o  -o libtestLib.dylib
