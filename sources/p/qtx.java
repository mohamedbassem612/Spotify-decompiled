package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qtx extends hux {
    public static final Parcelable.Creator<qtx> CREATOR;
    public static final qtx c;
    public static final byte d;

    static {
        b180 b180VarB = kbb.c;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Undo16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(4.35f, 0.922f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 1.06f, 1.06f);
            cwh0VarG.j(4.393f, 3.0f);
            cwh0VarG.h(9.75f);
            cwh0VarG.c(5.75f, 5.75f, false, true, 5.75f, 5.75f);
            cwh0VarG.v(0.5f);
            cwh0VarG.b(5.75f, 5.75f, false, true, 9.75f, 15.0f);
            cwh0VarG.i(-6.0f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.0f, -1.5f);
            cwh0VarG.i(6.0f);
            cwh0VarG.b(4.25f, 4.25f, false, false, 14.0f, 9.25f);
            cwh0VarG.v(-0.5f);
            cwh0VarG.b(4.25f, 4.25f, false, false, 9.75f, 4.5f);
            cwh0VarG.h(4.393f);
            cwh0VarG.j(5.41f, 5.518f);
            cwh0VarG.c(0.75f, 0.75f, false, true, -1.06f, 1.06f);
            cwh0VarG.j(1.52f, 3.75f);
            cwh0VarG.e();
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            kbb.c = b180VarB;
        }
        b180 b180VarB2 = t0c.d;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Undo24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(7.5f, 7.298f);
            cwh0VarG2.c(1.0f, 1.0f, true, true, -1.415f, 1.414f);
            cwh0VarG2.j(2.373f, 5.0f);
            cwh0VarG2.k(3.712f, -3.712f);
            cwh0VarG2.b(1.0f, 1.0f, true, true, 7.5f, 2.702f);
            cwh0VarG2.j(6.2f, 4.0f);
            cwh0VarG2.h(14.0f);
            cwh0VarG2.c(9.0f, 9.0f, false, true, 0.0f, 18.0f);
            cwh0VarG2.h(5.0f);
            cwh0VarG2.c(1.0f, 1.0f, true, true, 0.0f, -2.0f);
            cwh0VarG2.i(9.0f);
            cwh0VarG2.c(7.0f, 7.0f, true, false, 0.0f, -14.0f);
            cwh0VarG2.h(6.2f);
            cwh0VarG2.e();
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            t0c.d = b180VarB2;
        }
        c = new qtx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new psx((byte) 26);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof qtx);
    }

    public final int hashCode() {
        return -47479879;
    }

    public final String toString() {
        return "Undo";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
