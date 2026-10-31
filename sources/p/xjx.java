package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xjx extends hux {
    public static final Parcelable.Creator<xjx> CREATOR;
    public static final xjx c;

    static {
        b180 b180VarB = wyo1.a;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Addon16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            long j = u7h.b;
            n6a1 n6a1Var = new n6a1(j);
            cwh0 cwh0VarG = lf51.g(13.75f, 0.0f);
            cwh0VarG.b(2.25f, 2.25f, false, true, 16.0f, 2.25f);
            cwh0VarG.v(11.5f);
            cwh0VarG.b(2.25f, 2.25f, false, true, 13.75f, 16.0f);
            cwh0VarG.h(2.25f);
            cwh0VarG.b(2.25f, 2.25f, false, true, 0.0f, 13.75f);
            cwh0VarG.u(7.401f);
            cwh0VarG.k(0.001f, 0.001f);
            cwh0VarG.j(0.0f, 7.365f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 1.5f, 0.0f);
            cwh0VarG.v(6.385f);
            cwh0VarG.g(0.0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f);
            cwh0VarG.i(11.5f);
            cwh0VarG.c(0.75f, 0.75f, false, false, 0.75f, -0.75f);
            cwh0VarG.u(2.25f);
            cwh0VarG.c(0.75f, 0.75f, false, false, -0.75f, -0.75f);
            cwh0VarG.h(7.701f);
            cwh0VarG.k(-0.003f, -0.003f);
            cwh0VarG.c(0.749f, 0.749f, false, true, 0.1f, -1.495f);
            cwh0VarG.u(0.0f);
            cwh0VarG.e();
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            n6a1 n6a1Var2 = new n6a1(j);
            cwh0 cwh0Var = new cwh0();
            cwh0Var.l(3.5f, 2.0f);
            cwh0Var.i(2.0f);
            cwh0Var.v(1.5f);
            cwh0Var.i(-2.0f);
            cwh0Var.v(2.0f);
            cwh0Var.h(2.0f);
            cwh0Var.v(-2.0f);
            cwh0Var.h(0.0f);
            cwh0Var.u(2.0f);
            cwh0Var.i(2.0f);
            cwh0Var.u(0.0f);
            cwh0Var.i(1.5f);
            cwh0Var.e();
            a180.a(a180Var, cwh0Var.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            wyo1.a = b180VarB;
        }
        b180 b180VarB2 = azo1.a;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Addon24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var3 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(19.0f, 2.0f);
            cwh0VarG2.c(3.0f, 3.0f, false, true, 3.0f, 3.0f);
            cwh0VarG2.v(14.0f);
            cwh0VarG2.c(3.0f, 3.0f, false, true, -3.0f, 3.0f);
            cwh0VarG2.h(5.0f);
            cwh0VarG2.c(3.0f, 3.0f, false, true, -3.0f, -3.0f);
            cwh0VarG2.v(-7.429f);
            cwh0VarG2.i(0.002f);
            cwh0VarG2.b(1.0f, 1.0f, false, true, 4.0f, 11.615f);
            cwh0VarG2.k(-0.001f, 0.014f);
            cwh0VarG2.h(4.0f);
            cwh0VarG2.u(19.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, false, 1.0f, 1.0f);
            cwh0VarG2.i(14.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, false, 1.0f, -1.0f);
            cwh0VarG2.u(5.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, false, -1.0f, -1.0f);
            cwh0VarG2.i(-7.378f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, -0.05f, -1.998f);
            cwh0VarG2.u(2.0f);
            cwh0VarG2.e();
            cwh0VarG2.l(5.0f, 3.0f);
            cwh0VarG2.i(3.0f);
            cwh0VarG2.v(2.0f);
            cwh0VarG2.h(5.0f);
            cwh0VarG2.v(3.0f);
            cwh0VarG2.h(3.0f);
            cwh0VarG2.u(5.0f);
            cwh0VarG2.h(0.0f);
            cwh0VarG2.u(3.0f);
            cwh0VarG2.i(3.0f);
            cwh0VarG2.u(0.0f);
            cwh0VarG2.i(2.0f);
            cwh0VarG2.e();
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var3, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            azo1.a = b180VarB2;
        }
        c = new xjx(new dsx(b180VarB, b180VarB2), null);
        CREATOR = new x7w((byte) 25);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof xjx);
    }

    public final int hashCode() {
        return -1490644469;
    }

    public final String toString() {
        return "Addon";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
