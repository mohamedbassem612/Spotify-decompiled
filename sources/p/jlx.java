package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jlx extends hux {
    public static final Parcelable.Creator<jlx> CREATOR;
    public static final jlx c;
    public static final byte d;

    static {
        b180 b180VarB = i8p1.a;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.CheckAlt16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
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
            cwh0 cwh0VarG = lf51.g(11.079f, 5.47f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.0f, 1.06f);
            cwh0VarG.k(-4.53f, 4.53f);
            cwh0VarG.k(-2.08f, -2.078f);
            cwh0VarG.c(0.75f, 0.75f, true, true, 1.061f, -1.06f);
            cwh0VarG.k(1.02f, 1.016f);
            cwh0VarG.k(3.47f, -3.47f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 1.06f, 0.0f);
            cwh0VarG.e();
            a180.a(a180Var, cwh0VarG.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            i8p1.a = b180VarB;
        }
        b180 b180VarB2 = k8p1.a;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.CheckAlt24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
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
            ArrayList arrayList3 = new ArrayList(32);
            arrayList3.add(new f9s0(17.398f, 8.207f));
            arrayList3.add(new j9s0(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.414f));
            arrayList3.add(new m9s0(-7.425f, 7.425f));
            arrayList3.add(new m9s0(-3.308f, -3.308f));
            arrayList3.add(new j9s0(1.0f, 1.0f, 0.0f, false, true, 1.414f, -1.414f));
            arrayList3.add(new m9s0(1.894f, 1.894f));
            arrayList3.add(new m9s0(6.011f, -6.011f));
            arrayList3.add(new j9s0(1.0f, 1.0f, 0.0f, false, true, 1.414f, 0.0f));
            a180.a(a180Var2, arrayList3, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            k8p1.a = b180VarB2;
        }
        c = new jlx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new hlx((byte) 1);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof jlx);
    }

    public final int hashCode() {
        return 635688918;
    }

    public final String toString() {
        return "CheckAlt";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
