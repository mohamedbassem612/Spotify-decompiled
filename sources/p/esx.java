package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class esx extends hux {
    public static final esx c = new esx(new dsx(x3p1.t(), a4p1.i()), new dsx(c4p1.u(), e4p1.m()));
    public static final byte d = 8;
    public static final Parcelable.Creator<esx> CREATOR = new jrx((byte) 19);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof esx);
    }

    public final int hashCode() {
        return 1550823229;
    }

    public final String toString() {
        return "Search";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
