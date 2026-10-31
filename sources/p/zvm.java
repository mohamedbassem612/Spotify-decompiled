package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class zvm implements bwm {
    public static final zvm a = new zvm();
    public static final Parcelable.Creator<zvm> CREATOR = new rtm((byte) 2);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof zvm);
    }

    public final int hashCode() {
        return -293886255;
    }

    public final String toString() {
        return "Admin";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
