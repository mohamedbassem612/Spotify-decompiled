package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zk extends kl {
    public static final zk b = new zk(true);
    public static final Parcelable.Creator<zk> CREATOR = new ad((byte) 8);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof zk);
    }

    public final int hashCode() {
        return -410914158;
    }

    public final String toString() {
        return "AgeVerification";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
