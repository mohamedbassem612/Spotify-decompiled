package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pkx extends hux {
    public static final Parcelable.Creator<pkx> CREATOR;
    public static final pkx c;
    public static final byte d;

    static {
        b180 b180VarB = o2p1.a;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Audiobook16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0Var = new cwh0();
            cwh0Var.l(0.0f, 0.013f);
            cwh0Var.i(3.65f);
            cwh0Var.f(5.28f, 0.013f, 6.787f, 0.55f, 8.0f, 1.457f);
            cwh0Var.b(7.25f, 7.25f, false, true, 12.35f, 0.013f);
            cwh0Var.j(16.0f, 0.013f);
            cwh0Var.j(16.0f, 14.0f);
            cwh0Var.i(-3.65f);
            cwh0Var.g(-1.48f, 0.0f, -2.828f, 0.556f, -3.85f, 1.47f);
            cwh0Var.k(-0.5f, 0.448f);
            cwh0Var.k(-0.5f, -0.448f);
            cwh0Var.b(5.75f, 5.75f, false, false, 3.65f, 14.0f);
            rjx.u(cwh0Var, 0.0f, 14.0f, 7.25f, 2.773f);
            cwh0Var.c(5.75f, 5.75f, false, false, -3.6f, -1.26f);
            cwh0Var.j(1.5f, 1.513f);
            cwh0Var.j(1.5f, 12.5f);
            cwh0Var.i(2.15f);
            cwh0Var.g(1.31f, 0.0f, 2.538f, 0.346f, 3.6f, 0.952f);
            cwh0Var.e();
            cwh0Var.l(8.75f, 13.452f);
            cwh0Var.c(7.24f, 7.24f, false, true, 3.6f, -0.952f);
            rjx.s(cwh0Var, 2.15f, 14.5f, 1.513f, -2.15f);
            cwh0Var.c(5.74f, 5.74f, false, false, -3.6f, 1.26f);
            cwh0Var.e();
            a180.a(a180Var, cwh0Var.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            o2p1.a = b180VarB;
        }
        b180 b180VarB2 = r2p1.a;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Audiobook24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0Var2 = new cwh0();
            cwh0Var2.l(1.0f, 2.0f);
            cwh0Var2.i(5.0f);
            cwh0Var2.c(9.96f, 9.96f, false, true, 6.0f, 2.0f);
            cwh0Var2.c(9.96f, 9.96f, false, true, 6.0f, -2.0f);
            cwh0Var2.i(5.0f);
            cwh0Var2.v(19.0f);
            cwh0Var2.i(-5.0f);
            cwh0Var2.g(-2.05f, 0.0f, -3.917f, 0.77f, -5.333f, 2.037f);
            cwh0Var2.k(-0.667f, 0.597f);
            cwh0Var2.k(-0.667f, -0.597f);
            cwh0Var2.b(7.97f, 7.97f, false, false, 6.0f, 21.0f);
            rjx.u(cwh0Var2, 1.0f, 21.0f, 11.0f, 5.755f);
            cwh0Var2.b(7.96f, 7.96f, false, false, 6.0f, 4.0f);
            cwh0Var2.j(3.0f, 4.0f);
            cwh0Var2.v(15.0f);
            cwh0Var2.i(3.0f);
            cwh0Var2.g(1.82f, 0.0f, 3.529f, 0.487f, 5.0f, 1.338f);
            cwh0Var2.e();
            cwh0Var2.l(13.0f, 20.338f);
            cwh0Var2.b(9.96f, 9.96f, false, true, 18.0f, 19.0f);
            rjx.s(cwh0Var2, 3.0f, 21.0f, 4.0f, -3.0f);
            cwh0Var2.c(7.96f, 7.96f, false, false, -5.0f, 1.755f);
            cwh0Var2.e();
            a180.a(a180Var2, cwh0Var2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            r2p1.a = b180VarB2;
        }
        c = new pkx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new ckx((byte) 12);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof pkx);
    }

    public final int hashCode() {
        return -1977889270;
    }

    public final String toString() {
        return "Audiobook";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
