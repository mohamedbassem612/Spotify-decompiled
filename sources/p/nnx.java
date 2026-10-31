package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nnx extends hux {
    public static final Parcelable.Creator<nnx> CREATOR;
    public static final nnx c;

    static {
        b180 b180VarB = j541.e;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Google16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(1.431f, 4.632f);
            cwh0VarG.b(7.5f, 7.5f, false, true, 8.133f, 0.5f);
            cwh0VarG.g(2.022f, 0.0f, 3.72f, 0.743f, 5.019f, 1.953f);
            cwh0VarG.j(11.0f, 4.605f);
            cwh0VarG.g(-0.777f, -0.744f, -1.766f, -1.122f, -2.867f, -1.122f);
            cwh0VarG.g(-1.953f, 0.0f, -3.607f, 1.32f, -4.196f, 3.092f);
            cwh0VarG.g(-0.15f, 0.45f, -0.235f, 0.93f, -0.235f, 1.425f);
            cwh0VarG.g(0.0f, 0.494f, 0.085f, 0.975f, 0.235f, 1.425f);
            cwh0VarG.g(0.59f, 1.773f, 2.243f, 3.092f, 4.196f, 3.092f);
            cwh0VarG.g(1.01f, 0.0f, 1.869f, -0.266f, 2.54f, -0.716f);
            cwh0VarG.c(3.45f, 3.45f, false, false, 1.497f, -2.264f);
            cwh0VarG.h(8.133f);
            cwh0VarG.v(-2.9f);
            cwh0VarG.i(7.064f);
            cwh0VarG.o(0.135f, 0.736f, 0.136f, 1.533f);
            cwh0VarG.g(0.0f, 2.284f, -0.818f, 4.207f, -2.236f, 5.513f);
            cwh0VarG.g(-1.24f, 1.145f, -2.939f, 1.817f, -4.964f, 1.817f);
            cwh0VarG.b(7.497f, 7.497f, false, true, 0.633f, 8.0f);
            cwh0VarG.g(0.0f, -1.21f, 0.29f, -2.356f, 0.798f, -3.368f);
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            j541.e = b180VarB;
        }
        b180 b180VarB2 = nb51.a;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Google24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(2.37f, 7.06f);
            cwh0VarG2.b(11.0f, 11.0f, false, true, 12.2f, 1.0f);
            cwh0VarG2.g(2.965f, 0.0f, 5.455f, 1.09f, 7.36f, 2.865f);
            cwh0VarG2.j(16.405f, 7.02f);
            cwh0VarG2.g(-1.14f, -1.09f, -2.59f, -1.645f, -4.205f, -1.645f);
            cwh0VarG2.g(-2.865f, 0.0f, -5.29f, 1.935f, -6.155f, 4.535f);
            cwh0VarG2.b(6.6f, 6.6f, false, false, 5.7f, 12.0f);
            cwh0VarG2.g(0.0f, 0.725f, 0.125f, 1.43f, 0.345f, 2.09f);
            cwh0VarG2.g(0.865f, 2.6f, 3.29f, 4.535f, 6.155f, 4.535f);
            cwh0VarG2.g(1.48f, 0.0f, 2.74f, -0.39f, 3.725f, -1.05f);
            cwh0VarG2.c(5.06f, 5.06f, false, false, 2.195f, -3.32f);
            cwh0VarG2.h(12.2f);
            cwh0VarG2.u(10.0f);
            cwh0VarG2.i(10.36f);
            cwh0VarG2.g(0.13f, 0.72f, 0.2f, 1.47f, 0.2f, 2.25f);
            cwh0VarG2.g(0.0f, 3.35f, -1.2f, 6.17f, -3.28f, 8.085f);
            cwh0VarG2.f(17.66f, 22.015f, 15.17f, 23.0f, 12.2f, 23.0f);
            cwh0VarG2.c(10.996f, 10.996f, false, true, -11.0f, -11.0f);
            cwh0VarG2.g(0.0f, -1.775f, 0.425f, -3.455f, 1.17f, -4.94f);
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            nb51.a = b180VarB2;
        }
        c = new nnx(new dsx(b180VarB, b180VarB2), null);
        CREATOR = new mmx((byte) 25);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof nnx);
    }

    public final int hashCode() {
        return 1216915406;
    }

    public final String toString() {
        return "Google";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
