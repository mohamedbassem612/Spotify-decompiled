package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jl extends kl {
    public static final jl b = new jl(false);
    public static final Parcelable.Creator<jl> CREATOR = new ad((byte) 18);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof jl);
    }

    public final int hashCode() {
        return -1486960326;
    }

    public final String toString() {
        return "Welcome";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
