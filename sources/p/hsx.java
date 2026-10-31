package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hsx extends hux {
    public static final Parcelable.Creator<hsx> CREATOR;
    public static final hsx c;
    public static final byte d;

    static {
        b180 b180VarB = o4p1.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.ShuffleSmart16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            long j = u7h.b;
            n6a1 n6a1Var = new n6a1(j);
            cwh0 cwh0VarG = lf51.g(4.502f, 0.0f);
            cwh0VarG.c(0.637f, 0.637f, false, true, 0.634f, 0.58f);
            cwh0VarG.c(4.84f, 4.84f, false, false, 0.81f, 2.184f);
            cwh0VarG.g(0.515f, 0.739f, 1.297f, 1.356f, 2.487f, 1.486f);
            cwh0VarG.c(0.637f, 0.637f, false, true, 0.0f, 1.267f);
            cwh0VarG.g(-1.19f, 0.13f, -1.972f, 0.747f, -2.487f, 1.487f);
            cwh0VarG.c(4.8f, 4.8f, false, false, -0.81f, 2.185f);
            cwh0VarG.c(0.637f, 0.637f, false, true, -1.268f, 0.0f);
            cwh0VarG.c(4.8f, 4.8f, false, false, -0.81f, -2.185f);
            cwh0VarG.f(2.543f, 6.265f, 1.76f, 5.648f, 0.57f, 5.518f);
            cwh0VarG.c(0.637f, 0.637f, false, true, 0.0f, -1.268f);
            cwh0VarG.g(1.19f, -0.13f, 1.972f, -0.747f, 2.487f, -1.486f);
            cwh0VarG.c(4.84f, 4.84f, false, false, 0.81f, -2.185f);
            cwh0VarG.b(0.637f, 0.637f, false, true, 4.502f, 0.0f);
            cwh0VarG.m(4.765f, 11.878f);
            cwh0VarG.g(0.056f, 0.065f, 0.126f, 0.15f, 0.198f, 0.236f);
            cwh0VarG.k(0.33f, 0.397f);
            cwh0VarG.k(0.013f, 0.015f);
            cwh0VarG.b(3.0f, 3.0f, false, false, 12.1f, 13.59f);
            cwh0VarG.i(1.009f);
            cwh0VarG.k(-0.444f, 0.443f);
            cwh0VarG.c(0.75f, 0.75f, false, false, 1.061f, 1.06f);
            cwh0VarG.k(2.254f, -2.253f);
            cwh0VarG.k(-2.254f, -2.254f);
            cwh0VarG.c(0.75f, 0.75f, false, false, -1.06f, 1.06f);
            cwh0VarG.k(0.443f, 0.444f);
            cwh0VarG.h(12.1f);
            cwh0VarG.c(1.5f, 1.5f, false, true, -1.146f, -0.533f);
            cwh0VarG.k(-0.004f, -0.005f);
            cwh0VarG.k(-0.333f, -0.4f);
            cwh0VarG.k(-0.288f, -0.343f);
            cwh0VarG.k(-0.031f, -0.035f);
            cwh0VarG.k(-0.02f, -0.021f);
            rjx.C(cwh0VarG, -0.037f, -0.037f, -0.974f, 1.16f);
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            n6a1 n6a1Var2 = new n6a1(j);
            cwh0 cwh0VarG2 = lf51.g(12.69f, 4.196f);
            cwh0VarG2.c(0.75f, 0.75f, false, true, 1.06f, 0.0f);
            cwh0VarG2.k(2.254f, 2.254f);
            cwh0VarG2.k(-2.254f, 2.254f);
            cwh0VarG2.c(0.75f, 0.75f, false, true, -1.06f, -1.06f);
            cwh0VarG2.k(0.443f, -0.444f);
            cwh0VarG2.i(-1.008f);
            cwh0VarG2.c(1.5f, 1.5f, false, false, -1.15f, 0.536f);
            cwh0VarG2.k(-4.63f, 5.517f);
            cwh0VarG2.g(-0.344f, 0.411f, -0.982f, 1.021f, -1.822f, 1.021f);
            cwh0VarG2.v(-1.5f);
            cwh0VarG2.g(0.122f, 0.0f, 0.371f, -0.124f, 0.674f, -0.485f);
            cwh0VarG2.k(4.63f, -5.517f);
            cwh0VarG2.b(3.0f, 3.0f, false, true, 12.125f, 5.7f);
            cwh0VarG2.i(1.008f);
            cwh0VarG2.k(-0.443f, -0.443f);
            cwh0VarG2.c(0.75f, 0.75f, false, true, 0.0f, -1.061f);
            a180.a(a180Var, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            o4p1.b = b180VarB;
        }
        b180 b180VarB2 = r4p1.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.ShuffleSmart24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            long j2 = u7h.b;
            n6a1 n6a1Var3 = new n6a1(j2);
            cwh0 cwh0VarG3 = lf51.g(7.335f, 0.6f);
            cwh0VarG3.c(0.667f, 0.667f, false, false, -1.327f, 0.0f);
            cwh0VarG3.g(-0.083f, 0.86f, -0.457f, 2.21f, -1.309f, 3.386f);
            cwh0VarG3.f(3.86f, 5.142f, 2.567f, 6.126f, 0.6f, 6.333f);
            cwh0VarG3.c(0.667f, 0.667f, false, false, 0.0f, 1.327f);
            cwh0VarG3.g(1.967f, 0.207f, 3.26f, 1.19f, 4.099f, 2.347f);
            cwh0VarG3.g(0.851f, 1.176f, 1.227f, 2.527f, 1.307f, 3.386f);
            cwh0VarG3.c(0.666f, 0.666f, false, false, 1.329f, 0.0f);
            cwh0VarG3.g(0.08f, -0.86f, 0.456f, -2.21f, 1.307f, -3.386f);
            cwh0VarG3.g(0.839f, -1.156f, 2.132f, -2.14f, 4.099f, -2.348f);
            cwh0VarG3.c(0.667f, 0.667f, false, false, 0.0f, -1.326f);
            cwh0VarG3.g(-1.967f, -0.207f, -3.26f, -1.191f, -4.1f, -2.347f);
            cwh0VarG3.f(7.792f, 2.81f, 7.417f, 1.459f, 7.336f, 0.6f);
            cwh0VarG3.e();
            cwh0VarG3.l(19.314f, 6.786f);
            cwh0VarG3.c(1.0f, 1.0f, false, true, 1.415f, -1.414f);
            cwh0VarG3.k(3.211f, 3.211f);
            cwh0VarG3.k(-3.212f, 3.211f);
            cwh0VarG3.c(1.0f, 1.0f, false, true, -1.414f, -1.414f);
            cwh0VarG3.k(0.797f, -0.797f);
            cwh0VarG3.i(-0.862f);
            cwh0VarG3.c(4.0f, 4.0f, false, false, -3.06f, 1.425f);
            cwh0VarG3.k(-6.122f, 7.275f);
            cwh0VarG3.c(7.3f, 7.3f, false, true, -1.383f, 1.279f);
            cwh0VarG3.g(-0.51f, 0.352f, -1.178f, 0.685f, -1.905f, 0.685f);
            cwh0VarG3.v(-2.0f);
            cwh0VarG3.g(0.137f, 0.0f, 0.4f, -0.077f, 0.768f, -0.331f);
            cwh0VarG3.g(0.35f, -0.242f, 0.7f, -0.577f, 0.99f, -0.921f);
            cwh0VarG3.k(6.12f, -7.275f);
            cwh0VarG3.c(6.0f, 6.0f, false, true, 4.592f, -2.137f);
            cwh0VarG3.i(0.863f);
            cwh0VarG3.e();
            a180.a(a180Var2, cwh0VarG3.a, n6a1Var3, 1.0f, 2, 1.0f);
            n6a1 n6a1Var4 = new n6a1(j2);
            cwh0 cwh0VarG4 = lf51.g(19.249f, 19.584f);
            cwh0VarG4.c(6.0f, 6.0f, false, true, -4.591f, -2.137f);
            cwh0VarG4.k(-0.771f, -0.917f);
            cwh0VarG4.k(-0.006f, -0.007f);
            cwh0VarG4.k(-0.003f, -0.003f);
            cwh0VarG4.k(-0.016f, -0.02f);
            cwh0VarG4.k(-0.06f, -0.07f);
            cwh0VarG4.c(2.0f, 2.0f, false, false, -0.118f, -0.12f);
            cwh0VarG4.k(1.289f, -1.53f);
            cwh0VarG4.c(3.3f, 3.3f, false, true, 0.42f, 0.433f);
            cwh0VarG4.k(0.028f, 0.035f);
            cwh0VarG4.k(0.007f, 0.007f);
            cwh0VarG4.k(0.76f, 0.904f);
            cwh0VarG4.c(4.0f, 4.0f, false, false, 3.06f, 1.425f);
            cwh0VarG4.i(0.84f);
            cwh0VarG4.k(-0.798f, -0.797f);
            cwh0VarG4.c(1.0f, 1.0f, false, true, 1.414f, -1.415f);
            cwh0VarG4.k(3.212f, 3.212f);
            cwh0VarG4.k(-3.212f, 3.211f);
            cwh0VarG4.c(1.0f, 1.0f, true, true, -1.414f, -1.414f);
            cwh0VarG4.k(0.797f, -0.797f);
            cwh0VarG4.e();
            a180.a(a180Var2, cwh0VarG4.a, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            r4p1.b = b180VarB2;
        }
        c = new hsx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new jrx((byte) 22);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof hsx);
    }

    public final int hashCode() {
        return -1474504667;
    }

    public final String toString() {
        return "ShuffleSmart";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
