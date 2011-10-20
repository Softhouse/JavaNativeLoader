package se.softhouse.garden.javanativeloader;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * User: mac
 * Date: 10/20/11
 * Time: 20:11
 */
public final class TestNativeLoader {

    @Test(expected = RuntimeException.class)
    public void cannotLoadNonExistingResource() {
        NativeLoader.loadLibrary("foo");
    }

    @Test
    public void canLoadLibraryInClassPath() {
        final Collection<NativeLoader.LibraryLoadInfo> loadInfos = new ArrayList<NativeLoader.LibraryLoadInfo>();
        loadInfos.add(new NativeLoader.LibraryLoadInfo("windows/i386/testLib.dll", NativeLoader.System.Windows, NativeLoader.Arch.i386));
        loadInfos.add(new NativeLoader.LibraryLoadInfo("windows/x64/testLib.dll", NativeLoader.System.Windows, NativeLoader.Arch.x64));
        loadInfos.add(new NativeLoader.LibraryLoadInfo("linux/i386/libtestLib.so", NativeLoader.System.Linux, NativeLoader.Arch.i386));
        loadInfos.add(new NativeLoader.LibraryLoadInfo("linux/x64/libtestLib.so", NativeLoader.System.Linux, NativeLoader.Arch.x64));
        loadInfos.add(new NativeLoader.LibraryLoadInfo("macosx/i386/libtestLib.dylib", NativeLoader.System.MacOSX, NativeLoader.Arch.i386));
        loadInfos.add(new NativeLoader.LibraryLoadInfo("macosx/x64/libtestLib.dylib", NativeLoader.System.MacOSX, NativeLoader.Arch.x64));
        NativeLoader.loadLibrary(loadInfos);
    }
}
