package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class w8t0 extends x8t0 {
    public static final w8t0 a = new w8t0();
    public static final Parcelable.Creator<w8t0> CREATOR = new r7t0((byte) 7);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof w8t0);
    }

    public final int hashCode() {
        return -1273168828;
    }

    public final String toString() {
        return "SelfManagedMember";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
