package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class iiz implements piz {
    public static final iiz a = new iiz();
    public static final Parcelable.Creator<iiz> CREATOR = new dez((byte) 12);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof iiz);
    }

    public final int hashCode() {
        return 1153186450;
    }

    public final String toString() {
        return "NotFriends";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
