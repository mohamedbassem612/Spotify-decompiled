package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jbd0 implements tbd0 {
    public static final jbd0 a = new jbd0();
    public static final Parcelable.Creator<jbd0> CREATOR = new lad0((byte) 6);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof jbd0);
    }

    public final int hashCode() {
        return -1899135261;
    }

    public final String toString() {
        return "AddFriends";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
