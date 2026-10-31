package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hom implements nom {
    public static final hom a = new hom();
    public static final Parcelable.Creator<hom> CREATOR = new ezl((byte) 16);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof hom);
    }

    public final int hashCode() {
        return 1978978687;
    }

    public final String toString() {
        return "DELETED_FOR_ALL";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
