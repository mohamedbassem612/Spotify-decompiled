package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tmx extends hux {
    public static final Parcelable.Creator<tmx> CREATOR;
    public static final tmx c;
    public static final byte d;

    static {
        b180 b180VarB = mym.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Download16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            long j = u7h.b;
            n6a1 n6a1Var = new n6a1(j);
            cwh0 cwh0VarG = lf51.g(4.995f, 8.745f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 1.06f, 0.0f);
            cwh0VarG.j(7.25f, 9.939f);
            cwh0VarG.u(4.0f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 1.5f, 0.0f);
            cwh0VarG.v(5.94f);
            cwh0VarG.k(1.195f, -1.195f);
            cwh0VarG.c(0.75f, 0.75f, true, true, 1.06f, 1.06f);
            cwh0VarG.j(8.0f, 12.811f);
            cwh0VarG.k(-0.528f, -0.528f);
            cwh0VarG.k(-0.005f, -0.005f);
            cwh0VarG.k(-2.472f, -2.473f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.0f, -1.06f);
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            n6a1 n6a1Var2 = new n6a1(j);
            ArrayList arrayList = new ArrayList(32);
            arrayList.add(new f9s0(0.0f, 8.0f));
            arrayList.add(new j9s0(8.0f, 8.0f, 0.0f, true, true, 16.0f, 0.0f));
            arrayList.add(new a9s0(8.0f, 8.0f, 0.0f, false, true, 0.0f, 8.0f));
            arrayList.add(new n9s0(8.0f, -6.5f));
            arrayList.add(new j9s0(6.5f, 6.5f, 0.0f, true, false, 0.0f, 13.0f));
            arrayList.add(new j9s0(6.5f, 6.5f, 0.0f, false, false, 0.0f, -13.0f));
            a180.a(a180Var, arrayList, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            mym.b = b180VarB;
        }
        b180 b180VarB2 = bin.a;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Download24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
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
            cwh0 cwh0VarG2 = lf51.g(12.0f, 6.05f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 1.0f, 1.0f);
            cwh0VarG2.v(7.486f);
            cwh0VarG2.k(1.793f, -1.793f);
            cwh0VarG2.c(1.0f, 1.0f, true, true, 1.414f, 1.414f);
            cwh0VarG2.j(12.0f, 18.364f);
            cwh0VarG2.k(-4.207f, -4.207f);
            cwh0VarG2.c(1.0f, 1.0f, true, true, 1.414f, -1.414f);
            cwh0VarG2.j(11.0f, 14.536f);
            cwh0VarG2.u(7.05f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 1.0f, -1.0f);
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            bin.a = b180VarB2;
        }
        c = new tmx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new mmx((byte) 5);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof tmx);
    }

    public final int hashCode() {
        return 526647517;
    }

    public final String toString() {
        return "Download";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
