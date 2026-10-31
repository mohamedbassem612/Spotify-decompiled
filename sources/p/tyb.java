package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class tyb extends azb {
    public static final tyb a = new tyb();
    public static final Parcelable.Creator<tyb> CREATOR = new mra((byte) 25);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof tyb);
    }

    public final int hashCode() {
        return 57341269;
    }

    public final String toString() {
        return "Filter";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
