package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wmx extends hux {
    public static final Parcelable.Creator<wmx> CREATOR;
    public static final wmx c;

    static {
        b180 b180VarB = pqo.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Dumbbell16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(12.177f, 3.125f);
            cwh0VarG.c(0.25f, 0.25f, false, false, -0.341f, -0.092f);
            cwh0VarG.j(9.944f, 4.115f);
            cwh0VarG.k(0.381f, 0.661f);
            cwh0VarG.c(0.755f, 0.755f, false, true, -0.274f, 1.03f);
            cwh0VarG.j(4.963f, 8.76f);
            cwh0VarG.c(0.755f, 0.755f, false, true, -1.033f, -0.275f);
            cwh0VarG.k(-0.382f, -0.662f);
            cwh0VarG.k(-1.887f, 1.09f);
            cwh0VarG.c(0.25f, 0.25f, false, false, -0.092f, 0.34f);
            cwh0VarG.k(2.293f, 3.972f);
            cwh0VarG.c(0.25f, 0.25f, false, false, 0.342f, 0.092f);
            cwh0VarG.k(1.887f, -1.09f);
            cwh0VarG.k(-0.383f, -0.662f);
            cwh0VarG.c(0.755f, 0.755f, false, true, 0.275f, -1.03f);
            cwh0VarG.k(5.088f, -2.953f);
            cwh0VarG.k(0.068f, -0.035f);
            cwh0VarG.c(0.755f, 0.755f, false, true, 0.965f, 0.31f);
            cwh0VarG.k(0.383f, 0.664f);
            cwh0VarG.k(1.89f, -1.081f);
            cwh0VarG.c(0.25f, 0.25f, false, false, 0.093f, -0.342f);
            cwh0VarG.e();
            cwh0VarG.l(4.855f, 7.087f);
            cwh0VarG.k(3.8f, -2.205f);
            cwh0VarG.k(-0.135f, -0.233f);
            cwh0VarG.c(1.25f, 1.25f, false, true, 0.462f, -1.71f);
            cwh0VarG.k(2.108f, -1.207f);
            cwh0VarG.c(1.75f, 1.75f, false, true, 2.386f, 0.643f);
            cwh0VarG.k(2.293f, 3.972f);
            cwh0VarG.c(1.75f, 1.75f, false, true, -0.646f, 2.393f);
            cwh0VarG.k(-2.106f, 1.206f);
            cwh0VarG.c(1.25f, 1.25f, false, true, -1.704f, -0.46f);
            cwh0VarG.k(-0.136f, -0.234f);
            cwh0VarG.k(-3.798f, 2.206f);
            cwh0VarG.k(0.136f, 0.235f);
            cwh0VarG.c(1.25f, 1.25f, false, true, -0.458f, 1.707f);
            cwh0VarG.k(-2.103f, 1.215f);
            cwh0VarG.c(1.75f, 1.75f, false, true, -2.39f, -0.64f);
            cwh0VarG.j(0.27f, 10.002f);
            cwh0VarG.c(1.75f, 1.75f, false, true, 0.64f, -2.39f);
            cwh0VarG.k(2.104f, -1.215f);
            cwh0VarG.c(1.25f, 1.25f, false, true, 1.708f, 0.457f);
            cwh0VarG.e();
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            pqo.b = b180VarB;
        }
        b180 b180VarB2 = xto.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Dumbbell24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarQ = rjx.q(14.35f, 6.893f, 0.453f, 0.784f);
            cwh0VarQ.c(1.05f, 1.05f, false, true, -0.382f, 1.433f);
            cwh0VarQ.j(8.3f, 12.664f);
            cwh0VarQ.c(1.05f, 1.05f, false, true, -1.435f, -0.383f);
            cwh0VarQ.k(-0.454f, -0.786f);
            cwh0VarQ.k(-2.413f, 1.393f);
            cwh0VarQ.k(3.241f, 5.615f);
            cwh0VarQ.k(2.413f, -1.394f);
            cwh0VarQ.k(-0.454f, -0.786f);
            cwh0VarQ.c(1.05f, 1.05f, false, true, 0.382f, -1.433f);
            cwh0VarQ.k(6.122f, -3.555f);
            cwh0VarQ.k(0.095f, -0.049f);
            cwh0VarQ.c(1.05f, 1.05f, false, true, 1.34f, 0.433f);
            cwh0VarQ.k(0.456f, 0.788f);
            rjx.C(cwh0VarQ, 2.418f, -1.383f, -3.24f, -5.614f);
            cwh0VarQ.l(8.12f, 10.456f);
            cwh0VarQ.j(12.597f, 7.856f);
            cwh0VarQ.j(12.367f, 7.459f);
            cwh0VarQ.c(1.5f, 1.5f, false, true, 0.555f, -2.052f);
            cwh0VarQ.k(2.854f, -1.633f);
            cwh0VarQ.c(2.0f, 2.0f, false, true, 2.725f, 0.736f);
            cwh0VarQ.k(3.241f, 5.614f);
            cwh0VarQ.c(2.0f, 2.0f, false, true, -0.739f, 2.736f);
            cwh0VarQ.k(-2.85f, 1.63f);
            cwh0VarQ.c(1.5f, 1.5f, false, true, -2.044f, -0.55f);
            cwh0VarQ.k(-0.229f, -0.397f);
            cwh0VarQ.k(-4.477f, 2.6f);
            cwh0VarQ.k(0.23f, 0.4f);
            cwh0VarQ.c(1.5f, 1.5f, false, true, -0.549f, 2.049f);
            cwh0VarQ.k(-2.846f, 1.643f);
            cwh0VarQ.c(2.0f, 2.0f, false, true, -2.732f, -0.732f);
            cwh0VarQ.k(-3.241f, -5.615f);
            cwh0VarQ.c(2.0f, 2.0f, false, true, 0.732f, -2.732f);
            cwh0VarQ.k(2.846f, -1.643f);
            cwh0VarQ.c(1.5f, 1.5f, false, true, 2.049f, 0.549f);
            cwh0VarQ.e();
            a180.a(a180Var2, cwh0VarQ.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            xto.b = b180VarB2;
        }
        c = new wmx(new dsx(b180VarB, b180VarB2), null);
        CREATOR = new mmx((byte) 8);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof wmx);
    }

    public final int hashCode() {
        return 1259021374;
    }

    public final String toString() {
        return "Dumbbell";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
