package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mrx extends hux {
    public static final Parcelable.Creator<mrx> CREATOR;
    public static final mrx c;
    public static final byte d;

    static {
        b180 b180VarB = g0p1.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Podcasts16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            long j = u7h.b;
            n6a1 n6a1Var = new n6a1(j);
            ArrayList arrayList = new ArrayList(32);
            arrayList.add(new f9s0(3.404f, 3.404f));
            arrayList.add(new j9s0(6.5f, 6.5f, 0.0f, false, true, 9.192f, 9.192f));
            arrayList.add(new m9s0(1.06f, 1.06f));
            arrayList.add(new j9s0(8.0f, 8.0f, 0.0f, true, false, -11.313f, 0.0f));
            arrayList.add(new m9s0(1.06f, -1.06f));
            arrayList.add(new j9s0(6.5f, 6.5f, 0.0f, false, true, 0.0f, -9.192f));
            arrayList.add(b9s0.c);
            a180.a(a180Var, arrayList, n6a1Var, 1.0f, 2, 1.0f);
            n6a1 n6a1Var2 = new n6a1(j);
            cwh0 cwh0VarG = lf51.g(11.0f, 9.25f);
            cwh0VarG.c(3.0f, 3.0f, false, true, -2.25f, 2.905f);
            cwh0VarG.v(1.474f);
            cwh0VarG.k(1.773f, 1.488f);
            cwh0VarG.c(0.5f, 0.5f, false, true, -0.321f, 0.883f);
            cwh0VarG.h(5.799f);
            cwh0VarG.c(0.5f, 0.5f, false, true, -0.322f, -0.883f);
            cwh0VarG.k(1.773f, -1.488f);
            cwh0VarG.v(-1.474f);
            cwh0VarG.b(3.0f, 3.0f, false, true, 5.0f, 9.25f);
            cwh0VarG.u(7.0f);
            cwh0VarG.c(3.0f, 3.0f, false, true, 6.0f, 0.0f);
            cwh0VarG.e();
            cwh0VarG.l(8.0f, 5.5f);
            cwh0VarG.b(1.5f, 1.5f, false, false, 6.5f, 7.0f);
            cwh0VarG.v(2.25f);
            cwh0VarG.c(1.5f, 1.5f, false, false, 3.0f, 0.0f);
            cwh0VarG.u(7.0f);
            cwh0VarG.b(1.5f, 1.5f, false, false, 8.0f, 5.5f);
            a180.a(a180Var, cwh0VarG.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            g0p1.b = b180VarB;
        }
        b180 b180VarB2 = h0p1.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Podcasts24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            long j2 = u7h.b;
            n6a1 n6a1Var3 = new n6a1(j2);
            cwh0 cwh0VarG2 = lf51.g(12.0f, 3.0f);
            cwh0VarG2.c(9.0f, 9.0f, false, false, -7.046f, 14.6f);
            cwh0VarG2.j(3.42f, 18.886f);
            cwh0VarG2.b(10.95f, 10.95f, false, true, 1.0f, 12.0f);
            cwh0VarG2.f(1.0f, 5.925f, 5.925f, 1.0f, 12.0f, 1.0f);
            cwh0VarG2.q(11.0f, 4.925f, 11.0f, 11.0f);
            cwh0VarG2.c(10.96f, 10.96f, false, true, -2.421f, 6.886f);
            cwh0VarG2.j(19.046f, 17.6f);
            cwh0VarG2.b(9.0f, 9.0f, false, false, 12.0f, 3.0f);
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var3, 1.0f, 2, 1.0f);
            n6a1 n6a1Var4 = new n6a1(j2);
            cwh0 cwh0VarG3 = lf51.g(12.0f, 7.0f);
            cwh0VarG3.c(4.0f, 4.0f, false, false, -4.0f, 4.0f);
            cwh0VarG3.v(3.0f);
            cwh0VarG3.c(4.0f, 4.0f, false, false, 3.0f, 3.874f);
            cwh0VarG3.v(1.965f);
            cwh0VarG3.k(-2.715f, 2.278f);
            cwh0VarG3.c(0.5f, 0.5f, false, false, 0.322f, 0.883f);
            cwh0VarG3.i(6.786f);
            cwh0VarG3.c(0.5f, 0.5f, false, false, 0.322f, -0.883f);
            cwh0VarG3.j(13.0f, 19.839f);
            cwh0VarG3.v(-1.965f);
            cwh0VarG3.g(1.725f, -0.444f, 3.0f, -2.01f, 3.0f, -3.874f);
            cwh0VarG3.v(-3.0f);
            cwh0VarG3.c(4.0f, 4.0f, false, false, -4.0f, -4.0f);
            cwh0VarG3.m(2.0f, 7.0f);
            cwh0VarG3.c(2.0f, 2.0f, false, true, -4.0f, 0.0f);
            cwh0VarG3.v(-3.0f);
            cwh0VarG3.c(2.0f, 2.0f, true, true, 4.0f, 0.0f);
            cwh0VarG3.e();
            a180.a(a180Var2, cwh0VarG3.a, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            h0p1.b = b180VarB2;
        }
        dsx dsxVar = new dsx(b180VarB, b180VarB2);
        b180 b180VarB3 = i0p1.b;
        if (b180VarB3 == null) {
            a180 a180Var3 = new a180("Encore.Vector.PodcastsActive16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i3 = bui1.a;
            long j3 = u7h.b;
            n6a1 n6a1Var5 = new n6a1(j3);
            ArrayList arrayList2 = new ArrayList(32);
            arrayList2.add(new f9s0(12.596f, 3.404f));
            arrayList2.add(new j9s0(6.5f, 6.5f, 0.0f, false, false, -9.192f, 9.192f));
            arrayList2.add(new m9s0(-1.06f, 1.06f));
            arrayList2.add(new j9s0(8.0f, 8.0f, 0.0f, true, true, 11.313f, 0.0f));
            arrayList2.add(new m9s0(-1.06f, -1.06f));
            arrayList2.add(new j9s0(6.5f, 6.5f, 0.0f, false, false, 0.0f, -9.192f));
            arrayList2.add(b9s0.c);
            a180.a(a180Var3, arrayList2, n6a1Var5, 1.0f, 2, 1.0f);
            n6a1 n6a1Var6 = new n6a1(j3);
            cwh0 cwh0VarP = rjx.p(7.25f, 13.63f, -1.475f);
            cwh0VarP.b(3.0f, 3.0f, false, true, 5.0f, 9.25f);
            cwh0VarP.u(7.0f);
            cwh0VarP.c(3.0f, 3.0f, false, true, 6.0f, 0.0f);
            cwh0VarP.v(2.25f);
            cwh0VarP.c(3.0f, 3.0f, false, true, -2.25f, 2.905f);
            cwh0VarP.v(1.474f);
            cwh0VarP.k(1.773f, 1.488f);
            cwh0VarP.c(0.5f, 0.5f, false, true, -0.321f, 0.883f);
            cwh0VarP.h(5.799f);
            cwh0VarP.c(0.5f, 0.5f, false, true, -0.322f, -0.883f);
            cwh0VarP.e();
            a180.a(a180Var3, cwh0VarP.a, n6a1Var6, 1.0f, 2, 1.0f);
            b180VarB3 = a180Var3.b();
            i0p1.b = b180VarB3;
        }
        b180 b180VarB4 = j0p1.b;
        if (b180VarB4 == null) {
            a180 a180Var4 = new a180("Encore.Vector.PodcastsActive24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i4 = bui1.a;
            long j4 = u7h.b;
            n6a1 n6a1Var7 = new n6a1(j4);
            cwh0 cwh0VarG4 = lf51.g(3.421f, 18.886f);
            cwh0VarG4.b(10.95f, 10.95f, false, true, 1.001f, 12.0f);
            cwh0VarG4.f(1.0f, 5.925f, 5.924f, 1.0f, 12.0f, 1.0f);
            cwh0VarG4.g(6.074f, 0.0f, 11.0f, 4.925f, 11.0f, 11.0f);
            cwh0VarG4.g(0.0f, 2.606f, -0.907f, 5.001f, -2.422f, 6.886f);
            cwh0VarG4.k(-2.3f, -1.93f);
            cwh0VarG4.c(8.0f, 8.0f, true, false, -12.56f, 0.0f);
            cwh0VarG4.k(-2.298f, 1.93f);
            cwh0VarG4.e();
            a180.a(a180Var4, cwh0VarG4.a, n6a1Var7, 1.0f, 2, 1.0f);
            n6a1 n6a1Var8 = new n6a1(j4);
            cwh0 cwh0VarG5 = lf51.g(12.0f, 7.0f);
            cwh0VarG5.c(4.0f, 4.0f, false, false, -4.0f, 4.0f);
            cwh0VarG5.v(3.0f);
            cwh0VarG5.c(4.0f, 4.0f, false, false, 3.0f, 3.874f);
            cwh0VarG5.v(1.965f);
            cwh0VarG5.k(-2.715f, 2.278f);
            cwh0VarG5.c(0.5f, 0.5f, false, false, 0.322f, 0.883f);
            cwh0VarG5.i(6.786f);
            cwh0VarG5.c(0.5f, 0.5f, false, false, 0.322f, -0.883f);
            cwh0VarG5.j(13.0f, 19.839f);
            cwh0VarG5.v(-1.965f);
            cwh0VarG5.g(1.725f, -0.444f, 3.0f, -2.01f, 3.0f, -3.874f);
            cwh0VarG5.v(-3.0f);
            cwh0VarG5.c(4.0f, 4.0f, false, false, -4.0f, -4.0f);
            a180.a(a180Var4, cwh0VarG5.a, n6a1Var8, 1.0f, 2, 1.0f);
            b180VarB4 = a180Var4.b();
            j0p1.b = b180VarB4;
        }
        c = new mrx(dsxVar, new dsx(b180VarB3, b180VarB4));
        d = (byte) 8;
        CREATOR = new jrx((byte) 2);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof mrx);
    }

    public final int hashCode() {
        return -588900796;
    }

    public final String toString() {
        return "Podcasts";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
