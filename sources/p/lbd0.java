package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lbd0 implements mbd0 {
    public static final lbd0 a = new lbd0();
    public static final Parcelable.Creator<lbd0> CREATOR = new lad0((byte) 10);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof lbd0);
    }

    public final int hashCode() {
        return -1194522531;
    }

    public final String toString() {
        return "Playing";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
