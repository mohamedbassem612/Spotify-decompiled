package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pox extends hux {
    public static final Parcelable.Creator<pox> CREATOR;
    public static final pox c;
    public static final byte d;

    static {
        b180 b180VarB;
        b180 b180Var = q0o1.b;
        if (b180Var != null) {
            b180VarB = b180Var;
        } else {
            a180 a180Var = new a180("Encore.Vector.Locked16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(4.0f, 4.0f);
            cwh0VarG.c(4.0f, 4.0f, true, true, 8.0f, 0.0f);
            cwh0VarG.v(3.0f);
            cwh0VarG.i(1.25f);
            cwh0VarG.g(0.966f, 0.0f, 1.75f, 0.784f, 1.75f, 1.75f);
            cwh0VarG.v(5.5f);
            cwh0VarG.b(1.75f, 1.75f, false, true, 13.25f, 16.0f);
            cwh0VarG.j(2.75f, 16.0f);
            cwh0VarG.b(1.75f, 1.75f, false, true, 1.0f, 14.25f);
            cwh0VarG.v(-5.5f);
            cwh0VarG.f(1.0f, 7.784f, 1.784f, 7.0f, 2.75f, 7.0f);
            rjx.u(cwh0VarG, 4.0f, 7.0f, 5.5f, 7.0f);
            cwh0VarG.i(5.0f);
            cwh0VarG.j(10.5f, 4.0f);
            cwh0VarG.c(2.5f, 2.5f, false, false, -5.0f, 0.0f);
            cwh0VarG.e();
            cwh0VarG.l(2.75f, 8.5f);
            cwh0VarG.c(0.25f, 0.25f, false, false, -0.25f, 0.25f);
            cwh0VarG.v(5.5f);
            cwh0VarG.g(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f);
            cwh0VarG.i(10.5f);
            cwh0VarG.c(0.25f, 0.25f, false, false, 0.25f, -0.25f);
            cwh0VarG.v(-5.5f);
            cwh0VarG.c(0.25f, 0.25f, false, false, -0.25f, -0.25f);
            cwh0VarG.e();
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            q0o1.b = b180VarB;
        }
        b180 b180VarB2 = w0o1.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Locked24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(6.0f, 7.0f);
            cwh0VarG2.c(6.0f, 6.0f, true, true, 12.0f, 0.0f);
            cwh0VarG2.v(3.0f);
            cwh0VarG2.i(1.0f);
            cwh0VarG2.c(2.0f, 2.0f, false, true, 2.0f, 2.0f);
            cwh0VarG2.v(8.0f);
            cwh0VarG2.c(2.0f, 2.0f, false, true, -2.0f, 2.0f);
            cwh0VarG2.j(5.0f, 22.0f);
            cwh0VarG2.c(2.0f, 2.0f, false, true, -2.0f, -2.0f);
            cwh0VarG2.v(-8.0f);
            cwh0VarG2.c(2.0f, 2.0f, false, true, 2.0f, -2.0f);
            rjx.v(cwh0VarG2, 1.0f, 8.0f, 10.0f, 8.0f);
            cwh0VarG2.j(16.0f, 7.0f);
            cwh0VarG2.c(4.0f, 4.0f, false, false, -8.0f, 0.0f);
            hrt.u(cwh0VarG2, 5.0f, 12.0f, 8.0f, 14.0f);
            cwh0VarG2.v(-8.0f);
            cwh0VarG2.e();
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            w0o1.b = b180VarB2;
        }
        dsx dsxVar = new dsx(b180VarB, b180VarB2);
        b180 b180VarB3 = z0o1.b;
        if (b180VarB3 == null) {
            a180 a180Var3 = new a180("Encore.Vector.LockedActive16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i3 = bui1.a;
            n6a1 n6a1Var3 = new n6a1(u7h.b);
            cwh0 cwh0VarG3 = lf51.g(8.0f, 0.0f);
            cwh0VarG3.c(4.0f, 4.0f, false, false, -4.0f, 4.0f);
            cwh0VarG3.v(3.0f);
            cwh0VarG3.h(2.75f);
            cwh0VarG3.b(1.75f, 1.75f, false, false, 1.0f, 8.75f);
            cwh0VarG3.v(5.5f);
            cwh0VarG3.g(0.0f, 0.966f, 0.784f, 1.75f, 1.75f, 1.75f);
            cwh0VarG3.i(10.5f);
            cwh0VarG3.b(1.75f, 1.75f, false, false, 15.0f, 14.25f);
            cwh0VarG3.v(-5.5f);
            cwh0VarG3.b(1.75f, 1.75f, false, false, 13.25f, 7.0f);
            cwh0VarG3.h(12.0f);
            cwh0VarG3.u(4.0f);
            cwh0VarG3.c(4.0f, 4.0f, false, false, -4.0f, -4.0f);
            cwh0VarG3.m(2.5f, 4.0f);
            cwh0VarG3.v(3.0f);
            cwh0VarG3.i(-5.0f);
            cwh0VarG3.u(4.0f);
            cwh0VarG3.c(2.5f, 2.5f, false, true, 5.0f, 0.0f);
            a180.a(a180Var3, cwh0VarG3.a, n6a1Var3, 1.0f, 2, 1.0f);
            b180VarB3 = a180Var3.b();
            z0o1.b = b180VarB3;
        }
        b180 b180VarB4 = d1o1.d;
        if (b180VarB4 == null) {
            a180 a180Var4 = new a180("Encore.Vector.LockedActive24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i4 = bui1.a;
            n6a1 n6a1Var4 = new n6a1(u7h.b);
            cwh0 cwh0VarG4 = lf51.g(12.0f, 1.0f);
            cwh0VarG4.c(6.0f, 6.0f, false, false, -6.0f, 6.0f);
            cwh0VarG4.v(3.0f);
            cwh0VarG4.h(5.0f);
            cwh0VarG4.c(2.0f, 2.0f, false, false, -2.0f, 2.0f);
            cwh0VarG4.v(8.0f);
            cwh0VarG4.c(2.0f, 2.0f, false, false, 2.0f, 2.0f);
            cwh0VarG4.i(14.0f);
            cwh0VarG4.c(2.0f, 2.0f, false, false, 2.0f, -2.0f);
            cwh0VarG4.v(-8.0f);
            cwh0VarG4.c(2.0f, 2.0f, false, false, -2.0f, -2.0f);
            cwh0VarG4.i(-1.0f);
            cwh0VarG4.u(7.0f);
            cwh0VarG4.c(6.0f, 6.0f, false, false, -6.0f, -6.0f);
            cwh0VarG4.m(4.0f, 6.0f);
            cwh0VarG4.v(3.0f);
            cwh0VarG4.h(8.0f);
            cwh0VarG4.u(7.0f);
            cwh0VarG4.c(4.0f, 4.0f, true, true, 8.0f, 0.0f);
            a180.a(a180Var4, cwh0VarG4.a, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB4 = a180Var4.b();
            d1o1.d = b180VarB4;
        }
        c = new pox(dsxVar, new dsx(b180VarB3, b180VarB4));
        d = (byte) 8;
        CREATOR = new snx((byte) 21);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof pox);
    }

    public final int hashCode() {
        return 1359707295;
    }

    public final String toString() {
        return "Locked";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
