package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ii70 extends ji70 {
    public static final ii70 c = new ii70(27, 1);
    public static final Parcelable.Creator<ii70> CREATOR = new ai70((byte) 7);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ii70);
    }

    public final int hashCode() {
        return -1968421183;
    }

    public final String toString() {
        return "RejectRequestGenericError";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
