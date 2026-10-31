package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xg2 extends yg2 {
    public static final xg2 a = new xg2();
    public static final Parcelable.Creator<xg2> CREATOR = new ue2((byte) 7);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof xg2);
    }

    public final int hashCode() {
        return -235820821;
    }

    public final String toString() {
        return "Valid";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
