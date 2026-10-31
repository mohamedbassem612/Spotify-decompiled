package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xyb extends azb {
    public static final xyb a = new xyb();
    public static final Parcelable.Creator<xyb> CREATOR = new mra((byte) 29);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof xyb);
    }

    public final int hashCode() {
        return 213975930;
    }

    public final String toString() {
        return "Unspecified";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
