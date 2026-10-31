package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class aox extends hux {
    public static final aox c = new aox(new dsx(jon1.q(), oon1.z()), new dsx(qon1.q(), ton1.t()));
    public static final Parcelable.Creator<aox> CREATOR = new snx((byte) 7);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof aox);
    }

    public final int hashCode() {
        return -47865932;
    }

    public final String toString() {
        return "Home";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
