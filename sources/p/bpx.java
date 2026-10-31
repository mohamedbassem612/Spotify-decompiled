package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bpx extends hux {
    public static final Parcelable.Creator<bpx> CREATOR;
    public static final bpx c;
    public static final byte d;

    static {
        b180 b180VarB;
        b180 b180Var = qgo1.b;
        if (b180Var != null) {
            b180VarB = b180Var;
        } else {
            a180 a180Var = new a180("Encore.Vector.MinusAlt16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
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
            ArrayList arrayList2 = new ArrayList(32);
            arrayList2.add(new f9s0(12.0f, 8.75f));
            arrayList2.add(new d9s0(4.0f));
            arrayList2.add(new r9s0(-1.5f));
            arrayList2.add(new l9s0(8.0f));
            arrayList2.add(b9s0.c);
            a180.a(a180Var, arrayList2, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            qgo1.b = b180VarB;
        }
        b180 b180VarB2 = vgo1.a;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.MinusAlt24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            long j2 = u7h.b;
            n6a1 n6a1Var3 = new n6a1(j2);
            ArrayList arrayList3 = new ArrayList(32);
            arrayList3.add(new f9s0(16.999f, 11.0f));
            arrayList3.add(new l9s0(-10.0f));
            arrayList3.add(new r9s0(2.0f));
            arrayList3.add(new l9s0(10.0f));
            arrayList3.add(b9s0.c);
            a180.a(a180Var2, arrayList3, n6a1Var3, 1.0f, 2, 1.0f);
            n6a1 n6a1Var4 = new n6a1(j2);
            ArrayList arrayList4 = new ArrayList(32);
            arrayList4.add(new f9s0(11.999f, 1.0f));
            arrayList4.add(new k9s0(-6.075f, 0.0f, -11.0f, 4.925f, -11.0f, 11.0f));
            arrayList4.add(new p9s0(4.925f, 11.0f, 11.0f, 11.0f));
            arrayList4.add(new p9s0(11.0f, -4.925f, 11.0f, -11.0f));
            arrayList4.add(new p9s0(-4.925f, -11.0f, -11.0f, -11.0f));
            arrayList4.add(new n9s0(-9.0f, 11.0f));
            arrayList4.add(new j9s0(9.0f, 9.0f, 0.0f, true, true, 18.0f, 0.0f));
            arrayList4.add(new j9s0(9.0f, 9.0f, 0.0f, false, true, -18.0f, 0.0f));
            a180.a(a180Var2, arrayList4, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            vgo1.a = b180VarB2;
        }
        dsx dsxVar = new dsx(b180VarB, b180VarB2);
        b180 b180VarB3 = wgo1.b;
        if (b180VarB3 == null) {
            a180 a180Var3 = new a180("Encore.Vector.MinusAltActive16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i3 = bui1.a;
            n6a1 n6a1Var5 = new n6a1(u7h.b);
            ArrayList arrayList5 = new ArrayList(32);
            arrayList5.add(new f9s0(0.0f, 8.0f));
            arrayList5.add(new j9s0(8.0f, 8.0f, 0.0f, true, true, 16.0f, 0.0f));
            arrayList5.add(new a9s0(8.0f, 8.0f, 0.0f, false, true, 0.0f, 8.0f));
            arrayList5.add(new n9s0(4.0f, 0.75f));
            arrayList5.add(new l9s0(8.0f));
            arrayList5.add(new r9s0(-1.5f));
            arrayList5.add(new d9s0(4.0f));
            arrayList5.add(b9s0.c);
            a180.a(a180Var3, arrayList5, n6a1Var5, 1.0f, 2, 1.0f);
            b180VarB3 = a180Var3.b();
            wgo1.b = b180VarB3;
        }
        b180 b180VarB4 = zgo1.b;
        if (b180VarB4 == null) {
            a180 a180Var4 = new a180("Encore.Vector.MinusAltActive24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i4 = bui1.a;
            n6a1 n6a1Var6 = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(0.999f, 12.0f);
            cwh0VarG.g(0.0f, -6.075f, 4.925f, -11.0f, 11.0f, -11.0f);
            cwh0VarG.q(11.0f, 4.925f, 11.0f, 11.0f);
            cwh0VarG.q(-4.925f, 11.0f, -11.0f, 11.0f);
            cwh0VarG.q(-11.0f, -4.925f, -11.0f, -11.0f);
            cwh0VarG.m(17.0f, -1.0f);
            cwh0VarG.i(-12.0f);
            cwh0VarG.v(2.0f);
            cwh0VarG.i(12.0f);
            cwh0VarG.e();
            a180.a(a180Var4, cwh0VarG.a, n6a1Var6, 1.0f, 2, 1.0f);
            b180VarB4 = a180Var4.b();
            zgo1.b = b180VarB4;
        }
        c = new bpx(dsxVar, new dsx(b180VarB3, b180VarB4));
        d = (byte) 8;
        CREATOR = new yox((byte) 2);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof bpx);
    }

    public final int hashCode() {
        return 2045950830;
    }

    public final String toString() {
        return "MinusAlt";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
