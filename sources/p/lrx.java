package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lrx extends hux {
    public static final Parcelable.Creator<lrx> CREATOR;
    public static final lrx c;
    public static final byte d;

    static {
        b180 b180VarB = c0p1.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.PodcastCreator16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            long j = u7h.b;
            n6a1 n6a1Var = new n6a1(j);
            cwh0 cwh0VarG = lf51.g(8.0f, 3.0f);
            cwh0VarG.c(3.0f, 3.0f, false, false, -3.0f, 3.0f);
            cwh0VarG.v(2.0f);
            cwh0VarG.c(3.0f, 3.0f, false, false, 6.0f, 0.0f);
            cwh0VarG.u(6.0f);
            cwh0VarG.c(3.0f, 3.0f, false, false, -3.0f, -3.0f);
            cwh0VarG.l(6.5f, 6.0f);
            cwh0VarG.c(1.5f, 1.5f, false, true, 3.0f, 0.0f);
            cwh0VarG.v(2.0f);
            cwh0VarG.c(1.5f, 1.5f, false, true, -3.0f, 0.0f);
            cwh0VarG.e();
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            n6a1 n6a1Var2 = new n6a1(j);
            cwh0 cwh0VarG2 = lf51.g(1.0f, 7.0f);
            cwh0VarG2.c(7.0f, 7.0f, true, true, 7.751f, 6.96f);
            cwh0VarG2.u(16.0f);
            cwh0VarG2.i(-1.5f);
            cwh0VarG2.v(-2.04f);
            cwh0VarG2.b(7.0f, 7.0f, false, true, 1.0f, 7.0f);
            cwh0VarG2.m(7.0f, -5.5f);
            cwh0VarG2.c(5.5f, 5.5f, true, false, 0.0f, 11.0f);
            cwh0VarG2.c(5.5f, 5.5f, false, false, 0.0f, -11.0f);
            a180.a(a180Var, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            c0p1.b = b180VarB;
        }
        b180 b180VarB2 = d0p1.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.PodcastCreator24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            long j2 = u7h.b;
            n6a1 n6a1Var3 = new n6a1(j2);
            cwh0 cwh0VarG3 = lf51.g(8.0f, 8.5f);
            cwh0VarG3.c(4.0f, 4.0f, true, true, 8.0f, 0.0f);
            cwh0VarG3.v(4.0f);
            cwh0VarG3.c(4.0f, 4.0f, false, true, -8.0f, 0.0f);
            cwh0VarG3.e();
            cwh0VarG3.l(12.0f, 6.5f);
            cwh0VarG3.c(2.0f, 2.0f, false, false, -2.0f, 2.0f);
            cwh0VarG3.v(4.0f);
            cwh0VarG3.c(2.0f, 2.0f, true, false, 4.0f, 0.0f);
            cwh0VarG3.v(-4.0f);
            cwh0VarG3.c(2.0f, 2.0f, false, false, -2.0f, -2.0f);
            a180.a(a180Var2, cwh0VarG3.a, n6a1Var3, 1.0f, 2, 1.0f);
            n6a1 n6a1Var4 = new n6a1(j2);
            cwh0 cwh0VarG4 = lf51.g(1.499f, 10.5f);
            cwh0VarG4.f(1.499f, 4.701f, 6.2f, 0.0f, 11.999f, 0.0f);
            cwh0VarG4.q(10.5f, 4.701f, 10.5f, 10.5f);
            cwh0VarG4.g(0.0f, 5.461f, -4.17f, 9.949f, -9.499f, 10.453f);
            cwh0VarG4.u(24.0f);
            cwh0VarG4.i(-2.0f);
            cwh0VarG4.v(-3.047f);
            cwh0VarG4.f(5.67f, 20.45f, 1.499f, 15.962f, 1.499f, 10.5f);
            cwh0VarG4.m(10.5f, -8.5f);
            cwh0VarG4.c(8.5f, 8.5f, true, false, 0.0f, 17.0f);
            cwh0VarG4.c(8.5f, 8.5f, false, false, 0.0f, -17.0f);
            a180.a(a180Var2, cwh0VarG4.a, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            d0p1.b = b180VarB2;
        }
        c = new lrx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new jrx((byte) 1);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof lrx);
    }

    public final int hashCode() {
        return -876622563;
    }

    public final String toString() {
        return "PodcastCreator";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
