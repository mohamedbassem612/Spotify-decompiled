package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class umx extends hux {
    public static final Parcelable.Creator<umx> CREATOR;
    public static final umx c;
    public static final byte d;

    static {
        b180 b180VarB = kkn.c;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Downloaded16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(0.0f, 8.0f);
            cwh0VarG.c(8.0f, 8.0f, true, true, 16.0f, 0.0f);
            cwh0VarG.b(8.0f, 8.0f, false, true, 0.0f, 8.0f);
            cwh0VarG.m(8.0f, -4.75f);
            cwh0VarG.c(0.75f, 0.75f, false, false, -0.75f, 0.75f);
            cwh0VarG.v(5.94f);
            cwh0VarG.j(6.055f, 8.744f);
            cwh0VarG.c(0.75f, 0.75f, true, false, -1.06f, 1.06f);
            cwh0VarG.j(8.0f, 12.811f);
            cwh0VarG.k(3.005f, -3.006f);
            cwh0VarG.c(0.75f, 0.75f, true, false, -1.06f, -1.06f);
            cwh0VarG.j(8.75f, 9.939f);
            cwh0VarG.u(4.0f);
            cwh0VarG.b(0.75f, 0.75f, false, false, 8.0f, 3.25f);
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            kkn.c = b180VarB;
        }
        b180 b180VarB2 = nln.c;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Downloaded24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(1.0f, 12.0f);
            cwh0VarG2.f(1.0f, 5.925f, 5.925f, 1.0f, 12.0f, 1.0f);
            cwh0VarG2.q(11.0f, 4.925f, 11.0f, 11.0f);
            cwh0VarG2.q(-4.925f, 11.0f, -11.0f, 11.0f);
            cwh0VarG2.p(1.0f, 18.075f, 1.0f, 12.0f);
            cwh0VarG2.m(12.0f, -4.95f);
            cwh0VarG2.c(1.0f, 1.0f, false, false, -2.0f, 0.0f);
            cwh0VarG2.v(7.486f);
            cwh0VarG2.k(-1.793f, -1.793f);
            cwh0VarG2.c(1.0f, 1.0f, false, false, -1.414f, 1.414f);
            cwh0VarG2.j(12.0f, 18.364f);
            cwh0VarG2.k(4.207f, -4.207f);
            cwh0VarG2.c(1.0f, 1.0f, false, false, -1.414f, -1.415f);
            cwh0VarG2.j(13.0f, 14.535f);
            cwh0VarG2.e();
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            nln.c = b180VarB2;
        }
        c = new umx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new mmx((byte) 6);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof umx);
    }

    public final int hashCode() {
        return -697873860;
    }

    public final String toString() {
        return "Downloaded";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
