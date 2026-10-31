package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ivh1 extends mvh1 {
    public static final ivh1 a = new ivh1();
    public static final Parcelable.Creator<ivh1> CREATOR = new gwg1((byte) 15);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ivh1);
    }

    public final int hashCode() {
        return -60484520;
    }

    public final String toString() {
        return "Monthly";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
