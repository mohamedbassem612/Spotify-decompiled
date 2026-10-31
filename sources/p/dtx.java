package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dtx extends hux {
    public static final Parcelable.Creator<dtx> CREATOR;
    public static final dtx c;
    public static final byte d;

    static {
        b180 b180VarB = n9p1.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Stopwatch16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            long j = u7h.b;
            n6a1 n6a1Var = new n6a1(j);
            cwh0 cwh0VarG = lf51.g(5.2f, 0.0f);
            cwh0VarG.g(-0.387f, 0.0f, -0.7f, 0.336f, -0.7f, 0.75f);
            cwh0VarG.q(0.313f, 0.75f, 0.7f, 0.75f);
            cwh0VarG.i(2.05f);
            cwh0VarG.v(0.25f);
            cwh0VarG.c(0.75f, 0.75f, false, false, 1.5f, 0.0f);
            cwh0VarG.j(8.75f, 1.5f);
            cwh0VarG.i(2.05f);
            cwh0VarG.g(0.387f, 0.0f, 0.7f, -0.336f, 0.7f, -0.75f);
            cwh0VarG.p(11.187f, 0.0f, 10.8f, 0.0f);
            cwh0VarG.e();
            cwh0VarG.l(8.75f, 7.0f);
            cwh0VarG.c(0.75f, 0.75f, false, false, -1.5f, 0.0f);
            cwh0VarG.v(3.0f);
            cwh0VarG.c(0.75f, 0.75f, false, false, 1.5f, 0.0f);
            cwh0VarG.e();
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            n6a1 n6a1Var2 = new n6a1(j);
            ArrayList arrayList = new ArrayList(32);
            arrayList.add(new f9s0(1.5f, 9.5f));
            arrayList.add(new j9s0(6.5f, 6.5f, 0.0f, true, true, 13.0f, 0.0f));
            arrayList.add(new j9s0(6.5f, 6.5f, 0.0f, false, true, -13.0f, 0.0f));
            arrayList.add(new f9s0(8.0f, 4.444f));
            arrayList.add(new j9s0(5.056f, 5.056f, 0.0f, true, false, 0.0f, 10.112f));
            arrayList.add(new a9s0(5.056f, 5.056f, 0.0f, false, false, 8.0f, 4.444f));
            a180.a(a180Var, arrayList, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            n9p1.b = b180VarB;
        }
        b180 b180VarB2 = p9p1.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Stopwatch24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            long j2 = u7h.b;
            n6a1 n6a1Var3 = new n6a1(j2);
            cwh0 cwh0VarG2 = lf51.g(8.0f, 1.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 1.0f, -1.0f);
            cwh0VarG2.i(6.0f);
            cwh0VarG2.c(1.0f, 1.0f, true, true, 0.0f, 2.0f);
            cwh0VarG2.i(-2.0f);
            cwh0VarG2.c(1.0f, 1.0f, true, true, -2.0f, 0.0f);
            cwh0VarG2.h(9.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, -1.0f, -1.0f);
            cwh0VarG2.m(5.0f, 8.0f);
            cwh0VarG2.c(1.0f, 1.0f, true, false, -2.0f, 0.0f);
            cwh0VarG2.v(5.0f);
            cwh0VarG2.c(1.0f, 1.0f, true, false, 2.0f, 0.0f);
            cwh0VarG2.e();
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var3, 1.0f, 2, 1.0f);
            n6a1 n6a1Var4 = new n6a1(j2);
            ArrayList arrayList2 = new ArrayList(32);
            arrayList2.add(new f9s0(12.0f, 4.0f));
            arrayList2.add(new c9s0(6.477f, 4.0f, 2.0f, 8.477f, 2.0f, 14.0f));
            arrayList2.add(new p9s0(4.477f, 10.0f, 10.0f, 10.0f));
            arrayList2.add(new p9s0(10.0f, -4.477f, 10.0f, -10.0f));
            arrayList2.add(new h9s0(17.523f, 4.0f, 12.0f, 4.0f));
            arrayList2.add(new f9s0(4.0f, 14.0f));
            arrayList2.add(new j9s0(8.0f, 8.0f, 0.0f, true, true, 16.0f, 0.0f));
            arrayList2.add(new j9s0(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f));
            a180.a(a180Var2, arrayList2, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            p9p1.b = b180VarB2;
        }
        dsx dsxVar = new dsx(b180VarB, b180VarB2);
        b180 b180VarB3 = s9p1.b;
        if (b180VarB3 == null) {
            a180 a180Var3 = new a180("Encore.Vector.StopwatchActive16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i3 = bui1.a;
            n6a1 n6a1Var5 = new n6a1(u7h.b);
            cwh0 cwh0VarG3 = lf51.g(5.2f, 0.0f);
            cwh0VarG3.g(-0.387f, 0.0f, -0.7f, 0.336f, -0.7f, 0.75f);
            cwh0VarG3.q(0.313f, 0.75f, 0.7f, 0.75f);
            cwh0VarG3.i(2.05f);
            cwh0VarG3.v(0.25f);
            cwh0VarG3.c(0.75f, 0.75f, false, false, 1.5f, 0.0f);
            cwh0VarG3.u(1.5f);
            cwh0VarG3.i(2.05f);
            cwh0VarG3.g(0.387f, 0.0f, 0.7f, -0.336f, 0.7f, -0.75f);
            cwh0VarG3.p(11.187f, 0.0f, 10.8f, 0.0f);
            cwh0VarG3.e();
            cwh0VarG3.l(8.0f, 16.0f);
            cwh0VarG3.b(6.5f, 6.5f, true, false, 8.0f, 3.0f);
            cwh0VarG3.c(6.5f, 6.5f, false, false, 0.0f, 13.0f);
            cwh0VarG3.m(0.75f, -9.0f);
            cwh0VarG3.v(3.0f);
            cwh0VarG3.c(0.75f, 0.75f, false, true, -1.5f, 0.0f);
            cwh0VarG3.u(7.0f);
            cwh0VarG3.c(0.75f, 0.75f, false, true, 1.5f, 0.0f);
            a180.a(a180Var3, cwh0VarG3.a, n6a1Var5, 1.0f, 2, 1.0f);
            b180VarB3 = a180Var3.b();
            s9p1.b = b180VarB3;
        }
        b180 b180VarB4 = t9p1.b;
        if (b180VarB4 == null) {
            a180 a180Var4 = new a180("Encore.Vector.StopwatchActive24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i4 = bui1.a;
            n6a1 n6a1Var6 = new n6a1(u7h.b);
            cwh0 cwh0VarG4 = lf51.g(9.0f, 0.0f);
            cwh0VarG4.c(1.0f, 1.0f, false, false, 0.0f, 2.0f);
            cwh0VarG4.i(2.0f);
            cwh0VarG4.c(1.0f, 1.0f, true, false, 2.0f, 0.0f);
            cwh0VarG4.i(2.0f);
            cwh0VarG4.c(1.0f, 1.0f, true, false, 0.0f, -2.0f);
            cwh0VarG4.e();
            cwh0VarG4.l(12.0f, 24.0f);
            cwh0VarG4.g(5.523f, 0.0f, 10.0f, -4.477f, 10.0f, -10.0f);
            cwh0VarG4.p(17.523f, 4.0f, 12.0f, 4.0f);
            cwh0VarG4.p(2.0f, 8.477f, 2.0f, 14.0f);
            cwh0VarG4.q(4.477f, 10.0f, 10.0f, 10.0f);
            cwh0VarG4.m(1.0f, -15.0f);
            cwh0VarG4.v(5.0f);
            cwh0VarG4.c(1.0f, 1.0f, true, true, -2.0f, 0.0f);
            cwh0VarG4.j(11.0f, 9.0f);
            cwh0VarG4.c(1.0f, 1.0f, true, true, 2.0f, 0.0f);
            a180.a(a180Var4, cwh0VarG4.a, n6a1Var6, 1.0f, 2, 1.0f);
            b180VarB4 = a180Var4.b();
            t9p1.b = b180VarB4;
        }
        c = new dtx(dsxVar, new dsx(b180VarB3, b180VarB4));
        d = (byte) 8;
        CREATOR = new psx((byte) 13);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof dtx);
    }

    public final int hashCode() {
        return -514768808;
    }

    public final String toString() {
        return "Stopwatch";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
