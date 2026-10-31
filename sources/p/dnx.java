package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dnx extends hux {
    public static final Parcelable.Creator<dnx> CREATOR;
    public static final dnx c;
    public static final byte d;

    static {
        b180 b180VarB = dsa0.a;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.ExternalLink16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            long j = u7h.b;
            n6a1 n6a1Var = new n6a1(j);
            cwh0 cwh0VarG = lf51.g(1.0f, 2.75f);
            cwh0VarG.b(0.75f, 0.75f, false, true, 1.75f, 2.0f);
            cwh0VarG.h(7.0f);
            cwh0VarG.v(1.5f);
            cwh0VarG.h(2.5f);
            cwh0VarG.v(11.0f);
            cwh0VarG.i(10.219f);
            cwh0VarG.u(9.0f);
            cwh0VarG.i(1.5f);
            cwh0VarG.v(6.25f);
            cwh0VarG.c(0.75f, 0.75f, false, true, -0.75f, 0.75f);
            cwh0VarG.h(1.75f);
            cwh0VarG.c(0.75f, 0.75f, false, true, -0.75f, -0.75f);
            cwh0VarG.e();
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            n6a1 n6a1Var2 = new n6a1(j);
            cwh0 cwh0VarP = rjx.p(15.0f, 1.0f, 4.993f);
            cwh0VarP.c(0.75f, 0.75f, true, true, -1.5f, 0.0f);
            cwh0VarP.u(3.56f);
            cwh0VarP.j(8.78f, 8.28f);
            cwh0VarP.c(0.75f, 0.75f, false, true, -1.06f, -1.06f);
            cwh0VarP.k(4.72f, -4.72f);
            cwh0VarP.i(-2.433f);
            cwh0VarP.c(0.75f, 0.75f, false, true, 0.0f, -1.5f);
            cwh0VarP.e();
            a180.a(a180Var, cwh0VarP.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            dsa0.a = b180VarB;
        }
        b180 b180VarB2 = exd0.a;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.ExternalLink24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            long j2 = u7h.b;
            n6a1 n6a1Var3 = new n6a1(j2);
            cwh0 cwh0VarG2 = lf51.g(3.0f, 5.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 1.0f, -1.0f);
            cwh0VarG2.i(8.0f);
            cwh0VarG2.v(2.0f);
            cwh0VarG2.h(5.0f);
            cwh0VarG2.v(14.0f);
            cwh0VarG2.i(13.0f);
            cwh0VarG2.v(-8.0f);
            cwh0VarG2.i(2.0f);
            cwh0VarG2.v(9.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, -1.0f, 1.0f);
            cwh0VarG2.h(4.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, -1.0f, -1.0f);
            cwh0VarG2.e();
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var3, 1.0f, 2, 1.0f);
            n6a1 n6a1Var4 = new n6a1(j2);
            cwh0 cwh0VarP2 = rjx.p(22.0f, 2.0f, 5.95f);
            cwh0VarP2.c(1.0f, 1.0f, true, true, -2.0f, 0.0f);
            cwh0VarP2.u(5.414f);
            cwh0VarP2.k(-5.293f, 5.293f);
            cwh0VarP2.c(1.0f, 1.0f, false, true, -1.414f, -1.414f);
            cwh0VarP2.j(18.586f, 4.0f);
            cwh0VarP2.h(16.05f);
            cwh0VarP2.c(1.0f, 1.0f, false, true, 0.0f, -2.0f);
            cwh0VarP2.e();
            a180.a(a180Var2, cwh0VarP2.a, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            exd0.a = b180VarB2;
        }
        c = new dnx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new mmx((byte) 15);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof dnx);
    }

    public final int hashCode() {
        return 1157345338;
    }

    public final String toString() {
        return "ExternalLink";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
