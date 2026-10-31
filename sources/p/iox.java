package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class iox extends hux {
    public static final Parcelable.Creator<iox> CREATOR;
    public static final iox c;
    public static final byte d;

    static {
        b180 b180VarB = prn1.a;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.LightBulb16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0Var = new cwh0();
            cwh0Var.l(5.0f, 14.5f);
            cwh0Var.i(6.0f);
            cwh0Var.j(11.0f, 16.0f);
            rjx.u(cwh0Var, 5.0f, 16.0f, 10.614f, 7.327f);
            cwh0Var.c(3.5f, 3.5f, true, false, -5.229f, 0.0f);
            cwh0Var.f(5.936f, 7.945f, 6.5f, 8.862f, 6.5f, 10.0f);
            cwh0Var.v(1.0f);
            cwh0Var.i(3.0f);
            cwh0Var.v(-1.0f);
            cwh0Var.g(0.0f, -1.138f, 0.564f, -2.055f, 1.114f, -2.673f);
            cwh0Var.m(1.12f, 0.998f);
            cwh0Var.f(11.316f, 8.795f, 11.0f, 9.37f, 11.0f, 10.0f);
            cwh0Var.v(2.5f);
            cwh0Var.j(5.0f, 12.5f);
            cwh0Var.j(5.0f, 10.0f);
            cwh0Var.g(0.0f, -0.63f, -0.316f, -1.205f, -0.734f, -1.675f);
            cwh0Var.c(5.0f, 5.0f, true, true, 7.468f, 0.0f);
            a180.a(a180Var, cwh0Var.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            prn1.a = b180VarB;
        }
        b180 b180VarB2 = rrn1.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.LightBulb24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0Var2 = new cwh0();
            cwh0Var2.l(9.0f, 22.0f);
            cwh0Var2.i(6.0f);
            cwh0Var2.c(2.0f, 2.0f, false, true, -2.0f, 2.0f);
            cwh0Var2.i(-2.0f);
            cwh0Var2.c(2.0f, 2.0f, false, true, -2.0f, -2.0f);
            cwh0Var2.m(-1.5f, -3.0f);
            cwh0Var2.c(1.0f, 1.0f, false, true, 1.0f, -1.0f);
            cwh0Var2.i(7.0f);
            cwh0Var2.c(1.0f, 1.0f, true, true, 0.0f, 2.0f);
            cwh0Var2.i(-7.0f);
            cwh0Var2.c(1.0f, 1.0f, false, true, -1.0f, -1.0f);
            cwh0Var2.m(8.043f, -8.472f);
            cwh0Var2.c(5.0f, 5.0f, true, false, -7.085f, 0.0f);
            cwh0Var2.f(9.242f, 11.317f, 10.0f, 12.512f, 10.0f, 14.0f);
            cwh0Var2.i(4.0f);
            cwh0Var2.g(0.0f, -1.488f, 0.757f, -2.683f, 1.543f, -3.472f);
            cwh0Var2.m(1.417f, 1.412f);
            cwh0Var2.g(-0.555f, 0.557f, -0.96f, 1.274f, -0.96f, 2.06f);
            cwh0Var2.v(2.0f);
            cwh0Var2.h(8.0f);
            cwh0Var2.v(-2.0f);
            cwh0Var2.g(0.0f, -0.786f, -0.405f, -1.503f, -0.96f, -2.06f);
            cwh0Var2.c(7.0f, 7.0f, true, true, 9.92f, 0.0f);
            a180.a(a180Var2, cwh0Var2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            rrn1.b = b180VarB2;
        }
        dsx dsxVar = new dsx(b180VarB, b180VarB2);
        b180 b180VarB3 = ltn1.b;
        if (b180VarB3 == null) {
            a180 a180Var3 = new a180("Encore.Vector.LightBulbActive16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i3 = bui1.a;
            n6a1 n6a1Var3 = new n6a1(u7h.b);
            cwh0 cwh0Var3 = new cwh0();
            cwh0Var3.l(5.0f, 14.5f);
            cwh0Var3.i(6.0f);
            cwh0Var3.j(11.0f, 16.0f);
            rjx.u(cwh0Var3, 5.0f, 16.0f, 11.0f, 10.0f);
            cwh0Var3.g(0.0f, -0.63f, 0.316f, -1.205f, 0.734f, -1.675f);
            cwh0Var3.c(5.0f, 5.0f, true, false, -7.468f, 0.0f);
            cwh0Var3.f(4.684f, 8.795f, 5.0f, 9.37f, 5.0f, 10.0f);
            cwh0Var3.v(2.5f);
            cwh0Var3.i(6.0f);
            cwh0Var3.e();
            a180.a(a180Var3, cwh0Var3.a, n6a1Var3, 1.0f, 2, 1.0f);
            b180VarB3 = a180Var3.b();
            ltn1.b = b180VarB3;
        }
        b180 b180VarB4 = nyn1.b;
        if (b180VarB4 == null) {
            a180 a180Var4 = new a180("Encore.Vector.LightBulbActive24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i4 = bui1.a;
            n6a1 n6a1Var4 = new n6a1(u7h.b);
            cwh0 cwh0Var4 = new cwh0();
            cwh0Var4.l(9.0f, 22.0f);
            cwh0Var4.i(6.0f);
            cwh0Var4.c(2.0f, 2.0f, false, true, -2.0f, 2.0f);
            cwh0Var4.i(-2.0f);
            cwh0Var4.c(2.0f, 2.0f, false, true, -2.0f, -2.0f);
            cwh0Var4.m(-1.5f, -3.0f);
            cwh0Var4.c(1.0f, 1.0f, false, true, 1.0f, -1.0f);
            cwh0Var4.i(7.0f);
            cwh0Var4.c(1.0f, 1.0f, true, true, 0.0f, 2.0f);
            cwh0Var4.i(-7.0f);
            cwh0Var4.c(1.0f, 1.0f, false, true, -1.0f, -1.0f);
            cwh0Var4.m(9.46f, -7.06f);
            cwh0Var4.g(-0.555f, 0.557f, -0.96f, 1.274f, -0.96f, 2.06f);
            cwh0Var4.v(2.0f);
            cwh0Var4.h(8.0f);
            cwh0Var4.v(-2.0f);
            cwh0Var4.g(0.0f, -0.786f, -0.405f, -1.503f, -0.96f, -2.06f);
            cwh0Var4.c(7.0f, 7.0f, true, true, 9.92f, 0.0f);
            a180.a(a180Var4, cwh0Var4.a, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB4 = a180Var4.b();
            nyn1.b = b180VarB4;
        }
        c = new iox(dsxVar, new dsx(b180VarB3, b180VarB4));
        d = (byte) 8;
        CREATOR = new snx((byte) 14);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof iox);
    }

    public final int hashCode() {
        return -1481354870;
    }

    public final String toString() {
        return "LightBulb";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
