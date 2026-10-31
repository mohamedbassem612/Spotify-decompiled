package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ex20 extends nx20 {
    public static final ex20 d = new ex20(blc0.FMA_UPSELL_AUDIO_QUALITY);
    public static final Parcelable.Creator<ex20> CREATOR = new qe20((byte) 26);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ex20);
    }

    public final int hashCode() {
        return 325166544;
    }

    public final String toString() {
        return "AudioQuality";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
