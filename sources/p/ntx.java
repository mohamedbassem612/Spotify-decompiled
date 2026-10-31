package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ntx extends hux {
    public static final Parcelable.Creator<ntx> CREATOR;
    public static final ntx c;
    public static final byte d;

    static {
        b180 b180VarB = wm5.d;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Trending16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(8.57f, 4.0f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.75f, -0.75f);
            cwh0VarG.i(5.43f);
            cwh0VarG.v(5.515f);
            cwh0VarG.c(0.75f, 0.75f, false, true, -1.5f, 0.0f);
            cwh0VarG.u(5.81f);
            cwh0VarG.k(-4.72f, 4.72f);
            cwh0VarG.c(0.75f, 0.75f, false, true, -1.06f, 0.0f);
            cwh0VarG.j(6.0f, 9.06f);
            cwh0VarG.k(-3.47f, 3.47f);
            cwh0VarG.c(0.75f, 0.75f, false, true, -1.06f, -1.061f);
            cwh0VarG.k(4.0f, -4.0f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 1.06f, 0.0f);
            cwh0VarG.j(8.0f, 8.94f);
            cwh0VarG.k(4.19f, -4.19f);
            cwh0VarG.h(9.32f);
            cwh0VarG.b(0.75f, 0.75f, false, true, 8.57f, 4.0f);
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            wm5.d = b180VarB;
        }
        b180 b180VarB2 = z47.f;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Trending24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(14.306f, 7.0f);
            cwh0VarG2.c(1.0f, 1.0f, true, true, 0.0f, -2.0f);
            cwh0VarG2.h(22.0f);
            cwh0VarG2.v(7.727f);
            cwh0VarG2.c(1.0f, 1.0f, true, true, -2.0f, 0.0f);
            cwh0VarG2.u(8.414f);
            cwh0VarG2.k(-6.793f, 6.793f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, -1.414f, 0.0f);
            cwh0VarG2.j(9.5f, 12.914f);
            cwh0VarG2.k(-5.793f, 5.793f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, -1.414f, -1.414f);
            cwh0VarG2.k(6.5f, -6.5f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 1.414f, 0.0f);
            cwh0VarG2.k(2.293f, 2.293f);
            cwh0VarG2.j(18.586f, 7.0f);
            cwh0VarG2.e();
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            z47.f = b180VarB2;
        }
        dsx dsxVar = new dsx(b180VarB, b180VarB2);
        b180 b180VarB3 = m87.c;
        if (b180VarB3 == null) {
            a180 a180Var3 = new a180("Encore.Vector.TrendingActive16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i3 = bui1.a;
            n6a1 n6a1Var3 = new n6a1(u7h.b);
            cwh0 cwh0VarG3 = lf51.g(1.0f, 0.0f);
            cwh0VarG3.c(1.0f, 1.0f, false, false, -1.0f, 1.0f);
            cwh0VarG3.v(14.0f);
            cwh0VarG3.c(1.0f, 1.0f, false, false, 1.0f, 1.0f);
            cwh0VarG3.i(14.0f);
            cwh0VarG3.c(1.0f, 1.0f, false, false, 1.0f, -1.0f);
            cwh0VarG3.j(16.0f, 1.0f);
            cwh0VarG3.c(1.0f, 1.0f, false, false, -1.0f, -1.0f);
            cwh0VarG3.e();
            cwh0VarG3.l(9.32f, 3.25f);
            cwh0VarG3.i(5.43f);
            cwh0VarG3.v(5.515f);
            cwh0VarG3.c(0.75f, 0.75f, false, true, -1.5f, 0.0f);
            cwh0VarG3.j(13.25f, 5.81f);
            cwh0VarG3.k(-4.72f, 4.72f);
            cwh0VarG3.c(0.75f, 0.75f, false, true, -1.06f, 0.0f);
            cwh0VarG3.j(6.0f, 9.06f);
            cwh0VarG3.k(-3.47f, 3.47f);
            cwh0VarG3.c(0.75f, 0.75f, false, true, -1.06f, -1.061f);
            cwh0VarG3.k(4.0f, -4.0f);
            cwh0VarG3.c(0.75f, 0.75f, false, true, 1.06f, 0.0f);
            cwh0VarG3.j(8.0f, 8.94f);
            cwh0VarG3.k(4.19f, -4.19f);
            cwh0VarG3.j(9.32f, 4.75f);
            cwh0VarG3.c(0.75f, 0.75f, false, true, 0.0f, -1.5f);
            a180.a(a180Var3, cwh0VarG3.a, n6a1Var3, 1.0f, 2, 1.0f);
            b180VarB3 = a180Var3.b();
            m87.c = b180VarB3;
        }
        b180 b180VarB4 = c97.j;
        if (b180VarB4 == null) {
            a180 a180Var4 = new a180("Encore.Vector.TrendingActive24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i4 = bui1.a;
            n6a1 n6a1Var4 = new n6a1(u7h.b);
            cwh0 cwh0VarG4 = lf51.g(3.0f, 1.0f);
            cwh0VarG4.c(2.0f, 2.0f, false, false, -2.0f, 2.0f);
            cwh0VarG4.v(18.0f);
            cwh0VarG4.c(2.0f, 2.0f, false, false, 2.0f, 2.0f);
            cwh0VarG4.i(18.0f);
            cwh0VarG4.c(2.0f, 2.0f, false, false, 2.0f, -2.0f);
            cwh0VarG4.j(23.0f, 3.0f);
            cwh0VarG4.c(2.0f, 2.0f, false, false, -2.0f, -2.0f);
            hrt.o(cwh0VarG4, 13.306f, 6.0f, 21.0f, 6.0f);
            cwh0VarG4.v(7.727f);
            cwh0VarG4.c(1.0f, 1.0f, true, true, -2.0f, 0.0f);
            cwh0VarG4.j(19.0f, 9.414f);
            cwh0VarG4.k(-5.793f, 5.793f);
            cwh0VarG4.c(1.0f, 1.0f, false, true, -1.414f, 0.0f);
            cwh0VarG4.j(9.5f, 12.914f);
            cwh0VarG4.k(-5.293f, 5.293f);
            cwh0VarG4.c(1.0f, 1.0f, true, true, -1.414f, -1.414f);
            cwh0VarG4.k(6.0f, -6.0f);
            cwh0VarG4.c(1.0f, 1.0f, false, true, 1.414f, 0.0f);
            cwh0VarG4.k(2.293f, 2.293f);
            cwh0VarG4.j(17.586f, 8.0f);
            cwh0VarG4.i(-4.28f);
            cwh0VarG4.c(1.0f, 1.0f, true, true, 0.0f, -2.0f);
            a180.a(a180Var4, cwh0VarG4.a, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB4 = a180Var4.b();
            c97.j = b180VarB4;
        }
        c = new ntx(dsxVar, new dsx(b180VarB3, b180VarB4));
        d = (byte) 8;
        CREATOR = new psx((byte) 23);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ntx);
    }

    public final int hashCode() {
        return 493784442;
    }

    public final String toString() {
        return "Trending";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
