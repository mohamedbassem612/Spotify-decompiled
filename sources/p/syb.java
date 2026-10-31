package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class syb extends azb {
    public static final syb a = new syb();
    public static final Parcelable.Creator<syb> CREATOR = new mra((byte) 24);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof syb);
    }

    public final int hashCode() {
        return 1024699657;
    }

    public final String toString() {
        return "Eq";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
