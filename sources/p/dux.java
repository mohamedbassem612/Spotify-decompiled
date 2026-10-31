package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dux extends hux {
    public static final Parcelable.Creator<dux> CREATOR;
    public static final dux c;

    static {
        b180 b180VarB = hr80.d;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.WhatsApp16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(1.08f, 8.063f);
            cwh0VarG.o(0.0f, 1.937f, 0.991f, 3.58f);
            cwh0VarG.k(-1.246f, 3.73f);
            cwh0VarG.k(3.834f, -1.23f);
            cwh0VarG.c(6.8f, 6.8f, false, false, 3.349f, 0.865f);
            cwh0VarG.o(1.413f, 0.0f, 2.694f, -0.552f);
            cwh0VarG.c(7.0f, 7.0f, false, false, 2.21f, -1.48f);
            cwh0VarG.c(6.9f, 6.9f, false, false, 1.477f, -2.214f);
            cwh0VarG.c(6.8f, 6.8f, false, false, 0.548f, -2.699f);
            cwh0VarG.o(0.0f, -1.411f, -0.548f, -2.698f);
            cwh0VarG.c(7.0f, 7.0f, false, false, -1.476f, -2.218f);
            cwh0VarG.c(6.9f, 6.9f, false, false, -2.21f, -1.48f);
            cwh0VarG.c(6.8f, 6.8f, false, false, -2.695f, -0.548f);
            cwh0VarG.o(-1.413f, 0.0f, -2.695f, 0.548f);
            cwh0VarG.c(6.9f, 6.9f, false, false, -2.21f, 1.48f);
            cwh0VarG.c(7.0f, 7.0f, false, false, -1.476f, 2.218f);
            cwh0VarG.c(6.8f, 6.8f, false, false, -0.548f, 2.698f);
            hrt.o(cwh0VarG, 4.833f, 12.889f, 2.619f, 13.595f);
            cwh0VarG.j(3.341f, 11.452f);
            cwh0VarG.c(5.64f, 5.64f, false, true, -1.103f, -3.389f);
            cwh0VarG.o(0.0f, -1.174f, 0.456f, -2.246f);
            cwh0VarG.c(5.8f, 5.8f, false, true, 1.23f, -1.845f);
            cwh0VarG.c(5.8f, 5.8f, false, true, 1.842f, -1.234f);
            cwh0VarG.c(5.6f, 5.6f, false, true, 2.242f, -0.46f);
            cwh0VarG.o(1.174f, 0.0f, 2.242f, 0.46f);
            cwh0VarG.c(5.8f, 5.8f, false, true, 1.837f, 1.234f);
            cwh0VarG.c(5.8f, 5.8f, false, true, 1.226f, 1.845f);
            cwh0VarG.o(0.457f, 1.072f, 0.457f, 2.246f);
            cwh0VarG.o(0.0f, 1.175f, -0.457f, 2.243f);
            cwh0VarG.c(5.8f, 5.8f, false, true, -1.226f, 1.84f);
            cwh0VarG.c(5.8f, 5.8f, false, true, -1.837f, 1.235f);
            cwh0VarG.c(5.6f, 5.6f, false, true, -2.242f, 0.46f);
            cwh0VarG.c(5.65f, 5.65f, false, true, -3.175f, -0.952f);
            cwh0VarG.m(5.238f, -3.873f);
            cwh0VarG.c(0.43f, 0.43f, false, false, -0.218f, -0.048f);
            cwh0VarG.o(-0.099f, 0.008f, -0.186f, 0.12f);
            cwh0VarG.o(-0.23f, 0.317f, -0.588f, 0.674f);
            cwh0VarG.o(-0.142f, 0.16f, -0.38f, 0.032f);
            cwh0VarG.k(-0.191f, -0.096f);
            cwh0VarG.c(9.0f, 9.0f, false, true, -0.333f, -0.174f);
            cwh0VarG.c(4.0f, 4.0f, false, true, -0.393f, -0.262f);
            cwh0VarG.c(4.0f, 4.0f, false, true, -0.472f, -0.405f);
            cwh0VarG.c(4.6f, 4.6f, false, true, -0.937f, -1.262f);
            cwh0VarG.c(0.3f, 0.3f, false, true, -0.048f, -0.115f);
            cwh0VarG.c(0.16f, 0.16f, false, true, 0.02f, -0.103f);
            cwh0VarG.c(0.3f, 0.3f, false, true, 0.048f, -0.071f);
            cwh0VarG.k(0.067f, -0.068f);
            cwh0VarG.c(1.0f, 1.0f, false, false, 0.084f, -0.083f);
            cwh0VarG.c(5.0f, 5.0f, false, true, 0.194f, -0.218f);
            cwh0VarG.o(0.072f, -0.08f, 0.19f, -0.286f);
            cwh0VarG.o(0.072f, -0.127f, -0.007f, -0.318f);
            cwh0VarG.k(-0.108f, -0.281f);
            cwh0VarG.k(-0.218f, -0.588f);
            cwh0VarG.n(6.468f, 5.12f, 6.43f, 5.0f);
            cwh0VarG.k(-0.06f, -0.127f);
            cwh0VarG.c(0.5f, 0.5f, false, false, -0.115f, -0.147f);
            cwh0VarG.c(0.14f, 0.14f, false, false, -0.064f, -0.028f);
            cwh0VarG.j(6.14f, 4.69f);
            cwh0VarG.i(-0.1f);
            cwh0VarG.o(-0.31f, -0.023f, -0.342f, -0.023f);
            cwh0VarG.c(0.6f, 0.6f, false, false, -0.476f, 0.198f);
            cwh0VarG.k(-0.067f, 0.068f);
            cwh0VarG.k(-0.084f, 0.087f);
            cwh0VarG.k(-0.087f, 0.103f);
            cwh0VarG.c(1.6f, 1.6f, false, false, -0.198f, 0.29f);
            cwh0VarG.c(1.0f, 1.0f, false, false, -0.088f, 0.186f);
            cwh0VarG.k(-0.067f, 0.207f);
            cwh0VarG.c(2.0f, 2.0f, false, false, -0.056f, 0.246f);
            cwh0VarG.c(3.0f, 3.0f, false, false, -0.027f, 0.273f);
            cwh0VarG.o(-0.032f, 0.834f, 0.65f, 1.858f);
            cwh0VarG.k(0.088f, 0.15f);
            cwh0VarG.c(13.0f, 13.0f, false, false, 0.539f, 0.75f);
            cwh0VarG.o(0.19f, 0.25f, 0.433f, 0.504f);
            cwh0VarG.o(0.242f, 0.255f, 0.52f, 0.508f);
            cwh0VarG.c(5.0f, 5.0f, false, false, 1.341f, 0.874f);
            cwh0VarG.o(0.509f, 0.221f, 0.861f, 0.352f);
            cwh0VarG.s(0.564f, 0.171f);
            cwh0VarG.o(0.21f, 0.04f, 0.305f, 0.048f);
            cwh0VarG.c(0.7f, 0.7f, false, false, 0.214f, -0.02f);
            cwh0VarG.c(1.0f, 1.0f, false, true, 0.167f, -0.028f);
            cwh0VarG.o(0.27f, -0.015f, 0.687f, -0.262f);
            cwh0VarG.o(0.416f, -0.246f, 0.535f, -0.532f);
            cwh0VarG.c(2.3f, 2.3f, false, false, 0.143f, -0.547f);
            cwh0VarG.o(0.032f, -0.263f, -0.008f, -0.294f);
            cwh0VarG.o(-0.03f, -0.055f, -0.333f, -0.222f);
            cwh0VarG.o(-1.0f, -0.548f, -1.183f, -0.62f);
            cwh0VarG.e();
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            hr80.d = b180VarB;
        }
        b180 b180VarB2 = t890.c;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.WhatsApp24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(2.485f, 12.087f);
            cwh0VarG2.c(9.35f, 9.35f, false, false, 1.363f, 4.922f);
            cwh0VarG2.k(-1.714f, 5.129f);
            cwh0VarG2.k(5.272f, -1.691f);
            cwh0VarG2.c(9.36f, 9.36f, false, false, 4.605f, 1.189f);
            cwh0VarG2.o(1.943f, 0.0f, 3.704f, -0.76f);
            cwh0VarG2.c(9.6f, 9.6f, false, false, 3.039f, -2.034f);
            cwh0VarG2.c(9.5f, 9.5f, false, false, 2.03f, -3.044f);
            cwh0VarG2.c(9.4f, 9.4f, false, false, 0.754f, -3.711f);
            cwh0VarG2.o(0.0f, -1.942f, -0.753f, -3.71f);
            cwh0VarG2.c(9.6f, 9.6f, false, false, -2.03f, -3.05f);
            cwh0VarG2.c(9.5f, 9.5f, false, false, -3.038f, -2.035f);
            cwh0VarG2.c(9.3f, 9.3f, false, false, -3.706f, -0.753f);
            cwh0VarG2.c(9.3f, 9.3f, false, false, -3.706f, 0.753f);
            cwh0VarG2.c(9.5f, 9.5f, false, false, -3.038f, 2.035f);
            cwh0VarG2.c(9.6f, 9.6f, false, false, -2.03f, 3.05f);
            cwh0VarG2.c(9.4f, 9.4f, false, false, -0.753f, 3.71f);
            hrt.o(cwh0VarG2, 7.645f, 18.722f, 4.601f, 19.693f);
            cwh0VarG2.j(5.594f, 16.746f);
            cwh0VarG2.c(7.76f, 7.76f, false, true, -1.517f, -4.66f);
            cwh0VarG2.c(7.8f, 7.8f, false, true, 0.627f, -3.088f);
            cwh0VarG2.c(8.0f, 8.0f, false, true, 1.692f, -2.537f);
            cwh0VarG2.c(8.0f, 8.0f, false, true, 2.532f, -1.696f);
            cwh0VarG2.c(7.7f, 7.7f, false, true, 3.083f, -0.633f);
            cwh0VarG2.o(1.616f, 0.0f, 3.083f, 0.633f);
            cwh0VarG2.b(8.0f, 8.0f, false, true, 17.62f, 6.46f);
            cwh0VarG2.c(8.0f, 8.0f, false, true, 1.685f, 2.537f);
            cwh0VarG2.o(0.63f, 1.474f, 0.629f, 3.089f);
            cwh0VarG2.c(7.8f, 7.8f, false, true, -0.629f, 3.084f);
            cwh0VarG2.c(8.0f, 8.0f, false, true, -1.685f, 2.53f);
            cwh0VarG2.c(8.0f, 8.0f, false, true, -2.526f, 1.698f);
            cwh0VarG2.c(7.7f, 7.7f, false, true, -3.083f, 0.632f);
            cwh0VarG2.c(7.77f, 7.77f, false, true, -4.366f, -1.309f);
            cwh0VarG2.e();
            cwh0VarG2.l(14.848f, 13.397f);
            cwh0VarG2.c(0.6f, 0.6f, false, false, -0.3f, -0.066f);
            cwh0VarG2.o(-0.136f, 0.01f, -0.256f, 0.165f);
            cwh0VarG2.o(-0.316f, 0.436f, -0.808f, 0.927f);
            cwh0VarG2.o(-0.196f, 0.218f, -0.523f, 0.044f);
            cwh0VarG2.k(-0.263f, -0.132f);
            cwh0VarG2.c(13.0f, 13.0f, false, true, -0.457f, -0.24f);
            cwh0VarG2.c(6.0f, 6.0f, false, true, -0.54f, -0.36f);
            cwh0VarG2.c(5.6f, 5.6f, false, true, -0.65f, -0.557f);
            cwh0VarG2.c(6.4f, 6.4f, false, true, -1.288f, -1.735f);
            cwh0VarG2.c(0.4f, 0.4f, false, true, -0.066f, -0.158f);
            cwh0VarG2.c(0.22f, 0.22f, false, true, 0.027f, -0.142f);
            cwh0VarG2.c(0.4f, 0.4f, false, true, 0.066f, -0.097f);
            cwh0VarG2.k(0.093f, -0.094f);
            cwh0VarG2.c(1.0f, 1.0f, false, false, 0.115f, -0.114f);
            cwh0VarG2.c(7.0f, 7.0f, false, true, 0.267f, -0.3f);
            cwh0VarG2.o(0.099f, -0.11f, 0.261f, -0.393f);
            cwh0VarG2.o(0.1f, -0.174f, -0.01f, -0.437f);
            cwh0VarG2.k(-0.148f, -0.387f);
            cwh0VarG2.k(-0.3f, -0.808f);
            cwh0VarG2.c(18.0f, 18.0f, false, true, -0.227f, -0.638f);
            cwh0VarG2.j(9.76f, 7.7f);
            cwh0VarG2.c(0.7f, 0.7f, false, false, -0.158f, -0.202f);
            cwh0VarG2.c(0.2f, 0.2f, false, false, -0.088f, -0.038f);
            cwh0VarG2.k(-0.07f, -0.011f);
            cwh0VarG2.i(-0.138f);
            cwh0VarG2.o(-0.425f, -0.032f, -0.47f, -0.032f);
            cwh0VarG2.o(-0.36f, -0.022f, -0.655f, 0.272f);
            cwh0VarG2.k(-0.092f, 0.094f);
            cwh0VarG2.c(3.0f, 3.0f, false, false, -0.115f, 0.12f);
            cwh0VarG2.k(-0.12f, 0.141f);
            cwh0VarG2.o(-0.087f, 0.103f, -0.142f, 0.186f);
            cwh0VarG2.c(4.0f, 4.0f, false, false, -0.13f, 0.213f);
            cwh0VarG2.c(1.5f, 1.5f, false, false, -0.121f, 0.256f);
            cwh0VarG2.o(-0.044f, 0.125f, -0.092f, 0.284f);
            cwh0VarG2.c(2.0f, 2.0f, false, false, -0.077f, 0.338f);
            cwh0VarG2.o(-0.028f, 0.18f, -0.037f, 0.376f);
            cwh0VarG2.o(-0.045f, 1.146f, 0.893f, 2.555f);
            cwh0VarG2.k(0.121f, 0.206f);
            cwh0VarG2.c(18.0f, 18.0f, false, false, 0.741f, 1.031f);
            cwh0VarG2.o(0.262f, 0.344f, 0.596f, 0.693f);
            cwh0VarG2.o(0.333f, 0.35f, 0.715f, 0.699f);
            cwh0VarG2.c(7.0f, 7.0f, false, false, 1.844f, 1.201f);
            cwh0VarG2.o(0.698f, 0.304f, 1.184f, 0.484f);
            cwh0VarG2.o(0.485f, 0.18f, 0.775f, 0.235f);
            cwh0VarG2.o(0.289f, 0.056f, 0.42f, 0.066f);
            cwh0VarG2.c(1.0f, 1.0f, false, false, 0.294f, -0.027f);
            cwh0VarG2.o(0.165f, -0.039f, 0.23f, -0.039f);
            cwh0VarG2.o(0.37f, -0.021f, 0.944f, -0.36f);
            cwh0VarG2.o(0.571f, -0.338f, 0.736f, -0.731f);
            cwh0VarG2.o(0.152f, -0.393f, 0.196f, -0.752f);
            cwh0VarG2.o(0.045f, -0.36f, -0.01f, -0.405f);
            cwh0VarG2.o(-0.044f, -0.075f, -0.459f, -0.305f);
            cwh0VarG2.o(-1.375f, -0.753f, -1.626f, -0.852f);
            cwh0VarG2.e();
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            t890.c = b180VarB2;
        }
        c = new dux(new dsx(b180VarB, b180VarB2), null);
        CREATOR = new utx((byte) 8);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof dux);
    }

    public final int hashCode() {
        return 1033578951;
    }

    public final String toString() {
        return "WhatsApp";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
