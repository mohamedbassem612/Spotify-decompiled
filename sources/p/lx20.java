package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class lx20 extends nx20 {
    public static final lx20 d = new lx20(blc0.FMA_UPSELL_TRACK_SELECT);
    public static final Parcelable.Creator<lx20> CREATOR = new ix20((byte) 2);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof lx20);
    }

    public final int hashCode() {
        return -1766483008;
    }

    public final String toString() {
        return "TrackSelect";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
