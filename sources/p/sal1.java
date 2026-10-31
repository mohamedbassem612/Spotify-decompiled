package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class sal1 extends ual1 {
    public static final sal1 a = new sal1();
    public static final Parcelable.Creator<sal1> CREATOR = new ylk1(14);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof sal1);
    }

    public final int hashCode() {
        return 446599921;
    }

    public final String toString() {
        return "RoyaltyReportingDisabled";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
