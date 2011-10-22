#!/bin/sh
gcc -m32 -c -fPIC -I/usr/lib/jvm/java-7-openjdk-amd64/include/ src/test/c/testLib.c
gcc -m32 -shared testLib.o -o libtestLib.so
