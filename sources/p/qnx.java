package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qnx extends hux {
    public static final Parcelable.Creator<qnx> CREATOR;
    public static final qnx c;
    public static final byte d;

    static {
        b180 b180VarB = op71.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.GridView16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0Var = new cwh0();
            cwh0Var.l(1.0f, 1.0f);
            cwh0Var.i(6.0f);
            cwh0Var.v(6.0f);
            rjx.u(cwh0Var, 1.0f, 7.0f, 2.5f, 2.5f);
            cwh0Var.v(3.0f);
            cwh0Var.i(3.0f);
            cwh0Var.v(-3.0f);
            cwh0Var.e();
            rjx.z(cwh0Var, 1.0f, 9.0f, 6.0f, 6.0f);
            rjx.u(cwh0Var, 1.0f, 15.0f, 2.5f, 10.5f);
            cwh0Var.v(3.0f);
            cwh0Var.i(3.0f);
            cwh0Var.v(-3.0f);
            cwh0Var.e();
            rjx.z(cwh0Var, 9.0f, 1.0f, 6.0f, 6.0f);
            rjx.u(cwh0Var, 9.0f, 7.0f, 10.5f, 2.5f);
            cwh0Var.v(3.0f);
            cwh0Var.i(3.0f);
            cwh0Var.v(-3.0f);
            cwh0Var.e();
            rjx.z(cwh0Var, 9.0f, 9.0f, 6.0f, 6.0f);
            rjx.u(cwh0Var, 9.0f, 15.0f, 10.5f, 10.5f);
            cwh0Var.v(3.0f);
            cwh0Var.i(3.0f);
            cwh0Var.v(-3.0f);
            cwh0Var.e();
            a180.a(a180Var, cwh0Var.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            op71.b = b180VarB;
        }
        b180 b180VarB2 = y1a1.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.GridView24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(1.0f, 2.0f);
            cwh0VarG.c(1.0f, 1.0f, false, true, 1.0f, -1.0f);
            cwh0VarG.i(7.0f);
            cwh0VarG.c(1.0f, 1.0f, false, true, 1.0f, 1.0f);
            cwh0VarG.v(7.0f);
            cwh0VarG.c(1.0f, 1.0f, false, true, -1.0f, 1.0f);
            cwh0VarG.j(2.0f, 10.0f);
            cwh0VarG.c(1.0f, 1.0f, false, true, -1.0f, -1.0f);
            hrt.u(cwh0VarG, 3.0f, 3.0f, 5.0f, 5.0f);
            rjx.u(cwh0VarG, 8.0f, 3.0f, 1.0f, 15.0f);
            cwh0VarG.c(1.0f, 1.0f, false, true, 1.0f, -1.0f);
            cwh0VarG.i(7.0f);
            cwh0VarG.c(1.0f, 1.0f, false, true, 1.0f, 1.0f);
            cwh0VarG.v(7.0f);
            cwh0VarG.c(1.0f, 1.0f, false, true, -1.0f, 1.0f);
            cwh0VarG.j(2.0f, 23.0f);
            cwh0VarG.c(1.0f, 1.0f, false, true, -1.0f, -1.0f);
            hrt.u(cwh0VarG, 3.0f, 16.0f, 5.0f, 5.0f);
            cwh0VarG.v(-5.0f);
            cwh0VarG.e();
            cwh0VarG.l(14.0f, 2.0f);
            cwh0VarG.c(1.0f, 1.0f, false, true, 1.0f, -1.0f);
            cwh0VarG.i(7.0f);
            cwh0VarG.c(1.0f, 1.0f, false, true, 1.0f, 1.0f);
            cwh0VarG.v(7.0f);
            cwh0VarG.c(1.0f, 1.0f, false, true, -1.0f, 1.0f);
            cwh0VarG.i(-7.0f);
            cwh0VarG.c(1.0f, 1.0f, false, true, -1.0f, -1.0f);
            hrt.u(cwh0VarG, 16.0f, 3.0f, 5.0f, 5.0f);
            rjx.u(cwh0VarG, 21.0f, 3.0f, 14.0f, 15.0f);
            cwh0VarG.c(1.0f, 1.0f, false, true, 1.0f, -1.0f);
            cwh0VarG.i(7.0f);
            cwh0VarG.c(1.0f, 1.0f, false, true, 1.0f, 1.0f);
            cwh0VarG.v(7.0f);
            cwh0VarG.c(1.0f, 1.0f, false, true, -1.0f, 1.0f);
            cwh0VarG.i(-7.0f);
            cwh0VarG.c(1.0f, 1.0f, false, true, -1.0f, -1.0f);
            hrt.u(cwh0VarG, 16.0f, 16.0f, 5.0f, 5.0f);
            cwh0VarG.v(-5.0f);
            cwh0VarG.e();
            a180.a(a180Var2, cwh0VarG.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            y1a1.b = b180VarB2;
        }
        dsx dsxVar = new dsx(b180VarB, b180VarB2);
        b180 b180VarB3 = z1a1.b;
        if (b180VarB3 == null) {
            a180 a180Var3 = new a180("Encore.Vector.GridViewActive16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i3 = bui1.a;
            n6a1 n6a1Var3 = new n6a1(u7h.b);
            cwh0 cwh0Var2 = new cwh0();
            cwh0Var2.l(1.0f, 1.0f);
            cwh0Var2.i(6.0f);
            cwh0Var2.v(6.0f);
            rjx.u(cwh0Var2, 1.0f, 7.0f, 1.0f, 9.0f);
            rjx.A(cwh0Var2, 6.0f, 6.0f, 1.0f, 15.0f);
            rjx.z(cwh0Var2, 9.0f, 1.0f, 6.0f, 6.0f);
            rjx.u(cwh0Var2, 9.0f, 7.0f, 9.0f, 9.0f);
            rjx.A(cwh0Var2, 6.0f, 6.0f, 9.0f, 15.0f);
            a180.a(a180Var3, cwh0Var2.a, n6a1Var3, 1.0f, 2, 1.0f);
            b180VarB3 = a180Var3.b();
            z1a1.b = b180VarB3;
        }
        b180 b180VarB4 = vpb1.e;
        if (b180VarB4 == null) {
            a180 a180Var4 = new a180("Encore.Vector.GridViewActive24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i4 = bui1.a;
            n6a1 n6a1Var4 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(1.0f, 2.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 1.0f, -1.0f);
            cwh0VarG2.i(7.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 1.0f, 1.0f);
            cwh0VarG2.v(7.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, -1.0f, 1.0f);
            cwh0VarG2.j(2.0f, 10.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, -1.0f, -1.0f);
            cwh0VarG2.e();
            cwh0VarG2.l(1.0f, 15.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 1.0f, -1.0f);
            cwh0VarG2.i(7.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 1.0f, 1.0f);
            cwh0VarG2.v(7.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, -1.0f, 1.0f);
            cwh0VarG2.j(2.0f, 23.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, -1.0f, -1.0f);
            cwh0VarG2.e();
            cwh0VarG2.l(14.0f, 2.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 1.0f, -1.0f);
            cwh0VarG2.i(7.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 1.0f, 1.0f);
            cwh0VarG2.v(7.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, -1.0f, 1.0f);
            cwh0VarG2.i(-7.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, -1.0f, -1.0f);
            cwh0VarG2.e();
            cwh0VarG2.l(14.0f, 15.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 1.0f, -1.0f);
            cwh0VarG2.i(7.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 1.0f, 1.0f);
            cwh0VarG2.v(7.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, -1.0f, 1.0f);
            cwh0VarG2.i(-7.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, -1.0f, -1.0f);
            cwh0VarG2.e();
            a180.a(a180Var4, cwh0VarG2.a, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB4 = a180Var4.b();
            vpb1.e = b180VarB4;
        }
        c = new qnx(dsxVar, new dsx(b180VarB3, b180VarB4));
        d = (byte) 8;
        CREATOR = new mmx((byte) 28);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof qnx);
    }

    public final int hashCode() {
        return -583049376;
    }

    public final String toString() {
        return "GridView";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
