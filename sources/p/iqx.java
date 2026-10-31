package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class iqx extends hux {
    public static final Parcelable.Creator<iqx> CREATOR;
    public static final iqx c;

    static {
        b180 b180VarB = eso1.a;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.PlaybackSpeed1Point3x16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
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
            cwh0VarQ.l(12.694f, 8.17f);
            cwh0VarQ.c(3.6f, 3.6f, false, true, -1.34f, -0.25f);
            cwh0VarQ.o(-0.62f, -0.25f, -0.89f, -0.57f);
            cwh0VarQ.j(10.464f, 5.73f);
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
            rjx.s(cwh0VarQ, -2.86f, 10.574f, 0.9f, 4.5f);
            cwh0VarQ.v(1.36f);
            cwh0VarQ.k(-1.567f, 1.634f);
            cwh0VarQ.g(-0.063f, -0.012f, 0.066f, 0.01f, 0.0f, 0.0f);
            cwh0VarQ.o(0.838f, 0.172f, 1.287f, 0.666f);
            cwh0VarQ.o(0.51f, 0.54f, 0.51f, 1.36f);
            cwh0VarQ.o(0.0f, 0.63f, -0.35f, 1.14f);
            cwh0VarQ.o(-0.34f, 0.51f, -0.94f, 0.81f);
            cwh0VarQ.o(-0.59f, 0.3f, -1.32f, 0.3f);
            cwh0VarQ.l(8.792f, 8.1f);
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
            cwh0VarQ.m(-3.434f, -5.0f);
            cwh0VarQ.i(-1.72f);
            cwh0VarQ.j(3.638f, 2.07f);
            cwh0VarQ.o(0.94f, -0.06f, 1.37f, -0.34f);
            cwh0VarQ.o(0.429f, -0.28f, 0.54f, -0.83f);
            cwh0VarQ.i(1.26f);
            cwh0VarQ.j(6.808f, 8.0f);
            cwh0VarQ.i(-1.45f);
            cwh0VarQ.e();
            a180.a(a180Var, cwh0VarQ.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            eso1.a = b180VarB;
        }
        b180 b180VarB2 = hso1.a;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.PlaybackSpeed1Point3x24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
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
            cwh0VarQ2.l(17.95f, 12.64f);
            cwh0VarQ2.c(5.5f, 5.5f, false, true, -2.095f, -0.4f);
            cwh0VarQ2.o(-0.976f, -0.417f, -1.393f, -0.929f);
            cwh0VarQ2.v(-2.4f);
            cwh0VarQ2.o(0.433f, 0.768f, 1.36f, 1.264f);
            cwh0VarQ2.o(0.93f, 0.48f, 1.905f, 0.48f);
            cwh0VarQ2.o(0.639f, 0.0f, 1.104f, -0.208f);
            cwh0VarQ2.o(0.48f, -0.224f, 0.736f, -0.608f);
            cwh0VarQ2.o(0.256f, -0.4f, 0.256f, -0.944f);
            cwh0VarQ2.o(0.0f, -0.848f, -0.625f, -1.28f);
            cwh0VarQ2.o(-0.624f, -0.432f, -2.064f, -0.432f);
            cwh0VarQ2.i(-0.56f);
            cwh0VarQ2.j(16.574f, 5.84f);
            cwh0VarQ2.k(2.738f, -2.96f);
            rjx.s(cwh0VarQ2, -4.674f, 14.638f, 1.007f, 7.057f);
            cwh0VarQ2.v(1.968f);
            cwh0VarQ2.k(-2.631f, 2.809f);
            cwh0VarQ2.o(1.386f, 0.255f, 2.15f, 1.063f);
            cwh0VarQ2.o(0.833f, 0.864f, 0.833f, 2.208f);
            cwh0VarQ2.c(3.2f, 3.2f, false, true, -0.544f, 1.808f);
            cwh0VarQ2.o(-0.528f, 0.816f, -1.473f, 1.296f);
            cwh0VarQ2.o(-0.927f, 0.48f, -2.08f, 0.48f);
            cwh0VarQ2.e();
            cwh0VarQ2.l(11.802f, 12.527f);
            cwh0VarQ2.c(1.5f, 1.5f, false, true, -0.688f, -0.16f);
            cwh0VarQ2.c(1.4f, 1.4f, false, true, -0.512f, -0.464f);
            cwh0VarQ2.c(1.3f, 1.3f, false, true, -0.176f, -0.672f);
            cwh0VarQ2.o(0.0f, -0.352f, 0.176f, -0.64f);
            cwh0VarQ2.o(0.192f, -0.288f, 0.512f, -0.448f);
            cwh0VarQ2.c(1.4f, 1.4f, false, true, 1.36f, 0.0f);
            cwh0VarQ2.o(0.303f, 0.16f, 0.48f, 0.448f);
            cwh0VarQ2.o(0.192f, 0.288f, 0.192f, 0.64f);
            cwh0VarQ2.s(-0.192f, 0.656f);
            cwh0VarQ2.c(1.3f, 1.3f, false, true, -0.48f, 0.48f);
            cwh0VarQ2.c(1.4f, 1.4f, false, true, -0.672f, 0.16f);
            cwh0VarQ2.l(6.526f, 4.351f);
            cwh0VarQ2.j(3.774f, 4.351f);
            cwh0VarQ2.j(3.774f, 2.895f);
            cwh0VarQ2.o(1.488f, -0.096f, 2.16f, -0.544f);
            cwh0VarQ2.o(0.689f, -0.463f, 0.848f, -1.344f);
            cwh0VarQ2.j(8.59f, 1.007f);
            cwh0VarQ2.v(11.36f);
            cwh0VarQ2.j(6.526f, 12.367f);
            cwh0VarQ2.e();
            a180.a(a180Var2, cwh0VarQ2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            hso1.a = b180VarB2;
        }
        c = new iqx(new dsx(b180VarB, b180VarB2), null);
        CREATOR = new dqx((byte) 4);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof iqx);
    }

    public final int hashCode() {
        return -214415493;
    }

    public final String toString() {
        return "PlaybackSpeed1Point3x";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
