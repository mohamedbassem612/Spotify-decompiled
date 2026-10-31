package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class elx extends hux {
    public static final Parcelable.Creator<elx> CREATOR;
    public static final elx c;
    public static final byte d;

    static {
        b180 b180VarB = r6p1.a;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.ChartDown16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            ArrayList arrayList = new ArrayList(32);
            arrayList.add(new n9s0(14.0f, 6.0f));
            arrayList.add(new m9s0(-6.0f, 6.0f));
            arrayList.add(new m9s0(-6.0f, -6.0f));
            arrayList.add(b9s0.c);
            a180.a(a180Var, arrayList, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            r6p1.a = b180VarB;
        }
        b180 b180VarB2 = t6p1.a;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.ChartDown24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            ArrayList arrayList2 = new ArrayList(32);
            arrayList2.add(new n9s0(19.0f, 9.0f));
            arrayList2.add(new m9s0(-7.0f, 7.0f));
            arrayList2.add(new m9s0(-7.0f, -7.0f));
            arrayList2.add(b9s0.c);
            a180.a(a180Var2, arrayList2, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            t6p1.a = b180VarB2;
        }
        c = new elx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new ckx((byte) 27);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof elx);
    }

    public final int hashCode() {
        return -585686037;
    }

    public final String toString() {
        return "ChartDown";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
