package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jkx extends hux {
    public static final Parcelable.Creator<jkx> CREATOR;
    public static final jkx c;
    public static final byte d;

    static {
        b180 b180VarB = p1p1.a;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.ArrowRight16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, true, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(7.19f, 1.0f);
            cwh0VarG.b(0.749f, 0.749f, false, true, 8.47f, 0.47f);
            cwh0VarG.j(16.0f, 7.99f);
            cwh0VarG.k(-7.53f, 7.521f);
            cwh0VarG.c(0.75f, 0.75f, false, true, -1.234f, -0.815f);
            cwh0VarG.c(0.8f, 0.8f, false, true, 0.174f, -0.243f);
            cwh0VarG.k(5.72f, -5.714f);
            cwh0VarG.h(0.75f);
            cwh0VarG.c(0.75f, 0.75f, true, true, 0.0f, -1.498f);
            cwh0VarG.i(12.38f);
            cwh0VarG.j(7.41f, 1.529f);
            cwh0VarG.c(0.75f, 0.75f, false, true, -0.22f, -0.53f);
            cwh0VarG.e();
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            p1p1.a = b180VarB;
        }
        b180 b180VarB2 = r1p1.a;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.ArrowRight24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(10.586f, 3.5f);
            cwh0VarG2.c(0.999f, 0.999f, false, true, 1.707f, -0.707f);
            cwh0VarG2.k(9.207f, 9.2f);
            cwh0VarG2.k(-9.207f, 9.202f);
            cwh0VarG2.c(1.0f, 1.0f, true, true, -1.414f, -1.413f);
            cwh0VarG2.j(17.665f, 13.0f);
            cwh0VarG2.h(3.5f);
            cwh0VarG2.c(1.0f, 1.0f, true, true, 0.0f, -2.0f);
            cwh0VarG2.i(14.178f);
            cwh0VarG2.k(-6.799f, -6.794f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, -0.293f, -0.707f);
            cwh0VarG2.e();
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            r1p1.a = b180VarB2;
        }
        c = new jkx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new ckx((byte) 6);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof jkx);
    }

    public final int hashCode() {
        return -183962968;
    }

    public final String toString() {
        return "ArrowRight";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
