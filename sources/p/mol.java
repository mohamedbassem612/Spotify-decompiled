package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class mol implements tol {
    public static final mol a = new mol();
    public static final Parcelable.Creator<mol> CREATOR = new txk((byte) 27);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof mol);
    }

    public final int hashCode() {
        return 929024534;
    }

    public final String toString() {
        return "NewAdminSet";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
