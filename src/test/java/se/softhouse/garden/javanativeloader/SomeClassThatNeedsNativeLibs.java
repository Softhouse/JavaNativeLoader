/*
Copyright (c) 2011, Markus Gustavsson, Softhouse Consulting AB

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so:

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/

package se.softhouse.garden.javanativeloader;

import java.util.ArrayList;
import java.util.Collection;

/**
 * This class is an example of how to use the NativeLoader class to
 * bind jni methods at load time.
 */
public final class SomeClassThatNeedsNativeLibs {

    static {
        final Collection<NativeLoader.LibraryLoadInfo> loadInfos = new ArrayList<NativeLoader.LibraryLoadInfo>();
        loadInfos.add(new NativeLoader.LibraryLoadInfo("windows/i386/testLib.dll", NativeLoader.System.Windows, NativeLoader.Arch.i386));
        loadInfos.add(new NativeLoader.LibraryLoadInfo("windows/x64/testLib.dll", NativeLoader.System.Windows, NativeLoader.Arch.x64));
        loadInfos.add(new NativeLoader.LibraryLoadInfo("linux/i386/libtestLib.so", NativeLoader.System.Linux, NativeLoader.Arch.i386));
        loadInfos.add(new NativeLoader.LibraryLoadInfo("linux/x64/libtestLib.so", NativeLoader.System.Linux, NativeLoader.Arch.x64));
        loadInfos.add(new NativeLoader.LibraryLoadInfo("macosx/i386/libtestLib.dylib", NativeLoader.System.MacOSX, NativeLoader.Arch.i386));
        loadInfos.add(new NativeLoader.LibraryLoadInfo("macosx/x64/libtestLib.dylib", NativeLoader.System.MacOSX, NativeLoader.Arch.x64));
        NativeLoader.loadLibrary(loadInfos);
    }

    public native int add(int x, int y);
}
