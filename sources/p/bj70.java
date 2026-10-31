package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bj70 extends hj70 {
    public static final bj70 c = new bj70(34, 1);
    public static final Parcelable.Creator<bj70> CREATOR = new ai70((byte) 24);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof bj70);
    }

    public final int hashCode() {
        return -324828020;
    }

    public final String toString() {
        return "PassengerOnlyQrCodeDialog";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
