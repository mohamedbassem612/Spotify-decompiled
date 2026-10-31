package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nox extends hux {
    public static final Parcelable.Creator<nox> CREATOR;
    public static final nox c;
    public static final byte d;

    static {
        b180 b180VarB = b0o1.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.ListView16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, true, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarI = ydh.i(15.0f, 14.5f, 5.0f, 14.5f);
            rjx.r(cwh0VarI, 5.0f, 13.0f, 10.0f);
            cwh0VarI.l(15.0f, 8.75f);
            rjx.x(cwh0VarI, 5.0f, 8.75f, -1.5f, 10.0f);
            cwh0VarI.l(15.0f, 3.0f);
            cwh0VarI.j(5.0f, 3.0f);
            rjx.r(cwh0VarI, 5.0f, 1.5f, 10.0f);
            cwh0VarI.l(3.0f, 3.0f);
            cwh0VarI.j(1.0f, 3.0f);
            rjx.r(cwh0VarI, 1.0f, 1.5f, 2.0f);
            cwh0VarI.l(3.0f, 14.5f);
            cwh0VarI.j(1.0f, 14.5f);
            rjx.r(cwh0VarI, 1.0f, 13.0f, 2.0f);
            cwh0VarI.l(3.0f, 8.75f);
            rjx.x(cwh0VarI, 1.0f, 8.75f, -1.5f, 2.0f);
            a180.a(a180Var, cwh0VarI.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            b0o1.b = b180VarB;
        }
        b180 b180VarB2 = f0o1.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.ListView24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarI2 = ydh.i(22.0f, 5.0f, 8.0f, 5.0f);
            rjx.r(cwh0VarI2, 8.0f, 3.0f, 14.0f);
            cwh0VarI2.l(22.0f, 21.0f);
            rjx.x(cwh0VarI2, 8.0f, 21.0f, -2.0f, 14.0f);
            cwh0VarI2.l(22.0f, 13.0f);
            rjx.x(cwh0VarI2, 8.0f, 13.0f, -2.0f, 14.0f);
            cwh0VarI2.l(5.0f, 4.0f);
            cwh0VarI2.c(1.5f, 1.5f, true, true, -3.0f, 0.0f);
            cwh0VarI2.c(1.5f, 1.5f, false, true, 3.0f, 0.0f);
            cwh0VarI2.m(0.0f, 8.0f);
            cwh0VarI2.c(1.5f, 1.5f, true, true, -3.0f, 0.0f);
            cwh0VarI2.c(1.5f, 1.5f, false, true, 3.0f, 0.0f);
            cwh0VarI2.m(0.0f, 8.0f);
            cwh0VarI2.c(1.5f, 1.5f, true, true, -3.0f, 0.0f);
            cwh0VarI2.c(1.5f, 1.5f, false, true, 3.0f, 0.0f);
            a180.a(a180Var2, cwh0VarI2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            f0o1.b = b180VarB2;
        }
        c = new nox(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new snx((byte) 19);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof nox);
    }

    public final int hashCode() {
        return 444537016;
    }

    public final String toString() {
        return "ListView";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
