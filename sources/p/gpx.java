package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class gpx extends hux {
    public static final gpx c = new gpx(new dsx(who1.s(), zho1.E()), null);
    public static final byte d = 8;
    public static final Parcelable.Creator<gpx> CREATOR = new yox((byte) 7);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof gpx);
    }

    public final int hashCode() {
        return -1038383899;
    }

    public final String toString() {
        return "MoreAndroid";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
