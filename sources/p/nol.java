package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class nol implements tol {
    public static final nol a = new nol();
    public static final Parcelable.Creator<nol> CREATOR = new txk((byte) 28);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof nol);
    }

    public final int hashCode() {
        return 1273193029;
    }

    public final String toString() {
        return "PhotoChange";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
