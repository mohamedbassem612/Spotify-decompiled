package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xzy extends zzy {
    public static final xzy b = new xzy("memberDetails");
    public static final Parcelable.Creator<xzy> CREATOR = new jhy((byte) 21);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof xzy);
    }

    public final int hashCode() {
        return -2100175729;
    }

    public final String toString() {
        return "MemberDetails";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
