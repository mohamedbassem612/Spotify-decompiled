package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fqx extends hux {
    public static final Parcelable.Creator<fqx> CREATOR;
    public static final fqx c;

    static {
        b180 b180VarB = pro1.a;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.PlaybackSpeed0Point9x16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
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
            cwh0VarQ.l(12.167f, 8.17f);
            cwh0VarQ.o(-0.519f, 0.0f, -1.02f, -0.17f);
            cwh0VarQ.c(2.6f, 2.6f, false, true, -0.84f, -0.43f);
            cwh0VarQ.j(10.307f, 6.0f);
            cwh0VarQ.o(0.27f, 0.36f, 0.77f, 0.59f);
            cwh0VarQ.o(0.51f, 0.22f, 0.98f, 0.22f);
            cwh0VarQ.o(0.59f, 0.0f, 0.98f, -0.27f);
            cwh0VarQ.o(0.4f, -0.28f, 0.59f, -0.81f);
            cwh0VarQ.g(0.108f, -0.3f, 0.179f, -1.062f, 0.179f, -1.062f);
            cwh0VarQ.q(-0.127f, 0.224f, -0.219f, 0.332f);
            cwh0VarQ.o(-0.23f, 0.27f, -0.59f, 0.44f);
            cwh0VarQ.s(-0.81f, 0.17f);
            cwh0VarQ.o(-0.71f, 0.0f, -1.23f, -0.3f);
            cwh0VarQ.c(2.0f, 2.0f, false, true, -0.79f, -0.82f);
            cwh0VarQ.o(-0.27f, -0.53f, -0.27f, -1.19f);
            cwh0VarQ.s(0.3f, -1.25f);
            cwh0VarQ.s(0.88f, -0.95f);
            cwh0VarQ.o(0.58f, -0.37f, 1.38f, -0.37f);
            cwh0VarQ.o(0.62f, 0.0f, 1.1f, 0.19f);
            cwh0VarQ.o(0.49f, 0.18f, 0.85f, 0.55f);
            cwh0VarQ.o(0.43f, 0.44f, 0.66f, 1.13f);
            cwh0VarQ.s(0.23f, 1.55f);
            cwh0VarQ.o(0.0f, 1.22f, -0.36f, 2.13f);
            cwh0VarQ.o(-0.36f, 0.9f, -1.06f, 1.4f);
            cwh0VarQ.o(-0.699f, 0.49f, -1.71f, 0.49f);
            cwh0VarQ.m(0.37f, -3.72f);
            cwh0VarQ.o(0.36f, 0.0f, 0.62f, -0.15f);
            cwh0VarQ.o(0.27f, -0.16f, 0.41f, -0.43f);
            cwh0VarQ.o(0.14f, -0.28f, 0.14f, -0.61f);
            cwh0VarQ.c(1.4f, 1.4f, false, false, -0.14f, -0.63f);
            cwh0VarQ.c(1.04f, 1.04f, false, false, -0.41f, -0.44f);
            cwh0VarQ.c(1.1f, 1.1f, false, false, -0.62f, -0.17f);
            cwh0VarQ.o(-0.37f, 0.0f, -0.64f, 0.16f);
            cwh0VarQ.c(1.0f, 1.0f, false, false, -0.4f, 0.44f);
            cwh0VarQ.o(-0.13f, 0.28f, -0.13f, 0.64f);
            cwh0VarQ.o(0.0f, 0.34f, 0.13f, 0.61f);
            cwh0VarQ.o(0.14f, 0.27f, 0.4f, 0.43f);
            cwh0VarQ.o(0.27f, 0.15f, 0.64f, 0.15f);
            cwh0VarQ.l(8.275f, 8.1f);
            cwh0VarQ.c(1.0f, 1.0f, false, true, -0.46f, -0.11f);
            cwh0VarQ.c(1.0f, 1.0f, false, true, -0.34f, -0.31f);
            cwh0VarQ.c(0.84f, 0.84f, false, true, -0.12f, -0.44f);
            cwh0VarQ.o(0.0f, -0.24f, 0.12f, -0.43f);
            cwh0VarQ.c(0.9f, 0.9f, false, true, 0.34f, -0.3f);
            cwh0VarQ.o(0.21f, -0.12f, 0.46f, -0.12f);
            cwh0VarQ.s(0.46f, 0.12f);
            cwh0VarQ.c(0.84f, 0.84f, false, true, 0.33f, 0.3f);
            cwh0VarQ.o(0.12f, 0.19f, 0.12f, 0.43f);
            cwh0VarQ.o(0.0f, 0.23f, -0.12f, 0.43f);
            cwh0VarQ.c(0.9f, 0.9f, false, true, -0.33f, 0.32f);
            cwh0VarQ.c(1.0f, 1.0f, false, true, -0.46f, 0.11f);
            cwh0VarQ.m(-4.338f, 0.07f);
            cwh0VarQ.o(-0.95f, 0.0f, -1.61f, -0.48f);
            cwh0VarQ.s(-0.99f, -1.32f);
            cwh0VarQ.s(-0.33f, -1.92f);
            cwh0VarQ.g(0.0f, -1.08f, 0.11f, -1.36f, 0.33f, -1.92f);
            cwh0VarQ.o(0.33f, -0.84f, 0.99f, -1.32f);
            cwh0VarQ.s(1.61f, -0.48f);
            cwh0VarQ.o(0.94f, 0.0f, 1.6f, 0.48f);
            cwh0VarQ.s(0.99f, 1.33f);
            cwh0VarQ.o(0.34f, 0.84f, 0.34f, 1.91f);
            cwh0VarQ.s(-0.34f, 1.92f);
            cwh0VarQ.o(-0.33f, 0.84f, -0.99f, 1.32f);
            cwh0VarQ.s(-1.6f, 0.48f);
            cwh0VarQ.m(0.0f, -1.39f);
            cwh0VarQ.o(0.45f, 0.0f, 0.76f, -0.27f);
            cwh0VarQ.s(0.46f, -0.79f);
            cwh0VarQ.s(0.15f, -1.28f);
            cwh0VarQ.o(0.0f, -0.75f, -0.15f, -1.26f);
            cwh0VarQ.o(-0.15f, -0.52f, -0.46f, -0.79f);
            cwh0VarQ.s(-0.76f, -0.27f);
            cwh0VarQ.o(-0.46f, 0.0f, -0.77f, 0.27f);
            cwh0VarQ.o(-0.3f, 0.27f, -0.46f, 0.79f);
            cwh0VarQ.o(-0.15f, 0.51f, -0.15f, 1.26f);
            cwh0VarQ.o(0.0f, 0.76f, 0.15f, 1.28f);
            cwh0VarQ.o(0.16f, 0.52f, 0.46f, 0.79f);
            cwh0VarQ.o(0.31f, 0.27f, 0.77f, 0.27f);
            a180.a(a180Var, cwh0VarQ.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            pro1.a = b180VarB;
        }
        b180 b180VarB2 = qro1.a;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.PlaybackSpeed0Point9x24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
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
            cwh0VarQ2.l(17.15f, 12.64f);
            cwh0VarQ2.c(4.9f, 4.9f, false, true, -1.6f, -0.273f);
            cwh0VarQ2.o(-0.784f, -0.272f, -1.312f, -0.704f);
            cwh0VarQ2.v(-2.32f);
            cwh0VarQ2.o(0.432f, 0.592f, 1.232f, 0.96f);
            cwh0VarQ2.o(0.8f, 0.369f, 1.552f, 0.368f);
            cwh0VarQ2.o(0.945f, 0.0f, 1.6f, -0.464f);
            cwh0VarQ2.o(0.655f, -0.48f, 0.976f, -1.376f);
            cwh0VarQ2.o(0.3f, -0.8f, 0.32f, -1.906f);
            cwh0VarQ2.c(2.3f, 2.3f, false, true, -0.384f, 0.61f);
            cwh0VarQ2.c(2.8f, 2.8f, false, true, -0.96f, 0.736f);
            cwh0VarQ2.c(3.1f, 3.1f, false, true, -1.312f, 0.272f);
            cwh0VarQ2.o(-1.137f, 0.0f, -1.968f, -0.48f);
            cwh0VarQ2.b(3.26f, 3.26f, false, true, 14.03f, 6.72f);
            cwh0VarQ2.c(4.1f, 4.1f, false, true, -0.432f, -1.888f);
            cwh0VarQ2.o(0.0f, -1.056f, 0.464f, -1.984f);
            cwh0VarQ2.c(3.8f, 3.8f, false, true, 1.392f, -1.52f);
            cwh0VarQ2.o(0.912f, -0.591f, 2.16f, -0.592f);
            cwh0VarQ2.o(0.96f, 0.0f, 1.712f, 0.304f);
            cwh0VarQ2.c(3.9f, 3.9f, false, true, 1.328f, 0.848f);
            cwh0VarQ2.o(0.672f, 0.704f, 1.024f, 1.808f);
            cwh0VarQ2.o(0.368f, 1.089f, 0.368f, 2.496f);
            cwh0VarQ2.o(0.0f, 1.969f, -0.56f, 3.424f);
            cwh0VarQ2.o(-0.544f, 1.44f, -1.648f, 2.24f);
            cwh0VarQ2.o(-1.104f, 0.784f, -2.688f, 0.784f);
            cwh0VarQ2.m(0.576f, -5.809f);
            cwh0VarQ2.o(0.624f, 0.0f, 1.088f, -0.272f);
            cwh0VarQ2.o(0.465f, -0.288f, 0.704f, -0.752f);
            cwh0VarQ2.o(0.256f, -0.464f, 0.256f, -1.04f);
            cwh0VarQ2.o(0.0f, -0.608f, -0.256f, -1.088f);
            cwh0VarQ2.c(1.85f, 1.85f, false, false, -0.704f, -0.784f);
            cwh0VarQ2.o(-0.449f, -0.288f, -1.088f, -0.288f);
            cwh0VarQ2.o(-0.64f, 0.0f, -1.104f, 0.272f);
            cwh0VarQ2.c(1.8f, 1.8f, false, false, -0.688f, 0.768f);
            cwh0VarQ2.o(-0.24f, 0.496f, -0.24f, 1.104f);
            cwh0VarQ2.s(0.24f, 1.088f);
            cwh0VarQ2.o(0.24f, 0.465f, 0.688f, 0.736f);
            cwh0VarQ2.o(0.464f, 0.256f, 1.104f, 0.256f);
            cwh0VarQ2.m(-6.101f, 5.696f);
            cwh0VarQ2.o(-0.368f, 0.0f, -0.688f, -0.16f);
            cwh0VarQ2.c(1.4f, 1.4f, false, true, -0.512f, -0.464f);
            cwh0VarQ2.c(1.3f, 1.3f, false, true, -0.176f, -0.672f);
            cwh0VarQ2.o(0.0f, -0.352f, 0.176f, -0.64f);
            cwh0VarQ2.o(0.192f, -0.288f, 0.512f, -0.448f);
            cwh0VarQ2.c(1.41f, 1.41f, false, true, 1.36f, 0.0f);
            cwh0VarQ2.o(0.304f, 0.16f, 0.48f, 0.448f);
            cwh0VarQ2.o(0.192f, 0.288f, 0.192f, 0.64f);
            cwh0VarQ2.s(-0.192f, 0.656f);
            cwh0VarQ2.c(1.3f, 1.3f, false, true, -0.48f, 0.48f);
            cwh0VarQ2.o(-0.304f, 0.16f, -0.672f, 0.16f);
            cwh0VarQ2.m(-6.208f, 0.113f);
            cwh0VarQ2.o(-1.488f, 0.0f, -2.528f, -0.769f);
            cwh0VarQ2.o(-1.024f, -0.768f, -1.552f, -2.112f);
            cwh0VarQ2.n(0.825f, 8.416f, 0.825f, 6.687f);
            cwh0VarQ2.o(0.0f, -1.728f, 0.512f, -3.072f);
            cwh0VarQ2.o(0.529f, -1.344f, 1.552f, -2.112f);
            cwh0VarQ2.n(3.929f, 0.735f, 5.417f, 0.735f);
            cwh0VarQ2.o(1.472f, 0.0f, 2.512f, 0.768f);
            cwh0VarQ2.o(1.04f, 0.769f, 1.552f, 2.128f);
            cwh0VarQ2.o(0.528f, 1.344f, 0.528f, 3.056f);
            cwh0VarQ2.o(0.0f, 1.713f, -0.528f, 3.072f);
            cwh0VarQ2.o(-0.512f, 1.344f, -1.552f, 2.112f);
            cwh0VarQ2.s(-2.512f, 0.768f);
            cwh0VarQ2.e();
            cwh0VarQ2.l(5.417f, 10.64f);
            cwh0VarQ2.o(0.784f, 0.0f, 1.312f, -0.465f);
            cwh0VarQ2.o(0.528f, -0.48f, 0.784f, -1.36f);
            cwh0VarQ2.o(0.272f, -0.88f, 0.272f, -2.144f);
            cwh0VarQ2.o(0.0f, -1.248f, -0.272f, -2.112f);
            cwh0VarQ2.o(-0.255f, -0.879f, -0.784f, -1.344f);
            cwh0VarQ2.o(-0.529f, -0.48f, -1.312f, -0.48f);
            cwh0VarQ2.o(-0.784f, 0.0f, -1.312f, 0.48f);
            cwh0VarQ2.o(-0.528f, 0.465f, -0.8f, 1.344f);
            cwh0VarQ2.o(-0.256f, 0.864f, -0.256f, 2.112f);
            cwh0VarQ2.o(0.0f, 1.265f, 0.256f, 2.144f);
            cwh0VarQ2.o(0.272f, 0.88f, 0.8f, 1.36f);
            cwh0VarQ2.o(0.529f, 0.465f, 1.312f, 0.464f);
            cwh0VarQ2.e();
            a180.a(a180Var2, cwh0VarQ2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            qro1.a = b180VarB2;
        }
        c = new fqx(new dsx(b180VarB, b180VarB2), null);
        CREATOR = new dqx((byte) 1);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof fqx);
    }

    public final int hashCode() {
        return -1957225642;
    }

    public final String toString() {
        return "PlaybackSpeed0Point9x";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
