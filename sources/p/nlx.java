package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nlx extends hux {
    public static final Parcelable.Creator<nlx> CREATOR;
    public static final nlx c;
    public static final byte d;

    static {
        b180 b180VarB = z8p1.a;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.ChevronDownAlt16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
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
            ArrayList arrayList2 = new ArrayList(32);
            arrayList2.add(new f9s0(4.47f, 6.47f));
            arrayList2.add(new j9s0(0.75f, 0.75f, 0.0f, false, true, 1.06f, 0.0f));
            arrayList2.add(new e9s0(8.0f, 8.94f));
            arrayList2.add(new m9s0(2.47f, -2.47f));
            arrayList2.add(new j9s0(0.75f, 0.75f, 0.0f, true, true, 1.06f, 1.06f));
            arrayList2.add(new e9s0(8.0f, 11.06f));
            arrayList2.add(new e9s0(4.47f, 7.53f));
            arrayList2.add(new j9s0(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.06f));
            a180.a(a180Var, arrayList2, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            z8p1.a = b180VarB;
        }
        b180 b180VarB2 = b9p1.a;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.ChevronDownAlt24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            long j2 = u7h.b;
            n6a1 n6a1Var3 = new n6a1(j2);
            ArrayList arrayList3 = new ArrayList(32);
            arrayList3.add(new f9s0(16.707f, 10.228f));
            arrayList3.add(new j9s0(1.0f, 1.0f, 0.0f, false, false, -1.414f, 0.0f));
            arrayList3.add(new e9s0(12.0f, 13.52f));
            arrayList3.add(new m9s0(-3.293f, -3.293f));
            arrayList3.add(new j9s0(1.0f, 1.0f, 0.0f, true, false, -1.414f, 1.414f));
            arrayList3.add(new e9s0(12.0f, 16.349f));
            arrayList3.add(new m9s0(4.707f, -4.707f));
            arrayList3.add(new j9s0(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.414f));
            a180.a(a180Var2, arrayList3, n6a1Var3, 1.0f, 2, 1.0f);
            n6a1 n6a1Var4 = new n6a1(j2);
            ArrayList arrayList4 = new ArrayList(32);
            arrayList4.add(new f9s0(12.0f, 21.0f));
            arrayList4.add(new j9s0(9.0f, 9.0f, 0.0f, true, false, 0.0f, -18.0f));
            arrayList4.add(new j9s0(9.0f, 9.0f, 0.0f, false, false, 0.0f, 18.0f));
            arrayList4.add(new n9s0(11.0f, -9.0f));
            arrayList4.add(new k9s0(0.0f, 6.075f, -4.925f, 11.0f, -11.0f, 11.0f));
            arrayList4.add(new h9s0(1.0f, 18.075f, 1.0f, 12.0f));
            arrayList4.add(new h9s0(5.925f, 1.0f, 12.0f, 1.0f));
            arrayList4.add(new p9s0(11.0f, 4.925f, 11.0f, 11.0f));
            a180.a(a180Var2, arrayList4, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            b9p1.a = b180VarB2;
        }
        dsx dsxVar = new dsx(b180VarB, b180VarB2);
        b180 b180VarB3 = d9p1.a;
        if (b180VarB3 == null) {
            a180 a180Var3 = new a180("Encore.Vector.ChevronDownAltActive16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i3 = bui1.a;
            n6a1 n6a1Var5 = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(0.0f, 8.0f);
            cwh0VarG.c(8.0f, 8.0f, true, true, 16.0f, 0.0f);
            cwh0VarG.b(8.0f, 8.0f, false, true, 0.0f, 8.0f);
            cwh0VarG.m(5.53f, -1.53f);
            cwh0VarG.c(0.75f, 0.75f, false, false, -1.06f, 1.06f);
            cwh0VarG.j(8.0f, 11.06f);
            cwh0VarG.k(3.53f, -3.53f);
            cwh0VarG.c(0.75f, 0.75f, false, false, -1.06f, -1.06f);
            cwh0VarG.j(8.0f, 8.94f);
            cwh0VarG.e();
            a180.a(a180Var3, cwh0VarG.a, n6a1Var5, 1.0f, 2, 1.0f);
            b180VarB3 = a180Var3.b();
            d9p1.a = b180VarB3;
        }
        b180 b180VarB4 = e9p1.a;
        if (b180VarB4 == null) {
            a180 a180Var4 = new a180("Encore.Vector.ChevronDownAltActive24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i4 = bui1.a;
            n6a1 n6a1Var6 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(23.0f, 12.0f);
            cwh0VarG2.g(0.0f, 6.075f, -4.925f, 11.0f, -11.0f, 11.0f);
            cwh0VarG2.p(1.0f, 18.075f, 1.0f, 12.0f);
            cwh0VarG2.p(5.925f, 1.0f, 12.0f, 1.0f);
            cwh0VarG2.q(11.0f, 4.925f, 11.0f, 11.0f);
            cwh0VarG2.m(-7.207f, -2.34f);
            cwh0VarG2.j(12.0f, 13.454f);
            cwh0VarG2.j(8.207f, 9.661f);
            cwh0VarG2.c(1.0f, 1.0f, true, false, -1.414f, 1.414f);
            cwh0VarG2.j(12.0f, 16.282f);
            cwh0VarG2.k(5.207f, -5.207f);
            cwh0VarG2.c(1.0f, 1.0f, false, false, -1.414f, -1.414f);
            cwh0VarG2.e();
            a180.a(a180Var4, cwh0VarG2.a, n6a1Var6, 1.0f, 2, 1.0f);
            b180VarB4 = a180Var4.b();
            e9p1.a = b180VarB4;
        }
        c = new nlx(dsxVar, new dsx(b180VarB3, b180VarB4));
        d = (byte) 8;
        CREATOR = new hlx((byte) 5);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof nlx);
    }

    public final int hashCode() {
        return -1947957375;
    }

    public final String toString() {
        return "ChevronDownAlt";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
