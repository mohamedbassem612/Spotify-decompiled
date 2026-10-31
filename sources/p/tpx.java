package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tpx extends hux {
    public static final Parcelable.Creator<tpx> CREATOR;
    public static final tpx c;

    static {
        b180 b180VarB;
        b180 b180Var;
        b180 b180Var2 = kno1.e;
        if (b180Var2 != null) {
            b180VarB = b180Var2;
        } else {
            a180 a180Var = new a180("Encore.Vector.PauseAlt16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
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
            cwh0 cwh0VarG = lf51.g(5.0f, 5.5f);
            cwh0VarG.c(0.5f, 0.5f, false, true, 0.5f, -0.5f);
            cwh0VarG.i(1.0f);
            cwh0VarG.c(0.5f, 0.5f, false, true, 0.5f, 0.5f);
            cwh0VarG.v(5.0f);
            cwh0VarG.c(0.5f, 0.5f, false, true, -0.5f, 0.5f);
            cwh0VarG.i(-1.0f);
            cwh0VarG.c(0.5f, 0.5f, false, true, -0.5f, -0.5f);
            cwh0VarG.e();
            cwh0VarG.l(9.0f, 5.5f);
            cwh0VarG.c(0.5f, 0.5f, false, true, 0.5f, -0.5f);
            cwh0VarG.i(1.0f);
            cwh0VarG.c(0.5f, 0.5f, false, true, 0.5f, 0.5f);
            cwh0VarG.v(5.0f);
            cwh0VarG.c(0.5f, 0.5f, false, true, -0.5f, 0.5f);
            cwh0VarG.i(-1.0f);
            cwh0VarG.c(0.5f, 0.5f, false, true, -0.5f, -0.5f);
            cwh0VarG.e();
            a180.a(a180Var, cwh0VarG.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            kno1.e = b180VarB;
        }
        b180 b180VarB2 = pno1.c;
        if (b180VarB2 != null) {
            b180Var = b180VarB;
        } else {
            a180 a180Var2 = new a180("Encore.Vector.PauseAlt24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            long j2 = u7h.b;
            n6a1 n6a1Var3 = new n6a1(j2);
            ArrayList arrayList2 = new ArrayList(32);
            arrayList2.add(new f9s0(12.0f, 3.0f));
            arrayList2.add(new j9s0(9.0f, 9.0f, 0.0f, true, false, 0.0f, 18.0f));
            arrayList2.add(new j9s0(9.0f, 9.0f, 0.0f, false, false, 0.0f, -18.0f));
            arrayList2.add(new f9s0(1.0f, 12.0f));
            arrayList2.add(new c9s0(1.0f, 5.925f, 5.925f, 1.0f, 12.0f, 1.0f));
            arrayList2.add(new p9s0(11.0f, 4.925f, 11.0f, 11.0f));
            arrayList2.add(new p9s0(-4.925f, 11.0f, -11.0f, 11.0f));
            arrayList2.add(new h9s0(1.0f, 18.075f, 1.0f, 12.0f));
            a180.a(a180Var2, arrayList2, n6a1Var3, 1.0f, 2, 1.0f);
            n6a1 n6a1Var4 = new n6a1(j2);
            cwh0 cwh0VarG2 = lf51.g(8.0f, 7.5f);
            cwh0VarG2.c(0.5f, 0.5f, false, true, 0.5f, -0.5f);
            cwh0VarG2.i(2.0f);
            cwh0VarG2.c(0.5f, 0.5f, false, true, 0.5f, 0.5f);
            cwh0VarG2.v(9.0f);
            cwh0VarG2.c(0.5f, 0.5f, false, true, -0.5f, 0.5f);
            cwh0VarG2.i(-2.0f);
            cwh0VarG2.c(0.5f, 0.5f, false, true, -0.5f, -0.5f);
            cwh0VarG2.e();
            cwh0VarG2.l(13.0f, 7.5f);
            cwh0VarG2.c(0.5f, 0.5f, false, true, 0.5f, -0.5f);
            cwh0VarG2.i(2.0f);
            cwh0VarG2.c(0.5f, 0.5f, false, true, 0.5f, 0.5f);
            cwh0VarG2.v(9.0f);
            cwh0VarG2.c(0.5f, 0.5f, false, true, -0.5f, 0.5f);
            cwh0VarG2.i(-2.0f);
            cwh0VarG2.c(0.5f, 0.5f, false, true, -0.5f, -0.5f);
            cwh0VarG2.e();
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            pno1.c = b180VarB2;
            b180Var = b180VarB;
        }
        dsx dsxVar = new dsx(b180Var, b180VarB2);
        b180 b180VarB3 = rno1.j;
        if (b180VarB3 == null) {
            a180 a180Var3 = new a180("Encore.Vector.PauseAltActive16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i3 = bui1.a;
            n6a1 n6a1Var5 = new n6a1(u7h.b);
            cwh0 cwh0VarG3 = lf51.g(0.0f, 8.0f);
            cwh0VarG3.c(8.0f, 8.0f, true, true, 16.0f, 0.0f);
            cwh0VarG3.b(8.0f, 8.0f, false, true, 0.0f, 8.0f);
            cwh0VarG3.m(4.5f, -3.5f);
            cwh0VarG3.v(7.0f);
            cwh0VarG3.c(0.5f, 0.5f, false, false, 0.5f, 0.5f);
            cwh0VarG3.i(1.5f);
            cwh0VarG3.c(0.5f, 0.5f, false, false, 0.5f, -0.5f);
            cwh0VarG3.v(-7.0f);
            cwh0VarG3.c(0.5f, 0.5f, false, false, -0.5f, -0.5f);
            cwh0VarG3.h(5.0f);
            cwh0VarG3.c(0.5f, 0.5f, false, false, -0.5f, 0.5f);
            cwh0VarG3.m(4.5f, 0.0f);
            cwh0VarG3.v(7.0f);
            cwh0VarG3.c(0.5f, 0.5f, false, false, 0.5f, 0.5f);
            cwh0VarG3.h(11.0f);
            cwh0VarG3.c(0.5f, 0.5f, false, false, 0.5f, -0.5f);
            cwh0VarG3.v(-7.0f);
            cwh0VarG3.b(0.5f, 0.5f, false, false, 11.0f, 4.0f);
            cwh0VarG3.h(9.5f);
            cwh0VarG3.c(0.5f, 0.5f, false, false, -0.5f, 0.5f);
            a180.a(a180Var3, cwh0VarG3.a, n6a1Var5, 1.0f, 2, 1.0f);
            b180VarB3 = a180Var3.b();
            rno1.j = b180VarB3;
        }
        b180 b180VarB4 = vno1.b;
        if (b180VarB4 == null) {
            a180 a180Var4 = new a180("Encore.Vector.PauseAltActive24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i4 = bui1.a;
            n6a1 n6a1Var6 = new n6a1(u7h.b);
            cwh0 cwh0VarG4 = lf51.g(1.0f, 12.0f);
            cwh0VarG4.f(1.0f, 5.925f, 5.925f, 1.0f, 12.0f, 1.0f);
            cwh0VarG4.q(11.0f, 4.925f, 11.0f, 11.0f);
            cwh0VarG4.q(-4.925f, 11.0f, -11.0f, 11.0f);
            cwh0VarG4.p(1.0f, 18.075f, 1.0f, 12.0f);
            cwh0VarG4.m(7.5f, -5.0f);
            cwh0VarG4.c(0.5f, 0.5f, false, false, -0.5f, 0.5f);
            cwh0VarG4.v(9.0f);
            cwh0VarG4.c(0.5f, 0.5f, false, false, 0.5f, 0.5f);
            cwh0VarG4.i(2.0f);
            cwh0VarG4.c(0.5f, 0.5f, false, false, 0.5f, -0.5f);
            cwh0VarG4.v(-9.0f);
            cwh0VarG4.c(0.5f, 0.5f, false, false, -0.5f, -0.5f);
            cwh0VarG4.e();
            cwh0VarG4.l(13.5f, 7.0f);
            cwh0VarG4.c(0.5f, 0.5f, false, false, -0.5f, 0.5f);
            cwh0VarG4.v(9.0f);
            cwh0VarG4.c(0.5f, 0.5f, false, false, 0.5f, 0.5f);
            cwh0VarG4.i(2.0f);
            cwh0VarG4.c(0.5f, 0.5f, false, false, 0.5f, -0.5f);
            cwh0VarG4.v(-9.0f);
            cwh0VarG4.c(0.5f, 0.5f, false, false, -0.5f, -0.5f);
            cwh0VarG4.e();
            a180.a(a180Var4, cwh0VarG4.a, n6a1Var6, 1.0f, 2, 1.0f);
            b180VarB4 = a180Var4.b();
            vno1.b = b180VarB4;
        }
        c = new tpx(dsxVar, new dsx(b180VarB3, b180VarB4));
        CREATOR = new yox((byte) 20);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof tpx);
    }

    public final int hashCode() {
        return 372492328;
    }

    public final String toString() {
        return "PauseAlt";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
