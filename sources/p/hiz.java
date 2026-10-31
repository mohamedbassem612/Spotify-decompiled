package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hiz implements piz {
    public static final hiz a = new hiz();
    public static final Parcelable.Creator<hiz> CREATOR = new dez((byte) 11);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof hiz);
    }

    public final int hashCode() {
        return -1400319259;
    }

    public final String toString() {
        return "MembersLimitExceeded";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
