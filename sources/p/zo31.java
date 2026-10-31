package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zo31 extends u9 {
    public static final Parcelable.Creator<zo31> CREATOR = new e9n1((byte) 19);
    public final int a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;

    public zo31(int i, int i2, int i3, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = i2;
        this.e = i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = j541.j(parcel);
        j541.z(parcel, 1, this.a);
        j541.s(parcel, 2, this.b);
        j541.s(parcel, 3, this.c);
        j541.z(parcel, 4, this.d);
        j541.z(parcel, 5, this.e);
        j541.n(iJ, parcel);
    }
}
