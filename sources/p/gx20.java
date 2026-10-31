package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class gx20 extends nx20 {
    public static final gx20 d = new gx20(blc0.FMA_UPSELL_MUSIC_VIDEO);
    public static final Parcelable.Creator<gx20> CREATOR = new qe20((byte) 28);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof gx20);
    }

    public final int hashCode() {
        return 776913053;
    }

    public final String toString() {
        return "MusicVideo";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
