package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class uox extends hux {
    public static final Parcelable.Creator<uox> CREATOR;
    public static final uox c;
    public static final byte d;

    static {
        b180 b180VarB = s3o1.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Messages16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            long j = u7h.b;
            n6a1 n6a1Var = new n6a1(j);
            cwh0 cwh0VarG = lf51.g(13.98f, 4.012f);
            cwh0VarG.b(2.25f, 2.25f, false, true, 16.0f, 6.25f);
            cwh0VarG.v(5.0f);
            cwh0VarG.c(2.25f, 2.25f, false, true, -2.0f, 2.234f);
            cwh0VarG.v(1.766f);
            cwh0VarG.c(0.75f, 0.75f, false, true, -1.227f, 0.578f);
            cwh0VarG.j(9.953f, 13.5f);
            cwh0VarG.h(6.25f);
            cwh0VarG.b(2.25f, 2.25f, false, true, 4.0f, 11.25f);
            cwh0VarG.v(-5.0f);
            cwh0VarG.b(2.25f, 2.25f, false, true, 6.25f, 4.0f);
            rjx.t(cwh0VarG, 7.5f, 6.25f, 5.5f);
            cwh0VarG.c(0.75f, 0.75f, false, false, -0.75f, 0.75f);
            cwh0VarG.v(5.0f);
            cwh0VarG.g(0.0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f);
            cwh0VarG.i(3.97f);
            cwh0VarG.k(0.13f, 0.01f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.348f, 0.16f);
            cwh0VarG.k(1.802f, 1.487f);
            cwh0VarG.v(-0.907f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.75f, -0.75f);
            cwh0VarG.i(0.5f);
            cwh0VarG.c(0.75f, 0.75f, false, false, 0.75f, -0.75f);
            cwh0VarG.v(-5.0f);
            cwh0VarG.c(0.75f, 0.75f, false, false, -0.674f, -0.746f);
            cwh0VarG.j(13.75f, 5.5f);
            cwh0VarG.e();
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            n6a1 n6a1Var2 = new n6a1(j);
            cwh0 cwh0VarG2 = lf51.g(10.0f, 0.0f);
            cwh0VarG2.c(2.75f, 2.75f, false, true, 2.644f, 2.0f);
            cwh0VarG2.i(-1.646f);
            cwh0VarG2.g(-0.228f, -0.303f, -0.59f, -0.5f, -0.998f, -0.5f);
            cwh0VarG2.h(2.75f);
            cwh0VarG2.g(-0.69f, 0.0f, -1.25f, 0.56f, -1.25f, 1.25f);
            cwh0VarG2.v(4.0f);
            cwh0VarG2.g(0.0f, 0.409f, 0.197f, 0.77f, 0.5f, 0.998f);
            cwh0VarG2.v(1.645f);
            cwh0VarG2.b(2.75f, 2.75f, false, true, 0.0f, 6.75f);
            cwh0VarG2.v(-4.0f);
            cwh0VarG2.b(2.75f, 2.75f, false, true, 2.75f, 0.0f);
            cwh0VarG2.e();
            a180.a(a180Var, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            s3o1.b = b180VarB;
        }
        b180 b180VarB2 = y3o1.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Messages24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            long j2 = u7h.b;
            n6a1 n6a1Var3 = new n6a1(j2);
            cwh0 cwh0VarG3 = lf51.g(19.0f, 8.5f);
            cwh0VarG3.c(3.0f, 3.0f, false, true, 3.0f, 3.0f);
            cwh0VarG3.j(22.0f, 18.0f);
            cwh0VarG3.c(3.0f, 3.0f, false, true, -2.625f, 2.976f);
            cwh0VarG3.j(19.375f, 23.0f);
            cwh0VarG3.c(1.001f, 1.001f, false, true, -1.606f, 0.796f);
            cwh0VarG3.j(14.099f, 21.0f);
            cwh0VarG3.j(9.0f, 21.0f);
            cwh0VarG3.c(3.0f, 3.0f, false, true, -3.0f, -3.0f);
            cwh0VarG3.v(-6.5f);
            cwh0VarG3.c(3.0f, 3.0f, false, true, 3.0f, -3.0f);
            cwh0VarG3.e();
            cwh0VarG3.l(9.0f, 10.5f);
            cwh0VarG3.c(1.0f, 1.0f, false, false, -1.0f, 1.0f);
            cwh0VarG3.j(8.0f, 18.0f);
            cwh0VarG3.c(1.0f, 1.0f, false, false, 1.0f, 1.0f);
            cwh0VarG3.i(5.438f);
            cwh0VarG3.c(1.0f, 1.0f, false, true, 0.606f, 0.204f);
            cwh0VarG3.k(2.331f, 1.776f);
            cwh0VarG3.j(17.375f, 20.0f);
            cwh0VarG3.c(1.0f, 1.0f, false, true, 1.0f, -1.0f);
            cwh0VarG3.j(19.0f, 19.0f);
            cwh0VarG3.c(1.0f, 1.0f, false, false, 1.0f, -1.0f);
            cwh0VarG3.v(-6.5f);
            cwh0VarG3.c(1.0f, 1.0f, false, false, -1.0f, -1.0f);
            cwh0VarG3.e();
            a180.a(a180Var2, cwh0VarG3.a, n6a1Var3, 1.0f, 2, 1.0f);
            n6a1 n6a1Var4 = new n6a1(j2);
            cwh0 cwh0VarG4 = lf51.g(13.0f, 2.0f);
            cwh0VarG4.c(3.0f, 3.0f, false, true, 3.0f, 3.0f);
            cwh0VarG4.v(1.0f);
            cwh0VarG4.i(-2.0f);
            cwh0VarG4.u(5.0f);
            cwh0VarG4.c(1.0f, 1.0f, false, false, -1.0f, -1.0f);
            cwh0VarG4.h(4.0f);
            cwh0VarG4.c(1.0f, 1.0f, false, false, -1.0f, 1.0f);
            cwh0VarG4.v(5.0f);
            cwh0VarG4.c(1.0f, 1.0f, false, false, 0.534f, 0.884f);
            cwh0VarG4.c(6.0f, 6.0f, false, false, -0.034f, 0.616f);
            cwh0VarG4.v(1.458f);
            cwh0VarG4.b(3.0f, 3.0f, false, true, 1.0f, 10.0f);
            cwh0VarG4.u(5.0f);
            cwh0VarG4.c(3.0f, 3.0f, false, true, 3.0f, -3.0f);
            cwh0VarG4.e();
            a180.a(a180Var2, cwh0VarG4.a, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            y3o1.b = b180VarB2;
        }
        dsx dsxVar = new dsx(b180VarB, b180VarB2);
        b180 b180VarB3 = d4o1.b;
        if (b180VarB3 == null) {
            a180 a180Var3 = new a180("Encore.Vector.MessagesActive16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i3 = bui1.a;
            long j3 = u7h.b;
            n6a1 n6a1Var5 = new n6a1(j3);
            cwh0 cwh0VarG5 = lf51.g(13.98f, 4.012f);
            cwh0VarG5.b(2.25f, 2.25f, false, true, 16.0f, 6.25f);
            cwh0VarG5.v(5.0f);
            cwh0VarG5.c(2.25f, 2.25f, false, true, -2.0f, 2.234f);
            cwh0VarG5.v(1.766f);
            cwh0VarG5.c(0.75f, 0.75f, false, true, -1.227f, 0.578f);
            cwh0VarG5.j(9.953f, 13.5f);
            cwh0VarG5.h(6.25f);
            cwh0VarG5.b(2.25f, 2.25f, false, true, 4.0f, 11.25f);
            cwh0VarG5.v(-5.0f);
            cwh0VarG5.b(2.25f, 2.25f, false, true, 6.25f, 4.0f);
            cwh0VarG5.i(7.5f);
            cwh0VarG5.e();
            a180.a(a180Var3, cwh0VarG5.a, n6a1Var5, 1.0f, 2, 1.0f);
            n6a1 n6a1Var6 = new n6a1(j3);
            cwh0 cwh0VarG6 = lf51.g(10.0f, 0.0f);
            cwh0VarG6.c(2.75f, 2.75f, false, true, 2.644f, 2.0f);
            cwh0VarG6.h(6.25f);
            cwh0VarG6.b(4.25f, 4.25f, false, false, 2.0f, 6.25f);
            cwh0VarG6.v(3.143f);
            cwh0VarG6.b(2.75f, 2.75f, false, true, 0.0f, 6.75f);
            cwh0VarG6.v(-4.0f);
            cwh0VarG6.b(2.75f, 2.75f, false, true, 2.75f, 0.0f);
            cwh0VarG6.e();
            a180.a(a180Var3, cwh0VarG6.a, n6a1Var6, 1.0f, 2, 1.0f);
            b180VarB3 = a180Var3.b();
            d4o1.b = b180VarB3;
        }
        b180 b180VarB4 = h4o1.b;
        if (b180VarB4 == null) {
            a180 a180Var4 = new a180("Encore.Vector.MessagesActive24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i4 = bui1.a;
            long j4 = u7h.b;
            n6a1 n6a1Var7 = new n6a1(j4);
            cwh0 cwh0VarG7 = lf51.g(19.0f, 8.5f);
            cwh0VarG7.c(3.0f, 3.0f, false, true, 3.0f, 3.0f);
            cwh0VarG7.u(18.0f);
            cwh0VarG7.c(3.0f, 3.0f, false, true, -2.625f, 2.976f);
            cwh0VarG7.u(23.0f);
            cwh0VarG7.c(1.001f, 1.001f, false, true, -1.606f, 0.796f);
            cwh0VarG7.j(14.099f, 21.0f);
            cwh0VarG7.h(9.0f);
            cwh0VarG7.c(3.0f, 3.0f, false, true, -3.0f, -3.0f);
            cwh0VarG7.v(-6.5f);
            cwh0VarG7.c(3.0f, 3.0f, false, true, 3.0f, -3.0f);
            cwh0VarG7.e();
            a180.a(a180Var4, cwh0VarG7.a, n6a1Var7, 1.0f, 2, 1.0f);
            n6a1 n6a1Var8 = new n6a1(j4);
            cwh0 cwh0VarG8 = lf51.g(13.0f, 2.0f);
            cwh0VarG8.c(3.0f, 3.0f, false, true, 3.0f, 3.0f);
            cwh0VarG8.v(1.0f);
            cwh0VarG8.h(9.0f);
            cwh0VarG8.c(5.5f, 5.5f, false, false, -5.5f, 5.5f);
            cwh0VarG8.v(1.458f);
            cwh0VarG8.b(3.0f, 3.0f, false, true, 1.0f, 10.0f);
            cwh0VarG8.u(5.0f);
            cwh0VarG8.c(3.0f, 3.0f, false, true, 3.0f, -3.0f);
            cwh0VarG8.e();
            a180.a(a180Var4, cwh0VarG8.a, n6a1Var8, 1.0f, 2, 1.0f);
            b180VarB4 = a180Var4.b();
            h4o1.b = b180VarB4;
        }
        c = new uox(dsxVar, new dsx(b180VarB3, b180VarB4));
        d = (byte) 8;
        CREATOR = new snx((byte) 26);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof uox);
    }

    public final int hashCode() {
        return -1363265119;
    }

    public final String toString() {
        return "Messages";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
