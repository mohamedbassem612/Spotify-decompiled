package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rmx extends hux {
    public static final Parcelable.Creator<rmx> CREATOR;
    public static final rmx c;

    static {
        b180 b180VarB = sbl.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Discover16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            long j = u7h.b;
            n6a1 n6a1Var = new n6a1(j);
            ArrayList arrayList = new ArrayList(32);
            arrayList.add(new f9s0(11.503f, 0.89f));
            arrayList.add(new j9s0(1.091f, 1.091f, 0.0f, true, false, 0.0f, 2.181f));
            arrayList.add(new j9s0(1.091f, 1.091f, 0.0f, false, false, 0.0f, -2.182f));
            b9s0 b9s0Var = b9s0.c;
            arrayList.add(b9s0Var);
            a180.a(a180Var, arrayList, n6a1Var, 1.0f, 2, 1.0f);
            n6a1 n6a1Var2 = new n6a1(j);
            ArrayList arrayList2 = new ArrayList(32);
            arrayList2.add(new f9s0(7.978f, 0.0f));
            arrayList2.add(new j9s0(8.0f, 8.0f, 0.0f, true, false, 6.918f, 3.942f));
            arrayList2.add(new m9s0(-1.296f, 0.756f));
            arrayList2.add(new a9s0(6.5f, 6.5f, 0.0f, true, true, 7.978f, 1.5f));
            arrayList2.add(b9s0Var);
            a180.a(a180Var, arrayList2, n6a1Var2, 1.0f, 2, 1.0f);
            n6a1 n6a1Var3 = new n6a1(j);
            ArrayList arrayList3 = new ArrayList(32);
            arrayList3.add(new f9s0(7.978f, 4.0f));
            arrayList3.add(new j9s0(4.0f, 4.0f, 0.0f, true, false, 3.462f, 1.958f));
            arrayList3.add(new m9s0(-1.296f, 0.756f));
            arrayList3.add(new a9s0(2.5f, 2.5f, 0.0f, true, true, 7.978f, 5.5f));
            arrayList3.add(b9s0Var);
            a180.a(a180Var, arrayList3, n6a1Var3, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            sbl.b = b180VarB;
        }
        b180 b180VarB2 = brl.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Discover24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            long j2 = u7h.b;
            n6a1 n6a1Var4 = new n6a1(j2);
            ArrayList arrayList4 = new ArrayList(32);
            arrayList4.add(new f9s0(16.848f, 2.254f));
            arrayList4.add(new j9s0(1.5f, 1.5f, 0.0f, true, false, 0.0f, 3.0f));
            arrayList4.add(new j9s0(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f));
            a180.a(a180Var2, arrayList4, n6a1Var4, 1.0f, 2, 1.0f);
            n6a1 n6a1Var5 = new n6a1(j2);
            ArrayList arrayList5 = new ArrayList(32);
            arrayList5.add(new f9s0(12.0f, 1.0f));
            arrayList5.add(new c9s0(5.925f, 1.0f, 1.0f, 5.925f, 1.0f, 12.0f));
            arrayList5.add(new p9s0(4.925f, 11.0f, 11.0f, 11.0f));
            arrayList5.add(new p9s0(11.0f, -4.925f, 11.0f, -11.0f));
            arrayList5.add(new j9s0(10.95f, 10.95f, 0.0f, false, false, -1.497f, -5.543f));
            arrayList5.add(new m9s0(-1.728f, 1.008f));
            arrayList5.add(new a9s0(9.0f, 9.0f, 0.0f, true, true, 12.0f, 3.0f));
            b9s0 b9s0Var2 = b9s0.c;
            arrayList5.add(b9s0Var2);
            a180.a(a180Var2, arrayList5, n6a1Var5, 1.0f, 2, 1.0f);
            n6a1 n6a1Var6 = new n6a1(j2);
            ArrayList arrayList6 = new ArrayList(32);
            arrayList6.add(new f9s0(12.0f, 6.59f));
            arrayList6.add(new j9s0(5.5f, 5.5f, 0.0f, true, false, 4.712f, 2.662f));
            arrayList6.add(new m9s0(-1.728f, 1.008f));
            arrayList6.add(new a9s0(3.5f, 3.5f, 0.0f, true, true, 12.0f, 8.59f));
            arrayList6.add(b9s0Var2);
            a180.a(a180Var2, arrayList6, n6a1Var6, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            brl.b = b180VarB2;
        }
        c = new rmx(new dsx(b180VarB, b180VarB2), null);
        CREATOR = new mmx((byte) 4);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof rmx);
    }

    public final int hashCode() {
        return -627986370;
    }

    public final String toString() {
        return "Discover";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
