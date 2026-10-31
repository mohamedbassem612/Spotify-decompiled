package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mhj0 extends shj0 {
    public static final mhj0 a = new mhj0();
    public static final Parcelable.Creator<mhj0> CREATOR = new rqi0((byte) 28);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof mhj0);
    }

    public final int hashCode() {
        return 538161824;
    }

    public final String toString() {
        return "Loaded";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
