package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rpx extends hux {
    public static final Parcelable.Creator<rpx> CREATOR;
    public static final rpx c;
    public static final byte d;

    static {
        b180 b180VarB = zmo1.a;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Parental16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            long j = u7h.b;
            n6a1 n6a1Var = new n6a1(j);
            cwh0 cwh0VarG = lf51.g(5.913f, 0.371f);
            cwh0VarG.c(4.39f, 4.39f, false, true, 5.002f, 1.052f);
            cwh0VarG.g(0.421f, 0.459f, 0.713f, 0.993f, 0.904f, 1.555f);
            cwh0VarG.g(0.143f, 0.42f, 0.263f, 1.173f, 0.22f, 1.893f);
            cwh0VarG.o(-0.015f, 0.255f, -0.054f, 0.496f);
            cwh0VarG.c(4.0f, 4.0f, false, false, -0.42f, -0.023f);
            cwh0VarG.o(-0.587f, 0.002f, -1.142f, 0.162f);
            cwh0VarG.o(0.095f, -0.348f, 0.119f, -0.724f);
            cwh0VarG.g(0.032f, -0.54f, -0.067f, -1.097f, -0.144f, -1.323f);
            cwh0VarG.c(2.85f, 2.85f, false, false, -0.587f, -1.021f);
            cwh0VarG.b(2.9f, 2.9f, false, false, 7.68f, 1.5f);
            cwh0VarG.c(2.9f, 2.9f, false, false, -2.131f, 0.938f);
            cwh0VarG.c(2.85f, 2.85f, false, false, -0.588f, 1.021f);
            cwh0VarG.g(-0.077f, 0.226f, -0.175f, 0.783f, -0.143f, 1.323f);
            cwh0VarG.g(0.054f, 0.921f, 0.44f, 1.713f, 1.051f, 2.443f);
            cwh0VarG.i(0.002f);
            cwh0VarG.j(6.0f, 7.379f);
            cwh0VarG.c(2.25f, 2.25f, false, true, 0.487f, 1.836f);
            cwh0VarG.c(2.25f, 2.25f, false, true, -1.09f, 1.555f);
            cwh0VarG.k(-2.208f, 1.274f);
            cwh0VarG.b(3.25f, 3.25f, false, false, 1.582f, 14.5f);
            cwh0VarG.i(4.169f);
            cwh0VarG.o(-0.061f, 0.371f, -0.062f, 0.75f);
            cwh0VarG.u(16.0f);
            cwh0VarG.h(0.063f);
            cwh0VarG.v(-1.142f);
            cwh0VarG.c(4.75f, 4.75f, false, true, 2.375f, -4.114f);
            cwh0VarG.j(4.646f, 9.47f);
            cwh0VarG.c(0.75f, 0.75f, false, false, 0.35f, -0.842f);
            cwh0VarG.c(0.75f, 0.75f, false, false, -0.148f, -0.288f);
            cwh0VarG.k(-0.126f, -0.151f);
            cwh0VarG.g(-0.761f, -0.908f, -1.323f, -1.995f, -1.4f, -3.317f);
            cwh0VarG.g(-0.044f, -0.72f, 0.076f, -1.472f, 0.219f, -1.893f);
            cwh0VarG.c(4.35f, 4.35f, false, true, 0.904f, -1.555f);
            cwh0VarG.g(0.411f, -0.448f, 0.91f, -0.807f, 1.468f, -1.052f);
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            n6a1 n6a1Var2 = new n6a1(j);
            cwh0 cwh0VarG2 = lf51.g(11.565f, 6.844f);
            cwh0VarG2.c(2.66f, 2.66f, false, true, 2.52f, 1.816f);
            cwh0VarG2.g(0.112f, 0.366f, 0.158f, 0.75f, 0.135f, 1.132f);
            cwh0VarG2.c(3.33f, 3.33f, false, true, -0.822f, 1.958f);
            cwh0VarG2.c(0.1f, 0.1f, false, false, -0.024f, 0.047f);
            cwh0VarG2.c(0.13f, 0.13f, false, false, 0.06f, 0.144f);
            cwh0VarG2.k(0.922f, 0.532f);
            cwh0VarG2.v(-0.004f);
            cwh0VarG2.c(3.2f, 3.2f, false, true, 1.584f, 2.781f);
            cwh0VarG2.u(16.0f);
            cwh0VarG2.h(7.19f);
            cwh0VarG2.v(-0.75f);
            cwh0VarG2.c(3.2f, 3.2f, false, true, 1.583f, -2.772f);
            cwh0VarG2.k(0.923f, -0.533f);
            cwh0VarG2.c(0.1f, 0.1f, false, false, 0.041f, -0.039f);
            cwh0VarG2.c(0.13f, 0.13f, false, false, -0.007f, -0.158f);
            cwh0VarG2.c(3.32f, 3.32f, false, true, -0.82f, -1.955f);
            cwh0VarG2.c(3.3f, 3.3f, false, true, 0.134f, -1.133f);
            cwh0VarG2.c(2.66f, 2.66f, false, true, 2.52f, -1.816f);
            cwh0VarG2.m(-0.003f, 1.498f);
            cwh0VarG2.c(1.2f, 1.2f, false, false, -0.472f, 0.097f);
            cwh0VarG2.c(1.12f, 1.12f, false, false, -0.627f, 0.699f);
            cwh0VarG2.c(1.8f, 1.8f, false, false, -0.057f, 0.563f);
            cwh0VarG2.c(1.8f, 1.8f, false, false, 0.474f, 1.081f);
            cwh0VarG2.c(1.63f, 1.63f, false, true, -0.436f, 2.458f);
            cwh0VarG2.k(-0.923f, 0.533f);
            cwh0VarG2.g(-0.29f, 0.168f, -0.522f, 0.42f, -0.665f, 0.723f);
            cwh0VarG2.k(5.413f, -0.003f);
            cwh0VarG2.c(1.66f, 1.66f, false, false, -0.665f, -0.723f);
            cwh0VarG2.k(-0.921f, -0.533f);
            cwh0VarG2.c(1.63f, 1.63f, false, true, -0.79f, -1.126f);
            cwh0VarG2.c(1.63f, 1.63f, false, true, 0.352f, -1.33f);
            cwh0VarG2.c(1.8f, 1.8f, false, false, 0.475f, -1.084f);
            cwh0VarG2.c(1.8f, 1.8f, false, false, -0.057f, -0.561f);
            cwh0VarG2.c(1.1f, 1.1f, false, false, -0.237f, -0.417f);
            cwh0VarG2.c(1.2f, 1.2f, false, false, -0.392f, -0.28f);
            cwh0VarG2.c(1.2f, 1.2f, false, false, -0.473f, -0.097f);
            a180.a(a180Var, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            zmo1.a = b180VarB;
        }
        b180 b180VarB2 = bno1.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Parental24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            long j2 = u7h.b;
            n6a1 n6a1Var3 = new n6a1(j2);
            cwh0 cwh0VarG3 = lf51.g(11.273f, 2.0f);
            cwh0VarG3.c(5.5f, 5.5f, false, true, 4.05f, 1.781f);
            cwh0VarG3.c(5.4f, 5.4f, false, true, 1.13f, 1.946f);
            cwh0VarG3.g(0.143f, 0.42f, 0.265f, 1.1f, 0.283f, 1.816f);
            cwh0VarG3.c(6.3f, 6.3f, false, false, -1.903f, 0.067f);
            cwh0VarG3.g(-0.012f, -0.541f, -0.106f, -1.043f, -0.183f, -1.271f);
            cwh0VarG3.c(3.5f, 3.5f, false, false, -0.731f, -1.27f);
            cwh0VarG3.c(3.59f, 3.59f, false, false, -5.293f, 0.0f);
            cwh0VarG3.c(3.5f, 3.5f, false, false, -0.731f, 1.27f);
            cwh0VarG3.g(-0.096f, 0.28f, -0.217f, 0.972f, -0.178f, 1.644f);
            cwh0VarG3.g(0.068f, 1.146f, 0.548f, 2.129f, 1.31f, 3.039f);
            cwh0VarG3.k(0.001f, 0.001f);
            cwh0VarG3.k(0.496f, 0.597f);
            cwh0VarG3.c(2.383f, 2.383f, false, true, -0.637f, 3.587f);
            cwh0VarG3.k(-3.805f, 2.196f);
            cwh0VarG3.c(2.86f, 2.86f, false, false, -1.429f, 2.474f);
            cwh0VarG3.v(0.222f);
            cwh0VarG3.i(3.929f);
            cwh0VarG3.c(6.5f, 6.5f, false, false, -0.082f, 1.02f);
            cwh0VarG3.v(0.884f);
            cwh0VarG3.h(1.748f);
            cwh0VarG3.v(-2.127f);
            cwh0VarG3.c(4.76f, 4.76f, false, true, 2.38f, -4.123f);
            cwh0VarG3.k(3.806f, -2.196f);
            cwh0VarG3.c(0.48f, 0.48f, false, false, 0.222f, -0.536f);
            cwh0VarG3.c(0.5f, 0.5f, false, false, -0.094f, -0.182f);
            cwh0VarG3.k(-0.494f, -0.592f);
            cwh0VarG3.k(-0.002f, -0.002f);
            cwh0VarG3.g(-0.952f, -1.135f, -1.652f, -2.495f, -1.75f, -4.148f);
            cwh0VarG3.g(-0.054f, -0.902f, 0.096f, -1.844f, 0.276f, -2.372f);
            cwh0VarG3.c(5.4f, 5.4f, false, true, 1.13f, -1.944f);
            cwh0VarG3.b(5.5f, 5.5f, false, true, 11.273f, 2.0f);
            a180.a(a180Var2, cwh0VarG3.a, n6a1Var3, 1.0f, 2, 1.0f);
            n6a1 n6a1Var4 = new n6a1(j2);
            cwh0 cwh0VarG4 = lf51.g(16.005f, 10.0f);
            cwh0VarG4.o(0.153f, 0.0f, 0.305f, 0.013f);
            cwh0VarG4.i(0.007f);
            cwh0VarG4.c(3.7f, 3.7f, false, true, 1.788f, 0.633f);
            cwh0VarG4.c(3.45f, 3.45f, false, true, 1.308f, 1.698f);
            cwh0VarG4.g(0.151f, 0.475f, 0.214f, 0.972f, 0.185f, 1.469f);
            cwh0VarG4.c(4.2f, 4.2f, false, true, -0.947f, 2.343f);
            cwh0VarG4.c(4.0f, 4.0f, false, true, -0.171f, 0.203f);
            cwh0VarG4.c(0.26f, 0.26f, false, false, -0.062f, 0.113f);
            cwh0VarG4.c(0.28f, 0.28f, false, false, 0.012f, 0.19f);
            cwh0VarG4.o(0.04f, 0.092f, 0.131f, 0.142f);
            cwh0VarG4.k(1.294f, 0.712f);
            cwh0VarG4.o(0.248f, 0.14f, 0.475f, 0.31f);
            cwh0VarG4.g(0.445f, 0.332f, 0.82f, 0.746f, 1.1f, 1.218f);
            cwh0VarG4.g(0.377f, 0.632f, 0.574f, 1.348f, 0.57f, 2.075f);
            cwh0VarG4.u(22.0f);
            cwh0VarG4.h(10.0f);
            cwh0VarG4.v(-0.88f);
            cwh0VarG4.o(0.0f, -0.264f, 0.032f, -0.521f);
            cwh0VarG4.c(4.0f, 4.0f, false, true, 0.541f, -1.555f);
            cwh0VarG4.c(4.26f, 4.26f, false, true, 1.581f, -1.527f);
            cwh0VarG4.k(1.292f, -0.712f);
            cwh0VarG4.c(0.29f, 0.29f, false, false, 0.145f, -0.332f);
            cwh0VarG4.c(0.3f, 0.3f, false, false, -0.062f, -0.114f);
            cwh0VarG4.c(4.22f, 4.22f, false, true, -1.117f, -2.544f);
            cwh0VarG4.g(-0.03f, -0.497f, 0.034f, -0.995f, 0.186f, -1.471f);
            cwh0VarG4.c(3.43f, 3.43f, false, true, 1.085f, -1.531f);
            cwh0VarG4.k(0.002f, -0.003f);
            cwh0VarG4.o(0.105f, -0.085f, 0.22f, -0.164f);
            cwh0VarG4.k(0.042f, -0.026f);
            cwh0VarG4.o(0.257f, -0.17f, 0.54f, -0.296f);
            cwh0VarG4.g(0.473f, -0.21f, 0.99f, -0.324f, 1.518f, -0.324f);
            cwh0VarG4.m(0.006f, 1.769f);
            cwh0VarG4.g(-0.245f, 0.0f, -0.487f, 0.048f, -0.711f, 0.141f);
            cwh0VarG4.k(-0.086f, 0.04f);
            cwh0VarG4.o(-0.287f, 0.136f, -0.502f, 0.363f);
            cwh0VarG4.c(1.6f, 1.6f, false, false, -0.361f, 0.598f);
            cwh0VarG4.c(2.3f, 2.3f, false, false, -0.018f, 1.235f);
            cwh0VarG4.g(0.106f, 0.405f, 0.32f, 0.778f, 0.622f, 1.081f);
            cwh0VarG4.c(2.04f, 2.04f, false, true, 0.43f, 0.79f);
            cwh0VarG4.g(0.08f, 0.29f, 0.094f, 0.595f, 0.039f, 0.89f);
            cwh0VarG4.c(2.0f, 2.0f, false, true, -0.358f, 0.822f);
            cwh0VarG4.g(-0.18f, 0.245f, -0.416f, 0.45f, -0.688f, 0.6f);
            cwh0VarG4.k(-1.291f, 0.712f);
            cwh0VarG4.g(-0.487f, 0.27f, -0.862f, 0.693f, -1.063f, 1.195f);
            cwh0VarG4.i(7.97f);
            cwh0VarG4.c(2.3f, 2.3f, false, false, -0.297f, -0.527f);
            cwh0VarG4.c(2.4f, 2.4f, false, false, -0.763f, -0.668f);
            cwh0VarG4.k(-1.292f, -0.712f);
            cwh0VarG4.c(2.1f, 2.1f, false, true, -0.688f, -0.6f);
            cwh0VarG4.c(1.96f, 1.96f, false, true, -0.377f, -1.37f);
            cwh0VarG4.c(2.0f, 2.0f, false, true, 0.132f, -0.553f);
            cwh0VarG4.c(2.0f, 2.0f, false, true, 0.356f, -0.576f);
            cwh0VarG4.k(0.05f, -0.056f);
            cwh0VarG4.k(0.099f, -0.115f);
            cwh0VarG4.c(2.5f, 2.5f, false, false, 0.544f, -1.349f);
            cwh0VarG4.g(0.015f, -0.27f, -0.014f, -0.54f, -0.087f, -0.8f);
            cwh0VarG4.c(1.6f, 1.6f, false, false, -0.361f, -0.598f);
            cwh0VarG4.c(1.7f, 1.7f, false, false, -0.588f, -0.402f);
            cwh0VarG4.c(1.9f, 1.9f, false, false, -0.711f, -0.141f);
            a180.a(a180Var2, cwh0VarG4.a, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            bno1.b = b180VarB2;
        }
        c = new rpx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new yox((byte) 18);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof rpx);
    }

    public final int hashCode() {
        return 273992362;
    }

    public final String toString() {
        return "Parental";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
