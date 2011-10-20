#!/bin/sh
gcc -m64 -c -fPIC src/main/c/testLib.c
gcc -m64 -shared testLib.o -o libtestLib.so
