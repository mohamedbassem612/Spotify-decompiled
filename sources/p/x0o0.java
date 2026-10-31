package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class x0o0 implements y0o0 {
    public static final x0o0 a = new x0o0();
    public static final Parcelable.Creator<x0o0> CREATOR = new dan0((byte) 24);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof x0o0);
    }

    public final int hashCode() {
        return -1401231594;
    }

    public final String toString() {
        return "Settings";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
