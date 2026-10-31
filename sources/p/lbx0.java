package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class lbx0 extends nbx0 {
    public static final lbx0 a = new lbx0();
    public static final Parcelable.Creator<lbx0> CREATOR = new wvw0((byte) 19);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof lbx0);
    }

    public final int hashCode() {
        return 675012127;
    }

    public final String toString() {
        return "TOP_ARTIST";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
