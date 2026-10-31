package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class oqx extends hux {
    public static final Parcelable.Creator<oqx> CREATOR;
    public static final oqx c;

    static {
        b180 b180VarB = yto1.a;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.PlaybackSpeed1Point9x16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
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
            cwh0VarQ.l(8.273f, 8.1f);
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
            cwh0VarQ.m(2.872f, -0.1f);
            cwh0VarQ.o(0.5f, 0.17f, 1.02f, 0.17f);
            cwh0VarQ.o(1.01f, 0.0f, 1.71f, -0.49f);
            cwh0VarQ.o(0.7f, -0.5f, 1.06f, -1.4f);
            cwh0VarQ.o(0.36f, -0.91f, 0.36f, -2.13f);
            cwh0VarQ.o(0.0f, -0.86f, -0.23f, -1.55f);
            cwh0VarQ.o(-0.231f, -0.69f, -0.66f, -1.13f);
            cwh0VarQ.c(2.26f, 2.26f, false, false, -0.85f, -0.55f);
            cwh0VarQ.c(3.0f, 3.0f, false, false, -1.1f, -0.19f);
            cwh0VarQ.o(-0.801f, 0.0f, -1.38f, 0.37f);
            cwh0VarQ.o(-0.58f, 0.36f, -0.88f, 0.95f);
            cwh0VarQ.s(-0.3f, 1.25f);
            cwh0VarQ.s(0.27f, 1.19f);
            cwh0VarQ.o(0.27f, 0.52f, 0.79f, 0.82f);
            cwh0VarQ.o(0.519f, 0.3f, 1.23f, 0.3f);
            cwh0VarQ.o(0.45f, 0.0f, 0.81f, -0.17f);
            cwh0VarQ.s(0.59f, -0.44f);
            cwh0VarQ.o(0.138f, -0.162f, 0.218f, -0.332f);
            cwh0VarQ.c(3.4f, 3.4f, false, true, -0.178f, 1.062f);
            cwh0VarQ.o(-0.19f, 0.53f, -0.59f, 0.81f);
            cwh0VarQ.o(-0.39f, 0.27f, -0.98f, 0.27f);
            cwh0VarQ.c(2.5f, 2.5f, false, true, -0.98f, -0.22f);
            cwh0VarQ.o(-0.5f, -0.23f, -0.77f, -0.59f);
            cwh0VarQ.v(1.57f);
            cwh0VarQ.o(0.339f, 0.27f, 0.84f, 0.43f);
            cwh0VarQ.m(2.01f, -3.7f);
            cwh0VarQ.o(-0.26f, 0.15f, -0.62f, 0.15f);
            cwh0VarQ.o(-0.37f, 0.0f, -0.64f, -0.15f);
            cwh0VarQ.c(1.1f, 1.1f, false, true, -0.4f, -0.43f);
            cwh0VarQ.c(1.4f, 1.4f, false, true, -0.13f, -0.61f);
            cwh0VarQ.o(0.0f, -0.36f, 0.13f, -0.64f);
            cwh0VarQ.c(1.0f, 1.0f, false, true, 0.4f, -0.44f);
            cwh0VarQ.o(0.27f, -0.16f, 0.64f, -0.16f);
            cwh0VarQ.o(0.36f, 0.0f, 0.62f, 0.17f);
            cwh0VarQ.o(0.27f, 0.16f, 0.41f, 0.44f);
            cwh0VarQ.s(0.14f, 0.63f);
            cwh0VarQ.o(0.0f, 0.33f, -0.14f, 0.61f);
            cwh0VarQ.c(1.06f, 1.06f, false, true, -0.41f, 0.43f);
            cwh0VarQ.l(3.118f, 3.1f);
            cwh0VarQ.u(2.07f);
            cwh0VarQ.o(0.94f, -0.06f, 1.37f, -0.34f);
            cwh0VarQ.s(0.54f, -0.83f);
            cwh0VarQ.i(1.26f);
            cwh0VarQ.u(8.0f);
            cwh0VarQ.i(-1.45f);
            cwh0VarQ.u(3.1f);
            cwh0VarQ.e();
            a180.a(a180Var, cwh0VarQ.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            yto1.a = b180VarB;
        }
        b180 b180VarB2 = buo1.a;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.PlaybackSpeed1Point9x24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
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
            cwh0VarQ2.l(10.993f, 12.527f);
            cwh0VarQ2.o(-0.367f, 0.0f, -0.688f, -0.16f);
            cwh0VarQ2.c(1.44f, 1.44f, false, true, -0.511f, -0.464f);
            cwh0VarQ2.c(1.3f, 1.3f, false, true, -0.177f, -0.672f);
            cwh0VarQ2.o(0.001f, -0.352f, 0.176f, -0.64f);
            cwh0VarQ2.o(0.193f, -0.288f, 0.513f, -0.448f);
            cwh0VarQ2.c(1.4f, 1.4f, false, true, 1.359f, 0.0f);
            cwh0VarQ2.o(0.304f, 0.16f, 0.48f, 0.448f);
            cwh0VarQ2.o(0.193f, 0.288f, 0.193f, 0.64f);
            cwh0VarQ2.s(-0.192f, 0.656f);
            cwh0VarQ2.c(1.3f, 1.3f, false, true, -0.48f, 0.48f);
            cwh0VarQ2.c(1.4f, 1.4f, false, true, -0.673f, 0.16f);
            cwh0VarQ2.m(4.565f, -0.16f);
            cwh0VarQ2.c(4.9f, 4.9f, false, false, 1.6f, 0.272f);
            cwh0VarQ2.o(1.584f, 0.0f, 2.688f, -0.784f);
            cwh0VarQ2.o(1.105f, -0.8f, 1.648f, -2.24f);
            cwh0VarQ2.o(0.56f, -1.456f, 0.56f, -3.424f);
            cwh0VarQ2.o(0.0f, -1.407f, -0.368f, -2.496f);
            cwh0VarQ2.o(-0.352f, -1.103f, -1.024f, -1.808f);
            cwh0VarQ2.c(3.9f, 3.9f, false, false, -1.328f, -0.848f);
            cwh0VarQ2.o(-0.752f, -0.303f, -1.712f, -0.304f);
            cwh0VarQ2.o(-1.248f, 0.0f, -2.16f, 0.592f);
            cwh0VarQ2.c(3.8f, 3.8f, false, false, -1.392f, 1.52f);
            cwh0VarQ2.c(4.4f, 4.4f, false, false, -0.464f, 1.984f);
            cwh0VarQ2.o(0.0f, 1.04f, 0.432f, 1.888f);
            cwh0VarQ2.o(0.433f, 0.849f, 1.264f, 1.344f);
            cwh0VarQ2.o(0.832f, 0.48f, 1.968f, 0.48f);
            cwh0VarQ2.o(0.72f, 0.0f, 1.312f, -0.272f);
            cwh0VarQ2.c(2.8f, 2.8f, false, false, 0.96f, -0.736f);
            cwh0VarQ2.o(0.255f, -0.298f, 0.384f, -0.61f);
            cwh0VarQ2.o(-0.02f, 1.107f, -0.32f, 1.906f);
            cwh0VarQ2.o(-0.32f, 0.896f, -0.976f, 1.376f);
            cwh0VarQ2.o(-0.655f, 0.465f, -1.6f, 0.464f);
            cwh0VarQ2.o(-0.751f, 0.0f, -1.552f, -0.368f);
            cwh0VarQ2.o(-0.8f, -0.367f, -1.232f, -0.96f);
            cwh0VarQ2.v(2.32f);
            cwh0VarQ2.o(0.529f, 0.432f, 1.312f, 0.704f);
            cwh0VarQ2.m(3.264f, -5.808f);
            cwh0VarQ2.o(-0.464f, 0.273f, -1.088f, 0.272f);
            cwh0VarQ2.o(-0.639f, 0.0f, -1.104f, -0.256f);
            cwh0VarQ2.c(1.83f, 1.83f, false, true, -0.688f, -0.736f);
            cwh0VarQ2.c(2.4f, 2.4f, false, true, -0.24f, -1.088f);
            cwh0VarQ2.o(0.0f, -0.607f, 0.24f, -1.104f);
            cwh0VarQ2.o(0.24f, -0.495f, 0.688f, -0.768f);
            cwh0VarQ2.o(0.465f, -0.272f, 1.104f, -0.272f);
            cwh0VarQ2.o(0.64f, 0.0f, 1.088f, 0.288f);
            cwh0VarQ2.o(0.465f, 0.289f, 0.704f, 0.784f);
            cwh0VarQ2.o(0.256f, 0.48f, 0.256f, 1.088f);
            cwh0VarQ2.o(0.0f, 0.576f, -0.256f, 1.04f);
            cwh0VarQ2.o(-0.24f, 0.464f, -0.704f, 0.752f);
            cwh0VarQ2.l(2.966f, 4.351f);
            cwh0VarQ2.j(2.966f, 2.895f);
            cwh0VarQ2.o(1.488f, -0.096f, 2.16f, -0.544f);
            cwh0VarQ2.o(0.688f, -0.463f, 0.848f, -1.344f);
            rjx.w(cwh0VarQ2, 1.808f, 11.36f, 5.718f, 12.367f);
            cwh0VarQ2.j(5.718f, 4.351f);
            cwh0VarQ2.e();
            a180.a(a180Var2, cwh0VarQ2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            buo1.a = b180VarB2;
        }
        c = new oqx(new dsx(b180VarB, b180VarB2), null);
        CREATOR = new dqx((byte) 10);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof oqx);
    }

    public final int hashCode() {
        return -214415307;
    }

    public final String toString() {
        return "PlaybackSpeed1Point9x";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
