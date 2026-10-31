package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jsx extends hux {
    public static final Parcelable.Creator<jsx> CREATOR;
    public static final jsx c;
    public static final byte d;

    static {
        b180 b180VarB = z4p1.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.SkipBack16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(3.3f, 1.0f);
            cwh0VarG.c(0.7f, 0.7f, false, true, 0.7f, 0.7f);
            cwh0VarG.v(5.15f);
            cwh0VarG.k(9.95f, -5.744f);
            cwh0VarG.c(0.7f, 0.7f, false, true, 1.05f, 0.606f);
            cwh0VarG.v(12.575f);
            cwh0VarG.c(0.7f, 0.7f, false, true, -1.05f, 0.607f);
            cwh0VarG.j(4.0f, 9.149f);
            cwh0VarG.u(14.3f);
            cwh0VarG.c(0.7f, 0.7f, false, true, -0.7f, 0.7f);
            cwh0VarG.h(1.7f);
            cwh0VarG.c(0.7f, 0.7f, false, true, -0.7f, -0.7f);
            cwh0VarG.u(1.7f);
            cwh0VarG.c(0.7f, 0.7f, false, true, 0.7f, -0.7f);
            cwh0VarG.e();
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            z4p1.b = b180VarB;
        }
        b180 b180VarB2 = b5p1.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.SkipBack24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(6.3f, 3.0f);
            cwh0VarG2.c(0.7f, 0.7f, false, true, 0.7f, 0.7f);
            cwh0VarG2.v(6.805f);
            cwh0VarG2.k(11.95f, -6.899f);
            cwh0VarG2.c(0.7f, 0.7f, false, true, 1.05f, 0.606f);
            cwh0VarG2.v(15.576f);
            cwh0VarG2.c(0.7f, 0.7f, false, true, -1.05f, 0.606f);
            cwh0VarG2.j(7.0f, 13.495f);
            cwh0VarG2.u(20.3f);
            cwh0VarG2.c(0.7f, 0.7f, false, true, -0.7f, 0.7f);
            cwh0VarG2.h(4.7f);
            cwh0VarG2.c(0.7f, 0.7f, false, true, -0.7f, -0.7f);
            cwh0VarG2.u(3.7f);
            cwh0VarG2.c(0.7f, 0.7f, false, true, 0.7f, -0.7f);
            cwh0VarG2.e();
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            b5p1.b = b180VarB2;
        }
        c = new jsx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new jrx((byte) 23);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof jsx);
    }

    public final int hashCode() {
        return 1243725659;
    }

    public final String toString() {
        return "SkipBack";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
