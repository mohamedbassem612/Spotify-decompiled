package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class irx extends hux {
    public static final Parcelable.Creator<irx> CREATOR;
    public static final irx c;
    public static final byte d;

    static {
        b180 b180VarB = azo1.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.PlusAlt16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            long j = u7h.b;
            n6a1 n6a1Var = new n6a1(j);
            ArrayList arrayList = new ArrayList(32);
            arrayList.add(new f9s0(8.0f, 1.5f));
            arrayList.add(new j9s0(6.5f, 6.5f, 0.0f, true, false, 0.0f, 13.0f));
            arrayList.add(new j9s0(6.5f, 6.5f, 0.0f, false, false, 0.0f, -13.0f));
            arrayList.add(new f9s0(0.0f, 8.0f));
            arrayList.add(new j9s0(8.0f, 8.0f, 0.0f, true, true, 16.0f, 0.0f));
            arrayList.add(new a9s0(8.0f, 8.0f, 0.0f, false, true, 0.0f, 8.0f));
            a180.a(a180Var, arrayList, n6a1Var, 1.0f, 2, 1.0f);
            n6a1 n6a1Var2 = new n6a1(j);
            cwh0 cwh0VarG = lf51.g(11.75f, 8.0f);
            cwh0VarG.c(0.75f, 0.75f, false, true, -0.75f, 0.75f);
            cwh0VarG.h(8.75f);
            cwh0VarG.u(11.0f);
            cwh0VarG.c(0.75f, 0.75f, false, true, -1.5f, 0.0f);
            cwh0VarG.u(8.75f);
            cwh0VarG.h(5.0f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.0f, -1.5f);
            cwh0VarG.i(2.25f);
            cwh0VarG.u(5.0f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 1.5f, 0.0f);
            cwh0VarG.v(2.25f);
            cwh0VarG.h(11.0f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.75f, 0.75f);
            a180.a(a180Var, cwh0VarG.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            azo1.b = b180VarB;
        }
        b180 b180VarB2 = czo1.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.PlusAlt24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            long j2 = u7h.b;
            n6a1 n6a1Var3 = new n6a1(j2);
            ArrayList arrayList2 = new ArrayList(32);
            arrayList2.add(new f9s0(11.999f, 3.0f));
            arrayList2.add(new j9s0(9.0f, 9.0f, 0.0f, true, false, 0.0f, 18.0f));
            arrayList2.add(new j9s0(9.0f, 9.0f, 0.0f, false, false, 0.0f, -18.0f));
            arrayList2.add(new n9s0(-11.0f, 9.0f));
            arrayList2.add(new k9s0(0.0f, -6.075f, 4.925f, -11.0f, 11.0f, -11.0f));
            arrayList2.add(new p9s0(11.0f, 4.925f, 11.0f, 11.0f));
            arrayList2.add(new p9s0(-4.925f, 11.0f, -11.0f, 11.0f));
            arrayList2.add(new p9s0(-11.0f, -4.925f, -11.0f, -11.0f));
            a180.a(a180Var2, arrayList2, n6a1Var3, 1.0f, 2, 1.0f);
            n6a1 n6a1Var4 = new n6a1(j2);
            cwh0 cwh0VarG2 = lf51.g(17.999f, 12.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, -1.0f, 1.0f);
            cwh0VarG2.i(-4.0f);
            cwh0VarG2.v(4.0f);
            cwh0VarG2.c(1.0f, 1.0f, true, true, -2.0f, 0.0f);
            cwh0VarG2.v(-4.0f);
            cwh0VarG2.i(-4.0f);
            cwh0VarG2.c(1.0f, 1.0f, true, true, 0.0f, -2.0f);
            cwh0VarG2.i(4.0f);
            cwh0VarG2.u(7.0f);
            cwh0VarG2.c(1.0f, 1.0f, true, true, 2.0f, 0.0f);
            cwh0VarG2.v(4.0f);
            cwh0VarG2.i(4.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 1.0f, 1.0f);
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            czo1.b = b180VarB2;
        }
        dsx dsxVar = new dsx(b180VarB, b180VarB2);
        b180 b180VarB3 = dzo1.b;
        if (b180VarB3 == null) {
            a180 a180Var3 = new a180("Encore.Vector.PlusAltActive16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i3 = bui1.a;
            n6a1 n6a1Var5 = new n6a1(u7h.b);
            cwh0 cwh0VarG3 = lf51.g(0.0f, 8.0f);
            cwh0VarG3.c(8.0f, 8.0f, true, true, 16.0f, 0.0f);
            cwh0VarG3.b(8.0f, 8.0f, false, true, 0.0f, 8.0f);
            cwh0VarG3.m(12.0f, 0.75f);
            cwh0VarG3.c(0.75f, 0.75f, false, false, 0.0f, -1.5f);
            cwh0VarG3.h(8.75f);
            cwh0VarG3.u(4.0f);
            cwh0VarG3.c(0.75f, 0.75f, false, false, -1.5f, 0.0f);
            cwh0VarG3.v(3.25f);
            cwh0VarG3.h(4.0f);
            cwh0VarG3.c(0.75f, 0.75f, false, false, 0.0f, 1.5f);
            cwh0VarG3.i(3.25f);
            cwh0VarG3.u(12.0f);
            cwh0VarG3.c(0.75f, 0.75f, false, false, 1.5f, 0.0f);
            cwh0VarG3.u(8.75f);
            cwh0VarG3.e();
            a180.a(a180Var3, cwh0VarG3.a, n6a1Var5, 1.0f, 2, 1.0f);
            b180VarB3 = a180Var3.b();
            dzo1.b = b180VarB3;
        }
        b180 b180VarB4 = xzo1.b;
        if (b180VarB4 == null) {
            a180 a180Var4 = new a180("Encore.Vector.PlusAltActive24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i4 = bui1.a;
            n6a1 n6a1Var6 = new n6a1(u7h.b);
            cwh0 cwh0VarG4 = lf51.g(0.999f, 12.0f);
            cwh0VarG4.g(0.0f, -6.075f, 4.925f, -11.0f, 11.0f, -11.0f);
            cwh0VarG4.q(11.0f, 4.925f, 11.0f, 11.0f);
            cwh0VarG4.q(-4.925f, 11.0f, -11.0f, 11.0f);
            cwh0VarG4.q(-11.0f, -4.925f, -11.0f, -11.0f);
            cwh0VarG4.m(16.0f, 1.0f);
            cwh0VarG4.c(1.0f, 1.0f, true, false, 0.0f, -2.0f);
            cwh0VarG4.i(-4.0f);
            cwh0VarG4.u(7.0f);
            cwh0VarG4.c(1.0f, 1.0f, true, false, -2.0f, 0.0f);
            cwh0VarG4.v(4.0f);
            cwh0VarG4.i(-4.0f);
            cwh0VarG4.c(1.0f, 1.0f, true, false, 0.0f, 2.0f);
            cwh0VarG4.i(4.0f);
            cwh0VarG4.v(4.0f);
            cwh0VarG4.c(1.0f, 1.0f, true, false, 2.0f, 0.0f);
            cwh0VarG4.v(-4.0f);
            cwh0VarG4.e();
            a180.a(a180Var4, cwh0VarG4.a, n6a1Var6, 1.0f, 2, 1.0f);
            b180VarB4 = a180Var4.b();
            xzo1.b = b180VarB4;
        }
        c = new irx(dsxVar, new dsx(b180VarB3, b180VarB4));
        d = (byte) 8;
        CREATOR = new dqx((byte) 29);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof irx);
    }

    public final int hashCode() {
        return -1612759366;
    }

    public final String toString() {
        return "PlusAlt";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
