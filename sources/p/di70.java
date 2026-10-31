package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class di70 extends ji70 {
    public static final di70 c = new di70(24, 1);
    public static final Parcelable.Creator<di70> CREATOR = new ai70((byte) 2);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof di70);
    }

    public final int hashCode() {
        return 181128478;
    }

    public final String toString() {
        return "AcceptRequestSessionFull";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
