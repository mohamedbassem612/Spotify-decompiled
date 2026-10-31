package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sbd0 implements tbd0 {
    public static final sbd0 a = new sbd0();
    public static final Parcelable.Creator<sbd0> CREATOR = new lad0((byte) 14);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof sbd0);
    }

    public final int hashCode() {
        return -563908143;
    }

    public final String toString() {
        return "YourActivity";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
