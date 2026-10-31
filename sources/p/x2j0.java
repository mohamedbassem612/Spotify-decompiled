package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class x2j0 implements y2j0 {
    public static final x2j0 a = new x2j0();
    public static final Parcelable.Creator<x2j0> CREATOR = new rqi0((byte) 8);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof x2j0);
    }

    public final int hashCode() {
        return -2072414015;
    }

    public final String toString() {
        return "None";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
