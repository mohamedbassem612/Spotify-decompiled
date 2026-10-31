package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mi70 extends oi70 {
    public static final mi70 c = new mi70(29, 2);
    public static final Parcelable.Creator<mi70> CREATOR = new ai70((byte) 10);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof mi70);
    }

    public final int hashCode() {
        return -1899681600;
    }

    public final String toString() {
        return "JoinRequestRejected";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
