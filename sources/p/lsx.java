package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lsx extends hux {
    public static final Parcelable.Creator<lsx> CREATOR;
    public static final lsx c;
    public static final byte d;

    static {
        b180 b180VarB = h5p1.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.SkipForward16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(12.7f, 1.0f);
            cwh0VarG.c(0.7f, 0.7f, false, false, -0.7f, 0.7f);
            cwh0VarG.v(5.15f);
            cwh0VarG.j(2.05f, 1.107f);
            cwh0VarG.b(0.7f, 0.7f, false, false, 1.0f, 1.712f);
            cwh0VarG.v(12.575f);
            cwh0VarG.c(0.7f, 0.7f, false, false, 1.05f, 0.607f);
            cwh0VarG.j(12.0f, 9.149f);
            cwh0VarG.u(14.3f);
            cwh0VarG.c(0.7f, 0.7f, false, false, 0.7f, 0.7f);
            cwh0VarG.i(1.6f);
            cwh0VarG.c(0.7f, 0.7f, false, false, 0.7f, -0.7f);
            cwh0VarG.u(1.7f);
            cwh0VarG.c(0.7f, 0.7f, false, false, -0.7f, -0.7f);
            cwh0VarG.e();
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            h5p1.b = b180VarB;
        }
        b180 b180VarB2 = k5p1.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.SkipForward24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(17.7f, 3.0f);
            cwh0VarG2.c(0.7f, 0.7f, false, false, -0.7f, 0.7f);
            cwh0VarG2.v(6.805f);
            cwh0VarG2.j(5.05f, 3.606f);
            cwh0VarG2.b(0.7f, 0.7f, false, false, 4.0f, 4.212f);
            cwh0VarG2.v(15.576f);
            cwh0VarG2.c(0.7f, 0.7f, false, false, 1.05f, 0.606f);
            cwh0VarG2.j(17.0f, 13.495f);
            cwh0VarG2.u(20.3f);
            cwh0VarG2.c(0.7f, 0.7f, false, false, 0.7f, 0.7f);
            cwh0VarG2.i(1.6f);
            cwh0VarG2.c(0.7f, 0.7f, false, false, 0.7f, -0.7f);
            cwh0VarG2.u(3.7f);
            cwh0VarG2.c(0.7f, 0.7f, false, false, -0.7f, -0.7f);
            cwh0VarG2.e();
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            k5p1.b = b180VarB2;
        }
        c = new lsx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new jrx((byte) 25);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof lsx);
    }

    public final int hashCode() {
        return -1181592623;
    }

    public final String toString() {
        return "SkipForward";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
