package com.google.android.material.appbar;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import p.i5;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class f extends i5 {
    public static final Parcelable.Creator<f> CREATOR = new e();
    public boolean c;
    public int d;
    public float e;
    public boolean f;

    public f(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.c = parcel.readByte() != 0;
        this.d = parcel.readInt();
        this.e = parcel.readFloat();
        this.f = parcel.readByte() != 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.d);
        parcel.writeFloat(this.e);
        parcel.writeByte(this.f ? (byte) 1 : (byte) 0);
    }

    public f() {
        super(AbsSavedState.EMPTY_STATE);
    }
}
