package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class cby extends fby {
    public static final cby a = new cby();
    public static final Parcelable.Creator<cby> CREATOR = new utx((byte) 19);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof cby);
    }

    public final int hashCode() {
        return -1487892814;
    }

    public final String toString() {
        return "BestMatch";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
