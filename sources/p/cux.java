package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cux extends hux {
    public static final Parcelable.Creator<cux> CREATOR;
    public static final cux c;
    public static final byte d;

    static {
        b180 b180VarB = c680.c;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Watch16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarQ = rjx.q(4.347f, 1.122f, -0.403f, 1.899f);
            cwh0VarQ.b(2.25f, 2.25f, false, false, 2.0f, 5.25f);
            cwh0VarQ.v(5.5f);
            cwh0VarQ.c(2.25f, 2.25f, false, false, 1.944f, 2.23f);
            cwh0VarQ.k(0.403f, 1.898f);
            cwh0VarQ.g(0.14f, 0.654f, 0.717f, 1.122f, 1.386f, 1.122f);
            cwh0VarQ.i(4.535f);
            cwh0VarQ.g(0.668f, 0.0f, 1.246f, -0.468f, 1.385f, -1.122f);
            cwh0VarQ.k(0.404f, -1.899f);
            cwh0VarQ.b(2.25f, 2.25f, false, false, 14.0f, 10.75f);
            cwh0VarQ.v(-5.5f);
            cwh0VarQ.c(2.25f, 2.25f, false, false, -1.943f, -2.23f);
            cwh0VarQ.k(-0.404f, -1.898f);
            cwh0VarQ.b(1.42f, 1.42f, false, false, 10.267f, 0.0f);
            cwh0VarQ.h(5.734f);
            cwh0VarQ.g(-0.67f, 0.0f, -1.247f, 0.468f, -1.386f, 1.122f);
            cwh0VarQ.e();
            cwh0VarQ.l(5.8f, 1.5f);
            cwh0VarQ.i(4.4f);
            cwh0VarQ.k(0.319f, 1.5f);
            cwh0VarQ.h(5.48f);
            cwh0VarQ.e();
            cwh0VarQ.l(10.52f, 13.0f);
            cwh0VarQ.k(-0.319f, 1.5f);
            cwh0VarQ.h(5.8f);
            cwh0VarQ.j(5.481f, 13.0f);
            cwh0VarQ.e();
            cwh0VarQ.l(4.25f, 4.5f);
            cwh0VarQ.i(7.5f);
            cwh0VarQ.c(0.75f, 0.75f, false, true, 0.75f, 0.75f);
            cwh0VarQ.v(5.5f);
            cwh0VarQ.c(0.75f, 0.75f, false, true, -0.75f, 0.75f);
            cwh0VarQ.i(-7.5f);
            cwh0VarQ.c(0.75f, 0.75f, false, true, -0.75f, -0.75f);
            cwh0VarQ.v(-5.5f);
            cwh0VarQ.c(0.75f, 0.75f, false, true, 0.75f, -0.75f);
            a180.a(a180Var, cwh0VarQ.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            c680.c = b180VarB;
        }
        b180 b180VarB2 = tm80.c;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Watch24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(6.916f, 1.584f);
            cwh0VarG.b(2.0f, 2.0f, false, true, 8.873f, 0.0f);
            cwh0VarG.i(6.4f);
            cwh0VarG.c(2.0f, 2.0f, false, true, 1.957f, 1.584f);
            cwh0VarG.k(0.761f, 3.584f);
            cwh0VarG.b(3.0f, 3.0f, false, true, 20.0f, 8.0f);
            cwh0VarG.v(8.0f);
            cwh0VarG.c(3.0f, 3.0f, false, true, -2.009f, 2.832f);
            cwh0VarG.k(-0.761f, 3.584f);
            cwh0VarG.b(2.0f, 2.0f, false, true, 15.273f, 24.0f);
            cwh0VarG.i(-6.4f);
            cwh0VarG.c(2.0f, 2.0f, false, true, -1.957f, -1.584f);
            cwh0VarG.k(-0.75f, -3.534f);
            cwh0VarG.b(3.0f, 3.0f, false, true, 4.0f, 16.0f);
            cwh0VarG.j(4.0f, 8.0f);
            cwh0VarG.g(0.0f, -1.367f, 0.915f, -2.52f, 2.165f, -2.882f);
            cwh0VarG.e();
            cwh0VarG.l(8.235f, 5.0f);
            cwh0VarG.i(7.676f);
            cwh0VarG.k(-0.637f, -3.0f);
            cwh0VarG.j(8.873f, 2.0f);
            cwh0VarG.e();
            cwh0VarG.l(8.235f, 19.0f);
            cwh0VarG.j(8.873f, 22.0f);
            cwh0VarG.i(6.4f);
            cwh0VarG.k(0.638f, -3.0f);
            cwh0VarG.e();
            cwh0VarG.l(7.0f, 7.0f);
            cwh0VarG.c(1.0f, 1.0f, false, false, -1.0f, 1.0f);
            cwh0VarG.v(8.0f);
            cwh0VarG.c(1.0f, 1.0f, false, false, 1.0f, 1.0f);
            cwh0VarG.i(10.0f);
            cwh0VarG.c(1.0f, 1.0f, false, false, 1.0f, -1.0f);
            cwh0VarG.j(18.0f, 8.0f);
            cwh0VarG.c(1.0f, 1.0f, false, false, -1.0f, -1.0f);
            cwh0VarG.e();
            a180.a(a180Var2, cwh0VarG.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            tm80.c = b180VarB2;
        }
        c = new cux(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new utx((byte) 7);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof cux);
    }

    public final int hashCode() {
        return -1470401382;
    }

    public final String toString() {
        return "Watch";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
