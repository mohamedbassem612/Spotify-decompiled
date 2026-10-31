package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mox extends hux {
    public static final Parcelable.Creator<mox> CREATOR;
    public static final mox c;
    public static final byte d;

    static {
        b180 b180VarB = vzn1.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.ListText16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(14.5f, 2.25f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.0f, 1.5f);
            cwh0VarG.i(-13.0f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.0f, -1.5f);
            cwh0VarG.e();
            cwh0VarG.l(14.5f, 7.25f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.0f, 1.5f);
            cwh0VarG.i(-13.0f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.0f, -1.5f);
            cwh0VarG.e();
            cwh0VarG.l(9.5f, 12.25f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.0f, 1.5f);
            cwh0VarG.i(-8.0f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.0f, -1.5f);
            cwh0VarG.e();
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            vzn1.b = b180VarB;
        }
        b180 b180VarB2 = xzn1.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.ListText24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(22.0f, 4.0f);
            cwh0VarG2.c(1.0f, 1.0f, true, true, 0.0f, 2.0f);
            cwh0VarG2.j(2.0f, 6.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 0.0f, -2.0f);
            cwh0VarG2.e();
            cwh0VarG2.l(22.0f, 11.0f);
            cwh0VarG2.c(1.0f, 1.0f, true, true, 0.0f, 2.0f);
            cwh0VarG2.j(2.0f, 13.0f);
            cwh0VarG2.c(1.0f, 1.0f, true, true, 0.0f, -2.0f);
            cwh0VarG2.e();
            cwh0VarG2.l(14.0f, 18.0f);
            cwh0VarG2.c(1.0f, 1.0f, true, true, 0.0f, 2.0f);
            cwh0VarG2.j(2.0f, 20.0f);
            cwh0VarG2.c(1.0f, 1.0f, true, true, 0.0f, -2.0f);
            cwh0VarG2.e();
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            xzn1.b = b180VarB2;
        }
        c = new mox(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new snx((byte) 18);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof mox);
    }

    public final int hashCode() {
        return 444474176;
    }

    public final String toString() {
        return "ListText";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
