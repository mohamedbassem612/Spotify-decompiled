package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class knx extends hux {
    public static final Parcelable.Creator<knx> CREATOR;
    public static final knx c;
    public static final byte d;

    static {
        b180 b180VarB = zno1.c;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Gears16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            int i2 = u7h.l;
            long j = u7h.b;
            n6a1 n6a1Var = new n6a1(j);
            cwh0 cwh0VarQ = rjx.q(15.51f, 7.484f, -1.09f, -0.406f);
            cwh0VarQ.c(0.55f, 0.55f, false, true, -0.3f, -0.412f);
            cwh0VarQ.c(0.53f, 0.53f, false, true, 0.1f, -0.472f);
            cwh0VarQ.k(0.8f, -0.846f);
            cwh0VarQ.c(0.76f, 0.76f, false, false, 0.13f, -0.87f);
            cwh0VarQ.c(8.3f, 8.3f, false, false, -2.082f, -2.645f);
            cwh0VarQ.c(0.75f, 0.75f, false, false, -0.865f, -0.064f);
            cwh0VarQ.k(-0.9f, 0.55f);
            cwh0VarQ.c(0.56f, 0.56f, false, true, -0.543f, -0.016f);
            cwh0VarQ.c(0.59f, 0.59f, false, true, -0.349f, -0.42f);
            cwh0VarQ.j(10.273f, 0.818f);
            cwh0VarQ.c(0.76f, 0.76f, false, false, -0.194f, -0.417f);
            cwh0VarQ.c(0.75f, 0.75f, false, false, -0.396f, -0.227f);
            cwh0VarQ.c(8.1f, 8.1f, false, false, -3.339f, 0.0f);
            cwh0VarQ.c(0.75f, 0.75f, false, false, -0.396f, 0.227f);
            cwh0VarQ.c(0.76f, 0.76f, false, false, -0.194f, 0.416f);
            cwh0VarQ.j(5.62f, 1.851f);
            cwh0VarQ.c(0.63f, 0.63f, false, true, -0.369f, 0.441f);
            cwh0VarQ.c(0.6f, 0.6f, false, true, -0.569f, 0.017f);
            cwh0VarQ.k(-0.88f, -0.538f);
            cwh0VarQ.c(0.74f, 0.74f, false, false, -0.865f, 0.065f);
            cwh0VarQ.c(8.2f, 8.2f, false, false, -1.175f, 1.216f);
            cwh0VarQ.o(-0.527f, 0.668f, -0.906f, 1.43f);
            cwh0VarQ.c(0.77f, 0.77f, false, false, 0.13f, 0.87f);
            cwh0VarQ.k(0.784f, 0.826f);
            cwh0VarQ.c(0.54f, 0.54f, false, true, 0.1f, 0.484f);
            cwh0VarQ.c(0.57f, 0.57f, false, true, -0.3f, 0.424f);
            cwh0VarQ.k(-1.082f, 0.406f);
            cwh0VarQ.c(0.75f, 0.75f, false, false, -0.359f, 0.283f);
            cwh0VarQ.c(0.77f, 0.77f, false, false, -0.13f, 0.442f);
            cwh0VarQ.c(8.4f, 8.4f, false, false, 0.743f, 3.298f);
            cwh0VarQ.c(0.75f, 0.75f, false, false, 0.751f, 0.44f);
            cwh0VarQ.k(1.294f, -0.122f);
            cwh0VarQ.c(0.45f, 0.45f, false, true, 0.366f, 0.19f);
            cwh0VarQ.c(0.47f, 0.47f, false, true, 0.11f, 0.413f);
            cwh0VarQ.k(-0.4f, 1.233f);
            cwh0VarQ.c(0.77f, 0.77f, false, false, 0.257f, 0.84f);
            cwh0VarQ.c(8.1f, 8.1f, false, false, 3.007f, 1.468f);
            cwh0VarQ.c(0.73f, 0.73f, false, false, 0.537f, -0.069f);
            cwh0VarQ.c(0.75f, 0.75f, false, false, 0.27f, -0.253f);
            cwh0VarQ.k(0.76f, -1.174f);
            cwh0VarQ.c(0.457f, 0.457f, false, true, 0.64f, 0.013f);
            cwh0VarQ.k(0.75f, 1.162f);
            cwh0VarQ.c(0.75f, 0.75f, false, false, 0.807f, 0.321f);
            cwh0VarQ.c(8.2f, 8.2f, false, false, 3.008f, -1.468f);
            cwh0VarQ.c(0.76f, 0.76f, false, false, 0.255f, -0.84f);
            cwh0VarQ.k(-0.41f, -1.259f);
            cwh0VarQ.c(0.46f, 0.46f, false, true, 0.107f, -0.397f);
            cwh0VarQ.c(0.41f, 0.41f, false, true, 0.354f, -0.183f);
            cwh0VarQ.k(1.3f, 0.122f);
            cwh0VarQ.c(0.745f, 0.745f, false, false, 0.75f, -0.44f);
            cwh0VarQ.c(8.35f, 8.35f, false, false, 0.743f, -3.297f);
            cwh0VarQ.c(0.77f, 0.77f, false, false, -0.128f, -0.445f);
            cwh0VarQ.c(0.75f, 0.75f, false, false, -0.36f, -0.286f);
            cwh0VarQ.m(-1.176f, 2.075f);
            cwh0VarQ.o(-0.095f, 0.42f, -0.24f, 0.823f);
            cwh0VarQ.k(-0.747f, -0.072f);
            cwh0VarQ.c(1.9f, 1.9f, false, false, -0.918f, 0.161f);
            cwh0VarQ.c(1.95f, 1.95f, false, false, -0.738f, 0.576f);
            cwh0VarQ.c(1.95f, 1.95f, false, false, -0.37f, 1.834f);
            cwh0VarQ.k(0.236f, 0.725f);
            cwh0VarQ.c(6.0f, 6.0f, false, true, -0.737f, 0.42f);
            cwh0VarQ.c(7.0f, 7.0f, false, true, -0.784f, 0.322f);
            cwh0VarQ.k(-0.447f, -0.692f);
            cwh0VarQ.c(1.9f, 1.9f, false, false, -0.69f, -0.62f);
            cwh0VarQ.b(1.86f, 1.86f, false, false, 8.0f, 12.821f);
            cwh0VarQ.c(1.8f, 1.8f, false, false, -0.883f, 0.21f);
            cwh0VarQ.c(1.85f, 1.85f, false, false, -0.678f, 0.612f);
            cwh0VarQ.k(-0.455f, 0.71f);
            cwh0VarQ.c(6.7f, 6.7f, false, true, -1.522f, -0.743f);
            cwh0VarQ.k(0.228f, -0.7f);
            cwh0VarQ.c(1.98f, 1.98f, false, false, -0.376f, -1.852f);
            cwh0VarQ.c(1.96f, 1.96f, false, false, -0.743f, -0.579f);
            cwh0VarQ.c(1.9f, 1.9f, false, false, -0.923f, -0.162f);
            cwh0VarQ.k(-0.741f, 0.071f);
            cwh0VarQ.c(7.0f, 7.0f, false, true, -0.376f, -1.667f);
            cwh0VarQ.k(0.563f, -0.212f);
            cwh0VarQ.g(0.31f, -0.131f, 0.583f, -0.335f, 0.8f, -0.595f);
            cwh0VarQ.c(2.15f, 2.15f, false, false, 0.427f, -1.906f);
            cwh0VarQ.c(2.14f, 2.14f, false, false, -0.466f, -0.887f);
            cwh0VarQ.k(-0.4f, -0.421f);
            cwh0VarQ.c(6.7f, 6.7f, false, true, 1.053f, -1.338f);
            cwh0VarQ.k(0.405f, 0.248f);
            cwh0VarQ.c(2.07f, 2.07f, false, false, 2.0f, 0.048f);
            cwh0VarQ.c(2.13f, 2.13f, false, false, 1.2f, -1.61f);
            cwh0VarQ.k(0.062f, -0.475f);
            cwh0VarQ.c(6.6f, 6.6f, false, true, 1.69f, 0.0f);
            cwh0VarQ.k(0.065f, 0.507f);
            cwh0VarQ.c(2.2f, 2.2f, false, false, 0.404f, 0.94f);
            cwh0VarQ.g(0.206f, 0.276f, 0.474f, 0.498f, 0.782f, 0.649f);
            cwh0VarQ.c(2.13f, 2.13f, false, false, 1.966f, -0.051f);
            cwh0VarQ.k(0.429f, -0.262f);
            cwh0VarQ.c(6.8f, 6.8f, false, true, 1.053f, 1.337f);
            cwh0VarQ.k(-0.421f, 0.443f);
            cwh0VarQ.c(2.146f, 2.146f, false, false, -0.037f, 2.772f);
            cwh0VarQ.g(0.214f, 0.258f, 0.486f, 0.46f, 0.794f, 0.59f);
            cwh0VarQ.k(0.57f, 0.215f);
            cwh0VarQ.c(7.0f, 7.0f, false, true, -0.136f, 0.845f);
            cwh0VarQ.e();
            a180.a(a180Var, cwh0VarQ.a, n6a1Var, 1.0f, 2, 1.0f);
            n6a1 n6a1Var2 = new n6a1(j);
            ArrayList arrayList = new ArrayList(32);
            arrayList.add(new f9s0(8.0f, 6.25f));
            arrayList.add(new j9s0(1.75f, 1.75f, 0.0f, true, false, 0.0f, 3.5f));
            arrayList.add(new j9s0(1.75f, 1.75f, 0.0f, false, false, 0.0f, -3.5f));
            arrayList.add(new f9s0(4.75f, 8.0f));
            arrayList.add(new j9s0(3.25f, 3.25f, 0.0f, true, true, 6.5f, 0.0f));
            arrayList.add(new j9s0(3.25f, 3.25f, 0.0f, false, true, -6.5f, 0.0f));
            a180.a(a180Var, arrayList, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            zno1.c = b180VarB;
        }
        b180 b180VarB2 = d9y0.a;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Gears24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i3 = bui1.a;
            n6a1 n6a1Var3 = new n6a1(u7h.b);
            cwh0 cwh0VarQ2 = rjx.q(23.2f, 11.362f, -1.628f, -0.605f);
            cwh0VarQ2.c(0.92f, 0.92f, false, true, -0.52f, -0.7f);
            cwh0VarQ2.c(0.88f, 0.88f, false, true, 0.18f, -0.805f);
            cwh0VarQ2.k(1.2f, -1.25f);
            cwh0VarQ2.c(1.0f, 1.0f, false, false, 0.172f, -1.145f);
            cwh0VarQ2.c(12.1f, 12.1f, false, false, -3.084f, -3.865f);
            cwh0VarQ2.c(1.0f, 1.0f, false, false, -1.154f, -0.086f);
            cwh0VarQ2.k(-1.35f, 0.814f);
            cwh0VarQ2.c(0.98f, 0.98f, false, true, -0.931f, -0.02f);
            cwh0VarQ2.c(1.01f, 1.01f, false, true, -0.59f, -0.713f);
            cwh0VarQ2.k(-0.206f, -1.574f);
            cwh0VarQ2.c(1.0f, 1.0f, false, false, -0.787f, -0.848f);
            cwh0VarQ2.c(12.15f, 12.15f, false, false, -4.945f, 0.0f);
            cwh0VarQ2.c(1.0f, 1.0f, false, false, -0.785f, 0.848f);
            cwh0VarQ2.k(-0.2f, 1.524f);
            cwh0VarQ2.c(1.05f, 1.05f, false, true, -0.62f, 0.747f);
            cwh0VarQ2.c(1.02f, 1.02f, false, true, -0.968f, 0.02f);
            cwh0VarQ2.k(-1.318f, -0.795f);
            cwh0VarQ2.c(1.0f, 1.0f, false, false, -1.152f, 0.086f);
            cwh0VarQ2.c(12.1f, 12.1f, false, false, -3.085f, 3.867f);
            cwh0VarQ2.c(1.0f, 1.0f, false, false, 0.174f, 1.143f);
            cwh0VarQ2.k(1.174f, 1.218f);
            cwh0VarQ2.c(0.91f, 0.91f, false, true, 0.182f, 0.828f);
            cwh0VarQ2.c(0.95f, 0.95f, false, true, -0.532f, 0.714f);
            cwh0VarQ2.k(-1.618f, 0.6f);
            cwh0VarQ2.c(1.0f, 1.0f, false, false, -0.653f, 0.955f);
            cwh0VarQ2.c(12.1f, 12.1f, false, false, 1.1f, 4.822f);
            cwh0VarQ2.c(1.0f, 1.0f, false, false, 1.0f, 0.578f);
            cwh0VarQ2.k(1.935f, -0.183f);
            cwh0VarQ2.c(0.83f, 0.83f, false, true, 0.654f, 0.327f);
            cwh0VarQ2.c(0.8f, 0.8f, false, true, 0.188f, 0.726f);
            cwh0VarQ2.k(-0.6f, 1.822f);
            cwh0VarQ2.c(1.0f, 1.0f, false, false, 0.34f, 1.106f);
            cwh0VarQ2.g(0.66f, 0.504f, 1.369f, 0.94f, 2.117f, 1.3f);
            cwh0VarQ2.q(1.532f, 0.642f, 2.338f, 0.841f);
            cwh0VarQ2.c(1.0f, 1.0f, false, false, 0.715f, -0.09f);
            cwh0VarQ2.c(1.0f, 1.0f, false, false, 0.362f, -0.332f);
            cwh0VarQ2.k(1.136f, -1.736f);
            cwh0VarQ2.c(0.81f, 0.81f, false, true, 1.16f, 0.022f);
            cwh0VarQ2.k(1.124f, 1.714f);
            cwh0VarQ2.c(1.0f, 1.0f, false, false, 1.077f, 0.422f);
            cwh0VarQ2.g(1.617f, -0.4f, 3.133f, -1.13f, 4.454f, -2.145f);
            cwh0VarQ2.c(1.0f, 1.0f, false, false, 0.341f, -1.106f);
            cwh0VarQ2.k(-0.613f, -1.859f);
            cwh0VarQ2.c(0.77f, 0.77f, false, true, 0.18f, -0.7f);
            cwh0VarQ2.c(0.78f, 0.78f, false, true, 0.635f, -0.317f);
            cwh0VarQ2.k(1.945f, 0.183f);
            cwh0VarQ2.c(0.99f, 0.99f, false, false, 1.0f, -0.578f);
            cwh0VarQ2.c(12.1f, 12.1f, false, false, 1.1f, -4.822f);
            cwh0VarQ2.c(1.0f, 1.0f, false, false, -0.643f, -0.953f);
            cwh0VarQ2.e();
            cwh0VarQ2.l(21.6f, 14.339f);
            cwh0VarQ2.o(-0.155f, 0.673f, -0.4f, 1.318f);
            cwh0VarQ2.k(-1.213f, -0.115f);
            cwh0VarQ2.c(2.85f, 2.85f, false, false, -2.9f, 3.637f);
            cwh0VarQ2.k(0.383f, 1.16f);
            cwh0VarQ2.c(10.0f, 10.0f, false, true, -2.473f, 1.191f);
            cwh0VarQ2.k(-0.72f, -1.1f);
            cwh0VarQ2.c(2.69f, 2.69f, false, false, -2.275f, -1.18f);
            cwh0VarQ2.c(2.64f, 2.64f, false, false, -2.232f, 1.16f);
            cwh0VarQ2.k(-0.735f, 1.12f);
            cwh0VarQ2.c(10.0f, 10.0f, false, true, -2.471f, -1.19f);
            cwh0VarQ2.k(0.37f, -1.125f);
            cwh0VarQ2.c(2.88f, 2.88f, false, false, -2.93f, -3.669f);
            cwh0VarQ2.k(-1.2f, 0.113f);
            cwh0VarQ2.c(10.5f, 10.5f, false, true, -0.4f, -1.317f);
            cwh0VarQ2.c(10.0f, 10.0f, false, true, -0.214f, -1.358f);
            cwh0VarQ2.k(0.93f, -0.345f);
            cwh0VarQ2.c(3.032f, 3.032f, false, false, 1.095f, -4.8f);
            cwh0VarQ2.j(3.55f, 7.15f);
            cwh0VarQ2.c(10.2f, 10.2f, false, true, 1.71f, -2.146f);
            cwh0VarQ2.k(0.688f, 0.415f);
            cwh0VarQ2.c(3.0f, 3.0f, false, false, 2.875f, 0.066f);
            cwh0VarQ2.c(3.02f, 3.02f, false, false, 1.726f, -2.283f);
            cwh0VarQ2.k(0.105f, -0.8f);
            cwh0VarQ2.c(10.2f, 10.2f, false, true, 2.745f, 0.0f);
            cwh0VarQ2.k(0.11f, 0.844f);
            cwh0VarQ2.c(3.1f, 3.1f, false, false, 4.542f, 2.184f);
            cwh0VarQ2.k(0.721f, -0.435f);
            cwh0VarQ2.c(10.2f, 10.2f, false, true, 1.712f, 2.146f);
            cwh0VarQ2.k(-0.694f, 0.72f);
            cwh0VarQ2.c(3.005f, 3.005f, false, false, 1.084f, 4.768f);
            cwh0VarQ2.k(0.942f, 0.35f);
            cwh0VarQ2.o(-0.062f, 0.687f, -0.215f, 1.36f);
            cwh0VarQ2.e();
            cwh0VarQ2.l(12.0f, 7.001f);
            cwh0VarQ2.c(5.0f, 5.0f, true, false, 5.0f, 5.0f);
            cwh0VarQ2.c(5.006f, 5.006f, false, false, -4.993f, -5.0f);
            cwh0VarQ2.e();
            cwh0VarQ2.l(12.0f, 15.001f);
            cwh0VarQ2.c(3.0f, 3.0f, true, true, 0.007f, 0.0f);
            cwh0VarQ2.e();
            a180.a(a180Var2, cwh0VarQ2.a, n6a1Var3, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            d9y0.a = b180VarB2;
        }
        c = new knx(new dsx(b180VarB, b180VarB2), new dsx(vby0.t(), qxy0.v()));
        d = (byte) 8;
        CREATOR = new mmx((byte) 22);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof knx);
    }

    public final int hashCode() {
        return -1485076337;
    }

    public final String toString() {
        return "Gears";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
