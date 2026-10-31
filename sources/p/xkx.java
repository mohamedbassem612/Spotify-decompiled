package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xkx extends hux {
    public static final Parcelable.Creator<xkx> CREATOR;
    public static final xkx c;
    public static final byte d;

    static {
        b180 b180VarB = x4p1.a;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Briefcase16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(4.0f, 1.75f);
            cwh0VarG.b(0.75f, 0.75f, false, true, 4.75f, 1.0f);
            cwh0VarG.i(6.5f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.75f, 0.75f);
            cwh0VarG.j(12.0f, 4.0f);
            cwh0VarG.i(3.25f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.75f, 0.75f);
            cwh0VarG.v(10.5f);
            cwh0VarG.c(0.75f, 0.75f, false, true, -0.75f, 0.75f);
            cwh0VarG.j(0.75f, 16.0f);
            cwh0VarG.c(0.75f, 0.75f, false, true, -0.75f, -0.75f);
            cwh0VarG.j(0.0f, 4.75f);
            cwh0VarG.b(0.75f, 0.75f, false, true, 0.75f, 4.0f);
            rjx.u(cwh0VarG, 4.0f, 4.0f, 10.5f, 2.5f);
            cwh0VarG.i(-5.0f);
            cwh0VarG.j(5.5f, 4.0f);
            cwh0VarG.i(5.0f);
            cwh0VarG.e();
            cwh0VarG.l(1.5f, 5.5f);
            cwh0VarG.v(1.279f);
            cwh0VarG.k(2.001f, 2.0f);
            cwh0VarG.g(0.235f, 0.235f, 0.553f, 0.367f, 0.884f, 0.367f);
            cwh0VarG.i(7.043f);
            cwh0VarG.g(0.332f, 0.0f, 0.65f, -0.132f, 0.884f, -0.366f);
            ydh.k(cwh0VarG, 14.5f, 6.592f, 14.5f, 5.5f);
            cwh0VarG.l(1.5f, 8.9f);
            cwh0VarG.v(5.6f);
            cwh0VarG.i(13.0f);
            cwh0VarG.j(14.5f, 8.713f);
            cwh0VarG.j(13.373f, 9.84f);
            cwh0VarG.c(2.75f, 2.75f, false, true, -1.945f, 0.806f);
            cwh0VarG.j(4.385f, 10.646f);
            cwh0VarG.c(2.75f, 2.75f, false, true, -1.944f, -0.806f);
            cwh0VarG.e();
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            x4p1.a = b180VarB;
        }
        b180 b180VarB2 = z4p1.a;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Briefcase24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0Var = new cwh0();
            cwh0Var.l(8.5f, 2.0f);
            cwh0Var.i(7.0f);
            cwh0Var.b(1.5f, 1.5f, false, true, 17.0f, 3.5f);
            cwh0Var.j(17.0f, 6.0f);
            cwh0Var.i(4.5f);
            cwh0Var.b(1.5f, 1.5f, false, true, 23.0f, 7.5f);
            cwh0Var.v(13.0f);
            cwh0Var.c(1.5f, 1.5f, false, true, -1.5f, 1.5f);
            cwh0Var.i(-19.0f);
            cwh0Var.b(1.5f, 1.5f, false, true, 1.0f, 20.5f);
            cwh0Var.v(-13.0f);
            cwh0Var.b(1.5f, 1.5f, false, true, 2.5f, 6.0f);
            cwh0Var.j(7.0f, 6.0f);
            cwh0Var.j(7.0f, 3.5f);
            cwh0Var.b(1.5f, 1.5f, false, true, 8.5f, 2.0f);
            cwh0Var.l(15.0f, 6.0f);
            cwh0Var.j(15.0f, 4.0f);
            cwh0Var.j(9.0f, 4.0f);
            cwh0Var.v(2.0f);
            cwh0Var.e();
            cwh0Var.l(3.0f, 9.586f);
            cwh0Var.k(3.121f, 3.121f);
            cwh0Var.c(1.0f, 1.0f, false, false, 0.707f, 0.293f);
            cwh0Var.i(10.344f);
            cwh0Var.c(1.0f, 1.0f, false, false, 0.707f, -0.293f);
            cwh0Var.j(21.0f, 9.586f);
            ydh.k(cwh0Var, 21.0f, 8.0f, 3.0f, 8.0f);
            cwh0Var.l(3.0f, 12.414f);
            rjx.B(cwh0Var, 3.0f, 20.0f, 18.0f, -7.586f);
            cwh0Var.k(-1.707f, 1.707f);
            cwh0Var.c(3.0f, 3.0f, false, true, -2.121f, 0.879f);
            cwh0Var.j(6.828f, 15.0f);
            cwh0Var.c(3.0f, 3.0f, false, true, -2.12f, -0.879f);
            cwh0Var.e();
            a180.a(a180Var2, cwh0Var.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            z4p1.a = b180VarB2;
        }
        dsx dsxVar = new dsx(b180VarB, b180VarB2);
        b180 b180VarB3 = b5p1.a;
        if (b180VarB3 == null) {
            a180 a180Var3 = new a180("Encore.Vector.BriefcaseActive16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i3 = bui1.a;
            long j = u7h.b;
            n6a1 n6a1Var3 = new n6a1(j);
            cwh0 cwh0VarG2 = lf51.g(4.0f, 1.75f);
            cwh0VarG2.b(0.75f, 0.75f, false, true, 4.75f, 1.0f);
            cwh0VarG2.i(6.5f);
            cwh0VarG2.c(0.75f, 0.75f, false, true, 0.75f, 0.75f);
            cwh0VarG2.j(12.0f, 4.0f);
            cwh0VarG2.i(3.25f);
            cwh0VarG2.c(0.75f, 0.75f, false, true, 0.75f, 0.75f);
            cwh0VarG2.v(0.342f);
            cwh0VarG2.j(12.312f, 8.78f);
            cwh0VarG2.c(1.25f, 1.25f, false, true, -0.884f, 0.366f);
            cwh0VarG2.j(4.385f, 9.146f);
            cwh0VarG2.c(1.25f, 1.25f, false, true, -0.884f, -0.366f);
            cwh0VarG2.j(0.0f, 5.279f);
            cwh0VarG2.j(0.0f, 4.75f);
            cwh0VarG2.b(0.75f, 0.75f, false, true, 0.75f, 4.0f);
            rjx.u(cwh0VarG2, 4.0f, 4.0f, 10.5f, 2.5f);
            cwh0VarG2.i(-5.0f);
            cwh0VarG2.j(5.5f, 4.0f);
            cwh0VarG2.i(5.0f);
            cwh0VarG2.e();
            a180.a(a180Var3, cwh0VarG2.a, n6a1Var3, 1.0f, 2, 1.0f);
            n6a1 n6a1Var4 = new n6a1(j);
            cwh0 cwh0VarP = rjx.p(0.0f, 7.4f, 7.85f);
            cwh0VarP.g(0.0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f);
            cwh0VarP.i(14.5f);
            cwh0VarP.c(0.75f, 0.75f, false, false, 0.75f, -0.75f);
            cwh0VarP.u(7.213f);
            cwh0VarP.j(13.373f, 9.84f);
            cwh0VarP.c(2.75f, 2.75f, false, true, -1.945f, 0.806f);
            cwh0VarP.h(4.385f);
            cwh0VarP.c(2.75f, 2.75f, false, true, -1.944f, -0.806f);
            cwh0VarP.e();
            a180.a(a180Var3, cwh0VarP.a, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB3 = a180Var3.b();
            b5p1.a = b180VarB3;
        }
        b180 b180VarB4 = d5p1.a;
        if (b180VarB4 == null) {
            a180 a180Var4 = new a180("Encore.Vector.BriefcaseActive24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i4 = bui1.a;
            long j2 = u7h.b;
            n6a1 n6a1Var5 = new n6a1(j2);
            cwh0 cwh0Var2 = new cwh0();
            cwh0Var2.l(8.5f, 2.0f);
            cwh0Var2.i(7.0f);
            cwh0Var2.b(1.5f, 1.5f, false, true, 17.0f, 3.5f);
            cwh0Var2.u(6.0f);
            cwh0Var2.i(4.5f);
            cwh0Var2.b(1.5f, 1.5f, false, true, 23.0f, 7.5f);
            cwh0Var2.v(0.086f);
            cwh0Var2.k(-5.121f, 5.121f);
            cwh0Var2.c(1.0f, 1.0f, false, true, -0.707f, 0.293f);
            cwh0Var2.h(6.828f);
            cwh0Var2.c(1.0f, 1.0f, false, true, -0.707f, -0.293f);
            cwh0Var2.j(1.0f, 7.586f);
            cwh0Var2.u(7.5f);
            cwh0Var2.b(1.5f, 1.5f, false, true, 2.5f, 6.0f);
            cwh0Var2.h(7.0f);
            cwh0Var2.u(3.5f);
            cwh0Var2.b(1.5f, 1.5f, false, true, 8.5f, 2.0f);
            cwh0Var2.l(15.0f, 6.0f);
            cwh0Var2.u(4.0f);
            cwh0Var2.h(9.0f);
            cwh0Var2.v(2.0f);
            cwh0Var2.e();
            a180.a(a180Var4, cwh0Var2.a, n6a1Var5, 1.0f, 2, 1.0f);
            n6a1 n6a1Var6 = new n6a1(j2);
            cwh0 cwh0VarQ = rjx.q(23.0f, 10.414f, -3.707f, 3.707f);
            cwh0VarQ.c(3.0f, 3.0f, false, true, -2.121f, 0.879f);
            cwh0VarQ.h(6.828f);
            cwh0VarQ.c(3.0f, 3.0f, false, true, -2.12f, -0.879f);
            cwh0VarQ.j(1.0f, 10.414f);
            cwh0VarQ.u(20.5f);
            cwh0VarQ.b(1.5f, 1.5f, false, false, 2.5f, 22.0f);
            cwh0VarQ.i(19.0f);
            cwh0VarQ.c(1.5f, 1.5f, false, false, 1.5f, -1.5f);
            cwh0VarQ.e();
            a180.a(a180Var4, cwh0VarQ.a, n6a1Var6, 1.0f, 2, 1.0f);
            b180VarB4 = a180Var4.b();
            d5p1.a = b180VarB4;
        }
        c = new xkx(dsxVar, new dsx(b180VarB3, b180VarB4));
        d = (byte) 8;
        CREATOR = new ckx((byte) 20);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof xkx);
    }

    public final int hashCode() {
        return -404100875;
    }

    public final String toString() {
        return "Briefcase";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
