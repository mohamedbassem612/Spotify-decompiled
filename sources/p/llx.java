package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class llx extends hux {
    public static final Parcelable.Creator<llx> CREATOR;
    public static final llx c;
    public static final byte d;

    static {
        b180 b180VarB = s8p1.a;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Checklist16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(5.928f, 9.89f);
            cwh0VarG.c(0.75f, 0.75f, true, true, 1.144f, 0.97f);
            cwh0VarG.k(-2.75f, 3.25f);
            cwh0VarG.c(0.75f, 0.75f, false, true, -1.102f, 0.045f);
            cwh0VarG.k(-1.75f, -1.75f);
            cwh0VarG.c(0.75f, 0.75f, true, true, 1.06f, -1.06f);
            rjx.y(cwh0VarG, 1.174f, 1.174f, 14.0f, 12.376f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.0f, 1.5f);
            cwh0VarG.j(8.5f, 13.876f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.0f, -1.5f);
            cwh0VarG.e();
            cwh0VarG.l(14.0f, 7.376f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.0f, 1.5f);
            cwh0VarG.j(8.5f, 8.876f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.0f, -1.5f);
            cwh0VarG.e();
            cwh0VarG.l(2.75f, 5.625f);
            cwh0VarG.i(2.5f);
            cwh0VarG.v(-2.5f);
            rjx.t(cwh0VarG, -2.5f, 14.0f, 2.375f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.0f, 1.5f);
            cwh0VarG.j(8.5f, 3.875f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.0f, -1.5f);
            cwh0VarG.e();
            cwh0VarG.l(6.75f, 5.875f);
            cwh0VarG.g(0.0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f);
            cwh0VarG.i(-3.0f);
            cwh0VarG.g(-0.69f, 0.0f, -1.25f, -0.56f, -1.25f, -1.25f);
            cwh0VarG.v(-3.0f);
            cwh0VarG.g(0.0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f);
            cwh0VarG.i(3.0f);
            cwh0VarG.g(0.69f, 0.0f, 1.25f, 0.56f, 1.25f, 1.25f);
            cwh0VarG.e();
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            s8p1.a = b180VarB;
        }
        b180 b180VarB2 = t8p1.a;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Checklist24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(8.753f, 14.836f);
            cwh0VarG2.c(1.0f, 1.0f, true, true, 1.494f, 1.328f);
            cwh0VarG2.k(-4.0f, 4.5f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, -1.454f, 0.043f);
            cwh0VarG2.k(-2.5f, -2.5f);
            cwh0VarG2.c(1.0f, 1.0f, true, true, 1.414f, -1.414f);
            rjx.y(cwh0VarG2, 1.75f, 1.75f, 21.0f, 18.0f);
            cwh0VarG2.c(1.0f, 1.0f, true, true, 0.0f, 2.0f);
            cwh0VarG2.i(-8.0f);
            cwh0VarG2.c(1.0f, 1.0f, true, true, 0.0f, -2.0f);
            cwh0VarG2.e();
            cwh0VarG2.l(21.0f, 11.0f);
            cwh0VarG2.c(1.0f, 1.0f, true, true, 0.0f, 2.0f);
            cwh0VarG2.i(-8.0f);
            cwh0VarG2.c(1.0f, 1.0f, true, true, 0.0f, -2.0f);
            cwh0VarG2.e();
            cwh0VarG2.l(4.0f, 9.0f);
            cwh0VarG2.i(4.0f);
            ydh.k(cwh0VarG2, 8.0f, 5.0f, 4.0f, 5.0f);
            cwh0VarG2.l(21.0f, 4.0f);
            cwh0VarG2.c(1.0f, 1.0f, true, true, 0.0f, 2.0f);
            cwh0VarG2.i(-8.0f);
            cwh0VarG2.c(1.0f, 1.0f, true, true, 0.0f, -2.0f);
            cwh0VarG2.e();
            cwh0VarG2.l(10.0f, 9.25f);
            cwh0VarG2.b(1.75f, 1.75f, false, true, 8.25f, 11.0f);
            cwh0VarG2.i(-4.5f);
            cwh0VarG2.b(1.75f, 1.75f, false, true, 2.0f, 9.25f);
            cwh0VarG2.v(-4.5f);
            cwh0VarG2.f(2.0f, 3.784f, 2.784f, 3.0f, 3.75f, 3.0f);
            cwh0VarG2.i(4.5f);
            cwh0VarG2.f(9.216f, 3.0f, 10.0f, 3.784f, 10.0f, 4.75f);
            cwh0VarG2.e();
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            t8p1.a = b180VarB2;
        }
        c = new llx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new hlx((byte) 3);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof llx);
    }

    public final int hashCode() {
        return -1767201807;
    }

    public final String toString() {
        return "Checklist";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
