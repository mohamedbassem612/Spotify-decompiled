package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lox extends hux {
    public static final Parcelable.Creator<lox> CREATOR;
    public static final lox c;
    public static final byte d;

    static {
        b180 b180VarB = ozn1.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.ListSparkling16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarI = ydh.i(15.0f, 3.0f, 7.0f, 3.0f);
            rjx.r(cwh0VarI, 7.0f, 1.5f, 8.0f);
            cwh0VarI.l(15.0f, 8.75f);
            rjx.x(cwh0VarI, 1.0f, 8.75f, -1.5f, 14.0f);
            cwh0VarI.l(9.0f, 14.5f);
            cwh0VarI.j(1.0f, 14.5f);
            rjx.r(cwh0VarI, 1.0f, 13.0f, 8.0f);
            cwh0VarI.l(3.334f, 1.0f);
            cwh0VarI.g(0.083f, 0.0f, 0.162f, 0.028f, 0.223f, 0.08f);
            cwh0VarI.g(0.06f, 0.05f, 0.099f, 0.121f, 0.106f, 0.197f);
            cwh0VarI.g(0.027f, 0.264f, 0.147f, 0.682f, 0.42f, 1.044f);
            cwh0VarI.g(0.267f, 0.353f, 0.673f, 0.648f, 1.29f, 0.71f);
            cwh0VarI.c(0.34f, 0.34f, false, true, 0.21f, 0.1f);
            cwh0VarI.c(0.3f, 0.3f, false, true, 0.084f, 0.203f);
            cwh0VarI.g(0.0f, 0.075f, -0.03f, 0.147f, -0.085f, 0.203f);
            cwh0VarI.c(0.34f, 0.34f, false, true, -0.21f, 0.1f);
            cwh0VarI.c(1.77f, 1.77f, false, false, -1.289f, 0.71f);
            cwh0VarI.c(2.2f, 2.2f, false, false, -0.42f, 1.045f);
            cwh0VarI.c(0.3f, 0.3f, false, true, -0.107f, 0.196f);
            cwh0VarI.c(0.35f, 0.35f, false, true, -0.222f, 0.079f);
            cwh0VarI.c(0.35f, 0.35f, false, true, -0.222f, -0.08f);
            cwh0VarI.c(0.3f, 0.3f, false, true, -0.106f, -0.195f);
            cwh0VarI.c(2.2f, 2.2f, false, false, -0.42f, -1.045f);
            cwh0VarI.c(1.77f, 1.77f, false, false, -1.29f, -0.71f);
            cwh0VarI.c(0.34f, 0.34f, false, true, -0.211f, -0.099f);
            cwh0VarI.b(0.3f, 0.3f, false, true, 1.0f, 3.334f);
            cwh0VarI.g(0.0f, -0.075f, 0.03f, -0.148f, 0.085f, -0.204f);
            cwh0VarI.c(0.34f, 0.34f, false, true, 0.211f, -0.099f);
            cwh0VarI.c(1.77f, 1.77f, false, false, 1.29f, -0.71f);
            cwh0VarI.g(0.272f, -0.362f, 0.393f, -0.78f, 0.42f, -1.044f);
            cwh0VarI.c(0.3f, 0.3f, false, true, 0.106f, -0.197f);
            cwh0VarI.g(0.06f, -0.051f, 0.14f, -0.08f, 0.222f, -0.08f);
            cwh0VarI.m(9.33f, 9.33f);
            cwh0VarI.g(0.083f, 0.0f, 0.162f, 0.028f, 0.223f, 0.08f);
            cwh0VarI.g(0.06f, 0.05f, 0.099f, 0.121f, 0.106f, 0.197f);
            cwh0VarI.g(0.027f, 0.264f, 0.147f, 0.682f, 0.42f, 1.044f);
            cwh0VarI.g(0.267f, 0.353f, 0.673f, 0.648f, 1.29f, 0.71f);
            cwh0VarI.c(0.34f, 0.34f, false, true, 0.21f, 0.1f);
            cwh0VarI.c(0.3f, 0.3f, false, true, 0.084f, 0.203f);
            cwh0VarI.g(0.0f, 0.075f, -0.03f, 0.147f, -0.085f, 0.203f);
            cwh0VarI.c(0.34f, 0.34f, false, true, -0.21f, 0.1f);
            cwh0VarI.c(1.77f, 1.77f, false, false, -1.289f, 0.71f);
            cwh0VarI.c(2.2f, 2.2f, false, false, -0.42f, 1.045f);
            cwh0VarI.c(0.3f, 0.3f, false, true, -0.107f, 0.196f);
            cwh0VarI.c(0.35f, 0.35f, false, true, -0.222f, 0.079f);
            cwh0VarI.c(0.35f, 0.35f, false, true, -0.222f, -0.08f);
            cwh0VarI.c(0.3f, 0.3f, false, true, -0.106f, -0.195f);
            cwh0VarI.c(2.2f, 2.2f, false, false, -0.42f, -1.044f);
            cwh0VarI.c(1.77f, 1.77f, false, false, -1.29f, -0.71f);
            cwh0VarI.c(0.34f, 0.34f, false, true, -0.211f, -0.1f);
            cwh0VarI.c(0.3f, 0.3f, false, true, -0.085f, -0.204f);
            cwh0VarI.g(0.0f, -0.075f, 0.03f, -0.148f, 0.085f, -0.204f);
            cwh0VarI.c(0.34f, 0.34f, false, true, 0.211f, -0.099f);
            cwh0VarI.c(1.77f, 1.77f, false, false, 1.29f, -0.71f);
            cwh0VarI.g(0.272f, -0.362f, 0.393f, -0.78f, 0.42f, -1.044f);
            cwh0VarI.c(0.3f, 0.3f, false, true, 0.106f, -0.197f);
            cwh0VarI.c(0.34f, 0.34f, false, true, 0.222f, -0.08f);
            a180.a(a180Var, cwh0VarI.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            ozn1.b = b180VarB;
        }
        b180 b180VarB2 = rzn1.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.ListSparkling24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0Var = new cwh0();
            cwh0Var.l(10.0f, 3.0f);
            cwh0Var.i(12.0f);
            cwh0Var.v(2.0f);
            rjx.u(cwh0Var, 10.0f, 5.0f, 2.0f, 11.0f);
            rjx.A(cwh0Var, 20.0f, 2.0f, 2.0f, 13.0f);
            rjx.z(cwh0Var, 2.0f, 19.0f, 12.0f, 2.0f);
            rjx.u(cwh0Var, 2.0f, 21.0f, 4.501f, 1.0f);
            cwh0Var.c(0.52f, 0.52f, false, true, 0.334f, 0.12f);
            cwh0Var.c(0.45f, 0.45f, false, true, 0.16f, 0.295f);
            cwh0Var.c(3.3f, 3.3f, false, false, 0.63f, 1.566f);
            cwh0Var.g(0.4f, 0.53f, 1.009f, 0.972f, 1.934f, 1.066f);
            cwh0Var.c(0.5f, 0.5f, false, true, 0.315f, 0.15f);
            cwh0Var.b(0.44f, 0.44f, false, true, 8.0f, 4.5f);
            cwh0Var.c(0.44f, 0.44f, false, true, -0.126f, 0.305f);
            cwh0Var.c(0.5f, 0.5f, false, true, -0.315f, 0.149f);
            cwh0Var.g(-0.925f, 0.094f, -1.534f, 0.536f, -1.934f, 1.066f);
            cwh0Var.c(3.3f, 3.3f, false, false, -0.63f, 1.566f);
            cwh0Var.c(0.45f, 0.45f, false, true, -0.16f, 0.294f);
            cwh0Var.c(0.52f, 0.52f, false, true, -0.333f, 0.119f);
            cwh0Var.c(0.52f, 0.52f, false, true, -0.333f, -0.119f);
            cwh0Var.c(0.45f, 0.45f, false, true, -0.16f, -0.294f);
            cwh0Var.c(3.3f, 3.3f, false, false, -0.63f, -1.566f);
            cwh0Var.g(-0.401f, -0.53f, -1.01f, -0.972f, -1.935f, -1.065f);
            cwh0Var.c(0.5f, 0.5f, false, true, -0.317f, -0.149f);
            cwh0Var.b(0.44f, 0.44f, false, true, 1.0f, 4.501f);
            cwh0Var.g(0.0f, -0.113f, 0.045f, -0.222f, 0.127f, -0.305f);
            cwh0Var.c(0.5f, 0.5f, false, true, 0.317f, -0.149f);
            cwh0Var.g(0.925f, -0.094f, 1.534f, -0.536f, 1.934f, -1.066f);
            cwh0Var.c(3.3f, 3.3f, false, false, 0.63f, -1.566f);
            cwh0Var.c(0.45f, 0.45f, false, true, 0.16f, -0.295f);
            cwh0Var.b(0.52f, 0.52f, false, true, 4.5f, 1.0f);
            cwh0Var.e();
            cwh0Var.l(19.501f, 16.0f);
            cwh0Var.c(0.52f, 0.52f, false, true, 0.334f, 0.12f);
            cwh0Var.c(0.45f, 0.45f, false, true, 0.16f, 0.295f);
            cwh0Var.c(3.3f, 3.3f, false, false, 0.63f, 1.566f);
            cwh0Var.g(0.4f, 0.53f, 1.009f, 0.972f, 1.934f, 1.066f);
            cwh0Var.c(0.5f, 0.5f, false, true, 0.314f, 0.15f);
            cwh0Var.c(0.44f, 0.44f, false, true, 0.127f, 0.304f);
            cwh0Var.c(0.44f, 0.44f, false, true, -0.127f, 0.305f);
            cwh0Var.c(0.5f, 0.5f, false, true, -0.314f, 0.149f);
            cwh0Var.g(-0.925f, 0.094f, -1.534f, 0.536f, -1.934f, 1.066f);
            cwh0Var.c(3.3f, 3.3f, false, false, -0.63f, 1.566f);
            cwh0Var.c(0.45f, 0.45f, false, true, -0.16f, 0.294f);
            cwh0Var.c(0.52f, 0.52f, false, true, -0.334f, 0.119f);
            cwh0Var.c(0.52f, 0.52f, false, true, -0.332f, -0.119f);
            cwh0Var.c(0.45f, 0.45f, false, true, -0.16f, -0.294f);
            cwh0Var.c(3.3f, 3.3f, false, false, -0.63f, -1.566f);
            cwh0Var.g(-0.401f, -0.53f, -1.01f, -0.972f, -1.935f, -1.065f);
            cwh0Var.c(0.5f, 0.5f, false, true, -0.316f, -0.149f);
            cwh0Var.c(0.44f, 0.44f, false, true, -0.128f, -0.306f);
            cwh0Var.g(0.0f, -0.113f, 0.045f, -0.222f, 0.128f, -0.306f);
            cwh0Var.c(0.5f, 0.5f, false, true, 0.316f, -0.148f);
            cwh0Var.g(0.925f, -0.094f, 1.534f, -0.536f, 1.934f, -1.066f);
            cwh0Var.c(3.3f, 3.3f, false, false, 0.63f, -1.566f);
            cwh0Var.c(0.45f, 0.45f, false, true, 0.16f, -0.295f);
            cwh0Var.c(0.52f, 0.52f, false, true, 0.333f, -0.12f);
            a180.a(a180Var2, cwh0Var.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            rzn1.b = b180VarB2;
        }
        c = new lox(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new snx((byte) 17);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof lox);
    }

    public final int hashCode() {
        return 259777056;
    }

    public final String toString() {
        return "ListSparkling";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
