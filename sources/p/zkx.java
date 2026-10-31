package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zkx extends hux {
    public static final Parcelable.Creator<zkx> CREATOR;
    public static final zkx c;
    public static final byte d;

    static {
        b180 b180VarB = w5p1.a;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Building16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0Var = new cwh0();
            cwh0Var.l(8.75f, 13.25f);
            cwh0Var.i(-1.5f);
            cwh0Var.v(-6.0f);
            cwh0Var.i(1.5f);
            cwh0Var.e();
            rjx.z(cwh0Var, 3.75f, 13.25f, -1.5f, -6.0f);
            rjx.v(cwh0Var, 1.5f, 13.75f, 13.25f, -1.5f);
            cwh0Var.v(-6.0f);
            cwh0Var.i(1.5f);
            cwh0Var.e();
            cwh0Var.l(7.256f, 0.262f);
            cwh0Var.c(1.5f, 1.5f, false, true, 1.488f, 0.0f);
            cwh0Var.k(6.628f, 3.787f);
            cwh0Var.b(0.75f, 0.75f, false, true, 15.0f, 5.45f);
            cwh0Var.j(1.0f, 5.45f);
            cwh0Var.c(0.75f, 0.75f, false, true, -0.372f, -1.4f);
            cwh0Var.e();
            cwh0Var.l(3.824f, 3.95f);
            cwh0Var.i(8.352f);
            rjx.u(cwh0Var, 8.0f, 1.564f, 0.0f, 16.0f);
            cwh0Var.v(-1.5f);
            cwh0Var.i(16.0f);
            cwh0Var.j(16.0f, 16.0f);
            cwh0Var.e();
            a180.a(a180Var, cwh0Var.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            w5p1.a = b180VarB;
        }
        b180 b180VarB2 = z5p1.a;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Building24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0Var2 = new cwh0();
            cwh0Var2.l(22.0f, 22.0f);
            cwh0Var2.j(2.0f, 22.0f);
            cwh0Var2.v(-2.0f);
            rjx.t(cwh0Var2, 20.0f, 6.0f, 18.0f);
            rjx.x(cwh0Var2, 4.0f, 18.0f, -8.0f, 2.0f);
            rjx.z(cwh0Var2, 13.0f, 18.0f, -2.0f, -8.0f);
            rjx.v(cwh0Var2, 2.0f, 20.0f, 18.0f, -2.0f);
            cwh0Var2.v(-8.0f);
            cwh0Var2.i(2.0f);
            cwh0Var2.e();
            cwh0Var2.l(10.5f, 1.515f);
            cwh0Var2.c(3.0f, 3.0f, false, true, 3.0f, 0.0f);
            cwh0Var2.k(8.0f, 4.62f);
            cwh0Var2.b(1.0f, 1.0f, false, true, 21.0f, 8.0f);
            cwh0Var2.j(3.0f, 8.0f);
            cwh0Var2.c(1.0f, 1.0f, false, true, -0.5f, -1.866f);
            cwh0Var2.e();
            cwh0Var2.l(12.5f, 3.248f);
            cwh0Var2.c(1.0f, 1.0f, false, false, -1.0f, 0.0f);
            rjx.r(cwh0Var2, 6.732f, 6.0f, 10.536f);
            a180.a(a180Var2, cwh0Var2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            z5p1.a = b180VarB2;
        }
        c = new zkx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new ckx((byte) 22);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof zkx);
    }

    public final int hashCode() {
        return 1963150089;
    }

    public final String toString() {
        return "Building";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
