package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class r5p1 extends u9 {
    public static final Parcelable.Creator<r5p1> CREATOR = new hmo1((byte) 22);
    public final jxo1[] a;
    public final a7o1 b;
    public final a7o1 c;
    public final String d;
    public final float e;
    public final String f;
    public final boolean g;

    public r5p1(jxo1[] jxo1VarArr, a7o1 a7o1Var, a7o1 a7o1Var2, String str, float f, String str2, boolean z) {
        this.a = jxo1VarArr;
        this.b = a7o1Var;
        this.c = a7o1Var2;
        this.d = str;
        this.e = f;
        this.f = str2;
        this.g = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.I(parcel, 2, this.a, i);
        j541.E(parcel, 3, this.b, i);
        j541.E(parcel, 4, this.c, i);
        j541.F(parcel, 5, this.d);
        j541.K(parcel, 6, 4);
        parcel.writeFloat(this.e);
        j541.F(parcel, 7, this.f);
        j541.K(parcel, 8, 4);
        parcel.writeInt(this.g ? 1 : 0);
        j541.M(iL, parcel);
    }
}
