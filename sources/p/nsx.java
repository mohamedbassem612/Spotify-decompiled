package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nsx extends hux {
    public static final Parcelable.Creator<nsx> CREATOR;
    public static final nsx c;
    public static final byte d;

    static {
        b180 b180VarB = z5p1.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.SongCredits16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0Var = new cwh0();
            cwh0Var.l(16.0f, 8.328f);
            cwh0Var.u(1.0f);
            cwh0Var.i(-1.5f);
            cwh0Var.v(4.828f);
            cwh0Var.i(-1.0f);
            cwh0Var.c(2.5f, 2.5f, true, false, 2.5f, 2.5f);
            cwh0Var.m(-2.5f, -1.0f);
            cwh0Var.i(1.0f);
            cwh0Var.v(1.0f);
            cwh0Var.c(1.0f, 1.0f, true, true, -1.0f, -1.0f);
            cwh0Var.m(-4.5f, 3.0f);
            cwh0Var.u(4.0f);
            cwh0Var.h(7.5f);
            cwh0Var.v(3.828f);
            cwh0Var.i(-1.0f);
            cwh0Var.c(2.5f, 2.5f, true, false, 2.5f, 2.5f);
            cwh0Var.m(-2.5f, -1.0f);
            cwh0Var.i(1.0f);
            cwh0Var.v(1.0f);
            cwh0Var.c(1.0f, 1.0f, true, true, -1.0f, -1.0f);
            cwh0Var.l(0.0f, 14.5f);
            cwh0Var.i(16.0f);
            cwh0Var.u(16.0f);
            cwh0Var.h(0.0f);
            cwh0Var.e();
            cwh0Var.l(2.0f, 10.0f);
            cwh0Var.h(0.0f);
            cwh0Var.v(1.5f);
            cwh0Var.i(2.0f);
            cwh0Var.e();
            cwh0Var.l(0.0f, 5.5f);
            cwh0Var.i(4.0f);
            cwh0Var.u(7.0f);
            cwh0Var.h(0.0f);
            cwh0Var.e();
            cwh0Var.l(12.0f, 1.0f);
            cwh0Var.h(0.0f);
            cwh0Var.v(1.5f);
            cwh0Var.i(12.0f);
            cwh0Var.e();
            a180.a(a180Var, cwh0Var.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            z5p1.b = b180VarB;
        }
        b180 b180VarB2 = b6p1.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.SongCredits24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0Var2 = new cwh0();
            cwh0Var2.l(22.0f, 11.667f);
            cwh0Var2.j(22.0f, 2.0f);
            cwh0Var2.i(-2.0f);
            cwh0Var2.v(6.667f);
            cwh0Var2.i(-1.0f);
            cwh0Var2.c(3.0f, 3.0f, true, false, 3.0f, 3.0f);
            cwh0Var2.m(-3.0f, -1.0f);
            cwh0Var2.i(1.0f);
            cwh0Var2.v(1.0f);
            cwh0Var2.c(1.0f, 1.0f, true, true, -1.0f, -1.0f);
            cwh0Var2.m(-6.0f, 4.0f);
            rjx.B(cwh0Var2, 13.0f, 6.0f, -2.0f, 5.667f);
            cwh0Var2.i(-1.0f);
            cwh0Var2.c(3.0f, 3.0f, true, false, 3.0f, 3.0f);
            cwh0Var2.m(-3.0f, -1.0f);
            cwh0Var2.i(1.0f);
            cwh0Var2.v(1.0f);
            cwh0Var2.c(1.0f, 1.0f, true, true, -1.0f, -1.0f);
            cwh0Var2.l(22.0f, 22.0f);
            rjx.x(cwh0Var2, 2.0f, 22.0f, -2.0f, 20.0f);
            rjx.z(cwh0Var2, 2.0f, 16.0f, 2.0f, -2.0f);
            rjx.u(cwh0Var2, 2.0f, 14.0f, 8.0f, 10.0f);
            cwh0Var2.j(2.0f, 10.0f);
            rjx.r(cwh0Var2, 2.0f, 8.0f, 6.0f);
            cwh0Var2.l(2.0f, 4.0f);
            cwh0Var2.i(15.0f);
            ydh.k(cwh0Var2, 17.0f, 2.0f, 2.0f, 2.0f);
            a180.a(a180Var2, cwh0Var2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            b6p1.b = b180VarB2;
        }
        c = new nsx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new jrx((byte) 28);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof nsx);
    }

    public final int hashCode() {
        return 785371472;
    }

    public final String toString() {
        return "SongCredits";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
