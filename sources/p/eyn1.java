package p;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class eyn1 extends u9 {
    public static final Parcelable.Creator<eyn1> CREATOR = new jrn1((byte) 23);
    public final long a;
    public final long b;
    public final boolean c;
    public final Bundle d;
    public final String e;

    public eyn1(long j, long j2, boolean z, Bundle bundle, String str) {
        this.a = j;
        this.b = j2;
        this.c = z;
        this.d = bundle;
        this.e = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = j541.j(parcel);
        j541.C(parcel, 1, this.a);
        j541.C(parcel, 2, this.b);
        j541.s(parcel, 3, this.c);
        j541.u(parcel, 7, this.d);
        j541.F(parcel, 8, this.e);
        j541.n(iJ, parcel);
    }
}
