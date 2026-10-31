package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xnx extends hux {
    public static final Parcelable.Creator<xnx> CREATOR;
    public static final xnx c;
    public static final byte d;

    static {
        b180 b180VarB = j9k1.a;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Heart16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(1.69f, 2.0f);
            cwh0VarG.b(4.58f, 4.58f, false, true, 8.0f, 2.023f);
            cwh0VarG.b(4.58f, 4.58f, false, true, 11.88f, 0.817f);
            cwh0VarG.i(0.002f);
            cwh0VarG.c(4.62f, 4.62f, false, true, 3.782f, 3.65f);
            cwh0VarG.v(0.003f);
            cwh0VarG.c(4.54f, 4.54f, false, true, -1.011f, 3.84f);
            cwh0VarG.j(9.35f, 14.629f);
            cwh0VarG.c(1.765f, 1.765f, false, true, -2.093f, 0.464f);
            cwh0VarG.c(1.8f, 1.8f, false, true, -0.605f, -0.463f);
            cwh0VarG.j(1.348f, 8.309f);
            cwh0VarG.b(4.58f, 4.58f, false, true, 1.689f, 2.0f);
            cwh0VarG.e();
            cwh0VarG.l(4.848f, 2.252f);
            cwh0VarG.b(3.082f, 3.082f, false, false, 2.49f, 7.337f);
            cwh0VarG.k(0.005f, 0.005f);
            cwh0VarG.j(7.8f, 13.664f);
            cwh0VarG.c(0.264f, 0.264f, false, false, 0.311f, 0.069f);
            cwh0VarG.c(0.3f, 0.3f, false, false, 0.09f, -0.069f);
            cwh0VarG.k(5.312f, -6.33f);
            cwh0VarG.c(3.04f, 3.04f, false, false, 0.68f, -2.573f);
            cwh0VarG.c(3.12f, 3.12f, false, false, -2.551f, -2.463f);
            cwh0VarG.c(3.08f, 3.08f, false, false, -2.612f, 0.816f);
            cwh0VarG.k(-0.007f, 0.007f);
            cwh0VarG.c(1.5f, 1.5f, false, true, -2.045f, 0.0f);
            cwh0VarG.k(-0.009f, -0.008f);
            cwh0VarG.c(3.08f, 3.08f, false, false, -2.121f, -0.861f);
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            j9k1.a = b180VarB;
        }
        b180 b180VarB2 = dem1.a;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Heart24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(5.21f, 1.57f);
            cwh0VarG2.c(6.76f, 6.76f, false, true, 6.708f, 1.545f);
            cwh0VarG2.c(0.124f, 0.124f, false, false, 0.165f, 0.0f);
            cwh0VarG2.c(6.74f, 6.74f, false, true, 5.715f, -1.78f);
            cwh0VarG2.k(0.004f, 0.001f);
            cwh0VarG2.c(6.8f, 6.8f, false, true, 5.571f, 5.376f);
            cwh0VarG2.v(0.003f);
            cwh0VarG2.c(6.69f, 6.69f, false, true, -1.49f, 5.655f);
            cwh0VarG2.k(-7.954f, 9.48f);
            cwh0VarG2.c(2.518f, 2.518f, false, true, -3.857f, 0.0f);
            cwh0VarG2.j(2.12f, 12.37f);
            cwh0VarG2.b(6.68f, 6.68f, false, true, 0.627f, 6.714f);
            cwh0VarG2.b(6.76f, 6.76f, false, true, 5.21f, 1.57f);
            cwh0VarG2.m(3.12f, 1.803f);
            cwh0VarG2.c(4.757f, 4.757f, false, false, -5.74f, 3.725f);
            cwh0VarG2.k(-0.001f, 0.002f);
            cwh0VarG2.c(4.68f, 4.68f, false, false, 1.049f, 3.969f);
            cwh0VarG2.k(0.009f, 0.01f);
            cwh0VarG2.k(7.958f, 9.485f);
            cwh0VarG2.c(0.518f, 0.518f, false, false, 0.79f, 0.0f);
            cwh0VarG2.k(7.968f, -9.495f);
            cwh0VarG2.c(4.69f, 4.69f, false, false, 1.049f, -3.965f);
            cwh0VarG2.c(4.8f, 4.8f, false, false, -3.931f, -3.794f);
            cwh0VarG2.c(4.74f, 4.74f, false, false, -4.023f, 1.256f);
            cwh0VarG2.k(-0.008f, 0.008f);
            cwh0VarG2.c(2.123f, 2.123f, false, true, -2.9f, 0.0f);
            cwh0VarG2.k(-0.007f, -0.007f);
            cwh0VarG2.c(4.76f, 4.76f, false, false, -2.214f, -1.194f);
            cwh0VarG2.e();
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            dem1.a = b180VarB2;
        }
        dsx dsxVar = new dsx(b180VarB, b180VarB2);
        b180 b180VarB3 = vvm1.b;
        if (b180VarB3 == null) {
            a180 a180Var3 = new a180("Encore.Vector.HeartActive16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i3 = bui1.a;
            n6a1 n6a1Var3 = new n6a1(u7h.b);
            cwh0 cwh0VarG3 = lf51.g(15.724f, 4.22f);
            cwh0VarG3.b(4.31f, 4.31f, false, false, 12.192f, 0.814f);
            cwh0VarG3.c(4.27f, 4.27f, false, false, -3.622f, 1.13f);
            cwh0VarG3.c(0.837f, 0.837f, false, true, -1.14f, 0.0f);
            cwh0VarG3.c(4.272f, 4.272f, false, false, -6.21f, 5.855f);
            cwh0VarG3.k(5.916f, 7.05f);
            cwh0VarG3.c(1.128f, 1.128f, false, false, 1.727f, 0.0f);
            cwh0VarG3.k(5.916f, -7.05f);
            cwh0VarG3.c(4.23f, 4.23f, false, false, 0.945f, -3.577f);
            cwh0VarG3.e();
            a180.a(a180Var3, cwh0VarG3.a, n6a1Var3, 1.0f, 2, 1.0f);
            b180VarB3 = a180Var3.b();
            vvm1.b = b180VarB3;
        }
        b180 b180VarB4 = t4n1.a;
        if (b180VarB4 == null) {
            a180 a180Var4 = new a180("Encore.Vector.HeartActive24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i4 = bui1.a;
            n6a1 n6a1Var4 = new n6a1(u7h.b);
            cwh0 cwh0VarG4 = lf51.g(8.667f, 1.912f);
            cwh0VarG4.c(6.257f, 6.257f, false, false, -7.462f, 7.677f);
            cwh0VarG4.g(0.24f, 0.906f, 0.683f, 1.747f, 1.295f, 2.457f);
            cwh0VarG4.k(7.955f, 9.482f);
            cwh0VarG4.c(2.015f, 2.015f, false, false, 3.09f, 0.0f);
            cwh0VarG4.k(7.956f, -9.482f);
            cwh0VarG4.c(6.19f, 6.19f, false, false, 1.382f, -5.234f);
            cwh0VarG4.k(-0.49f, 0.097f);
            cwh0VarG4.k(0.49f, -0.099f);
            cwh0VarG4.c(6.3f, 6.3f, false, false, -5.162f, -4.98f);
            cwh0VarG4.i(-0.002f);
            cwh0VarG4.c(6.24f, 6.24f, false, false, -5.295f, 1.65f);
            cwh0VarG4.c(0.623f, 0.623f, false, true, -0.848f, 0.0f);
            cwh0VarG4.c(6.26f, 6.26f, false, false, -2.91f, -1.568f);
            cwh0VarG4.e();
            a180.a(a180Var4, cwh0VarG4.a, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB4 = a180Var4.b();
            t4n1.a = b180VarB4;
        }
        c = new xnx(dsxVar, new dsx(b180VarB3, b180VarB4));
        d = (byte) 8;
        CREATOR = new snx((byte) 4);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof xnx);
    }

    public final int hashCode() {
        return -1484152815;
    }

    public final String toString() {
        return "Heart";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
