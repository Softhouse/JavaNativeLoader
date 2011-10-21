cl /c /TC /I"C:\Program Files\Java\jdk1.7.0_01\include" /I"C:\Program Files\Java\jdk1.7.0_01\include\win32" src\main\c\testLib.c
link /dll /OUT:testLib.dll testLib.obj

