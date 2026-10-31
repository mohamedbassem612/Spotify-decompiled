package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zng1 implements aog1 {
    public static final zng1 a = new zng1();
    public static final Parcelable.Creator<zng1> CREATOR = new h3g1((byte) 20);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof zng1);
    }

    public final int hashCode() {
        return -1550803143;
    }

    public final String toString() {
        return "Unsupported";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
