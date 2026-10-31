package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xpx extends hux {
    public static final Parcelable.Creator<xpx> CREATOR;
    public static final xpx c;
    public static final byte d;

    static {
        b180 b180VarB = ppo1.d;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Play16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            ArrayList arrayList = new ArrayList(32);
            arrayList.add(new f9s0(3.0f, 1.713f));
            arrayList.add(new j9s0(0.7f, 0.7f, 0.0f, false, true, 1.05f, -0.607f));
            arrayList.add(new m9s0(10.89f, 6.288f));
            arrayList.add(new j9s0(0.7f, 0.7f, 0.0f, false, true, 0.0f, 1.212f));
            arrayList.add(new e9s0(4.05f, 14.894f));
            arrayList.add(new a9s0(0.7f, 0.7f, 0.0f, false, true, 3.0f, 14.288f));
            arrayList.add(b9s0.c);
            a180.a(a180Var, arrayList, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            ppo1.d = b180VarB;
        }
        b180 b180VarB2 = rpo1.d;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Play24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            ArrayList arrayList2 = new ArrayList(32);
            arrayList2.add(new n9s0(7.05f, 3.606f));
            arrayList2.add(new m9s0(13.49f, 7.788f));
            arrayList2.add(new j9s0(0.7f, 0.7f, 0.0f, false, true, 0.0f, 1.212f));
            arrayList2.add(new e9s0(7.05f, 20.394f));
            arrayList2.add(new a9s0(0.7f, 0.7f, 0.0f, false, true, 6.0f, 19.788f));
            arrayList2.add(new s9s0(4.212f));
            arrayList2.add(new j9s0(0.7f, 0.7f, 0.0f, false, true, 1.05f, -0.606f));
            a180.a(a180Var2, arrayList2, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            rpo1.d = b180VarB2;
        }
        c = new xpx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new yox((byte) 24);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof xpx);
    }

    public final int hashCode() {
        return -47630839;
    }

    public final String toString() {
        return "Play";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
