package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ymx extends hux {
    public static final Parcelable.Creator<ymx> CREATOR;
    public static final ymx c;
    public static final byte d;

    static {
        b180 b180VarB = v8r.c;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Email16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0Var = new cwh0();
            cwh0Var.l(0.0f, 2.0f);
            cwh0Var.i(16.0f);
            cwh0Var.v(13.0f);
            rjx.u(cwh0Var, 0.0f, 15.0f, 1.5f, 4.567f);
            cwh0Var.j(8.0f, 8.32f);
            cwh0Var.k(6.5f, -3.753f);
            rjx.r(cwh0Var, 14.5f, 3.5f, -13.0f);
            cwh0Var.l(14.5f, 6.299f);
            cwh0Var.j(8.0f, 10.052f);
            cwh0Var.j(1.5f, 6.299f);
            rjx.r(cwh0Var, 1.5f, 13.5f, 13.0f);
            a180.a(a180Var, cwh0Var.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            v8r.c = b180VarB;
        }
        b180 b180VarB2 = d1u.c;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Email24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0Var2 = new cwh0();
            cwh0Var2.l(1.0f, 3.0f);
            cwh0Var2.i(22.0f);
            cwh0Var2.v(18.0f);
            rjx.u(cwh0Var2, 1.0f, 21.0f, 3.0f, 5.0f);
            cwh0Var2.v(1.711f);
            cwh0Var2.k(9.0f, 5.197f);
            cwh0Var2.k(9.0f, -5.197f);
            cwh0Var2.j(21.0f, 5.0f);
            cwh0Var2.e();
            cwh0Var2.l(21.0f, 9.02f);
            cwh0Var2.j(12.0f, 14.217f);
            cwh0Var2.j(3.0f, 9.02f);
            rjx.r(cwh0Var2, 3.0f, 19.0f, 18.0f);
            a180.a(a180Var2, cwh0Var2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            d1u.c = b180VarB2;
        }
        c = new ymx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new mmx((byte) 10);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ymx);
    }

    public final int hashCode() {
        return -1486685337;
    }

    public final String toString() {
        return "Email";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
