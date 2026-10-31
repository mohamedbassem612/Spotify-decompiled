package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class uso1 extends u9 {
    public static final Parcelable.Creator<uso1> CREATOR = new hmo1((byte) 9);
    public final int a;

    public uso1(int i) {
        this.a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = j541.j(parcel);
        j541.z(parcel, 2, this.a);
        j541.n(iJ, parcel);
    }
}
