package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lkx extends hux {
    public static final Parcelable.Creator<lkx> CREATOR;
    public static final lkx c;
    public static final byte d;

    static {
        b180 b180VarB = v1p1.a;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.ArrowTopLeft16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, true, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarP = rjx.p(2.0f, 2.0f, 7.75f);
            cwh0VarP.c(0.75f, 0.75f, true, false, 1.5f, 0.0f);
            cwh0VarP.u(4.56f);
            cwh0VarP.k(8.62f, 8.62f);
            cwh0VarP.c(0.75f, 0.75f, true, false, 1.06f, -1.06f);
            cwh0VarP.j(4.561f, 3.5f);
            cwh0VarP.i(5.19f);
            cwh0VarP.c(0.75f, 0.75f, true, false, 0.0f, -1.5f);
            cwh0VarP.e();
            a180.a(a180Var, cwh0VarP.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            v1p1.a = b180VarB;
        }
        b180 b180VarB2 = x1p1.a;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.ArrowTopLeft24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarP2 = rjx.p(5.0f, 5.0f, 10.193f);
            cwh0VarP2.c(1.0f, 1.0f, true, false, 2.0f, 0.0f);
            cwh0VarP2.u(8.414f);
            cwh0VarP2.k(11.293f, 11.293f);
            cwh0VarP2.c(1.0f, 1.0f, false, false, 1.414f, -1.414f);
            cwh0VarP2.j(8.414f, 7.0f);
            cwh0VarP2.i(6.778f);
            cwh0VarP2.c(1.0f, 1.0f, false, false, 0.0f, -2.0f);
            cwh0VarP2.e();
            a180.a(a180Var2, cwh0VarP2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            x1p1.a = b180VarB2;
        }
        c = new lkx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new ckx((byte) 8);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof lkx);
    }

    public final int hashCode() {
        return 1259495560;
    }

    public final String toString() {
        return "ArrowTopLeft";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
