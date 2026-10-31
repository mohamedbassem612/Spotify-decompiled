package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ilx extends hux {
    public static final Parcelable.Creator<ilx> CREATOR;
    public static final ilx c;
    public static final byte d;

    static {
        b180 b180VarB = h7p1.a;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Check16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            ArrayList arrayList = new ArrayList(32);
            arrayList.add(new f9s0(15.53f, 2.47f));
            arrayList.add(new j9s0(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.06f));
            arrayList.add(new e9s0(4.907f, 14.153f));
            arrayList.add(new e9s0(0.47f, 9.716f));
            arrayList.add(new j9s0(0.75f, 0.75f, 0.0f, false, true, 1.06f, -1.06f));
            arrayList.add(new m9s0(3.377f, 3.376f));
            arrayList.add(new e9s0(14.47f, 2.47f));
            arrayList.add(new j9s0(0.75f, 0.75f, 0.0f, false, true, 1.06f, 0.0f));
            a180.a(a180Var, arrayList, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            h7p1.a = b180VarB;
        }
        b180 b180VarB2 = j7p1.a;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Check24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            ArrayList arrayList2 = new ArrayList(32);
            arrayList2.add(new f9s0(21.707f, 4.805f));
            arrayList2.add(new j9s0(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.414f));
            arrayList2.add(new e9s0(8.024f, 19.902f));
            arrayList2.add(new m9s0(-5.731f, -5.73f));
            arrayList2.add(new j9s0(1.0f, 1.0f, 0.0f, true, true, 1.414f, -1.415f));
            arrayList2.add(new m9s0(4.317f, 4.317f));
            arrayList2.add(new e9s0(20.293f, 4.805f));
            arrayList2.add(new j9s0(1.0f, 1.0f, 0.0f, false, true, 1.414f, 0.0f));
            a180.a(a180Var2, arrayList2, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            j7p1.a = b180VarB2;
        }
        c = new ilx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new hlx((byte) 0);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ilx);
    }

    public final int hashCode() {
        return -1488677677;
    }

    public final String toString() {
        return "Check";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
