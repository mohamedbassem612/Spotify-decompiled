package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fsx extends hux {
    public static final Parcelable.Creator<fsx> CREATOR;
    public static final fsx c;
    public static final byte d;

    static {
        b180 b180VarB = f4p1.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.ShareAndroid16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(12.875f, 2.0f);
            cwh0VarG.c(1.125f, 1.125f, true, false, 0.0f, 2.25f);
            cwh0VarG.c(1.125f, 1.125f, false, false, 0.0f, -2.25f);
            cwh0VarG.l(10.25f, 3.125f);
            cwh0VarG.c(2.625f, 2.625f, true, true, 0.754f, 1.841f);
            cwh0VarG.j(5.75f, 8.0f);
            cwh0VarG.k(5.254f, 3.034f);
            cwh0VarG.c(2.625f, 2.625f, true, true, -0.704f, 1.326f);
            cwh0VarG.k(-5.0f, -2.889f);
            cwh0VarG.c(2.625f, 2.625f, true, true, 0.0f, -2.943f);
            cwh0VarG.k(5.0f, -2.888f);
            cwh0VarG.c(2.6f, 2.6f, false, true, -0.051f, -0.516f);
            cwh0VarG.e();
            cwh0VarG.l(3.125f, 6.875f);
            cwh0VarG.c(1.125f, 1.125f, true, false, 0.0f, 2.25f);
            cwh0VarG.c(1.125f, 1.125f, false, false, 0.0f, -2.25f);
            cwh0VarG.m(9.75f, 4.875f);
            cwh0VarG.c(1.125f, 1.125f, true, false, 0.0f, 2.25f);
            cwh0VarG.c(1.125f, 1.125f, false, false, 0.0f, -2.25f);
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            f4p1.b = b180VarB;
        }
        b180 b180VarB2 = h4p1.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.ShareAndroid24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(18.5f, 4.0f);
            cwh0VarG2.c(1.5f, 1.5f, true, false, 0.0f, 3.0f);
            cwh0VarG2.c(1.5f, 1.5f, false, false, 0.0f, -3.0f);
            cwh0VarG2.l(15.0f, 5.5f);
            cwh0VarG2.c(3.5f, 3.5f, true, true, 1.006f, 2.455f);
            cwh0VarG2.j(9.0f, 12.0f);
            cwh0VarG2.k(7.006f, 4.045f);
            cwh0VarG2.c(3.5f, 3.5f, true, true, -0.938f, 1.768f);
            cwh0VarG2.k(-6.67f, -3.85f);
            cwh0VarG2.c(3.5f, 3.5f, true, true, 0.0f, -3.924f);
            cwh0VarG2.k(6.67f, -3.852f);
            cwh0VarG2.b(3.5f, 3.5f, false, true, 15.0f, 5.5f);
            cwh0VarG2.m(-9.5f, 5.0f);
            cwh0VarG2.c(1.5f, 1.5f, true, false, 0.0f, 3.0f);
            cwh0VarG2.c(1.5f, 1.5f, false, false, 0.0f, -3.0f);
            cwh0VarG2.m(13.0f, 6.5f);
            cwh0VarG2.c(1.5f, 1.5f, true, false, -0.001f, 3.0f);
            cwh0VarG2.c(1.5f, 1.5f, false, false, 0.001f, -3.0f);
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            h4p1.b = b180VarB2;
        }
        c = new fsx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new jrx((byte) 20);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof fsx);
    }

    public final int hashCode() {
        return 1263909733;
    }

    public final String toString() {
        return "ShareAndroid";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
