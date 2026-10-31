package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hk01 implements Parcelable {
    public static final hk01 a = new hk01();
    public static final Parcelable.Creator<hk01> CREATOR = new sj01((byte) 4);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof hk01);
    }

    public final int hashCode() {
        return -351994231;
    }

    public final String toString() {
        return "LogScreenshot";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
