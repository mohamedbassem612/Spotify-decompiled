package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class lc80 extends u9 {
    public static final Parcelable.Creator<lc80> CREATOR = new w2o1((byte) 15);

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof lc80);
    }

    public final int hashCode() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        j541.M(j541.L(20293, parcel), parcel);
    }
}
