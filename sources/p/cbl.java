package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class cbl extends u9 {
    public static final Parcelable.Creator<cbl> CREATOR = new hmo1(6);
    public final zo31 a;
    public final boolean b;
    public final boolean c;
    public final int[] d;
    public final int e;
    public final int[] f;

    public cbl(zo31 zo31Var, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.a = zo31Var;
        this.b = z;
        this.c = z2;
        this.d = iArr;
        this.e = i;
        this.f = iArr2;
    }

    public final int[] F() {
        return this.d;
    }

    public final int[] a0() {
        return this.f;
    }

    public final boolean c0() {
        return this.b;
    }

    public final boolean d0() {
        return this.c;
    }

    public final int j() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.E(parcel, 1, this.a, i);
        j541.K(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        j541.K(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        j541.A(parcel, 4, this.d);
        j541.K(parcel, 5, 4);
        parcel.writeInt(this.e);
        j541.A(parcel, 6, this.f);
        j541.M(iL, parcel);
    }
}
