package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pnx extends hux {
    public static final Parcelable.Creator<pnx> CREATOR;
    public static final pnx c;

    static {
        b180 b180VarB = w361.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.GridApps16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0Var = new cwh0();
            cwh0Var.l(1.0f, 1.0f);
            cwh0Var.i(3.0f);
            cwh0Var.v(3.0f);
            rjx.u(cwh0Var, 1.0f, 4.0f, 1.0f, 6.5f);
            rjx.A(cwh0Var, 3.0f, 3.0f, 1.0f, 9.5f);
            cwh0Var.l(4.0f, 12.0f);
            rjx.x(cwh0Var, 1.0f, 12.0f, 3.0f, 3.0f);
            rjx.z(cwh0Var, 6.5f, 1.0f, 3.0f, 3.0f);
            rjx.v(cwh0Var, -3.0f, 9.5f, 6.5f, -3.0f);
            cwh0Var.v(3.0f);
            cwh0Var.i(3.0f);
            cwh0Var.e();
            cwh0Var.l(6.5f, 12.0f);
            cwh0Var.i(3.0f);
            cwh0Var.v(3.0f);
            cwh0Var.i(-3.0f);
            cwh0Var.e();
            rjx.z(cwh0Var, 15.0f, 1.0f, -3.0f, 3.0f);
            rjx.v(cwh0Var, 3.0f, 12.0f, 6.5f, 3.0f);
            cwh0Var.v(3.0f);
            cwh0Var.i(-3.0f);
            cwh0Var.e();
            cwh0Var.l(15.0f, 12.0f);
            cwh0Var.i(-3.0f);
            cwh0Var.v(3.0f);
            cwh0Var.i(3.0f);
            cwh0Var.e();
            a180.a(a180Var, cwh0Var.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            w361.b = b180VarB;
        }
        b180 b180VarB2 = ha71.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.GridApps24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(3.0f, 4.0f);
            cwh0VarG.c(1.0f, 1.0f, false, true, 1.0f, -1.0f);
            cwh0VarG.i(2.0f);
            cwh0VarG.c(1.0f, 1.0f, false, true, 1.0f, 1.0f);
            cwh0VarG.v(2.0f);
            cwh0VarG.c(1.0f, 1.0f, false, true, -1.0f, 1.0f);
            cwh0VarG.j(4.0f, 7.0f);
            cwh0VarG.c(1.0f, 1.0f, false, true, -1.0f, -1.0f);
            cwh0VarG.e();
            cwh0VarG.l(10.0f, 4.0f);
            cwh0VarG.c(1.0f, 1.0f, false, true, 1.0f, -1.0f);
            cwh0VarG.i(2.0f);
            cwh0VarG.c(1.0f, 1.0f, false, true, 1.0f, 1.0f);
            cwh0VarG.v(2.0f);
            cwh0VarG.c(1.0f, 1.0f, false, true, -1.0f, 1.0f);
            cwh0VarG.i(-2.0f);
            cwh0VarG.c(1.0f, 1.0f, false, true, -1.0f, -1.0f);
            cwh0VarG.e();
            cwh0VarG.l(18.0f, 3.0f);
            cwh0VarG.c(1.0f, 1.0f, false, false, -1.0f, 1.0f);
            cwh0VarG.v(2.0f);
            cwh0VarG.c(1.0f, 1.0f, false, false, 1.0f, 1.0f);
            cwh0VarG.i(2.0f);
            cwh0VarG.c(1.0f, 1.0f, false, false, 1.0f, -1.0f);
            cwh0VarG.j(21.0f, 4.0f);
            cwh0VarG.c(1.0f, 1.0f, false, false, -1.0f, -1.0f);
            cwh0VarG.e();
            cwh0VarG.l(3.0f, 11.0f);
            cwh0VarG.c(1.0f, 1.0f, false, true, 1.0f, -1.0f);
            cwh0VarG.i(2.0f);
            cwh0VarG.c(1.0f, 1.0f, false, true, 1.0f, 1.0f);
            cwh0VarG.v(2.0f);
            cwh0VarG.c(1.0f, 1.0f, false, true, -1.0f, 1.0f);
            cwh0VarG.j(4.0f, 14.0f);
            cwh0VarG.c(1.0f, 1.0f, false, true, -1.0f, -1.0f);
            cwh0VarG.e();
            cwh0VarG.l(11.0f, 10.0f);
            cwh0VarG.c(1.0f, 1.0f, false, false, -1.0f, 1.0f);
            cwh0VarG.v(2.0f);
            cwh0VarG.c(1.0f, 1.0f, false, false, 1.0f, 1.0f);
            cwh0VarG.i(2.0f);
            cwh0VarG.c(1.0f, 1.0f, false, false, 1.0f, -1.0f);
            cwh0VarG.v(-2.0f);
            cwh0VarG.c(1.0f, 1.0f, false, false, -1.0f, -1.0f);
            cwh0VarG.e();
            cwh0VarG.l(17.0f, 11.0f);
            cwh0VarG.c(1.0f, 1.0f, false, true, 1.0f, -1.0f);
            cwh0VarG.i(2.0f);
            cwh0VarG.c(1.0f, 1.0f, false, true, 1.0f, 1.0f);
            cwh0VarG.v(2.0f);
            cwh0VarG.c(1.0f, 1.0f, false, true, -1.0f, 1.0f);
            cwh0VarG.i(-2.0f);
            cwh0VarG.c(1.0f, 1.0f, false, true, -1.0f, -1.0f);
            cwh0VarG.e();
            cwh0VarG.l(4.0f, 17.0f);
            cwh0VarG.c(1.0f, 1.0f, false, false, -1.0f, 1.0f);
            cwh0VarG.v(2.0f);
            cwh0VarG.c(1.0f, 1.0f, false, false, 1.0f, 1.0f);
            cwh0VarG.i(2.0f);
            cwh0VarG.c(1.0f, 1.0f, false, false, 1.0f, -1.0f);
            cwh0VarG.v(-2.0f);
            cwh0VarG.c(1.0f, 1.0f, false, false, -1.0f, -1.0f);
            cwh0VarG.e();
            cwh0VarG.l(10.0f, 18.0f);
            cwh0VarG.c(1.0f, 1.0f, false, true, 1.0f, -1.0f);
            cwh0VarG.i(2.0f);
            cwh0VarG.c(1.0f, 1.0f, false, true, 1.0f, 1.0f);
            cwh0VarG.v(2.0f);
            cwh0VarG.c(1.0f, 1.0f, false, true, -1.0f, 1.0f);
            cwh0VarG.i(-2.0f);
            cwh0VarG.c(1.0f, 1.0f, false, true, -1.0f, -1.0f);
            cwh0VarG.e();
            cwh0VarG.l(18.0f, 17.0f);
            cwh0VarG.c(1.0f, 1.0f, false, false, -1.0f, 1.0f);
            cwh0VarG.v(2.0f);
            cwh0VarG.c(1.0f, 1.0f, false, false, 1.0f, 1.0f);
            cwh0VarG.i(2.0f);
            cwh0VarG.c(1.0f, 1.0f, false, false, 1.0f, -1.0f);
            cwh0VarG.v(-2.0f);
            cwh0VarG.c(1.0f, 1.0f, false, false, -1.0f, -1.0f);
            cwh0VarG.e();
            a180.a(a180Var2, cwh0VarG.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            ha71.b = b180VarB2;
        }
        c = new pnx(new dsx(b180VarB, b180VarB2), null);
        CREATOR = new mmx((byte) 27);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof pnx);
    }

    public final int hashCode() {
        return -583667923;
    }

    public final String toString() {
        return "GridApps";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
