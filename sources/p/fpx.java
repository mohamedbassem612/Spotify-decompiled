package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fpx extends hux {
    public static final Parcelable.Creator<fpx> CREATOR;
    public static final fpx c;
    public static final byte d;

    static {
        b180 b180VarB = oho1.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.More16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(3.0f, 8.0f);
            cwh0VarG.c(1.5f, 1.5f, true, true, -3.0f, 0.0f);
            cwh0VarG.c(1.5f, 1.5f, false, true, 3.0f, 0.0f);
            cwh0VarG.m(6.5f, 0.0f);
            cwh0VarG.c(1.5f, 1.5f, true, true, -3.0f, 0.0f);
            cwh0VarG.c(1.5f, 1.5f, false, true, 3.0f, 0.0f);
            cwh0VarG.l(16.0f, 8.0f);
            cwh0VarG.c(1.5f, 1.5f, true, true, -3.0f, 0.0f);
            cwh0VarG.c(1.5f, 1.5f, false, true, 3.0f, 0.0f);
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            oho1.b = b180VarB;
        }
        b180 b180VarB2 = tho1.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.More24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(4.5f, 13.5f);
            cwh0VarG2.c(1.5f, 1.5f, true, false, 0.0f, -3.0f);
            cwh0VarG2.c(1.5f, 1.5f, false, false, 0.0f, 3.0f);
            cwh0VarG2.m(15.0f, 0.0f);
            cwh0VarG2.c(1.5f, 1.5f, true, false, 0.0f, -3.0f);
            cwh0VarG2.c(1.5f, 1.5f, false, false, 0.0f, 3.0f);
            cwh0VarG2.m(-7.5f, 0.0f);
            cwh0VarG2.c(1.5f, 1.5f, true, false, 0.0f, -3.0f);
            cwh0VarG2.c(1.5f, 1.5f, false, false, 0.0f, 3.0f);
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            tho1.b = b180VarB2;
        }
        c = new fpx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new yox((byte) 6);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof fpx);
    }

    public final int hashCode() {
        return -47716822;
    }

    public final String toString() {
        return "More";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
