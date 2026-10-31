package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class u931 implements Parcelable {
    public static final u931 a = new u931();
    public static final Parcelable.Creator<u931> CREATOR = new s231((byte) 10);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof u931);
    }

    public final int hashCode() {
        return -2077153661;
    }

    public final String toString() {
        return "UnmuteAudio";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
