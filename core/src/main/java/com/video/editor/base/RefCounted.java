package com.video.editor.base;

public interface RefCounted {

    /** Increases ref count by one. */
    @CalledByNative void retain();

    /**
     * Decreases ref count by one. When the ref count reaches zero, resources related to the object
     * will be freed.
     */
    @CalledByNative void release();
}
