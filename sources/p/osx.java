package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class osx extends hux {
    public static final Parcelable.Creator<osx> CREATOR;
    public static final osx c;
    public static final byte d;

    static {
        b180 b180VarB = e6p1.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.SongDna16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(10.261f, 14.83f);
            cwh0VarG.g(0.243f, -0.37f, 0.432f, -0.817f, 0.596f, -1.41f);
            cwh0VarG.k(0.016f, -0.055f);
            cwh0VarG.g(0.1f, -0.346f, 0.194f, -0.674f, 0.412f, -0.992f);
            cwh0VarG.c(3.7f, 3.7f, false, true, 1.246f, -1.132f);
            cwh0VarG.g(0.197f, -0.108f, 0.4f, -0.209f, 0.598f, -0.306f);
            cwh0VarG.g(0.522f, -0.256f, 1.06f, -0.52f, 1.471f, -0.94f);
            cwh0VarG.g(0.32f, -0.322f, 0.535f, -0.725f, 0.625f, -1.164f);
            cwh0VarG.g(0.084f, -0.412f, 0.057f, -0.85f, -0.077f, -1.265f);
            cwh0VarG.c(2.5f, 2.5f, false, false, -0.69f, -1.084f);
            cwh0VarG.c(2.35f, 2.35f, false, false, -1.202f, -0.585f);
            cwh0VarG.k(-0.004f, -0.001f);
            cwh0VarG.g(-0.899f, -0.158f, -1.528f, 0.088f, -2.324f, 0.4f);
            cwh0VarG.k(-0.343f, 0.132f);
            cwh0VarG.o(-0.222f, 0.083f, -0.44f, 0.168f);
            cwh0VarG.g(-0.43f, 0.165f, -0.876f, 0.336f, -1.324f, 0.465f);
            cwh0VarG.c(5.8f, 5.8f, false, true, -1.528f, 0.233f);
            cwh0VarG.i(-0.002f);
            cwh0VarG.g(-0.497f, -0.004f, -1.177f, -0.008f, -1.607f, -0.324f);
            cwh0VarG.g(-0.326f, -0.246f, -0.429f, -0.76f, -0.23f, -1.146f);
            cwh0VarG.o(0.133f, -0.256f, 0.463f, -0.43f);
            cwh0VarG.g(0.345f, -0.182f, 0.713f, -0.215f, 1.069f, -0.247f);
            cwh0VarG.g(0.158f, -0.014f, 0.322f, -0.028f, 0.48f, -0.056f);
            cwh0VarG.i(0.001f);
            cwh0VarG.g(1.424f, -0.227f, 1.971f, -0.708f, 2.259f, -1.05f);
            cwh0VarG.k(0.001f, -0.003f);
            cwh0VarG.g(0.475f, -0.543f, 0.669f, -1.24f, 0.547f, -1.963f);
            cwh0VarG.b(2.52f, 2.52f, false, false, 9.057f, 0.315f);
            cwh0VarG.j(9.055f, 0.312f);
            cwh0VarG.c(2.34f, 2.34f, false, false, -1.32f, -0.31f);
            cwh0VarG.c(2.5f, 2.5f, false, false, -1.301f, 0.442f);
            cwh0VarG.k(-0.002f, 0.001f);
            cwh0VarG.f(5.675f, 0.953f, 5.337f, 1.9f, 5.15f, 2.57f);
            cwh0VarG.k(-0.028f, 0.096f);
            cwh0VarG.g(-0.09f, 0.31f, -0.174f, 0.602f, -0.36f, 0.893f);
            cwh0VarG.g(-0.307f, 0.48f, -0.747f, 0.891f, -1.271f, 1.188f);
            cwh0VarG.k(-0.002f, 0.001f);
            cwh0VarG.g(-0.187f, 0.102f, -0.384f, 0.2f, -0.575f, 0.294f);
            cwh0VarG.g(-0.75f, 0.37f, -1.524f, 0.754f, -1.91f, 1.512f);
            cwh0VarG.k(-0.002f, 0.004f);
            cwh0VarG.g(-0.309f, 0.556f, -0.359f, 1.25f, -0.137f, 1.9f);
            cwh0VarG.g(0.228f, 0.673f, 0.708f, 1.21f, 1.317f, 1.474f);
            cwh0VarG.g(0.575f, 0.249f, 1.267f, 0.287f, 1.95f, 0.106f);
            cwh0VarG.g(0.305f, -0.085f, 0.585f, -0.195f, 0.882f, -0.312f);
            cwh0VarG.o(0.207f, -0.082f, 0.426f, -0.164f);
            cwh0VarG.g(0.183f, -0.066f, 0.37f, -0.139f, 0.552f, -0.209f);
            cwh0VarG.g(0.572f, -0.221f, 1.165f, -0.45f, 1.771f, -0.553f);
            cwh0VarG.i(0.002f);
            cwh0VarG.g(0.435f, -0.066f, 0.887f, -0.072f, 1.313f, -0.072f);
            cwh0VarG.i(0.003f);
            cwh0VarG.g(0.395f, 0.008f, 1.131f, 0.022f, 1.444f, 0.531f);
            cwh0VarG.k(0.003f, 0.004f);
            cwh0VarG.c(0.98f, 0.98f, false, true, 0.026f, 0.905f);
            cwh0VarG.v(0.002f);
            cwh0VarG.o(-0.197f, 0.37f, -0.763f, 0.557f);
            cwh0VarG.i(-0.002f);
            cwh0VarG.c(3.4f, 3.4f, false, true, -0.718f, 0.118f);
            cwh0VarG.o(-0.159f, 0.013f, -0.319f, 0.033f);
            cwh0VarG.g(-1.625f, 0.209f, -2.22f, 0.752f, -2.526f, 1.143f);
            cwh0VarG.c(2.37f, 2.37f, false, false, -0.514f, 1.793f);
            cwh0VarG.c(2.57f, 2.57f, false, false, 1.002f, 1.72f);
            cwh0VarG.c(2.43f, 2.43f, false, false, 2.386f, 0.273f);
            cwh0VarG.g(0.475f, -0.19f, 0.854f, -0.51f, 1.16f, -0.976f);
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            e6p1.b = b180VarB;
        }
        b180 b180VarB2 = g6p1.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.SongDna24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(15.11f, 21.391f);
            cwh0VarG2.g(0.332f, -0.507f, 0.593f, -1.123f, 0.818f, -1.937f);
            cwh0VarG2.k(0.022f, -0.076f);
            cwh0VarG2.g(0.137f, -0.477f, 0.267f, -0.927f, 0.567f, -1.365f);
            cwh0VarG2.c(5.06f, 5.06f, false, true, 1.713f, -1.557f);
            cwh0VarG2.g(0.27f, -0.149f, 0.551f, -0.287f, 0.823f, -0.42f);
            cwh0VarG2.g(0.716f, -0.352f, 1.458f, -0.716f, 2.023f, -1.292f);
            cwh0VarG2.g(0.438f, -0.444f, 0.734f, -0.997f, 0.858f, -1.6f);
            cwh0VarG2.g(0.115f, -0.569f, 0.08f, -1.17f, -0.106f, -1.74f);
            cwh0VarG2.c(3.5f, 3.5f, false, false, -0.95f, -1.491f);
            cwh0VarG2.c(3.23f, 3.23f, false, false, -1.65f, -0.805f);
            cwh0VarG2.k(-0.007f, -0.001f);
            cwh0VarG2.g(-1.235f, -0.218f, -2.1f, 0.12f, -3.195f, 0.549f);
            cwh0VarG2.o(-0.229f, 0.09f, -0.471f, 0.182f);
            cwh0VarG2.k(-0.607f, 0.23f);
            cwh0VarG2.g(-0.591f, 0.228f, -1.203f, 0.463f, -1.819f, 0.641f);
            cwh0VarG2.c(8.0f, 8.0f, false, true, -2.1f, 0.32f);
            cwh0VarG2.i(-0.004f);
            cwh0VarG2.g(-0.683f, -0.005f, -1.619f, -0.011f, -2.209f, -0.445f);
            cwh0VarG2.g(-0.448f, -0.338f, -0.59f, -1.044f, -0.317f, -1.576f);
            cwh0VarG2.o(0.184f, -0.35f, 0.637f, -0.59f);
            cwh0VarG2.g(0.474f, -0.252f, 0.98f, -0.297f, 1.47f, -0.34f);
            cwh0VarG2.g(0.217f, -0.02f, 0.442f, -0.04f, 0.659f, -0.078f);
            cwh0VarG2.i(0.003f);
            cwh0VarG2.g(1.957f, -0.312f, 2.71f, -0.974f, 3.105f, -1.445f);
            cwh0VarG2.k(0.002f, -0.003f);
            cwh0VarG2.c(3.21f, 3.21f, false, false, 0.751f, -2.7f);
            cwh0VarG2.c(3.47f, 3.47f, false, false, -1.673f, -2.42f);
            cwh0VarG2.k(-0.002f, -0.001f);
            cwh0VarG2.c(3.2f, 3.2f, false, false, -1.816f, -0.426f);
            cwh0VarG2.c(3.44f, 3.44f, false, false, -1.788f, 0.607f);
            cwh0VarG2.k(-0.003f, 0.002f);
            cwh0VarG2.g(-1.04f, 0.696f, -1.505f, 2.0f, -1.765f, 2.918f);
            cwh0VarG2.k(-0.038f, 0.133f);
            cwh0VarG2.g(-0.123f, 0.425f, -0.24f, 0.827f, -0.494f, 1.227f);
            cwh0VarG2.c(5.0f, 5.0f, false, true, -1.748f, 1.634f);
            cwh0VarG2.k(-0.003f, 0.002f);
            cwh0VarG2.g(-0.257f, 0.14f, -0.528f, 0.274f, -0.79f, 0.404f);
            cwh0VarG2.g(-1.03f, 0.51f, -2.096f, 1.036f, -2.626f, 2.078f);
            cwh0VarG2.k(-0.003f, 0.005f);
            cwh0VarG2.g(-0.425f, 0.766f, -0.494f, 1.719f, -0.19f, 2.614f);
            cwh0VarG2.g(0.315f, 0.925f, 0.975f, 1.663f, 1.812f, 2.026f);
            cwh0VarG2.g(0.79f, 0.343f, 1.742f, 0.395f, 2.68f, 0.146f);
            cwh0VarG2.g(0.42f, -0.117f, 0.806f, -0.269f, 1.214f, -0.43f);
            cwh0VarG2.o(0.285f, -0.112f, 0.586f, -0.224f);
            cwh0VarG2.g(0.252f, -0.091f, 0.51f, -0.191f, 0.758f, -0.287f);
            cwh0VarG2.g(0.788f, -0.305f, 1.602f, -0.62f, 2.436f, -0.76f);
            cwh0VarG2.k(0.003f, -0.001f);
            cwh0VarG2.g(0.598f, -0.091f, 1.22f, -0.1f, 1.805f, -0.1f);
            cwh0VarG2.i(0.004f);
            cwh0VarG2.g(0.543f, 0.011f, 1.555f, 0.031f, 1.986f, 0.73f);
            cwh0VarG2.k(0.003f, 0.006f);
            cwh0VarG2.g(0.214f, 0.375f, 0.229f, 0.864f, 0.037f, 1.244f);
            cwh0VarG2.k(-0.002f, 0.003f);
            cwh0VarG2.g(-0.178f, 0.339f, -0.531f, 0.596f, -1.048f, 0.766f);
            cwh0VarG2.i(-0.002f);
            cwh0VarG2.g(-0.328f, 0.103f, -0.664f, 0.133f, -0.988f, 0.162f);
            cwh0VarG2.c(10.0f, 10.0f, false, false, -0.438f, 0.046f);
            cwh0VarG2.g(-2.235f, 0.287f, -3.053f, 1.035f, -3.473f, 1.572f);
            cwh0VarG2.c(3.26f, 3.26f, false, false, -0.708f, 2.465f);
            cwh0VarG2.g(0.116f, 0.928f, 0.618f, 1.79f, 1.378f, 2.364f);
            cwh0VarG2.c(3.34f, 3.34f, false, false, 3.28f, 0.377f);
            cwh0VarG2.k(0.003f, -0.002f);
            cwh0VarG2.g(0.653f, -0.261f, 1.175f, -0.7f, 1.596f, -1.34f);
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            g6p1.b = b180VarB2;
        }
        c = new osx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new jrx((byte) 29);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof osx);
    }

    public final int hashCode() {
        return 1128819917;
    }

    public final String toString() {
        return "SongDna";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
