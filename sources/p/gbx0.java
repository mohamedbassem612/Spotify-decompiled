package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class gbx0 extends nbx0 {
    public static final gbx0 a = new gbx0();
    public static final Parcelable.Creator<gbx0> CREATOR = new wvw0((byte) 14);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof gbx0);
    }

    public final int hashCode() {
        return -1674557127;
    }

    public final String toString() {
        return "INCOMING_FRIEND_REQUEST";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
