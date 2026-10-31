package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class eox extends hux {
    public static final Parcelable.Creator<eox> CREATOR;
    public static final eox c;
    public static final byte d;

    static {
        b180 b180VarB;
        b180 b180Var = eqn1.c;
        if (b180Var != null) {
            b180VarB = b180Var;
        } else {
            a180 a180Var = new a180("Encore.Vector.InformationAlt16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            long j = u7h.b;
            n6a1 n6a1Var = new n6a1(j);
            ArrayList arrayList = new ArrayList(32);
            arrayList.add(new f9s0(8.0f, 14.5f));
            arrayList.add(new j9s0(6.5f, 6.5f, 0.0f, true, true, 0.0f, -13.0f));
            arrayList.add(new j9s0(6.5f, 6.5f, 0.0f, false, true, 0.0f, 13.0f));
            arrayList.add(new f9s0(0.0f, 8.0f));
            arrayList.add(new j9s0(8.0f, 8.0f, 0.0f, true, false, 16.0f, 0.0f));
            arrayList.add(new a9s0(8.0f, 8.0f, 0.0f, false, false, 0.0f, 8.0f));
            a180.a(a180Var, arrayList, n6a1Var, 1.0f, 2, 1.0f);
            n6a1 n6a1Var2 = new n6a1(j);
            cwh0 cwh0Var = new cwh0();
            cwh0Var.l(7.25f, 7.0f);
            cwh0Var.v(5.0f);
            cwh0Var.i(1.5f);
            rjx.u(cwh0Var, 8.75f, 7.0f, 7.25f, 3.974f);
            cwh0Var.v(1.5f);
            cwh0Var.i(1.5f);
            cwh0Var.v(-1.5f);
            cwh0Var.e();
            a180.a(a180Var, cwh0Var.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            eqn1.c = b180VarB;
        }
        b180 b180VarB2 = hqn1.c;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.InformationAlt24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            long j2 = u7h.b;
            n6a1 n6a1Var3 = new n6a1(j2);
            cwh0 cwh0Var2 = new cwh0();
            cwh0Var2.l(11.0f, 6.0f);
            cwh0Var2.v(2.0f);
            cwh0Var2.i(2.0f);
            rjx.u(cwh0Var2, 13.0f, 6.0f, 11.0f, 10.0f);
            cwh0Var2.v(8.0f);
            cwh0Var2.i(2.0f);
            cwh0Var2.v(-8.0f);
            cwh0Var2.e();
            a180.a(a180Var2, cwh0Var2.a, n6a1Var3, 1.0f, 2, 1.0f);
            n6a1 n6a1Var4 = new n6a1(j2);
            ArrayList arrayList2 = new ArrayList(32);
            arrayList2.add(new f9s0(12.0f, 21.0f));
            arrayList2.add(new j9s0(9.0f, 9.0f, 0.0f, true, true, 0.0f, -18.0f));
            arrayList2.add(new j9s0(9.0f, 9.0f, 0.0f, false, true, 0.0f, 18.0f));
            arrayList2.add(new f9s0(1.0f, 12.0f));
            arrayList2.add(new k9s0(0.0f, 6.075f, 4.925f, 11.0f, 11.0f, 11.0f));
            arrayList2.add(new p9s0(11.0f, -4.925f, 11.0f, -11.0f));
            arrayList2.add(new h9s0(18.075f, 1.0f, 12.0f, 1.0f));
            arrayList2.add(new h9s0(1.0f, 5.925f, 1.0f, 12.0f));
            a180.a(a180Var2, arrayList2, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            hqn1.c = b180VarB2;
        }
        dsx dsxVar = new dsx(b180VarB, b180VarB2);
        b180 b180VarB3 = kqn1.h;
        if (b180VarB3 == null) {
            a180 a180Var3 = new a180("Encore.Vector.InformationAltActive16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i3 = bui1.a;
            n6a1 n6a1Var5 = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(0.0f, 8.0f);
            cwh0VarG.c(8.0f, 8.0f, true, false, 16.0f, 0.0f);
            cwh0VarG.b(8.0f, 8.0f, false, false, 0.0f, 8.0f);
            cwh0VarG.m(7.25f, -3.526f);
            cwh0VarG.v(-1.5f);
            cwh0VarG.i(1.5f);
            cwh0VarG.v(1.5f);
            cwh0VarG.e();
            cwh0VarG.l(7.25f, 13.0f);
            cwh0VarG.j(7.25f, 6.0f);
            cwh0VarG.i(1.5f);
            cwh0VarG.v(7.0f);
            cwh0VarG.e();
            a180.a(a180Var3, cwh0VarG.a, n6a1Var5, 1.0f, 2, 1.0f);
            b180VarB3 = a180Var3.b();
            kqn1.h = b180VarB3;
        }
        b180 b180VarB4 = mqn1.e;
        if (b180VarB4 == null) {
            a180 a180Var4 = new a180("Encore.Vector.InformationAltActive24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i4 = bui1.a;
            n6a1 n6a1Var6 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(1.0f, 12.0f);
            cwh0VarG2.g(0.0f, 6.075f, 4.925f, 11.0f, 11.0f, 11.0f);
            cwh0VarG2.q(11.0f, -4.925f, 11.0f, -11.0f);
            cwh0VarG2.p(18.075f, 1.0f, 12.0f, 1.0f);
            cwh0VarG2.p(1.0f, 5.925f, 1.0f, 12.0f);
            cwh0VarG2.m(10.0f, -5.0f);
            cwh0VarG2.j(11.0f, 5.0f);
            cwh0VarG2.i(2.0f);
            cwh0VarG2.v(2.0f);
            cwh0VarG2.e();
            cwh0VarG2.l(11.0f, 18.0f);
            cwh0VarG2.j(11.0f, 9.0f);
            cwh0VarG2.i(2.0f);
            cwh0VarG2.v(9.0f);
            cwh0VarG2.e();
            a180.a(a180Var4, cwh0VarG2.a, n6a1Var6, 1.0f, 2, 1.0f);
            b180VarB4 = a180Var4.b();
            mqn1.e = b180VarB4;
        }
        c = new eox(dsxVar, new dsx(b180VarB3, b180VarB4));
        d = (byte) 8;
        CREATOR = new snx((byte) 11);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof eox);
    }

    public final int hashCode() {
        return -719367822;
    }

    public final String toString() {
        return "InformationAlt";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
