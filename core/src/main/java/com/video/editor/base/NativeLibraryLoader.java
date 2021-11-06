package com.video.editor.base;

public interface NativeLibraryLoader {

    /**
     * Loads a native library with the given name.
     *
     * @return True on success
     */
    boolean load(String name);
}
