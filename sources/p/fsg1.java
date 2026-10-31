package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fsg1 extends hsg1 {
    public static final fsg1 d = new fsg1(blc0.ON_DEMAND_TRIAL_OPT_IN_UPSELL_SKIP_NEXT);
    public static final Parcelable.Creator<fsg1> CREATOR = new h3g1((byte) 26);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof fsg1);
    }

    public final int hashCode() {
        return -1551249002;
    }

    public final String toString() {
        return "SkipLimit";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
