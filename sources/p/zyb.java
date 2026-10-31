package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class zyb extends azb {
    public static final zyb a = new zyb();
    public static final Parcelable.Creator<zyb> CREATOR = new yyb((byte) 0);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof zyb);
    }

    public final int hashCode() {
        return 520950007;
    }

    public final String toString() {
        return "Volume";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
