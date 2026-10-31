package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tkx extends hux {
    public static final Parcelable.Creator<tkx> CREATOR;
    public static final tkx c;
    public static final byte d;

    static {
        b180 b180VarB;
        b180 b180VarB2 = q3p1.a;
        if (b180VarB2 == null) {
            a180 a180Var = new a180("Encore.Vector.Ban16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(8.0f, 0.0f);
            cwh0VarG.c(8.0f, 8.0f, true, false, 0.0f, 16.0f);
            cwh0VarG.b(8.0f, 8.0f, false, false, 8.0f, 0.0f);
            cwh0VarG.l(3.965f, 2.904f);
            cwh0VarG.c(6.5f, 6.5f, false, true, 9.131f, 9.131f);
            hrt.o(cwh0VarG, 2.904f, 3.964f, 12.035f, 13.096f);
            cwh0VarG.c(6.5f, 6.5f, false, true, -9.131f, -9.131f);
            cwh0VarG.e();
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var.b();
            q3p1.a = b180VarB2;
        }
        b180 b180Var = t3p1.a;
        if (b180Var != null) {
            b180VarB = b180Var;
        } else {
            a180 a180Var2 = new a180("Encore.Vector.Ban24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(12.0f, 1.0f);
            cwh0VarG2.f(5.925f, 1.0f, 1.0f, 5.925f, 1.0f, 12.0f);
            cwh0VarG2.q(4.925f, 11.0f, 11.0f, 11.0f);
            cwh0VarG2.q(11.0f, -4.925f, 11.0f, -11.0f);
            cwh0VarG2.p(18.075f, 1.0f, 12.0f, 1.0f);
            cwh0VarG2.l(6.382f, 4.968f);
            cwh0VarG2.c(9.0f, 9.0f, false, true, 12.65f, 12.65f);
            cwh0VarG2.e();
            cwh0VarG2.l(4.968f, 6.382f);
            cwh0VarG2.k(12.65f, 12.65f);
            cwh0VarG2.c(9.0f, 9.0f, false, true, -12.65f, -12.65f);
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB = a180Var2.b();
            t3p1.a = b180VarB;
        }
        dsx dsxVar = new dsx(b180VarB2, b180VarB);
        b180 b180VarB3 = w3p1.a;
        if (b180VarB3 == null) {
            a180 a180Var3 = new a180("Encore.Vector.BanActive16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i3 = bui1.a;
            long j = u7h.b;
            n6a1 n6a1Var3 = new n6a1(j);
            ArrayList arrayList = new ArrayList(32);
            arrayList.add(new f9s0(8.0f, 3.75f));
            arrayList.add(new j9s0(4.23f, 4.23f, 0.0f, false, false, -2.428f, 0.761f));
            arrayList.add(new m9s0(5.917f, 5.917f));
            arrayList.add(new a9s0(4.25f, 4.25f, 0.0f, false, false, 8.0f, 3.75f));
            arrayList.add(new f9s0(3.75f, 8.0f));
            arrayList.add(new k9s0(0.0f, -0.903f, 0.281f, -1.74f, 0.761f, -2.428f));
            arrayList.add(new m9s0(5.917f, 5.917f));
            arrayList.add(new a9s0(4.25f, 4.25f, 0.0f, false, true, 3.75f, 8.0f));
            a180.a(a180Var3, arrayList, n6a1Var3, 1.0f, 2, 1.0f);
            n6a1 n6a1Var4 = new n6a1(j);
            ArrayList arrayList2 = new ArrayList(32);
            arrayList2.add(new f9s0(0.0f, 8.0f));
            arrayList2.add(new j9s0(8.0f, 8.0f, 0.0f, true, true, 16.0f, 0.0f));
            arrayList2.add(new a9s0(8.0f, 8.0f, 0.0f, false, true, 0.0f, 8.0f));
            arrayList2.add(new n9s0(2.25f, 0.0f));
            arrayList2.add(new j9s0(5.75f, 5.75f, 0.0f, true, false, 11.5f, 0.0f));
            arrayList2.add(new j9s0(5.75f, 5.75f, 0.0f, false, false, -11.5f, 0.0f));
            a180.a(a180Var3, arrayList2, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB3 = a180Var3.b();
            w3p1.a = b180VarB3;
        }
        b180 b180VarB4 = x3p1.a;
        if (b180VarB4 == null) {
            a180 a180Var4 = new a180("Encore.Vector.BanActive24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i4 = bui1.a;
            long j2 = u7h.b;
            n6a1 n6a1Var5 = new n6a1(j2);
            ArrayList arrayList3 = new ArrayList(32);
            arrayList3.add(new f9s0(6.0f, 12.0f));
            arrayList3.add(new k9s0(0.0f, -1.296f, 0.41f, -2.496f, 1.11f, -3.477f));
            arrayList3.add(new m9s0(8.366f, 8.368f));
            arrayList3.add(new a9s0(6.0f, 6.0f, 0.0f, false, true, 6.0f, 12.0f));
            arrayList3.add(new n9s0(10.89f, 3.476f));
            arrayList3.add(new e9s0(8.524f, 7.11f));
            arrayList3.add(new j9s0(6.0f, 6.0f, 0.0f, false, true, 8.367f, 8.367f));
            arrayList3.add(b9s0.c);
            a180.a(a180Var4, arrayList3, n6a1Var5, 1.0f, 2, 1.0f);
            n6a1 n6a1Var6 = new n6a1(j2);
            ArrayList arrayList4 = new ArrayList(32);
            arrayList4.add(new f9s0(1.0f, 12.0f));
            arrayList4.add(new c9s0(1.0f, 5.925f, 5.925f, 1.0f, 12.0f, 1.0f));
            arrayList4.add(new p9s0(11.0f, 4.925f, 11.0f, 11.0f));
            arrayList4.add(new p9s0(-4.925f, 11.0f, -11.0f, 11.0f));
            arrayList4.add(new h9s0(1.0f, 18.075f, 1.0f, 12.0f));
            arrayList4.add(new n9s0(11.0f, -8.0f));
            arrayList4.add(new j9s0(8.0f, 8.0f, 0.0f, true, false, 0.0f, 16.0f));
            arrayList4.add(new j9s0(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f));
            a180.a(a180Var4, arrayList4, n6a1Var6, 1.0f, 2, 1.0f);
            b180VarB4 = a180Var4.b();
            x3p1.a = b180VarB4;
        }
        c = new tkx(dsxVar, new dsx(b180VarB3, b180VarB4));
        d = (byte) 8;
        CREATOR = new ckx((byte) 16);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof tkx);
    }

    public final int hashCode() {
        return -1525570918;
    }

    public final String toString() {
        return "Ban";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
