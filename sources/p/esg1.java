package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class esg1 extends hsg1 {
    public static final esg1 d = new esg1(blc0.ON_DEMAND_TRIAL_OPT_IN_UPSELL_UNSHUFFLE);
    public static final Parcelable.Creator<esg1> CREATOR = new h3g1((byte) 25);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof esg1);
    }

    public final int hashCode() {
        return 620513683;
    }

    public final String toString() {
        return "Shuffle";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
