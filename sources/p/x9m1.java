package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class x9m1 implements pam1 {
    public static final x9m1 a = new x9m1();
    public static final Parcelable.Creator<x9m1> CREATOR = new w8m1((byte) 8);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof x9m1);
    }

    public final int hashCode() {
        return -1103576994;
    }

    public final String toString() {
        return "FlareReady";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
