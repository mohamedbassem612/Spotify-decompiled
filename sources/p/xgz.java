package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xgz implements ygz {
    public static final xgz a = new xgz();
    public static final Parcelable.Creator<xgz> CREATOR = new dez((byte) 7);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof xgz);
    }

    public final int hashCode() {
        return -998277399;
    }

    public final String toString() {
        return "PartialError";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
