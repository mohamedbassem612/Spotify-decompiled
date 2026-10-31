package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rkx extends hux {
    public static final Parcelable.Creator<rkx> CREATOR;
    public static final rkx c;
    public static final byte d;

    static {
        b180 b180VarB = x2p1.a;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.AudiobookSync16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            long j = u7h.b;
            n6a1 n6a1Var = new n6a1(j);
            cwh0 cwh0VarG = lf51.g(3.45f, 1.013f);
            cwh0VarG.g(1.516f, 0.0f, 2.917f, 0.495f, 4.05f, 1.331f);
            cwh0VarG.c(6.8f, 6.8f, false, true, 3.515f, -1.31f);
            cwh0VarG.u(2.54f);
            cwh0VarG.b(5.3f, 5.3f, false, false, 8.25f, 3.66f);
            cwh0VarG.v(9.715f);
            cwh0VarG.c(6.8f, 6.8f, false, true, 3.3f, -0.85f);
            cwh0VarG.i(1.95f);
            cwh0VarG.v(-2.022f);
            cwh0VarG.h(15.0f);
            cwh0VarG.v(3.522f);
            cwh0VarG.i(-3.45f);
            cwh0VarG.b(5.3f, 5.3f, false, false, 8.0f, 15.38f);
            cwh0VarG.k(-0.5f, 0.449f);
            cwh0VarG.k(-0.5f, -0.449f);
            cwh0VarG.c(5.3f, 5.3f, false, false, -3.55f, -1.355f);
            cwh0VarG.h(0.0f);
            cwh0VarG.u(1.013f);
            cwh0VarG.e();
            cwh0VarG.l(1.5f, 12.525f);
            cwh0VarG.i(1.95f);
            cwh0VarG.g(1.197f, 0.0f, 2.322f, 0.308f, 3.3f, 0.85f);
            cwh0VarG.u(3.66f);
            cwh0VarG.c(5.3f, 5.3f, false, false, -3.3f, -1.147f);
            cwh0VarG.h(1.5f);
            cwh0VarG.e();
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            n6a1 n6a1Var2 = new n6a1(j);
            cwh0 cwh0Var = new cwh0();
            cwh0Var.l(11.999f, 10.492f);
            cwh0Var.i(-0.449f);
            cwh0Var.g(-0.535f, 0.0f, -1.053f, 0.126f, -1.55f, 0.34f);
            cwh0Var.j(10.0f, 9.233f);
            cwh0Var.c(5.2f, 5.2f, false, true, 1.55f, -0.242f);
            rjx.u(cwh0Var, 12.0f, 8.991f, 12.408f, 3.114f);
            cwh0Var.c(0.75f, 0.75f, false, true, 1.06f, 0.0f);
            cwh0Var.j(16.0f, 5.644f);
            cwh0Var.k(-2.53f, 2.53f);
            cwh0Var.c(0.75f, 0.75f, false, true, -1.06f, -1.06f);
            cwh0Var.k(0.614f, -0.615f);
            cwh0Var.i(-0.961f);
            cwh0Var.g(-0.558f, 0.0f, -1.29f, 0.231f, -2.062f, 0.611f);
            cwh0Var.j(10.001f, 5.467f);
            cwh0Var.g(0.679f, -0.275f, 1.394f, -0.468f, 2.062f, -0.468f);
            cwh0Var.i(1.17f);
            cwh0Var.k(-0.824f, -0.824f);
            cwh0Var.c(0.75f, 0.75f, false, true, 0.0f, -1.06f);
            a180.a(a180Var, cwh0Var.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            x2p1.a = b180VarB;
        }
        b180 b180VarB2 = d3p1.a;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.AudiobookSync24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            long j2 = u7h.b;
            n6a1 n6a1Var3 = new n6a1(j2);
            cwh0 cwh0VarG2 = lf51.g(5.0f, 3.0f);
            cwh0VarG2.c(9.96f, 9.96f, false, true, 6.0f, 1.999f);
            cwh0VarG2.c(9.95f, 9.95f, false, true, 4.968f, -1.944f);
            cwh0VarG2.v(2.011f);
            cwh0VarG2.b(7.96f, 7.96f, false, false, 12.0f, 6.756f);
            cwh0VarG2.v(13.585f);
            cwh0VarG2.b(9.95f, 9.95f, false, true, 17.0f, 19.0f);
            cwh0VarG2.i(3.0f);
            cwh0VarG2.v(-3.53f);
            cwh0VarG2.i(2.0f);
            cwh0VarG2.u(21.0f);
            cwh0VarG2.i(-5.0f);
            cwh0VarG2.g(-2.05f, 0.0f, -3.917f, 0.77f, -5.333f, 2.037f);
            cwh0VarG2.k(-0.667f, 0.597f);
            cwh0VarG2.k(-0.667f, -0.597f);
            cwh0VarG2.b(7.97f, 7.97f, false, false, 5.0f, 21.0f);
            cwh0VarG2.h(0.0f);
            cwh0VarG2.u(3.0f);
            cwh0VarG2.e();
            cwh0VarG2.l(2.0f, 19.0f);
            cwh0VarG2.i(3.0f);
            cwh0VarG2.g(1.821f, 0.0f, 3.529f, 0.49f, 5.0f, 1.34f);
            cwh0VarG2.u(6.758f);
            cwh0VarG2.b(7.96f, 7.96f, false, false, 5.0f, 5.0f);
            cwh0VarG2.h(2.0f);
            cwh0VarG2.e();
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var3, 1.0f, 2, 1.0f);
            n6a1 n6a1Var4 = new n6a1(j2);
            cwh0 cwh0VarG3 = lf51.g(16.937f, 15.501f);
            cwh0VarG3.c(8.0f, 8.0f, false, false, -2.933f, 0.58f);
            cwh0VarG3.j(14.004f, 13.96f);
            cwh0VarG3.c(10.0f, 10.0f, false, true, 2.933f, -0.458f);
            cwh0VarG3.e();
            cwh0VarG3.l(18.877f, 5.293f);
            cwh0VarG3.c(1.0f, 1.0f, false, true, 1.414f, 0.0f);
            cwh0VarG3.j(23.998f, 9.0f);
            cwh0VarG3.k(-3.707f, 3.707f);
            cwh0VarG3.c(1.0f, 1.0f, false, true, -1.414f, -1.414f);
            cwh0VarG3.k(1.244f, -1.245f);
            cwh0VarG3.g(-2.913f, 0.149f, -4.805f, 0.626f, -6.117f, 1.21f);
            cwh0VarG3.j(14.004f, 9.106f);
            cwh0VarG3.g(1.508f, -0.544f, 3.49f, -0.94f, 6.207f, -1.065f);
            cwh0VarG3.k(-1.334f, -1.334f);
            cwh0VarG3.c(1.0f, 1.0f, false, true, 0.0f, -1.414f);
            a180.a(a180Var2, cwh0VarG3.a, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            d3p1.a = b180VarB2;
        }
        c = new rkx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new ckx((byte) 14);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof rkx);
    }

    public final int hashCode() {
        return 1547257797;
    }

    public final String toString() {
        return "AudiobookSync";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
