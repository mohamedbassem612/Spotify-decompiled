package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mkx extends hux {
    public static final Parcelable.Creator<mkx> CREATOR;
    public static final mkx c;
    public static final byte d;

    static {
        b180 b180VarB = z1p1.a;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.ArrowUp16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(0.998f, 8.81f);
            cwh0VarG.b(0.749f, 0.749f, false, true, 0.47f, 7.53f);
            cwh0VarG.j(7.99f, 0.0f);
            cwh0VarG.k(7.522f, 7.53f);
            cwh0VarG.c(0.75f, 0.75f, true, true, -1.06f, 1.06f);
            cwh0VarG.j(8.74f, 2.87f);
            cwh0VarG.v(12.38f);
            cwh0VarG.c(0.75f, 0.75f, true, true, -1.498f, 0.0f);
            cwh0VarG.u(2.87f);
            cwh0VarG.j(1.528f, 8.59f);
            cwh0VarG.c(0.75f, 0.75f, false, true, -0.53f, 0.22f);
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            z1p1.a = b180VarB;
        }
        b180 b180VarB2 = b2p1.a;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.ArrowUp24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(3.5f, 13.414f);
            cwh0VarG2.c(0.999f, 0.999f, false, true, -0.707f, -1.707f);
            cwh0VarG2.k(9.2f, -9.207f);
            cwh0VarG2.k(9.202f, 9.207f);
            cwh0VarG2.c(1.0f, 1.0f, true, true, -1.413f, 1.414f);
            cwh0VarG2.j(13.0f, 6.335f);
            cwh0VarG2.u(20.5f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, -2.0f, 0.0f);
            cwh0VarG2.u(6.322f);
            cwh0VarG2.k(-6.794f, 6.799f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, -0.707f, 0.293f);
            cwh0VarG2.e();
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            b2p1.a = b180VarB2;
        }
        c = new mkx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new ckx((byte) 9);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof mkx);
    }

    public final int hashCode() {
        return -1871476337;
    }

    public final String toString() {
        return "ArrowUp";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
