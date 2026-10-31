package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jqx extends hux {
    public static final Parcelable.Creator<jqx> CREATOR;
    public static final jqx c;

    static {
        b180 b180VarB = zso1.a;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.PlaybackSpeed1Point4x16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarQ = rjx.q(13.34f, 12.5f, 1.969f, -1.97f);
            cwh0VarQ.k(-1.06f, -1.06f);
            cwh0VarQ.k(-1.97f, 1.97f);
            cwh0VarQ.k(-1.97f, -1.97f);
            cwh0VarQ.k(-1.06f, 1.06f);
            cwh0VarQ.k(1.969f, 1.97f);
            cwh0VarQ.k(-1.97f, 1.97f);
            cwh0VarQ.k(1.06f, 1.06f);
            cwh0VarQ.k(1.97f, -1.97f);
            cwh0VarQ.k(1.97f, 1.97f);
            rjx.C(cwh0VarQ, 1.06f, -1.06f, -1.969f, -1.97f);
            cwh0VarQ.l(12.827f, 6.55f);
            cwh0VarQ.i(-3.26f);
            cwh0VarQ.j(9.567f, 5.22f);
            cwh0VarQ.k(2.9f, -4.32f);
            cwh0VarQ.i(1.7f);
            cwh0VarQ.k(-2.964f, 4.38f);
            cwh0VarQ.i(1.624f);
            rjx.B(cwh0VarQ, 12.827f, 3.76f, 1.45f, 1.52f);
            cwh0VarQ.i(1.02f);
            cwh0VarQ.v(1.27f);
            cwh0VarQ.i(-1.02f);
            rjx.r(cwh0VarQ, 14.277f, 8.0f, -1.45f);
            cwh0VarQ.l(7.995f, 8.1f);
            cwh0VarQ.c(1.0f, 1.0f, false, true, -0.46f, -0.11f);
            cwh0VarQ.c(1.0f, 1.0f, false, true, -0.34f, -0.31f);
            cwh0VarQ.c(0.84f, 0.84f, false, true, -0.12f, -0.44f);
            cwh0VarQ.o(0.0f, -0.24f, 0.12f, -0.43f);
            cwh0VarQ.c(0.9f, 0.9f, false, true, 0.34f, -0.3f);
            cwh0VarQ.c(0.9f, 0.9f, false, true, 0.46f, -0.12f);
            cwh0VarQ.o(0.25f, 0.0f, 0.46f, 0.12f);
            cwh0VarQ.c(0.84f, 0.84f, false, true, 0.33f, 0.3f);
            cwh0VarQ.o(0.12f, 0.19f, 0.12f, 0.43f);
            cwh0VarQ.o(0.0f, 0.23f, -0.12f, 0.43f);
            cwh0VarQ.c(0.9f, 0.9f, false, true, -0.33f, 0.32f);
            cwh0VarQ.c(1.0f, 1.0f, false, true, -0.46f, 0.11f);
            cwh0VarQ.m(-3.435f, -5.0f);
            cwh0VarQ.j(2.84f, 3.1f);
            cwh0VarQ.j(2.84f, 2.07f);
            cwh0VarQ.o(0.94f, -0.06f, 1.37f, -0.34f);
            cwh0VarQ.r(4.75f, 0.9f);
            cwh0VarQ.i(1.26f);
            ydh.k(cwh0VarQ, 6.01f, 8.0f, 4.56f, 8.0f);
            a180.a(a180Var, cwh0VarQ.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            zso1.a = b180VarB;
        }
        b180 b180VarB2 = cto1.a;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.PlaybackSpeed1Point4x24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(11.243f, 12.527f);
            cwh0VarG.c(1.5f, 1.5f, false, true, -0.688f, -0.16f);
            cwh0VarG.c(1.4f, 1.4f, false, true, -0.512f, -0.464f);
            cwh0VarG.c(1.3f, 1.3f, false, true, -0.176f, -0.672f);
            cwh0VarG.o(0.0f, -0.352f, 0.176f, -0.64f);
            cwh0VarG.o(0.191f, -0.288f, 0.512f, -0.448f);
            cwh0VarG.c(1.4f, 1.4f, false, true, 1.36f, 0.0f);
            cwh0VarG.o(0.303f, 0.16f, 0.48f, 0.448f);
            cwh0VarG.o(0.192f, 0.288f, 0.192f, 0.64f);
            cwh0VarG.s(-0.192f, 0.656f);
            cwh0VarG.c(1.3f, 1.3f, false, true, -0.48f, 0.48f);
            cwh0VarG.c(1.4f, 1.4f, false, true, -0.672f, 0.16f);
            cwh0VarG.m(8.261f, 6.613f);
            cwh0VarG.k(2.543f, -2.543f);
            cwh0VarG.k(-1.414f, -1.414f);
            cwh0VarG.k(-2.543f, 2.543f);
            cwh0VarG.k(-2.543f, -2.543f);
            cwh0VarG.k(-1.414f, 1.414f);
            cwh0VarG.k(2.543f, 2.543f);
            cwh0VarG.k(-2.543f, 2.543f);
            cwh0VarG.k(1.414f, 1.414f);
            cwh0VarG.k(2.543f, -2.543f);
            rjx.C(cwh0VarG, 2.543f, 2.543f, 1.414f, -1.414f);
            rjx.z(cwh0VarG, 18.82f, 9.935f, -5.232f, -1.92f);
            cwh0VarG.k(4.752f, -7.008f);
            cwh0VarG.i(2.464f);
            cwh0VarG.k(-4.872f, 7.088f);
            cwh0VarG.i(2.888f);
            rjx.B(cwh0VarG, 18.82f, 5.503f, 2.08f, 2.592f);
            rjx.w(cwh0VarG, 1.648f, 1.84f, 20.9f, 9.935f);
            cwh0VarG.v(2.432f);
            cwh0VarG.i(-2.08f);
            cwh0VarG.e();
            cwh0VarG.l(3.215f, 4.351f);
            cwh0VarG.j(3.215f, 2.895f);
            cwh0VarG.o(1.488f, -0.096f, 2.16f, -0.544f);
            cwh0VarG.o(0.688f, -0.463f, 0.848f, -1.344f);
            rjx.w(cwh0VarG, 1.808f, 11.36f, 5.967f, 12.367f);
            cwh0VarG.j(5.967f, 4.351f);
            cwh0VarG.e();
            a180.a(a180Var2, cwh0VarG.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            cto1.a = b180VarB2;
        }
        c = new jqx(new dsx(b180VarB, b180VarB2), null);
        CREATOR = new dqx((byte) 5);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof jqx);
    }

    public final int hashCode() {
        return -214415462;
    }

    public final String toString() {
        return "PlaybackSpeed1Point4x";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
