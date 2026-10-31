package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ngm1 implements vgm1 {
    public static final ngm1 a = new ngm1();
    public static final Parcelable.Creator<ngm1> CREATOR = new lfm1((byte) 13);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ngm1);
    }

    public final int hashCode() {
        return 967984205;
    }

    public final String toString() {
        return "PlaySharedAudio";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
