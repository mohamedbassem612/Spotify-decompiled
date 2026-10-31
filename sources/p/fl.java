package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fl extends kl {
    public static final fl b = new fl(false);
    public static final Parcelable.Creator<fl> CREATOR = new ad((byte) 14);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof fl);
    }

    public final int hashCode() {
        return 267646784;
    }

    public final String toString() {
        return "Submit";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
