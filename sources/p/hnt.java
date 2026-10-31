package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class hnt extends jnt {
    public static final hnt a = new hnt();
    public static final Parcelable.Creator<hnt> CREATOR = new qms((byte) 25);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof hnt);
    }

    public final int hashCode() {
        return -449705165;
    }

    public final String toString() {
        return "RestrictionsDisabled";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
