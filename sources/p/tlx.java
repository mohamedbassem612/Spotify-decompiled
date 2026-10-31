package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tlx extends hux {
    public static final Parcelable.Creator<tlx> CREATOR;
    public static final tlx c;
    public static final byte d;

    static {
        b180 b180VarB = jap1.a;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.CircleLine16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            ArrayList arrayList = new ArrayList(32);
            arrayList.add(new f9s0(14.5f, 8.0f));
            arrayList.add(new a9s0(6.5f, 6.5f, 0.0f, true, false, 8.0f, 14.5f));
            arrayList.add(new s9s0(16.0f));
            arrayList.add(new a9s0(8.0f, 8.0f, 0.0f, true, true, 8.0f, 0.0f));
            arrayList.add(new j9s0(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f));
            arrayList.add(new r9s0(-1.5f));
            arrayList.add(new a9s0(6.5f, 6.5f, 0.0f, false, false, 14.5f, 8.0f));
            a180.a(a180Var, arrayList, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            jap1.a = b180VarB;
        }
        b180 b180VarB2 = lap1.a;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.CircleLine24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(21.0f, 12.0f);
            cwh0VarG.c(9.0f, 9.0f, true, false, -9.0f, 9.0f);
            cwh0VarG.v(2.0f);
            cwh0VarG.f(5.925f, 23.0f, 1.0f, 18.075f, 1.0f, 12.0f);
            cwh0VarG.p(5.925f, 1.0f, 12.0f, 1.0f);
            cwh0VarG.q(11.0f, 4.925f, 11.0f, 11.0f);
            cwh0VarG.q(-4.925f, 11.0f, -11.0f, 11.0f);
            cwh0VarG.v(-2.0f);
            cwh0VarG.c(9.0f, 9.0f, false, false, 9.0f, -9.0f);
            a180.a(a180Var2, cwh0VarG.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            lap1.a = b180VarB2;
        }
        c = new tlx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new hlx((byte) 11);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof tlx);
    }

    public final int hashCode() {
        return 446853113;
    }

    public final String toString() {
        return "CircleLine";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
