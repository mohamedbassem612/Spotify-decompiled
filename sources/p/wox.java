package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wox extends hux {
    public static final Parcelable.Creator<wox> CREATOR;
    public static final wox c;
    public static final byte d;

    static {
        b180 b180VarB;
        b180 b180Var = r4o1.b;
        if (b180Var != null) {
            b180VarB = b180Var;
        } else {
            a180 a180Var = new a180("Encore.Vector.Mic16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            long j = u7h.b;
            n6a1 n6a1Var = new n6a1(j);
            cwh0 cwh0VarG = lf51.g(4.0f, 4.0f);
            cwh0VarG.c(4.0f, 4.0f, true, true, 8.0f, 0.0f);
            cwh0VarG.v(3.0f);
            cwh0VarG.c(4.0f, 4.0f, false, true, -8.0f, 0.0f);
            cwh0VarG.e();
            cwh0VarG.l(8.0f, 1.5f);
            cwh0VarG.b(2.5f, 2.5f, false, false, 5.5f, 4.0f);
            cwh0VarG.v(3.0f);
            cwh0VarG.c(2.5f, 2.5f, false, false, 5.0f, 0.0f);
            cwh0VarG.j(10.5f, 4.0f);
            cwh0VarG.b(2.5f, 2.5f, false, false, 8.0f, 1.5f);
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            n6a1 n6a1Var2 = new n6a1(j);
            cwh0 cwh0VarP = rjx.p(2.25f, 6.0f, 1.0f);
            cwh0VarP.c(5.75f, 5.75f, false, false, 11.5f, 0.0f);
            cwh0VarP.u(6.0f);
            cwh0VarP.i(1.5f);
            cwh0VarP.v(1.0f);
            cwh0VarP.c(7.25f, 7.25f, false, true, -6.5f, 7.212f);
            cwh0VarP.u(16.0f);
            cwh0VarP.i(-1.5f);
            cwh0VarP.v(-1.788f);
            cwh0VarP.b(7.25f, 7.25f, false, true, 0.75f, 7.0f);
            cwh0VarP.u(6.0f);
            cwh0VarP.e();
            a180.a(a180Var, cwh0VarP.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            r4o1.b = b180VarB;
        }
        b180 b180VarB2 = y4o1.e;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Mic24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            long j2 = u7h.b;
            n6a1 n6a1Var3 = new n6a1(j2);
            cwh0 cwh0VarG2 = lf51.g(7.0f, 5.0f);
            cwh0VarG2.c(5.0f, 5.0f, false, true, 10.0f, 0.0f);
            cwh0VarG2.v(6.0f);
            cwh0VarG2.c(5.0f, 5.0f, false, true, -10.0f, 0.0f);
            cwh0VarG2.e();
            cwh0VarG2.l(12.0f, 2.0f);
            cwh0VarG2.c(3.0f, 3.0f, false, false, -3.0f, 3.0f);
            cwh0VarG2.v(6.0f);
            cwh0VarG2.c(3.0f, 3.0f, true, false, 6.0f, 0.0f);
            cwh0VarG2.j(15.0f, 5.0f);
            cwh0VarG2.c(3.0f, 3.0f, false, false, -3.0f, -3.0f);
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var3, 1.0f, 2, 1.0f);
            n6a1 n6a1Var4 = new n6a1(j2);
            cwh0 cwh0VarG3 = lf51.g(3.0f, 7.0f);
            cwh0VarG3.c(1.0f, 1.0f, false, true, 1.0f, 1.0f);
            cwh0VarG3.v(3.0f);
            cwh0VarG3.c(8.0f, 8.0f, true, false, 16.0f, 0.0f);
            cwh0VarG3.u(8.0f);
            cwh0VarG3.c(1.0f, 1.0f, true, true, 2.0f, 0.0f);
            cwh0VarG3.v(3.0f);
            cwh0VarG3.g(0.0f, 5.185f, -3.947f, 9.449f, -9.0f, 9.95f);
            cwh0VarG3.u(24.0f);
            cwh0VarG3.i(-2.0f);
            cwh0VarG3.v(-3.05f);
            cwh0VarG3.g(-5.053f, -0.5f, -9.0f, -4.764f, -9.0f, -9.95f);
            cwh0VarG3.u(8.0f);
            cwh0VarG3.c(1.0f, 1.0f, false, true, 1.0f, -1.0f);
            a180.a(a180Var2, cwh0VarG3.a, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            y4o1.e = b180VarB2;
        }
        dsx dsxVar = new dsx(b180VarB, b180VarB2);
        b180 b180VarB3 = a6o1.d;
        if (b180VarB3 == null) {
            a180 a180Var3 = new a180("Encore.Vector.MicActive16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i3 = bui1.a;
            long j3 = u7h.b;
            n6a1 n6a1Var5 = new n6a1(j3);
            ArrayList arrayList = new ArrayList(32);
            arrayList.add(new f9s0(4.0f, 4.0f));
            arrayList.add(new j9s0(4.0f, 4.0f, 0.0f, true, true, 8.0f, 0.0f));
            arrayList.add(new r9s0(3.0f));
            arrayList.add(new j9s0(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f));
            arrayList.add(b9s0.c);
            a180.a(a180Var3, arrayList, n6a1Var5, 1.0f, 2, 1.0f);
            n6a1 n6a1Var6 = new n6a1(j3);
            cwh0 cwh0Var = new cwh0();
            cwh0Var.l(2.25f, 7.0f);
            cwh0Var.u(6.0f);
            cwh0Var.h(0.75f);
            cwh0Var.v(1.0f);
            cwh0Var.c(7.25f, 7.25f, false, false, 6.5f, 7.212f);
            cwh0Var.u(16.0f);
            cwh0Var.i(1.5f);
            cwh0Var.v(-1.788f);
            cwh0Var.b(7.25f, 7.25f, false, false, 15.25f, 7.0f);
            cwh0Var.u(6.0f);
            cwh0Var.i(-1.5f);
            cwh0Var.v(1.0f);
            cwh0Var.c(5.75f, 5.75f, false, true, -11.5f, 0.0f);
            a180.a(a180Var3, cwh0Var.a, n6a1Var6, 1.0f, 2, 1.0f);
            b180VarB3 = a180Var3.b();
            a6o1.d = b180VarB3;
        }
        b180 b180VarB4 = f6o1.f;
        if (b180VarB4 == null) {
            a180 a180Var4 = new a180("Encore.Vector.MicActive24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i4 = bui1.a;
            long j4 = u7h.b;
            n6a1 n6a1Var7 = new n6a1(j4);
            ArrayList arrayList2 = new ArrayList(32);
            arrayList2.add(new f9s0(12.0f, 0.0f));
            arrayList2.add(new j9s0(5.0f, 5.0f, 0.0f, false, false, -5.0f, 5.0f));
            arrayList2.add(new r9s0(6.0f));
            arrayList2.add(new j9s0(5.0f, 5.0f, 0.0f, false, false, 10.0f, 0.0f));
            arrayList2.add(new s9s0(5.0f));
            arrayList2.add(new j9s0(5.0f, 5.0f, 0.0f, false, false, -5.0f, -5.0f));
            a180.a(a180Var4, arrayList2, n6a1Var7, 1.0f, 2, 1.0f);
            n6a1 n6a1Var8 = new n6a1(j4);
            cwh0 cwh0VarG4 = lf51.g(3.0f, 7.0f);
            cwh0VarG4.c(1.0f, 1.0f, false, true, 1.0f, 1.0f);
            cwh0VarG4.v(3.0f);
            cwh0VarG4.c(8.0f, 8.0f, true, false, 16.0f, 0.0f);
            cwh0VarG4.u(8.0f);
            cwh0VarG4.c(1.0f, 1.0f, true, true, 2.0f, 0.0f);
            cwh0VarG4.v(3.0f);
            cwh0VarG4.g(0.0f, 5.185f, -3.947f, 9.449f, -9.0f, 9.95f);
            cwh0VarG4.u(24.0f);
            cwh0VarG4.i(-2.0f);
            cwh0VarG4.v(-3.05f);
            cwh0VarG4.g(-5.053f, -0.5f, -9.0f, -4.764f, -9.0f, -9.95f);
            cwh0VarG4.u(8.0f);
            cwh0VarG4.c(1.0f, 1.0f, false, true, 1.0f, -1.0f);
            a180.a(a180Var4, cwh0VarG4.a, n6a1Var8, 1.0f, 2, 1.0f);
            b180VarB4 = a180Var4.b();
            f6o1.f = b180VarB4;
        }
        c = new wox(dsxVar, new dsx(b180VarB3, b180VarB4));
        d = (byte) 8;
        CREATOR = new snx((byte) 28);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof wox);
    }

    public final int hashCode() {
        return -1525560110;
    }

    public final String toString() {
        return "Mic";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
