package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class t9k0 implements y9k0 {
    public static final t9k0 a = new t9k0();
    public static final Parcelable.Creator<t9k0> CREATOR = new ohj0((byte) 27);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof t9k0);
    }

    public final int hashCode() {
        return -1510706127;
    }

    public final String toString() {
        return "OfflineMixingUnavailable";
    }

    @Override // p.y9k0
    public final o9k0 v() {
        return m9k0.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
