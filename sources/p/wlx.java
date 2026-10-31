package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wlx extends hux {
    public static final wlx c = new wlx(new dsx(xap1.v(), yap1.k()), new dsx(bbp1.j(), cbp1.l()));
    public static final byte d = 8;
    public static final Parcelable.Creator<wlx> CREATOR = new hlx((byte) 14);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof wlx);
    }

    public final int hashCode() {
        return -183360077;
    }

    public final String toString() {
        return "Collection";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
