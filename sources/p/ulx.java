package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ulx extends hux {
    public static final Parcelable.Creator<ulx> CREATOR;
    public static final ulx c;
    public static final byte d;

    static {
        b180 b180VarB = oap1.a;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Code16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
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
            cwh0 cwh0VarG2 = lf51.g(6.962f, 5.47f);
            cwh0VarG2.c(0.75f, 0.75f, false, true, 0.0f, 1.06f);
            cwh0VarG2.j(4.992f, 8.5f);
            cwh0VarG2.k(1.97f, 1.97f);
            cwh0VarG2.c(0.75f, 0.75f, true, true, -1.06f, 1.06f);
            cwh0VarG2.j(2.87f, 8.5f);
            cwh0VarG2.j(5.9f, 5.47f);
            cwh0VarG2.c(0.75f, 0.75f, false, true, 1.061f, 0.0f);
            cwh0VarG2.e();
            cwh0VarG2.l(9.038f, 5.47f);
            cwh0VarG2.c(0.75f, 0.75f, false, false, 0.0f, 1.06f);
            cwh0VarG2.k(1.97f, 1.97f);
            cwh0VarG2.k(-1.97f, 1.97f);
            cwh0VarG2.c(0.75f, 0.75f, true, false, 1.06f, 1.06f);
            cwh0VarG2.j(13.13f, 8.5f);
            cwh0VarG2.j(10.1f, 5.47f);
            cwh0VarG2.c(0.75f, 0.75f, false, false, -1.061f, 0.0f);
            cwh0VarG2.e();
            a180.a(a180Var, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            oap1.a = b180VarB;
        }
        b180 b180VarB2 = pap1.a;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Code24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
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
            cwh0 cwh0VarG4 = lf51.g(10.364f, 7.793f);
            cwh0VarG4.c(1.0f, 1.0f, false, true, 0.0f, 1.414f);
            cwh0VarG4.j(7.57f, 12.0f);
            cwh0VarG4.k(2.793f, 2.793f);
            cwh0VarG4.c(1.0f, 1.0f, false, true, -1.415f, 1.414f);
            cwh0VarG4.j(4.742f, 12.0f);
            cwh0VarG4.j(8.95f, 7.793f);
            cwh0VarG4.c(1.0f, 1.0f, false, true, 1.415f, 0.0f);
            cwh0VarG4.e();
            cwh0VarG4.l(13.637f, 7.793f);
            cwh0VarG4.c(1.0f, 1.0f, false, false, 0.0f, 1.414f);
            cwh0VarG4.j(16.43f, 12.0f);
            cwh0VarG4.k(-2.793f, 2.793f);
            cwh0VarG4.c(1.0f, 1.0f, false, false, 1.414f, 1.414f);
            cwh0VarG4.j(19.258f, 12.0f);
            cwh0VarG4.k(-4.207f, -4.207f);
            cwh0VarG4.c(1.0f, 1.0f, false, false, -1.414f, 0.0f);
            a180.a(a180Var2, cwh0VarG4.a, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            pap1.a = b180VarB2;
        }
        c = new ulx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new hlx((byte) 12);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ulx);
    }

    public final int hashCode() {
        return -48015166;
    }

    public final String toString() {
        return "Code";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
