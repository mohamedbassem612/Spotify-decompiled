package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class uzy extends zzy {
    public static final uzy b = new uzy("accountCreation");
    public static final Parcelable.Creator<uzy> CREATOR = new jhy((byte) 19);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof uzy);
    }

    public final int hashCode() {
        return 1230735539;
    }

    public final String toString() {
        return "AccountCreation";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
