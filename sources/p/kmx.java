package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kmx extends hux {
    public static final Parcelable.Creator<kmx> CREATOR;
    public static final kmx c;
    public static final byte d;

    static {
        b180 b180VarB = lcc.c;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.DeviceSmartGlasses16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarQ = rjx.q(7.136f, 9.007f, 0.042f, -0.13f);
            cwh0VarQ.k(0.063f, -0.208f);
            cwh0VarQ.c(55.0f, 55.0f, false, false, 0.37f, -1.336f);
            cwh0VarQ.i(0.78f);
            cwh0VarQ.c(55.0f, 55.0f, false, false, 0.434f, 1.544f);
            cwh0VarQ.c(5.0f, 5.0f, false, false, 0.115f, 0.323f);
            cwh0VarQ.g(0.065f, 0.153f, 0.166f, 0.363f, 0.314f, 0.578f);
            cwh0VarQ.g(0.285f, 0.416f, 0.834f, 0.972f, 1.707f, 0.972f);
            cwh0VarQ.c(108.0f, 108.0f, false, false, 1.536f, -0.016f);
            cwh0VarQ.k(0.207f, -0.003f);
            cwh0VarQ.k(0.1f, -0.004f);
            cwh0VarQ.c(2.2f, 2.2f, false, false, 0.907f, -0.263f);
            cwh0VarQ.c(1.9f, 1.9f, false, false, 0.73f, -0.701f);
            cwh0VarQ.g(0.201f, -0.338f, 0.31f, -0.75f, 0.31f, -1.23f);
            cwh0VarQ.j(14.751f, 7.328f);
            cwh0VarQ.g(0.328f, -0.047f, 0.582f, -0.362f, 0.582f, -0.745f);
            cwh0VarQ.g(0.0f, -0.414f, -0.298f, -0.75f, -0.667f, -0.75f);
            cwh0VarQ.i(-0.088f);
            cwh0VarQ.c(1.0f, 1.0f, false, false, -0.15f, -0.209f);
            cwh0VarQ.g(-0.246f, -0.265f, -0.56f, -0.329f, -0.754f, -0.352f);
            cwh0VarQ.c(6.0f, 6.0f, false, false, -0.625f, -0.022f);
            cwh0VarQ.i(-3.014f);
            cwh0VarQ.c(6.0f, 6.0f, false, false, -0.723f, 0.03f);
            cwh0VarQ.g(-0.22f, 0.03f, -0.596f, 0.112f, -0.848f, 0.458f);
            cwh0VarQ.c(1.0f, 1.0f, false, false, -0.062f, 0.095f);
            cwh0VarQ.j(7.6f, 5.833f);
            cwh0VarQ.c(1.0f, 1.0f, false, false, -0.062f, -0.095f);
            cwh0VarQ.g(-0.252f, -0.346f, -0.628f, -0.429f, -0.848f, -0.459f);
            cwh0VarQ.c(6.0f, 6.0f, false, false, -0.723f, -0.029f);
            cwh0VarQ.j(2.953f, 5.25f);
            cwh0VarQ.g(-0.216f, 0.0f, -0.44f, 0.0f, -0.625f, 0.022f);
            cwh0VarQ.g(-0.194f, 0.023f, -0.508f, 0.087f, -0.754f, 0.352f);
            cwh0VarQ.o(-0.09f, 0.101f, -0.15f, 0.21f);
            cwh0VarQ.i(-0.09f);
            cwh0VarQ.g(-0.369f, 0.0f, -0.667f, 0.335f, -0.667f, 0.75f);
            cwh0VarQ.g(0.0f, 0.383f, 0.255f, 0.699f, 0.585f, 0.744f);
            cwh0VarQ.v(1.205f);
            cwh0VarQ.g(0.0f, 0.48f, 0.108f, 0.892f, 0.31f, 1.23f);
            cwh0VarQ.g(0.2f, 0.337f, 0.47f, 0.559f, 0.73f, 0.701f);
            cwh0VarQ.c(2.2f, 2.2f, false, false, 1.007f, 0.267f);
            cwh0VarQ.k(0.206f, 0.003f);
            cwh0VarQ.k(1.536f, 0.016f);
            cwh0VarQ.g(0.873f, 0.0f, 1.422f, -0.556f, 1.708f, -0.972f);
            cwh0VarQ.c(3.3f, 3.3f, false, false, 0.387f, -0.771f);
            cwh0VarQ.l(5.93f, 6.75f);
            cwh0VarQ.k(0.277f, 0.001f);
            cwh0VarQ.c(9.0f, 9.0f, false, true, -0.123f, 0.485f);
            cwh0VarQ.v(0.001f);
            cwh0VarQ.c(54.0f, 54.0f, false, true, -0.35f, 1.226f);
            cwh0VarQ.k(-0.018f, 0.056f);
            cwh0VarQ.c(1.8f, 1.8f, false, true, -0.205f, 0.41f);
            cwh0VarQ.g(-0.158f, 0.23f, -0.31f, 0.321f, -0.47f, 0.321f);
            cwh0VarQ.c(106.0f, 106.0f, false, true, -1.516f, -0.016f);
            cwh0VarQ.k(-0.211f, -0.003f);
            cwh0VarQ.g(-0.014f, -0.001f, -0.056f, -0.004f, -0.087f, -0.01f);
            cwh0VarQ.c(0.7f, 0.7f, false, true, -0.214f, -0.072f);
            cwh0VarQ.c(0.4f, 0.4f, false, true, -0.165f, -0.155f);
            cwh0VarQ.g(-0.042f, -0.071f, -0.097f, -0.208f, -0.097f, -0.46f);
            cwh0VarQ.j(2.751f, 7.065f);
            cwh0VarQ.k(0.001f, -0.315f);
            cwh0VarQ.k(0.234f, -0.001f);
            cwh0VarQ.j(5.93f, 6.749f);
            cwh0VarQ.e();
            cwh0VarQ.l(9.794f, 6.751f);
            cwh0VarQ.j(10.07f, 6.75f);
            cwh0VarQ.i(3.178f);
            cwh0VarQ.k(0.001f, 0.316f);
            cwh0VarQ.v(1.467f);
            cwh0VarQ.g(0.0f, 0.253f, -0.055f, 0.39f, -0.097f, 0.46f);
            cwh0VarQ.c(0.4f, 0.4f, false, true, -0.165f, 0.156f);
            cwh0VarQ.c(0.7f, 0.7f, false, true, -0.214f, 0.073f);
            cwh0VarQ.g(-0.03f, 0.005f, -0.072f, 0.008f, -0.086f, 0.009f);
            cwh0VarQ.k(-0.212f, 0.003f);
            cwh0VarQ.k(-1.515f, 0.016f);
            cwh0VarQ.g(-0.16f, 0.0f, -0.313f, -0.09f, -0.47f, -0.32f);
            cwh0VarQ.c(1.8f, 1.8f, false, true, -0.224f, -0.467f);
            cwh0VarQ.g(-0.01f, -0.034f, -0.04f, -0.127f, -0.067f, -0.219f);
            cwh0VarQ.c(53.0f, 53.0f, false, true, -0.283f, -1.007f);
            cwh0VarQ.v(-0.001f);
            cwh0VarQ.c(9.0f, 9.0f, false, true, -0.122f, -0.485f);
            a180.a(a180Var, cwh0VarQ.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            lcc.c = b180VarB;
        }
        b180 b180VarB2 = mod.c;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.DeviceSmartGlasses24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarI = ydh.i(8.944f, 8.0f, 4.43f, 8.0f);
            cwh0VarI.g(-0.328f, 0.0f, -0.657f, 0.0f, -0.926f, 0.032f);
            cwh0VarI.g(-0.282f, 0.034f, -0.717f, 0.124f, -1.054f, 0.49f);
            cwh0VarI.g(-0.14f, 0.15f, -0.232f, 0.316f, -0.294f, 0.478f);
            cwh0VarI.j(2.0f, 9.0f);
            cwh0VarI.c(1.0f, 1.0f, false, false, 0.0f, 2.0f);
            cwh0VarI.v(1.8f);
            cwh0VarI.g(0.0f, 0.702f, 0.157f, 1.295f, 0.446f, 1.78f);
            cwh0VarI.c(2.75f, 2.75f, false, false, 1.05f, 1.007f);
            cwh0VarI.c(3.2f, 3.2f, false, false, 1.447f, 0.384f);
            cwh0VarI.i(0.003f);
            cwh0VarI.k(0.31f, 0.004f);
            cwh0VarI.k(0.748f, 0.01f);
            cwh0VarI.g(0.57f, 0.008f, 1.229f, 0.015f, 1.555f, 0.015f);
            cwh0VarI.g(1.25f, 0.0f, 2.04f, -0.794f, 2.458f, -1.404f);
            cwh0VarI.c(4.8f, 4.8f, false, false, 0.594f, -1.214f);
            cwh0VarI.k(0.006f, -0.019f);
            cwh0VarI.k(0.003f, -0.011f);
            cwh0VarI.k(0.024f, -0.074f);
            cwh0VarI.k(0.094f, -0.31f);
            cwh0VarI.b(82.0f, 82.0f, false, false, 11.285f, 11.0f);
            cwh0VarI.i(1.43f);
            cwh0VarI.o(0.052f, 0.201f, 0.11f, 0.416f);
            cwh0VarI.c(83.0f, 83.0f, false, false, 0.531f, 1.862f);
            cwh0VarI.k(0.023f, 0.074f);
            cwh0VarI.k(0.004f, 0.011f);
            cwh0VarI.k(0.006f, 0.019f);
            cwh0VarI.k(0.029f, 0.088f);
            cwh0VarI.c(4.8f, 4.8f, false, false, 0.566f, 1.127f);
            cwh0VarI.f(14.4f, 15.205f, 15.19f, 16.0f, 16.44f, 16.0f);
            cwh0VarI.g(0.326f, 0.0f, 0.985f, -0.007f, 1.555f, -0.015f);
            cwh0VarI.k(0.748f, -0.01f);
            cwh0VarI.k(0.31f, -0.004f);
            cwh0VarI.i(0.003f);
            cwh0VarI.c(2.0f, 2.0f, false, false, 0.14f, -0.005f);
            cwh0VarI.c(3.2f, 3.2f, false, false, 1.308f, -0.379f);
            cwh0VarI.c(2.75f, 2.75f, false, false, 1.049f, -1.007f);
            cwh0VarI.g(0.289f, -0.485f, 0.446f, -1.078f, 0.446f, -1.78f);
            cwh0VarI.j(21.999f, 11.0f);
            cwh0VarI.c(1.0f, 1.0f, true, false, 0.0f, -2.0f);
            cwh0VarI.i(-0.156f);
            cwh0VarI.c(1.5f, 1.5f, false, false, -0.294f, -0.479f);
            cwh0VarI.g(-0.338f, -0.365f, -0.772f, -0.455f, -1.054f, -0.489f);
            cwh0VarI.b(8.0f, 8.0f, false, false, 19.57f, 8.0f);
            cwh0VarI.i(-4.514f);
            cwh0VarI.g(-0.37f, 0.0f, -0.756f, 0.0f, -1.072f, 0.043f);
            cwh0VarI.g(-0.32f, 0.043f, -0.84f, 0.162f, -1.187f, 0.637f);
            cwh0VarI.c(1.5f, 1.5f, false, false, -0.176f, 0.32f);
            cwh0VarI.i(-1.242f);
            cwh0VarI.c(1.5f, 1.5f, false, false, -0.176f, -0.32f);
            cwh0VarI.g(-0.347f, -0.475f, -0.867f, -0.594f, -1.187f, -0.637f);
            cwh0VarI.f(9.7f, 8.0f, 9.314f, 8.0f, 8.944f, 8.0f);
            cwh0VarI.m(-0.242f, 4.785f);
            cwh0VarI.k(-0.011f, 0.035f);
            cwh0VarI.c(2.8f, 2.8f, false, true, -0.323f, 0.645f);
            cwh0VarI.g(-0.248f, 0.36f, -0.51f, 0.535f, -0.81f, 0.535f);
            cwh0VarI.c(159.0f, 159.0f, false, true, -2.274f, -0.024f);
            cwh0VarI.k(-0.317f, -0.005f);
            cwh0VarI.i(-0.013f);
            cwh0VarI.k(-0.02f, -0.001f);
            cwh0VarI.c(1.2f, 1.2f, false, true, -0.477f, -0.136f);
            cwh0VarI.c(0.75f, 0.75f, false, true, -0.293f, -0.28f);
            cwh0VarI.f(4.087f, 13.427f, 4.0f, 13.199f, 4.0f, 12.8f);
            cwh0VarI.v(-2.2f);
            cwh0VarI.g(0.0f, -0.26f, 0.0f, -0.451f, 0.005f, -0.597f);
            cwh0VarI.g(0.118f, -0.002f, 0.27f, -0.003f, 0.473f, -0.003f);
            cwh0VarI.i(4.415f);
            cwh0VarI.g(0.241f, 0.0f, 0.424f, 0.0f, 0.567f, 0.005f);
            cwh0VarI.g(-0.039f, 0.209f, -0.108f, 0.494f, -0.215f, 0.883f);
            cwh0VarI.c(81.0f, 81.0f, false, true, -0.51f, 1.793f);
            cwh0VarI.k(-0.017f, 0.053f);
            cwh0VarI.k(-0.002f, 0.008f);
            cwh0VarI.v(-0.002f);
            cwh0VarI.e();
            cwh0VarI.l(15.339f, 12.876f);
            cwh0VarI.q(-0.118f, -0.336f, -0.159f, -0.474f);
            cwh0VarI.c(82.0f, 82.0f, false, true, -0.425f, -1.514f);
            cwh0VarI.g(-0.107f, -0.39f, -0.176f, -0.674f, -0.215f, -0.883f);
            cwh0VarI.g(0.143f, -0.004f, 0.326f, -0.005f, 0.567f, -0.005f);
            cwh0VarI.i(4.415f);
            cwh0VarI.g(0.202f, 0.0f, 0.355f, 0.0f, 0.473f, 0.003f);
            cwh0VarI.g(0.005f, 0.146f, 0.005f, 0.336f, 0.005f, 0.596f);
            cwh0VarI.v(2.2f);
            cwh0VarI.g(0.0f, 0.399f, -0.087f, 0.627f, -0.164f, 0.756f);
            cwh0VarI.c(0.75f, 0.75f, false, true, -0.293f, 0.279f);
            cwh0VarI.c(1.1f, 1.1f, false, true, -0.492f, 0.142f);
            cwh0VarI.i(-0.335f);
            cwh0VarI.k(-0.746f, 0.01f);
            cwh0VarI.g(-0.574f, 0.007f, -1.218f, 0.014f, -1.529f, 0.014f);
            cwh0VarI.g(-0.3f, 0.0f, -0.561f, -0.175f, -0.808f, -0.535f);
            cwh0VarI.c(4.0f, 4.0f, false, true, -0.294f, -0.589f);
            a180.a(a180Var2, cwh0VarI.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            mod.c = b180VarB2;
        }
        c = new kmx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new hlx((byte) 28);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof kmx);
    }

    public final int hashCode() {
        return -1832520020;
    }

    public final String toString() {
        return "DeviceSmartGlasses";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
