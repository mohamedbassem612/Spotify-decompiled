package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class nso1 extends u9 {
    public static final Parcelable.Creator<nso1> CREATOR = new hmo1((byte) 11);
    public final int X;
    public final r5p1[] a;
    public final a7o1 b;
    public final a7o1 c;
    public final a7o1 d;
    public final String e;
    public final float f;
    public final String g;
    public final int h;
    public final boolean i;
    public final int t;

    public nso1(r5p1[] r5p1VarArr, a7o1 a7o1Var, a7o1 a7o1Var2, a7o1 a7o1Var3, String str, float f, String str2, int i, boolean z, int i2, int i3) {
        this.a = r5p1VarArr;
        this.b = a7o1Var;
        this.c = a7o1Var2;
        this.d = a7o1Var3;
        this.e = str;
        this.f = f;
        this.g = str2;
        this.h = i;
        this.i = z;
        this.t = i2;
        this.X = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.I(parcel, 2, this.a, i);
        j541.E(parcel, 3, this.b, i);
        j541.E(parcel, 4, this.c, i);
        j541.E(parcel, 5, this.d, i);
        j541.F(parcel, 6, this.e);
        j541.K(parcel, 7, 4);
        parcel.writeFloat(this.f);
        j541.F(parcel, 8, this.g);
        j541.K(parcel, 9, 4);
        parcel.writeInt(this.h);
        j541.K(parcel, 10, 4);
        parcel.writeInt(this.i ? 1 : 0);
        j541.K(parcel, 11, 4);
        parcel.writeInt(this.t);
        j541.K(parcel, 12, 4);
        parcel.writeInt(this.X);
        j541.M(iL, parcel);
    }
}
