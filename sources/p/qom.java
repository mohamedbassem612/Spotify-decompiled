package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qom implements rom {
    public static final qom a = new qom();
    public static final Parcelable.Creator<qom> CREATOR = new ezl((byte) 24);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof qom);
    }

    public final int hashCode() {
        return -1095044347;
    }

    public final String toString() {
        return "Sent";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
