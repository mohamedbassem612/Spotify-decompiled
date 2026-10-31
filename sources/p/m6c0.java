package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class m6c0 extends o6c0 {
    public static final m6c0 a = new m6c0();
    public static final Parcelable.Creator<m6c0> CREATOR = new v5c0(7);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof m6c0);
    }

    public final int hashCode() {
        return 1516929101;
    }

    public final String toString() {
        return "Gone";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
