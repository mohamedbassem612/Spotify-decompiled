package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ube0 implements xbe0 {
    public static final ube0 a = new ube0();
    public static final Parcelable.Creator<ube0> CREATOR = new lbe0((byte) 2);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ube0);
    }

    public final int hashCode() {
        return -1492130101;
    }

    public final String toString() {
        return "Offline";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
