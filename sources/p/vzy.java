package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vzy extends zzy {
    public static final vzy b = new vzy("accountTransition");
    public static final Parcelable.Creator<vzy> CREATOR = new jhy((byte) 20);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof vzy);
    }

    public final int hashCode() {
        return -1477025239;
    }

    public final String toString() {
        return "AccountTransition";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
