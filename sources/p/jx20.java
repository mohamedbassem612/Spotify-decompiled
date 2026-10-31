package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jx20 extends nx20 {
    public static final jx20 d = new jx20(blc0.FMA_UPSELL_SHUFFLE);
    public static final Parcelable.Creator<jx20> CREATOR = new ix20((byte) 0);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof jx20);
    }

    public final int hashCode() {
        return -209393390;
    }

    public final String toString() {
        return "Shuffle";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
