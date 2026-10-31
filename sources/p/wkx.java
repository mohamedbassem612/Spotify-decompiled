package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wkx extends hux {
    public static final Parcelable.Creator<wkx> CREATOR;
    public static final wkx c;
    public static final byte d;

    static {
        b180 b180VarB = r4p1.a;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Bluetooth16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(7.809f, 1.538f);
            cwh0VarG.c(0.5f, 0.5f, false, true, 0.545f, 0.108f);
            cwh0VarG.k(3.0f, 3.0f);
            cwh0VarG.c(0.5f, 0.5f, false, true, 0.0f, 0.708f);
            cwh0VarG.j(8.707f, 8.0f);
            cwh0VarG.k(2.647f, 2.646f);
            cwh0VarG.c(0.5f, 0.5f, false, true, 0.0f, 0.708f);
            cwh0VarG.k(-3.0f, 3.0f);
            cwh0VarG.b(0.5f, 0.5f, false, true, 7.5f, 14.0f);
            cwh0VarG.j(7.5f, 9.207f);
            cwh0VarG.k(-2.146f, 2.147f);
            cwh0VarG.c(0.5f, 0.5f, false, true, -0.708f, -0.707f);
            cwh0VarG.j(7.293f, 8.0f);
            cwh0VarG.j(4.646f, 5.354f);
            cwh0VarG.c(0.5f, 0.5f, true, true, 0.708f, -0.708f);
            cwh0VarG.j(7.5f, 6.793f);
            cwh0VarG.j(7.5f, 2.0f);
            cwh0VarG.c(0.5f, 0.5f, false, true, 0.309f, -0.462f);
            cwh0VarG.m(0.691f, 7.67f);
            cwh0VarG.v(3.585f);
            cwh0VarG.j(10.293f, 11.0f);
            cwh0VarG.e();
            cwh0VarG.l(8.5f, 6.793f);
            ydh.k(cwh0VarG, 10.293f, 5.0f, 8.5f, 3.207f);
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            r4p1.a = b180VarB;
        }
        b180 b180VarB2 = u4p1.a;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Bluetooth24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(11.713f, 2.307f);
            cwh0VarG2.c(0.75f, 0.75f, false, true, 0.817f, 0.163f);
            cwh0VarG2.k(4.5f, 4.5f);
            cwh0VarG2.c(0.75f, 0.75f, false, true, 0.0f, 1.06f);
            cwh0VarG2.j(13.06f, 12.0f);
            cwh0VarG2.k(3.97f, 3.97f);
            cwh0VarG2.c(0.75f, 0.75f, false, true, 0.0f, 1.06f);
            cwh0VarG2.k(-4.5f, 4.5f);
            cwh0VarG2.c(0.75f, 0.75f, false, true, -1.28f, -0.53f);
            cwh0VarG2.v(-7.19f);
            cwh0VarG2.k(-3.22f, 3.22f);
            cwh0VarG2.c(0.75f, 0.75f, false, true, -1.06f, -1.06f);
            cwh0VarG2.j(10.94f, 12.0f);
            cwh0VarG2.j(6.97f, 8.03f);
            cwh0VarG2.c(0.75f, 0.75f, false, true, 1.06f, -1.06f);
            cwh0VarG2.k(3.22f, 3.22f);
            cwh0VarG2.j(11.25f, 3.0f);
            cwh0VarG2.c(0.75f, 0.75f, false, true, 0.463f, -0.693f);
            cwh0VarG2.m(1.037f, 11.504f);
            cwh0VarG2.v(5.378f);
            cwh0VarG2.k(2.69f, -2.689f);
            cwh0VarG2.e();
            cwh0VarG2.l(12.75f, 10.189f);
            cwh0VarG2.j(15.44f, 7.5f);
            cwh0VarG2.k(-2.69f, -2.69f);
            cwh0VarG2.v(5.38f);
            cwh0VarG2.e();
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            u4p1.a = b180VarB2;
        }
        c = new wkx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new ckx((byte) 19);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof wkx);
    }

    public final int hashCode() {
        return -197618439;
    }

    public final String toString() {
        return "Bluetooth";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
