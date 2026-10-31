package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class spx extends hux {
    public static final Parcelable.Creator<spx> CREATOR;
    public static final spx c;
    public static final byte d;

    static {
        b180 b180VarB = fno1.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Pause16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(2.7f, 1.0f);
            cwh0VarG.c(0.7f, 0.7f, false, false, -0.7f, 0.7f);
            cwh0VarG.v(12.6f);
            cwh0VarG.c(0.7f, 0.7f, false, false, 0.7f, 0.7f);
            cwh0VarG.i(2.6f);
            cwh0VarG.c(0.7f, 0.7f, false, false, 0.7f, -0.7f);
            cwh0VarG.j(6.0f, 1.7f);
            cwh0VarG.c(0.7f, 0.7f, false, false, -0.7f, -0.7f);
            cwh0VarG.e();
            cwh0VarG.l(10.7f, 1.0f);
            cwh0VarG.c(0.7f, 0.7f, false, false, -0.7f, 0.7f);
            cwh0VarG.v(12.6f);
            cwh0VarG.c(0.7f, 0.7f, false, false, 0.7f, 0.7f);
            cwh0VarG.i(2.6f);
            cwh0VarG.c(0.7f, 0.7f, false, false, 0.7f, -0.7f);
            cwh0VarG.j(14.0f, 1.7f);
            cwh0VarG.c(0.7f, 0.7f, false, false, -0.7f, -0.7f);
            cwh0VarG.e();
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            fno1.b = b180VarB;
        }
        b180 b180VarB2 = hno1.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Pause24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(5.7f, 3.0f);
            cwh0VarG2.c(0.7f, 0.7f, false, false, -0.7f, 0.7f);
            cwh0VarG2.v(16.6f);
            cwh0VarG2.c(0.7f, 0.7f, false, false, 0.7f, 0.7f);
            cwh0VarG2.i(2.6f);
            cwh0VarG2.c(0.7f, 0.7f, false, false, 0.7f, -0.7f);
            cwh0VarG2.j(9.0f, 3.7f);
            cwh0VarG2.c(0.7f, 0.7f, false, false, -0.7f, -0.7f);
            cwh0VarG2.e();
            cwh0VarG2.l(15.7f, 3.0f);
            cwh0VarG2.c(0.7f, 0.7f, false, false, -0.7f, 0.7f);
            cwh0VarG2.v(16.6f);
            cwh0VarG2.c(0.7f, 0.7f, false, false, 0.7f, 0.7f);
            cwh0VarG2.i(2.6f);
            cwh0VarG2.c(0.7f, 0.7f, false, false, 0.7f, -0.7f);
            cwh0VarG2.j(19.0f, 3.7f);
            cwh0VarG2.c(0.7f, 0.7f, false, false, -0.7f, -0.7f);
            cwh0VarG2.e();
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            hno1.b = b180VarB2;
        }
        c = new spx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new yox((byte) 19);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof spx);
    }

    public final int hashCode() {
        return -1476864575;
    }

    public final String toString() {
        return "Pause";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
