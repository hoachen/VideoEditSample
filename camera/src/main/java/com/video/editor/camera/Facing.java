package com.video.editor.camera;

public enum Facing {
    NONE(-1),
    FRONT(0),
    BACK(1);

    private final int value;

    public final int getValue() {
        return this.value;
    }

    public Facing opposite() {
        return this == FRONT ? BACK : FRONT;
    }

    private Facing(int value) {
        this.value = value;
    }
}
