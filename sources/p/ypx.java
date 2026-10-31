package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ypx extends hux {
    public static final Parcelable.Creator<ypx> CREATOR;
    public static final ypx c;
    public static final byte d;

    static {
        b180 b180VarB = upo1.c;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.PlayAlt16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
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
            arrayList2.add(new f9s0(11.313f, 8.433f));
            arrayList2.add(new j9s0(0.5f, 0.5f, 0.0f, false, false, 0.0f, -0.866f));
            arrayList2.add(new e9s0(6.75f, 4.933f));
            arrayList2.add(new j9s0(0.5f, 0.5f, 0.0f, false, false, -0.75f, 0.433f));
            arrayList2.add(new r9s0(5.268f));
            arrayList2.add(new j9s0(0.5f, 0.5f, 0.0f, false, false, 0.75f, 0.433f));
            arrayList2.add(b9s0.c);
            a180.a(a180Var, arrayList2, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            upo1.c = b180VarB;
        }
        b180 b180VarB2 = wpo1.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.PlayAlt24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            long j2 = u7h.b;
            n6a1 n6a1Var3 = new n6a1(j2);
            ArrayList arrayList3 = new ArrayList(32);
            arrayList3.add(new f9s0(12.0f, 3.0f));
            arrayList3.add(new j9s0(9.0f, 9.0f, 0.0f, true, false, 0.0f, 18.0f));
            arrayList3.add(new j9s0(9.0f, 9.0f, 0.0f, false, false, 0.0f, -18.0f));
            arrayList3.add(new f9s0(1.0f, 12.0f));
            arrayList3.add(new c9s0(1.0f, 5.925f, 5.925f, 1.0f, 12.0f, 1.0f));
            arrayList3.add(new p9s0(11.0f, 4.925f, 11.0f, 11.0f));
            arrayList3.add(new p9s0(-4.925f, 11.0f, -11.0f, 11.0f));
            arrayList3.add(new h9s0(1.0f, 18.075f, 1.0f, 12.0f));
            a180.a(a180Var2, arrayList3, n6a1Var3, 1.0f, 2, 1.0f);
            n6a1 n6a1Var4 = new n6a1(j2);
            ArrayList arrayList4 = new ArrayList(32);
            arrayList4.add(new f9s0(16.911f, 12.433f));
            arrayList4.add(new j9s0(0.5f, 0.5f, 0.0f, false, false, 0.0f, -0.866f));
            arrayList4.add(new e9s0(9.75f, 7.433f));
            arrayList4.add(new j9s0(0.5f, 0.5f, 0.0f, false, false, -0.75f, 0.433f));
            arrayList4.add(new r9s0(8.268f));
            arrayList4.add(new j9s0(0.5f, 0.5f, 0.0f, false, false, 0.75f, 0.433f));
            arrayList4.add(b9s0.c);
            a180.a(a180Var2, arrayList4, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            wpo1.b = b180VarB2;
        }
        dsx dsxVar = new dsx(b180VarB, b180VarB2);
        b180 b180VarB3 = aqo1.a;
        if (b180VarB3 == null) {
            a180 a180Var3 = new a180("Encore.Vector.PlayAltActive16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i3 = bui1.a;
            n6a1 n6a1Var5 = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(0.0f, 8.0f);
            cwh0VarG.c(8.0f, 8.0f, true, true, 16.0f, 0.0f);
            cwh0VarG.b(8.0f, 8.0f, false, true, 0.0f, 8.0f);
            cwh0VarG.m(12.045f, -0.433f);
            cwh0VarG.j(5.75f, 3.933f);
            cwh0VarG.c(0.5f, 0.5f, false, false, -0.75f, 0.433f);
            cwh0VarG.v(7.268f);
            cwh0VarG.c(0.5f, 0.5f, false, false, 0.75f, 0.433f);
            cwh0VarG.k(6.295f, -3.634f);
            cwh0VarG.c(0.5f, 0.5f, false, false, 0.0f, -0.866f);
            a180.a(a180Var3, cwh0VarG.a, n6a1Var5, 1.0f, 2, 1.0f);
            b180VarB3 = a180Var3.b();
            aqo1.a = b180VarB3;
        }
        b180 b180VarB4 = fqo1.d;
        if (b180VarB4 == null) {
            a180 a180Var4 = new a180("Encore.Vector.PlayAltActive24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i4 = bui1.a;
            n6a1 n6a1Var6 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(1.0f, 12.0f);
            cwh0VarG2.f(1.0f, 5.925f, 5.925f, 1.0f, 12.0f, 1.0f);
            cwh0VarG2.q(11.0f, 4.925f, 11.0f, 11.0f);
            cwh0VarG2.q(-4.925f, 11.0f, -11.0f, 11.0f);
            cwh0VarG2.p(1.0f, 18.075f, 1.0f, 12.0f);
            cwh0VarG2.m(8.75f, -4.567f);
            cwh0VarG2.c(0.5f, 0.5f, false, false, -0.75f, 0.433f);
            cwh0VarG2.v(8.268f);
            cwh0VarG2.c(0.5f, 0.5f, false, false, 0.75f, 0.433f);
            cwh0VarG2.k(7.161f, -4.134f);
            cwh0VarG2.c(0.5f, 0.5f, false, false, 0.0f, -0.866f);
            cwh0VarG2.e();
            a180.a(a180Var4, cwh0VarG2.a, n6a1Var6, 1.0f, 2, 1.0f);
            b180VarB4 = a180Var4.b();
            fqo1.d = b180VarB4;
        }
        c = new ypx(dsxVar, new dsx(b180VarB3, b180VarB4));
        d = (byte) 8;
        CREATOR = new yox((byte) 25);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ypx);
    }

    public final int hashCode() {
        return -1631051040;
    }

    public final String toString() {
        return "PlayAlt";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
