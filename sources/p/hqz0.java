package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hqz0 implements mqz0 {
    public static final hqz0 a = new hqz0();
    public static final Parcelable.Creator<hqz0> CREATOR = new j1z0((byte) 26);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof hqz0);
    }

    public final int hashCode() {
        return -1910283680;
    }

    public final String toString() {
        return "AllItems";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
