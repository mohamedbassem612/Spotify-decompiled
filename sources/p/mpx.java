package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mpx extends hux {
    public static final Parcelable.Creator<mpx> CREATOR;
    public static final mpx c;
    public static final byte d;

    static {
        b180 b180VarB = blo1.c;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Offline16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(1.665f, 15.226f);
            cwh0VarG.c(0.67f, 0.67f, false, false, 0.915f, -0.245f);
            cwh0VarG.k(7.675f, -13.292f);
            cwh0VarG.c(0.67f, 0.67f, true, false, -1.161f, -0.67f);
            cwh0VarG.j(7.95f, 3.0f);
            cwh0VarG.j(5.0f, 3.0f);
            cwh0VarG.c(5.0f, 5.0f, false, false, -2.453f, 9.358f);
            cwh0VarG.j(1.42f, 14.31f);
            cwh0VarG.c(0.67f, 0.67f, false, false, 0.245f, 0.915f);
            cwh0VarG.e();
            cwh0VarG.l(3.297f, 11.059f);
            cwh0VarG.b(3.5f, 3.5f, false, true, 5.0f, 4.5f);
            rjx.t(cwh0VarG, 2.084f, 5.665f, 15.226f);
            cwh0VarG.c(0.67f, 0.67f, false, false, 0.915f, -0.245f);
            cwh0VarG.j(7.724f, 13.0f);
            cwh0VarG.j(11.0f, 13.0f);
            cwh0VarG.c(5.0f, 5.0f, false, false, 2.203f, -9.49f);
            cwh0VarG.k(1.052f, -1.82f);
            cwh0VarG.c(0.67f, 0.67f, true, false, -1.161f, -0.671f);
            cwh0VarG.j(5.42f, 14.311f);
            cwh0VarG.c(0.67f, 0.67f, false, false, 0.245f, 0.915f);
            cwh0VarG.l(12.45f, 4.814f);
            cwh0VarG.b(3.501f, 3.501f, false, true, 11.0f, 11.5f);
            cwh0VarG.j(8.59f, 11.5f);
            cwh0VarG.e();
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            blo1.c = b180VarB;
        }
        b180 b180VarB2 = flo1.e;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Offline24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(14.86f, 1.589f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 0.366f, 1.366f);
            cwh0VarG2.j(4.204f, 22.045f);
            cwh0VarG2.c(1.0f, 1.0f, true, true, -1.732f, -1.0f);
            cwh0VarG2.k(1.74f, -3.013f);
            cwh0VarG2.b(7.0f, 7.0f, false, true, 7.764f, 5.0f);
            cwh0VarG2.i(3.97f);
            cwh0VarG2.k(1.758f, -3.045f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 1.367f, -0.366f);
            hrt.o(cwh0VarG2, 10.58f, 6.999f, 7.766f, 6.999f);
            cwh0VarG2.b(5.0f, 5.0f, false, false, 5.21f, 16.3f);
            rjx.u(cwh0VarG2, 10.58f, 7.0f, 21.162f, 1.589f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 0.366f, 1.366f);
            cwh0VarG2.k(-1.74f, 3.013f);
            cwh0VarG2.b(7.0f, 7.0f, false, true, 16.236f, 19.0f);
            cwh0VarG2.i(-3.97f);
            cwh0VarG2.k(-1.758f, 3.045f);
            cwh0VarG2.c(1.0f, 1.0f, true, true, -1.733f, -1.0f);
            cwh0VarG2.k(11.022f, -19.09f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 1.366f, -0.366f);
            cwh0VarG2.e();
            cwh0VarG2.l(13.419f, 16.999f);
            cwh0VarG2.i(2.816f);
            cwh0VarG2.c(5.0f, 5.0f, false, false, 2.554f, -9.3f);
            cwh0VarG2.e();
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            flo1.e = b180VarB2;
        }
        c = new mpx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new yox((byte) 13);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof mpx);
    }

    public final int hashCode() {
        return 1608906478;
    }

    public final String toString() {
        return "Offline";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
