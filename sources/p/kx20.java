package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kx20 extends nx20 {
    public static final kx20 d = new kx20(blc0.FMA_UPSELL_SKIP_NEXT);
    public static final Parcelable.Creator<kx20> CREATOR = new ix20((byte) 1);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof kx20);
    }

    public final int hashCode() {
        return 131247641;
    }

    public final String toString() {
        return "SkipNext";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
