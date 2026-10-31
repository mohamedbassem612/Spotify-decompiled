package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zjx extends hux {
    public static final Parcelable.Creator<zjx> CREATOR;
    public static final zjx c;

    static {
        b180 b180VarB = xzo1.a;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Airplane16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(0.0f, 4.809f);
            cwh0VarG.g(0.0f, -0.297f, 0.36f, -0.447f, 0.57f, -0.237f);
            cwh0VarG.j(2.666f, 6.67f);
            cwh0VarG.i(3.666f);
            cwh0VarG.j(4.177f, 1.124f);
            cwh0VarG.c(0.333f, 0.333f, false, true, 0.31f, -0.454f);
            cwh0VarG.i(0.697f);
            cwh0VarG.g(0.095f, 0.0f, 0.185f, 0.041f, 0.249f, 0.112f);
            cwh0VarG.k(5.234f, 5.888f);
            cwh0VarG.i(4.0f);
            cwh0VarG.c(1.333f, 1.333f, false, true, 0.0f, 2.667f);
            cwh0VarG.i(-4.0f);
            cwh0VarG.k(-5.234f, 5.888f);
            cwh0VarG.c(0.33f, 0.33f, false, true, -0.25f, 0.112f);
            cwh0VarG.i(-0.696f);
            cwh0VarG.c(0.333f, 0.333f, false, true, -0.31f, -0.454f);
            cwh0VarG.k(2.156f, -5.546f);
            cwh0VarG.h(2.667f);
            cwh0VarG.j(0.569f, 11.435f);
            cwh0VarG.b(0.334f, 0.334f, false, true, 0.0f, 11.198f);
            cwh0VarG.e();
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            xzo1.a = b180VarB;
        }
        b180 b180VarB2 = yzo1.a;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Airplane24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(0.0f, 7.207f);
            cwh0VarG2.c(0.5f, 0.5f, false, true, 0.854f, -0.353f);
            cwh0VarG2.j(4.0f, 10.0f);
            cwh0VarG2.i(5.5f);
            cwh0VarG2.j(6.265f, 1.682f);
            cwh0VarG2.b(0.5f, 0.5f, false, true, 6.73f, 1.0f);
            cwh0VarG2.i(1.045f);
            cwh0VarG2.c(0.5f, 0.5f, false, true, 0.374f, 0.168f);
            cwh0VarG2.j(16.0f, 10.0f);
            cwh0VarG2.i(6.0f);
            cwh0VarG2.c(2.0f, 2.0f, true, true, 0.0f, 4.0f);
            cwh0VarG2.i(-6.0f);
            cwh0VarG2.k(-7.85f, 8.832f);
            cwh0VarG2.c(0.5f, 0.5f, false, true, -0.375f, 0.168f);
            cwh0VarG2.h(6.73f);
            cwh0VarG2.c(0.5f, 0.5f, false, true, -0.465f, -0.682f);
            cwh0VarG2.j(9.5f, 14.0f);
            cwh0VarG2.h(4.0f);
            cwh0VarG2.j(0.854f, 17.146f);
            cwh0VarG2.b(0.5f, 0.5f, false, true, 0.0f, 16.793f);
            cwh0VarG2.e();
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            yzo1.a = b180VarB2;
        }
        c = new zjx(new dsx(b180VarB, b180VarB2), null);
        CREATOR = new x7w((byte) 27);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof zjx);
    }

    public final int hashCode() {
        return -1578182745;
    }

    public final String toString() {
        return "Airplane";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
