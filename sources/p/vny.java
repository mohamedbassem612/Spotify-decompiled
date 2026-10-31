package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vny extends yny {
    public static final vny a = new vny();
    public static final Parcelable.Creator<vny> CREATOR = new jhy((byte) 3);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof vny);
    }

    public final int hashCode() {
        return -2117390634;
    }

    public final String toString() {
        return "Snapshot";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
