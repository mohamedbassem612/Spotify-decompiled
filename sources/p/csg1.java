package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class csg1 extends hsg1 {
    public static final csg1 d = new csg1(blc0.ON_DEMAND_TRIAL_OPT_IN_UPSELL_QUEUE_REORDER);
    public static final Parcelable.Creator<csg1> CREATOR = new h3g1((byte) 23);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof csg1);
    }

    public final int hashCode() {
        return 1339377744;
    }

    public final String toString() {
        return "QueueReorder";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
