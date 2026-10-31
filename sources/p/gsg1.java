package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class gsg1 extends hsg1 {
    public static final gsg1 d = new gsg1(blc0.ON_DEMAND_TRIAL_OPT_IN_UPSELL_SKIP_PREV);
    public static final Parcelable.Creator<gsg1> CREATOR = new h3g1((byte) 27);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof gsg1);
    }

    public final int hashCode() {
        return -1849253060;
    }

    public final String toString() {
        return "SkipPrevious";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
