package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ni70 extends oi70 {
    public static final ni70 c = new ni70(30, 2);
    public static final Parcelable.Creator<ni70> CREATOR = new ai70((byte) 11);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ni70);
    }

    public final int hashCode() {
        return -3964096;
    }

    public final String toString() {
        return "RejectJoinRequestSuccess";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
