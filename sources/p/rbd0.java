package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rbd0 implements tbd0 {
    public static final rbd0 a = new rbd0();
    public static final Parcelable.Creator<rbd0> CREATOR = new lad0((byte) 13);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof rbd0);
    }

    public final int hashCode() {
        return -1310000200;
    }

    public final String toString() {
        return "Invite";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
