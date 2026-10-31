package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gmx extends hux {
    public static final Parcelable.Creator<gmx> CREATOR;
    public static final gmx c;
    public static final byte d;

    static {
        b180 b180VarB = m87.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.DeviceComputer16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(2.0f, 3.75f);
            cwh0VarG.f(2.0f, 2.784f, 2.784f, 2.0f, 3.75f, 2.0f);
            cwh0VarG.i(8.5f);
            cwh0VarG.g(0.966f, 0.0f, 1.75f, 0.784f, 1.75f, 1.75f);
            cwh0VarG.v(6.5f);
            cwh0VarG.b(1.75f, 1.75f, false, true, 12.25f, 12.0f);
            cwh0VarG.i(-8.5f);
            cwh0VarG.b(1.75f, 1.75f, false, true, 2.0f, 10.25f);
            cwh0VarG.e();
            cwh0VarG.l(3.75f, 3.5f);
            cwh0VarG.c(0.25f, 0.25f, false, false, -0.25f, 0.25f);
            cwh0VarG.v(6.5f);
            cwh0VarG.g(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f);
            cwh0VarG.i(8.5f);
            cwh0VarG.c(0.25f, 0.25f, false, false, 0.25f, -0.25f);
            cwh0VarG.v(-6.5f);
            cwh0VarG.c(0.25f, 0.25f, false, false, -0.25f, -0.25f);
            cwh0VarG.e();
            cwh0VarG.l(0.25f, 15.25f);
            cwh0VarG.b(0.75f, 0.75f, false, true, 1.0f, 14.5f);
            cwh0VarG.i(14.0f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.0f, 1.5f);
            cwh0VarG.j(1.0f, 16.0f);
            cwh0VarG.c(0.75f, 0.75f, false, true, -0.75f, -0.75f);
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            m87.b = b180VarB;
        }
        b180 b180VarB2 = c97.i;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.DeviceComputer24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(0.0f, 21.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 1.0f, -1.0f);
            cwh0VarG2.i(22.0f);
            cwh0VarG2.c(1.0f, 1.0f, true, true, 0.0f, 2.0f);
            cwh0VarG2.j(1.0f, 22.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, -1.0f, -1.0f);
            cwh0VarG2.l(3.0f, 5.0f);
            cwh0VarG2.c(3.0f, 3.0f, false, true, 3.0f, -3.0f);
            cwh0VarG2.i(12.0f);
            cwh0VarG2.c(3.0f, 3.0f, false, true, 3.0f, 3.0f);
            cwh0VarG2.v(9.0f);
            cwh0VarG2.c(3.0f, 3.0f, false, true, -3.0f, 3.0f);
            cwh0VarG2.j(6.0f, 17.0f);
            cwh0VarG2.c(3.0f, 3.0f, false, true, -3.0f, -3.0f);
            cwh0VarG2.e();
            cwh0VarG2.l(6.0f, 4.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, false, -1.0f, 1.0f);
            cwh0VarG2.v(9.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, false, 1.0f, 1.0f);
            cwh0VarG2.i(12.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, false, 1.0f, -1.0f);
            cwh0VarG2.j(19.0f, 5.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, false, -1.0f, -1.0f);
            cwh0VarG2.e();
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            c97.i = b180VarB2;
        }
        c = new gmx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new hlx((byte) 24);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof gmx);
    }

    public final int hashCode() {
        return -427872218;
    }

    public final String toString() {
        return "DeviceComputer";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
