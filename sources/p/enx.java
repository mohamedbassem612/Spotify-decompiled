package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class enx extends hux {
    public static final Parcelable.Creator<enx> CREATOR;
    public static final enx c;
    public static final byte d;

    static {
        b180 b180VarB = pxd0.j;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Filter16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(10.75f, 13.25f);
            cwh0VarG.c(1.5f, 1.5f, true, false, 0.001f, -2.998f);
            cwh0VarG.c(1.5f, 1.5f, false, false, -0.001f, 2.998f);
            cwh0VarG.m(4.5f, -0.75f);
            cwh0VarG.i(-1.595f);
            cwh0VarG.c(3.001f, 3.001f, false, true, -5.81f, 0.0f);
            cwh0VarG.h(0.75f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.0f, -1.5f);
            cwh0VarG.i(7.095f);
            cwh0VarG.c(3.001f, 3.001f, false, true, 5.81f, 0.0f);
            cwh0VarG.i(1.595f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.0f, 1.5f);
            cwh0VarG.l(5.353f, 5.747f);
            cwh0VarG.c(1.5f, 1.5f, true, false, -0.206f, -2.993f);
            cwh0VarG.c(1.5f, 1.5f, false, false, 0.206f, 2.993f);
            cwh0VarG.l(15.25f, 5.0f);
            cwh0VarG.h(8.155f);
            cwh0VarG.c(3.001f, 3.001f, false, true, -5.81f, 0.0f);
            cwh0VarG.h(0.75f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.0f, -1.5f);
            cwh0VarG.i(1.595f);
            cwh0VarG.c(3.001f, 3.001f, false, true, 5.81f, 0.0f);
            cwh0VarG.i(7.095f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.0f, 1.5f);
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            pxd0.j = b180VarB;
        }
        b180 b180VarB2 = qxd0.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Filter24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(12.874f, 8.0f);
            cwh0VarG2.c(4.002f, 4.002f, false, true, -7.748f, 0.0f);
            cwh0VarG2.h(3.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 0.0f, -2.0f);
            cwh0VarG2.i(2.126f);
            cwh0VarG2.c(4.002f, 4.002f, false, true, 7.748f, 0.0f);
            cwh0VarG2.h(21.0f);
            cwh0VarG2.c(1.0f, 1.0f, true, true, 0.0f, 2.0f);
            cwh0VarG2.e();
            cwh0VarG2.l(11.0f, 7.0f);
            cwh0VarG2.c(2.0f, 2.0f, true, false, -4.0f, 0.0f);
            cwh0VarG2.c(2.0f, 2.0f, false, false, 4.0f, 0.0f);
            cwh0VarG2.m(0.126f, 9.0f);
            cwh0VarG2.c(4.002f, 4.002f, false, true, 7.748f, 0.0f);
            cwh0VarG2.h(21.0f);
            cwh0VarG2.c(1.0f, 1.0f, true, true, 0.0f, 2.0f);
            cwh0VarG2.i(-2.126f);
            cwh0VarG2.c(4.002f, 4.002f, false, true, -7.748f, 0.0f);
            cwh0VarG2.h(3.0f);
            cwh0VarG2.c(1.0f, 1.0f, true, true, 0.0f, -2.0f);
            cwh0VarG2.e();
            cwh0VarG2.l(17.0f, 17.0f);
            cwh0VarG2.c(2.0f, 2.0f, false, false, -4.0f, -0.001f);
            cwh0VarG2.u(17.0f);
            cwh0VarG2.c(2.0f, 2.0f, true, false, 4.0f, 0.0f);
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            qxd0.b = b180VarB2;
        }
        dsx dsxVar = new dsx(b180VarB, b180VarB2);
        b180 b180VarB3 = w2g0.c;
        if (b180VarB3 == null) {
            a180 a180Var3 = new a180("Encore.Vector.FilterActive16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i3 = bui1.a;
            n6a1 n6a1Var3 = new n6a1(u7h.b);
            cwh0 cwh0Var = new cwh0();
            cwh0Var.l(2.345f, 3.5f);
            cwh0Var.h(0.75f);
            cwh0Var.c(0.75f, 0.75f, false, false, 0.0f, 1.5f);
            cwh0Var.i(1.595f);
            cwh0Var.c(3.001f, 3.001f, false, false, 5.81f, 0.0f);
            cwh0Var.i(7.095f);
            cwh0Var.c(0.75f, 0.75f, false, false, 0.0f, -1.5f);
            cwh0Var.h(8.155f);
            cwh0Var.c(3.001f, 3.001f, false, false, -5.81f, 0.0f);
            cwh0Var.m(5.5f, 7.5f);
            cwh0Var.h(0.75f);
            cwh0Var.c(0.75f, 0.75f, false, false, 0.0f, 1.5f);
            cwh0Var.i(7.095f);
            cwh0Var.c(3.001f, 3.001f, false, false, 5.81f, 0.0f);
            cwh0Var.i(1.595f);
            cwh0Var.c(0.75f, 0.75f, false, false, 0.0f, -1.5f);
            cwh0Var.i(-1.595f);
            cwh0Var.c(3.001f, 3.001f, false, false, -5.81f, 0.0f);
            a180.a(a180Var3, cwh0Var.a, n6a1Var3, 1.0f, 2, 1.0f);
            b180VarB3 = a180Var3.b();
            w2g0.c = b180VarB3;
        }
        b180 b180VarB4 = x2g0.c;
        if (b180VarB4 == null) {
            a180 a180Var4 = new a180("Encore.Vector.FilterActive24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i4 = bui1.a;
            n6a1 n6a1Var4 = new n6a1(u7h.b);
            cwh0 cwh0VarG3 = lf51.g(12.874f, 8.0f);
            cwh0VarG3.c(4.002f, 4.002f, false, true, -7.748f, 0.0f);
            cwh0VarG3.j(3.0f, 8.0f);
            cwh0VarG3.c(1.0f, 1.0f, false, true, 0.0f, -2.0f);
            cwh0VarG3.i(2.126f);
            cwh0VarG3.c(4.002f, 4.002f, false, true, 7.748f, 0.0f);
            cwh0VarG3.j(21.0f, 6.0f);
            cwh0VarG3.c(1.0f, 1.0f, true, true, 0.0f, 2.0f);
            cwh0VarG3.e();
            cwh0VarG3.l(11.126f, 16.0f);
            cwh0VarG3.c(4.002f, 4.002f, false, true, 7.748f, 0.0f);
            cwh0VarG3.j(21.0f, 16.0f);
            cwh0VarG3.c(1.0f, 1.0f, true, true, 0.0f, 2.0f);
            cwh0VarG3.i(-2.126f);
            cwh0VarG3.c(4.002f, 4.002f, false, true, -7.748f, 0.0f);
            cwh0VarG3.j(3.0f, 18.0f);
            cwh0VarG3.c(1.0f, 1.0f, true, true, 0.0f, -2.0f);
            cwh0VarG3.e();
            a180.a(a180Var4, cwh0VarG3.a, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB4 = a180Var4.b();
            x2g0.c = b180VarB4;
        }
        c = new enx(dsxVar, new dsx(b180VarB3, b180VarB4));
        d = (byte) 8;
        CREATOR = new mmx((byte) 16);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof enx);
    }

    public final int hashCode() {
        return 1182668045;
    }

    public final String toString() {
        return "Filter";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
