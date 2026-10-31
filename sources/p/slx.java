package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class slx extends hux {
    public static final Parcelable.Creator<slx> CREATOR;
    public static final slx c;

    static {
        b180 b180VarB = fap1.a;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.ChromecastDisconnected16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0Var = new cwh0();
            cwh0Var.l(0.667f, 12.0f);
            cwh0Var.v(2.0f);
            cwh0Var.i(2.0f);
            cwh0Var.o(0.0f, -0.825f, -0.588f, -1.413f);
            cwh0Var.b(1.93f, 1.93f, false, false, 0.667f, 12.0f);
            cwh0Var.m(0.0f, -2.667f);
            cwh0Var.v(1.334f);
            cwh0Var.o(1.38f, 0.0f, 2.357f, 0.976f);
            cwh0Var.n(4.0f, 12.618f, 4.0f, 14.0f);
            cwh0Var.i(1.333f);
            cwh0Var.o(0.0f, -0.952f, -0.369f, -1.817f);
            cwh0Var.c(4.7f, 4.7f, false, false, -0.992f, -1.489f);
            cwh0Var.c(4.7f, 4.7f, false, false, -1.488f, -0.992f);
            cwh0Var.c(4.6f, 4.6f, false, false, -1.817f, -0.369f);
            cwh0Var.m(0.0f, -2.666f);
            cwh0Var.u(8.0f);
            cwh0Var.o(1.627f, 0.0f, 3.008f, 0.806f);
            cwh0Var.c(6.0f, 6.0f, false, true, 2.186f, 2.186f);
            cwh0Var.o(0.806f, 1.38f, 0.806f, 3.008f);
            cwh0Var.h(8.0f);
            cwh0Var.c(7.4f, 7.4f, false, false, -0.369f, -2.317f);
            cwh0Var.c(7.0f, 7.0f, false, false, -1.048f, -2.02f);
            cwh0Var.b(8.0f, 8.0f, false, false, 5.0f, 8.083f);
            cwh0Var.c(7.0f, 7.0f, false, false, -2.024f, -1.047f);
            cwh0Var.c(7.3f, 7.3f, false, false, -2.31f, -0.37f);
            cwh0Var.e();
            cwh0Var.l(14.0f, 2.0f);
            cwh0Var.h(2.0f);
            cwh0Var.c(1.28f, 1.28f, false, false, -0.94f, 0.393f);
            cwh0Var.c(1.28f, 1.28f, false, false, -0.393f, 0.94f);
            cwh0Var.v(2.0f);
            cwh0Var.h(2.0f);
            cwh0Var.v(-2.0f);
            cwh0Var.i(12.0f);
            cwh0Var.v(9.334f);
            cwh0Var.h(9.333f);
            cwh0Var.u(14.0f);
            cwh0Var.h(14.0f);
            cwh0Var.o(0.548f, 0.0f, 0.94f, -0.393f);
            cwh0Var.o(0.393f, -0.393f, 0.393f, -0.94f);
            cwh0Var.u(3.333f);
            cwh0Var.o(0.0f, -0.547f, -0.393f, -0.94f);
            cwh0Var.b(1.28f, 1.28f, false, false, 14.0f, 2.0f);
            a180.a(a180Var, cwh0Var.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            fap1.a = b180VarB;
        }
        b180 b180VarB2 = hap1.a;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.ChromecastDisconnected24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0Var2 = new cwh0();
            cwh0Var2.l(1.0f, 18.0f);
            cwh0Var2.v(3.0f);
            cwh0Var2.i(3.0f);
            cwh0Var2.c(2.9f, 2.9f, false, false, -0.88f, -2.119f);
            cwh0Var2.b(2.9f, 2.9f, false, false, 1.0f, 18.0f);
            cwh0Var2.m(0.0f, -4.0f);
            cwh0Var2.v(2.0f);
            cwh0Var2.o(2.071f, 0.0f, 3.536f, 1.465f);
            cwh0Var2.n(6.0f, 18.928f, 6.0f, 21.0f);
            cwh0Var2.i(2.0f);
            cwh0Var2.o(0.0f, -1.429f, -0.553f, -2.726f);
            cwh0Var2.c(7.0f, 7.0f, false, false, -1.489f, -2.232f);
            cwh0Var2.c(7.0f, 7.0f, false, false, -2.232f, -1.488f);
            cwh0Var2.b(6.9f, 6.9f, false, false, 1.0f, 14.0f);
            cwh0Var2.m(0.0f, -4.0f);
            cwh0Var2.v(2.0f);
            cwh0Var2.o(2.44f, 0.0f, 4.512f, 1.208f);
            cwh0Var2.c(8.96f, 8.96f, false, true, 3.28f, 3.28f);
            cwh0Var2.b(8.8f, 8.8f, false, true, 10.0f, 21.0f);
            cwh0Var2.i(2.0f);
            cwh0Var2.o(0.0f, -1.797f, -0.553f, -3.476f);
            cwh0Var2.c(10.4f, 10.4f, false, false, -1.572f, -3.03f);
            cwh0Var2.b(12.0f, 12.0f, false, false, 7.5f, 12.125f);
            cwh0Var2.c(10.5f, 10.5f, false, false, -3.036f, -1.572f);
            cwh0Var2.b(11.0f, 11.0f, false, false, 1.0f, 9.998f);
            hrt.o(cwh0Var2, 21.0f, 3.0f, 3.0f, 3.0f);
            cwh0Var2.o(-0.821f, 0.0f, -1.41f, 0.59f);
            cwh0Var2.n(0.999f, 4.178f, 1.0f, 5.0f);
            cwh0Var2.v(3.0f);
            cwh0Var2.i(2.0f);
            cwh0Var2.j(3.0f, 5.0f);
            cwh0Var2.i(18.0f);
            cwh0Var2.v(14.0f);
            cwh0Var2.i(-7.0f);
            cwh0Var2.v(2.0f);
            cwh0Var2.i(7.0f);
            cwh0Var2.o(0.821f, 0.0f, 1.41f, -0.59f);
            cwh0Var2.o(0.59f, -0.588f, 0.59f, -1.41f);
            cwh0Var2.j(23.0f, 5.0f);
            cwh0Var2.c(1.92f, 1.92f, false, false, -0.59f, -1.411f);
            cwh0Var2.b(1.93f, 1.93f, false, false, 21.0f, 3.0f);
            a180.a(a180Var2, cwh0Var2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            hap1.a = b180VarB2;
        }
        c = new slx(new dsx(b180VarB, b180VarB2), null);
        CREATOR = new hlx((byte) 10);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof slx);
    }

    public final int hashCode() {
        return -258886359;
    }

    public final String toString() {
        return "ChromecastDisconnected";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
