package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class x471 extends o571 {
    public static final x471 d = new x471(11, "line");
    public static final Parcelable.Creator<x471> CREATOR = new o471((byte) 8);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof x471);
    }

    public final int hashCode() {
        return -1478967218;
    }

    public final String toString() {
        return "Line";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
