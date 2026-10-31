package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class iol implements tol {
    public static final iol a = new iol();
    public static final Parcelable.Creator<iol> CREATOR = new txk((byte) 23);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof iol);
    }

    public final int hashCode() {
        return -654335437;
    }

    public final String toString() {
        return "ChatCreated";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
