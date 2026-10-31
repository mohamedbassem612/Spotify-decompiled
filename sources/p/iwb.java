package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class iwb extends lwb {
    public static final iwb a = new iwb();
    public static final Parcelable.Creator<iwb> CREATOR = new mra((byte) 17);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof iwb);
    }

    public final int hashCode() {
        return 1538271164;
    }

    public final String toString() {
        return "Dismiss";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
