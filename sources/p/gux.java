package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gux extends hux {
    public static final Parcelable.Creator<gux> CREATOR;
    public static final gux c;
    public static final byte d;

    static {
        b180 b180VarB = w2g0.d;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.XAlt16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
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
            cwh0 cwh0VarG = lf51.g(11.005f, 4.995f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.0f, 1.06f);
            cwh0VarG.j(9.061f, 8.0f);
            cwh0VarG.k(1.944f, 1.945f);
            cwh0VarG.c(0.75f, 0.75f, true, true, -1.06f, 1.06f);
            cwh0VarG.j(8.0f, 9.061f);
            cwh0VarG.k(-1.945f, 1.944f);
            cwh0VarG.c(0.75f, 0.75f, true, true, -1.06f, -1.06f);
            cwh0VarG.j(6.939f, 8.0f);
            cwh0VarG.j(4.995f, 6.055f);
            cwh0VarG.c(0.75f, 0.75f, true, true, 1.06f, -1.06f);
            cwh0VarG.j(8.0f, 6.939f);
            cwh0VarG.k(1.945f, -1.944f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 1.06f, 0.0f);
            a180.a(a180Var, cwh0VarG.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            w2g0.d = b180VarB;
        }
        b180 b180VarB2 = x2g0.d;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.XAlt24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            long j2 = u7h.b;
            n6a1 n6a1Var3 = new n6a1(j2);
            ArrayList arrayList2 = new ArrayList(32);
            arrayList2.add(new f9s0(11.999f, 3.0f));
            arrayList2.add(new j9s0(9.0f, 9.0f, 0.0f, true, false, 0.0f, 18.0f));
            arrayList2.add(new j9s0(9.0f, 9.0f, 0.0f, false, false, 0.0f, -18.0f));
            arrayList2.add(new n9s0(-11.0f, 9.0f));
            arrayList2.add(new k9s0(0.0f, -6.075f, 4.925f, -11.0f, 11.0f, -11.0f));
            arrayList2.add(new p9s0(11.0f, 4.925f, 11.0f, 11.0f));
            arrayList2.add(new p9s0(-4.925f, 11.0f, -11.0f, 11.0f));
            arrayList2.add(new p9s0(-11.0f, -4.925f, -11.0f, -11.0f));
            a180.a(a180Var2, arrayList2, n6a1Var3, 1.0f, 2, 1.0f);
            n6a1 n6a1Var4 = new n6a1(j2);
            cwh0 cwh0VarG2 = lf51.g(16.242f, 16.243f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, -1.415f, 0.0f);
            cwh0VarG2.j(12.0f, 13.414f);
            cwh0VarG2.k(-2.828f, 2.829f);
            cwh0VarG2.c(1.0f, 1.0f, true, true, -1.415f, -1.415f);
            cwh0VarG2.j(10.585f, 12.0f);
            cwh0VarG2.j(7.756f, 9.172f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 1.415f, -1.415f);
            cwh0VarG2.k(2.828f, 2.829f);
            cwh0VarG2.k(2.828f, -2.829f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 1.415f, 1.415f);
            cwh0VarG2.j(13.413f, 12.0f);
            cwh0VarG2.k(2.829f, 2.828f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 0.0f, 1.415f);
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            x2g0.d = b180VarB2;
        }
        dsx dsxVar = new dsx(b180VarB, b180VarB2);
        b180 b180VarB3 = rqg0.e;
        if (b180VarB3 == null) {
            a180 a180Var3 = new a180("Encore.Vector.XAltActive16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i3 = bui1.a;
            n6a1 n6a1Var5 = new n6a1(u7h.b);
            cwh0 cwh0VarG3 = lf51.g(0.0f, 8.0f);
            cwh0VarG3.c(8.0f, 8.0f, true, true, 16.0f, 0.0f);
            cwh0VarG3.b(8.0f, 8.0f, false, true, 0.0f, 8.0f);
            cwh0VarG3.m(5.53f, -3.53f);
            cwh0VarG3.c(0.75f, 0.75f, false, false, -1.06f, 1.06f);
            cwh0VarG3.j(6.94f, 8.0f);
            cwh0VarG3.k(-2.47f, 2.47f);
            cwh0VarG3.c(0.75f, 0.75f, true, false, 1.06f, 1.06f);
            cwh0VarG3.j(8.0f, 9.06f);
            cwh0VarG3.k(2.47f, 2.47f);
            cwh0VarG3.c(0.75f, 0.75f, true, false, 1.06f, -1.06f);
            cwh0VarG3.j(9.06f, 8.0f);
            cwh0VarG3.k(2.47f, -2.47f);
            cwh0VarG3.c(0.75f, 0.75f, false, false, -1.06f, -1.06f);
            cwh0VarG3.j(8.0f, 6.94f);
            cwh0VarG3.e();
            a180.a(a180Var3, cwh0VarG3.a, n6a1Var5, 1.0f, 2, 1.0f);
            b180VarB3 = a180Var3.b();
            rqg0.e = b180VarB3;
        }
        b180 b180VarB4 = yah0.c;
        if (b180VarB4 == null) {
            a180 a180Var4 = new a180("Encore.Vector.XAltActive24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i4 = bui1.a;
            n6a1 n6a1Var6 = new n6a1(u7h.b);
            cwh0 cwh0VarG4 = lf51.g(0.999f, 12.0f);
            cwh0VarG4.g(0.0f, -6.075f, 4.925f, -11.0f, 11.0f, -11.0f);
            cwh0VarG4.q(11.0f, 4.925f, 11.0f, 11.0f);
            cwh0VarG4.q(-4.925f, 11.0f, -11.0f, 11.0f);
            cwh0VarG4.q(-11.0f, -4.925f, -11.0f, -11.0f);
            cwh0VarG4.m(15.95f, -3.536f);
            cwh0VarG4.c(1.0f, 1.0f, false, false, -1.414f, -1.414f);
            cwh0VarG4.k(-3.536f, 3.536f);
            cwh0VarG4.j(8.464f, 7.05f);
            cwh0VarG4.c(1.0f, 1.0f, true, false, -1.415f, 1.414f);
            cwh0VarG4.j(10.585f, 12.0f);
            cwh0VarG4.k(-3.536f, 3.536f);
            cwh0VarG4.c(1.0f, 1.0f, true, false, 1.415f, 1.414f);
            cwh0VarG4.k(3.535f, -3.536f);
            cwh0VarG4.k(3.536f, 3.536f);
            cwh0VarG4.c(1.0f, 1.0f, false, false, 1.414f, -1.414f);
            cwh0VarG4.j(13.413f, 12.0f);
            cwh0VarG4.e();
            a180.a(a180Var4, cwh0VarG4.a, n6a1Var6, 1.0f, 2, 1.0f);
            b180VarB4 = a180Var4.b();
            yah0.c = b180VarB4;
        }
        c = new gux(dsxVar, new dsx(b180VarB3, b180VarB4));
        d = (byte) 8;
        CREATOR = new utx((byte) 10);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof gux);
    }

    public final int hashCode() {
        return -47433498;
    }

    public final String toString() {
        return "XAlt";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
