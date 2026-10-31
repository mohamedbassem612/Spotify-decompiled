package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ei70 extends ji70 {
    public static final ei70 c = new ei70(21, 1);
    public static final Parcelable.Creator<ei70> CREATOR = new ai70((byte) 3);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ei70);
    }

    public final int hashCode() {
        return -1781821969;
    }

    public final String toString() {
        return "AskToJoinGenericError";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
