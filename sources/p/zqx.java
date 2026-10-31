package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zqx extends hux {
    public static final Parcelable.Creator<zqx> CREATOR;
    public static final zqx c;

    static {
        b180 b180VarB = yxo1.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.PlaybackSpeed2x16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarQ = rjx.q(13.56f, 10.383f, 1.97f, 1.97f);
            cwh0VarQ.k(-1.06f, 1.06f);
            cwh0VarQ.k(-1.97f, -1.97f);
            cwh0VarQ.k(-1.97f, 1.97f);
            cwh0VarQ.k(-1.06f, -1.06f);
            cwh0VarQ.k(1.97f, -1.97f);
            cwh0VarQ.k(-1.97f, -1.97f);
            cwh0VarQ.k(1.06f, -1.06f);
            cwh0VarQ.k(1.97f, 1.969f);
            cwh0VarQ.k(1.97f, -1.97f);
            rjx.C(cwh0VarQ, 1.06f, 1.06f, -1.97f, 1.97f);
            cwh0VarQ.l(0.866f, 11.852f);
            cwh0VarQ.b(3.8f, 3.8f, false, false, 0.578f, 13.5f);
            cwh0VarQ.i(7.424f);
            cwh0VarQ.v(-1.408f);
            cwh0VarQ.h(2.564f);
            cwh0VarQ.c(2.3f, 2.3f, false, true, 0.254f, -0.512f);
            cwh0VarQ.o(0.255f, -0.384f, 0.72f, -0.8f);
            cwh0VarQ.o(0.465f, -0.432f, 1.232f, -0.976f);
            cwh0VarQ.o(1.168f, -0.832f, 1.872f, -1.552f);
            cwh0VarQ.o(0.72f, -0.736f, 1.04f, -1.456f);
            cwh0VarQ.s(0.32f, -1.536f);
            cwh0VarQ.o(0.0f, -0.896f, -0.416f, -1.664f);
            cwh0VarQ.o(-0.4f, -0.768f, -1.232f, -1.232f);
            cwh0VarQ.o(-0.816f, -0.48f, -2.0f, -0.48f);
            cwh0VarQ.o(-1.168f, 0.0f, -2.032f, 0.512f);
            cwh0VarQ.b(3.37f, 3.37f, false, false, 0.994f, 3.868f);
            cwh0VarQ.o(-0.448f, 0.944f, -0.448f, 2.256f);
            cwh0VarQ.i(1.52f);
            cwh0VarQ.o(0.0f, -0.912f, 0.256f, -1.536f);
            cwh0VarQ.o(0.272f, -0.623f, 0.784f, -0.944f);
            cwh0VarQ.o(0.528f, -0.336f, 1.232f, -0.336f);
            cwh0VarQ.o(0.672f, 0.0f, 1.136f, 0.272f);
            cwh0VarQ.o(0.48f, 0.255f, 0.704f, 0.72f);
            cwh0VarQ.o(0.24f, 0.448f, 0.24f, 1.008f);
            cwh0VarQ.o(0.0f, 0.592f, -0.256f, 1.136f);
            cwh0VarQ.r(5.33f, 7.548f);
            cwh0VarQ.r(3.794f, 8.78f);
            cwh0VarQ.o(-1.215f, 0.832f, -1.92f, 1.568f);
            cwh0VarQ.o(-0.688f, 0.736f, -1.008f, 1.504f);
            a180.a(a180Var, cwh0VarQ.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            yxo1.b = b180VarB;
        }
        b180 b180VarB2 = zxo1.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.PlaybackSpeed2x24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarQ2 = rjx.q(20.164f, 16.25f, 2.543f, -2.543f);
            cwh0VarQ2.k(-1.414f, -1.414f);
            cwh0VarQ2.k(-2.543f, 2.543f);
            cwh0VarQ2.k(-2.543f, -2.543f);
            cwh0VarQ2.k(-1.414f, 1.414f);
            cwh0VarQ2.k(2.543f, 2.543f);
            cwh0VarQ2.k(-2.543f, 2.543f);
            cwh0VarQ2.k(1.414f, 1.414f);
            cwh0VarQ2.k(2.543f, -2.543f);
            rjx.C(cwh0VarQ2, 2.543f, 2.543f, 1.414f, -1.414f);
            cwh0VarQ2.l(2.785f, 17.808f);
            cwh0VarQ2.c(5.4f, 5.4f, false, false, -0.414f, 2.346f);
            cwh0VarQ2.i(10.626f);
            cwh0VarQ2.v(-1.932f);
            cwh0VarQ2.h(5.094f);
            cwh0VarQ2.c(3.2f, 3.2f, false, true, 0.359f, -0.782f);
            cwh0VarQ2.o(0.368f, -0.553f, 1.035f, -1.173f);
            cwh0VarQ2.o(0.69f, -0.621f, 1.817f, -1.403f);
            cwh0VarQ2.o(1.702f, -1.22f, 2.714f, -2.254f);
            cwh0VarQ2.o(1.035f, -1.058f, 1.495f, -2.093f);
            cwh0VarQ2.s(0.46f, -2.231f);
            cwh0VarQ2.o(0.0f, -1.265f, -0.575f, -2.37f);
            cwh0VarQ2.o(-0.576f, -1.103f, -1.771f, -1.77f);
            cwh0VarQ2.o(-1.173f, -0.69f, -2.852f, -0.69f);
            cwh0VarQ2.o(-1.68f, 0.0f, -2.921f, 0.736f);
            cwh0VarQ2.o(-1.22f, 0.736f, -1.886f, 2.116f);
            cwh0VarQ2.o(-0.644f, 1.357f, -0.644f, 3.22f);
            cwh0VarQ2.i(2.093f);
            cwh0VarQ2.o(0.0f, -1.311f, 0.39f, -2.231f);
            cwh0VarQ2.o(0.392f, -0.92f, 1.15f, -1.403f);
            cwh0VarQ2.o(0.76f, -0.483f, 1.795f, -0.483f);
            cwh0VarQ2.o(0.99f, 0.0f, 1.679f, 0.39f);
            cwh0VarQ2.o(0.69f, 0.392f, 1.035f, 1.059f);
            cwh0VarQ2.s(0.345f, 1.495f);
            cwh0VarQ2.o(0.0f, 0.873f, -0.391f, 1.679f);
            cwh0VarQ2.o(-0.368f, 0.781f, -1.22f, 1.61f);
            cwh0VarQ2.o(-0.827f, 0.804f, -2.23f, 1.794f);
            cwh0VarQ2.o(-1.726f, 1.195f, -2.737f, 2.254f);
            cwh0VarQ2.o(-0.99f, 1.035f, -1.45f, 2.116f);
            cwh0VarQ2.e();
            a180.a(a180Var2, cwh0VarQ2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            zxo1.b = b180VarB2;
        }
        c = new zqx(new dsx(b180VarB, b180VarB2), null);
        CREATOR = new dqx((byte) 21);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof zqx);
    }

    public final int hashCode() {
        return 1506770045;
    }

    public final String toString() {
        return "PlaybackSpeed2x";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
