package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dkx extends hux {
    public static final Parcelable.Creator<dkx> CREATOR;
    public static final dkx c;

    static {
        b180 b180VarB = j0p1.a;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.AlignTextCenter16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0Var = new cwh0();
            cwh0Var.l(0.0f, 13.5f);
            cwh0Var.i(16.0f);
            cwh0Var.j(16.0f, 15.0f);
            rjx.u(cwh0Var, 0.0f, 15.0f, 3.0f, 9.5f);
            cwh0Var.i(10.0f);
            ydh.k(cwh0Var, 13.0f, 11.0f, 3.0f, 11.0f);
            cwh0Var.l(0.0f, 5.5f);
            cwh0Var.i(16.0f);
            ydh.k(cwh0Var, 16.0f, 7.0f, 0.0f, 7.0f);
            cwh0Var.l(3.0f, 1.5f);
            cwh0Var.i(10.0f);
            ydh.k(cwh0Var, 13.0f, 3.0f, 3.0f, 3.0f);
            a180.a(a180Var, cwh0Var.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            j0p1.a = b180VarB;
        }
        b180 b180VarB2 = l0p1.a;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.AlignTextCenter24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarI = ydh.i(18.0f, 6.0f, 6.0f, 6.0f);
            rjx.r(cwh0VarI, 6.0f, 4.0f, 12.0f);
            cwh0VarI.l(22.0f, 11.0f);
            cwh0VarI.j(2.0f, 11.0f);
            rjx.r(cwh0VarI, 2.0f, 9.0f, 20.0f);
            cwh0VarI.l(22.0f, 21.0f);
            rjx.x(cwh0VarI, 2.0f, 21.0f, -2.0f, 20.0f);
            cwh0VarI.l(18.0f, 16.0f);
            rjx.x(cwh0VarI, 6.0f, 16.0f, -2.0f, 12.0f);
            a180.a(a180Var2, cwh0VarI.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            l0p1.a = b180VarB2;
        }
        c = new dkx(new dsx(b180VarB, b180VarB2), null);
        CREATOR = new ckx((byte) 0);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof dkx);
    }

    public final int hashCode() {
        return -2039707950;
    }

    public final String toString() {
        return "AlignTextCenter";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
