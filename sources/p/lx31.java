package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lx31 extends nx31 {
    public static final lx31 a = new lx31();
    public static final Parcelable.Creator<lx31> CREATOR = new xw31((byte) 12);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof lx31);
    }

    public final int hashCode() {
        return -1706267104;
    }

    public final String toString() {
        return "NoLicensesAvailable";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
