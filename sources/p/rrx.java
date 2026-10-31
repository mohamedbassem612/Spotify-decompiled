package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rrx extends hux {
    public static final Parcelable.Creator<rrx> CREATOR;
    public static final rrx c;

    static {
        b180 b180VarB = m1p1.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.QueueUp16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(3.5f, 6.0f);
            cwh0VarG.b(0.75f, 0.75f, true, true, 2.0f, 6.0f);
            cwh0VarG.j(2.0f, 2.88f);
            cwh0VarG.k(-0.72f, 0.72f);
            cwh0VarG.b(0.75f, 0.75f, true, true, 0.22f, 2.54f);
            cwh0VarG.j(2.75f, 0.01f);
            cwh0VarG.k(2.53f, 2.53f);
            cwh0VarG.b(0.75f, 0.75f, false, true, 4.22f, 3.6f);
            rjx.y(cwh0VarG, -0.72f, -0.72f, 7.966f, 4.5f);
            cwh0VarG.b(5.5f, 5.5f, false, true, 7.187f, 6.0f);
            cwh0VarG.j(13.5f, 6.0f);
            cwh0VarG.c(2.5f, 2.5f, false, false, 0.0f, -5.0f);
            cwh0VarG.j(7.966f, 1.0f);
            cwh0VarG.g(0.159f, 0.474f, 0.255f, 0.978f, 0.278f, 1.5f);
            cwh0VarG.j(13.5f, 2.5f);
            cwh0VarG.c(1.0f, 1.0f, true, true, 0.0f, 2.0f);
            cwh0VarG.e();
            cwh0VarG.l(2.0f, 10.5f);
            cwh0VarG.i(14.0f);
            ydh.k(cwh0VarG, 16.0f, 9.0f, 2.0f, 9.0f);
            rjx.z(cwh0VarG, 2.0f, 15.0f, 14.0f, -1.5f);
            cwh0VarG.j(2.0f, 13.5f);
            cwh0VarG.e();
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            m1p1.b = b180VarB;
        }
        b180 b180VarB2 = n1p1.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.QueueUp24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(5.1f, 8.5f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, -2.0f, 0.0f);
            cwh0VarG2.j(3.1f, 3.914f);
            cwh0VarG2.j(1.707f, 5.307f);
            cwh0VarG2.b(1.0f, 1.0f, true, true, 0.293f, 3.893f);
            cwh0VarG2.j(4.1f, 0.086f);
            cwh0VarG2.k(3.807f, 3.807f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, -1.414f, 1.414f);
            rjx.u(cwh0VarG2, 5.1f, 3.914f, 11.0f, 4.0f);
            cwh0VarG2.o(0.0f, 0.51f, -0.07f, 1.0f);
            cwh0VarG2.i(7.62f);
            cwh0VarG2.c(1.5f, 1.5f, false, true, 0.0f, 3.0f);
            cwh0VarG2.j(9.745f, 8.0f);
            cwh0VarG2.c(7.0f, 7.0f, false, true, -2.137f, 2.0f);
            cwh0VarG2.j(18.55f, 10.0f);
            cwh0VarG2.c(3.5f, 3.5f, true, false, 0.0f, -7.0f);
            cwh0VarG2.i(-7.62f);
            cwh0VarG2.o(0.07f, 0.49f, 0.07f, 1.0f);
            cwh0VarG2.m(10.0f, 12.0f);
            rjx.x(cwh0VarG2, 3.0f, 16.0f, -2.0f, 18.0f);
            cwh0VarG2.l(21.0f, 22.0f);
            rjx.x(cwh0VarG2, 3.0f, 22.0f, -2.0f, 18.0f);
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            n1p1.b = b180VarB2;
        }
        c = new rrx(new dsx(b180VarB, b180VarB2), null);
        CREATOR = new jrx((byte) 7);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof rrx);
    }

    public final int hashCode() {
        return -482276201;
    }

    public final String toString() {
        return "QueueUp";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
