package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class clx extends hux {
    public static final Parcelable.Creator<clx> CREATOR;
    public static final clx c;
    public static final byte d;

    static {
        b180 b180VarB = i6p1.a;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Chain16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            long j = u7h.b;
            n6a1 n6a1Var = new n6a1(j);
            cwh0 cwh0VarQ = rjx.q(9.276f, 2.888f, -0.998f, 0.998f);
            cwh0VarQ.c(5.6f, 5.6f, false, false, -1.932f, -0.19f);
            cwh0VarQ.k(1.87f, -1.868f);
            cwh0VarQ.c(4.212f, 4.212f, false, true, 5.957f, 5.957f);
            cwh0VarQ.k(-1.969f, 1.968f);
            cwh0VarQ.c(4.212f, 4.212f, false, true, -6.769f, -1.138f);
            cwh0VarQ.j(5.8f, 8.25f);
            cwh0VarQ.c(1.38f, 1.38f, false, true, 0.934f, -0.403f);
            cwh0VarQ.c(2.712f, 2.712f, false, false, 4.41f, 0.845f);
            cwh0VarQ.k(1.969f, -1.968f);
            cwh0VarQ.c(2.712f, 2.712f, true, false, -3.836f, -3.836f);
            cwh0VarQ.e();
            a180.a(a180Var, cwh0VarQ.a, n6a1Var, 1.0f, 2, 1.0f);
            n6a1 n6a1Var2 = new n6a1(j);
            cwh0 cwh0VarQ2 = rjx.q(6.724f, 13.112f, 0.998f, -0.998f);
            cwh0VarQ2.c(5.6f, 5.6f, false, false, 1.932f, 0.19f);
            cwh0VarQ2.k(-1.87f, 1.869f);
            cwh0VarQ2.c(4.212f, 4.212f, false, true, -5.957f, -5.958f);
            cwh0VarQ2.k(1.969f, -1.968f);
            cwh0VarQ2.c(4.212f, 4.212f, false, true, 6.769f, 1.138f);
            cwh0VarQ2.k(-0.364f, 0.365f);
            cwh0VarQ2.c(1.37f, 1.37f, false, true, -0.934f, 0.403f);
            cwh0VarQ2.c(2.712f, 2.712f, false, false, -4.41f, -0.845f);
            cwh0VarQ2.j(2.888f, 9.276f);
            cwh0VarQ2.c(2.712f, 2.712f, true, false, 3.836f, 3.836f);
            a180.a(a180Var, cwh0VarQ2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            i6p1.a = b180VarB;
        }
        b180 b180VarB2 = j6p1.a;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Chain24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            long j2 = u7h.b;
            n6a1 n6a1Var3 = new n6a1(j2);
            cwh0 cwh0VarQ3 = rjx.q(13.78f, 4.582f, -1.469f, 1.47f);
            cwh0VarQ3.c(8.0f, 8.0f, false, false, -2.57f, -0.258f);
            cwh0VarQ3.k(2.626f, -2.626f);
            cwh0VarQ3.c(5.986f, 5.986f, false, true, 8.465f, 8.465f);
            cwh0VarQ3.k(-2.835f, 2.835f);
            cwh0VarQ3.c(5.986f, 5.986f, false, true, -9.63f, -1.643f);
            cwh0VarQ3.k(0.464f, -0.465f);
            cwh0VarQ3.g(0.351f, -0.35f, 0.8f, -0.543f, 1.26f, -0.576f);
            cwh0VarQ3.c(3.986f, 3.986f, false, false, 6.492f, 1.27f);
            cwh0VarQ3.k(2.835f, -2.835f);
            cwh0VarQ3.c(3.986f, 3.986f, true, false, -5.637f, -5.637f);
            cwh0VarQ3.e();
            a180.a(a180Var2, cwh0VarQ3.a, n6a1Var3, 1.0f, 2, 1.0f);
            n6a1 n6a1Var4 = new n6a1(j2);
            cwh0 cwh0VarQ4 = rjx.q(10.22f, 19.418f, 1.469f, -1.47f);
            cwh0VarQ4.g(0.84f, 0.225f, 1.708f, 0.311f, 2.57f, 0.258f);
            cwh0VarQ4.k(-2.626f, 2.626f);
            cwh0VarQ4.c(5.986f, 5.986f, true, true, -8.465f, -8.466f);
            cwh0VarQ4.k(2.835f, -2.834f);
            cwh0VarQ4.c(5.986f, 5.986f, false, true, 9.63f, 1.643f);
            cwh0VarQ4.k(-0.464f, 0.464f);
            cwh0VarQ4.c(1.97f, 1.97f, false, true, -1.26f, 0.577f);
            cwh0VarQ4.c(3.986f, 3.986f, false, false, -6.492f, -1.27f);
            cwh0VarQ4.k(-2.835f, 2.835f);
            cwh0VarQ4.c(3.986f, 3.986f, true, false, 5.637f, 5.637f);
            cwh0VarQ4.e();
            a180.a(a180Var2, cwh0VarQ4.a, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            j6p1.a = b180VarB2;
        }
        c = new clx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new ckx((byte) 25);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof clx);
    }

    public final int hashCode() {
        return -1488681332;
    }

    public final String toString() {
        return "Chain";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
