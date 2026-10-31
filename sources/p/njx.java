package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class njx extends hux {
    public static final Parcelable.Creator<njx> CREATOR;
    public static final njx c;
    public static final byte d;

    static {
        b180 b180VarB = hxo1.a;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Ad16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            long j = u7h.b;
            n6a1 n6a1Var = new n6a1(j);
            cwh0 cwh0VarG = lf51.g(0.0f, 1.75f);
            cwh0VarG.b(0.75f, 0.75f, false, true, 0.75f, 1.0f);
            cwh0VarG.i(14.5f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.75f, 0.75f);
            cwh0VarG.v(13.5f);
            cwh0VarG.c(0.75f, 0.75f, false, true, -0.75f, 0.75f);
            cwh0VarG.j(0.75f, 16.0f);
            cwh0VarG.c(0.75f, 0.75f, false, true, -0.75f, -0.75f);
            hrt.u(cwh0VarG, 1.5f, 2.5f, 12.0f, 13.0f);
            cwh0VarG.v(-12.0f);
            cwh0VarG.e();
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            n6a1 n6a1Var2 = new n6a1(j);
            cwh0 cwh0VarG2 = lf51.g(3.0f, 8.75f);
            cwh0VarG2.b(0.75f, 0.75f, false, true, 3.75f, 8.0f);
            cwh0VarG2.i(8.5f);
            cwh0VarG2.c(0.75f, 0.75f, false, true, 0.75f, 0.75f);
            cwh0VarG2.v(3.5f);
            cwh0VarG2.c(0.75f, 0.75f, false, true, -0.75f, 0.75f);
            cwh0VarG2.i(-8.5f);
            cwh0VarG2.c(0.75f, 0.75f, false, true, -0.75f, -0.75f);
            hrt.u(cwh0VarG2, 4.5f, 9.5f, 2.0f, 7.0f);
            cwh0VarG2.v(-2.0f);
            cwh0VarG2.e();
            a180.a(a180Var, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            hxo1.a = b180VarB;
        }
        b180 b180VarB2 = vxo1.a;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Ad24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            long j2 = u7h.b;
            n6a1 n6a1Var3 = new n6a1(j2);
            cwh0 cwh0VarG3 = lf51.g(1.0f, 4.0f);
            cwh0VarG3.c(2.0f, 2.0f, false, true, 2.0f, -2.0f);
            cwh0VarG3.i(18.0f);
            cwh0VarG3.c(2.0f, 2.0f, false, true, 2.0f, 2.0f);
            cwh0VarG3.v(16.0f);
            cwh0VarG3.c(2.0f, 2.0f, false, true, -2.0f, 2.0f);
            cwh0VarG3.j(3.0f, 22.0f);
            cwh0VarG3.c(2.0f, 2.0f, false, true, -2.0f, -2.0f);
            hrt.o(cwh0VarG3, 21.0f, 4.0f, 3.0f, 4.0f);
            cwh0VarG3.v(16.0f);
            cwh0VarG3.i(18.0f);
            cwh0VarG3.e();
            a180.a(a180Var2, cwh0VarG3.a, n6a1Var3, 1.0f, 2, 1.0f);
            n6a1 n6a1Var4 = new n6a1(j2);
            cwh0 cwh0VarG4 = lf51.g(5.0f, 12.0f);
            cwh0VarG4.c(1.0f, 1.0f, false, true, 1.0f, -1.0f);
            cwh0VarG4.i(12.0f);
            cwh0VarG4.c(1.0f, 1.0f, false, true, 1.0f, 1.0f);
            cwh0VarG4.v(5.0f);
            cwh0VarG4.c(1.0f, 1.0f, false, true, -1.0f, 1.0f);
            cwh0VarG4.j(6.0f, 18.0f);
            cwh0VarG4.c(1.0f, 1.0f, false, true, -1.0f, -1.0f);
            hrt.u(cwh0VarG4, 7.0f, 13.0f, 3.0f, 10.0f);
            cwh0VarG4.v(-3.0f);
            cwh0VarG4.e();
            a180.a(a180Var2, cwh0VarG4.a, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            vxo1.a = b180VarB2;
        }
        dsx dsxVar = new dsx(b180VarB, b180VarB2);
        b180 b180VarB3 = wxo1.a;
        if (b180VarB3 == null) {
            a180 a180Var3 = new a180("Encore.Vector.AdActive16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i3 = bui1.a;
            n6a1 n6a1Var5 = new n6a1(u7h.b);
            cwh0 cwh0VarG5 = lf51.g(0.0f, 1.75f);
            cwh0VarG5.b(0.75f, 0.75f, false, true, 0.75f, 1.0f);
            cwh0VarG5.i(14.5f);
            cwh0VarG5.c(0.75f, 0.75f, false, true, 0.75f, 0.75f);
            cwh0VarG5.v(13.5f);
            cwh0VarG5.c(0.75f, 0.75f, false, true, -0.75f, 0.75f);
            cwh0VarG5.h(0.75f);
            cwh0VarG5.c(0.75f, 0.75f, false, true, -0.75f, -0.75f);
            cwh0VarG5.e();
            cwh0VarG5.l(3.75f, 9.0f);
            cwh0VarG5.c(0.75f, 0.75f, false, false, -0.75f, 0.75f);
            cwh0VarG5.v(2.5f);
            cwh0VarG5.g(0.0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f);
            cwh0VarG5.i(8.5f);
            cwh0VarG5.c(0.75f, 0.75f, false, false, 0.75f, -0.75f);
            cwh0VarG5.v(-2.5f);
            cwh0VarG5.c(0.75f, 0.75f, false, false, -0.75f, -0.75f);
            cwh0VarG5.e();
            a180.a(a180Var3, cwh0VarG5.a, n6a1Var5, 1.0f, 2, 1.0f);
            b180VarB3 = a180Var3.b();
            wxo1.a = b180VarB3;
        }
        b180 b180VarB4 = yxo1.a;
        if (b180VarB4 == null) {
            a180 a180Var4 = new a180("Encore.Vector.AdActive24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i4 = bui1.a;
            n6a1 n6a1Var6 = new n6a1(u7h.b);
            cwh0 cwh0VarG6 = lf51.g(1.0f, 4.0f);
            cwh0VarG6.c(2.0f, 2.0f, false, true, 2.0f, -2.0f);
            cwh0VarG6.i(18.0f);
            cwh0VarG6.c(2.0f, 2.0f, false, true, 2.0f, 2.0f);
            cwh0VarG6.v(16.0f);
            cwh0VarG6.c(2.0f, 2.0f, false, true, -2.0f, 2.0f);
            cwh0VarG6.j(3.0f, 22.0f);
            cwh0VarG6.c(2.0f, 2.0f, false, true, -2.0f, -2.0f);
            cwh0VarG6.e();
            cwh0VarG6.l(5.0f, 13.0f);
            cwh0VarG6.v(4.0f);
            cwh0VarG6.c(1.0f, 1.0f, false, false, 1.0f, 1.0f);
            cwh0VarG6.i(12.0f);
            cwh0VarG6.c(1.0f, 1.0f, false, false, 1.0f, -1.0f);
            cwh0VarG6.v(-4.0f);
            cwh0VarG6.c(1.0f, 1.0f, false, false, -1.0f, -1.0f);
            cwh0VarG6.j(6.0f, 12.0f);
            cwh0VarG6.c(1.0f, 1.0f, false, false, -1.0f, 1.0f);
            a180.a(a180Var4, cwh0VarG6.a, n6a1Var6, 1.0f, 2, 1.0f);
            b180VarB4 = a180Var4.b();
            yxo1.a = b180VarB4;
        }
        c = new njx(dsxVar, new dsx(b180VarB3, b180VarB4));
        d = (byte) 8;
        CREATOR = new x7w((byte) 16);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof njx);
    }

    public final int hashCode() {
        return 643524664;
    }

    public final String toString() {
        return "Ad";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
