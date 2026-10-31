package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qlx extends hux {
    public static final Parcelable.Creator<qlx> CREATOR;
    public static final qlx c;
    public static final byte d;

    static {
        b180 b180VarB = s9p1.a;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.ChevronUp16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            ArrayList arrayList = new ArrayList(32);
            arrayList.add(new f9s0(0.47f, 11.03f));
            arrayList.add(new j9s0(0.75f, 0.75f, 0.0f, false, false, 1.06f, 0.0f));
            arrayList.add(new e9s0(8.0f, 4.56f));
            arrayList.add(new m9s0(6.47f, 6.47f));
            arrayList.add(new j9s0(0.75f, 0.75f, 0.0f, true, false, 1.06f, -1.06f));
            arrayList.add(new e9s0(8.0f, 2.44f));
            arrayList.add(new e9s0(0.47f, 9.97f));
            arrayList.add(new j9s0(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.06f));
            a180.a(a180Var, arrayList, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            s9p1.a = b180VarB;
        }
        b180 b180VarB2 = t9p1.a;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.ChevronUp24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            ArrayList arrayList2 = new ArrayList(32);
            arrayList2.add(new f9s0(2.793f, 15.957f));
            arrayList2.add(new j9s0(1.0f, 1.0f, 0.0f, false, false, 1.414f, 0.0f));
            arrayList2.add(new e9s0(12.0f, 8.164f));
            arrayList2.add(new m9s0(7.793f, 7.793f));
            arrayList2.add(new j9s0(1.0f, 1.0f, 0.0f, true, false, 1.414f, -1.414f));
            arrayList2.add(new e9s0(12.0f, 5.336f));
            arrayList2.add(new m9s0(-9.207f, 9.207f));
            arrayList2.add(new j9s0(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.414f));
            a180.a(a180Var2, arrayList2, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            t9p1.a = b180VarB2;
        }
        c = new qlx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new hlx((byte) 8);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof qlx);
    }

    public final int hashCode() {
        return -1216690047;
    }

    public final String toString() {
        return "ChevronUp";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
