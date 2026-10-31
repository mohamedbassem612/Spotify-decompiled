package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hi70 extends ji70 {
    public static final hi70 c = new hi70(20, 1);
    public static final Parcelable.Creator<hi70> CREATOR = new ai70((byte) 6);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof hi70);
    }

    public final int hashCode() {
        return -743460858;
    }

    public final String toString() {
        return "CancelRequestGenericError";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
