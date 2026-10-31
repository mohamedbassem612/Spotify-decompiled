package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vqx extends hux {
    public static final Parcelable.Creator<vqx> CREATOR;
    public static final vqx c;

    static {
        b180 b180VarB = wwo1.a;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.PlaybackSpeed2Point6x16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
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
            cwh0VarQ.l(8.34f, 8.1f);
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
            cwh0VarQ.l(1.826f, 6.8f);
            cwh0VarQ.o(-0.2f, 0.54f, -0.18f, 1.2f);
            cwh0VarQ.i(4.97f);
            cwh0VarQ.j(6.616f, 6.67f);
            cwh0VarQ.j(3.634f, 6.67f);
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
            cwh0VarQ.m(9.798f, 1.19f);
            cwh0VarQ.o(0.5f, 0.18f, 1.11f, 0.18f);
            cwh0VarQ.o(0.8f, 0.0f, 1.38f, -0.36f);
            cwh0VarQ.s(0.88f, -0.95f);
            cwh0VarQ.s(0.3f, -1.26f);
            cwh0VarQ.o(0.0f, -0.65f, -0.25f, -1.18f);
            cwh0VarQ.c(1.95f, 1.95f, false, false, -0.75f, -0.84f);
            cwh0VarQ.o(-0.5f, -0.31f, -1.2f, -0.31f);
            cwh0VarQ.o(-0.47f, 0.0f, -0.84f, 0.18f);
            cwh0VarQ.c(1.92f, 1.92f, false, false, -0.88f, 0.817f);
            cwh0VarQ.c(3.0f, 3.0f, false, true, 0.19f, -1.027f);
            cwh0VarQ.o(0.21f, -0.53f, 0.61f, -0.84f);
            cwh0VarQ.s(0.98f, -0.31f);
            cwh0VarQ.o(0.51f, 0.0f, 0.97f, 0.23f);
            cwh0VarQ.o(0.46f, 0.22f, 0.69f, 0.51f);
            cwh0VarQ.j(14.814f, 1.27f);
            cwh0VarQ.o(-0.33f, -0.24f, -0.8f, -0.39f);
            cwh0VarQ.s(-0.98f, -0.15f);
            cwh0VarQ.o(-0.95f, 0.0f, -1.66f, 0.49f);
            cwh0VarQ.o(-0.71f, 0.48f, -1.1f, 1.39f);
            cwh0VarQ.o(-0.39f, 0.9f, -0.39f, 2.14f);
            cwh0VarQ.o(0.0f, 0.9f, 0.22f, 1.57f);
            cwh0VarQ.o(0.23f, 0.67f, 0.66f, 1.1f);
            cwh0VarQ.o(0.36f, 0.38f, 0.86f, 0.57f);
            cwh0VarQ.m(1.65f, -1.27f);
            cwh0VarQ.o(-0.27f, 0.16f, -0.63f, 0.16f);
            cwh0VarQ.o(-0.37f, 0.0f, -0.64f, -0.16f);
            cwh0VarQ.c(1.13f, 1.13f, false, true, -0.4f, -0.45f);
            cwh0VarQ.c(1.5f, 1.5f, false, true, -0.13f, -0.63f);
            cwh0VarQ.o(0.0f, -0.33f, 0.13f, -0.6f);
            cwh0VarQ.o(0.14f, -0.27f, 0.4f, -0.43f);
            cwh0VarQ.o(0.27f, -0.16f, 0.64f, -0.16f);
            cwh0VarQ.o(0.36f, 0.0f, 0.63f, 0.16f);
            cwh0VarQ.o(0.27f, 0.15f, 0.4f, 0.43f);
            cwh0VarQ.o(0.14f, 0.27f, 0.14f, 0.6f);
            cwh0VarQ.o(0.0f, 0.36f, -0.14f, 0.64f);
            cwh0VarQ.c(1.0f, 1.0f, false, true, -0.4f, 0.44f);
            a180.a(a180Var, cwh0VarQ.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            wwo1.a = b180VarB;
        }
        b180 b180VarB2 = ywo1.a;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.PlaybackSpeed2Point6x24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
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
            cwh0VarQ2.l(11.464f, 12.527f);
            cwh0VarQ2.c(1.5f, 1.5f, false, true, -0.688f, -0.16f);
            cwh0VarQ2.c(1.44f, 1.44f, false, true, -0.512f, -0.464f);
            cwh0VarQ2.c(1.3f, 1.3f, false, true, -0.176f, -0.672f);
            cwh0VarQ2.o(0.0f, -0.352f, 0.176f, -0.64f);
            cwh0VarQ2.o(0.192f, -0.288f, 0.512f, -0.448f);
            cwh0VarQ2.c(1.4f, 1.4f, false, true, 1.36f, 0.0f);
            cwh0VarQ2.o(0.303f, 0.16f, 0.48f, 0.448f);
            cwh0VarQ2.o(0.192f, 0.288f, 0.192f, 0.64f);
            cwh0VarQ2.s(-0.192f, 0.656f);
            cwh0VarQ2.c(1.3f, 1.3f, false, true, -0.48f, 0.48f);
            cwh0VarQ2.c(1.4f, 1.4f, false, true, -0.672f, 0.16f);
            cwh0VarQ2.m(-9.943f, -2.016f);
            cwh0VarQ2.o(-0.32f, 0.833f, -0.288f, 1.856f);
            cwh0VarQ2.j(9.01f, 12.367f);
            cwh0VarQ2.v(-1.92f);
            cwh0VarQ2.j(4.058f, 10.447f);
            cwh0VarQ2.o(0.099f, -0.194f, 0.231f, -0.384f);
            cwh0VarQ2.o(0.24f, -0.32f, 0.64f, -0.672f);
            cwh0VarQ2.c(13.0f, 13.0f, false, true, 1.04f, -0.8f);
            cwh0VarQ2.o(1.12f, -0.8f, 1.792f, -1.504f);
            cwh0VarQ2.o(0.673f, -0.703f, 0.976f, -1.392f);
            cwh0VarQ2.o(0.304f, -0.703f, 0.304f, -1.504f);
            cwh0VarQ2.o(0.0f, -0.912f, -0.432f, -1.696f);
            cwh0VarQ2.o(-0.416f, -0.783f, -1.296f, -1.264f);
            cwh0VarQ2.n(6.45f, 0.735f, 5.217f, 0.735f);
            cwh0VarQ2.o(-1.263f, 0.0f, -2.16f, 0.528f);
            cwh0VarQ2.c(3.4f, 3.4f, false, false, -1.376f, 1.488f);
            cwh0VarQ2.o(-0.465f, 0.976f, -0.464f, 2.32f);
            cwh0VarQ2.i(2.096f);
            cwh0VarQ2.o(0.0f, -0.784f, 0.208f, -1.312f);
            cwh0VarQ2.o(0.208f, -0.543f, 0.624f, -0.8f);
            cwh0VarQ2.o(0.417f, -0.272f, 1.024f, -0.272f);
            cwh0VarQ2.o(0.576f, 0.0f, 0.944f, 0.208f);
            cwh0VarQ2.o(0.384f, 0.209f, 0.56f, 0.576f);
            cwh0VarQ2.o(0.177f, 0.369f, 0.176f, 0.832f);
            cwh0VarQ2.o(0.0f, 0.497f, -0.224f, 0.944f);
            cwh0VarQ2.o(-0.225f, 0.432f, -0.72f, 0.912f);
            cwh0VarQ2.c(11.5f, 11.5f, false, true, -1.328f, 1.072f);
            cwh0VarQ2.o(-1.248f, 0.864f, -1.984f, 1.648f);
            cwh0VarQ2.o(-0.735f, 0.784f, -1.072f, 1.632f);
            cwh0VarQ2.m(14.801f, 1.84f);
            cwh0VarQ2.c(5.0f, 5.0f, false, false, 1.728f, 0.288f);
            cwh0VarQ2.o(1.248f, 0.0f, 2.16f, -0.576f);
            cwh0VarQ2.c(3.73f, 3.73f, false, false, 1.376f, -1.504f);
            cwh0VarQ2.c(4.5f, 4.5f, false, false, 0.464f, -2.016f);
            cwh0VarQ2.o(0.0f, -1.056f, -0.4f, -1.904f);
            cwh0VarQ2.c(3.1f, 3.1f, false, false, -1.2f, -1.344f);
            cwh0VarQ2.o(-0.8f, -0.512f, -1.92f, -0.512f);
            cwh0VarQ2.o(-0.767f, 0.0f, -1.376f, 0.304f);
            cwh0VarQ2.c(3.3f, 3.3f, false, false, -0.992f, 0.736f);
            cwh0VarQ2.o(-0.28f, 0.315f, -0.431f, 0.628f);
            cwh0VarQ2.c(5.3f, 5.3f, false, true, 0.32f, -1.78f);
            cwh0VarQ2.o(0.351f, -0.912f, 1.023f, -1.424f);
            cwh0VarQ2.o(0.672f, -0.528f, 1.616f, -0.528f);
            cwh0VarQ2.c(3.46f, 3.46f, false, true, 1.536f, 0.352f);
            cwh0VarQ2.o(0.736f, 0.352f, 1.088f, 0.832f);
            cwh0VarQ2.j(21.314f, 1.6f);
            cwh0VarQ2.c(4.5f, 4.5f, false, false, -1.248f, -0.608f);
            cwh0VarQ2.b(4.6f, 4.6f, false, false, 18.53f, 0.735f);
            cwh0VarQ2.o(-1.503f, 0.0f, -2.624f, 0.784f);
            cwh0VarQ2.o(-1.104f, 0.769f, -1.712f, 2.224f);
            cwh0VarQ2.o(-0.592f, 1.44f, -0.592f, 3.44f);
            cwh0VarQ2.o(0.0f, 1.457f, 0.352f, 2.528f);
            cwh0VarQ2.o(0.353f, 1.073f, 1.04f, 1.76f);
            cwh0VarQ2.o(0.56f, 0.576f, 1.328f, 0.88f);
            cwh0VarQ2.m(2.688f, -1.856f);
            cwh0VarQ2.o(-0.465f, 0.273f, -1.088f, 0.272f);
            cwh0VarQ2.o(-0.655f, 0.0f, -1.12f, -0.288f);
            cwh0VarQ2.c(1.9f, 1.9f, false, true, -0.688f, -0.768f);
            cwh0VarQ2.o(-0.24f, -0.495f, -0.24f, -1.104f);
            cwh0VarQ2.o(0.0f, -0.576f, 0.24f, -1.04f);
            cwh0VarQ2.o(0.24f, -0.48f, 0.688f, -0.752f);
            cwh0VarQ2.o(0.465f, -0.272f, 1.12f, -0.272f);
            cwh0VarQ2.o(0.624f, 0.0f, 1.088f, 0.272f);
            cwh0VarQ2.o(0.465f, 0.256f, 0.704f, 0.736f);
            cwh0VarQ2.o(0.24f, 0.48f, 0.24f, 1.056f);
            cwh0VarQ2.o(0.0f, 0.624f, -0.24f, 1.12f);
            cwh0VarQ2.o(-0.24f, 0.48f, -0.704f, 0.768f);
            a180.a(a180Var2, cwh0VarQ2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            ywo1.a = b180VarB2;
        }
        c = new vqx(new dsx(b180VarB, b180VarB2), null);
        CREATOR = new dqx((byte) 17);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof vqx);
    }

    public final int hashCode() {
        return 1528394935;
    }

    public final String toString() {
        return "PlaybackSpeed2Point6x";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
