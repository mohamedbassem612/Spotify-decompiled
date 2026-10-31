package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class x8k0 implements a9k0 {
    public static final x8k0 a = new x8k0();
    public static final Parcelable.Creator<x8k0> CREATOR = new ohj0((byte) 15);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof x8k0);
    }

    public final int hashCode() {
        return -1962994812;
    }

    public final String toString() {
        return "OnlyAvailableInFree";
    }

    @Override // p.a9k0
    public final d9k0 v() {
        return b9k0.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
