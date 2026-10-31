package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ifm0 implements pfm0 {
    public static final ifm0 a = new ifm0();
    public static final Parcelable.Creator<ifm0> CREATOR = new w9k0((byte) 16);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ifm0);
    }

    public final int hashCode() {
        return -20977996;
    }

    public final String toString() {
        return "Playback";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
