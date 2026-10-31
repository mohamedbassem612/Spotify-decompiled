package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hx20 extends nx20 {
    public static final hx20 d = new hx20(blc0.FMA_UPSELL_QUEUE_REORDER);
    public static final Parcelable.Creator<hx20> CREATOR = new qe20((byte) 29);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof hx20);
    }

    public final int hashCode() {
        return -2121301967;
    }

    public final String toString() {
        return "QueueReorder";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
