package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cmx extends hux {
    public static final Parcelable.Creator<cmx> CREATOR;
    public static final cmx c;
    public static final byte d;

    static {
        b180 b180VarB = si1.c;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Delete16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarP = rjx.p(5.25f, 3.0f, -0.917f);
            cwh0VarP.f(5.25f, 0.933f, 6.183f, 0.0f, 7.333f, 0.0f);
            cwh0VarP.i(1.334f);
            cwh0VarP.g(1.15f, 0.0f, 2.083f, 0.933f, 2.083f, 2.083f);
            rjx.B(cwh0VarP, 10.75f, 3.0f, 4.75f, 1.5f);
            cwh0VarP.i(-0.972f);
            cwh0VarP.k(-1.257f, 9.544f);
            cwh0VarP.b(2.25f, 2.25f, false, true, 11.041f, 16.0f);
            cwh0VarP.j(4.96f, 16.0f);
            cwh0VarP.c(2.25f, 2.25f, false, true, -2.23f, -1.956f);
            cwh0VarP.j(1.472f, 4.5f);
            ydh.k(cwh0VarP, 0.5f, 4.5f, 0.5f, 3.0f);
            cwh0VarP.l(6.75f, 2.083f);
            rjx.B(cwh0VarP, 6.75f, 3.0f, 2.5f, -0.917f);
            cwh0VarP.c(0.583f, 0.583f, false, false, -0.583f, -0.583f);
            cwh0VarP.j(7.333f, 1.5f);
            cwh0VarP.c(0.583f, 0.583f, false, false, -0.583f, 0.583f);
            cwh0VarP.l(2.986f, 4.5f);
            cwh0VarP.k(1.23f, 9.348f);
            cwh0VarP.c(0.75f, 0.75f, false, false, 0.744f, 0.652f);
            cwh0VarP.i(6.08f);
            cwh0VarP.c(0.75f, 0.75f, false, false, 0.744f, -0.652f);
            ydh.k(cwh0VarP, 13.015f, 4.5f, 2.985f, 4.5f);
            a180.a(a180Var, cwh0VarP.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            si1.c = b180VarB;
        }
        b180 b180VarB2 = sj1.g;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Delete24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarI = ydh.i(8.0f, 4.0f, 8.0f, 3.0f);
            cwh0VarI.c(3.0f, 3.0f, false, true, 3.0f, -3.0f);
            cwh0VarI.i(2.0f);
            cwh0VarI.c(3.0f, 3.0f, false, true, 3.0f, 3.0f);
            cwh0VarI.v(1.0f);
            cwh0VarI.i(6.0f);
            cwh0VarI.v(2.0f);
            cwh0VarI.i(-0.956f);
            cwh0VarI.k(-1.878f, 14.261f);
            cwh0VarI.b(2.0f, 2.0f, false, true, 17.183f, 22.0f);
            cwh0VarI.j(6.817f, 22.0f);
            cwh0VarI.c(2.0f, 2.0f, false, true, -1.983f, -1.739f);
            cwh0VarI.j(2.956f, 6.0f);
            ydh.k(cwh0VarI, 2.0f, 6.0f, 2.0f, 4.0f);
            cwh0VarI.l(10.0f, 3.0f);
            cwh0VarI.v(1.0f);
            cwh0VarI.i(4.0f);
            cwh0VarI.j(14.0f, 3.0f);
            cwh0VarI.c(1.0f, 1.0f, false, false, -1.0f, -1.0f);
            cwh0VarI.i(-2.0f);
            cwh0VarI.c(1.0f, 1.0f, false, false, -1.0f, 1.0f);
            cwh0VarI.l(4.974f, 6.0f);
            cwh0VarI.k(1.843f, 14.0f);
            cwh0VarI.i(10.366f);
            cwh0VarI.k(1.843f, -14.0f);
            cwh0VarI.e();
            a180.a(a180Var2, cwh0VarI.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            sj1.g = b180VarB2;
        }
        c = new cmx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new hlx((byte) 20);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof cmx);
    }

    public final int hashCode() {
        return 1121701696;
    }

    public final String toString() {
        return "Delete";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
