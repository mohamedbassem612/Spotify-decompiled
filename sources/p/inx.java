package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class inx extends hux {
    public static final Parcelable.Creator<inx> CREATOR;
    public static final inx c;
    public static final byte d;

    static {
        b180 b180VarB = lmt0.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Fullscreen16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(6.53f, 9.47f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.0f, 1.06f);
            cwh0VarG.k(-2.72f, 2.72f);
            cwh0VarG.i(1.018f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.0f, 1.5f);
            cwh0VarG.j(1.25f, 14.75f);
            cwh0VarG.v(-3.579f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 1.5f, 0.0f);
            cwh0VarG.v(1.018f);
            cwh0VarG.k(2.72f, -2.72f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 1.06f, 0.0f);
            cwh0VarG.e();
            cwh0VarG.l(9.47f, 6.53f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.0f, -1.06f);
            cwh0VarG.k(2.72f, -2.72f);
            cwh0VarG.i(-1.018f);
            cwh0VarG.c(0.75f, 0.75f, true, true, 0.0f, -1.5f);
            cwh0VarG.i(3.578f);
            cwh0VarG.v(3.579f);
            cwh0VarG.c(0.75f, 0.75f, false, true, -1.5f, 0.0f);
            cwh0VarG.j(13.25f, 3.81f);
            cwh0VarG.k(-2.72f, 2.72f);
            cwh0VarG.c(0.75f, 0.75f, false, true, -1.06f, 0.0f);
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            lmt0.b = b180VarB;
        }
        b180 b180VarB2 = rqt0.c;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Fullscreen24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(9.707f, 14.293f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 0.0f, 1.414f);
            cwh0VarG2.j(5.414f, 20.0f);
            cwh0VarG2.i(1.829f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 0.0f, 2.0f);
            cwh0VarG2.h(2.0f);
            cwh0VarG2.v(-5.243f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 2.0f, 0.0f);
            cwh0VarG2.v(1.829f);
            cwh0VarG2.k(4.293f, -4.293f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 1.414f, 0.0f);
            cwh0VarG2.m(4.586f, -4.586f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 0.0f, -1.414f);
            cwh0VarG2.j(18.586f, 4.0f);
            cwh0VarG2.i(-1.829f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 0.0f, -2.0f);
            cwh0VarG2.h(22.0f);
            cwh0VarG2.v(5.243f);
            cwh0VarG2.c(1.0f, 1.0f, true, true, -2.0f, 0.0f);
            cwh0VarG2.u(5.414f);
            cwh0VarG2.k(-4.293f, 4.293f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, -1.414f, 0.0f);
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            rqt0.c = b180VarB2;
        }
        c = new inx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new mmx((byte) 20);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof inx);
    }

    public final int hashCode() {
        return 1668018896;
    }

    public final String toString() {
        return "Fullscreen";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
