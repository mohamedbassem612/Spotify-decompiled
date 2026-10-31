package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class opx extends hux {
    public static final Parcelable.Creator<opx> CREATOR;
    public static final opx c;

    static {
        b180 b180VarB = jmo1.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.PanelLeftExpand16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, true, 96);
            int i = bui1.a;
            long j = u7h.b;
            n6a1 n6a1Var = new n6a1(j);
            ArrayList arrayList = new ArrayList(32);
            arrayList.add(new f9s0(10.03f, 10.53f));
            arrayList.add(new j9s0(0.75f, 0.75f, 0.0f, true, true, -1.06f, -1.06f));
            arrayList.add(new e9s0(10.44f, 8.0f));
            arrayList.add(new e9s0(8.97f, 6.53f));
            arrayList.add(new j9s0(0.75f, 0.75f, 0.0f, false, true, 1.06f, -1.06f));
            arrayList.add(new m9s0(2.0f, 2.0f));
            arrayList.add(new j9s0(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.06f));
            arrayList.add(b9s0.c);
            a180.a(a180Var, arrayList, n6a1Var, 1.0f, 2, 1.0f);
            n6a1 n6a1Var2 = new n6a1(j);
            cwh0 cwh0VarG = lf51.g(15.0f, 16.0f);
            cwh0VarG.c(1.0f, 1.0f, false, false, 1.0f, -1.0f);
            cwh0VarG.j(16.0f, 1.0f);
            cwh0VarG.c(1.0f, 1.0f, false, false, -1.0f, -1.0f);
            cwh0VarG.j(1.0f, 0.0f);
            cwh0VarG.c(1.0f, 1.0f, false, false, -1.0f, 1.0f);
            cwh0VarG.v(14.0f);
            cwh0VarG.c(1.0f, 1.0f, false, false, 1.0f, 1.0f);
            hrt.u(cwh0VarG, 6.5f, 14.5f, -13.0f, 8.0f);
            cwh0VarG.v(13.0f);
            cwh0VarG.e();
            cwh0VarG.l(5.0f, 14.5f);
            cwh0VarG.j(1.5f, 14.5f);
            cwh0VarG.v(-13.0f);
            cwh0VarG.j(5.0f, 1.5f);
            cwh0VarG.e();
            a180.a(a180Var, cwh0VarG.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            jmo1.b = b180VarB;
        }
        b180 b180VarB2 = mmo1.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.PanelLeftExpand24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
            int i2 = bui1.a;
            long j2 = u7h.b;
            n6a1 n6a1Var3 = new n6a1(j2);
            ArrayList arrayList2 = new ArrayList(32);
            arrayList2.add(new f9s0(14.457f, 15.207f));
            arrayList2.add(new j9s0(1.0f, 1.0f, 0.0f, false, true, -1.414f, -1.414f));
            arrayList2.add(new e9s0(14.836f, 12.0f));
            arrayList2.add(new m9s0(-1.793f, -1.793f));
            arrayList2.add(new j9s0(1.0f, 1.0f, 0.0f, false, true, 1.414f, -1.414f));
            arrayList2.add(new m9s0(2.5f, 2.5f));
            arrayList2.add(new j9s0(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.414f));
            arrayList2.add(b9s0.c);
            a180.a(a180Var2, arrayList2, n6a1Var3, 1.0f, 2, 1.0f);
            n6a1 n6a1Var4 = new n6a1(j2);
            cwh0 cwh0VarG2 = lf51.g(20.0f, 22.0f);
            cwh0VarG2.c(2.0f, 2.0f, false, false, 2.0f, -2.0f);
            cwh0VarG2.j(22.0f, 4.0f);
            cwh0VarG2.c(2.0f, 2.0f, false, false, -2.0f, -2.0f);
            cwh0VarG2.j(4.0f, 2.0f);
            cwh0VarG2.c(2.0f, 2.0f, false, false, -2.0f, 2.0f);
            cwh0VarG2.v(16.0f);
            cwh0VarG2.c(2.0f, 2.0f, false, false, 2.0f, 2.0f);
            hrt.o(cwh0VarG2, 4.0f, 20.0f, 4.0f, 4.0f);
            cwh0VarG2.i(4.0f);
            cwh0VarG2.v(16.0f);
            cwh0VarG2.e();
            cwh0VarG2.l(20.0f, 20.0f);
            cwh0VarG2.j(10.0f, 20.0f);
            rjx.r(cwh0VarG2, 10.0f, 4.0f, 10.0f);
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            mmo1.b = b180VarB2;
        }
        c = new opx(new dsx(b180VarB, b180VarB2), null);
        CREATOR = new yox((byte) 15);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof opx);
    }

    public final int hashCode() {
        return -1720194896;
    }

    public final String toString() {
        return "PanelLeftExpand";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
