package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bsg1 extends hsg1 {
    public static final bsg1 d = new bsg1(blc0.ON_DEMAND_TRIAL_OPT_IN_UPSELL_PICK_TRACK);
    public static final Parcelable.Creator<bsg1> CREATOR = new h3g1((byte) 22);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof bsg1);
    }

    public final int hashCode() {
        return -780062268;
    }

    public final String toString() {
        return "PickTrack";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
