package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class olx extends hux {
    public static final Parcelable.Creator<olx> CREATOR;
    public static final olx c;
    public static final byte d;

    static {
        b180 b180VarB = g9p1.a;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.ChevronLeft16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, true, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            ArrayList arrayList = new ArrayList(32);
            arrayList.add(new f9s0(11.03f, 0.47f));
            arrayList.add(new j9s0(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.06f));
            arrayList.add(new e9s0(4.56f, 8.0f));
            arrayList.add(new m9s0(6.47f, 6.47f));
            arrayList.add(new j9s0(0.75f, 0.75f, 0.0f, true, true, -1.06f, 1.06f));
            arrayList.add(new e9s0(2.44f, 8.0f));
            arrayList.add(new e9s0(9.97f, 0.47f));
            arrayList.add(new j9s0(0.75f, 0.75f, 0.0f, false, true, 1.06f, 0.0f));
            a180.a(a180Var, arrayList, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            g9p1.a = b180VarB;
        }
        b180 b180VarB2 = i9p1.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.ChevronLeft24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            ArrayList arrayList2 = new ArrayList(32);
            arrayList2.add(new f9s0(15.957f, 2.793f));
            arrayList2.add(new j9s0(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.414f));
            arrayList2.add(new e9s0(8.164f, 12.0f));
            arrayList2.add(new m9s0(7.793f, 7.793f));
            arrayList2.add(new j9s0(1.0f, 1.0f, 0.0f, true, true, -1.414f, 1.414f));
            arrayList2.add(new e9s0(5.336f, 12.0f));
            arrayList2.add(new m9s0(9.207f, -9.207f));
            arrayList2.add(new j9s0(1.0f, 1.0f, 0.0f, false, true, 1.414f, 0.0f));
            a180.a(a180Var2, arrayList2, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            i9p1.b = b180VarB2;
        }
        c = new olx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new hlx((byte) 6);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof olx);
    }

    public final int hashCode() {
        return -1008306067;
    }

    public final String toString() {
        return "ChevronLeft";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
