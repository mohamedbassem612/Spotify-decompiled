package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class blx extends hux {
    public static final Parcelable.Creator<blx> CREATOR;
    public static final blx c;
    public static final byte d;

    static {
        b180 b180VarB = g6p1.a;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Camera16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            long j = u7h.b;
            n6a1 n6a1Var = new n6a1(j);
            ArrayList arrayList = new ArrayList(32);
            arrayList.add(new f9s0(8.0f, 7.148f));
            arrayList.add(new j9s0(2.0f, 2.0f, 0.0f, true, false, 0.0f, 4.0f));
            arrayList.add(new j9s0(2.0f, 2.0f, 0.0f, false, false, 0.0f, -4.0f));
            arrayList.add(new n9s0(-3.5f, 2.0f));
            arrayList.add(new j9s0(3.5f, 3.5f, 0.0f, true, true, 7.0f, 0.0f));
            arrayList.add(new j9s0(3.5f, 3.5f, 0.0f, false, true, -7.0f, 0.0f));
            a180.a(a180Var, arrayList, n6a1Var, 1.0f, 2, 1.0f);
            n6a1 n6a1Var2 = new n6a1(j);
            cwh0 cwh0VarG = lf51.g(4.711f, 2.125f);
            cwh0VarG.b(2.25f, 2.25f, false, true, 6.66f, 1.0f);
            cwh0VarG.i(2.68f);
            cwh0VarG.c(2.25f, 2.25f, false, true, 1.949f, 1.125f);
            cwh0VarG.j(12.37f, 4.0f);
            cwh0VarG.i(1.879f);
            cwh0VarG.g(0.966f, 0.0f, 1.75f, 0.784f, 1.75f, 1.75f);
            cwh0VarG.v(8.5f);
            cwh0VarG.b(1.75f, 1.75f, false, true, 14.25f, 16.0f);
            cwh0VarG.h(1.75f);
            cwh0VarG.b(1.75f, 1.75f, false, true, 0.0f, 14.25f);
            cwh0VarG.v(-8.5f);
            cwh0VarG.f(0.0f, 4.784f, 0.784f, 4.0f, 1.75f, 4.0f);
            cwh0VarG.i(1.879f);
            cwh0VarG.j(4.71f, 2.125f);
            cwh0VarG.e();
            cwh0VarG.l(6.66f, 2.5f);
            cwh0VarG.c(0.75f, 0.75f, false, false, -0.65f, 0.375f);
            cwh0VarG.j(4.495f, 5.5f);
            cwh0VarG.h(1.75f);
            cwh0VarG.c(0.25f, 0.25f, false, false, -0.25f, 0.25f);
            cwh0VarG.v(8.5f);
            cwh0VarG.g(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f);
            cwh0VarG.i(12.5f);
            cwh0VarG.c(0.25f, 0.25f, false, false, 0.25f, -0.25f);
            cwh0VarG.v(-8.5f);
            cwh0VarG.c(0.25f, 0.25f, false, false, -0.25f, -0.25f);
            cwh0VarG.i(-2.745f);
            cwh0VarG.j(9.99f, 2.875f);
            cwh0VarG.c(0.75f, 0.75f, false, false, -0.65f, -0.375f);
            cwh0VarG.e();
            a180.a(a180Var, cwh0VarG.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            g6p1.a = b180VarB;
        }
        b180 b180VarB2 = mno1.s0;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Camera24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            int i3 = u7h.l;
            long j2 = u7h.b;
            n6a1 n6a1Var3 = new n6a1(j2);
            cwh0 cwh0VarG2 = lf51.g(7.247f, 3.5f);
            cwh0VarG2.b(3.0f, 3.0f, false, true, 9.845f, 2.0f);
            cwh0VarG2.i(4.31f);
            cwh0VarG2.c(3.0f, 3.0f, false, true, 2.598f, 1.5f);
            cwh0VarG2.j(18.196f, 6.0f);
            cwh0VarG2.j(22.0f, 6.0f);
            cwh0VarG2.c(2.0f, 2.0f, false, true, 2.0f, 2.0f);
            cwh0VarG2.v(12.0f);
            cwh0VarG2.c(2.0f, 2.0f, false, true, -2.0f, 2.0f);
            cwh0VarG2.j(2.0f, 22.0f);
            cwh0VarG2.c(2.0f, 2.0f, false, true, -2.0f, -2.0f);
            cwh0VarG2.j(0.0f, 8.0f);
            cwh0VarG2.c(2.0f, 2.0f, false, true, 2.0f, -2.0f);
            rjx.t(cwh0VarG2, 3.804f, 9.845f, 4.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, false, -0.866f, 0.5f);
            cwh0VarG2.j(6.96f, 8.0f);
            cwh0VarG2.j(2.0f, 8.0f);
            cwh0VarG2.v(12.0f);
            cwh0VarG2.i(20.0f);
            cwh0VarG2.j(22.0f, 8.0f);
            cwh0VarG2.i(-4.959f);
            cwh0VarG2.k(-2.02f, -3.5f);
            cwh0VarG2.c(1.0f, 1.0f, false, false, -0.866f, -0.5f);
            cwh0VarG2.e();
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var3, 1.0f, 2, 1.0f);
            n6a1 n6a1Var4 = new n6a1(j2);
            ArrayList arrayList2 = new ArrayList(32);
            arrayList2.add(new f9s0(12.0f, 10.0f));
            arrayList2.add(new j9s0(3.0f, 3.0f, 0.0f, true, false, 0.0f, 6.0f));
            arrayList2.add(new j9s0(3.0f, 3.0f, 0.0f, false, false, 0.0f, -6.0f));
            arrayList2.add(new n9s0(-5.0f, 3.0f));
            arrayList2.add(new j9s0(5.0f, 5.0f, 0.0f, true, true, 10.0f, 0.0f));
            arrayList2.add(new j9s0(5.0f, 5.0f, 0.0f, false, true, -10.0f, 0.0f));
            a180.a(a180Var2, arrayList2, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            mno1.s0 = b180VarB2;
        }
        c = new blx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new ckx((byte) 24);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof blx);
    }

    public final int hashCode() {
        return 1089408186;
    }

    public final String toString() {
        return "Camera";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
