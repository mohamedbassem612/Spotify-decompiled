package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kkx extends hux {
    public static final Parcelable.Creator<kkx> CREATOR;
    public static final kkx c;
    public static final byte d;

    static {
        b180 b180VarB = s1p1.a;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.ArrowRightToLine16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0Var = new cwh0();
            cwh0Var.l(13.25f, 12.666f);
            cwh0Var.u(3.333f);
            cwh0Var.c(0.75f, 0.75f, false, true, 1.5f, 0.0f);
            cwh0Var.v(9.333f);
            cwh0Var.c(0.75f, 0.75f, false, true, -1.5f, 0.0f);
            cwh0Var.l(6.803f, 3.47f);
            cwh0Var.c(0.75f, 0.75f, false, true, 1.06f, 0.0f);
            cwh0Var.k(4.0f, 4.0f);
            cwh0Var.c(0.75f, 0.75f, false, true, 0.0f, 1.06f);
            cwh0Var.k(-4.0f, 4.0f);
            cwh0Var.c(0.75f, 0.75f, false, true, -1.06f, -1.06f);
            cwh0Var.k(2.72f, -2.72f);
            cwh0Var.h(2.0f);
            cwh0Var.c(0.75f, 0.75f, false, true, 0.0f, -1.5f);
            cwh0Var.i(7.522f);
            cwh0Var.k(-2.72f, -2.72f);
            cwh0Var.c(0.75f, 0.75f, false, true, 0.0f, -1.06f);
            a180.a(a180Var, cwh0Var.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            s1p1.a = b180VarB;
        }
        b180 b180VarB2 = u1p1.a;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.ArrowRightToLine24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0Var2 = new cwh0();
            cwh0Var2.l(20.0f, 19.0f);
            cwh0Var2.u(5.0f);
            cwh0Var2.c(1.0f, 1.0f, true, true, 2.0f, 0.0f);
            cwh0Var2.v(14.0f);
            cwh0Var2.c(1.0f, 1.0f, true, true, -2.0f, 0.0f);
            cwh0Var2.l(10.293f, 5.293f);
            cwh0Var2.c(1.0f, 1.0f, false, true, 1.414f, 0.0f);
            cwh0Var2.k(6.0f, 6.0f);
            cwh0Var2.c(1.0f, 1.0f, false, true, 0.0f, 1.414f);
            cwh0Var2.k(-6.0f, 6.0f);
            cwh0Var2.c(1.0f, 1.0f, true, true, -1.414f, -1.414f);
            cwh0Var2.j(14.586f, 13.0f);
            cwh0Var2.h(3.0f);
            cwh0Var2.c(1.0f, 1.0f, true, true, 0.0f, -2.0f);
            cwh0Var2.i(11.586f);
            cwh0Var2.k(-4.293f, -4.293f);
            cwh0Var2.c(1.0f, 1.0f, false, true, 0.0f, -1.414f);
            a180.a(a180Var2, cwh0Var2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            u1p1.a = b180VarB2;
        }
        c = new kkx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new ckx((byte) 7);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof kkx);
    }

    public final int hashCode() {
        return -4604457;
    }

    public final String toString() {
        return "ArrowRightToLine";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
