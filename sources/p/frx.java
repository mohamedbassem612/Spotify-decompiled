package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class frx extends hux {
    public static final Parcelable.Creator<frx> CREATOR;
    public static final frx c;

    static {
        b180 b180VarB = qyo1.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.PlaybackSpeed3x16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarQ = rjx.q(13.56f, 10.883f, 1.97f, -1.97f);
            cwh0VarQ.k(-1.06f, -1.06f);
            cwh0VarQ.k(-1.97f, 1.969f);
            cwh0VarQ.k(-1.97f, -1.97f);
            cwh0VarQ.k(-1.06f, 1.06f);
            cwh0VarQ.k(1.97f, 1.97f);
            cwh0VarQ.k(-1.97f, 1.97f);
            cwh0VarQ.k(1.06f, 1.06f);
            cwh0VarQ.k(1.97f, -1.969f);
            rjx.C(cwh0VarQ, 1.97f, 1.97f, 1.06f, -1.06f);
            cwh0VarQ.l(4.095f, 14.256f);
            cwh0VarQ.c(5.3f, 5.3f, false, true, -2.0f, -0.384f);
            cwh0VarQ.o(-0.93f, -0.4f, -1.344f, -0.912f);
            cwh0VarQ.v(-1.808f);
            cwh0VarQ.o(0.432f, 0.735f, 1.344f, 1.2f);
            cwh0VarQ.c(4.2f, 4.2f, false, false, 1.856f, 0.448f);
            cwh0VarQ.o(0.735f, 0.0f, 1.296f, -0.256f);
            cwh0VarQ.c(1.9f, 1.9f, false, false, 0.848f, -0.768f);
            cwh0VarQ.o(0.303f, -0.495f, 0.304f, -1.168f);
            cwh0VarQ.o(0.0f, -1.024f, -0.752f, -1.552f);
            cwh0VarQ.o(-0.737f, -0.544f, -2.336f, -0.544f);
            cwh0VarQ.i(-0.448f);
            cwh0VarQ.j(2.863f, 7.488f);
            cwh0VarQ.j(5.93f, 4.0f);
            cwh0VarQ.j(0.943f, 4.0f);
            rjx.B(cwh0VarQ, 0.943f, 2.64f, 6.704f, 1.44f);
            cwh0VarQ.j(4.67f, 7.441f);
            cwh0VarQ.o(1.54f, 0.162f, 2.4f, 0.991f);
            cwh0VarQ.o(0.927f, 0.864f, 0.928f, 2.288f);
            cwh0VarQ.o(0.0f, 0.96f, -0.496f, 1.776f);
            cwh0VarQ.c(3.6f, 3.6f, false, true, -1.392f, 1.28f);
            cwh0VarQ.o(-0.881f, 0.48f, -2.016f, 0.48f);
            cwh0VarQ.e();
            a180.a(a180Var, cwh0VarQ.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            qyo1.b = b180VarB;
        }
        b180 b180VarB2 = ryo1.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.PlaybackSpeed3x24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarQ2 = rjx.q(19.742f, 16.75f, 2.543f, -2.543f);
            cwh0VarQ2.k(-1.414f, -1.414f);
            cwh0VarQ2.k(-2.543f, 2.543f);
            cwh0VarQ2.k(-2.543f, -2.543f);
            cwh0VarQ2.k(-1.414f, 1.414f);
            cwh0VarQ2.k(2.543f, 2.543f);
            cwh0VarQ2.k(-2.543f, 2.543f);
            cwh0VarQ2.k(1.414f, 1.414f);
            cwh0VarQ2.k(2.543f, -2.543f);
            rjx.C(cwh0VarQ2, 2.543f, 2.543f, 1.414f, -1.414f);
            cwh0VarQ2.l(6.984f, 21.022f);
            cwh0VarQ2.o(-1.495f, 0.0f, -2.829f, -0.552f);
            cwh0VarQ2.o(-1.334f, -0.575f, -1.932f, -1.311f);
            cwh0VarQ2.v(-2.507f);
            cwh0VarQ2.o(0.62f, 1.057f, 1.91f, 1.725f);
            cwh0VarQ2.o(1.31f, 0.644f, 2.667f, 0.644f);
            cwh0VarQ2.o(1.081f, 0.0f, 1.886f, -0.391f);
            cwh0VarQ2.c(2.84f, 2.84f, false, false, 1.265f, -1.127f);
            cwh0VarQ2.o(0.437f, -0.736f, 0.437f, -1.702f);
            cwh0VarQ2.o(0.0f, -1.519f, -1.104f, -2.3f);
            cwh0VarQ2.o(-1.08f, -0.782f, -3.404f, -0.782f);
            cwh0VarQ2.i(-0.644f);
            cwh0VarQ2.v(-1.426f);
            cwh0VarQ2.k(4.478f, -5.106f);
            cwh0VarQ2.h(2.499f);
            cwh0VarQ2.u(4.324f);
            cwh0VarQ2.i(9.568f);
            cwh0VarQ2.v(1.978f);
            cwh0VarQ2.k(-4.326f, 4.923f);
            cwh0VarQ2.o(2.24f, 0.232f, 3.498f, 1.425f);
            cwh0VarQ2.o(1.334f, 1.242f, 1.334f, 3.289f);
            cwh0VarQ2.o(0.0f, 1.38f, -0.713f, 2.553f);
            cwh0VarQ2.o(-0.69f, 1.15f, -1.978f, 1.84f);
            cwh0VarQ2.o(-1.265f, 0.69f, -2.898f, 0.69f);
            a180.a(a180Var2, cwh0VarQ2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            ryo1.b = b180VarB2;
        }
        c = new frx(new dsx(b180VarB, b180VarB2), null);
        CREATOR = new dqx((byte) 27);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof frx);
    }

    public final int hashCode() {
        return 1506770076;
    }

    public final String toString() {
        return "PlaybackSpeed3x";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
