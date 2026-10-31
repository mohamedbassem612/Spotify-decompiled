package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class eby extends fby {
    public static final eby a = new eby();
    public static final Parcelable.Creator<eby> CREATOR = new utx((byte) 21);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof eby);
    }

    public final int hashCode() {
        return -1481467351;
    }

    public final String toString() {
        return "Recents";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
