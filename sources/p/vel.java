package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vel implements yel {
    public static final vel a = new vel();
    public static final Parcelable.Creator<vel> CREATOR = new txk((byte) 9);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof vel);
    }

    public final int hashCode() {
        return -870103678;
    }

    public final String toString() {
        return "Availability";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
