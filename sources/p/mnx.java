package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mnx extends hux {
    public static final Parcelable.Creator<mnx> CREATOR;
    public static final mnx c;
    public static final byte d;

    static {
        b180 b180VarB = jo31.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Gift16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(8.0f, 1.113f);
            cwh0VarG.b(2.75f, 2.75f, true, true, 11.887f, 5.0f);
            cwh0VarG.i(3.363f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.0f, 1.5f);
            cwh0VarG.j(0.75f, 6.5f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.0f, -1.5f);
            cwh0VarG.i(3.363f);
            cwh0VarG.b(2.75f, 2.75f, true, true, 8.0f, 1.113f);
            cwh0VarG.l(7.25f, 3.0f);
            cwh0VarG.b(1.25f, 1.25f, true, false, 6.0f, 4.25f);
            cwh0VarG.i(1.25f);
            cwh0VarG.e();
            cwh0VarG.l(8.75f, 3.0f);
            cwh0VarG.v(1.25f);
            cwh0VarG.j(10.0f, 4.25f);
            cwh0VarG.b(1.25f, 1.25f, true, false, 8.75f, 3.0f);
            cwh0VarG.l(1.0f, 8.0f);
            cwh0VarG.v(7.0f);
            cwh0VarG.c(1.0f, 1.0f, false, false, 1.0f, 1.0f);
            cwh0VarG.i(5.25f);
            cwh0VarG.j(7.25f, 8.0f);
            cwh0VarG.e();
            cwh0VarG.l(8.75f, 16.0f);
            cwh0VarG.j(8.75f, 8.0f);
            cwh0VarG.j(15.0f, 8.0f);
            cwh0VarG.v(7.0f);
            cwh0VarG.c(1.0f, 1.0f, false, true, -1.0f, 1.0f);
            cwh0VarG.e();
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            jo31.b = b180VarB;
        }
        b180 b180VarB2 = i541.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Gift24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(12.0f, 2.354f);
            cwh0VarG2.b(4.0f, 4.0f, true, true, 17.646f, 8.0f);
            cwh0VarG2.j(22.0f, 8.0f);
            cwh0VarG2.c(1.0f, 1.0f, true, true, 0.0f, 2.0f);
            cwh0VarG2.j(2.0f, 10.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 0.0f, -2.0f);
            cwh0VarG2.i(4.354f);
            cwh0VarG2.b(4.0f, 4.0f, true, true, 12.0f, 2.354f);
            cwh0VarG2.l(11.0f, 5.0f);
            cwh0VarG2.c(2.0f, 2.0f, true, false, -2.0f, 2.0f);
            rjx.v(cwh0VarG2, 2.0f, 13.0f, 7.0f, 2.0f);
            cwh0VarG2.c(2.0f, 2.0f, true, false, -2.0f, -2.0f);
            cwh0VarG2.e();
            cwh0VarG2.l(2.0f, 12.0f);
            cwh0VarG2.v(10.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, false, 1.0f, 1.0f);
            cwh0VarG2.i(8.0f);
            cwh0VarG2.j(11.0f, 12.0f);
            cwh0VarG2.e();
            cwh0VarG2.l(13.0f, 23.0f);
            rjx.B(cwh0VarG2, 13.0f, 12.0f, 9.0f, 10.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, -1.0f, 1.0f);
            cwh0VarG2.e();
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            i541.b = b180VarB2;
        }
        c = new mnx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new mmx((byte) 24);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof mnx);
    }

    public final int hashCode() {
        return -47901691;
    }

    public final String toString() {
        return "Gift";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
