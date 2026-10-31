package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vmx extends hux {
    public static final Parcelable.Creator<vmx> CREATOR;
    public static final vmx c;

    static {
        b180 b180VarB = a8o.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Draft16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0Var = new cwh0();
            cwh0Var.l(5.94f, 0.0f);
            cwh0Var.j(15.0f, 0.0f);
            cwh0Var.v(16.0f);
            ydh.k(cwh0Var, 1.0f, 16.0f, 1.0f, 4.94f);
            cwh0Var.l(13.5f, 1.5f);
            cwh0Var.j(7.0f, 1.5f);
            cwh0Var.j(7.0f, 6.0f);
            rjx.x(cwh0Var, 2.5f, 6.0f, 8.5f, 11.0f);
            cwh0Var.l(3.56f, 4.5f);
            ydh.k(cwh0Var, 5.5f, 4.5f, 5.5f, 2.56f);
            a180.a(a180Var, cwh0Var.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            a8o.b = b180VarB;
        }
        b180 b180VarB2 = apo.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Draft24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0Var2 = new cwh0();
            cwh0Var2.l(3.0f, 7.586f);
            cwh0Var2.u(23.0f);
            cwh0Var2.i(18.0f);
            cwh0Var2.u(1.0f);
            cwh0Var2.h(9.586f);
            cwh0Var2.e();
            cwh0Var2.l(5.0f, 21.0f);
            cwh0Var2.u(9.0f);
            cwh0Var2.i(6.0f);
            cwh0Var2.u(3.0f);
            cwh0Var2.i(8.0f);
            cwh0Var2.v(18.0f);
            cwh0Var2.e();
            cwh0Var2.l(9.0f, 4.414f);
            cwh0Var2.u(7.0f);
            cwh0Var2.h(6.414f);
            cwh0Var2.e();
            a180.a(a180Var2, cwh0Var2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            apo.b = b180VarB2;
        }
        c = new vmx(new dsx(b180VarB, b180VarB2), null);
        CREATOR = new mmx((byte) 7);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof vmx);
    }

    public final int hashCode() {
        return -1487459988;
    }

    public final String toString() {
        return "Draft";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
