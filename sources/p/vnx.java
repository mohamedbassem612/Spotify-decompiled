package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vnx extends hux {
    public static final Parcelable.Creator<vnx> CREATOR;
    public static final vnx c;
    public static final byte d;

    static {
        b180 b180VarB = mth1.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.HeadphonesOptimize16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(6.553f, 0.421f);
            cwh0VarG.c(8.0f, 8.0f, false, true, 2.26f, -0.09f);
            cwh0VarG.c(2.75f, 2.75f, false, false, -0.967f, 1.46f);
            cwh0VarG.c(6.5f, 6.5f, false, false, -5.938f, 4.227f);
            cwh0VarG.b(6.5f, 6.5f, false, false, 1.507f, 8.6f);
            cwh0VarG.i(1.39f);
            cwh0VarG.c(2.31f, 2.31f, false, true, 2.0f, 1.15f);
            cwh0VarG.k(1.211f, 2.09f);
            cwh0VarG.c(2.292f, 2.292f, true, true, -3.966f, 2.295f);
            cwh0VarG.k(-0.914f, -1.585f);
            cwh0VarG.b(8.004f, 8.004f, false, true, 6.553f, 0.421f);
            cwh0VarG.l(1.755f, 10.1f);
            cwh0VarG.g(0.172f, 0.594f, 0.426f, 1.151f, 0.749f, 1.662f);
            cwh0VarG.k(0.008f, 0.013f);
            cwh0VarG.k(0.93f, 1.611f);
            cwh0VarG.c(0.792f, 0.792f, false, false, 1.37f, -0.792f);
            cwh0VarG.j(3.6f, 10.503f);
            cwh0VarG.c(0.81f, 0.81f, false, false, -0.702f, -0.403f);
            cwh0VarG.e();
            cwh0VarG.l(15.872f, 6.88f);
            cwh0VarG.g(0.13f, 0.724f, 0.162f, 1.464f, 0.089f, 2.2f);
            cwh0VarG.c(8.0f, 8.0f, false, true, -1.19f, 3.472f);
            cwh0VarG.k(-0.914f, 1.583f);
            cwh0VarG.c(2.295f, 2.295f, false, true, -3.131f, 0.836f);
            cwh0VarG.c(2.293f, 2.293f, false, true, -0.836f, -3.13f);
            cwh0VarG.k(1.213f, -2.09f);
            cwh0VarG.b(2.31f, 2.31f, false, true, 13.1f, 8.6f);
            cwh0VarG.i(1.392f);
            cwh0VarG.o(0.027f, -0.582f, -0.05f, -1.155f);
            cwh0VarG.o(0.097f, -0.097f, 0.184f, -0.202f);
            cwh0VarG.c(2.7f, 2.7f, false, false, 1.246f, -0.364f);
            cwh0VarG.l(13.1f, 10.1f);
            cwh0VarG.c(0.81f, 0.81f, false, false, -0.7f, 0.404f);
            cwh0VarG.k(-1.213f, 2.09f);
            cwh0VarG.c(0.792f, 0.792f, true, false, 1.37f, 0.791f);
            cwh0VarG.k(0.93f, -1.61f);
            cwh0VarG.k(0.007f, -0.012f);
            cwh0VarG.g(0.324f, -0.51f, 0.578f, -1.07f, 0.75f, -1.663f);
            rjx.t(cwh0VarG, 0.001f, 12.5f, 0.75f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.75f, 0.75f);
            cwh0VarG.v(4.0f);
            cwh0VarG.c(0.75f, 0.75f, false, true, -1.5f, 0.0f);
            cwh0VarG.v(-4.0f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.75f, -0.75f);
            cwh0VarG.m(-2.0f, 1.0f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.75f, 0.75f);
            cwh0VarG.v(2.0f);
            cwh0VarG.c(0.75f, 0.75f, false, true, -1.5f, 0.0f);
            cwh0VarG.v(-2.0f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.75f, -0.75f);
            cwh0VarG.m(4.0f, 0.0f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.75f, 0.75f);
            cwh0VarG.v(2.0f);
            cwh0VarG.c(0.75f, 0.75f, false, true, -1.5f, 0.0f);
            cwh0VarG.v(-2.0f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.75f, -0.75f);
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            mth1.b = b180VarB;
        }
        b180 b180VarB2 = cgj1.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.HeadphonesOptimize24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(12.0f, 1.0f);
            cwh0VarG2.g(0.663f, 0.0f, 1.313f, 0.06f, 1.945f, 0.167f);
            cwh0VarG2.c(3.5f, 3.5f, false, false, -1.307f, 1.86f);
            cwh0VarG2.c(9.5f, 9.5f, false, false, -10.122f, 10.01f);
            cwh0VarG2.j(4.76f, 13.037f);
            cwh0VarG2.c(3.0f, 3.0f, false, true, 2.595f, 1.494f);
            cwh0VarG2.k(1.831f, 3.155f);
            cwh0VarG2.c(3.234f, 3.234f, false, true, -2.362f, 4.857f);
            cwh0VarG2.c(3.235f, 3.235f, false, true, -3.232f, -1.62f);
            cwh0VarG2.k(-1.326f, -2.297f);
            cwh0VarG2.b(11.44f, 11.44f, false, true, 0.5f, 12.5f);
            cwh0VarG2.f(0.5f, 6.15f, 5.65f, 1.0f, 12.0f, 1.0f);
            cwh0VarG2.l(2.842f, 15.037f);
            cwh0VarG2.g(0.25f, 0.907f, 0.633f, 1.76f, 1.125f, 2.537f);
            cwh0VarG2.k(0.01f, 0.017f);
            cwh0VarG2.k(1.348f, 2.333f);
            cwh0VarG2.c(1.23f, 1.23f, false, false, 1.236f, 0.63f);
            cwh0VarG2.c(1.233f, 1.233f, false, false, 0.896f, -1.864f);
            cwh0VarG2.k(-1.83f, -3.155f);
            cwh0VarG2.c(1.0f, 1.0f, false, false, -0.866f, -0.498f);
            cwh0VarG2.e();
            cwh0VarG2.l(23.056f, 9.337f);
            cwh0VarG2.b(11.5f, 11.5f, false, true, 23.5f, 12.5f);
            cwh0VarG2.c(11.43f, 11.43f, false, true, -1.768f, 6.13f);
            cwh0VarG2.k(-1.325f, 2.294f);
            cwh0VarG2.c(3.234f, 3.234f, false, true, -5.389f, 0.37f);
            cwh0VarG2.c(3.23f, 3.23f, false, true, -0.205f, -3.608f);
            cwh0VarG2.k(1.83f, -3.155f);
            cwh0VarG2.c(3.0f, 3.0f, false, true, 2.595f, -1.494f);
            cwh0VarG2.i(2.247f);
            cwh0VarG2.c(9.5f, 9.5f, false, false, -0.172f, -2.412f);
            cwh0VarG2.c(3.5f, 3.5f, false, false, 0.852f, -1.13f);
            cwh0VarG2.o(0.466f, -0.023f, 0.89f, -0.158f);
            cwh0VarG2.m(-3.818f, 5.7f);
            cwh0VarG2.c(1.0f, 1.0f, false, false, -0.864f, 0.498f);
            cwh0VarG2.k(-1.831f, 3.155f);
            cwh0VarG2.c(1.24f, 1.24f, false, false, 0.07f, 1.384f);
            cwh0VarG2.c(1.24f, 1.24f, false, false, 1.313f, 0.444f);
            cwh0VarG2.c(1.23f, 1.23f, false, false, 0.749f, -0.594f);
            cwh0VarG2.k(1.345f, -2.33f);
            cwh0VarG2.k(0.011f, -0.017f);
            cwh0VarG2.c(9.5f, 9.5f, false, false, 1.127f, -2.54f);
            cwh0VarG2.e();
            cwh0VarG2.l(19.0f, 1.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 1.0f, 1.0f);
            cwh0VarG2.v(6.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, -2.0f, 0.0f);
            cwh0VarG2.j(18.0f, 2.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 1.0f, -1.0f);
            cwh0VarG2.m(-3.0f, 2.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 1.0f, 1.0f);
            cwh0VarG2.v(2.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, -2.0f, 0.0f);
            cwh0VarG2.j(15.0f, 4.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 1.0f, -1.0f);
            cwh0VarG2.m(6.0f, 0.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 1.0f, 1.0f);
            cwh0VarG2.v(2.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, -2.0f, 0.0f);
            cwh0VarG2.j(21.0f, 4.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 1.0f, -1.0f);
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            cgj1.b = b180VarB2;
        }
        c = new vnx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new snx((byte) 2);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof vnx);
    }

    public final int hashCode() {
        return -71357769;
    }

    public final String toString() {
        return "HeadphonesOptimize";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
