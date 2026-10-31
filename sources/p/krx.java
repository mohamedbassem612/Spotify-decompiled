package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class krx extends hux {
    public static final Parcelable.Creator<krx> CREATOR;
    public static final krx c;
    public static final byte d;

    static {
        b180 b180VarB = yzo1.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.PlusMinus16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(13.0f, 14.25f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.0f, 1.5f);
            cwh0VarG.h(3.0f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.0f, -1.5f);
            cwh0VarG.e();
            cwh0VarG.l(7.25f, 11.0f);
            cwh0VarG.u(6.75f);
            cwh0VarG.h(3.0f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.0f, -1.5f);
            cwh0VarG.i(4.25f);
            cwh0VarG.u(1.0f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 1.5f, 0.0f);
            cwh0VarG.v(4.25f);
            cwh0VarG.h(13.0f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.0f, 1.5f);
            cwh0VarG.h(8.75f);
            cwh0VarG.u(11.0f);
            cwh0VarG.c(0.75f, 0.75f, false, true, -1.5f, 0.0f);
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            yzo1.b = b180VarB;
        }
        b180 b180VarB2 = zzo1.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.PlusMinus24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(19.0f, 20.0f);
            cwh0VarG2.c(1.0f, 1.0f, true, true, 0.0f, 2.0f);
            cwh0VarG2.j(5.0f, 22.0f);
            cwh0VarG2.c(1.0f, 1.0f, true, true, 0.0f, -2.0f);
            cwh0VarG2.e();
            cwh0VarG2.l(11.0f, 17.0f);
            cwh0VarG2.v(-6.0f);
            cwh0VarG2.j(5.0f, 11.0f);
            cwh0VarG2.c(1.0f, 1.0f, true, true, 0.0f, -2.0f);
            cwh0VarG2.i(6.0f);
            cwh0VarG2.j(11.0f, 3.0f);
            cwh0VarG2.c(1.0f, 1.0f, true, true, 2.0f, 0.0f);
            cwh0VarG2.v(6.0f);
            cwh0VarG2.i(6.0f);
            cwh0VarG2.c(1.0f, 1.0f, true, true, 0.0f, 2.0f);
            cwh0VarG2.i(-6.0f);
            cwh0VarG2.v(6.0f);
            cwh0VarG2.c(1.0f, 1.0f, true, true, -2.0f, 0.0f);
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            zzo1.b = b180VarB2;
        }
        c = new krx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new jrx((byte) 0);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof krx);
    }

    public final int hashCode() {
        return 632433985;
    }

    public final String toString() {
        return "PlusMinus";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
