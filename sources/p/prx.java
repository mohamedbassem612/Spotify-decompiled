package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class prx extends hux {
    public static final Parcelable.Creator<prx> CREATOR;
    public static final prx c;
    public static final byte d;

    static {
        b180 b180VarB = h1p1.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.QrCode16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0Var = new cwh0();
            cwh0Var.l(15.0f, 1.0f);
            cwh0Var.v(6.0f);
            cwh0Var.j(9.0f, 7.0f);
            rjx.u(cwh0Var, 9.0f, 1.0f, 11.0f, 5.0f);
            cwh0Var.i(2.0f);
            cwh0Var.j(13.0f, 3.0f);
            cwh0Var.i(-2.0f);
            cwh0Var.e();
            cwh0Var.l(15.0f, 9.0f);
            cwh0Var.v(6.0f);
            ydh.k(cwh0Var, 9.0f, 15.0f, 9.0f, 9.0f);
            rjx.z(cwh0Var, 11.0f, 13.0f, 2.0f, -2.0f);
            cwh0Var.i(-2.0f);
            cwh0Var.e();
            cwh0Var.l(7.0f, 9.0f);
            cwh0Var.v(6.0f);
            ydh.k(cwh0Var, 1.0f, 15.0f, 1.0f, 9.0f);
            rjx.z(cwh0Var, 3.0f, 13.0f, 2.0f, -2.0f);
            rjx.u(cwh0Var, 3.0f, 11.0f, 1.0f, 1.0f);
            rjx.A(cwh0Var, 2.0f, 2.0f, 1.0f, 3.0f);
            rjx.z(cwh0Var, 5.0f, 1.0f, 2.0f, 2.0f);
            rjx.u(cwh0Var, 5.0f, 3.0f, 3.0f, 3.0f);
            rjx.A(cwh0Var, 2.0f, 2.0f, 3.0f, 5.0f);
            rjx.z(cwh0Var, 1.0f, 3.0f, 2.0f, 2.0f);
            rjx.u(cwh0Var, 1.0f, 5.0f, 5.0f, 5.0f);
            rjx.A(cwh0Var, 2.0f, 2.0f, 5.0f, 7.0f);
            a180.a(a180Var, cwh0Var.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            h1p1.b = b180VarB;
        }
        b180 b180VarB2 = i1p1.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.QrCode24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            long j = u7h.b;
            n6a1 n6a1Var2 = new n6a1(j);
            cwh0 cwh0Var2 = new cwh0();
            cwh0Var2.l(11.0f, 13.0f);
            cwh0Var2.v(10.0f);
            cwh0Var2.j(1.0f, 23.0f);
            rjx.u(cwh0Var2, 1.0f, 13.0f, 3.0f, 21.0f);
            rjx.A(cwh0Var2, 6.0f, -6.0f, 3.0f, 15.0f);
            cwh0Var2.l(23.0f, 1.0f);
            cwh0Var2.v(10.0f);
            ydh.k(cwh0Var2, 13.0f, 11.0f, 13.0f, 1.0f);
            cwh0Var2.l(15.0f, 9.0f);
            cwh0Var2.i(6.0f);
            cwh0Var2.j(21.0f, 3.0f);
            cwh0Var2.i(-6.0f);
            cwh0Var2.e();
            cwh0Var2.l(23.0f, 13.0f);
            cwh0Var2.v(10.0f);
            ydh.k(cwh0Var2, 13.0f, 23.0f, 13.0f, 13.0f);
            rjx.z(cwh0Var2, 15.0f, 21.0f, 6.0f, -6.0f);
            rjx.v(cwh0Var2, -6.0f, 1.0f, 1.0f, 2.0f);
            cwh0Var2.v(2.0f);
            cwh0Var2.j(1.0f, 3.0f);
            cwh0Var2.e();
            rjx.z(cwh0Var2, 3.0f, 3.0f, 2.0f, 2.0f);
            rjx.u(cwh0Var2, 3.0f, 5.0f, 5.0f, 1.0f);
            rjx.A(cwh0Var2, 2.0f, 2.0f, 5.0f, 3.0f);
            rjx.z(cwh0Var2, 7.0f, 1.0f, 2.0f, 2.0f);
            rjx.u(cwh0Var2, 7.0f, 3.0f, 9.0f, 3.0f);
            rjx.A(cwh0Var2, 2.0f, 2.0f, 9.0f, 5.0f);
            rjx.z(cwh0Var2, 5.0f, 5.0f, 2.0f, 2.0f);
            rjx.u(cwh0Var2, 5.0f, 7.0f, 1.0f, 5.0f);
            rjx.A(cwh0Var2, 2.0f, 2.0f, 1.0f, 7.0f);
            rjx.z(cwh0Var2, 3.0f, 9.0f, 2.0f, 2.0f);
            rjx.u(cwh0Var2, 3.0f, 11.0f, 7.0f, 9.0f);
            rjx.A(cwh0Var2, 2.0f, 2.0f, 7.0f, 11.0f);
            rjx.z(cwh0Var2, 1.0f, 9.0f, 2.0f, 2.0f);
            rjx.u(cwh0Var2, 1.0f, 11.0f, 3.0f, 7.0f);
            rjx.A(cwh0Var2, 2.0f, 2.0f, 3.0f, 9.0f);
            rjx.z(cwh0Var2, 5.0f, 3.0f, 2.0f, 2.0f);
            rjx.u(cwh0Var2, 5.0f, 5.0f, 9.0f, 7.0f);
            rjx.A(cwh0Var2, 2.0f, 2.0f, 9.0f, 9.0f);
            rjx.z(cwh0Var2, 7.0f, 7.0f, 2.0f, 2.0f);
            cwh0Var2.j(7.0f, 9.0f);
            cwh0Var2.e();
            a180.a(a180Var2, cwh0Var2.a, n6a1Var2, 1.0f, 2, 1.0f);
            n6a1 n6a1Var3 = new n6a1(j);
            cwh0 cwh0Var3 = new cwh0();
            cwh0Var3.l(17.0f, 5.0f);
            cwh0Var3.i(2.0f);
            cwh0Var3.v(2.0f);
            cwh0Var3.i(-2.0f);
            cwh0Var3.e();
            rjx.z(cwh0Var3, 17.0f, 17.0f, 2.0f, 2.0f);
            rjx.v(cwh0Var3, -2.0f, 5.0f, 17.0f, 2.0f);
            cwh0Var3.v(2.0f);
            cwh0Var3.j(5.0f, 19.0f);
            cwh0Var3.e();
            a180.a(a180Var2, cwh0Var3.a, n6a1Var3, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            i1p1.b = b180VarB2;
        }
        c = new prx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new jrx((byte) 5);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof prx);
    }

    public final int hashCode() {
        return 1504674115;
    }

    public final String toString() {
        return "QrCode";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
