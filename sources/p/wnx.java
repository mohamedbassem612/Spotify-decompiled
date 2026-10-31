package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wnx extends hux {
    public static final Parcelable.Creator<wnx> CREATOR;
    public static final wnx c;

    static {
        b180 b180VarB = t3k1.a;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.HeadphonesSparkling16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarP = rjx.p(8.667f, 0.318f, 1.504f);
            cwh0VarP.b(6.5f, 6.5f, false, false, 1.507f, 8.6f);
            cwh0VarP.i(1.39f);
            cwh0VarP.c(2.31f, 2.31f, false, true, 1.999f, 1.15f);
            cwh0VarP.k(1.212f, 2.09f);
            cwh0VarP.c(2.29f, 2.29f, true, true, -3.966f, 2.295f);
            cwh0VarP.k(-0.915f, -1.585f);
            cwh0VarP.b(7.96f, 7.96f, false, true, 0.0f, 8.289f);
            cwh0VarP.b(8.0f, 8.0f, false, true, 8.667f, 0.318f);
            cwh0VarP.l(1.755f, 10.1f);
            cwh0VarP.g(0.172f, 0.594f, 0.426f, 1.15f, 0.749f, 1.661f);
            cwh0VarP.k(0.008f, 0.013f);
            cwh0VarP.k(0.93f, 1.611f);
            cwh0VarP.c(0.791f, 0.791f, false, false, 1.37f, -0.792f);
            cwh0VarP.j(3.6f, 10.503f);
            cwh0VarP.c(0.81f, 0.81f, false, false, -0.702f, -0.403f);
            cwh0VarP.e();
            cwh0VarP.l(14.43f, 7.333f);
            cwh0VarP.o(0.092f, 0.629f, 0.062f, 1.267f);
            cwh0VarP.h(13.1f);
            cwh0VarP.c(2.31f, 2.31f, false, false, -1.998f, 1.15f);
            cwh0VarP.j(9.89f, 11.84f);
            cwh0VarP.c(2.291f, 2.291f, true, false, 3.967f, 2.295f);
            cwh0VarP.k(0.913f, -1.583f);
            cwh0VarP.c(8.0f, 8.0f, false, false, 1.173f, -5.219f);
            cwh0VarP.e();
            cwh0VarP.l(13.1f, 10.1f);
            cwh0VarP.i(1.145f);
            cwh0VarP.k(-0.001f, 0.001f);
            cwh0VarP.c(6.5f, 6.5f, false, true, -0.75f, 1.663f);
            cwh0VarP.k(-0.008f, 0.012f);
            cwh0VarP.k(-0.929f, 1.61f);
            cwh0VarP.c(0.793f, 0.793f, false, true, -1.45f, -0.192f);
            cwh0VarP.c(0.8f, 0.8f, false, true, 0.08f, -0.6f);
            cwh0VarP.k(1.213f, -2.089f);
            cwh0VarP.c(0.81f, 0.81f, false, true, 0.7f, -0.405f);
            cwh0VarP.l(11.668f, 2.0f);
            cwh0VarP.g(0.082f, 0.0f, 0.161f, 0.028f, 0.222f, 0.08f);
            cwh0VarP.g(0.061f, 0.05f, 0.1f, 0.121f, 0.106f, 0.197f);
            cwh0VarP.g(0.027f, 0.264f, 0.148f, 0.682f, 0.42f, 1.044f);
            cwh0VarP.g(0.268f, 0.353f, 0.673f, 0.648f, 1.29f, 0.71f);
            cwh0VarP.c(0.34f, 0.34f, false, true, 0.21f, 0.1f);
            cwh0VarP.c(0.3f, 0.3f, false, true, 0.084f, 0.203f);
            cwh0VarP.g(0.0f, 0.075f, -0.03f, 0.147f, -0.084f, 0.203f);
            cwh0VarP.c(0.34f, 0.34f, false, true, -0.21f, 0.1f);
            cwh0VarP.c(1.77f, 1.77f, false, false, -1.29f, 0.71f);
            cwh0VarP.c(2.2f, 2.2f, false, false, -0.42f, 1.045f);
            cwh0VarP.c(0.3f, 0.3f, false, true, -0.106f, 0.196f);
            cwh0VarP.c(0.35f, 0.35f, false, true, -0.222f, 0.079f);
            cwh0VarP.c(0.35f, 0.35f, false, true, -0.222f, -0.08f);
            cwh0VarP.c(0.3f, 0.3f, false, true, -0.107f, -0.195f);
            cwh0VarP.c(2.2f, 2.2f, false, false, -0.42f, -1.045f);
            cwh0VarP.c(1.77f, 1.77f, false, false, -1.29f, -0.71f);
            cwh0VarP.c(0.34f, 0.34f, false, true, -0.21f, -0.099f);
            cwh0VarP.c(0.3f, 0.3f, false, true, -0.086f, -0.204f);
            cwh0VarP.g(0.0f, -0.075f, 0.03f, -0.148f, 0.085f, -0.204f);
            cwh0VarP.c(0.34f, 0.34f, false, true, 0.212f, -0.099f);
            cwh0VarP.c(1.77f, 1.77f, false, false, 1.289f, -0.71f);
            cwh0VarP.g(0.273f, -0.362f, 0.393f, -0.78f, 0.42f, -1.044f);
            cwh0VarP.c(0.3f, 0.3f, false, true, 0.106f, -0.197f);
            cwh0VarP.g(0.06f, -0.051f, 0.14f, -0.08f, 0.223f, -0.08f);
            cwh0VarP.m(1.693f, -0.397f);
            cwh0VarP.g(0.516f, -0.163f, 0.784f, -0.57f, 0.9f, -0.909f);
            cwh0VarP.g(0.014f, -0.036f, 0.131f, -0.036f, 0.144f, 0.0f);
            cwh0VarP.g(0.117f, 0.339f, 0.385f, 0.746f, 0.9f, 0.91f);
            cwh0VarP.g(0.038f, 0.01f, 0.038f, 0.115f, 0.0f, 0.126f);
            cwh0VarP.g(-0.515f, 0.163f, -0.783f, 0.57f, -0.9f, 0.91f);
            cwh0VarP.g(-0.013f, 0.036f, -0.13f, 0.036f, -0.143f, 0.0f);
            cwh0VarP.g(-0.117f, -0.34f, -0.385f, -0.747f, -0.9f, -0.91f);
            cwh0VarP.g(-0.038f, -0.011f, -0.038f, -0.115f, 0.0f, -0.127f);
            cwh0VarP.e();
            a180.a(a180Var, cwh0VarP.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            t3k1.a = b180VarB;
        }
        b180 b180VarB2 = fj30.d;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.HeadphonesSparkling24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(13.0f, 1.043f);
            cwh0VarG.b(12.0f, 12.0f, false, false, 12.0f, 1.0f);
            cwh0VarG.f(5.649f, 1.0f, 0.5f, 6.149f, 0.5f, 12.5f);
            cwh0VarG.c(11.44f, 11.44f, false, false, 1.765f, 6.126f);
            cwh0VarG.k(1.327f, 2.298f);
            cwh0VarG.c(3.231f, 3.231f, true, false, 5.594f, -3.238f);
            cwh0VarG.k(-1.831f, -3.155f);
            cwh0VarG.c(3.0f, 3.0f, false, false, -2.595f, -1.494f);
            cwh0VarG.j(2.515f, 13.037f);
            cwh0VarG.b(9.5f, 9.5f, false, true, 13.0f, 3.057f);
            rjx.u(cwh0VarG, 13.0f, 1.042f, 3.967f, 17.574f);
            cwh0VarG.c(9.4f, 9.4f, false, true, -1.125f, -2.537f);
            cwh0VarG.i(1.919f);
            cwh0VarG.c(1.0f, 1.0f, false, true, 0.866f, 0.498f);
            cwh0VarG.k(1.83f, 3.155f);
            cwh0VarG.c(1.233f, 1.233f, true, true, -2.132f, 1.234f);
            rjx.y(cwh0VarG, -1.348f, -2.333f, 21.38f, 11.0f);
            cwh0VarG.g(0.108f, 0.671f, 0.143f, 1.354f, 0.105f, 2.037f);
            cwh0VarG.i(-2.247f);
            cwh0VarG.c(3.0f, 3.0f, false, false, -2.595f, 1.494f);
            cwh0VarG.k(-1.83f, 3.155f);
            cwh0VarG.c(3.233f, 3.233f, true, false, 5.594f, 3.238f);
            cwh0VarG.k(1.325f, -2.294f);
            cwh0VarG.b(11.43f, 11.43f, false, false, 23.5f, 12.5f);
            cwh0VarG.o(0.0f, -0.764f, -0.097f, -1.5f);
            cwh0VarG.e();
            cwh0VarG.l(19.238f, 15.037f);
            cwh0VarG.i(1.92f);
            cwh0VarG.c(9.5f, 9.5f, false, true, -1.127f, 2.54f);
            cwh0VarG.k(-0.011f, 0.017f);
            cwh0VarG.k(-1.345f, 2.33f);
            cwh0VarG.c(1.232f, 1.232f, true, true, -2.132f, -1.234f);
            cwh0VarG.k(1.831f, -3.155f);
            cwh0VarG.c(1.0f, 1.0f, false, true, 0.864f, -0.498f);
            cwh0VarG.l(17.501f, 3.0f);
            cwh0VarG.c(0.52f, 0.52f, false, true, 0.334f, 0.12f);
            cwh0VarG.c(0.45f, 0.45f, false, true, 0.16f, 0.295f);
            cwh0VarG.c(3.3f, 3.3f, false, false, 0.63f, 1.566f);
            cwh0VarG.g(0.4f, 0.53f, 1.009f, 0.972f, 1.934f, 1.066f);
            cwh0VarG.c(0.5f, 0.5f, false, true, 0.314f, 0.15f);
            cwh0VarG.b(0.44f, 0.44f, false, true, 21.0f, 6.5f);
            cwh0VarG.c(0.44f, 0.44f, false, true, -0.127f, 0.305f);
            cwh0VarG.c(0.5f, 0.5f, false, true, -0.314f, 0.149f);
            cwh0VarG.g(-0.925f, 0.094f, -1.534f, 0.536f, -1.934f, 1.066f);
            cwh0VarG.c(3.3f, 3.3f, false, false, -0.63f, 1.566f);
            cwh0VarG.c(0.45f, 0.45f, false, true, -0.16f, 0.294f);
            cwh0VarG.c(0.52f, 0.52f, false, true, -0.334f, 0.119f);
            cwh0VarG.c(0.52f, 0.52f, false, true, -0.332f, -0.119f);
            cwh0VarG.c(0.45f, 0.45f, false, true, -0.16f, -0.294f);
            cwh0VarG.c(3.3f, 3.3f, false, false, -0.63f, -1.566f);
            cwh0VarG.g(-0.401f, -0.53f, -1.01f, -0.972f, -1.935f, -1.065f);
            cwh0VarG.c(0.5f, 0.5f, false, true, -0.317f, -0.149f);
            cwh0VarG.b(0.44f, 0.44f, false, true, 14.0f, 6.5f);
            cwh0VarG.g(0.0f, -0.113f, 0.045f, -0.222f, 0.127f, -0.305f);
            cwh0VarG.c(0.5f, 0.5f, false, true, 0.317f, -0.149f);
            cwh0VarG.g(0.925f, -0.094f, 1.534f, -0.536f, 1.934f, -1.066f);
            cwh0VarG.c(3.3f, 3.3f, false, false, 0.63f, -1.566f);
            cwh0VarG.c(0.44f, 0.44f, false, true, 0.16f, -0.295f);
            cwh0VarG.b(0.52f, 0.52f, false, true, 17.5f, 3.0f);
            cwh0VarG.e();
            cwh0VarG.l(20.042f, 2.405f);
            cwh0VarG.g(0.773f, -0.245f, 1.175f, -0.856f, 1.35f, -1.364f);
            cwh0VarG.g(0.02f, -0.055f, 0.196f, -0.055f, 0.216f, 0.0f);
            cwh0VarG.g(0.175f, 0.508f, 0.576f, 1.119f, 1.35f, 1.364f);
            cwh0VarG.g(0.056f, 0.017f, 0.056f, 0.173f, 0.0f, 0.19f);
            cwh0VarG.g(-0.773f, 0.245f, -1.175f, 0.856f, -1.35f, 1.364f);
            cwh0VarG.g(-0.02f, 0.055f, -0.196f, 0.055f, -0.216f, 0.0f);
            cwh0VarG.g(-0.175f, -0.508f, -0.576f, -1.119f, -1.35f, -1.364f);
            cwh0VarG.g(-0.056f, -0.017f, -0.056f, -0.173f, 0.0f, -0.19f);
            a180.a(a180Var2, cwh0VarG.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            fj30.d = b180VarB2;
        }
        c = new wnx(new dsx(b180VarB, b180VarB2), null);
        CREATOR = new snx((byte) 3);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof wnx);
    }

    public final int hashCode() {
        return -278786119;
    }

    public final String toString() {
        return "HeadphonesSparkling";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
