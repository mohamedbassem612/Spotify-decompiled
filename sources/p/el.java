package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class el extends kl {
    public static final el b = new el(true);
    public static final Parcelable.Creator<el> CREATOR = new ad((byte) 13);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof el);
    }

    public final int hashCode() {
        return -1080980627;
    }

    public final String toString() {
        return "Pin";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
