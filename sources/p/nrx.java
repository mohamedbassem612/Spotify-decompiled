package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nrx extends hux {
    public static final Parcelable.Creator<nrx> CREATOR;
    public static final nrx c;
    public static final byte d;

    static {
        b180 b180VarB = l0p1.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Preview16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(4.284f, 5.21f);
            cwh0VarG.b(4.1f, 4.1f, false, false, 4.0f, 6.706f);
            cwh0VarG.g(0.0f, 2.222f, 1.782f, 4.04f, 4.0f, 4.04f);
            cwh0VarG.q(4.0f, -1.818f, 4.0f, -4.04f);
            cwh0VarG.g(0.0f, -0.529f, -0.1f, -1.034f, -0.284f, -1.498f);
            cwh0VarG.o(0.436f, 0.284f, 0.84f, 0.639f);
            cwh0VarG.g(0.436f, 0.38f, 1.143f, 1.143f, 1.739f, 2.175f);
            cwh0VarG.g(-0.596f, 1.031f, -1.303f, 1.793f, -1.738f, 2.175f);
            cwh0VarG.g(-1.244f, 1.09f, -2.692f, 1.68f, -4.557f, 1.68f);
            cwh0VarG.q(-3.313f, -0.59f, -4.557f, -1.68f);
            cwh0VarG.g(-0.435f, -0.382f, -1.142f, -1.144f, -1.738f, -2.175f);
            cwh0VarG.g(0.596f, -1.032f, 1.303f, -1.794f, 1.738f, -2.175f);
            cwh0VarG.o(0.405f, -0.356f, 0.841f, -0.639f);
            cwh0VarG.e();
            cwh0VarG.l(8.0f, 2.666f);
            cwh0VarG.g(-2.233f, 0.0f, -4.03f, 0.725f, -5.546f, 2.053f);
            cwh0VarG.g(-0.603f, 0.53f, -1.544f, 1.564f, -2.27f, 2.957f);
            cwh0VarG.k(-0.18f, 0.347f);
            cwh0VarG.k(0.18f, 0.346f);
            cwh0VarG.g(0.726f, 1.393f, 1.667f, 2.428f, 2.27f, 2.957f);
            cwh0VarG.f(3.97f, 12.653f, 5.767f, 13.378f, 8.0f, 13.378f);
            cwh0VarG.q(4.03f, -0.725f, 5.546f, -2.052f);
            cwh0VarG.g(0.603f, -0.53f, 1.544f, -1.564f, 2.27f, -2.957f);
            cwh0VarG.k(0.18f, -0.346f);
            cwh0VarG.k(-0.18f, -0.347f);
            cwh0VarG.g(-0.726f, -1.393f, -1.667f, -2.427f, -2.27f, -2.956f);
            cwh0VarG.f(12.03f, 3.392f, 10.233f, 2.667f, 8.0f, 2.667f);
            cwh0VarG.e();
            cwh0VarG.l(8.0f, 4.166f);
            cwh0VarG.g(1.372f, 0.0f, 2.5f, 1.128f, 2.5f, 2.54f);
            cwh0VarG.g(0.0f, 1.411f, -1.128f, 2.54f, -2.5f, 2.54f);
            cwh0VarG.q(-2.5f, -1.129f, -2.5f, -2.54f);
            cwh0VarG.q(1.128f, -2.54f, 2.5f, -2.54f);
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            l0p1.b = b180VarB;
        }
        b180 b180VarB2 = m0p1.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Preview24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(6.703f, 7.382f);
            cwh0VarG2.b(6.1f, 6.1f, false, false, 6.113f, 10.0f);
            cwh0VarG2.g(0.0f, 3.292f, 2.614f, 6.0f, 5.887f, 6.0f);
            cwh0VarG2.q(5.886f, -2.708f, 5.886f, -6.0f);
            cwh0VarG2.g(0.0f, -0.936f, -0.211f, -1.825f, -0.589f, -2.618f);
            cwh0VarG2.g(0.573f, 0.341f, 1.115f, 0.744f, 1.634f, 1.204f);
            cwh0VarG2.g(0.674f, 0.596f, 1.77f, 1.793f, 2.683f, 3.414f);
            cwh0VarG2.g(-0.913f, 1.62f, -2.01f, 2.818f, -2.683f, 3.414f);
            cwh0VarG2.f(17.037f, 17.093f, 14.833f, 18.0f, 12.0f, 18.0f);
            cwh0VarG2.q(-5.037f, -0.907f, -6.931f, -2.586f);
            cwh0VarG2.g(-0.674f, -0.596f, -1.77f, -1.793f, -2.683f, -3.414f);
            cwh0VarG2.g(0.913f, -1.62f, 2.01f, -2.818f, 2.683f, -3.414f);
            cwh0VarG2.o(0.777f, -0.691f, 1.634f, -1.204f);
            cwh0VarG2.l(12.0f, 4.0f);
            cwh0VarG2.f(8.671f, 4.0f, 5.996f, 5.091f, 3.742f, 7.089f);
            cwh0VarG2.g(-0.896f, 0.794f, -2.3f, 2.353f, -3.381f, 4.453f);
            cwh0VarG2.j(0.125f, 12.0f);
            cwh0VarG2.k(0.236f, 0.458f);
            cwh0VarG2.g(1.082f, 2.1f, 2.485f, 3.659f, 3.381f, 4.453f);
            cwh0VarG2.f(5.996f, 18.908f, 8.672f, 20.0f, 12.0f, 20.0f);
            cwh0VarG2.g(3.329f, 0.0f, 6.004f, -1.091f, 8.258f, -3.089f);
            cwh0VarG2.g(0.896f, -0.794f, 2.3f, -2.353f, 3.38f, -4.453f);
            cwh0VarG2.k(0.237f, -0.458f);
            cwh0VarG2.k(-0.236f, -0.458f);
            cwh0VarG2.g(-1.082f, -2.1f, -2.485f, -3.659f, -3.381f, -4.453f);
            cwh0VarG2.f(18.004f, 5.09f, 15.328f, 4.0f, 12.0f, 4.0f);
            cwh0VarG2.m(0.0f, 2.0f);
            cwh0VarG2.g(2.125f, 0.0f, 3.886f, 1.77f, 3.886f, 4.0f);
            cwh0VarG2.p(14.125f, 14.0f, 12.0f, 14.0f);
            cwh0VarG2.q(-3.886f, -1.77f, -3.886f, -4.0f);
            cwh0VarG2.p(9.875f, 6.0f, 12.0f, 6.0f);
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            m0p1.b = b180VarB2;
        }
        c = new nrx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new jrx((byte) 3);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof nrx);
    }

    public final int hashCode() {
        return -1455633197;
    }

    public final String toString() {
        return "Preview";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
