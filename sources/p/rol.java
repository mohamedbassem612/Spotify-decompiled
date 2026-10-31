package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class rol implements tol {
    public static final rol a = new rol();
    public static final Parcelable.Creator<rol> CREATOR = new pol((byte) 1);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof rol);
    }

    public final int hashCode() {
        return -328261745;
    }

    public final String toString() {
        return "UserLeft";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
