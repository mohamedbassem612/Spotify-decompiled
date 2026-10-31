package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vg2 extends yg2 {
    public static final vg2 a = new vg2();
    public static final Parcelable.Creator<vg2> CREATOR = new ue2((byte) 5);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof vg2);
    }

    public final int hashCode() {
        return -1466251092;
    }

    public final String toString() {
        return "NotValidated";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
