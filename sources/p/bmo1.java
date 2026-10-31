package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class bmo1 extends u9 {
    public static final Parcelable.Creator<bmo1> CREATOR = new hmo1((byte) 3);
    public final boolean a;

    public bmo1(boolean z) {
        this.a = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = j541.j(parcel);
        j541.s(parcel, 2, this.a);
        j541.n(iJ, parcel);
    }
}
