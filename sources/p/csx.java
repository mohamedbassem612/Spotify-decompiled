package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class csx extends hux {
    public static final Parcelable.Creator<csx> CREATOR;
    public static final csx c;
    public static final byte d;

    static {
        b180 b180VarB = t3p1.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.ReportAbuse16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            long j = u7h.b;
            n6a1 n6a1Var = new n6a1(j);
            cwh0 cwh0Var = new cwh0();
            cwh0Var.l(4.069f, 0.967f);
            cwh0Var.i(7.855f);
            cwh0Var.j(15.98f, 8.0f);
            cwh0Var.k(-4.057f, 7.034f);
            ydh.k(cwh0Var, 4.069f, 15.034f, 0.01f, 8.0f);
            cwh0Var.l(4.935f, 2.467f);
            cwh0Var.j(1.743f, 8.0f);
            cwh0Var.k(3.192f, 5.534f);
            cwh0Var.i(6.122f);
            cwh0Var.j(14.25f, 8.0f);
            cwh0Var.k(-3.192f, -5.533f);
            cwh0Var.e();
            a180.a(a180Var, cwh0Var.a, n6a1Var, 1.0f, 2, 1.0f);
            n6a1 n6a1Var2 = new n6a1(j);
            cwh0 cwh0Var2 = new cwh0();
            cwh0Var2.l(7.246f, 9.0f);
            cwh0Var2.j(7.246f, 4.0f);
            cwh0Var2.i(1.5f);
            cwh0Var2.v(5.0f);
            cwh0Var2.e();
            cwh0Var2.l(7.246f, 12.025f);
            cwh0Var2.v(-1.5f);
            cwh0Var2.i(1.5f);
            cwh0Var2.v(1.5f);
            cwh0Var2.e();
            a180.a(a180Var, cwh0Var2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            t3p1.b = b180VarB;
        }
        b180 b180VarB2 = w3p1.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.ReportAbuse24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            long j2 = u7h.b;
            n6a1 n6a1Var3 = new n6a1(j2);
            cwh0 cwh0Var3 = new cwh0();
            cwh0Var3.l(6.23f, 2.0f);
            cwh0Var3.i(11.54f);
            cwh0Var3.k(5.77f, 10.0f);
            cwh0Var3.k(-5.77f, 10.0f);
            ydh.k(cwh0Var3, 6.23f, 22.0f, 0.46f, 12.0f);
            cwh0Var3.l(7.385f, 4.0f);
            cwh0Var3.j(2.77f, 12.0f);
            cwh0Var3.k(4.615f, 8.0f);
            cwh0Var3.i(9.23f);
            rjx.C(cwh0Var3, 4.615f, -8.0f, -4.615f, -8.0f);
            a180.a(a180Var2, cwh0Var3.a, n6a1Var3, 1.0f, 2, 1.0f);
            n6a1 n6a1Var4 = new n6a1(j2);
            cwh0 cwh0Var4 = new cwh0();
            cwh0Var4.l(11.0f, 14.0f);
            cwh0Var4.j(11.0f, 6.0f);
            cwh0Var4.i(2.0f);
            cwh0Var4.v(8.0f);
            cwh0Var4.e();
            cwh0Var4.l(11.0f, 18.0f);
            cwh0Var4.v(-2.0f);
            cwh0Var4.i(2.0f);
            cwh0Var4.v(2.0f);
            cwh0Var4.e();
            a180.a(a180Var2, cwh0Var4.a, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            w3p1.b = b180VarB2;
        }
        c = new csx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new jrx((byte) 18);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof csx);
    }

    public final int hashCode() {
        return 777093245;
    }

    public final String toString() {
        return "ReportAbuse";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
