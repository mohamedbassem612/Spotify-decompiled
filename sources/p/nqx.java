package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nqx extends hux {
    public static final Parcelable.Creator<nqx> CREATOR;
    public static final nqx c;

    static {
        b180 b180VarB = tto1.a;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.PlaybackSpeed1Point8x16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
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
            cwh0VarQ.m(4.352f, 0.07f);
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
            cwh0VarQ.o(0.218f, 0.102f, 0.426f, 0.25f);
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
            cwh0VarQ.l(3.09f, 3.1f);
            cwh0VarQ.u(2.07f);
            cwh0VarQ.o(0.94f, -0.06f, 1.37f, -0.34f);
            cwh0VarQ.r(5.0f, 0.9f);
            cwh0VarQ.i(1.26f);
            cwh0VarQ.u(8.0f);
            cwh0VarQ.h(4.81f);
            cwh0VarQ.u(3.1f);
            cwh0VarQ.e();
            a180.a(a180Var, cwh0VarQ.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            tto1.a = b180VarB;
        }
        b180 b180VarB2 = xto1.a;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.PlaybackSpeed1Point8x24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            long j = u7h.b;
            n6a1 n6a1Var2 = new n6a1(j);
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
            cwh0VarQ2.l(10.962f, 12.527f);
            cwh0VarQ2.o(-0.367f, 0.0f, -0.688f, -0.16f);
            cwh0VarQ2.c(1.4f, 1.4f, false, true, -0.512f, -0.464f);
            cwh0VarQ2.c(1.3f, 1.3f, false, true, -0.176f, -0.672f);
            cwh0VarQ2.o(0.0f, -0.352f, 0.176f, -0.64f);
            cwh0VarQ2.o(0.192f, -0.288f, 0.512f, -0.448f);
            cwh0VarQ2.o(0.32f, -0.176f, 0.688f, -0.176f);
            cwh0VarQ2.o(0.369f, 0.0f, 0.672f, 0.176f);
            cwh0VarQ2.o(0.304f, 0.16f, 0.48f, 0.448f);
            cwh0VarQ2.o(0.192f, 0.288f, 0.192f, 0.64f);
            cwh0VarQ2.s(-0.192f, 0.656f);
            cwh0VarQ2.c(1.3f, 1.3f, false, true, -0.48f, 0.48f);
            cwh0VarQ2.o(-0.303f, 0.16f, -0.672f, 0.16f);
            cwh0VarQ2.m(9.022f, -6.083f);
            cwh0VarQ2.k(-0.015f, -0.007f);
            cwh0VarQ2.g(-0.13f, -0.063f, 0.015f, 0.007f, 0.015f, 0.007f);
            a180.a(a180Var2, cwh0VarQ2.a, n6a1Var2, 1.0f, 2, 1.0f);
            n6a1 n6a1Var3 = new n6a1(j);
            cwh0 cwh0VarG = lf51.g(15.591f, 12.207f);
            cwh0VarG.o(0.96f, 0.432f, 2.24f, 0.432f);
            cwh0VarG.s(2.24f, -0.432f);
            cwh0VarG.o(0.96f, -0.447f, 1.472f, -1.2f);
            cwh0VarG.c(3.05f, 3.05f, false, false, 0.512f, -1.728f);
            cwh0VarG.o(0.0f, -0.783f, -0.4f, -1.392f);
            cwh0VarG.c(3.3f, 3.3f, false, false, -0.944f, -1.008f);
            cwh0VarG.c(5.0f, 5.0f, false, false, -0.727f, -0.435f);
            cwh0VarG.q(-0.146f, -0.07f, -0.015f, -0.007f);
            cwh0VarG.k(0.015f, 0.007f);
            cwh0VarG.c(4.3f, 4.3f, false, false, 1.095f, -0.893f);
            cwh0VarG.o(0.608f, -0.687f, 0.608f, -1.712f);
            cwh0VarG.c(2.75f, 2.75f, false, false, -0.48f, -1.584f);
            cwh0VarG.o(-0.464f, -0.703f, -1.344f, -1.104f);
            cwh0VarG.o(-0.88f, -0.416f, -2.032f, -0.416f);
            cwh0VarG.g(-1.152f, 0.0f, -1.445f, 0.139f, -2.032f, 0.416f);
            cwh0VarG.o(-0.88f, 0.4f, -1.36f, 1.104f);
            cwh0VarG.o(-0.465f, 0.705f, -0.464f, 1.584f);
            cwh0VarG.o(0.0f, 1.04f, 0.608f, 1.76f);
            cwh0VarG.o(0.462f, 0.535f, 1.073f, 0.868f);
            cwh0VarG.o(-0.36f, 0.162f, -0.72f, 0.412f);
            cwh0VarG.c(3.3f, 3.3f, false, false, -0.945f, 1.008f);
            cwh0VarG.o(-0.384f, 0.609f, -0.384f, 1.392f);
            cwh0VarG.o(0.0f, 0.96f, 0.512f, 1.728f);
            cwh0VarG.o(0.512f, 0.753f, 1.472f, 1.2f);
            cwh0VarG.m(3.248f, -1.552f);
            cwh0VarG.c(2.5f, 2.5f, false, true, -1.008f, 0.192f);
            cwh0VarG.c(2.6f, 2.6f, false, true, -1.024f, -0.192f);
            cwh0VarG.c(1.6f, 1.6f, false, true, -0.704f, -0.56f);
            cwh0VarG.c(1.5f, 1.5f, false, true, -0.24f, -0.832f);
            cwh0VarG.o(0.0f, -0.431f, 0.24f, -0.8f);
            cwh0VarG.c(2.1f, 2.1f, false, true, 0.672f, -0.656f);
            cwh0VarG.c(4.0f, 4.0f, false, true, 1.056f, -0.464f);
            cwh0VarG.o(0.608f, 0.177f, 1.04f, 0.464f);
            cwh0VarG.o(0.448f, 0.272f, 0.672f, 0.656f);
            cwh0VarG.o(0.24f, 0.369f, 0.24f, 0.8f);
            cwh0VarG.o(0.0f, 0.465f, -0.256f, 0.832f);
            cwh0VarG.c(1.5f, 1.5f, false, true, -0.688f, 0.56f);
            cwh0VarG.m(-0.112f, -5.392f);
            cwh0VarG.c(3.8f, 3.8f, false, true, -0.896f, 0.416f);
            cwh0VarG.c(3.5f, 3.5f, false, true, -0.896f, -0.416f);
            cwh0VarG.c(2.1f, 2.1f, false, true, -0.608f, -0.608f);
            cwh0VarG.c(1.4f, 1.4f, false, true, -0.224f, -0.752f);
            cwh0VarG.o(0.0f, -0.4f, 0.208f, -0.704f);
            cwh0VarG.c(1.37f, 1.37f, false, true, 0.592f, -0.496f);
            cwh0VarG.o(0.4f, -0.176f, 0.928f, -0.176f);
            cwh0VarG.s(0.912f, 0.176f);
            cwh0VarG.o(0.4f, 0.177f, 0.608f, 0.496f);
            cwh0VarG.o(0.208f, 0.305f, 0.208f, 0.704f);
            cwh0VarG.o(0.0f, 0.4f, -0.224f, 0.752f);
            cwh0VarG.c(2.1f, 2.1f, false, true, -0.608f, 0.608f);
            cwh0VarG.l(2.935f, 4.351f);
            cwh0VarG.u(2.895f);
            cwh0VarG.o(1.488f, -0.096f, 2.16f, -0.544f);
            cwh0VarG.o(0.687f, -0.463f, 0.848f, -1.344f);
            cwh0VarG.h(7.75f);
            cwh0VarG.v(11.36f);
            cwh0VarG.h(5.687f);
            cwh0VarG.u(4.351f);
            cwh0VarG.e();
            a180.a(a180Var2, cwh0VarG.a, n6a1Var3, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            xto1.a = b180VarB2;
        }
        c = new nqx(new dsx(b180VarB, b180VarB2), null);
        CREATOR = new dqx((byte) 9);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof nqx);
    }

    public final int hashCode() {
        return -214415338;
    }

    public final String toString() {
        return "PlaybackSpeed1Point8x";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
