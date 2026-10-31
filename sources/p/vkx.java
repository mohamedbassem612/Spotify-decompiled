package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vkx extends hux {
    public static final Parcelable.Creator<vkx> CREATOR;
    public static final vkx c;
    public static final byte d;

    static {
        b180 b180VarB = h4p1.a;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Blocks16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0Var = new cwh0();
            cwh0Var.l(7.25f, 14.25f);
            cwh0Var.i(4.0f);
            cwh0Var.v(-4.0f);
            cwh0Var.i(-4.0f);
            cwh0Var.e();
            rjx.z(cwh0Var, 1.75f, 14.25f, 4.0f, -4.0f);
            rjx.v(cwh0Var, -4.0f, 1.75f, 8.75f, 4.0f);
            cwh0Var.v(-4.0f);
            cwh0Var.i(-4.0f);
            cwh0Var.e();
            cwh0Var.l(10.75f, 5.25f);
            cwh0Var.i(3.5f);
            cwh0Var.v(-3.5f);
            cwh0Var.i(-3.5f);
            cwh0Var.e();
            cwh0Var.l(7.25f, 8.75f);
            cwh0Var.i(4.25f);
            cwh0Var.g(0.69f, 0.0f, 1.25f, 0.56f, 1.25f, 1.25f);
            cwh0Var.v(4.5f);
            cwh0Var.g(0.0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f);
            cwh0Var.i(-10.0f);
            cwh0Var.g(-0.69f, 0.0f, -1.25f, -0.56f, -1.25f, -1.25f);
            cwh0Var.v(-10.0f);
            cwh0Var.g(0.0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f);
            cwh0Var.j(6.0f, 3.25f);
            cwh0Var.g(0.69f, 0.0f, 1.25f, 0.56f, 1.25f, 1.25f);
            cwh0Var.e();
            cwh0Var.l(15.75f, 5.5f);
            cwh0Var.g(0.0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f);
            cwh0Var.i(-4.0f);
            cwh0Var.g(-0.69f, 0.0f, -1.25f, -0.56f, -1.25f, -1.25f);
            cwh0Var.v(-4.0f);
            cwh0Var.g(0.0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f);
            cwh0Var.i(4.0f);
            cwh0Var.g(0.69f, 0.0f, 1.25f, 0.56f, 1.25f, 1.25f);
            cwh0Var.e();
            a180.a(a180Var, cwh0Var.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            h4p1.a = b180VarB;
        }
        b180 b180VarB2 = k4p1.a;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Blocks24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(17.0f, 15.5f);
            cwh0VarG.c(0.5f, 0.5f, false, false, -0.5f, -0.5f);
            cwh0VarG.j(11.0f, 15.0f);
            cwh0VarG.v(6.0f);
            cwh0VarG.i(5.5f);
            cwh0VarG.c(0.5f, 0.5f, false, false, 0.5f, -0.5f);
            cwh0VarG.e();
            cwh0VarG.l(21.0f, 3.5f);
            cwh0VarG.c(0.5f, 0.5f, false, false, -0.5f, -0.5f);
            cwh0VarG.i(-5.0f);
            cwh0VarG.c(0.5f, 0.5f, false, false, -0.5f, 0.5f);
            cwh0VarG.v(5.0f);
            cwh0VarG.c(0.5f, 0.5f, false, false, 0.5f, 0.5f);
            cwh0VarG.i(5.0f);
            cwh0VarG.c(0.5f, 0.5f, false, false, 0.5f, -0.5f);
            cwh0VarG.e();
            cwh0VarG.l(3.0f, 20.5f);
            cwh0VarG.c(0.5f, 0.5f, false, false, 0.5f, 0.5f);
            cwh0VarG.j(9.0f, 21.0f);
            cwh0VarG.v(-6.0f);
            cwh0VarG.j(3.0f, 15.0f);
            cwh0VarG.e();
            cwh0VarG.l(9.0f, 7.5f);
            cwh0VarG.c(0.5f, 0.5f, false, false, -0.5f, -0.5f);
            cwh0VarG.i(-5.0f);
            cwh0VarG.c(0.5f, 0.5f, false, false, -0.5f, 0.5f);
            rjx.r(cwh0VarG, 3.0f, 13.0f, 6.0f);
            cwh0VarG.l(11.0f, 13.0f);
            cwh0VarG.i(5.5f);
            cwh0VarG.c(2.5f, 2.5f, false, true, 2.5f, 2.5f);
            cwh0VarG.v(5.0f);
            cwh0VarG.c(2.5f, 2.5f, false, true, -2.5f, 2.5f);
            cwh0VarG.i(-13.0f);
            cwh0VarG.b(2.5f, 2.5f, false, true, 1.0f, 20.5f);
            cwh0VarG.v(-13.0f);
            cwh0VarG.b(2.5f, 2.5f, false, true, 3.5f, 5.0f);
            cwh0VarG.i(5.0f);
            cwh0VarG.b(2.5f, 2.5f, false, true, 11.0f, 7.5f);
            cwh0VarG.e();
            cwh0VarG.l(23.0f, 8.5f);
            cwh0VarG.c(2.5f, 2.5f, false, true, -2.5f, 2.5f);
            cwh0VarG.i(-5.0f);
            cwh0VarG.b(2.5f, 2.5f, false, true, 13.0f, 8.5f);
            cwh0VarG.v(-5.0f);
            cwh0VarG.b(2.5f, 2.5f, false, true, 15.5f, 1.0f);
            cwh0VarG.i(5.0f);
            cwh0VarG.b(2.5f, 2.5f, false, true, 23.0f, 3.5f);
            cwh0VarG.e();
            a180.a(a180Var2, cwh0VarG.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            k4p1.a = b180VarB2;
        }
        dsx dsxVar = new dsx(b180VarB, b180VarB2);
        b180 b180VarB3 = l4p1.a;
        if (b180VarB3 == null) {
            a180 a180Var3 = new a180("Encore.Vector.BlocksActive16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i3 = bui1.a;
            n6a1 n6a1Var3 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(6.0f, 4.0f);
            cwh0VarG2.c(0.5f, 0.5f, false, true, 0.5f, 0.5f);
            cwh0VarG2.v(5.0f);
            cwh0VarG2.i(5.0f);
            cwh0VarG2.c(0.5f, 0.5f, false, true, 0.5f, 0.5f);
            cwh0VarG2.v(4.5f);
            cwh0VarG2.c(0.5f, 0.5f, false, true, -0.5f, 0.5f);
            cwh0VarG2.i(-10.0f);
            cwh0VarG2.c(0.5f, 0.5f, false, true, -0.5f, -0.5f);
            cwh0VarG2.v(-10.0f);
            cwh0VarG2.c(0.5f, 0.5f, false, true, 0.5f, -0.5f);
            cwh0VarG2.e();
            cwh0VarG2.l(14.5f, 1.0f);
            cwh0VarG2.c(0.5f, 0.5f, false, true, 0.5f, 0.5f);
            cwh0VarG2.v(4.0f);
            cwh0VarG2.c(0.5f, 0.5f, false, true, -0.5f, 0.5f);
            cwh0VarG2.i(-4.0f);
            cwh0VarG2.c(0.5f, 0.5f, false, true, -0.5f, -0.5f);
            cwh0VarG2.v(-4.0f);
            cwh0VarG2.c(0.5f, 0.5f, false, true, 0.5f, -0.5f);
            cwh0VarG2.e();
            a180.a(a180Var3, cwh0VarG2.a, n6a1Var3, 1.0f, 2, 1.0f);
            b180VarB3 = a180Var3.b();
            l4p1.a = b180VarB3;
        }
        b180 b180VarB4 = o4p1.a;
        if (b180VarB4 == null) {
            a180 a180Var4 = new a180("Encore.Vector.BlocksActive24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i4 = bui1.a;
            long j = u7h.b;
            n6a1 n6a1Var4 = new n6a1(j);
            cwh0 cwh0VarG3 = lf51.g(9.0f, 5.5f);
            cwh0VarG3.b(1.5f, 1.5f, false, true, 10.5f, 7.0f);
            cwh0VarG3.v(6.5f);
            cwh0VarG3.h(17.0f);
            cwh0VarG3.c(1.5f, 1.5f, false, true, 1.5f, 1.5f);
            cwh0VarG3.v(5.0f);
            cwh0VarG3.c(2.5f, 2.5f, false, true, -2.5f, 2.5f);
            cwh0VarG3.h(4.0f);
            cwh0VarG3.b(2.5f, 2.5f, false, true, 1.5f, 20.0f);
            cwh0VarG3.u(8.0f);
            cwh0VarG3.b(2.5f, 2.5f, false, true, 4.0f, 5.5f);
            cwh0VarG3.e();
            a180.a(a180Var4, cwh0VarG3.a, n6a1Var4, 1.0f, 2, 1.0f);
            n6a1 n6a1Var5 = new n6a1(j);
            cwh0 cwh0VarG4 = lf51.g(21.0f, 1.5f);
            cwh0VarG4.b(1.5f, 1.5f, false, true, 22.5f, 3.0f);
            cwh0VarG4.v(6.0f);
            cwh0VarG4.c(1.5f, 1.5f, false, true, -1.5f, 1.5f);
            cwh0VarG4.i(-6.0f);
            cwh0VarG4.b(1.5f, 1.5f, false, true, 13.5f, 9.0f);
            cwh0VarG4.u(3.0f);
            cwh0VarG4.b(1.5f, 1.5f, false, true, 15.0f, 1.5f);
            cwh0VarG4.e();
            a180.a(a180Var4, cwh0VarG4.a, n6a1Var5, 1.0f, 2, 1.0f);
            b180VarB4 = a180Var4.b();
            o4p1.a = b180VarB4;
        }
        c = new vkx(dsxVar, new dsx(b180VarB3, b180VarB4));
        d = (byte) 8;
        CREATOR = new ckx((byte) 18);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof vkx);
    }

    public final int hashCode() {
        return 1070995227;
    }

    public final String toString() {
        return "Blocks";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
