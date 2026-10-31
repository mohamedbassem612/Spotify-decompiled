package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class uqx extends hux {
    public static final Parcelable.Creator<uqx> CREATOR;
    public static final uqx c;

    static {
        b180 b180VarB = two1.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.PlaybackSpeed2Point5x16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
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
            cwh0VarQ.l(1.98f, 6.8f);
            cwh0VarQ.o(-0.2f, 0.54f, -0.18f, 1.2f);
            cwh0VarQ.i(4.97f);
            cwh0VarQ.u(6.67f);
            cwh0VarQ.h(3.788f);
            cwh0VarQ.o(0.05f, -0.086f, 0.112f, -0.17f);
            cwh0VarQ.c(2.3f, 2.3f, false, true, 0.38f, -0.39f);
            cwh0VarQ.o(0.24f, -0.2f, 0.61f, -0.47f);
            cwh0VarQ.b(8.7f, 8.7f, false, false, 6.0f, 4.71f);
            cwh0VarQ.o(0.42f, -0.44f, 0.61f, -0.87f);
            cwh0VarQ.o(0.19f, -0.44f, 0.19f, -0.93f);
            cwh0VarQ.c(2.1f, 2.1f, false, false, -0.28f, -1.07f);
            cwh0VarQ.c(1.97f, 1.97f, false, false, -0.83f, -0.8f);
            cwh0VarQ.n(5.14f, 0.73f, 4.35f, 0.73f);
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
            cwh0VarQ.m(10.805f, 1.37f);
            cwh0VarQ.o(-0.75f, 0.0f, -1.34f, -0.27f);
            cwh0VarQ.c(2.2f, 2.2f, false, true, -0.94f, -0.8f);
            cwh0VarQ.o(-0.34f, -0.53f, -0.36f, -1.26f);
            cwh0VarQ.i(1.44f);
            cwh0VarQ.o(0.02f, 0.31f, 0.16f, 0.55f);
            cwh0VarQ.s(0.39f, 0.38f);
            cwh0VarQ.o(0.25f, 0.13f, 0.58f, 0.13f);
            cwh0VarQ.s(0.58f, -0.15f);
            cwh0VarQ.o(0.26f, -0.16f, 0.4f, -0.43f);
            cwh0VarQ.o(0.14f, -0.28f, 0.14f, -0.64f);
            cwh0VarQ.o(0.0f, -0.35f, -0.14f, -0.62f);
            cwh0VarQ.c(1.0f, 1.0f, false, false, -0.4f, -0.43f);
            cwh0VarQ.c(1.05f, 1.05f, false, false, -0.58f, -0.16f);
            cwh0VarQ.o(-0.38f, 0.0f, -0.66f, 0.18f);
            cwh0VarQ.o(-0.27f, 0.18f, -0.4f, 0.45f);
            cwh0VarQ.i(-1.41f);
            cwh0VarQ.k(0.4f, -4.2f);
            cwh0VarQ.i(4.28f);
            cwh0VarQ.v(1.33f);
            cwh0VarQ.i(-3.107f);
            cwh0VarQ.k(-0.186f, 1.863f);
            cwh0VarQ.c(1.4f, 1.4f, false, true, 0.203f, -0.263f);
            cwh0VarQ.c(1.6f, 1.6f, false, true, 0.56f, -0.37f);
            cwh0VarQ.o(0.34f, -0.14f, 0.74f, -0.14f);
            cwh0VarQ.o(0.62f, 0.0f, 1.11f, 0.28f);
            cwh0VarQ.s(0.77f, 0.8f);
            cwh0VarQ.o(0.28f, 0.51f, 0.28f, 1.2f);
            cwh0VarQ.o(0.0f, 0.72f, -0.3f, 1.31f);
            cwh0VarQ.o(-0.3f, 0.58f, -0.87f, 0.92f);
            cwh0VarQ.s(-1.34f, 0.34f);
            a180.a(a180Var, cwh0VarQ.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            two1.b = b180VarB;
        }
        b180 b180VarB2 = uwo1.a;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.PlaybackSpeed2Point5x24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
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
            cwh0VarQ2.l(11.636f, 12.527f);
            cwh0VarQ2.c(1.5f, 1.5f, false, true, -0.688f, -0.16f);
            cwh0VarQ2.c(1.44f, 1.44f, false, true, -0.512f, -0.464f);
            cwh0VarQ2.c(1.3f, 1.3f, false, true, -0.176f, -0.672f);
            cwh0VarQ2.o(0.0f, -0.352f, 0.176f, -0.64f);
            cwh0VarQ2.o(0.191f, -0.288f, 0.512f, -0.448f);
            cwh0VarQ2.c(1.4f, 1.4f, false, true, 1.36f, 0.0f);
            cwh0VarQ2.o(0.303f, 0.16f, 0.48f, 0.448f);
            cwh0VarQ2.o(0.192f, 0.288f, 0.192f, 0.64f);
            cwh0VarQ2.s(-0.192f, 0.656f);
            cwh0VarQ2.c(1.3f, 1.3f, false, true, -0.48f, 0.48f);
            cwh0VarQ2.o(-0.304f, 0.16f, -0.672f, 0.16f);
            cwh0VarQ2.m(-9.943f, -2.016f);
            cwh0VarQ2.o(-0.32f, 0.833f, -0.288f, 1.856f);
            rjx.w(cwh0VarQ2, 7.776f, -1.92f, 4.23f, 10.447f);
            cwh0VarQ2.o(0.099f, -0.194f, 0.231f, -0.384f);
            cwh0VarQ2.o(0.24f, -0.32f, 0.64f, -0.672f);
            cwh0VarQ2.o(0.4f, -0.351f, 1.04f, -0.8f);
            cwh0VarQ2.o(1.12f, -0.8f, 1.792f, -1.504f);
            cwh0VarQ2.o(0.672f, -0.703f, 0.976f, -1.392f);
            cwh0VarQ2.o(0.304f, -0.703f, 0.304f, -1.504f);
            cwh0VarQ2.o(0.0f, -0.912f, -0.432f, -1.696f);
            cwh0VarQ2.o(-0.416f, -0.783f, -1.296f, -1.264f);
            cwh0VarQ2.n(6.621f, 0.735f, 5.39f, 0.735f);
            cwh0VarQ2.o(-1.264f, 0.0f, -2.16f, 0.528f);
            cwh0VarQ2.c(3.4f, 3.4f, false, false, -1.376f, 1.488f);
            cwh0VarQ2.o(-0.465f, 0.976f, -0.464f, 2.32f);
            cwh0VarQ2.i(2.096f);
            cwh0VarQ2.o(0.0f, -0.784f, 0.208f, -1.312f);
            cwh0VarQ2.o(0.209f, -0.543f, 0.624f, -0.8f);
            cwh0VarQ2.o(0.416f, -0.272f, 1.024f, -0.272f);
            cwh0VarQ2.o(0.576f, 0.0f, 0.944f, 0.208f);
            cwh0VarQ2.o(0.384f, 0.209f, 0.56f, 0.576f);
            cwh0VarQ2.o(0.176f, 0.369f, 0.176f, 0.832f);
            cwh0VarQ2.o(0.0f, 0.497f, -0.224f, 0.944f);
            cwh0VarQ2.o(-0.225f, 0.432f, -0.72f, 0.912f);
            cwh0VarQ2.b(11.5f, 11.5f, false, true, 4.75f, 7.231f);
            cwh0VarQ2.o(-1.248f, 0.864f, -1.984f, 1.648f);
            cwh0VarQ2.o(-0.735f, 0.784f, -1.072f, 1.632f);
            cwh0VarQ2.e();
            cwh0VarQ2.l(18.105f, 12.64f);
            cwh0VarQ2.o(-1.17f, 0.0f, -2.096f, -0.433f);
            cwh0VarQ2.c(3.47f, 3.47f, false, true, -1.473f, -1.264f);
            cwh0VarQ2.o(-0.543f, -0.832f, -0.575f, -1.984f);
            cwh0VarQ2.i(2.08f);
            cwh0VarQ2.o(0.03f, 0.544f, 0.271f, 0.96f);
            cwh0VarQ2.o(0.256f, 0.416f, 0.688f, 0.656f);
            cwh0VarQ2.o(0.432f, 0.225f, 1.009f, 0.224f);
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
            cwh0VarQ2.e();
            a180.a(a180Var2, cwh0VarQ2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            uwo1.a = b180VarB2;
        }
        c = new uqx(new dsx(b180VarB, b180VarB2), null);
        CREATOR = new dqx((byte) 16);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof uqx);
    }

    public final int hashCode() {
        return 1528394904;
    }

    public final String toString() {
        return "PlaybackSpeed2Point5x";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
