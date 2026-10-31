package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tqx extends hux {
    public static final Parcelable.Creator<tqx> CREATOR;
    public static final tqx c;

    static {
        b180 b180VarB = pwo1.a;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.PlaybackSpeed2Point4x16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
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
            cwh0VarQ.l(1.482f, 6.8f);
            cwh0VarQ.o(-0.2f, 0.54f, -0.18f, 1.2f);
            cwh0VarQ.i(4.97f);
            cwh0VarQ.u(6.67f);
            cwh0VarQ.h(3.29f);
            cwh0VarQ.o(0.05f, -0.086f, 0.112f, -0.17f);
            cwh0VarQ.c(2.3f, 2.3f, false, true, 0.38f, -0.39f);
            cwh0VarQ.o(0.24f, -0.2f, 0.61f, -0.47f);
            cwh0VarQ.c(8.7f, 8.7f, false, false, 1.11f, -0.93f);
            cwh0VarQ.o(0.42f, -0.44f, 0.61f, -0.87f);
            cwh0VarQ.o(0.19f, -0.44f, 0.19f, -0.93f);
            cwh0VarQ.c(2.1f, 2.1f, false, false, -0.28f, -1.07f);
            cwh0VarQ.c(1.97f, 1.97f, false, false, -0.83f, -0.8f);
            cwh0VarQ.o(-0.55f, -0.31f, -1.34f, -0.31f);
            cwh0VarQ.o(-0.8f, 0.0f, -1.38f, 0.33f);
            cwh0VarQ.o(-0.58f, 0.32f, -0.88f, 0.94f);
            cwh0VarQ.o(-0.29f, 0.61f, -0.29f, 1.47f);
            cwh0VarQ.i(1.45f);
            cwh0VarQ.o(0.0f, -0.46f, 0.12f, -0.77f);
            cwh0VarQ.o(0.12f, -0.32f, 0.36f, -0.47f);
            cwh0VarQ.o(0.24f, -0.16f, 0.58f, -0.16f);
            cwh0VarQ.s(0.55f, 0.12f);
            cwh0VarQ.s(0.31f, 0.33f);
            cwh0VarQ.g(0.1f, 0.21f, 0.1f, 0.3f, 0.1f, 0.48f);
            cwh0VarQ.o(0.0f, 0.29f, -0.14f, 0.55f);
            cwh0VarQ.o(-0.13f, 0.25f, -0.43f, 0.54f);
            cwh0VarQ.c(7.0f, 7.0f, false, true, -0.78f, 0.63f);
            cwh0VarQ.o(-0.79f, 0.54f, -1.26f, 1.04f);
            cwh0VarQ.c(3.3f, 3.3f, false, false, -0.68f, 1.04f);
            cwh0VarQ.m(11.345f, -0.25f);
            cwh0VarQ.i(-3.26f);
            cwh0VarQ.u(5.22f);
            cwh0VarQ.k(2.9f, -4.32f);
            cwh0VarQ.i(1.7f);
            cwh0VarQ.k(-2.964f, 4.38f);
            cwh0VarQ.i(1.624f);
            cwh0VarQ.u(3.76f);
            cwh0VarQ.i(1.45f);
            cwh0VarQ.v(1.52f);
            cwh0VarQ.i(1.02f);
            cwh0VarQ.v(1.27f);
            cwh0VarQ.i(-1.02f);
            cwh0VarQ.u(8.0f);
            cwh0VarQ.i(-1.45f);
            cwh0VarQ.e();
            a180.a(a180Var, cwh0VarQ.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            pwo1.a = b180VarB;
        }
        b180 b180VarB2 = rwo1.a;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.PlaybackSpeed2Point4x24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarQ2 = rjx.q(19.5f, 19.14f, 2.542f, 2.543f);
            cwh0VarQ2.k(-1.414f, 1.414f);
            cwh0VarQ2.k(-2.543f, -2.543f);
            cwh0VarQ2.k(-2.543f, 2.543f);
            cwh0VarQ2.k(-1.414f, -1.414f);
            cwh0VarQ2.k(2.543f, -2.543f);
            cwh0VarQ2.k(-2.543f, -2.543f);
            cwh0VarQ2.k(1.414f, -1.414f);
            cwh0VarQ2.k(2.543f, 2.543f);
            rjx.C(cwh0VarQ2, 2.543f, -2.543f, 1.414f, 1.414f);
            cwh0VarQ2.l(11.063f, 12.527f);
            cwh0VarQ2.c(1.5f, 1.5f, false, true, -0.688f, -0.16f);
            cwh0VarQ2.c(1.4f, 1.4f, false, true, -0.512f, -0.464f);
            cwh0VarQ2.c(1.3f, 1.3f, false, true, -0.176f, -0.672f);
            cwh0VarQ2.o(0.0f, -0.352f, 0.176f, -0.64f);
            cwh0VarQ2.o(0.191f, -0.288f, 0.512f, -0.448f);
            cwh0VarQ2.c(1.4f, 1.4f, false, true, 1.36f, 0.0f);
            cwh0VarQ2.o(0.303f, 0.16f, 0.48f, 0.448f);
            cwh0VarQ2.o(0.192f, 0.288f, 0.192f, 0.64f);
            cwh0VarQ2.s(-0.192f, 0.656f);
            cwh0VarQ2.c(1.3f, 1.3f, false, true, -0.48f, 0.48f);
            cwh0VarQ2.o(-0.304f, 0.16f, -0.672f, 0.16f);
            cwh0VarQ2.m(2.025f, -2.592f);
            cwh0VarQ2.i(5.232f);
            cwh0VarQ2.v(2.432f);
            rjx.s(cwh0VarQ2, 2.08f, 20.4f, 9.935f, 1.648f);
            cwh0VarQ2.v(-1.84f);
            cwh0VarQ2.j(20.4f, 8.095f);
            rjx.B(cwh0VarQ2, 20.4f, 5.503f, -2.08f, 2.592f);
            cwh0VarQ2.i(-2.888f);
            cwh0VarQ2.k(4.872f, -7.088f);
            cwh0VarQ2.j(17.84f, 1.007f);
            cwh0VarQ2.k(-4.752f, 7.008f);
            cwh0VarQ2.e();
            cwh0VarQ2.l(0.832f, 12.367f);
            cwh0VarQ2.o(-0.032f, -1.023f, 0.288f, -1.856f);
            cwh0VarQ2.o(0.336f, -0.847f, 1.072f, -1.632f);
            cwh0VarQ2.s(1.984f, -1.648f);
            cwh0VarQ2.o(0.832f, -0.592f, 1.328f, -1.072f);
            cwh0VarQ2.o(0.495f, -0.48f, 0.72f, -0.912f);
            cwh0VarQ2.o(0.225f, -0.447f, 0.224f, -0.944f);
            cwh0VarQ2.o(0.0f, -0.463f, -0.176f, -0.832f);
            cwh0VarQ2.c(1.27f, 1.27f, false, false, -0.56f, -0.576f);
            cwh0VarQ2.o(-0.368f, -0.207f, -0.944f, -0.208f);
            cwh0VarQ2.o(-0.608f, 0.0f, -1.024f, 0.272f);
            cwh0VarQ2.o(-0.416f, 0.257f, -0.624f, 0.8f);
            cwh0VarQ2.o(-0.208f, 0.529f, -0.208f, 1.312f);
            cwh0VarQ2.j(0.816f, 5.071f);
            cwh0VarQ2.o(0.0f, -1.344f, 0.464f, -2.32f);
            cwh0VarQ2.o(0.48f, -0.975f, 1.376f, -1.488f);
            cwh0VarQ2.o(0.896f, -0.528f, 2.16f, -0.528f);
            cwh0VarQ2.o(1.233f, 0.0f, 2.096f, 0.496f);
            cwh0VarQ2.o(0.88f, 0.48f, 1.296f, 1.264f);
            cwh0VarQ2.o(0.432f, 0.784f, 0.432f, 1.696f);
            cwh0VarQ2.o(0.0f, 0.8f, -0.304f, 1.504f);
            cwh0VarQ2.o(-0.304f, 0.688f, -0.976f, 1.392f);
            cwh0VarQ2.o(-0.672f, 0.705f, -1.792f, 1.504f);
            cwh0VarQ2.c(13.0f, 13.0f, false, false, -1.04f, 0.8f);
            cwh0VarQ2.o(-0.4f, 0.352f, -0.64f, 0.672f);
            cwh0VarQ2.c(3.0f, 3.0f, false, false, -0.231f, 0.384f);
            cwh0VarQ2.i(4.951f);
            cwh0VarQ2.v(1.92f);
            cwh0VarQ2.e();
            a180.a(a180Var2, cwh0VarQ2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            rwo1.a = b180VarB2;
        }
        c = new tqx(new dsx(b180VarB, b180VarB2), null);
        CREATOR = new dqx((byte) 15);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof tqx);
    }

    public final int hashCode() {
        return 1528394873;
    }

    public final String toString() {
        return "PlaybackSpeed2Point4x";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
