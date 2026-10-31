package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class g5e0 implements n5e0 {
    public static final g5e0 a = new g5e0();
    public static final Parcelable.Creator<g5e0> CREATOR = new qod0((byte) 13);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof g5e0);
    }

    public final int hashCode() {
        return 1587549934;
    }

    public final String toString() {
        return "Loading";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
