package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ect0 implements hct0 {
    public static final ect0 a = new ect0();
    public static final Parcelable.Creator<ect0> CREATOR = new r7t0((byte) 9);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ect0);
    }

    public final int hashCode() {
        return -1789623041;
    }

    public final String toString() {
        return "Free";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
