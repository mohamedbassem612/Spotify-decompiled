package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class npx extends hux {
    public static final Parcelable.Creator<npx> CREATOR;
    public static final npx c;
    public static final byte d;

    static {
        b180 b180VarB = ilo1.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.OfflineSync16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(7.96f, 1.5f);
            cwh0VarG.b(6.5f, 6.5f, false, false, 1.539f, 7.0f);
            cwh0VarG.h(0.024f);
            cwh0VarG.b(7.999f, 7.999f, false, true, 14.5f, 3.394f);
            cwh0VarG.u(1.75f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 1.5f, 0.0f);
            cwh0VarG.u(6.0f);
            cwh0VarG.i(-4.25f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.0f, -1.5f);
            cwh0VarG.i(1.687f);
            cwh0VarG.c(6.49f, 6.49f, false, false, -5.477f, -3.0f);
            cwh0VarG.l(14.38f, 9.0f);
            cwh0VarG.i(1.515f);
            cwh0VarG.b(7.998f, 7.998f, false, true, 1.5f, 12.712f);
            cwh0VarG.v(1.538f);
            cwh0VarG.c(0.75f, 0.75f, true, true, -1.5f, 0.0f);
            cwh0VarG.u(10.0f);
            cwh0VarG.i(4.25f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.0f, 1.5f);
            cwh0VarG.h(2.487f);
            cwh0VarG.b(6.499f, 6.499f, false, false, 14.38f, 9.0f);
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            ilo1.b = b180VarB;
        }
        b180 b180VarB2 = ulo1.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.OfflineSync24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(12.0f, 4.0f);
            cwh0VarG2.c(8.0f, 8.0f, false, false, -7.938f, 7.0f);
            cwh0VarG2.h(2.049f);
            cwh0VarG2.f(2.551f, 5.947f, 6.815f, 2.0f, 12.0f, 2.0f);
            cwh0VarG2.c(9.99f, 9.99f, false, true, 8.0f, 4.0f);
            cwh0VarG2.u(4.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 2.0f, 0.0f);
            cwh0VarG2.v(5.25f);
            cwh0VarG2.i(-5.25f);
            cwh0VarG2.c(1.0f, 1.0f, true, true, 0.0f, -2.0f);
            cwh0VarG2.i(1.688f);
            cwh0VarG2.b(7.99f, 7.99f, false, false, 12.0f, 4.0f);
            cwh0VarG2.m(9.95f, 9.0f);
            cwh0VarG2.i(-2.012f);
            cwh0VarG2.c(8.001f, 8.001f, false, true, -14.376f, 3.75f);
            cwh0VarG2.h(7.25f);
            cwh0VarG2.c(1.0f, 1.0f, true, false, 0.0f, -2.0f);
            cwh0VarG2.h(2.0f);
            cwh0VarG2.u(20.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, false, 2.0f, 0.0f);
            cwh0VarG2.v(-2.0f);
            cwh0VarG2.c(9.99f, 9.99f, false, false, 8.0f, 4.0f);
            cwh0VarG2.g(5.185f, 0.0f, 9.449f, -3.947f, 9.95f, -9.0f);
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            ulo1.b = b180VarB2;
        }
        c = new npx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new yox((byte) 14);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof npx);
    }

    public final int hashCode() {
        return 2101108393;
    }

    public final String toString() {
        return "OfflineSync";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
