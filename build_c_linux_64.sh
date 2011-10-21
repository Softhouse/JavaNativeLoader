#!/bin/sh
gcc -m64 -c -fPIC -I/usr/lib/jvm/java-7-openjdk-amd64/include/ src/main/c/testLib.c
gcc -m64 -shared testLib.o -o libtestLib.so
