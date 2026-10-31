package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qrx extends hux {
    public static final Parcelable.Creator<qrx> CREATOR;
    public static final qrx c;
    public static final byte d;

    static {
        b180 b180VarB = j1p1.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Queue16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0Var = new cwh0();
            cwh0Var.l(15.0f, 15.0f);
            cwh0Var.j(1.0f, 15.0f);
            cwh0Var.v(-1.5f);
            rjx.t(cwh0Var, 14.0f, 15.0f, 10.5f);
            cwh0Var.j(1.0f, 10.5f);
            rjx.r(cwh0Var, 1.0f, 9.0f, 14.0f);
            cwh0Var.l(1.0f, 3.5f);
            cwh0Var.b(2.5f, 2.5f, false, true, 3.5f, 1.0f);
            cwh0Var.i(9.0f);
            cwh0Var.c(2.5f, 2.5f, false, true, 0.0f, 5.0f);
            cwh0Var.i(-9.0f);
            cwh0Var.b(2.5f, 2.5f, false, true, 1.0f, 3.5f);
            cwh0Var.m(2.5f, -1.0f);
            cwh0Var.c(1.0f, 1.0f, false, false, 0.0f, 2.0f);
            cwh0Var.i(9.0f);
            cwh0Var.c(1.0f, 1.0f, true, false, 0.0f, -2.0f);
            cwh0Var.e();
            a180.a(a180Var, cwh0Var.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            j1p1.b = b180VarB;
        }
        b180 b180VarB2 = k1p1.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Queue24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0Var2 = new cwh0();
            cwh0Var2.l(21.0f, 22.0f);
            cwh0Var2.j(3.0f, 22.0f);
            cwh0Var2.v(-2.0f);
            rjx.t(cwh0Var2, 18.0f, 21.0f, 16.0f);
            rjx.x(cwh0Var2, 3.0f, 16.0f, -2.0f, 18.0f);
            cwh0Var2.l(2.05f, 6.546f);
            cwh0Var2.c(3.5f, 3.5f, false, true, 3.5f, -3.5f);
            cwh0Var2.i(13.0f);
            cwh0Var2.c(3.5f, 3.5f, false, true, 0.0f, 7.0f);
            cwh0Var2.i(-13.0f);
            cwh0Var2.c(3.5f, 3.5f, false, true, -3.5f, -3.5f);
            cwh0Var2.m(3.5f, -1.5f);
            cwh0Var2.c(1.5f, 1.5f, false, false, 0.0f, 3.0f);
            cwh0Var2.i(13.0f);
            cwh0Var2.c(1.5f, 1.5f, false, false, 0.0f, -3.0f);
            cwh0Var2.e();
            a180.a(a180Var2, cwh0Var2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            k1p1.b = b180VarB2;
        }
        c = new qrx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new jrx((byte) 6);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof qrx);
    }

    public final int hashCode() {
        return -1475360548;
    }

    public final String toString() {
        return "Queue";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
