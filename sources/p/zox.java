package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zox extends hux {
    public static final Parcelable.Creator<zox> CREATOR;
    public static final zox c;
    public static final byte d;

    static {
        b180 b180VarB = ggo1.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Minimize16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(14.53f, 1.47f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.0f, 1.06f);
            cwh0VarG.k(-2.72f, 2.72f);
            cwh0VarG.i(1.018f);
            cwh0VarG.c(0.75f, 0.75f, true, true, 0.0f, 1.5f);
            cwh0VarG.h(9.25f);
            cwh0VarG.u(3.171f);
            cwh0VarG.c(0.75f, 0.75f, true, true, 1.5f, 0.0f);
            cwh0VarG.u(4.19f);
            cwh0VarG.k(2.72f, -2.72f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 1.06f, 0.0f);
            cwh0VarG.l(1.47f, 14.53f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.0f, -1.06f);
            cwh0VarG.k(2.72f, -2.72f);
            cwh0VarG.h(3.171f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.0f, -1.5f);
            cwh0VarG.h(6.75f);
            cwh0VarG.v(3.579f);
            cwh0VarG.c(0.75f, 0.75f, true, true, -1.5f, 0.0f);
            cwh0VarG.u(11.81f);
            cwh0VarG.k(-2.72f, 2.72f);
            cwh0VarG.c(0.75f, 0.75f, false, true, -1.06f, 0.0f);
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            ggo1.b = b180VarB;
        }
        b180 b180VarB2 = dm5.j;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Minimize24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            int i3 = u7h.l;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(21.707f, 2.293f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 0.0f, 1.414f);
            cwh0VarG2.j(17.414f, 8.0f);
            cwh0VarG2.i(1.829f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 0.0f, 2.0f);
            cwh0VarG2.h(14.0f);
            cwh0VarG2.u(4.757f);
            cwh0VarG2.c(1.0f, 1.0f, true, true, 2.0f, 0.0f);
            cwh0VarG2.v(1.829f);
            cwh0VarG2.k(4.293f, -4.293f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 1.414f, 0.0f);
            cwh0VarG2.l(2.293f, 21.707f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 0.0f, -1.414f);
            cwh0VarG2.j(6.586f, 16.0f);
            cwh0VarG2.h(4.757f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 0.0f, -2.0f);
            cwh0VarG2.h(10.0f);
            cwh0VarG2.v(5.243f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, -2.0f, 0.0f);
            cwh0VarG2.v(-1.829f);
            cwh0VarG2.k(-4.293f, 4.293f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, -1.414f, 0.0f);
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            dm5.j = b180VarB2;
        }
        c = new zox(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new yox((byte) 0);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof zox);
    }

    public final int hashCode() {
        return 2034728691;
    }

    public final String toString() {
        return "Minimize";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
