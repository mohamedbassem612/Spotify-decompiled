package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bkx extends hux {
    public static final Parcelable.Creator<bkx> CREATOR;
    public static final bkx c;

    static {
        b180 b180VarB = h0p1.a;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.AlignObjectBottom16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0Var = new cwh0();
            cwh0Var.l(16.0f, 16.0f);
            cwh0Var.j(0.0f, 16.0f);
            cwh0Var.v(-1.5f);
            rjx.v(cwh0Var, 16.0f, 4.0f, 5.0f, 3.0f);
            cwh0Var.v(8.0f);
            cwh0Var.j(4.0f, 13.0f);
            cwh0Var.e();
            rjx.z(cwh0Var, 9.0f, 1.0f, 3.0f, 12.0f);
            cwh0Var.j(9.0f, 13.0f);
            cwh0Var.e();
            a180.a(a180Var, cwh0Var.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            h0p1.a = b180VarB;
        }
        b180 b180VarB2 = i0p1.a;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.AlignObjectBottom24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0Var2 = new cwh0();
            cwh0Var2.l(2.0f, 21.0f);
            cwh0Var2.i(20.0f);
            cwh0Var2.v(-2.0f);
            rjx.u(cwh0Var2, 2.0f, 19.0f, 18.0f, 17.0f);
            cwh0Var2.j(18.0f, 3.0f);
            cwh0Var2.i(-4.0f);
            cwh0Var2.v(14.0f);
            cwh0Var2.e();
            cwh0Var2.l(10.0f, 17.0f);
            cwh0Var2.j(10.0f, 9.0f);
            cwh0Var2.j(6.0f, 9.0f);
            cwh0Var2.v(8.0f);
            cwh0Var2.e();
            a180.a(a180Var2, cwh0Var2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            i0p1.a = b180VarB2;
        }
        c = new bkx(new dsx(b180VarB, b180VarB2), null);
        CREATOR = new x7w((byte) 29);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof bkx);
    }

    public final int hashCode() {
        return 1988583738;
    }

    public final String toString() {
        return "AlignObjectBottom";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
