package com.video.editor.base;

import java.nio.ByteBuffer;

public class JniCommon {

    /** Functions to increment/decrement an rtc::RefCountInterface pointer. */
    public static native void nativeAddRef(long refCountedPointer);
    public static native void nativeReleaseRef(long refCountedPointer);

    public static native ByteBuffer nativeAllocateByteBuffer(int size);
    public static native void nativeFreeByteBuffer(ByteBuffer buffer);

}
