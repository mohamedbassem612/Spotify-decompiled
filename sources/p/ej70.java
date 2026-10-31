package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ej70 extends hj70 {
    public static final ej70 c = new ej70(19, 2);
    public static final Parcelable.Creator<ej70> CREATOR = new ai70((byte) 27);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ej70);
    }

    public final int hashCode() {
        return 1686199172;
    }

    public final String toString() {
        return "StartJamError";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
