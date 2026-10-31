package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class dbx0 extends nbx0 {
    public static final dbx0 a = new dbx0();
    public static final Parcelable.Creator<dbx0> CREATOR = new wvw0((byte) 11);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof dbx0);
    }

    public final int hashCode() {
        return 2114777813;
    }

    public final String toString() {
        return "ARTIST";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
