package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hvh1 extends mvh1 {
    public static final hvh1 a = new hvh1();
    public static final Parcelable.Creator<hvh1> CREATOR = new gwg1((byte) 14);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof hvh1);
    }

    public final int hashCode() {
        return -1032259292;
    }

    public final String toString() {
        return "Daily";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
