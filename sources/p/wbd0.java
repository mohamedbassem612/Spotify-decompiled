package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wbd0 implements acd0 {
    public static final wbd0 a = new wbd0();
    public static final Parcelable.Creator<wbd0> CREATOR = new lad0((byte) 15);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof wbd0);
    }

    public final int hashCode() {
        return -1764182516;
    }

    public final String toString() {
        return "Failed";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
