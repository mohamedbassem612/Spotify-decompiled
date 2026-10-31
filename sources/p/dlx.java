package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dlx extends hux {
    public static final Parcelable.Creator<dlx> CREATOR;
    public static final dlx c;

    static {
        b180 b180VarB = l6p1.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.ChartBar16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(6.5f, 0.003f);
            cwh0VarG.c(0.75f, 0.75f, false, false, -0.75f, 0.75f);
            cwh0VarG.j(5.75f, 12.25f);
            cwh0VarG.g(0.0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f);
            cwh0VarG.i(3.0f);
            cwh0VarG.c(0.75f, 0.75f, false, false, 0.75f, -0.75f);
            cwh0VarG.j(10.25f, 0.753f);
            cwh0VarG.c(0.75f, 0.75f, false, false, -0.75f, -0.75f);
            hrt.o(cwh0VarG, 7.25f, 11.5f, 7.25f, 1.503f);
            cwh0VarG.i(1.5f);
            cwh0VarG.j(8.75f, 11.5f);
            cwh0VarG.e();
            rjx.z(cwh0VarG, 0.0f, 16.0f, 16.0f, -1.5f);
            rjx.u(cwh0VarG, 0.0f, 14.5f, 0.0f, 7.75f);
            cwh0VarG.b(0.75f, 0.75f, false, true, 0.75f, 7.0f);
            cwh0VarG.i(3.0f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.75f, 0.75f);
            cwh0VarG.v(4.5f);
            cwh0VarG.c(0.75f, 0.75f, false, true, -0.75f, 0.75f);
            cwh0VarG.i(-3.0f);
            cwh0VarG.c(0.75f, 0.75f, false, true, -0.75f, -0.75f);
            cwh0VarG.e();
            cwh0VarG.l(1.5f, 8.5f);
            cwh0VarG.v(3.0f);
            cwh0VarG.j(3.0f, 11.5f);
            cwh0VarG.v(-3.0f);
            cwh0VarG.e();
            cwh0VarG.l(12.25f, 3.996f);
            cwh0VarG.c(0.75f, 0.75f, false, false, -0.75f, 0.75f);
            cwh0VarG.v(7.5f);
            cwh0VarG.g(0.0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f);
            cwh0VarG.i(3.0f);
            cwh0VarG.c(0.75f, 0.75f, false, false, 0.75f, -0.75f);
            cwh0VarG.v(-7.5f);
            cwh0VarG.c(0.75f, 0.75f, false, false, -0.75f, -0.75f);
            hrt.u(cwh0VarG, 13.0f, 11.496f, -6.0f, 1.5f);
            cwh0VarG.v(6.0f);
            cwh0VarG.e();
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            l6p1.b = b180VarB;
        }
        b180 b180VarB2 = m6p1.a;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.ChartBar24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(9.25f, 3.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 1.0f, -1.0f);
            cwh0VarG2.i(3.5f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 1.0f, 1.0f);
            cwh0VarG2.v(14.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, -1.0f, 1.0f);
            cwh0VarG2.i(-3.5f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, -1.0f, -1.0f);
            cwh0VarG2.e();
            cwh0VarG2.l(12.75f, 4.0f);
            cwh0VarG2.i(-1.5f);
            cwh0VarG2.v(12.0f);
            rjx.t(cwh0VarG2, 1.5f, 22.0f, 22.0f);
            rjx.x(cwh0VarG2, 2.0f, 22.0f, -2.0f, 20.0f);
            cwh0VarG2.l(3.0f, 10.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, false, -1.0f, 1.0f);
            cwh0VarG2.v(6.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, false, 1.0f, 1.0f);
            cwh0VarG2.i(3.5f);
            cwh0VarG2.c(1.0f, 1.0f, false, false, 1.0f, -1.0f);
            cwh0VarG2.v(-6.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, false, -1.0f, -1.0f);
            hrt.u(cwh0VarG2, 4.0f, 16.0f, -4.0f, 1.5f);
            cwh0VarG2.v(4.0f);
            cwh0VarG2.e();
            cwh0VarG2.l(16.5f, 7.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 1.0f, -1.0f);
            cwh0VarG2.j(21.0f, 6.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 1.0f, 1.0f);
            cwh0VarG2.v(10.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, -1.0f, 1.0f);
            cwh0VarG2.i(-3.5f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, -1.0f, -1.0f);
            hrt.o(cwh0VarG2, 20.0f, 16.0f, 20.0f, 8.0f);
            cwh0VarG2.i(-1.5f);
            cwh0VarG2.v(8.0f);
            cwh0VarG2.e();
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            m6p1.a = b180VarB2;
        }
        dsx dsxVar = new dsx(b180VarB, b180VarB2);
        b180 b180VarB3 = o6p1.a;
        if (b180VarB3 == null) {
            a180 a180Var3 = new a180("Encore.Vector.ChartBarActive16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i3 = bui1.a;
            n6a1 n6a1Var3 = new n6a1(u7h.b);
            cwh0 cwh0Var = new cwh0();
            cwh0Var.l(16.0f, 16.0f);
            cwh0Var.h(0.0f);
            cwh0Var.v(-1.5f);
            cwh0Var.i(16.0f);
            cwh0Var.e();
            cwh0Var.l(6.625f, 0.0f);
            cwh0Var.c(0.75f, 0.75f, false, false, -0.75f, 0.75f);
            cwh0Var.v(11.496f);
            cwh0Var.g(0.0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f);
            cwh0Var.i(2.75f);
            cwh0Var.c(0.75f, 0.75f, false, false, 0.75f, -0.75f);
            cwh0Var.u(0.75f);
            cwh0Var.c(0.75f, 0.75f, false, false, -0.75f, -0.75f);
            cwh0Var.e();
            cwh0Var.l(0.75f, 7.0f);
            cwh0Var.c(0.75f, 0.75f, false, false, -0.75f, 0.75f);
            cwh0Var.v(4.5f);
            cwh0Var.g(0.0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f);
            cwh0Var.h(3.5f);
            cwh0Var.c(0.75f, 0.75f, false, false, 0.75f, -0.75f);
            cwh0Var.v(-4.5f);
            cwh0Var.b(0.75f, 0.75f, false, false, 3.5f, 7.0f);
            cwh0Var.e();
            cwh0Var.l(12.5f, 3.996f);
            cwh0Var.c(0.75f, 0.75f, false, false, -0.75f, 0.75f);
            cwh0Var.v(7.5f);
            cwh0Var.g(0.0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f);
            cwh0Var.i(2.75f);
            cwh0Var.c(0.75f, 0.75f, false, false, 0.75f, -0.75f);
            cwh0Var.v(-7.5f);
            cwh0Var.c(0.75f, 0.75f, false, false, -0.75f, -0.75f);
            cwh0Var.e();
            a180.a(a180Var3, cwh0Var.a, n6a1Var3, 1.0f, 2, 1.0f);
            b180VarB3 = a180Var3.b();
            o6p1.a = b180VarB3;
        }
        b180 b180VarB4 = p6p1.a;
        if (b180VarB4 == null) {
            a180 a180Var4 = new a180("Encore.Vector.ChartBarActive24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i4 = bui1.a;
            n6a1 n6a1Var4 = new n6a1(u7h.b);
            cwh0 cwh0Var2 = new cwh0();
            cwh0Var2.l(22.0f, 22.0f);
            cwh0Var2.j(2.0f, 22.0f);
            cwh0Var2.v(-2.0f);
            rjx.t(cwh0Var2, 20.0f, 10.5f, 2.0f);
            cwh0Var2.c(1.0f, 1.0f, false, false, -1.0f, 1.0f);
            cwh0Var2.v(14.0f);
            cwh0Var2.c(1.0f, 1.0f, false, false, 1.0f, 1.0f);
            cwh0Var2.i(3.0f);
            cwh0Var2.c(1.0f, 1.0f, false, false, 1.0f, -1.0f);
            cwh0Var2.j(14.5f, 3.0f);
            cwh0Var2.c(1.0f, 1.0f, false, false, -1.0f, -1.0f);
            cwh0Var2.e();
            cwh0Var2.l(3.0f, 10.0f);
            cwh0Var2.c(1.0f, 1.0f, false, false, -1.0f, 1.0f);
            cwh0Var2.v(6.0f);
            cwh0Var2.c(1.0f, 1.0f, false, false, 1.0f, 1.0f);
            cwh0Var2.i(3.0f);
            cwh0Var2.c(1.0f, 1.0f, false, false, 1.0f, -1.0f);
            cwh0Var2.v(-6.0f);
            cwh0Var2.c(1.0f, 1.0f, false, false, -1.0f, -1.0f);
            cwh0Var2.e();
            cwh0Var2.l(18.0f, 6.0f);
            cwh0Var2.c(1.0f, 1.0f, false, false, -1.0f, 1.0f);
            cwh0Var2.v(10.0f);
            cwh0Var2.c(1.0f, 1.0f, false, false, 1.0f, 1.0f);
            cwh0Var2.i(3.0f);
            cwh0Var2.c(1.0f, 1.0f, false, false, 1.0f, -1.0f);
            cwh0Var2.j(22.0f, 7.0f);
            cwh0Var2.c(1.0f, 1.0f, false, false, -1.0f, -1.0f);
            cwh0Var2.e();
            a180.a(a180Var4, cwh0Var2.a, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB4 = a180Var4.b();
            p6p1.a = b180VarB4;
        }
        c = new dlx(dsxVar, new dsx(b180VarB3, b180VarB4));
        CREATOR = new ckx((byte) 26);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof dlx);
    }

    public final int hashCode() {
        return 535293866;
    }

    public final String toString() {
        return "ChartBar";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
