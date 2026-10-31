package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fx20 extends nx20 {
    public static final fx20 d = new fx20(blc0.FMA_UPSELL_DOWNLOADS);
    public static final Parcelable.Creator<fx20> CREATOR = new qe20((byte) 27);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof fx20);
    }

    public final int hashCode() {
        return -992098108;
    }

    public final String toString() {
        return "Downloads";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
