package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ga31 implements ha31 {
    public static final ga31 a = new ga31();
    public static final Parcelable.Creator<ga31> CREATOR = new s231((byte) 13);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ga31);
    }

    public final int hashCode() {
        return -1329398829;
    }

    public final String toString() {
        return "OnToggleAudio";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
