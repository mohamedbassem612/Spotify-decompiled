package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class urx extends hux {
    public static final Parcelable.Creator<urx> CREATOR;
    public static final urx c;
    public static final byte d;

    static {
        b180 b180VarB = b2p1.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.RecentlyPlayed16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            long j = u7h.b;
            n6a1 n6a1Var = new n6a1(j);
            cwh0 cwh0VarG = lf51.g(14.515f, 7.997f);
            cwh0VarG.c(6.503f, 6.503f, false, false, -6.502f, -6.502f);
            cwh0VarG.c(0.75f, 0.75f, true, true, 0.0f, -1.498f);
            cwh0VarG.c(8.0f, 8.0f, true, true, -8.0f, 8.0f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 1.5f, 0.0f);
            cwh0VarG.c(6.501f, 6.501f, false, false, 13.002f, 0.0f);
            cwh0VarG.l(4.808f, 2.502f);
            cwh0VarG.c(0.906f, 0.906f, true, true, -0.906f, -1.57f);
            cwh0VarG.c(0.906f, 0.906f, false, true, 0.906f, 1.57f);
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            n6a1 n6a1Var2 = new n6a1(j);
            cwh0 cwh0VarG2 = lf51.g(7.288f, 3.646f);
            cwh0VarG2.c(0.75f, 0.75f, false, true, 1.5f, 0.0f);
            cwh0VarG2.v(3.601f);
            cwh0VarG2.i(2.125f);
            cwh0VarG2.c(0.75f, 0.75f, true, true, 0.0f, 1.5f);
            cwh0VarG2.j(7.288f, 8.747f);
            cwh0VarG2.v(-5.1f);
            cwh0VarG2.e();
            cwh0VarG2.l(1.248f, 5.156f);
            cwh0VarG2.c(0.906f, 0.906f, true, false, 0.906f, -1.57f);
            cwh0VarG2.c(0.906f, 0.906f, false, false, -0.906f, 1.57f);
            a180.a(a180Var, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            b2p1.b = b180VarB;
        }
        b180 b180VarB2 = c2p1.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.RecentlyPlayed24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            long j2 = u7h.b;
            n6a1 n6a1Var3 = new n6a1(j2);
            cwh0 cwh0VarG3 = lf51.g(21.001f, 12.0f);
            cwh0VarG3.c(9.0f, 9.0f, false, false, -9.0f, -9.0f);
            cwh0VarG3.c(1.0f, 1.0f, true, true, 0.0f, -2.0f);
            cwh0VarG3.g(6.075f, 0.0f, 11.0f, 4.925f, 11.0f, 11.0f);
            cwh0VarG3.q(-4.925f, 11.0f, -11.0f, 11.0f);
            cwh0VarG3.q(-11.0f, -4.925f, -11.0f, -11.0f);
            cwh0VarG3.c(1.0f, 1.0f, true, true, 2.0f, 0.0f);
            cwh0VarG3.c(9.0f, 9.0f, true, false, 18.0f, 0.0f);
            cwh0VarG3.l(7.58f, 4.422f);
            cwh0VarG3.c(1.25f, 1.25f, true, true, -1.25f, -2.165f);
            cwh0VarG3.c(1.25f, 1.25f, false, true, 1.25f, 2.165f);
            a180.a(a180Var2, cwh0VarG3.a, n6a1Var3, 1.0f, 2, 1.0f);
            n6a1 n6a1Var4 = new n6a1(j2);
            cwh0 cwh0VarG4 = lf51.g(11.034f, 6.0f);
            cwh0VarG4.c(1.0f, 1.0f, false, true, 2.0f, 0.0f);
            cwh0VarG4.v(5.0f);
            cwh0VarG4.h(16.0f);
            cwh0VarG4.c(1.0f, 1.0f, true, true, 0.0f, 2.0f);
            rjx.t(cwh0VarG4, -4.966f, 2.67f, 8.083f);
            cwh0VarG4.c(1.25f, 1.25f, true, false, 1.25f, -2.165f);
            cwh0VarG4.c(1.25f, 1.25f, false, false, -1.25f, 2.165f);
            a180.a(a180Var2, cwh0VarG4.a, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            c2p1.b = b180VarB2;
        }
        c = new urx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new jrx((byte) 10);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof urx);
    }

    public final int hashCode() {
        return 207165104;
    }

    public final String toString() {
        return "RecentlyPlayed";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
