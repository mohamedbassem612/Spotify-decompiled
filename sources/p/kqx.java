package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kqx extends hux {
    public static final Parcelable.Creator<kqx> CREATOR;
    public static final kqx c;

    static {
        b180 b180VarB = gto1.a;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.PlaybackSpeed1Point5x16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
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
            cwh0VarQ.l(8.493f, 8.1f);
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
            cwh0VarQ.m(2.952f, -0.2f);
            cwh0VarQ.o(0.59f, 0.27f, 1.34f, 0.27f);
            cwh0VarQ.o(0.77f, 0.0f, 1.34f, -0.34f);
            cwh0VarQ.s(0.87f, -0.92f);
            cwh0VarQ.o(0.3f, -0.59f, 0.3f, -1.31f);
            cwh0VarQ.o(0.0f, -0.69f, -0.28f, -1.2f);
            cwh0VarQ.c(2.0f, 2.0f, false, false, -0.77f, -0.8f);
            cwh0VarQ.c(2.2f, 2.2f, false, false, -1.11f, -0.28f);
            cwh0VarQ.o(-0.4f, 0.0f, -0.74f, 0.14f);
            cwh0VarQ.c(1.6f, 1.6f, false, false, -0.56f, 0.37f);
            cwh0VarQ.g(-0.084f, 0.088f, -0.203f, 0.263f, -0.203f, 0.263f);
            cwh0VarQ.k(0.186f, -1.863f);
            cwh0VarQ.i(3.107f);
            cwh0VarQ.u(0.9f);
            cwh0VarQ.i(-4.28f);
            cwh0VarQ.k(-0.4f, 4.2f);
            cwh0VarQ.i(1.41f);
            cwh0VarQ.o(0.13f, -0.27f, 0.4f, -0.45f);
            cwh0VarQ.o(0.28f, -0.18f, 0.66f, -0.18f);
            cwh0VarQ.o(0.33f, 0.0f, 0.58f, 0.16f);
            cwh0VarQ.o(0.26f, 0.15f, 0.4f, 0.43f);
            cwh0VarQ.o(0.14f, 0.27f, 0.14f, 0.62f);
            cwh0VarQ.o(0.0f, 0.36f, -0.14f, 0.64f);
            cwh0VarQ.o(-0.14f, 0.27f, -0.4f, 0.43f);
            cwh0VarQ.o(-0.25f, 0.15f, -0.58f, 0.15f);
            cwh0VarQ.c(1.24f, 1.24f, false, true, -0.58f, -0.13f);
            cwh0VarQ.c(1.0f, 1.0f, false, true, -0.39f, -0.38f);
            cwh0VarQ.c(1.2f, 1.2f, false, true, -0.16f, -0.55f);
            cwh0VarQ.i(-1.44f);
            cwh0VarQ.o(0.02f, 0.73f, 0.36f, 1.26f);
            cwh0VarQ.c(2.2f, 2.2f, false, false, 0.94f, 0.8f);
            cwh0VarQ.l(5.059f, 3.1f);
            cwh0VarQ.u(8.0f);
            cwh0VarQ.i(1.45f);
            cwh0VarQ.u(0.9f);
            cwh0VarQ.i(-1.26f);
            cwh0VarQ.o(-0.111f, 0.55f, -0.54f, 0.83f);
            cwh0VarQ.s(-1.37f, 0.34f);
            cwh0VarQ.u(3.1f);
            cwh0VarQ.e();
            a180.a(a180Var, cwh0VarQ.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            gto1.a = b180VarB;
        }
        b180 b180VarB2 = jto1.a;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.PlaybackSpeed1Point5x24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarQ2 = rjx.q(19.5f, 19.14f, 2.542f, -2.543f);
            cwh0VarQ2.k(-1.414f, -1.414f);
            cwh0VarQ2.k(-2.543f, 2.543f);
            cwh0VarQ2.k(-2.543f, -2.543f);
            cwh0VarQ2.k(-1.414f, 1.414f);
            cwh0VarQ2.k(2.543f, 2.543f);
            cwh0VarQ2.k(-2.543f, 2.543f);
            cwh0VarQ2.k(1.414f, 1.414f);
            cwh0VarQ2.k(2.543f, -2.543f);
            rjx.C(cwh0VarQ2, 2.543f, 2.543f, 1.414f, -1.414f);
            cwh0VarQ2.l(11.316f, 12.527f);
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
            cwh0VarQ2.c(1.4f, 1.4f, false, true, -0.672f, 0.16f);
            cwh0VarQ2.m(6.789f, 0.113f);
            cwh0VarQ2.o(-1.17f, 0.0f, -2.096f, -0.433f);
            cwh0VarQ2.c(3.47f, 3.47f, false, true, -1.473f, -1.264f);
            cwh0VarQ2.o(-0.543f, -0.832f, -0.575f, -1.984f);
            cwh0VarQ2.i(2.08f);
            cwh0VarQ2.o(0.03f, 0.544f, 0.271f, 0.96f);
            cwh0VarQ2.o(0.256f, 0.416f, 0.688f, 0.656f);
            cwh0VarQ2.o(0.433f, 0.225f, 1.009f, 0.224f);
            cwh0VarQ2.c(1.85f, 1.85f, false, false, 1.695f, -1.024f);
            cwh0VarQ2.o(0.24f, -0.48f, 0.24f, -1.104f);
            cwh0VarQ2.o(0.0f, -0.623f, -0.24f, -1.088f);
            cwh0VarQ2.c(1.7f, 1.7f, false, false, -0.688f, -0.736f);
            cwh0VarQ2.c(1.85f, 1.85f, false, false, -1.007f, -0.272f);
            cwh0VarQ2.o(-0.657f, 0.0f, -1.152f, 0.32f);
            cwh0VarQ2.o(-0.48f, 0.32f, -0.688f, 0.784f);
            cwh0VarQ2.i(-2.033f);
            cwh0VarQ2.k(0.64f, -6.672f);
            cwh0VarQ2.i(6.689f);
            cwh0VarQ2.v(1.92f);
            cwh0VarQ2.j(16.44f, 2.927f);
            cwh0VarQ2.k(-0.331f, 3.261f);
            cwh0VarQ2.o(0.134f, -0.253f, 0.363f, -0.493f);
            cwh0VarQ2.c(2.6f, 2.6f, false, true, 0.896f, -0.592f);
            cwh0VarQ2.o(0.561f, -0.24f, 1.2f, -0.24f);
            cwh0VarQ2.o(0.993f, 0.0f, 1.776f, 0.464f);
            cwh0VarQ2.o(0.801f, 0.449f, 1.248f, 1.28f);
            cwh0VarQ2.o(0.45f, 0.832f, 0.449f, 1.936f);
            cwh0VarQ2.o(0.0f, 1.152f, -0.48f, 2.08f);
            cwh0VarQ2.c(3.5f, 3.5f, false, true, -1.377f, 1.472f);
            cwh0VarQ2.o(-0.895f, 0.544f, -2.08f, 0.544f);
            hrt.o(cwh0VarQ2, 3.288f, 4.351f, 3.288f, 2.895f);
            cwh0VarQ2.o(1.488f, -0.096f, 2.16f, -0.544f);
            cwh0VarQ2.o(0.688f, -0.463f, 0.848f, -1.344f);
            rjx.w(cwh0VarQ2, 1.808f, 11.36f, 6.04f, 12.367f);
            cwh0VarQ2.j(6.04f, 4.351f);
            cwh0VarQ2.e();
            a180.a(a180Var2, cwh0VarQ2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            jto1.a = b180VarB2;
        }
        c = new kqx(new dsx(b180VarB, b180VarB2), null);
        CREATOR = new dqx((byte) 6);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof kqx);
    }

    public final int hashCode() {
        return -214415431;
    }

    public final String toString() {
        return "PlaybackSpeed1Point5x";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
