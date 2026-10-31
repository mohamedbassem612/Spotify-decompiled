package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bnx extends hux {
    public static final Parcelable.Creator<bnx> CREATOR;
    public static final bnx c;
    public static final byte d;

    static {
        b180 b180VarB = e130.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Events16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(0.0f, 2.75f);
            cwh0VarG.b(0.75f, 0.75f, false, true, 0.75f, 2.0f);
            cwh0VarG.i(14.5f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.75f, 0.75f);
            cwh0VarG.v(3.5f);
            cwh0VarG.c(1.749f, 1.749f, true, false, 0.0f, 3.5f);
            cwh0VarG.v(3.5f);
            cwh0VarG.c(0.75f, 0.75f, false, true, -0.75f, 0.75f);
            cwh0VarG.j(0.75f, 14.0f);
            cwh0VarG.c(0.75f, 0.75f, false, true, -0.75f, -0.75f);
            cwh0VarG.v(-3.5f);
            cwh0VarG.c(1.75f, 1.75f, true, false, 0.0f, -3.5f);
            cwh0VarG.e();
            cwh0VarG.l(1.5f, 12.5f);
            cwh0VarG.i(4.0f);
            cwh0VarG.v(-9.0f);
            cwh0VarG.i(-4.0f);
            cwh0VarG.v(1.616f);
            cwh0VarG.c(3.25f, 3.25f, false, true, 0.0f, 5.768f);
            hrt.o(cwh0VarG, 14.5f, 5.116f, 14.5f, 3.5f);
            cwh0VarG.j(7.0f, 3.5f);
            cwh0VarG.v(9.0f);
            cwh0VarG.i(7.5f);
            cwh0VarG.v(-1.616f);
            cwh0VarG.c(3.25f, 3.25f, false, true, 0.0f, -5.768f);
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            e130.b = b180VarB;
        }
        b180 b180VarB2 = up30.a;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Events24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(0.0f, 4.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 1.0f, -1.0f);
            cwh0VarG2.i(22.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 1.0f, 1.0f);
            cwh0VarG2.v(5.0f);
            cwh0VarG2.g(-0.768f, 0.0f, -1.47f, 0.289f, -2.0f, 0.764f);
            cwh0VarG2.g(-0.614f, 0.55f, -1.0f, 1.348f, -1.0f, 2.236f);
            cwh0VarG2.c(3.0f, 3.0f, false, false, 1.0f, 2.236f);
            cwh0VarG2.g(0.53f, 0.475f, 1.232f, 0.764f, 2.0f, 0.764f);
            cwh0VarG2.v(5.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, -1.0f, 1.0f);
            cwh0VarG2.j(1.0f, 21.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, -1.0f, -1.0f);
            cwh0VarG2.v(-5.0f);
            cwh0VarG2.g(0.768f, 0.0f, 1.47f, -0.289f, 2.0f, -0.764f);
            cwh0VarG2.g(0.614f, -0.55f, 1.0f, -1.348f, 1.0f, -2.236f);
            cwh0VarG2.c(3.0f, 3.0f, false, false, -1.0f, -2.236f);
            cwh0VarG2.b(3.0f, 3.0f, false, false, 0.0f, 9.0f);
            hrt.o(cwh0VarG2, 2.0f, 16.584f, 2.0f, 19.0f);
            cwh0VarG2.i(6.0f);
            cwh0VarG2.j(8.0f, 5.0f);
            cwh0VarG2.j(2.0f, 5.0f);
            cwh0VarG2.v(2.416f);
            cwh0VarG2.c(5.001f, 5.001f, false, true, 0.0f, 9.168f);
            cwh0VarG2.l(22.0f, 19.0f);
            cwh0VarG2.v(-2.416f);
            cwh0VarG2.c(5.001f, 5.001f, false, true, 0.0f, -9.168f);
            cwh0VarG2.j(22.0f, 5.0f);
            cwh0VarG2.j(10.0f, 5.0f);
            cwh0VarG2.v(14.0f);
            cwh0VarG2.e();
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            up30.a = b180VarB2;
        }
        dsx dsxVar = new dsx(b180VarB, b180VarB2);
        b180 b180VarB3 = gm50.b;
        if (b180VarB3 == null) {
            a180 a180Var3 = new a180("Encore.Vector.EventsActive16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i3 = bui1.a;
            n6a1 n6a1Var3 = new n6a1(u7h.b);
            cwh0 cwh0VarG3 = lf51.g(0.0f, 2.75f);
            cwh0VarG3.b(0.75f, 0.75f, false, true, 0.75f, 2.0f);
            cwh0VarG3.h(5.5f);
            cwh0VarG3.v(12.0f);
            cwh0VarG3.h(7.0f);
            cwh0VarG3.u(2.0f);
            cwh0VarG3.i(8.25f);
            cwh0VarG3.c(0.75f, 0.75f, false, true, 0.75f, 0.75f);
            cwh0VarG3.v(3.5f);
            cwh0VarG3.c(1.75f, 1.75f, true, false, 0.0f, 3.5f);
            cwh0VarG3.v(3.5f);
            cwh0VarG3.c(0.75f, 0.75f, false, true, -0.75f, 0.75f);
            cwh0VarG3.h(0.75f);
            cwh0VarG3.c(0.75f, 0.75f, false, true, -0.75f, -0.75f);
            cwh0VarG3.v(-3.5f);
            cwh0VarG3.c(1.75f, 1.75f, true, false, 0.0f, -3.5f);
            cwh0VarG3.e();
            a180.a(a180Var3, cwh0VarG3.a, n6a1Var3, 1.0f, 2, 1.0f);
            b180VarB3 = a180Var3.b();
            gm50.b = b180VarB3;
        }
        b180 b180VarB4 = x760.b;
        if (b180VarB4 == null) {
            a180 a180Var4 = new a180("Encore.Vector.EventsActive24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i4 = bui1.a;
            n6a1 n6a1Var4 = new n6a1(u7h.b);
            cwh0 cwh0VarG4 = lf51.g(0.0f, 4.0f);
            cwh0VarG4.c(1.0f, 1.0f, false, true, 1.0f, -1.0f);
            cwh0VarG4.i(22.0f);
            cwh0VarG4.c(1.0f, 1.0f, false, true, 1.0f, 1.0f);
            cwh0VarG4.v(5.0f);
            cwh0VarG4.c(3.0f, 3.0f, true, false, 0.0f, 6.0f);
            cwh0VarG4.v(5.0f);
            cwh0VarG4.c(1.0f, 1.0f, false, true, -1.0f, 1.0f);
            cwh0VarG4.h(10.0f);
            cwh0VarG4.u(3.0f);
            cwh0VarG4.h(8.0f);
            cwh0VarG4.v(18.0f);
            cwh0VarG4.h(1.0f);
            cwh0VarG4.c(1.0f, 1.0f, false, true, -1.0f, -1.0f);
            cwh0VarG4.v(-5.0f);
            cwh0VarG4.c(3.0f, 3.0f, true, false, 0.0f, -6.0f);
            cwh0VarG4.e();
            a180.a(a180Var4, cwh0VarG4.a, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB4 = a180Var4.b();
            x760.b = b180VarB4;
        }
        c = new bnx(dsxVar, new dsx(b180VarB3, b180VarB4));
        d = (byte) 8;
        CREATOR = new mmx((byte) 13);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof bnx);
    }

    public final int hashCode() {
        return 1165830830;
    }

    public final String toString() {
        return "Events";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
