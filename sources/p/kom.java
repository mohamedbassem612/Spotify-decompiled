package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kom implements nom {
    public static final kom a = new kom();
    public static final Parcelable.Creator<kom> CREATOR = new ezl((byte) 19);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof kom);
    }

    public final int hashCode() {
        return -140445627;
    }

    public final String toString() {
        return "NOT_REPORTED";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
