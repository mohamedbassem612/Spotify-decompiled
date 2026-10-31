package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jvh1 extends mvh1 {
    public static final jvh1 a = new jvh1();
    public static final Parcelable.Creator<jvh1> CREATOR = new gwg1((byte) 16);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof jvh1);
    }

    public final int hashCode() {
        return -1022892649;
    }

    public final String toString() {
        return "Never";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
