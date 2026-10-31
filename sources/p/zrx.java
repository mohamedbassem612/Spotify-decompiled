package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zrx extends hux {
    public static final Parcelable.Creator<zrx> CREATOR;
    public static final zrx c;

    static {
        b180 b180VarB = d3p1.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Repeat16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(0.0f, 4.75f);
            cwh0VarG.b(3.75f, 3.75f, false, true, 3.75f, 1.0f);
            cwh0VarG.i(8.5f);
            cwh0VarG.b(3.75f, 3.75f, false, true, 16.0f, 4.75f);
            cwh0VarG.v(5.0f);
            cwh0VarG.c(3.75f, 3.75f, false, true, -3.75f, 3.75f);
            cwh0VarG.h(9.81f);
            cwh0VarG.k(1.018f, 1.018f);
            cwh0VarG.c(0.75f, 0.75f, true, true, -1.06f, 1.06f);
            cwh0VarG.j(6.939f, 12.75f);
            cwh0VarG.k(2.829f, -2.828f);
            cwh0VarG.c(0.75f, 0.75f, true, true, 1.06f, 1.06f);
            cwh0VarG.j(9.811f, 12.0f);
            cwh0VarG.i(2.439f);
            cwh0VarG.c(2.25f, 2.25f, false, false, 2.25f, -2.25f);
            cwh0VarG.v(-5.0f);
            cwh0VarG.c(2.25f, 2.25f, false, false, -2.25f, -2.25f);
            cwh0VarG.i(-8.5f);
            cwh0VarG.b(2.25f, 2.25f, false, false, 1.5f, 4.75f);
            cwh0VarG.v(5.0f);
            cwh0VarG.b(2.25f, 2.25f, false, false, 3.75f, 12.0f);
            cwh0VarG.h(5.0f);
            cwh0VarG.v(1.5f);
            cwh0VarG.h(3.75f);
            cwh0VarG.b(3.75f, 3.75f, false, true, 0.0f, 9.75f);
            cwh0VarG.e();
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            d3p1.b = b180VarB;
        }
        b180 b180VarB2 = g3p1.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Repeat24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(6.0f, 2.0f);
            cwh0VarG2.c(5.0f, 5.0f, false, false, -5.0f, 5.0f);
            cwh0VarG2.v(8.0f);
            cwh0VarG2.c(5.0f, 5.0f, false, false, 5.0f, 5.0f);
            cwh0VarG2.i(1.0f);
            cwh0VarG2.v(-2.0f);
            cwh0VarG2.h(6.0f);
            cwh0VarG2.c(3.0f, 3.0f, false, true, -3.0f, -3.0f);
            cwh0VarG2.u(7.0f);
            cwh0VarG2.c(3.0f, 3.0f, false, true, 3.0f, -3.0f);
            cwh0VarG2.i(12.0f);
            cwh0VarG2.c(3.0f, 3.0f, false, true, 3.0f, 3.0f);
            cwh0VarG2.v(8.0f);
            cwh0VarG2.c(3.0f, 3.0f, false, true, -3.0f, 3.0f);
            cwh0VarG2.i(-4.798f);
            cwh0VarG2.k(1.298f, -1.298f);
            cwh0VarG2.c(1.0f, 1.0f, true, false, -1.414f, -1.414f);
            cwh0VarG2.j(9.373f, 19.0f);
            cwh0VarG2.k(3.713f, 3.712f);
            cwh0VarG2.c(1.0f, 1.0f, false, false, 1.414f, -1.414f);
            cwh0VarG2.j(13.202f, 20.0f);
            cwh0VarG2.h(18.0f);
            cwh0VarG2.c(5.0f, 5.0f, false, false, 5.0f, -5.0f);
            cwh0VarG2.u(7.0f);
            cwh0VarG2.c(5.0f, 5.0f, false, false, -5.0f, -5.0f);
            cwh0VarG2.e();
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            g3p1.b = b180VarB2;
        }
        c = new zrx(new dsx(b180VarB, b180VarB2), null);
        CREATOR = new jrx((byte) 15);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof zrx);
    }

    public final int hashCode() {
        return 1522628400;
    }

    public final String toString() {
        return "Repeat";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
