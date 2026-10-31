package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class htx extends hux {
    public static final Parcelable.Creator<htx> CREATOR;
    public static final htx c;
    public static final byte d;

    static {
        b180 b180VarB = sap1.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.TextFormat16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            long j = u7h.b;
            n6a1 n6a1Var = new n6a1(j);
            cwh0 cwh0Var = new cwh0();
            cwh0Var.l(6.95f, 3.06f);
            cwh0Var.i(2.268f);
            cwh0Var.j(12.872f, 13.0f);
            cwh0Var.j(10.94f, 13.0f);
            cwh0Var.k(-0.838f, -2.422f);
            cwh0Var.j(5.935f, 10.578f);
            ydh.k(cwh0Var, 5.088f, 13.0f, 3.282f, 13.0f);
            cwh0Var.l(6.453f, 9.094f);
            cwh0Var.i(3.135f);
            cwh0Var.k(-1.56f, -4.508f);
            cwh0Var.e();
            a180.a(a180Var, cwh0Var.a, n6a1Var, 1.0f, 2, 1.0f);
            n6a1 n6a1Var2 = new n6a1(j);
            cwh0 cwh0VarG = lf51.g(1.5f, 0.0f);
            cwh0VarG.b(1.5f, 1.5f, false, false, 0.0f, 1.5f);
            cwh0VarG.v(13.0f);
            cwh0VarG.b(1.5f, 1.5f, false, false, 1.5f, 16.0f);
            cwh0VarG.i(13.0f);
            cwh0VarG.c(1.5f, 1.5f, false, false, 1.5f, -1.5f);
            cwh0VarG.v(-13.0f);
            cwh0VarG.b(1.5f, 1.5f, false, false, 14.5f, 0.0f);
            hrt.u(cwh0VarG, 14.5f, 1.5f, 13.0f, -13.0f);
            cwh0VarG.v(-13.0f);
            cwh0VarG.e();
            a180.a(a180Var, cwh0VarG.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            sap1.b = b180VarB;
        }
        b180 b180VarB2 = uap1.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.TextFormat24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var3 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(1.0f, 3.0f);
            cwh0VarG2.c(2.0f, 2.0f, false, true, 2.0f, -2.0f);
            cwh0VarG2.i(18.0f);
            cwh0VarG2.c(2.0f, 2.0f, false, true, 2.0f, 2.0f);
            cwh0VarG2.v(18.0f);
            cwh0VarG2.c(2.0f, 2.0f, false, true, -2.0f, 2.0f);
            cwh0VarG2.j(3.0f, 23.0f);
            cwh0VarG2.c(2.0f, 2.0f, false, true, -2.0f, -2.0f);
            hrt.o(cwh0VarG2, 14.285f, 13.46f, 9.603f, 13.46f);
            rjx.y(cwh0VarG2, 2.352f, -6.62f, 14.982f, 15.44f);
            cwh0VarG2.j(16.235f, 19.0f);
            cwh0VarG2.i(2.56f);
            cwh0VarG2.k(-5.26f, -14.2f);
            cwh0VarG2.i(-3.0f);
            cwh0VarG2.j(5.255f, 19.0f);
            cwh0VarG2.i(2.38f);
            cwh0VarG2.j(8.9f, 15.44f);
            cwh0VarG2.e();
            cwh0VarG2.l(21.0f, 3.0f);
            rjx.x(cwh0VarG2, 3.0f, 3.0f, 18.0f, 18.0f);
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var3, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            uap1.b = b180VarB2;
        }
        dsx dsxVar = new dsx(b180VarB, b180VarB2);
        b180 b180VarB3 = xap1.b;
        if (b180VarB3 == null) {
            a180 a180Var3 = new a180("Encore.Vector.TextFormatActive16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i3 = bui1.a;
            n6a1 n6a1Var4 = new n6a1(u7h.b);
            cwh0 cwh0VarG3 = lf51.g(0.44f, 0.44f);
            cwh0VarG3.b(1.5f, 1.5f, false, true, 1.5f, 0.0f);
            cwh0VarG3.i(13.0f);
            cwh0VarG3.b(1.5f, 1.5f, false, true, 16.0f, 1.5f);
            cwh0VarG3.v(13.0f);
            cwh0VarG3.c(1.5f, 1.5f, false, true, -1.5f, 1.5f);
            cwh0VarG3.i(-13.0f);
            cwh0VarG3.b(1.5f, 1.5f, false, true, 0.0f, 14.5f);
            cwh0VarG3.v(-13.0f);
            cwh0VarG3.f(0.0f, 1.102f, 0.158f, 0.72f, 0.44f, 0.44f);
            cwh0VarG3.l(9.191f, 3.0f);
            rjx.s(cwh0VarG3, -2.27f, 3.25f, 12.95f, 1.808f);
            cwh0VarG3.k(0.847f, -2.424f);
            cwh0VarG3.i(4.172f);
            cwh0VarG3.k(0.839f, 2.424f);
            cwh0VarG3.i(1.934f);
            cwh0VarG3.e();
            cwh0VarG3.l(9.561f, 9.04f);
            cwh0VarG3.j(8.002f, 4.528f);
            rjx.r(cwh0VarG3, 6.424f, 9.04f, 3.139f);
            a180.a(a180Var3, cwh0VarG3.a, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB3 = a180Var3.b();
            xap1.b = b180VarB3;
        }
        b180 b180VarB4 = yap1.b;
        if (b180VarB4 == null) {
            a180 a180Var4 = new a180("Encore.Vector.TextFormatActive24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i4 = bui1.a;
            n6a1 n6a1Var5 = new n6a1(u7h.b);
            cwh0 cwh0VarG4 = lf51.g(1.0f, 3.0f);
            cwh0VarG4.c(2.0f, 2.0f, false, true, 2.0f, -2.0f);
            cwh0VarG4.i(18.0f);
            cwh0VarG4.c(2.0f, 2.0f, false, true, 2.0f, 2.0f);
            cwh0VarG4.v(18.0f);
            cwh0VarG4.c(2.0f, 2.0f, false, true, -2.0f, 2.0f);
            cwh0VarG4.j(3.0f, 23.0f);
            cwh0VarG4.c(2.0f, 2.0f, false, true, -2.0f, -2.0f);
            cwh0VarG4.e();
            cwh0VarG4.l(13.505f, 4.8f);
            cwh0VarG4.i(-2.99f);
            cwh0VarG4.k(-5.265f, 14.0f);
            cwh0VarG4.i(2.373f);
            cwh0VarG4.k(1.261f, -3.51f);
            cwh0VarG4.i(6.064f);
            cwh0VarG4.k(1.25f, 3.51f);
            cwh0VarG4.i(2.552f);
            cwh0VarG4.e();
            cwh0VarG4.l(14.253f, 13.338f);
            cwh0VarG4.j(11.93f, 6.811f);
            cwh0VarG4.k(-2.345f, 6.527f);
            cwh0VarG4.e();
            a180.a(a180Var4, cwh0VarG4.a, n6a1Var5, 1.0f, 2, 1.0f);
            b180VarB4 = a180Var4.b();
            yap1.b = b180VarB4;
        }
        c = new htx(dsxVar, new dsx(b180VarB3, b180VarB4));
        d = (byte) 8;
        CREATOR = new psx((byte) 17);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof htx);
    }

    public final int hashCode() {
        return -1261942119;
    }

    public final String toString() {
        return "TextFormat";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
