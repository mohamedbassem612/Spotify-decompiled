package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class iom implements nom {
    public static final iom a = new iom();
    public static final Parcelable.Creator<iom> CREATOR = new ezl((byte) 17);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof iom);
    }

    public final int hashCode() {
        return 1219326734;
    }

    public final String toString() {
        return "DELETED_FOR_SELF";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
