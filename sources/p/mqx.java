package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mqx extends hux {
    public static final Parcelable.Creator<mqx> CREATOR;
    public static final mqx c;

    static {
        b180 b180VarB = pto1.a;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.PlaybackSpeed1Point7x16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarQ = rjx.q(13.34f, 12.5f, 1.969f, -1.97f);
            cwh0VarQ.k(-1.06f, -1.06f);
            cwh0VarQ.k(-1.97f, 1.97f);
            cwh0VarQ.k(-1.97f, -1.97f);
            cwh0VarQ.k(-1.06f, 1.06f);
            cwh0VarQ.k(1.969f, 1.97f);
            cwh0VarQ.k(-1.97f, 1.97f);
            cwh0VarQ.k(1.06f, 1.06f);
            cwh0VarQ.k(1.97f, -1.97f);
            cwh0VarQ.k(1.97f, 1.97f);
            rjx.C(cwh0VarQ, 1.06f, -1.06f, -1.969f, -1.97f);
            cwh0VarQ.l(11.34f, 8.0f);
            cwh0VarQ.c(8.0f, 8.0f, false, true, 0.39f, -2.15f);
            cwh0VarQ.c(10.0f, 10.0f, false, true, 0.91f, -2.05f);
            cwh0VarQ.c(8.3f, 8.3f, false, true, 1.23f, -1.63f);
            rjx.w(cwh0VarQ, -2.62f, 0.97f, 9.96f, 3.14f);
            rjx.B(cwh0VarQ, 9.96f, 0.9f, 5.34f, 1.31f);
            cwh0VarQ.c(8.3f, 8.3f, false, false, -1.61f, 2.55f);
            cwh0VarQ.o(-0.6f, 1.46f, -0.66f, 3.24f);
            cwh0VarQ.e();
            cwh0VarQ.l(9.132f, 8.1f);
            cwh0VarQ.c(1.0f, 1.0f, false, true, -0.46f, -0.11f);
            cwh0VarQ.c(1.0f, 1.0f, false, true, -0.34f, -0.31f);
            cwh0VarQ.c(0.84f, 0.84f, false, true, -0.12f, -0.44f);
            cwh0VarQ.o(0.0f, -0.24f, 0.12f, -0.43f);
            cwh0VarQ.c(0.9f, 0.9f, false, true, 0.34f, -0.3f);
            cwh0VarQ.c(0.9f, 0.9f, false, true, 0.46f, -0.12f);
            cwh0VarQ.o(0.25f, 0.0f, 0.46f, 0.12f);
            cwh0VarQ.c(0.84f, 0.84f, false, true, 0.33f, 0.3f);
            cwh0VarQ.o(0.12f, 0.19f, 0.12f, 0.43f);
            cwh0VarQ.o(0.0f, 0.23f, -0.12f, 0.43f);
            cwh0VarQ.c(0.9f, 0.9f, false, true, -0.33f, 0.32f);
            cwh0VarQ.c(1.0f, 1.0f, false, true, -0.46f, 0.11f);
            cwh0VarQ.m(-3.435f, -5.0f);
            cwh0VarQ.i(-1.72f);
            cwh0VarQ.j(3.977f, 2.07f);
            cwh0VarQ.o(0.94f, -0.06f, 1.37f, -0.34f);
            cwh0VarQ.s(0.54f, -0.83f);
            cwh0VarQ.i(1.26f);
            cwh0VarQ.j(7.147f, 8.0f);
            cwh0VarQ.i(-1.45f);
            cwh0VarQ.e();
            a180.a(a180Var, cwh0VarQ.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            pto1.a = b180VarB;
        }
        b180 b180VarB2 = sto1.a;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.PlaybackSpeed1Point7x24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarQ2 = rjx.q(19.5f, 19.14f, 2.542f, -2.543f);
            cwh0VarQ2.k(-1.414f, -1.414f);
            cwh0VarQ2.k(-2.543f, 2.543f);
            cwh0VarQ2.k(-2.543f, -2.543f);
            cwh0VarQ2.k(-1.414f, 1.414f);
            cwh0VarQ2.k(2.543f, 2.543f);
            cwh0VarQ2.k(-2.543f, 2.543f);
            cwh0VarQ2.k(1.414f, 1.414f);
            cwh0VarQ2.k(2.543f, -2.543f);
            rjx.C(cwh0VarQ2, 2.543f, 2.543f, 1.414f, -1.414f);
            cwh0VarQ2.l(15.936f, 12.367f);
            cwh0VarQ2.o(0.064f, -1.728f, 0.624f, -3.504f);
            cwh0VarQ2.c(16.6f, 16.6f, false, true, 1.456f, -3.328f);
            cwh0VarQ2.n(18.913f, 3.984f, 20.0f, 2.847f);
            rjx.s(cwh0VarQ2, -4.432f, 15.568f, 4.4f, -1.856f);
            rjx.B(cwh0VarQ2, 13.712f, 1.007f, 8.352f, 1.888f);
            cwh0VarQ2.o(-1.632f, 1.776f, -2.624f, 4.192f);
            cwh0VarQ2.s(-1.088f, 5.28f);
            cwh0VarQ2.e();
            cwh0VarQ2.l(12.416f, 12.527f);
            cwh0VarQ2.o(-0.368f, 0.0f, -0.688f, -0.16f);
            cwh0VarQ2.c(1.4f, 1.4f, false, true, -0.512f, -0.464f);
            cwh0VarQ2.c(1.3f, 1.3f, false, true, -0.176f, -0.672f);
            cwh0VarQ2.o(0.0f, -0.352f, 0.176f, -0.64f);
            cwh0VarQ2.o(0.192f, -0.288f, 0.512f, -0.448f);
            cwh0VarQ2.c(1.41f, 1.41f, false, true, 1.36f, 0.0f);
            cwh0VarQ2.o(0.304f, 0.16f, 0.48f, 0.448f);
            cwh0VarQ2.o(0.192f, 0.288f, 0.192f, 0.64f);
            cwh0VarQ2.s(-0.192f, 0.656f);
            cwh0VarQ2.c(1.3f, 1.3f, false, true, -0.48f, 0.48f);
            cwh0VarQ2.c(1.4f, 1.4f, false, true, -0.672f, 0.16f);
            cwh0VarQ2.l(7.14f, 4.351f);
            cwh0VarQ2.j(4.388f, 4.351f);
            cwh0VarQ2.j(4.388f, 2.895f);
            cwh0VarQ2.o(1.488f, -0.096f, 2.16f, -0.544f);
            cwh0VarQ2.o(0.69f, -0.463f, 0.848f, -1.344f);
            rjx.A(cwh0VarQ2, 1.808f, 11.36f, 7.14f, 12.367f);
            a180.a(a180Var2, cwh0VarQ2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            sto1.a = b180VarB2;
        }
        c = new mqx(new dsx(b180VarB, b180VarB2), null);
        CREATOR = new dqx((byte) 8);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof mqx);
    }

    public final int hashCode() {
        return -214415369;
    }

    public final String toString() {
        return "PlaybackSpeed1Point7x";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
