package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hgm0 implements jhm0 {
    public static final hgm0 a = new hgm0();
    public static final Parcelable.Creator<hgm0> CREATOR = new fgm0((byte) 1);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof hgm0);
    }

    public final int hashCode() {
        return 2098840424;
    }

    public final String toString() {
        return "LoadError";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
