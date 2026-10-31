package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class qol implements tol {
    public static final qol a = new qol();
    public static final Parcelable.Creator<qol> CREATOR = new pol((byte) 0);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof qol);
    }

    public final int hashCode() {
        return -1974860591;
    }

    public final String toString() {
        return "UserJoined";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
