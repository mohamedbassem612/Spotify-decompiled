package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class skx extends hux {
    public static final Parcelable.Creator<skx> CREATOR;
    public static final skx c;

    static {
        b180 b180VarB = g3p1.a;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Background16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarI = ydh.i(3.0f, 16.0f, 1.5f, 16.0f);
            cwh0VarI.b(1.5f, 1.5f, false, true, 0.0f, 14.5f);
            rjx.u(cwh0VarI, 0.0f, 13.0f, 10.0f, 16.0f);
            cwh0VarI.j(8.0f, 16.0f);
            ydh.k(cwh0VarI, 0.0f, 8.0f, 0.0f, 6.0f);
            cwh0VarI.l(16.0f, 15.0f);
            cwh0VarI.c(1.0f, 1.0f, false, true, -1.0f, 1.0f);
            cwh0VarI.j(0.0f, 1.0f);
            cwh0VarI.c(1.0f, 1.0f, false, true, 1.0f, -1.0f);
            cwh0VarI.e();
            cwh0VarI.l(6.0f, 0.0f);
            cwh0VarI.k(10.0f, 10.0f);
            ydh.k(cwh0VarI, 16.0f, 8.0f, 8.0f, 0.0f);
            cwh0VarI.l(13.0f, 0.0f);
            cwh0VarI.j(16.0f, 3.0f);
            cwh0VarI.j(16.0f, 1.5f);
            cwh0VarI.b(1.5f, 1.5f, false, false, 14.5f, 0.0f);
            cwh0VarI.e();
            a180.a(a180Var, cwh0VarI.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            g3p1.a = b180VarB;
        }
        b180 b180VarB2 = i3p1.a;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Background24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarI2 = ydh.i(5.5f, 23.0f, 3.0f, 23.0f);
            cwh0VarI2.c(2.0f, 2.0f, false, true, -2.0f, -2.0f);
            cwh0VarI2.v(-2.5f);
            cwh0VarI2.e();
            cwh0VarI2.l(15.0f, 23.0f);
            cwh0VarI2.i(-3.0f);
            ydh.k(cwh0VarI2, 1.0f, 12.0f, 1.0f, 9.0f);
            cwh0VarI2.l(23.0f, 21.625f);
            cwh0VarI2.g(0.0f, 0.76f, -0.616f, 1.375f, -1.375f, 1.375f);
            cwh0VarI2.j(1.0f, 2.375f);
            cwh0VarI2.f(1.0f, 1.615f, 1.616f, 1.0f, 2.375f, 1.0f);
            cwh0VarI2.e();
            cwh0VarI2.l(9.0f, 1.0f);
            cwh0VarI2.k(14.0f, 14.0f);
            cwh0VarI2.v(-3.0f);
            cwh0VarI2.j(12.0f, 1.0f);
            cwh0VarI2.e();
            cwh0VarI2.l(18.5f, 1.0f);
            cwh0VarI2.j(23.0f, 5.5f);
            cwh0VarI2.j(23.0f, 3.0f);
            cwh0VarI2.c(2.0f, 2.0f, false, false, -2.0f, -2.0f);
            cwh0VarI2.e();
            a180.a(a180Var2, cwh0VarI2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            i3p1.a = b180VarB2;
        }
        dsx dsxVar = new dsx(b180VarB, b180VarB2);
        b180 b180VarB3 = l3p1.a;
        if (b180VarB3 == null) {
            a180 a180Var3 = new a180("Encore.Vector.BackgroundActive16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i3 = bui1.a;
            n6a1 n6a1Var3 = new n6a1(u7h.b);
            cwh0 cwh0VarI3 = ydh.i(16.0f, 3.0f, 16.0f, 1.5f);
            cwh0VarI3.b(1.5f, 1.5f, false, false, 14.5f, 0.0f);
            rjx.u(cwh0VarI3, 13.0f, 0.0f, 11.0f, 0.0f);
            cwh0VarI3.j(7.0f, 0.0f);
            cwh0VarI3.k(9.0f, 9.0f);
            cwh0VarI3.j(16.0f, 5.0f);
            cwh0VarI3.e();
            cwh0VarI3.l(1.0f, 0.0f);
            cwh0VarI3.k(15.0f, 15.0f);
            cwh0VarI3.v(-4.0f);
            cwh0VarI3.j(5.0f, 0.0f);
            cwh0VarI3.e();
            cwh0VarI3.l(0.0f, 1.0f);
            cwh0VarI3.v(4.0f);
            cwh0VarI3.k(11.0f, 11.0f);
            cwh0VarI3.i(4.0f);
            cwh0VarI3.e();
            cwh0VarI3.l(9.0f, 16.0f);
            cwh0VarI3.j(5.0f, 16.0f);
            cwh0VarI3.k(-5.0f, -5.0f);
            cwh0VarI3.j(0.0f, 7.0f);
            cwh0VarI3.e();
            cwh0VarI3.l(0.0f, 13.0f);
            cwh0VarI3.j(3.0f, 16.0f);
            cwh0VarI3.j(1.5f, 16.0f);
            cwh0VarI3.b(1.5f, 1.5f, false, true, 0.0f, 14.5f);
            cwh0VarI3.e();
            a180.a(a180Var3, cwh0VarI3.a, n6a1Var3, 1.0f, 2, 1.0f);
            b180VarB3 = a180Var3.b();
            l3p1.a = b180VarB3;
        }
        b180 b180VarB4 = n3p1.a;
        if (b180VarB4 == null) {
            a180 a180Var4 = new a180("Encore.Vector.BackgroundActive24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i4 = bui1.a;
            n6a1 n6a1Var4 = new n6a1(u7h.b);
            cwh0 cwh0Var = new cwh0();
            cwh0Var.l(23.0f, 13.5f);
            cwh0Var.j(10.5f, 1.0f);
            cwh0Var.i(5.0f);
            rjx.u(cwh0Var, 23.0f, 8.5f, 23.0f, 5.5f);
            cwh0Var.j(18.5f, 1.0f);
            cwh0Var.j(21.0f, 1.0f);
            cwh0Var.c(2.0f, 2.0f, false, true, 2.0f, 2.0f);
            cwh0Var.e();
            cwh0Var.l(23.0f, 21.5f);
            cwh0Var.v(-5.0f);
            rjx.r(cwh0Var, 7.5f, 1.0f, -5.0f);
            cwh0Var.l(1.0f, 2.5f);
            cwh0Var.j(21.5f, 23.0f);
            cwh0Var.i(-5.0f);
            cwh0Var.j(1.0f, 7.5f);
            cwh0Var.e();
            cwh0Var.l(8.5f, 23.0f);
            cwh0Var.i(5.0f);
            cwh0Var.j(1.0f, 10.5f);
            cwh0Var.v(5.0f);
            cwh0Var.e();
            cwh0Var.l(3.0f, 23.0f);
            cwh0Var.i(2.5f);
            cwh0Var.j(1.0f, 18.5f);
            cwh0Var.j(1.0f, 21.0f);
            cwh0Var.c(2.0f, 2.0f, false, false, 2.0f, 2.0f);
            a180.a(a180Var4, cwh0Var.a, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB4 = a180Var4.b();
            n3p1.a = b180VarB4;
        }
        c = new skx(dsxVar, new dsx(b180VarB3, b180VarB4));
        CREATOR = new ckx((byte) 15);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof skx);
    }

    public final int hashCode() {
        return 225758275;
    }

    public final String toString() {
        return "Background";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
