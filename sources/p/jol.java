package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class jol implements tol {
    public static final jol a = new jol();
    public static final Parcelable.Creator<jol> CREATOR = new txk((byte) 24);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof jol);
    }

    public final int hashCode() {
        return -2099305612;
    }

    public final String toString() {
        return "ChatNameChanged";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
