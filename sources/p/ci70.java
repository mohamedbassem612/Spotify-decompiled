package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ci70 extends ji70 {
    public static final ci70 c = new ci70(25, 1);
    public static final Parcelable.Creator<ci70> CREATOR = new ai70((byte) 1);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ci70);
    }

    public final int hashCode() {
        return 1742557880;
    }

    public final String toString() {
        return "AcceptRequestGenericError";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
