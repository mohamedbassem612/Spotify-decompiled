package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class t931 implements Parcelable {
    public static final t931 a = new t931();
    public static final Parcelable.Creator<t931> CREATOR = new s231((byte) 9);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof t931);
    }

    public final int hashCode() {
        return -155685419;
    }

    public final String toString() {
        return "RerouteToWrapped";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
