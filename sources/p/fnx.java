package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fnx extends hux {
    public static final Parcelable.Creator<fnx> CREATOR;
    public static final fnx c;
    public static final byte d;

    static {
        b180 b180VarB = rqg0.d;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Flag16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0Var = new cwh0();
            cwh0Var.l(15.259f, 0.0f);
            cwh0Var.h(0.997f);
            cwh0Var.v(16.0f);
            cwh0Var.i(1.5f);
            cwh0Var.v(-5.0f);
            cwh0Var.i(12.762f);
            cwh0Var.k(-3.175f, -5.5f);
            cwh0Var.e();
            cwh0Var.l(2.497f, 9.5f);
            cwh0Var.v(-8.0f);
            cwh0Var.h(12.66f);
            rjx.C(cwh0Var, -2.31f, 4.0f, 2.31f, 4.0f);
            a180.a(a180Var, cwh0Var.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            rqg0.d = b180VarB;
        }
        b180 b180VarB2 = yah0.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Flag24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0Var2 = new cwh0();
            cwh0Var2.l(22.814f, 0.0f);
            cwh0Var2.h(2.0f);
            cwh0Var2.v(22.0f);
            cwh0Var2.i(2.0f);
            cwh0Var2.v(-7.0f);
            cwh0Var2.i(18.814f);
            cwh0Var2.k(-4.33f, -7.5f);
            cwh0Var2.e();
            cwh0Var2.l(4.0f, 13.0f);
            cwh0Var2.u(2.0f);
            cwh0Var2.i(15.35f);
            rjx.C(cwh0Var2, -3.176f, 5.5f, 3.175f, 5.5f);
            a180.a(a180Var2, cwh0Var2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            yah0.b = b180VarB2;
        }
        c = new fnx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new mmx((byte) 17);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof fnx);
    }

    public final int hashCode() {
        return -47928767;
    }

    public final String toString() {
        return "Flag";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
