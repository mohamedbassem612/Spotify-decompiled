package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class trx extends hux {
    public static final Parcelable.Creator<trx> CREATOR;
    public static final trx c;

    static {
        b180 b180VarB;
        b180 b180Var = u1p1.b;
        if (b180Var != null) {
            b180VarB = b180Var;
        } else {
            a180 a180Var = new a180("Encore.Vector.Radio16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            long j = u7h.b;
            n6a1 n6a1Var = new n6a1(j);
            cwh0 cwh0VarG = lf51.g(5.624f, 3.886f);
            cwh0VarG.b(4.75f, 4.75f, false, false, 3.25f, 8.0f);
            cwh0VarG.g(0.0f, 1.758f, 0.955f, 3.293f, 2.375f, 4.114f);
            cwh0VarG.k(0.75f, -1.3f);
            cwh0VarG.c(3.249f, 3.249f, false, true, 0.0f, -5.63f);
            rjx.y(cwh0VarG, -0.75f, -1.298f, 9.625f, 5.185f);
            cwh0VarG.j(10.375f, 3.885f);
            cwh0VarG.b(4.75f, 4.75f, false, true, 12.75f, 8.0f);
            cwh0VarG.c(4.75f, 4.75f, false, true, -2.375f, 4.114f);
            cwh0VarG.k(-0.75f, -1.3f);
            cwh0VarG.c(3.249f, 3.249f, false, false, 0.0f, -5.63f);
            cwh0VarG.e();
            cwh0VarG.l(8.0f, 6.545f);
            cwh0VarG.c(1.455f, 1.455f, true, false, 0.0f, 2.91f);
            cwh0VarG.c(1.455f, 1.455f, false, false, 0.0f, -2.91f);
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            n6a1 n6a1Var2 = new n6a1(j);
            cwh0 cwh0VarG2 = lf51.g(4.0f, 1.07f);
            cwh0VarG2.b(8.0f, 8.0f, false, false, 0.0f, 8.0f);
            cwh0VarG2.c(8.0f, 8.0f, false, false, 4.0f, 6.93f);
            cwh0VarG2.k(0.75f, -1.3f);
            cwh0VarG2.b(6.5f, 6.5f, false, true, 1.5f, 8.0f);
            cwh0VarG2.c(6.5f, 6.5f, false, true, 3.25f, -5.63f);
            hrt.o(cwh0VarG2, 11.25f, 2.37f, 12.0f, 1.07f);
            cwh0VarG2.b(8.0f, 8.0f, false, true, 16.0f, 8.0f);
            cwh0VarG2.c(8.0f, 8.0f, false, true, -3.999f, 6.93f);
            cwh0VarG2.k(-0.75f, -1.3f);
            cwh0VarG2.b(6.5f, 6.5f, false, false, 14.5f, 8.0f);
            cwh0VarG2.c(6.5f, 6.5f, false, false, -3.25f, -5.63f);
            a180.a(a180Var, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            u1p1.b = b180VarB;
        }
        b180 b180VarB2 = v1p1.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Radio24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            long j2 = u7h.b;
            n6a1 n6a1Var3 = new n6a1(j2);
            cwh0 cwh0VarG3 = lf51.g(8.75f, 6.37f);
            cwh0VarG3.b(6.5f, 6.5f, false, false, 5.5f, 12.0f);
            cwh0VarG3.c(6.5f, 6.5f, false, false, 3.25f, 5.63f);
            cwh0VarG3.k(1.0f, -1.732f);
            cwh0VarG3.b(4.5f, 4.5f, false, true, 7.5f, 12.0f);
            cwh0VarG3.c(4.5f, 4.5f, false, true, 2.25f, -3.898f);
            hrt.o(cwh0VarG3, 14.25f, 8.102f, 15.25f, 6.37f);
            cwh0VarG3.b(6.5f, 6.5f, false, true, 18.5f, 12.0f);
            cwh0VarG3.c(6.5f, 6.5f, false, true, -3.25f, 5.63f);
            cwh0VarG3.k(-1.0f, -1.732f);
            cwh0VarG3.b(4.5f, 4.5f, false, false, 16.5f, 12.0f);
            cwh0VarG3.c(4.5f, 4.5f, false, false, -2.25f, -3.898f);
            cwh0VarG3.l(12.0f, 10.0f);
            cwh0VarG3.c(2.0f, 2.0f, true, false, 0.0f, 4.0f);
            cwh0VarG3.c(2.0f, 2.0f, false, false, 0.0f, -4.0f);
            a180.a(a180Var2, cwh0VarG3.a, n6a1Var3, 1.0f, 2, 1.0f);
            n6a1 n6a1Var4 = new n6a1(j2);
            cwh0 cwh0VarG4 = lf51.g(6.499f, 2.472f);
            cwh0VarG4.b(11.0f, 11.0f, false, false, 1.0f, 12.0f);
            cwh0VarG4.g(0.0f, 4.071f, 2.212f, 7.626f, 5.499f, 9.528f);
            cwh0VarG4.k(1.0f, -1.732f);
            cwh0VarG4.b(9.0f, 9.0f, false, true, 3.0f, 12.0f);
            cwh0VarG4.g(0.0f, -3.33f, 1.81f, -6.24f, 4.5f, -7.795f);
            hrt.o(cwh0VarG4, 16.501f, 4.204f, 17.501f, 2.472f);
            cwh0VarG4.b(11.0f, 11.0f, false, true, 23.0f, 12.0f);
            cwh0VarG4.g(0.0f, 4.071f, -2.212f, 7.626f, -5.499f, 9.528f);
            cwh0VarG4.k(-1.0f, -1.732f);
            cwh0VarG4.b(9.0f, 9.0f, false, false, 21.0f, 12.0f);
            cwh0VarG4.g(0.0f, -3.33f, -1.81f, -6.24f, -4.5f, -7.796f);
            cwh0VarG4.e();
            a180.a(a180Var2, cwh0VarG4.a, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            v1p1.b = b180VarB2;
        }
        dsx dsxVar = new dsx(b180VarB, b180VarB2);
        b180 b180VarB3 = x1p1.b;
        if (b180VarB3 == null) {
            a180 a180Var3 = new a180("Encore.Vector.RadioActive16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i3 = bui1.a;
            n6a1 n6a1Var5 = new n6a1(u7h.b);
            cwh0 cwh0VarG5 = lf51.g(0.0f, 8.0f);
            cwh0VarG5.c(8.0f, 8.0f, true, false, 16.0f, 0.0f);
            cwh0VarG5.b(8.0f, 8.0f, false, false, 0.0f, 8.0f);
            cwh0VarG5.m(11.376f, -5.847f);
            cwh0VarG5.b(6.75f, 6.75f, false, true, 14.75f, 8.0f);
            cwh0VarG5.c(6.75f, 6.75f, false, true, -3.374f, 5.847f);
            cwh0VarG5.k(-0.75f, -1.3f);
            cwh0VarG5.b(5.25f, 5.25f, false, false, 13.25f, 8.0f);
            cwh0VarG5.c(5.25f, 5.25f, false, false, -2.625f, -4.547f);
            cwh0VarG5.e();
            cwh0VarG5.l(1.25f, 8.0f);
            cwh0VarG5.c(6.75f, 6.75f, false, true, 3.374f, -5.847f);
            cwh0VarG5.k(0.75f, 1.3f);
            cwh0VarG5.b(5.25f, 5.25f, false, false, 2.75f, 8.0f);
            cwh0VarG5.c(5.25f, 5.25f, false, false, 2.624f, 4.547f);
            cwh0VarG5.k(-0.75f, 1.3f);
            cwh0VarG5.b(6.75f, 6.75f, false, true, 1.25f, 8.0f);
            cwh0VarG5.m(2.5f, 0.0f);
            cwh0VarG5.g(0.0f, -1.573f, 0.854f, -2.946f, 2.124f, -3.681f);
            cwh0VarG5.k(0.75f, 1.299f);
            cwh0VarG5.c(2.749f, 2.749f, false, false, 0.0f, 4.764f);
            cwh0VarG5.k(-0.75f, 1.299f);
            cwh0VarG5.b(4.25f, 4.25f, false, true, 3.75f, 8.0f);
            cwh0VarG5.m(5.625f, -2.382f);
            cwh0VarG5.k(0.75f, -1.3f);
            cwh0VarG5.b(4.25f, 4.25f, false, true, 12.25f, 8.0f);
            cwh0VarG5.c(4.25f, 4.25f, false, true, -2.125f, 3.681f);
            cwh0VarG5.k(-0.75f, -1.3f);
            cwh0VarG5.c(2.749f, 2.749f, false, false, 0.0f, -4.763f);
            cwh0VarG5.l(6.545f, 8.0f);
            cwh0VarG5.c(1.455f, 1.455f, true, true, 2.91f, 0.0f);
            cwh0VarG5.c(1.455f, 1.455f, false, true, -2.91f, 0.0f);
            a180.a(a180Var3, cwh0VarG5.a, n6a1Var5, 1.0f, 2, 1.0f);
            b180VarB3 = a180Var3.b();
            x1p1.b = b180VarB3;
        }
        b180 b180VarB4 = z1p1.b;
        if (b180VarB4 == null) {
            a180 a180Var4 = new a180("Encore.Vector.RadioActive24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i4 = bui1.a;
            n6a1 n6a1Var6 = new n6a1(u7h.b);
            cwh0 cwh0VarG6 = lf51.g(23.0f, 12.0f);
            cwh0VarG6.g(0.0f, -6.075f, -4.925f, -11.0f, -11.0f, -11.0f);
            cwh0VarG6.p(1.0f, 5.925f, 1.0f, 12.0f);
            cwh0VarG6.q(4.925f, 11.0f, 11.0f, 11.0f);
            cwh0VarG6.q(11.0f, -4.925f, 11.0f, -11.0f);
            cwh0VarG6.l(3.0f, 12.0f);
            cwh0VarG6.g(0.0f, -3.331f, 1.81f, -6.24f, 4.5f, -7.796f);
            cwh0VarG6.k(1.0f, 1.733f);
            cwh0VarG6.b(7.0f, 7.0f, false, false, 5.0f, 12.0f);
            cwh0VarG6.c(7.0f, 7.0f, false, false, 3.5f, 6.063f);
            cwh0VarG6.k(-1.0f, 1.733f);
            cwh0VarG6.b(9.0f, 9.0f, false, true, 3.0f, 12.0f);
            cwh0VarG6.m(13.5f, -7.795f);
            cwh0VarG6.b(9.0f, 9.0f, false, true, 21.0f, 12.0f);
            cwh0VarG6.g(0.0f, 3.33f, -1.81f, 6.24f, -4.5f, 7.795f);
            cwh0VarG6.k(-1.0f, -1.732f);
            cwh0VarG6.b(7.0f, 7.0f, false, false, 19.0f, 12.0f);
            cwh0VarG6.c(7.0f, 7.0f, false, false, -3.5f, -6.063f);
            cwh0VarG6.e();
            cwh0VarG6.l(6.75f, 12.0f);
            cwh0VarG6.c(5.25f, 5.25f, false, true, 2.624f, -4.547f);
            cwh0VarG6.k(1.0f, 1.732f);
            cwh0VarG6.c(3.249f, 3.249f, false, false, 0.0f, 5.63f);
            cwh0VarG6.k(-1.0f, 1.732f);
            cwh0VarG6.b(5.25f, 5.25f, false, true, 6.75f, 12.0f);
            cwh0VarG6.m(6.875f, -2.815f);
            cwh0VarG6.k(1.0f, -1.732f);
            cwh0VarG6.b(5.25f, 5.25f, false, true, 17.25f, 12.0f);
            cwh0VarG6.c(5.25f, 5.25f, false, true, -2.625f, 4.548f);
            cwh0VarG6.k(-1.0f, -1.733f);
            cwh0VarG6.c(3.249f, 3.249f, false, false, 0.0f, -5.63f);
            cwh0VarG6.l(10.5f, 12.0f);
            cwh0VarG6.c(1.5f, 1.5f, true, true, 3.0f, 0.0f);
            cwh0VarG6.c(1.5f, 1.5f, false, true, -3.0f, 0.0f);
            a180.a(a180Var4, cwh0VarG6.a, n6a1Var6, 1.0f, 2, 1.0f);
            b180VarB4 = a180Var4.b();
            z1p1.b = b180VarB4;
        }
        c = new trx(dsxVar, new dsx(b180VarB3, b180VarB4));
        CREATOR = new jrx((byte) 9);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof trx);
    }

    public final int hashCode() {
        return -1475034170;
    }

    public final String toString() {
        return "Radio";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
