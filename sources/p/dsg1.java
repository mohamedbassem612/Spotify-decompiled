package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class dsg1 extends hsg1 {
    public static final dsg1 d = new dsg1(blc0.ON_DEMAND_TRIAL_OPT_IN_UPSELL_SCRUB);
    public static final Parcelable.Creator<dsg1> CREATOR = new h3g1((byte) 24);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof dsg1);
    }

    public final int hashCode() {
        return 519994677;
    }

    public final String toString() {
        return "Seekbar";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
