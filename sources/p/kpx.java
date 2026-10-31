package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kpx extends hux {
    public static final Parcelable.Creator<kpx> CREATOR;
    public static final kpx c;
    public static final byte d;

    static {
        b180 b180VarB = ujo1.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.NotificationsOff16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(13.388f, 4.4f);
            cwh0VarG.o(0.11f, 0.541f, 0.112f, 1.1f);
            cwh0VarG.v(3.067f);
            cwh0VarG.k(2.193f, 3.809f);
            cwh0VarG.c(0.752f, 0.752f, false, true, -0.65f, 1.124f);
            cwh0VarG.h(10.5f);
            cwh0VarG.c(2.5f, 2.5f, false, true, -5.0f, 0.0f);
            cwh0VarG.h(4.29f);
            cwh0VarG.k(1.5f, -1.5f);
            cwh0VarG.i(7.955f);
            cwh0VarG.j(12.1f, 9.142f);
            cwh0VarG.c(0.75f, 0.75f, false, true, -0.1f, -0.374f);
            cwh0VarG.u(5.789f);
            cwh0VarG.e();
            cwh0VarG.l(7.0f, 13.5f);
            cwh0VarG.c(1.0f, 1.0f, false, false, 2.0f, 0.0f);
            cwh0VarG.e();
            cwh0VarG.l(8.0f, 0.0f);
            cwh0VarG.c(5.5f, 5.5f, false, true, 3.544f, 1.295f);
            cwh0VarG.j(12.609f, 0.23f);
            cwh0VarG.c(0.75f, 0.75f, true, true, 1.06f, 1.061f);
            cwh0VarG.j(1.282f, 13.68f);
            cwh0VarG.b(0.75f, 0.75f, false, true, 0.22f, 12.62f);
            cwh0VarG.c(0.8f, 0.8f, false, true, 0.088f, -0.244f);
            cwh0VarG.j(2.5f, 8.569f);
            cwh0VarG.u(5.5f);
            cwh0VarG.b(5.5f, 5.5f, false, true, 8.0f, 0.0f);
            cwh0VarG.m(0.0f, 1.5f);
            cwh0VarG.c(4.0f, 4.0f, false, false, -4.0f, 4.0f);
            cwh0VarG.v(3.27f);
            cwh0VarG.o(0.0f, 0.038f, -0.006f, 0.075f);
            cwh0VarG.k(6.483f, -6.484f);
            cwh0VarG.b(4.0f, 4.0f, false, false, 8.0f, 1.5f);
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            ujo1.b = b180VarB;
        }
        b180 b180VarB2 = dko1.a;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.NotificationsOff24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(19.265f, 6.697f);
            cwh0VarG2.g(0.146f, 0.587f, 0.223f, 1.194f, 0.223f, 1.809f);
            cwh0VarG2.v(5.342f);
            cwh0VarG2.k(3.546f, 6.158f);
            cwh0VarG2.i(-7.582f);
            cwh0VarG2.c(3.499f, 3.499f, true, true, -6.929f, 0.0f);
            cwh0VarG2.j(5.957f, 20.006f);
            cwh0VarG2.k(2.0f, -2.0f);
            cwh0VarG2.i(11.618f);
            cwh0VarG2.k(-2.087f, -3.623f);
            cwh0VarG2.j(17.488f, 8.506f);
            cwh0VarG2.k(-0.002f, -0.03f);
            cwh0VarG2.e();
            cwh0VarG2.l(10.573f, 20.006f);
            cwh0VarG2.c(1.5f, 1.5f, true, false, 2.83f, 0.0f);
            cwh0VarG2.e();
            cwh0VarG2.l(19.299f, 0.293f);
            cwh0VarG2.c(1.001f, 1.001f, false, true, 1.415f, 1.414f);
            cwh0VarG2.k(-2.549f, 2.548f);
            cwh0VarG2.k(0.003f, 0.004f);
            cwh0VarG2.k(-1.447f, 1.447f);
            cwh0VarG2.k(-0.002f, -0.005f);
            cwh0VarG2.j(4.415f, 18.006f);
            cwh0VarG2.i(0.007f);
            cwh0VarG2.k(-2.0f, 2.0f);
            cwh0VarG2.i(-0.007f);
            cwh0VarG2.k(-0.708f, 0.708f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, -1.414f, -1.415f);
            cwh0VarG2.k(2.492f, -2.493f);
            cwh0VarG2.k(1.703f, -2.956f);
            cwh0VarG2.j(4.488f, 8.506f);
            cwh0VarG2.c(7.5f, 7.5f, false, true, 7.5f, -7.5f);
            cwh0VarG2.g(1.775f, 0.0f, 3.484f, 0.63f, 4.831f, 1.766f);
            cwh0VarG2.e();
            cwh0VarG2.l(11.989f, 3.006f);
            cwh0VarG2.c(5.5f, 5.5f, false, false, -5.5f, 5.5f);
            cwh0VarG2.v(4.598f);
            cwh0VarG2.k(8.91f, -8.912f);
            cwh0VarG2.c(5.5f, 5.5f, false, false, -3.41f, -1.186f);
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            dko1.a = b180VarB2;
        }
        c = new kpx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new yox((byte) 11);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof kpx);
    }

    public final int hashCode() {
        return 73771708;
    }

    public final String toString() {
        return "NotificationsOff";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
