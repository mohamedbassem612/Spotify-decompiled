package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ukx extends hux {
    public static final Parcelable.Creator<ukx> CREATOR;
    public static final ukx c;

    static {
        b180 b180VarB = a4p1.a;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Blend16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            long j = u7h.b;
            n6a1 n6a1Var = new n6a1(j);
            cwh0 cwh0VarG = lf51.g(5.02f, 5.02f);
            cwh0VarG.c(5.6f, 5.6f, false, true, 1.5f, 0.074f);
            cwh0VarG.c(5.506f, 5.506f, false, true, 4.46f, 5.885f);
            cwh0VarG.c(5.5f, 5.5f, true, true, -5.96f, -5.958f);
            cwh0VarG.e();
            cwh0VarG.l(9.324f, 9.324f);
            cwh0VarG.c(4.01f, 4.01f, false, false, -2.648f, -2.648f);
            cwh0VarG.c(4.01f, 4.01f, false, false, 2.648f, 2.648f);
            cwh0VarG.l(5.5f, 14.5f);
            cwh0VarG.c(4.0f, 4.0f, false, false, 3.98f, -3.595f);
            cwh0VarG.b(5.51f, 5.51f, false, true, 5.094f, 6.52f);
            cwh0VarG.b(4.0f, 4.0f, false, false, 5.5f, 14.5f);
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            n6a1 n6a1Var2 = new n6a1(j);
            ArrayList arrayList = new ArrayList(32);
            arrayList.add(new f9s0(12.35f, 9.048f));
            arrayList.add(new a9s0(4.0f, 4.0f, 0.0f, false, false, 10.5f, 1.5f));
            arrayList.add(new j9s0(4.0f, 4.0f, 0.0f, false, false, -3.548f, 2.15f));
            arrayList.add(new j9s0(7.0f, 7.0f, 0.0f, false, false, -1.577f, -0.149f));
            arrayList.add(new a9s0(5.502f, 5.502f, 0.0f, false, true, 16.0f, 5.5f));
            arrayList.add(new j9s0(5.5f, 5.5f, 0.0f, false, true, -3.501f, 5.126f));
            arrayList.add(new m9s0(0.001f, -0.126f));
            arrayList.add(new o9s0(-0.002f, -0.748f, -0.15f, -1.452f));
            a180.a(a180Var, arrayList, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            a4p1.a = b180VarB;
        }
        b180 b180VarB2 = c4p1.a;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Blend24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            long j2 = u7h.b;
            n6a1 n6a1Var3 = new n6a1(j2);
            cwh0 cwh0VarG2 = lf51.g(8.015f, 8.015f);
            cwh0VarG2.c(7.6f, 7.6f, false, true, 1.996f, 0.137f);
            cwh0VarG2.c(7.51f, 7.51f, false, true, 5.837f, 5.837f);
            cwh0VarG2.c(7.5f, 7.5f, false, true, 0.137f, 1.996f);
            cwh0VarG2.b(7.5f, 7.5f, false, true, 8.5f, 23.0f);
            cwh0VarG2.c(7.5f, 7.5f, false, true, -0.485f, -14.985f);
            cwh0VarG2.m(5.683f, 5.683f);
            cwh0VarG2.c(5.52f, 5.52f, false, false, -3.396f, -3.396f);
            cwh0VarG2.c(5.52f, 5.52f, false, false, 3.396f, 3.396f);
            cwh0VarG2.l(8.5f, 21.0f);
            cwh0VarG2.c(5.5f, 5.5f, false, false, 5.49f, -5.152f);
            cwh0VarG2.c(7.51f, 7.51f, false, true, -5.838f, -5.837f);
            cwh0VarG2.b(5.5f, 5.5f, false, false, 8.5f, 21.0f);
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var3, 1.0f, 2, 1.0f);
            n6a1 n6a1Var4 = new n6a1(j2);
            ArrayList arrayList2 = new ArrayList(32);
            arrayList2.add(new f9s0(17.318f, 13.692f));
            arrayList2.add(new a9s0(5.502f, 5.502f, 0.0f, false, false, 15.5f, 3.0f));
            arrayList2.add(new j9s0(5.5f, 5.5f, 0.0f, false, false, -5.192f, 3.682f));
            arrayList2.add(new j9s0(9.0f, 9.0f, 0.0f, false, false, -2.04f, -0.18f));
            arrayList2.add(new j9s0(7.5f, 7.5f, 0.0f, true, true, 9.228f, 9.228f));
            arrayList2.add(new j9s0(9.0f, 9.0f, 0.0f, false, false, -0.179f, -2.039f));
            arrayList2.add(b9s0.c);
            a180.a(a180Var2, arrayList2, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            c4p1.a = b180VarB2;
        }
        dsx dsxVar = new dsx(b180VarB, b180VarB2);
        b180 b180VarB3 = e4p1.a;
        if (b180VarB3 == null) {
            a180 a180Var3 = new a180("Encore.Vector.BlendActive16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i3 = bui1.a;
            long j3 = u7h.b;
            n6a1 n6a1Var5 = new n6a1(j3);
            ArrayList arrayList3 = new ArrayList(32);
            arrayList3.add(new f9s0(16.0f, 5.5f));
            arrayList3.add(new j9s0(5.5f, 5.5f, 0.0f, false, true, -5.02f, 5.48f));
            arrayList3.add(new j9s0(5.5f, 5.5f, 0.0f, false, false, -5.96f, -5.96f));
            arrayList3.add(new a9s0(5.5f, 5.5f, 0.0f, false, true, 16.0f, 5.5f));
            a180.a(a180Var3, arrayList3, n6a1Var5, 1.0f, 2, 1.0f);
            n6a1 n6a1Var6 = new n6a1(j3);
            ArrayList arrayList4 = new ArrayList(32);
            arrayList4.add(new f9s0(0.0f, 10.5f));
            arrayList4.add(new j9s0(5.5f, 5.5f, 0.0f, false, true, 5.02f, -5.48f));
            arrayList4.add(new j9s0(5.5f, 5.5f, 0.0f, false, false, 5.959f, 5.959f));
            arrayList4.add(new a9s0(5.5f, 5.5f, 0.0f, false, true, 0.0f, 10.5f));
            a180.a(a180Var3, arrayList4, n6a1Var6, 1.0f, 2, 1.0f);
            b180VarB3 = a180Var3.b();
            e4p1.a = b180VarB3;
        }
        b180 b180VarB4 = f4p1.a;
        if (b180VarB4 == null) {
            a180 a180Var4 = new a180("Encore.Vector.BlendActive24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i4 = bui1.a;
            long j4 = u7h.b;
            n6a1 n6a1Var7 = new n6a1(j4);
            ArrayList arrayList5 = new ArrayList(32);
            arrayList5.add(new f9s0(23.0f, 8.5f));
            arrayList5.add(new j9s0(7.5f, 7.5f, 0.0f, false, true, -7.015f, 7.485f));
            arrayList5.add(new j9s0(7.5f, 7.5f, 0.0f, false, false, -7.97f, -7.97f));
            arrayList5.add(new a9s0(7.5f, 7.5f, 0.0f, false, true, 23.0f, 8.5f));
            a180.a(a180Var4, arrayList5, n6a1Var7, 1.0f, 2, 1.0f);
            n6a1 n6a1Var8 = new n6a1(j4);
            ArrayList arrayList6 = new ArrayList(32);
            arrayList6.add(new f9s0(1.0f, 15.5f));
            arrayList6.add(new j9s0(7.5f, 7.5f, 0.0f, false, true, 7.015f, -7.485f));
            arrayList6.add(new j9s0(7.5f, 7.5f, 0.0f, false, false, 7.97f, 7.97f));
            arrayList6.add(new a9s0(7.5f, 7.5f, 0.0f, false, true, 1.0f, 15.5f));
            a180.a(a180Var4, arrayList6, n6a1Var8, 1.0f, 2, 1.0f);
            b180VarB4 = a180Var4.b();
            f4p1.a = b180VarB4;
        }
        c = new ukx(dsxVar, new dsx(b180VarB3, b180VarB4));
        CREATOR = new ckx((byte) 17);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ukx);
    }

    public final int hashCode() {
        return -1489481700;
    }

    public final String toString() {
        return "Blend";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
