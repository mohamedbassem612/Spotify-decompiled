package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class klx extends hux {
    public static final Parcelable.Creator<klx> CREATOR;
    public static final klx c;
    public static final byte d;

    static {
        b180 b180VarB = n8p1.a;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.CheckAltFill16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(0.0f, 8.0f);
            cwh0VarG.c(8.0f, 8.0f, true, true, 16.0f, 0.0f);
            cwh0VarG.b(8.0f, 8.0f, false, true, 0.0f, 8.0f);
            cwh0VarG.m(11.748f, -1.97f);
            cwh0VarG.c(0.75f, 0.75f, false, false, -1.06f, -1.06f);
            cwh0VarG.k(-4.47f, 4.47f);
            cwh0VarG.k(-1.405f, -1.406f);
            cwh0VarG.c(0.75f, 0.75f, true, false, -1.061f, 1.06f);
            rjx.C(cwh0VarG, 2.466f, 2.467f, 5.53f, -5.53f);
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            n8p1.a = b180VarB;
        }
        b180 b180VarB2 = p8p1.a;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.CheckAltFill24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(1.0f, 12.0f);
            cwh0VarG2.f(1.0f, 5.925f, 5.925f, 1.0f, 12.0f, 1.0f);
            cwh0VarG2.q(11.0f, 4.925f, 11.0f, 11.0f);
            cwh0VarG2.q(-4.925f, 11.0f, -11.0f, 11.0f);
            cwh0VarG2.p(1.0f, 18.075f, 1.0f, 12.0f);
            cwh0VarG2.m(16.398f, -2.38f);
            cwh0VarG2.c(1.0f, 1.0f, false, false, -1.414f, -1.413f);
            cwh0VarG2.k(-6.011f, 6.01f);
            cwh0VarG2.k(-1.894f, -1.893f);
            cwh0VarG2.c(1.0f, 1.0f, false, false, -1.414f, 1.414f);
            cwh0VarG2.k(3.308f, 3.308f);
            cwh0VarG2.e();
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            p8p1.a = b180VarB2;
        }
        c = new klx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new hlx((byte) 2);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof klx);
    }

    public final int hashCode() {
        return 1577674361;
    }

    public final String toString() {
        return "CheckAltFill";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
