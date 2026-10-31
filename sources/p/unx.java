package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class unx extends hux {
    public static final Parcelable.Creator<unx> CREATOR;
    public static final unx c;
    public static final byte d;

    static {
        b180 b180VarB = obg1.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Headphones16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(0.0f, 8.289f);
            cwh0VarG.c(8.0f, 8.0f, true, true, 14.77f, 4.263f);
            cwh0VarG.k(-0.913f, 1.583f);
            cwh0VarG.b(2.291f, 2.291f, true, true, 9.89f, 11.84f);
            cwh0VarG.k(1.212f, -2.09f);
            cwh0VarG.b(2.31f, 2.31f, false, true, 13.1f, 8.6f);
            cwh0VarG.i(1.392f);
            cwh0VarG.c(6.5f, 6.5f, true, false, -12.985f, 0.0f);
            cwh0VarG.i(1.39f);
            cwh0VarG.c(2.31f, 2.31f, false, true, 1.999f, 1.15f);
            cwh0VarG.k(1.212f, 2.09f);
            cwh0VarG.c(2.291f, 2.291f, true, true, -3.966f, 2.295f);
            cwh0VarG.k(-0.915f, -1.585f);
            cwh0VarG.b(7.96f, 7.96f, false, true, 0.0f, 8.289f);
            cwh0VarG.m(1.755f, 1.81f);
            cwh0VarG.g(0.172f, 0.594f, 0.426f, 1.151f, 0.749f, 1.662f);
            cwh0VarG.k(0.008f, 0.013f);
            cwh0VarG.k(0.93f, 1.611f);
            cwh0VarG.c(0.791f, 0.791f, true, false, 1.37f, -0.792f);
            cwh0VarG.j(3.6f, 10.503f);
            cwh0VarG.c(0.81f, 0.81f, false, false, -0.702f, -0.403f);
            hrt.o(cwh0VarG, 14.245f, 10.099f, 13.1f, 10.099f);
            cwh0VarG.c(0.81f, 0.81f, false, false, -0.7f, 0.405f);
            cwh0VarG.k(-1.213f, 2.089f);
            cwh0VarG.c(0.791f, 0.791f, true, false, 1.37f, 0.792f);
            cwh0VarG.k(0.929f, -1.61f);
            cwh0VarG.k(0.008f, -0.012f);
            cwh0VarG.g(0.324f, -0.511f, 0.578f, -1.07f, 0.75f, -1.663f);
            cwh0VarG.e();
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            obg1.b = b180VarB;
        }
        b180 b180VarB2 = fdg1.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Headphones24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(0.5f, 12.5f);
            cwh0VarG2.f(0.5f, 6.149f, 5.649f, 1.0f, 12.0f, 1.0f);
            cwh0VarG2.q(11.5f, 5.149f, 11.5f, 11.5f);
            cwh0VarG2.c(11.43f, 11.43f, false, true, -1.768f, 6.13f);
            cwh0VarG2.k(-1.325f, 2.294f);
            cwh0VarG2.c(3.232f, 3.232f, true, true, -5.594f, -3.238f);
            cwh0VarG2.k(1.83f, -3.155f);
            cwh0VarG2.c(3.0f, 3.0f, false, true, 2.595f, -1.494f);
            cwh0VarG2.i(2.247f);
            cwh0VarG2.c(9.5f, 9.5f, true, false, -18.97f, 0.0f);
            cwh0VarG2.j(4.76f, 13.037f);
            cwh0VarG2.c(3.0f, 3.0f, false, true, 2.595f, 1.494f);
            cwh0VarG2.k(1.831f, 3.155f);
            cwh0VarG2.c(3.232f, 3.232f, true, true, -5.594f, 3.238f);
            cwh0VarG2.k(-1.327f, -2.298f);
            cwh0VarG2.b(11.44f, 11.44f, false, true, 0.5f, 12.5f);
            cwh0VarG2.m(2.342f, 2.537f);
            cwh0VarG2.g(0.25f, 0.907f, 0.633f, 1.76f, 1.125f, 2.537f);
            cwh0VarG2.k(0.01f, 0.017f);
            cwh0VarG2.k(1.348f, 2.333f);
            cwh0VarG2.c(1.232f, 1.232f, true, false, 2.132f, -1.234f);
            cwh0VarG2.k(-1.83f, -3.155f);
            cwh0VarG2.c(1.0f, 1.0f, false, false, -0.866f, -0.498f);
            cwh0VarG2.e();
            cwh0VarG2.l(21.158f, 15.037f);
            cwh0VarG2.i(-1.92f);
            cwh0VarG2.c(1.0f, 1.0f, false, false, -0.864f, 0.498f);
            cwh0VarG2.k(-1.831f, 3.155f);
            cwh0VarG2.c(1.232f, 1.232f, true, false, 2.132f, 1.234f);
            cwh0VarG2.k(1.345f, -2.33f);
            cwh0VarG2.k(0.011f, -0.017f);
            cwh0VarG2.c(9.5f, 9.5f, false, false, 1.127f, -2.54f);
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            fdg1.b = b180VarB2;
        }
        c = new unx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new snx((byte) 1);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof unx);
    }

    public final int hashCode() {
        return -452997702;
    }

    public final String toString() {
        return "Headphones";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
