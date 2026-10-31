package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class erx extends hux {
    public static final Parcelable.Creator<erx> CREATOR;
    public static final erx c;

    static {
        b180 b180VarB = myo1.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.PlaybackSpeed3Point5x16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
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
            cwh0VarQ.m(-4.267f, 0.07f);
            cwh0VarQ.c(3.6f, 3.6f, false, true, -1.34f, -0.25f);
            cwh0VarQ.o(-0.62f, -0.25f, -0.89f, -0.57f);
            cwh0VarQ.j(1.996f, 5.73f);
            cwh0VarQ.o(0.27f, 0.47f, 0.85f, 0.77f);
            cwh0VarQ.o(0.59f, 0.3f, 1.21f, 0.3f);
            cwh0VarQ.o(0.381f, 0.0f, 0.66f, -0.12f);
            cwh0VarQ.c(0.96f, 0.96f, false, false, 0.43f, -0.34f);
            cwh0VarQ.o(0.15f, -0.23f, 0.15f, -0.53f);
            cwh0VarQ.o(0.0f, -0.49f, -0.37f, -0.73f);
            cwh0VarQ.o(-0.36f, -0.24f, -1.18f, -0.24f);
            cwh0VarQ.i(-0.43f);
            cwh0VarQ.v(-0.92f);
            cwh0VarQ.k(1.65f, -1.72f);
            rjx.s(cwh0VarQ, -2.86f, 2.106f, 0.9f, 4.5f);
            cwh0VarQ.v(1.36f);
            cwh0VarQ.j(5.04f, 3.894f);
            cwh0VarQ.o(0.839f, 0.172f, 1.287f, 0.666f);
            cwh0VarQ.o(0.51f, 0.54f, 0.51f, 1.36f);
            cwh0VarQ.o(0.0f, 0.63f, -0.35f, 1.14f);
            cwh0VarQ.o(-0.34f, 0.51f, -0.94f, 0.81f);
            cwh0VarQ.o(-0.59f, 0.3f, -1.32f, 0.3f);
            cwh0VarQ.e();
            cwh0VarQ.l(12.785f, 8.17f);
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
            cwh0VarQ.o(0.078f, -0.131f, 0.203f, -0.263f);
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
            myo1.b = b180VarB;
        }
        b180 b180VarB2 = nyo1.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.PlaybackSpeed3Point5x24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
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
            cwh0VarQ2.l(11.636f, 12.527f);
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
            cwh0VarQ2.m(-6.446f, 0.113f);
            cwh0VarQ2.c(5.5f, 5.5f, false, true, -2.095f, -0.4f);
            cwh0VarQ2.o(-0.977f, -0.417f, -1.392f, -0.929f);
            cwh0VarQ2.v(-2.4f);
            cwh0VarQ2.o(0.432f, 0.768f, 1.36f, 1.264f);
            cwh0VarQ2.o(0.927f, 0.48f, 1.904f, 0.48f);
            cwh0VarQ2.o(0.639f, 0.0f, 1.104f, -0.208f);
            cwh0VarQ2.o(0.48f, -0.224f, 0.736f, -0.608f);
            cwh0VarQ2.o(0.256f, -0.4f, 0.256f, -0.944f);
            cwh0VarQ2.o(0.0f, -0.848f, -0.624f, -1.28f);
            cwh0VarQ2.s(-2.064f, -0.432f);
            cwh0VarQ2.i(-0.56f);
            cwh0VarQ2.j(3.815f, 5.84f);
            cwh0VarQ2.k(2.737f, -2.96f);
            cwh0VarQ2.j(1.879f, 2.88f);
            rjx.B(cwh0VarQ2, 1.879f, 1.007f, 7.056f, 1.968f);
            cwh0VarQ2.k(-2.63f, 2.809f);
            cwh0VarQ2.o(1.385f, 0.255f, 2.15f, 1.063f);
            cwh0VarQ2.o(0.832f, 0.864f, 0.832f, 2.208f);
            cwh0VarQ2.c(3.2f, 3.2f, false, true, -0.544f, 1.808f);
            cwh0VarQ2.o(-0.528f, 0.816f, -1.472f, 1.296f);
            cwh0VarQ2.o(-0.928f, 0.48f, -2.08f, 0.48f);
            cwh0VarQ2.e();
            cwh0VarQ2.l(18.104f, 12.64f);
            cwh0VarQ2.o(-1.167f, 0.0f, -2.096f, -0.433f);
            cwh0VarQ2.c(3.47f, 3.47f, false, true, -1.472f, -1.264f);
            cwh0VarQ2.o(-0.543f, -0.832f, -0.576f, -1.984f);
            cwh0VarQ2.i(2.08f);
            cwh0VarQ2.o(0.032f, 0.544f, 0.272f, 0.96f);
            cwh0VarQ2.o(0.256f, 0.416f, 0.688f, 0.656f);
            cwh0VarQ2.o(0.432f, 0.225f, 1.008f, 0.224f);
            cwh0VarQ2.c(1.85f, 1.85f, false, false, 1.696f, -1.024f);
            cwh0VarQ2.o(0.24f, -0.48f, 0.24f, -1.104f);
            cwh0VarQ2.o(0.0f, -0.623f, -0.24f, -1.088f);
            cwh0VarQ2.c(1.7f, 1.7f, false, false, -0.688f, -0.736f);
            cwh0VarQ2.c(1.85f, 1.85f, false, false, -1.008f, -0.272f);
            cwh0VarQ2.o(-0.655f, 0.0f, -1.152f, 0.32f);
            cwh0VarQ2.c(1.86f, 1.86f, false, false, -0.688f, 0.784f);
            cwh0VarQ2.i(-2.032f);
            cwh0VarQ2.k(0.64f, -6.672f);
            cwh0VarQ2.i(6.688f);
            cwh0VarQ2.v(1.92f);
            cwh0VarQ2.j(16.44f, 2.927f);
            cwh0VarQ2.k(-0.331f, 3.261f);
            cwh0VarQ2.o(0.134f, -0.253f, 0.363f, -0.493f);
            cwh0VarQ2.c(2.6f, 2.6f, false, true, 0.896f, -0.592f);
            cwh0VarQ2.o(0.561f, -0.24f, 1.2f, -0.24f);
            cwh0VarQ2.o(0.993f, 0.0f, 1.776f, 0.464f);
            cwh0VarQ2.o(0.801f, 0.449f, 1.248f, 1.28f);
            cwh0VarQ2.o(0.449f, 0.832f, 0.448f, 1.936f);
            cwh0VarQ2.o(0.0f, 1.152f, -0.48f, 2.08f);
            cwh0VarQ2.c(3.5f, 3.5f, false, true, -1.376f, 1.472f);
            cwh0VarQ2.o(-0.895f, 0.544f, -2.08f, 0.544f);
            cwh0VarQ2.e();
            a180.a(a180Var2, cwh0VarQ2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            nyo1.b = b180VarB2;
        }
        c = new erx(new dsx(b180VarB, b180VarB2), null);
        CREATOR = new dqx((byte) 26);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof erx);
    }

    public final int hashCode() {
        return -1023762057;
    }

    public final String toString() {
        return "PlaybackSpeed3Point5x";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
