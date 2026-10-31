package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xqx extends hux {
    public static final Parcelable.Creator<xqx> CREATOR;
    public static final xqx c;

    static {
        b180 b180VarB = gxo1.a;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.PlaybackSpeed2Point8x16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
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
            cwh0VarQ.l(8.245f, 8.1f);
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
            cwh0VarQ.l(1.732f, 6.8f);
            cwh0VarQ.o(-0.2f, 0.54f, -0.18f, 1.2f);
            cwh0VarQ.i(4.97f);
            cwh0VarQ.u(6.67f);
            cwh0VarQ.h(3.54f);
            cwh0VarQ.o(0.05f, -0.086f, 0.112f, -0.17f);
            cwh0VarQ.c(2.3f, 2.3f, false, true, 0.38f, -0.39f);
            cwh0VarQ.o(0.24f, -0.2f, 0.61f, -0.47f);
            cwh0VarQ.c(8.7f, 8.7f, false, false, 1.11f, -0.93f);
            cwh0VarQ.o(0.42f, -0.44f, 0.61f, -0.87f);
            cwh0VarQ.c(2.3f, 2.3f, false, false, 0.19f, -0.93f);
            cwh0VarQ.c(2.1f, 2.1f, false, false, -0.28f, -1.07f);
            cwh0VarQ.o(-0.27f, -0.5f, -0.83f, -0.8f);
            cwh0VarQ.o(-0.548f, -0.31f, -1.34f, -0.31f);
            cwh0VarQ.o(-0.8f, 0.0f, -1.38f, 0.33f);
            cwh0VarQ.c(2.08f, 2.08f, false, false, -0.88f, 0.94f);
            cwh0VarQ.o(-0.29f, 0.61f, -0.29f, 1.47f);
            cwh0VarQ.i(1.45f);
            cwh0VarQ.o(0.0f, -0.46f, 0.12f, -0.77f);
            cwh0VarQ.o(0.12f, -0.32f, 0.36f, -0.47f);
            cwh0VarQ.o(0.24f, -0.16f, 0.58f, -0.16f);
            cwh0VarQ.s(0.55f, 0.12f);
            cwh0VarQ.s(0.31f, 0.33f);
            cwh0VarQ.s(0.1f, 0.48f);
            cwh0VarQ.o(0.0f, 0.29f, -0.14f, 0.55f);
            cwh0VarQ.o(-0.13f, 0.25f, -0.43f, 0.54f);
            cwh0VarQ.c(7.0f, 7.0f, false, true, -0.78f, 0.63f);
            cwh0VarQ.o(-0.789f, 0.54f, -1.26f, 1.04f);
            cwh0VarQ.c(3.3f, 3.3f, false, false, -0.68f, 1.04f);
            cwh0VarQ.m(10.865f, 1.37f);
            cwh0VarQ.o(-0.82f, 0.0f, -1.44f, -0.27f);
            cwh0VarQ.o(-0.61f, -0.28f, -0.94f, -0.76f);
            cwh0VarQ.s(-0.33f, -1.09f);
            cwh0VarQ.o(0.0f, -0.49f, 0.24f, -0.87f);
            cwh0VarQ.o(0.25f, -0.39f, 0.6f, -0.63f);
            cwh0VarQ.o(0.21f, -0.144f, 0.419f, -0.237f);
            cwh0VarQ.c(2.4f, 2.4f, false, true, -0.649f, -0.533f);
            cwh0VarQ.o(-0.37f, -0.45f, -0.37f, -1.1f);
            cwh0VarQ.o(0.0f, -0.55f, 0.3f, -0.99f);
            cwh0VarQ.o(0.3f, -0.45f, 0.86f, -0.7f);
            cwh0VarQ.o(0.57f, -0.26f, 1.31f, -0.26f);
            cwh0VarQ.s(1.3f, 0.26f);
            cwh0VarQ.o(0.56f, 0.25f, 0.86f, 0.7f);
            cwh0VarQ.o(0.31f, 0.44f, 0.31f, 0.99f);
            cwh0VarQ.o(0.0f, 0.64f, -0.38f, 1.07f);
            cwh0VarQ.c(2.7f, 2.7f, false, true, -0.656f, 0.55f);
            cwh0VarQ.o(0.217f, 0.102f, 0.426f, 0.25f);
            cwh0VarQ.o(0.35f, 0.24f, 0.59f, 0.63f);
            cwh0VarQ.o(0.25f, 0.38f, 0.25f, 0.87f);
            cwh0VarQ.o(0.0f, 0.61f, -0.33f, 1.09f);
            cwh0VarQ.s(-0.94f, 0.76f);
            cwh0VarQ.o(-0.61f, 0.27f, -1.43f, 0.27f);
            cwh0VarQ.m(0.58f, -1.33f);
            cwh0VarQ.c(0.97f, 0.97f, false, false, 0.4f, -0.32f);
            cwh0VarQ.o(0.15f, -0.21f, 0.15f, -0.48f);
            cwh0VarQ.c(0.83f, 0.83f, false, false, -0.14f, -0.47f);
            cwh0VarQ.c(1.1f, 1.1f, false, false, -0.39f, -0.38f);
            cwh0VarQ.c(2.8f, 2.8f, false, false, -0.6f, -0.27f);
            cwh0VarQ.c(2.7f, 2.7f, false, false, -0.61f, 0.27f);
            cwh0VarQ.c(1.25f, 1.25f, false, false, -0.39f, 0.38f);
            cwh0VarQ.c(0.83f, 0.83f, false, false, -0.14f, 0.47f);
            cwh0VarQ.o(0.0f, 0.27f, 0.14f, 0.48f);
            cwh0VarQ.o(0.15f, 0.2f, 0.41f, 0.32f);
            cwh0VarQ.o(0.26f, 0.11f, 0.59f, 0.11f);
            cwh0VarQ.o(0.32f, 0.0f, 0.58f, -0.11f);
            cwh0VarQ.m(-0.07f, -3.31f);
            cwh0VarQ.o(0.23f, -0.16f, 0.35f, -0.36f);
            cwh0VarQ.c(0.76f, 0.76f, false, false, 0.01f, -0.83f);
            cwh0VarQ.c(0.8f, 0.8f, false, false, -0.35f, -0.28f);
            cwh0VarQ.c(1.15f, 1.15f, false, false, -0.52f, -0.11f);
            cwh0VarQ.c(1.24f, 1.24f, false, false, -0.54f, 0.11f);
            cwh0VarQ.c(0.8f, 0.8f, false, false, -0.34f, 0.28f);
            cwh0VarQ.c(0.77f, 0.77f, false, false, -0.11f, 0.41f);
            cwh0VarQ.o(0.0f, 0.22f, 0.12f, 0.43f);
            cwh0VarQ.c(1.4f, 1.4f, false, false, 0.35f, 0.36f);
            cwh0VarQ.o(0.22f, 0.15f, 0.52f, 0.25f);
            cwh0VarQ.c(2.0f, 2.0f, false, false, 0.51f, -0.26f);
            a180.a(a180Var, cwh0VarQ.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            gxo1.a = b180VarB;
        }
        b180 b180VarB2 = hxo1.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.PlaybackSpeed2Point8x24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
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
            cwh0VarQ2.l(11.282f, 12.527f);
            cwh0VarQ2.o(-0.367f, 0.0f, -0.688f, -0.16f);
            cwh0VarQ2.c(1.4f, 1.4f, false, true, -0.512f, -0.464f);
            cwh0VarQ2.c(1.3f, 1.3f, false, true, -0.176f, -0.672f);
            cwh0VarQ2.o(0.0f, -0.352f, 0.176f, -0.64f);
            cwh0VarQ2.o(0.192f, -0.288f, 0.512f, -0.448f);
            cwh0VarQ2.o(0.32f, -0.176f, 0.688f, -0.176f);
            cwh0VarQ2.o(0.369f, 0.0f, 0.672f, 0.176f);
            cwh0VarQ2.o(0.305f, 0.16f, 0.48f, 0.448f);
            cwh0VarQ2.o(0.192f, 0.288f, 0.192f, 0.64f);
            cwh0VarQ2.s(-0.192f, 0.656f);
            cwh0VarQ2.c(1.3f, 1.3f, false, true, -0.48f, 0.48f);
            cwh0VarQ2.o(-0.303f, 0.16f, -0.672f, 0.16f);
            cwh0VarQ2.l(1.34f, 10.511f);
            cwh0VarQ2.o(-0.321f, 0.833f, -0.288f, 1.856f);
            rjx.w(cwh0VarQ2, 7.776f, -1.92f, 3.876f, 10.447f);
            cwh0VarQ2.o(0.099f, -0.194f, 0.232f, -0.384f);
            cwh0VarQ2.o(0.24f, -0.32f, 0.64f, -0.672f);
            cwh0VarQ2.c(12.0f, 12.0f, false, true, 1.04f, -0.8f);
            cwh0VarQ2.o(1.12f, -0.8f, 1.792f, -1.504f);
            cwh0VarQ2.o(0.672f, -0.703f, 0.976f, -1.392f);
            cwh0VarQ2.c(3.8f, 3.8f, false, false, 0.304f, -1.504f);
            cwh0VarQ2.o(0.0f, -0.912f, -0.432f, -1.696f);
            cwh0VarQ2.o(-0.417f, -0.783f, -1.296f, -1.264f);
            cwh0VarQ2.n(6.268f, 0.735f, 5.036f, 0.735f);
            cwh0VarQ2.o(-1.264f, 0.0f, -2.16f, 0.528f);
            cwh0VarQ2.b(3.4f, 3.4f, false, false, 1.5f, 2.751f);
            cwh0VarQ2.o(-0.465f, 0.976f, -0.464f, 2.32f);
            cwh0VarQ2.i(2.096f);
            cwh0VarQ2.o(0.0f, -0.784f, 0.208f, -1.312f);
            cwh0VarQ2.o(0.207f, -0.543f, 0.624f, -0.8f);
            cwh0VarQ2.o(0.415f, -0.272f, 1.024f, -0.272f);
            cwh0VarQ2.o(0.576f, 0.0f, 0.944f, 0.208f);
            cwh0VarQ2.o(0.383f, 0.209f, 0.56f, 0.576f);
            cwh0VarQ2.o(0.176f, 0.369f, 0.176f, 0.832f);
            cwh0VarQ2.o(0.0f, 0.497f, -0.224f, 0.944f);
            cwh0VarQ2.o(-0.225f, 0.432f, -0.72f, 0.912f);
            cwh0VarQ2.o(-0.496f, 0.48f, -1.328f, 1.072f);
            cwh0VarQ2.o(-1.248f, 0.864f, -1.984f, 1.648f);
            cwh0VarQ2.o(-0.735f, 0.784f, -1.072f, 1.632f);
            cwh0VarQ2.m(16.491f, 2.129f);
            cwh0VarQ2.o(-1.28f, 0.0f, -2.24f, -0.433f);
            cwh0VarQ2.o(-0.96f, -0.447f, -1.472f, -1.2f);
            cwh0VarQ2.c(3.05f, 3.05f, false, true, -0.512f, -1.728f);
            cwh0VarQ2.o(0.0f, -0.783f, 0.384f, -1.392f);
            cwh0VarQ2.o(0.384f, -0.624f, 0.944f, -1.008f);
            cwh0VarQ2.o(0.36f, -0.25f, 0.72f, -0.412f);
            cwh0VarQ2.c(3.8f, 3.8f, false, true, -1.072f, -0.868f);
            cwh0VarQ2.o(-0.608f, -0.72f, -0.608f, -1.76f);
            cwh0VarQ2.o(0.0f, -0.879f, 0.464f, -1.584f);
            cwh0VarQ2.o(0.48f, -0.703f, 1.36f, -1.104f);
            cwh0VarQ2.o(0.88f, -0.416f, 2.032f, -0.416f);
            cwh0VarQ2.g(1.152f, 0.0f, 1.445f, 0.139f, 2.032f, 0.416f);
            cwh0VarQ2.o(0.88f, 0.4f, 1.344f, 1.104f);
            cwh0VarQ2.o(0.48f, 0.705f, 0.48f, 1.584f);
            cwh0VarQ2.o(0.0f, 1.025f, -0.608f, 1.712f);
            cwh0VarQ2.c(4.4f, 4.4f, false, true, -1.095f, 0.893f);
            cwh0VarQ2.o(0.367f, 0.179f, 0.727f, 0.435f);
            cwh0VarQ2.c(3.3f, 3.3f, false, true, 0.944f, 1.008f);
            cwh0VarQ2.o(0.4f, 0.609f, 0.4f, 1.392f);
            cwh0VarQ2.o(0.0f, 0.96f, -0.512f, 1.728f);
            cwh0VarQ2.o(-0.512f, 0.753f, -1.472f, 1.2f);
            cwh0VarQ2.o(-0.96f, 0.432f, -2.24f, 0.432f);
            cwh0VarQ2.e();
            cwh0VarQ2.l(18.839f, 10.655f);
            cwh0VarQ2.o(0.448f, -0.192f, 0.688f, -0.56f);
            cwh0VarQ2.o(0.255f, -0.367f, 0.256f, -0.832f);
            cwh0VarQ2.o(0.0f, -0.431f, -0.24f, -0.8f);
            cwh0VarQ2.c(1.9f, 1.9f, false, false, -0.672f, -0.656f);
            cwh0VarQ2.c(3.7f, 3.7f, false, false, -1.04f, -0.464f);
            cwh0VarQ2.c(4.0f, 4.0f, false, false, -1.056f, 0.464f);
            cwh0VarQ2.c(2.1f, 2.1f, false, false, -0.672f, 0.656f);
            cwh0VarQ2.o(-0.24f, 0.369f, -0.24f, 0.8f);
            cwh0VarQ2.o(0.0f, 0.465f, 0.24f, 0.832f);
            cwh0VarQ2.o(0.255f, 0.368f, 0.704f, 0.56f);
            cwh0VarQ2.s(1.024f, 0.192f);
            cwh0VarQ2.g(0.576f, 0.0f, 0.72f, -0.064f, 1.008f, -0.192f);
            cwh0VarQ2.m(-0.112f, -5.392f);
            cwh0VarQ2.o(0.4f, -0.272f, 0.608f, -0.608f);
            cwh0VarQ2.o(0.224f, -0.351f, 0.224f, -0.752f);
            cwh0VarQ2.o(0.0f, -0.4f, -0.208f, -0.704f);
            cwh0VarQ2.c(1.35f, 1.35f, false, false, -0.608f, -0.496f);
            cwh0VarQ2.c(2.2f, 2.2f, false, false, -0.912f, -0.176f);
            cwh0VarQ2.o(-0.528f, 0.0f, -0.928f, 0.176f);
            cwh0VarQ2.c(1.36f, 1.36f, false, false, -0.592f, 0.496f);
            cwh0VarQ2.c(1.2f, 1.2f, false, false, -0.208f, 0.704f);
            cwh0VarQ2.o(0.0f, 0.4f, 0.224f, 0.752f);
            cwh0VarQ2.o(0.224f, 0.353f, 0.608f, 0.608f);
            cwh0VarQ2.o(0.384f, 0.257f, 0.896f, 0.416f);
            cwh0VarQ2.c(3.8f, 3.8f, false, false, 0.896f, -0.416f);
            a180.a(a180Var2, cwh0VarQ2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            hxo1.b = b180VarB2;
        }
        c = new xqx(new dsx(b180VarB, b180VarB2), null);
        CREATOR = new dqx((byte) 19);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof xqx);
    }

    public final int hashCode() {
        return 1528394997;
    }

    public final String toString() {
        return "PlaybackSpeed2Point8x";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
