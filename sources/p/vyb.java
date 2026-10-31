package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class vyb extends azb {
    public static final vyb a = new vyb();
    public static final Parcelable.Creator<vyb> CREATOR = new mra((byte) 27);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof vyb);
    }

    public final int hashCode() {
        return -1458548874;
    }

    public final String toString() {
        return "Jogwheel";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
