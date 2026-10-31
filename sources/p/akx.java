package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class akx extends hux {
    public static final Parcelable.Creator<akx> CREATOR;
    public static final akx c;
    public static final byte d;

    static {
        b180 b180VarB = zzo1.a;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Album16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
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
            arrayList2.add(new f9s0(8.0f, 6.5f));
            arrayList2.add(new j9s0(1.5f, 1.5f, 0.0f, true, false, 0.0f, 3.0f));
            arrayList2.add(new j9s0(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f));
            arrayList2.add(new f9s0(5.0f, 8.0f));
            arrayList2.add(new j9s0(3.0f, 3.0f, 0.0f, true, true, 6.0f, 0.0f));
            arrayList2.add(new j9s0(3.0f, 3.0f, 0.0f, false, true, -6.0f, 0.0f));
            a180.a(a180Var, arrayList2, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            zzo1.a = b180VarB;
        }
        b180 b180VarB2 = c0p1.a;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Album24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
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
            arrayList4.add(new f9s0(12.0f, 10.0f));
            arrayList4.add(new j9s0(2.0f, 2.0f, 0.0f, true, false, 0.0f, 4.0f));
            arrayList4.add(new j9s0(2.0f, 2.0f, 0.0f, false, false, 0.0f, -4.0f));
            arrayList4.add(new n9s0(-4.0f, 2.0f));
            arrayList4.add(new j9s0(4.0f, 4.0f, 0.0f, true, true, 8.0f, 0.0f));
            arrayList4.add(new j9s0(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f));
            a180.a(a180Var2, arrayList4, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            c0p1.a = b180VarB2;
        }
        dsx dsxVar = new dsx(b180VarB, b180VarB2);
        b180 b180VarB3 = d0p1.a;
        if (b180VarB3 == null) {
            a180 a180Var3 = new a180("Encore.Vector.AlbumActive16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i3 = bui1.a;
            long j3 = u7h.b;
            n6a1 n6a1Var5 = new n6a1(j3);
            ArrayList arrayList5 = new ArrayList(32);
            arrayList5.add(new f9s0(9.5f, 8.0f));
            arrayList5.add(new j9s0(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f));
            arrayList5.add(new j9s0(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f));
            a180.a(a180Var3, arrayList5, n6a1Var5, 1.0f, 2, 1.0f);
            n6a1 n6a1Var6 = new n6a1(j3);
            ArrayList arrayList6 = new ArrayList(32);
            arrayList6.add(new f9s0(8.0f, 0.0f));
            arrayList6.add(new j9s0(8.0f, 8.0f, 0.0f, true, false, 0.0f, 16.0f));
            arrayList6.add(new a9s0(8.0f, 8.0f, 0.0f, false, false, 8.0f, 0.0f));
            arrayList6.add(new n9s0(3.0f, 8.0f));
            arrayList6.add(new j9s0(3.0f, 3.0f, 0.0f, true, true, -6.0f, 0.0f));
            arrayList6.add(new j9s0(3.0f, 3.0f, 0.0f, false, true, 6.0f, 0.0f));
            a180.a(a180Var3, arrayList6, n6a1Var6, 1.0f, 2, 1.0f);
            b180VarB3 = a180Var3.b();
            d0p1.a = b180VarB3;
        }
        b180 b180VarB4 = g0p1.a;
        if (b180VarB4 == null) {
            a180 a180Var4 = new a180("Encore.Vector.AlbumActive24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i4 = bui1.a;
            long j4 = u7h.b;
            n6a1 n6a1Var7 = new n6a1(j4);
            ArrayList arrayList7 = new ArrayList(32);
            arrayList7.add(new f9s0(12.0f, 10.0f));
            arrayList7.add(new j9s0(2.0f, 2.0f, 0.0f, true, false, 0.0f, 4.0f));
            arrayList7.add(new j9s0(2.0f, 2.0f, 0.0f, false, false, 0.0f, -4.0f));
            a180.a(a180Var4, arrayList7, n6a1Var7, 1.0f, 2, 1.0f);
            n6a1 n6a1Var8 = new n6a1(j4);
            cwh0 cwh0VarG = lf51.g(1.0f, 12.0f);
            cwh0VarG.f(1.0f, 5.925f, 5.925f, 1.0f, 12.0f, 1.0f);
            cwh0VarG.q(11.0f, 4.925f, 11.0f, 11.0f);
            cwh0VarG.q(-4.925f, 11.0f, -11.0f, 11.0f);
            cwh0VarG.p(1.0f, 18.075f, 1.0f, 12.0f);
            cwh0VarG.m(8.159f, -2.816f);
            cwh0VarG.b(4.0f, 4.0f, false, false, 8.0f, 12.0f);
            cwh0VarG.c(4.0f, 4.0f, false, false, 1.184f, 2.841f);
            cwh0VarG.b(4.0f, 4.0f, false, false, 12.0f, 16.0f);
            cwh0VarG.c(4.0f, 4.0f, false, false, 2.816f, -1.159f);
            cwh0VarG.k(0.012f, -0.013f);
            cwh0VarG.k(0.013f, -0.012f);
            cwh0VarG.b(4.0f, 4.0f, false, false, 16.0f, 12.0f);
            cwh0VarG.c(4.0f, 4.0f, false, false, -1.184f, -2.841f);
            cwh0VarG.b(4.0f, 4.0f, false, false, 12.0f, 8.0f);
            cwh0VarG.c(4.0f, 4.0f, false, false, -2.841f, 1.184f);
            a180.a(a180Var4, cwh0VarG.a, n6a1Var8, 1.0f, 2, 1.0f);
            b180VarB4 = a180Var4.b();
            g0p1.a = b180VarB4;
        }
        c = new akx(dsxVar, new dsx(b180VarB3, b180VarB4));
        d = (byte) 8;
        CREATOR = new x7w((byte) 28);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof akx);
    }

    public final int hashCode() {
        return -1490407878;
    }

    public final String toString() {
        return "Album";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
