package com.kaichunlin.transition.adapter;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Stores an adapter's open/close state when applicable.
 */
public class AdapterState {
    public static final int CLOSE = 0;
    public static final int OPEN = 1;

    @IntDef({OPEN, CLOSE})
    @Retention(RetentionPolicy.SOURCE)
    @interface State {
    }

    private int mState;
    private boolean mTransiting;

    public void setState(@State int state) {
        mState = state;
    }

    @State
    public int getState() {
        return mState;
    }

    public boolean isOpen() {
        return mState == OPEN;
    }

    public boolean isClose() {
        return mState == CLOSE;
    }

    public boolean isTransiting() {
        return mTransiting;
    }

    public void setTransiting(boolean transiting) {
        mTransiting = transiting;
    }
}
