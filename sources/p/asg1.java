package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class asg1 extends hsg1 {
    public static final asg1 d = new asg1(blc0.ON_DEMAND_TRIAL_OPT_IN_UPSELL_DOWNLOAD);
    public static final Parcelable.Creator<asg1> CREATOR = new h3g1((byte) 21);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof asg1);
    }

    public final int hashCode() {
        return -628877010;
    }

    public final String toString() {
        return "Download";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
