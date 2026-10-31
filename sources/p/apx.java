package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class apx extends hux {
    public static final Parcelable.Creator<apx> CREATOR;
    public static final apx c;
    public static final byte d;

    static {
        b180 b180VarB = lgo1.c;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Minus16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            ArrayList arrayList = new ArrayList(32);
            arrayList.add(new f9s0(14.25f, 8.0f));
            arrayList.add(new j9s0(0.75f, 0.75f, 0.0f, false, true, -0.75f, 0.75f));
            arrayList.add(new l9s0(-11.0f));
            arrayList.add(new j9s0(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f));
            arrayList.add(new l9s0(11.0f));
            arrayList.add(new j9s0(0.75f, 0.75f, 0.0f, false, true, 0.75f, 0.75f));
            a180.a(a180Var, arrayList, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            lgo1.c = b180VarB;
        }
        b180 b180VarB2 = mgo1.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Minus24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            ArrayList arrayList2 = new ArrayList(32);
            arrayList2.add(new f9s0(2.0f, 12.0f));
            arrayList2.add(new j9s0(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f));
            arrayList2.add(new l9s0(18.0f));
            arrayList2.add(new j9s0(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f));
            arrayList2.add(new d9s0(3.0f));
            arrayList2.add(new j9s0(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f));
            a180.a(a180Var2, arrayList2, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            mgo1.b = b180VarB2;
        }
        c = new apx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new yox((byte) 1);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof apx);
    }

    public final int hashCode() {
        return -1479403461;
    }

    public final String toString() {
        return "Minus";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
