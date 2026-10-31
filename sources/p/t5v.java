package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class t5v extends u5v {
    public static final t5v a = new t5v();
    public static final Parcelable.Creator<t5v> CREATOR = new s5v((byte) 0);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof t5v);
    }

    public final int hashCode() {
        return -1500651140;
    }

    public final String toString() {
        return "Idle";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
