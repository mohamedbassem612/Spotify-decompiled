package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ssx extends hux {
    public static final Parcelable.Creator<ssx> CREATOR;
    public static final ssx c;
    public static final byte d;

    static {
        b180 b180VarB = o6p1.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Soundwave16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(7.25f, 0.75f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 1.5f, 0.0f);
            cwh0VarG.v(14.5f);
            cwh0VarG.c(0.75f, 0.75f, false, true, -1.5f, 0.0f);
            cwh0VarG.e();
            cwh0VarG.l(10.875f, 3.25f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 1.5f, 0.0f);
            cwh0VarG.v(9.5f);
            cwh0VarG.c(0.75f, 0.75f, false, true, -1.5f, 0.0f);
            cwh0VarG.e();
            cwh0VarG.l(0.75f, 5.0f);
            cwh0VarG.c(0.75f, 0.75f, false, false, -0.75f, 0.75f);
            cwh0VarG.v(4.5f);
            cwh0VarG.c(0.75f, 0.75f, false, false, 1.5f, 0.0f);
            cwh0VarG.v(-4.5f);
            cwh0VarG.b(0.75f, 0.75f, false, false, 0.75f, 5.0f);
            cwh0VarG.m(13.75f, 0.75f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 1.5f, 0.0f);
            cwh0VarG.v(4.5f);
            cwh0VarG.c(0.75f, 0.75f, false, true, -1.5f, 0.0f);
            cwh0VarG.e();
            cwh0VarG.l(4.375f, 2.5f);
            cwh0VarG.c(0.75f, 0.75f, false, false, -0.75f, 0.75f);
            cwh0VarG.v(9.5f);
            cwh0VarG.c(0.75f, 0.75f, false, false, 1.5f, 0.0f);
            cwh0VarG.v(-9.5f);
            cwh0VarG.c(0.75f, 0.75f, false, false, -0.75f, -0.75f);
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            o6p1.b = b180VarB;
        }
        b180 b180VarB2 = p6p1.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Soundwave24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(12.0f, 0.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 1.0f, 1.0f);
            cwh0VarG2.v(22.0f);
            cwh0VarG2.c(1.0f, 1.0f, true, true, -2.0f, 0.0f);
            cwh0VarG2.u(1.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 1.0f, -1.0f);
            cwh0VarG2.m(5.0f, 4.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 1.0f, 1.0f);
            cwh0VarG2.v(14.0f);
            cwh0VarG2.c(1.0f, 1.0f, true, true, -2.0f, 0.0f);
            cwh0VarG2.u(5.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 1.0f, -1.0f);
            cwh0VarG2.l(1.0f, 9.0f);
            cwh0VarG2.v(6.0f);
            cwh0VarG2.c(1.0f, 1.0f, true, false, 2.0f, 0.0f);
            cwh0VarG2.u(9.0f);
            cwh0VarG2.c(1.0f, 1.0f, true, false, -2.0f, 0.0f);
            cwh0VarG2.m(20.0f, 6.0f);
            cwh0VarG2.u(9.0f);
            cwh0VarG2.c(1.0f, 1.0f, true, true, 2.0f, 0.0f);
            cwh0VarG2.v(6.0f);
            cwh0VarG2.c(1.0f, 1.0f, true, true, -2.0f, 0.0f);
            cwh0VarG2.l(8.0f, 5.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, false, -2.0f, 0.0f);
            cwh0VarG2.v(14.0f);
            cwh0VarG2.c(1.0f, 1.0f, true, false, 2.0f, 0.0f);
            cwh0VarG2.e();
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            p6p1.b = b180VarB2;
        }
        c = new ssx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new psx((byte) 2);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ssx);
    }

    public final int hashCode() {
        return 317001427;
    }

    public final String toString() {
        return "Soundwave";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
