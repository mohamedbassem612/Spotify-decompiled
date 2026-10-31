package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yjx extends hux {
    public static final Parcelable.Creator<yjx> CREATOR;
    public static final yjx c;

    static {
        b180 b180VarB = czo1.a;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.AirPlay16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarI = ydh.i(11.976f, 14.0f, 8.0f, 8.0f);
            rjx.y(cwh0VarI, -4.0f, 6.0f, 0.0f, 2.0f);
            cwh0VarI.v(10.0f);
            cwh0VarI.i(2.929f);
            cwh0VarI.k(0.666f, -1.0f);
            cwh0VarI.h(1.0f);
            cwh0VarI.u(3.0f);
            cwh0VarI.i(14.0f);
            cwh0VarI.v(8.0f);
            cwh0VarI.i(-2.611f);
            cwh0VarI.k(0.659f, 1.0f);
            cwh0VarI.h(16.0f);
            cwh0VarI.u(2.0f);
            cwh0VarI.e();
            a180.a(a180Var, cwh0VarI.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            czo1.a = b180VarB;
        }
        b180 b180VarB2 = dzo1.a;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.AirPlay24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarI2 = ydh.i(17.964f, 21.0f, 12.0f, 12.0f);
            rjx.y(cwh0VarI2, -6.0f, 9.0f, 0.0f, 3.0f);
            cwh0VarI2.v(15.0f);
            cwh0VarI2.i(4.393f);
            cwh0VarI2.k(1.0f, -1.5f);
            cwh0VarI2.h(1.5f);
            cwh0VarI2.v(-12.0f);
            cwh0VarI2.i(21.0f);
            cwh0VarI2.v(12.0f);
            cwh0VarI2.i(-3.916f);
            cwh0VarI2.k(0.987f, 1.5f);
            cwh0VarI2.h(24.0f);
            cwh0VarI2.u(3.0f);
            cwh0VarI2.e();
            a180.a(a180Var2, cwh0VarI2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            dzo1.a = b180VarB2;
        }
        c = new yjx(new dsx(b180VarB, b180VarB2), null);
        CREATOR = new x7w((byte) 26);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof yjx);
    }

    public final int hashCode() {
        return -2130072407;
    }

    public final String toString() {
        return "AirPlay";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
