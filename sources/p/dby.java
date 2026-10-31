package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dby extends fby {
    public static final dby a = new dby();
    public static final Parcelable.Creator<dby> CREATOR = new utx((byte) 20);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof dby);
    }

    public final int hashCode() {
        return 2024530934;
    }

    public final String toString() {
        return "NewRelease";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
