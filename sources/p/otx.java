package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class otx extends hux {
    public static final Parcelable.Creator<otx> CREATOR;
    public static final otx c;
    public static final byte d;

    static {
        b180 b180VarB = fq7.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Trim16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(6.0f, 12.0f);
            cwh0VarG.g(0.0f, -0.333f, -0.065f, -0.651f, -0.183f, -0.942f);
            cwh0VarG.j(8.295f, 8.98f);
            cwh0VarG.k(5.745f, 4.82f);
            cwh0VarG.k(0.964f, -1.149f);
            cwh0VarG.j(9.46f, 8.0f);
            cwh0VarG.k(5.543f, -4.65f);
            cwh0VarG.k(-0.964f, -1.15f);
            cwh0VarG.k(-5.745f, 4.82f);
            cwh0VarG.k(-2.478f, -2.078f);
            cwh0VarG.c(2.5f, 2.5f, true, false, -0.956f, 1.156f);
            cwh0VarG.j(7.128f, 8.0f);
            cwh0VarG.j(4.86f, 9.902f);
            cwh0VarG.b(2.5f, 2.5f, true, false, 6.0f, 12.0f);
            cwh0VarG.m(-1.5f, 0.0f);
            cwh0VarG.c(1.0f, 1.0f, true, true, -2.0f, 0.0f);
            cwh0VarG.c(1.0f, 1.0f, false, true, 2.0f, 0.0f);
            cwh0VarG.m(-1.0f, -9.0f);
            cwh0VarG.c(1.0f, 1.0f, true, true, 0.0f, 2.0f);
            cwh0VarG.c(1.0f, 1.0f, false, true, 0.0f, -2.0f);
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            fq7.b = b180VarB;
        }
        b180 b180VarB2 = zr7.c;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Trim24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(9.0f, 18.0f);
            cwh0VarG2.g(0.0f, -0.503f, -0.106f, -0.98f, -0.297f, -1.413f);
            cwh0VarG2.k(3.91f, -3.28f);
            cwh0VarG2.j(20.71f, 20.1f);
            cwh0VarG2.k(1.285f, -1.533f);
            cwh0VarG2.j(14.17f, 12.0f);
            cwh0VarG2.k(7.825f, -6.566f);
            cwh0VarG2.j(20.71f, 3.9f);
            cwh0VarG2.k(-8.097f, 6.794f);
            cwh0VarG2.k(-3.91f, -3.281f);
            cwh0VarG2.c(3.5f, 3.5f, true, false, -1.298f, 1.523f);
            cwh0VarG2.j(11.058f, 12.0f);
            cwh0VarG2.k(-3.651f, 3.064f);
            cwh0VarG2.b(3.5f, 3.5f, true, false, 9.0f, 18.0f);
            cwh0VarG2.m(-2.0f, 0.0f);
            cwh0VarG2.c(1.5f, 1.5f, true, true, -3.0f, 0.0f);
            cwh0VarG2.c(1.5f, 1.5f, false, true, 3.0f, 0.0f);
            cwh0VarG2.l(5.5f, 4.5f);
            cwh0VarG2.c(1.5f, 1.5f, true, true, 0.0f, 3.0f);
            cwh0VarG2.c(1.5f, 1.5f, false, true, 0.0f, -3.0f);
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            zr7.c = b180VarB2;
        }
        c = new otx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new psx((byte) 24);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof otx);
    }

    public final int hashCode() {
        return -47505673;
    }

    public final String toString() {
        return "Trim";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
