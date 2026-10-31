package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rsx extends hux {
    public static final Parcelable.Creator<rsx> CREATOR;
    public static final rsx c;
    public static final byte d;

    static {
        b180 b180VarB = l6p1.c;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.SortBy16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(4.843f, 4.707f);
            cwh0VarG.c(1.0f, 1.0f, false, false, 1.414f, 0.0f);
            cwh0VarG.j(8.0f, 2.964f);
            cwh0VarG.k(1.743f, 1.743f);
            cwh0VarG.c(1.0f, 1.0f, false, false, 1.414f, -1.414f);
            cwh0VarG.j(8.0f, 0.136f);
            cwh0VarG.j(4.843f, 3.293f);
            cwh0VarG.c(1.0f, 1.0f, false, false, 0.0f, 1.414f);
            cwh0VarG.l(16.0f, 9.0f);
            cwh0VarG.j(0.0f, 9.0f);
            rjx.r(cwh0VarG, 0.0f, 7.0f, 16.0f);
            cwh0VarG.l(6.257f, 11.293f);
            cwh0VarG.c(1.0f, 1.0f, false, false, -1.414f, 1.414f);
            cwh0VarG.j(8.0f, 15.865f);
            cwh0VarG.k(3.157f, -3.158f);
            cwh0VarG.c(1.0f, 1.0f, false, false, -1.414f, -1.414f);
            cwh0VarG.j(8.0f, 13.036f);
            cwh0VarG.e();
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            l6p1.c = b180VarB;
        }
        b180 b180VarB2 = m6p1.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.SortBy24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(7.793f, 6.207f);
            cwh0VarG2.c(1.0f, 1.0f, false, false, 1.414f, 0.0f);
            cwh0VarG2.j(12.0f, 3.414f);
            cwh0VarG2.k(2.793f, 2.793f);
            cwh0VarG2.c(1.0f, 1.0f, true, false, 1.414f, -1.414f);
            cwh0VarG2.j(12.0f, 0.586f);
            cwh0VarG2.j(7.793f, 4.793f);
            cwh0VarG2.c(1.0f, 1.0f, false, false, 0.0f, 1.414f);
            cwh0VarG2.l(22.0f, 13.0f);
            cwh0VarG2.h(2.0f);
            cwh0VarG2.v(-2.0f);
            rjx.t(cwh0VarG2, 20.0f, 9.207f, 17.793f);
            cwh0VarG2.c(1.0f, 1.0f, false, false, -1.414f, 1.414f);
            cwh0VarG2.j(12.0f, 23.414f);
            cwh0VarG2.k(4.207f, -4.207f);
            cwh0VarG2.c(1.0f, 1.0f, false, false, -1.414f, -1.414f);
            cwh0VarG2.j(12.0f, 20.586f);
            cwh0VarG2.e();
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            m6p1.b = b180VarB2;
        }
        c = new rsx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new psx((byte) 1);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof rsx);
    }

    public final int hashCode() {
        return 1560565802;
    }

    public final String toString() {
        return "SortBy";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
