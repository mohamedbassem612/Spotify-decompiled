package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cv1 implements gv1 {
    public static final cv1 a = new cv1();
    public static final Parcelable.Creator<cv1> CREATOR = new d41((byte) 28);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof cv1);
    }

    public final int hashCode() {
        return -2086288693;
    }

    public final String toString() {
        return "Changed";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
