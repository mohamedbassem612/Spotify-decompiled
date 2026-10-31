package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ptx extends hux {
    public static final Parcelable.Creator<ptx> CREATOR;
    public static final ptx c;
    public static final byte d;

    static {
        b180 b180VarB = aq8.e;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Tune16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(1.25f, 9.0f);
            cwh0VarG.c(0.5f, 0.5f, false, true, 0.5f, -0.5f);
            cwh0VarG.j(3.5f, 8.5f);
            cwh0VarG.j(3.5f, 0.75f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 1.5f, 0.0f);
            cwh0VarG.j(5.0f, 8.5f);
            cwh0VarG.i(1.75f);
            cwh0VarG.c(0.5f, 0.5f, false, true, 0.5f, 0.5f);
            cwh0VarG.v(1.5f);
            cwh0VarG.c(0.5f, 0.5f, false, true, -0.5f, 0.5f);
            cwh0VarG.i(-5.0f);
            cwh0VarG.c(0.5f, 0.5f, false, true, -0.5f, -0.5f);
            cwh0VarG.e();
            cwh0VarG.l(8.75f, 5.0f);
            cwh0VarG.c(0.5f, 0.5f, false, true, 0.5f, -0.5f);
            cwh0VarG.j(11.0f, 4.5f);
            cwh0VarG.j(11.0f, 0.75f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 1.5f, 0.0f);
            cwh0VarG.j(12.5f, 4.5f);
            cwh0VarG.i(1.75f);
            cwh0VarG.c(0.5f, 0.5f, false, true, 0.5f, 0.5f);
            cwh0VarG.v(1.5f);
            cwh0VarG.c(0.5f, 0.5f, false, true, -0.5f, 0.5f);
            cwh0VarG.i(-5.0f);
            cwh0VarG.c(0.5f, 0.5f, false, true, -0.5f, -0.5f);
            cwh0VarG.e();
            cwh0VarG.l(3.5f, 12.5f);
            cwh0VarG.v(2.75f);
            cwh0VarG.c(0.75f, 0.75f, false, false, 1.5f, 0.0f);
            rjx.u(cwh0VarG, 5.0f, 12.5f, 11.0f, 15.25f);
            rjx.B(cwh0VarG, 11.0f, 8.5f, 1.5f, 6.75f);
            cwh0VarG.c(0.75f, 0.75f, false, true, -1.5f, 0.0f);
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            aq8.e = b180VarB;
        }
        b180 b180VarB2 = tx9.c;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Tune24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(4.0f, 12.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, false, -1.0f, 1.0f);
            cwh0VarG2.v(2.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, false, 1.0f, 1.0f);
            cwh0VarG2.i(6.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, false, 1.0f, -1.0f);
            cwh0VarG2.v(-2.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, false, -1.0f, -1.0f);
            cwh0VarG2.j(8.0f, 12.0f);
            cwh0VarG2.j(8.0f, 3.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, false, -2.0f, 0.0f);
            cwh0VarG2.v(9.0f);
            cwh0VarG2.e();
            cwh0VarG2.l(6.0f, 21.0f);
            cwh0VarG2.v(-3.0f);
            cwh0VarG2.i(2.0f);
            cwh0VarG2.v(3.0f);
            cwh0VarG2.c(1.0f, 1.0f, true, true, -2.0f, 0.0f);
            cwh0VarG2.m(8.0f, -15.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, false, -1.0f, 1.0f);
            cwh0VarG2.v(2.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, false, 1.0f, 1.0f);
            cwh0VarG2.i(6.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, false, 1.0f, -1.0f);
            cwh0VarG2.j(21.0f, 7.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, false, -1.0f, -1.0f);
            cwh0VarG2.i(-2.0f);
            cwh0VarG2.j(18.0f, 3.0f);
            cwh0VarG2.c(1.0f, 1.0f, true, false, -2.0f, 0.0f);
            cwh0VarG2.v(3.0f);
            cwh0VarG2.e();
            cwh0VarG2.l(16.0f, 21.0f);
            cwh0VarG2.v(-9.0f);
            cwh0VarG2.i(2.0f);
            cwh0VarG2.v(9.0f);
            cwh0VarG2.c(1.0f, 1.0f, true, true, -2.0f, 0.0f);
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            tx9.c = b180VarB2;
        }
        c = new ptx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new psx((byte) 25);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ptx);
    }

    public final int hashCode() {
        return -47502643;
    }

    public final String toString() {
        return "Tune";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
