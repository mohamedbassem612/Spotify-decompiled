package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pjx extends hux {
    public static final Parcelable.Creator<pjx> CREATOR;
    public static final pjx c;
    public static final byte d;

    static {
        b180 b180VarB = cyo1.a;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.AddBelow16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(0.0f, 3.25f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.75f, -0.75f);
            cwh0VarG.i(14.5f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.0f, 1.5f);
            cwh0VarG.h(0.75f);
            cwh0VarG.b(0.75f, 0.75f, false, true, 0.0f, 3.25f);
            cwh0VarG.l(8.0f, 12.0f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.75f, -0.75f);
            cwh0VarG.i(6.5f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.0f, 1.5f);
            cwh0VarG.i(-6.5f);
            cwh0VarG.b(0.75f, 0.75f, false, true, 8.0f, 12.0f);
            cwh0VarG.m(-8.0f, 0.0f);
            cwh0VarG.g(0.0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f);
            cwh0VarG.i(1.5f);
            cwh0VarG.v(1.5f);
            cwh0VarG.c(0.75f, 0.75f, false, false, 1.5f, 0.0f);
            cwh0VarG.v(-1.5f);
            cwh0VarG.i(1.5f);
            cwh0VarG.c(0.75f, 0.75f, false, false, 0.0f, -1.5f);
            cwh0VarG.i(-1.5f);
            cwh0VarG.v(-1.5f);
            cwh0VarG.c(0.75f, 0.75f, false, false, -1.5f, 0.0f);
            cwh0VarG.v(1.5f);
            cwh0VarG.h(0.75f);
            cwh0VarG.b(0.75f, 0.75f, false, false, 0.0f, 12.0f);
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            cyo1.a = b180VarB;
        }
        b180 b180VarB2 = eyo1.a;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.AddBelow24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(2.0f, 6.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 1.0f, -1.0f);
            cwh0VarG2.i(18.0f);
            cwh0VarG2.c(1.0f, 1.0f, true, true, 0.0f, 2.0f);
            cwh0VarG2.h(3.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, -1.0f, -1.0f);
            cwh0VarG2.m(10.5f, 10.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 1.0f, -1.0f);
            cwh0VarG2.h(21.0f);
            cwh0VarG2.c(1.0f, 1.0f, true, true, 0.0f, 2.0f);
            cwh0VarG2.i(-7.5f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, -1.0f, -1.0f);
            cwh0VarG2.l(2.0f, 16.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, false, 1.0f, 1.0f);
            cwh0VarG2.i(2.0f);
            cwh0VarG2.v(2.0f);
            cwh0VarG2.c(1.0f, 1.0f, true, false, 2.0f, 0.0f);
            cwh0VarG2.v(-2.0f);
            cwh0VarG2.i(2.0f);
            cwh0VarG2.c(1.0f, 1.0f, true, false, 0.0f, -2.0f);
            cwh0VarG2.h(7.0f);
            cwh0VarG2.v(-2.0f);
            cwh0VarG2.c(1.0f, 1.0f, true, false, -2.0f, 0.0f);
            cwh0VarG2.v(2.0f);
            cwh0VarG2.h(3.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, false, -1.0f, 1.0f);
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            eyo1.a = b180VarB2;
        }
        c = new pjx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new x7w((byte) 18);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof pjx);
    }

    public final int hashCode() {
        return 2130745445;
    }

    public final String toString() {
        return "AddBelow";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
