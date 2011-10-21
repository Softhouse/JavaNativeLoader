## JavaNativeLoader ##

JavaNativeLoader helps with bundling of native libraries in java projects by providing automatic means of extracting and loading native libraries from the classpath.
To use it, put your native libraries in the classpath (probably in a jar file).
Then specify for each version of each native library what system (OS) and architecture they are for and feed this information to NativeLoader in your static initializers.
NativeLoader will then automatically load the correct versions of the native libraries when the classes are loaded.

### Sample usage ###

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


