package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zf81 implements cg81 {
    public static final zf81 a = new zf81();
    public static final Parcelable.Creator<zf81> CREATOR = new ro71((byte) 10);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof zf81);
    }

    public final int hashCode() {
        return -1726986784;
    }

    public final String toString() {
        return "Hidden";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
