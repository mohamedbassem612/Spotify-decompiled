package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class giz implements piz {
    public static final giz a = new giz();
    public static final Parcelable.Creator<giz> CREATOR = new dez((byte) 10);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof giz);
    }

    public final int hashCode() {
        return -957143941;
    }

    public final String toString() {
        return "LinkExpired";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
