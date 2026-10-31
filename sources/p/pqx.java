package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pqx extends hux {
    public static final Parcelable.Creator<pqx> CREATOR;
    public static final pqx c;

    static {
        b180 b180VarB = cuo1.a;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.PlaybackSpeed1x16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarQ = rjx.q(12.54f, 10.383f, 1.97f, -1.97f);
            cwh0VarQ.k(-1.061f, -1.06f);
            cwh0VarQ.k(-1.97f, 1.969f);
            cwh0VarQ.k(-1.97f, -1.97f);
            cwh0VarQ.k(-1.06f, 1.06f);
            cwh0VarQ.k(1.97f, 1.97f);
            cwh0VarQ.k(-1.97f, 1.97f);
            cwh0VarQ.k(1.06f, 1.06f);
            cwh0VarQ.k(1.97f, -1.969f);
            rjx.C(cwh0VarQ, 1.97f, 1.97f, 1.06f, -1.06f);
            cwh0VarQ.l(1.842f, 5.1f);
            cwh0VarQ.u(4.06f);
            cwh0VarQ.o(1.36f, -0.08f, 2.032f, -0.56f);
            cwh0VarQ.o(0.688f, -0.48f, 0.864f, -1.36f);
            cwh0VarQ.i(1.248f);
            cwh0VarQ.u(13.5f);
            cwh0VarQ.h(4.482f);
            cwh0VarQ.u(5.1f);
            cwh0VarQ.e();
            a180.a(a180Var, cwh0VarQ.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            cuo1.a = b180VarB;
        }
        b180 b180VarB2 = fuo1.a;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.PlaybackSpeed1x24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarQ2 = rjx.q(18.227f, 16.25f, 2.542f, -2.543f);
            cwh0VarQ2.k(-1.414f, -1.414f);
            cwh0VarQ2.k(-2.543f, 2.543f);
            cwh0VarQ2.k(-2.543f, -2.543f);
            cwh0VarQ2.k(-1.414f, 1.414f);
            cwh0VarQ2.k(2.543f, 2.543f);
            cwh0VarQ2.k(-2.543f, 2.543f);
            cwh0VarQ2.k(1.414f, 1.414f);
            cwh0VarQ2.k(2.543f, -2.543f);
            rjx.C(cwh0VarQ2, 2.543f, 2.543f, 1.414f, -1.414f);
            cwh0VarQ2.l(3.194f, 8.01f);
            cwh0VarQ2.u(6.584f);
            cwh0VarQ2.o(1.933f, -0.115f, 2.92f, -0.805f);
            cwh0VarQ2.o(0.99f, -0.69f, 1.243f, -1.955f);
            cwh0VarQ2.i(1.702f);
            cwh0VarQ2.v(16.33f);
            cwh0VarQ2.i(-2.07f);
            cwh0VarQ2.u(8.01f);
            cwh0VarQ2.e();
            a180.a(a180Var2, cwh0VarQ2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            fuo1.a = b180VarB2;
        }
        c = new pqx(new dsx(b180VarB, b180VarB2), null);
        CREATOR = new dqx((byte) 11);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof pqx);
    }

    public final int hashCode() {
        return 1506770014;
    }

    public final String toString() {
        return "PlaybackSpeed1x";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
