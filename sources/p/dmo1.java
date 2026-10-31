package p;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class dmo1 extends u9 {
    public static final Parcelable.Creator<dmo1> CREATOR = new hmo1((byte) 2);
    public Bundle a;
    public pl10[] b;
    public int c;
    public cbl d;

    /* JADX WARN: Type inference failed for: r2v1, types: [android.os.Parcelable[], p.pl10[]] */
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = j541.j(parcel);
        j541.u(parcel, 1, this.a);
        j541.I(parcel, 2, (Parcelable[]) this.b, i);
        j541.z(parcel, 3, this.c);
        j541.E(parcel, 4, this.d, i);
        j541.n(iJ, parcel);
    }
}
