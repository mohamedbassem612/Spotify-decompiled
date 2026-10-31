package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vrx extends hux {
    public static final Parcelable.Creator<vrx> CREATOR;
    public static final vrx c;
    public static final byte d;

    static {
        b180 b180VarB = f2p1.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Redo16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(11.65f, 0.922f);
            cwh0VarG.c(0.75f, 0.75f, false, false, -1.06f, 1.06f);
            cwh0VarG.j(11.607f, 3.0f);
            cwh0VarG.h(6.25f);
            cwh0VarG.b(5.75f, 5.75f, false, false, 0.5f, 8.75f);
            cwh0VarG.v(0.5f);
            cwh0VarG.b(5.75f, 5.75f, false, false, 6.25f, 15.0f);
            cwh0VarG.i(6.0f);
            cwh0VarG.c(0.75f, 0.75f, true, false, 0.0f, -1.5f);
            cwh0VarG.i(-6.0f);
            cwh0VarG.b(4.25f, 4.25f, false, true, 2.0f, 9.25f);
            cwh0VarG.v(-0.5f);
            cwh0VarG.b(4.25f, 4.25f, false, true, 6.25f, 4.5f);
            cwh0VarG.i(5.357f);
            cwh0VarG.j(10.59f, 5.518f);
            cwh0VarG.c(0.75f, 0.75f, false, false, 1.06f, 1.06f);
            cwh0VarG.k(2.83f, -2.828f);
            cwh0VarG.e();
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            f2p1.b = b180VarB;
        }
        b180 b180VarB2 = g2p1.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Redo24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(16.5f, 7.298f);
            cwh0VarG2.c(1.0f, 1.0f, false, false, 1.415f, 1.414f);
            cwh0VarG2.j(21.627f, 5.0f);
            cwh0VarG2.k(-3.712f, -3.712f);
            cwh0VarG2.b(1.0f, 1.0f, true, false, 16.5f, 2.702f);
            cwh0VarG2.j(17.8f, 4.0f);
            cwh0VarG2.h(10.0f);
            cwh0VarG2.c(9.0f, 9.0f, false, false, 0.0f, 18.0f);
            cwh0VarG2.i(9.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, false, 0.0f, -2.0f);
            cwh0VarG2.i(-9.0f);
            cwh0VarG2.c(7.0f, 7.0f, false, true, 0.0f, -14.0f);
            cwh0VarG2.i(7.8f);
            cwh0VarG2.e();
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            g2p1.b = b180VarB2;
        }
        c = new vrx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new jrx((byte) 11);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof vrx);
    }

    public final int hashCode() {
        return -47577901;
    }

    public final String toString() {
        return "Redo";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
