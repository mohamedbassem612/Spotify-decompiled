package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kad0 implements qad0 {
    public static final kad0 a = new kad0();
    public static final Parcelable.Creator<kad0> CREATOR = new bzc0((byte) 29);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof kad0);
    }

    public final int hashCode() {
        return -515912136;
    }

    public final String toString() {
        return "MultipleIdle";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
