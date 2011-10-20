#!/bin/sh
gcc -m32 -c -fPIC src/main/c/testLib.c
gcc -m32 -shared testLib.o -o libtestLib.so
