package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gox extends hux {
    public static final Parcelable.Creator<gox> CREATOR;
    public static final gox c;
    public static final byte d;

    static {
        b180 b180VarB;
        b180 b180Var = wqn1.d;
        if (b180Var != null) {
            b180VarB = b180Var;
        } else {
            a180 a180Var = new a180("Encore.Vector.Layout16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            long j = u7h.b;
            n6a1 n6a1Var = new n6a1(j);
            cwh0 cwh0Var = new cwh0();
            cwh0Var.l(14.5f, 1.5f);
            cwh0Var.i(-13.0f);
            cwh0Var.v(13.0f);
            cwh0Var.i(13.0f);
            cwh0Var.e();
            cwh0Var.l(1.5f, 0.0f);
            cwh0Var.i(13.0f);
            cwh0Var.b(1.5f, 1.5f, false, true, 16.0f, 1.5f);
            cwh0Var.v(13.0f);
            cwh0Var.c(1.5f, 1.5f, false, true, -1.5f, 1.5f);
            cwh0Var.i(-13.0f);
            cwh0Var.b(1.5f, 1.5f, false, true, 0.0f, 14.5f);
            cwh0Var.v(-13.0f);
            cwh0Var.b(1.5f, 1.5f, false, true, 1.5f, 0.0f);
            a180.a(a180Var, cwh0Var.a, n6a1Var, 1.0f, 2, 1.0f);
            n6a1 n6a1Var2 = new n6a1(j);
            cwh0 cwh0Var2 = new cwh0();
            cwh0Var2.l(4.0f, 10.5f);
            cwh0Var2.i(4.0f);
            cwh0Var2.u(12.0f);
            cwh0Var2.h(4.0f);
            cwh0Var2.e();
            rjx.z(cwh0Var2, 4.0f, 7.0f, 8.0f, 1.5f);
            cwh0Var2.h(4.0f);
            cwh0Var2.e();
            a180.a(a180Var, cwh0Var2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            wqn1.d = b180VarB;
        }
        b180 b180VarB2 = crn1.a;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Layout24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            long j2 = u7h.b;
            n6a1 n6a1Var3 = new n6a1(j2);
            cwh0 cwh0Var3 = new cwh0();
            cwh0Var3.l(5.0f, 13.0f);
            cwh0Var3.i(14.0f);
            cwh0Var3.v(2.0f);
            rjx.u(cwh0Var3, 5.0f, 15.0f, 5.0f, 17.0f);
            rjx.A(cwh0Var3, 8.0f, 2.0f, 5.0f, 19.0f);
            a180.a(a180Var2, cwh0Var3.a, n6a1Var3, 1.0f, 2, 1.0f);
            n6a1 n6a1Var4 = new n6a1(j2);
            cwh0 cwh0VarP = rjx.p(1.0f, 3.0f, 18.0f);
            cwh0VarP.c(2.0f, 2.0f, false, false, 2.0f, 2.0f);
            cwh0VarP.i(18.0f);
            cwh0VarP.c(2.0f, 2.0f, false, false, 2.0f, -2.0f);
            cwh0VarP.u(3.0f);
            cwh0VarP.c(2.0f, 2.0f, false, false, -2.0f, -2.0f);
            cwh0VarP.h(3.0f);
            cwh0VarP.c(2.0f, 2.0f, false, false, -2.0f, 2.0f);
            cwh0VarP.m(2.0f, 0.0f);
            cwh0VarP.i(18.0f);
            cwh0VarP.v(18.0f);
            cwh0VarP.h(3.0f);
            cwh0VarP.e();
            a180.a(a180Var2, cwh0VarP.a, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            crn1.a = b180VarB2;
        }
        dsx dsxVar = new dsx(b180VarB, b180VarB2);
        b180 b180VarB3 = ern1.b;
        if (b180VarB3 == null) {
            a180 a180Var3 = new a180("Encore.Vector.LayoutActive16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i3 = bui1.a;
            n6a1 n6a1Var5 = new n6a1(u7h.b);
            cwh0 cwh0VarP2 = rjx.p(0.0f, 1.5f, 13.0f);
            cwh0VarP2.b(1.5f, 1.5f, false, false, 1.5f, 16.0f);
            cwh0VarP2.i(13.0f);
            cwh0VarP2.c(1.5f, 1.5f, false, false, 1.5f, -1.5f);
            cwh0VarP2.v(-13.0f);
            cwh0VarP2.b(1.5f, 1.5f, false, false, 14.5f, 0.0f);
            cwh0VarP2.i(-13.0f);
            cwh0VarP2.b(1.5f, 1.5f, false, false, 0.0f, 1.5f);
            cwh0VarP2.l(13.0f, 7.0f);
            cwh0VarP2.v(1.5f);
            ydh.k(cwh0VarP2, 3.0f, 8.5f, 3.0f, 7.0f);
            cwh0VarP2.l(8.0f, 10.5f);
            cwh0VarP2.j(8.0f, 12.0f);
            cwh0VarP2.j(3.0f, 12.0f);
            cwh0VarP2.v(-1.5f);
            cwh0VarP2.e();
            a180.a(a180Var3, cwh0VarP2.a, n6a1Var5, 1.0f, 2, 1.0f);
            b180VarB3 = a180Var3.b();
            ern1.b = b180VarB3;
        }
        b180 b180VarB4 = grn1.a;
        if (b180VarB4 == null) {
            a180 a180Var4 = new a180("Encore.Vector.LayoutActive24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i4 = bui1.a;
            n6a1 n6a1Var6 = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(3.0f, 1.0f);
            cwh0VarG.c(2.0f, 2.0f, false, false, -2.0f, 2.0f);
            cwh0VarG.v(18.0f);
            cwh0VarG.c(2.0f, 2.0f, false, false, 2.0f, 2.0f);
            cwh0VarG.i(18.0f);
            cwh0VarG.c(2.0f, 2.0f, false, false, 2.0f, -2.0f);
            cwh0VarG.j(23.0f, 3.0f);
            cwh0VarG.c(2.0f, 2.0f, false, false, -2.0f, -2.0f);
            cwh0VarG.e();
            cwh0VarG.l(19.0f, 13.0f);
            cwh0VarG.v(2.0f);
            cwh0VarG.j(5.0f, 15.0f);
            cwh0VarG.v(-2.0f);
            cwh0VarG.e();
            cwh0VarG.l(13.0f, 17.0f);
            cwh0VarG.v(2.0f);
            cwh0VarG.j(5.0f, 19.0f);
            cwh0VarG.v(-2.0f);
            cwh0VarG.e();
            a180.a(a180Var4, cwh0VarG.a, n6a1Var6, 1.0f, 2, 1.0f);
            b180VarB4 = a180Var4.b();
            grn1.a = b180VarB4;
        }
        c = new gox(dsxVar, new dsx(b180VarB3, b180VarB4));
        d = (byte) 8;
        CREATOR = new snx((byte) 12);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof gox);
    }

    public final int hashCode() {
        return 1347437759;
    }

    public final String toString() {
        return "Layout";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
