package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class lol implements tol {
    public static final lol a = new lol();
    public static final Parcelable.Creator<lol> CREATOR = new txk((byte) 26);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof lol);
    }

    public final int hashCode() {
        return 943961672;
    }

    public final String toString() {
        return "InviteLinkCreated";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
