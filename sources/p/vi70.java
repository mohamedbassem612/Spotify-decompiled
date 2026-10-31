package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vi70 extends hj70 {
    public static final vi70 c = new vi70(31, 1);
    public static final Parcelable.Creator<vi70> CREATOR = new ai70((byte) 18);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof vi70);
    }

    public final int hashCode() {
        return 215177154;
    }

    public final String toString() {
        return "ListeningActivityStartJamErrorDialog";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
