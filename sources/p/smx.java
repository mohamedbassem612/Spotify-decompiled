package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class smx extends hux {
    public static final Parcelable.Creator<smx> CREATOR;
    public static final smx c;
    public static final byte d;

    static {
        b180 b180VarB = cxm.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Dj16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(7.813f, 14.497f);
            cwh0VarG.b(6.5f, 6.5f, false, true, 1.5f, 8.016f);
            cwh0VarG.g(0.008f, -3.553f, 2.71f, -5.744f, 5.043f, -6.078f);
            cwh0VarG.g(0.85f, -0.121f, 1.288f, 0.037f, 1.564f, 0.246f);
            cwh0VarG.g(0.312f, 0.238f, 0.553f, 0.639f, 0.822f, 1.276f);
            cwh0VarG.o(0.115f, 0.277f, 0.239f, 0.602f);
            cwh0VarG.g(0.451f, 1.167f, 1.05f, 2.717f, 2.505f, 3.81f);
            cwh0VarG.g(1.01f, 0.76f, 1.46f, 1.529f, 1.592f, 2.209f);
            cwh0VarG.g(0.13f, 0.679f, -0.037f, 1.375f, -0.468f, 2.03f);
            cwh0VarG.g(-0.88f, 1.34f, -2.793f, 2.388f, -4.844f, 2.388f);
            cwh0VarG.e();
            cwh0VarG.l(7.776f, 15.997f);
            cwh0VarG.b(8.0f, 8.0f, true, false, 0.0f, 8.032f);
            cwh0VarG.g(0.0f, 4.34f, 3.464f, 7.87f, 7.776f, 7.965f);
            cwh0VarG.m(6.666f, -7.124f);
            cwh0VarG.g(-0.358f, -0.788f, -0.979f, -1.532f, -1.868f, -2.2f);
            cwh0VarG.g(-1.082f, -0.813f, -1.51f, -1.9f, -1.967f, -3.06f);
            cwh0VarG.c(31.0f, 31.0f, false, false, -0.296f, -0.736f);
            cwh0VarG.c(6.3f, 6.3f, false, false, -0.605f, -1.151f);
            cwh0VarG.c(6.53f, 6.53f, false, true, 4.39f, 4.01f);
            cwh0VarG.c(6.5f, 6.5f, false, true, 0.346f, 3.137f);
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            cxm.b = b180VarB;
        }
        b180 b180VarB2 = aym.a;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Dj24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(11.74f, 20.997f);
            cwh0VarG2.b(9.0f, 9.0f, false, true, 3.0f, 12.022f);
            cwh0VarG2.g(0.011f, -4.92f, 3.754f, -7.955f, 6.986f, -8.417f);
            cwh0VarG2.g(1.178f, -0.169f, 1.792f, 0.05f, 2.183f, 0.346f);
            cwh0VarG2.g(0.438f, 0.333f, 0.774f, 0.894f, 1.144f, 1.773f);
            cwh0VarG2.g(0.108f, 0.256f, 0.216f, 0.536f, 0.332f, 0.834f);
            cwh0VarG2.g(0.622f, 1.61f, 1.444f, 3.737f, 3.443f, 5.239f);
            cwh0VarG2.g(1.398f, 1.05f, 2.026f, 2.118f, 2.208f, 3.066f);
            cwh0VarG2.q(-0.052f, 1.917f, -0.65f, 2.827f);
            cwh0VarG2.g(-1.22f, 1.858f, -3.87f, 3.31f, -6.71f, 3.31f);
            cwh0VarG2.e();
            cwh0VarG2.l(11.69f, 22.997f);
            cwh0VarG2.o(0.155f, 0.003f, 0.31f, 0.003f);
            cwh0VarG2.g(6.076f, 0.0f, 11.0f, -4.924f, 11.0f, -11.0f);
            cwh0VarG2.c(10.98f, 10.98f, false, false, -2.47f, -6.947f);
            cwh0VarG2.c(11.0f, 11.0f, false, false, -3.61f, -2.894f);
            cwh0VarG2.b(10.96f, 10.96f, false, false, 12.0f, 1.0f);
            cwh0VarG2.f(5.925f, 1.0f, 1.0f, 5.925f, 1.0f, 12.0f);
            cwh0VarG2.v(0.045f);
            cwh0VarG2.g(0.0f, 5.966f, 4.762f, 10.82f, 10.69f, 10.951f);
            cwh0VarG2.e();
            cwh0VarG2.l(20.903f, 13.331f);
            cwh0VarG2.g(-0.482f, -1.123f, -1.35f, -2.183f, -2.614f, -3.133f);
            cwh0VarG2.g(-1.502f, -1.128f, -2.096f, -2.64f, -2.726f, -4.24f);
            cwh0VarG2.c(43.0f, 43.0f, false, false, -0.407f, -1.01f);
            cwh0VarG2.g(-0.234f, -0.556f, -0.51f, -1.138f, -0.886f, -1.66f);
            cwh0VarG2.o(0.921f, 0.241f, 1.754f, 0.659f);
            cwh0VarG2.c(9.04f, 9.04f, false, true, 4.417f, 4.92f);
            cwh0VarG2.c(9.1f, 9.1f, false, true, 0.463f, 4.464f);
            cwh0VarG2.e();
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            aym.a = b180VarB2;
        }
        c = new smx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new hbn1((byte) 16);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof smx);
    }

    public final int hashCode() {
        return 643524763;
    }

    public final String toString() {
        return "Dj";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
