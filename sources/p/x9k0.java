package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class x9k0 implements y9k0 {
    public static final x9k0 a = new x9k0();
    public static final Parcelable.Creator<x9k0> CREATOR = new w9k0((byte) 0);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof x9k0);
    }

    public final int hashCode() {
        return -1268179290;
    }

    public final String toString() {
        return "WontPlayOverJam";
    }

    @Override // p.y9k0
    public final o9k0 v() {
        return n9k0.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
