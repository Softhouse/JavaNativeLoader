cl /c /TC src\main\c\testLib.c
link /dll /OUT:testLib.dll /def:testLib.def testLib.obj

