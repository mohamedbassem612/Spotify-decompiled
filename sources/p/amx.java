package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class amx extends hux {
    public static final Parcelable.Creator<amx> CREATOR;
    public static final amx c;
    public static final byte d;

    static {
        b180 b180VarB = zod.d;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.CopyAlt16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            long j = u7h.b;
            n6a1 n6a1Var = new n6a1(j);
            cwh0 cwh0VarG = lf51.g(5.0f, 0.75f);
            cwh0VarG.b(0.75f, 0.75f, false, true, 5.75f, 0.0f);
            cwh0VarG.i(9.5f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.75f, 0.75f);
            cwh0VarG.v(10.5f);
            cwh0VarG.c(0.75f, 0.75f, false, true, -0.75f, 0.75f);
            cwh0VarG.h(12.0f);
            cwh0VarG.v(-1.5f);
            cwh0VarG.i(2.5f);
            cwh0VarG.v(-9.0f);
            cwh0VarG.i(-8.0f);
            cwh0VarG.u(3.0f);
            cwh0VarG.h(5.0f);
            cwh0VarG.e();
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            n6a1 n6a1Var2 = new n6a1(j);
            cwh0 cwh0VarG2 = lf51.g(0.75f, 4.0f);
            cwh0VarG2.c(0.75f, 0.75f, false, false, -0.75f, 0.75f);
            cwh0VarG2.v(10.5f);
            cwh0VarG2.g(0.0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f);
            cwh0VarG2.i(9.5f);
            cwh0VarG2.c(0.75f, 0.75f, false, false, 0.75f, -0.75f);
            cwh0VarG2.j(11.0f, 4.75f);
            cwh0VarG2.c(0.75f, 0.75f, false, false, -0.75f, -0.75f);
            hrt.u(cwh0VarG2, 1.5f, 14.5f, -9.0f, 8.0f);
            cwh0VarG2.v(9.0f);
            cwh0VarG2.e();
            a180.a(a180Var, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            zod.d = b180VarB;
        }
        b180 b180VarB2 = c8o.f;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.CopyAlt24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            long j2 = u7h.b;
            n6a1 n6a1Var3 = new n6a1(j2);
            cwh0 cwh0VarG3 = lf51.g(8.0f, 2.0f);
            cwh0VarG3.c(2.0f, 2.0f, false, true, 2.0f, -2.0f);
            cwh0VarG3.i(11.0f);
            cwh0VarG3.c(2.0f, 2.0f, false, true, 2.0f, 2.0f);
            cwh0VarG3.v(13.0f);
            cwh0VarG3.c(2.0f, 2.0f, false, true, -2.0f, 2.0f);
            cwh0VarG3.i(-3.0f);
            cwh0VarG3.v(-2.0f);
            cwh0VarG3.i(3.0f);
            cwh0VarG3.u(2.0f);
            cwh0VarG3.h(10.0f);
            cwh0VarG3.v(1.0f);
            cwh0VarG3.h(8.0f);
            cwh0VarG3.e();
            a180.a(a180Var2, cwh0VarG3.a, n6a1Var3, 1.0f, 2, 1.0f);
            n6a1 n6a1Var4 = new n6a1(j2);
            cwh0 cwh0VarG4 = lf51.g(3.0f, 5.0f);
            cwh0VarG4.c(2.0f, 2.0f, false, false, -2.0f, 2.0f);
            cwh0VarG4.v(13.0f);
            cwh0VarG4.c(2.0f, 2.0f, false, false, 2.0f, 2.0f);
            cwh0VarG4.i(11.0f);
            cwh0VarG4.c(2.0f, 2.0f, false, false, 2.0f, -2.0f);
            cwh0VarG4.j(16.0f, 7.0f);
            cwh0VarG4.c(2.0f, 2.0f, false, false, -2.0f, -2.0f);
            cwh0VarG4.e();
            cwh0VarG4.l(3.0f, 7.0f);
            cwh0VarG4.i(11.0f);
            cwh0VarG4.v(13.0f);
            cwh0VarG4.j(3.0f, 20.0f);
            cwh0VarG4.e();
            a180.a(a180Var2, cwh0VarG4.a, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            c8o.f = b180VarB2;
        }
        c = new amx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new hlx((byte) 18);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof amx);
    }

    public final int hashCode() {
        return -183956737;
    }

    public final String toString() {
        return "CopyAlt";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
