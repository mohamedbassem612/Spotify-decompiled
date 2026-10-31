package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class asx extends hux {
    public static final Parcelable.Creator<asx> CREATOR;
    public static final asx c;

    static {
        b180 b180VarB = i3p1.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.RepeatOnce16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            long j = u7h.b;
            n6a1 n6a1Var = new n6a1(j);
            cwh0 cwh0VarG = lf51.g(0.0f, 4.75f);
            cwh0VarG.b(3.75f, 3.75f, false, true, 3.75f, 1.0f);
            cwh0VarG.i(0.75f);
            cwh0VarG.v(1.5f);
            cwh0VarG.i(-0.75f);
            cwh0VarG.b(2.25f, 2.25f, false, false, 1.5f, 4.75f);
            cwh0VarG.v(5.0f);
            cwh0VarG.b(2.25f, 2.25f, false, false, 3.75f, 12.0f);
            cwh0VarG.h(5.0f);
            cwh0VarG.v(1.5f);
            cwh0VarG.h(3.75f);
            cwh0VarG.b(3.75f, 3.75f, false, true, 0.0f, 9.75f);
            cwh0VarG.e();
            cwh0VarG.l(12.25f, 2.5f);
            cwh0VarG.c(2.25f, 2.25f, false, true, 2.25f, 2.25f);
            cwh0VarG.v(5.0f);
            cwh0VarG.b(2.25f, 2.25f, false, true, 12.25f, 12.0f);
            cwh0VarG.h(9.81f);
            cwh0VarG.k(1.018f, -1.018f);
            cwh0VarG.c(0.75f, 0.75f, false, false, -1.06f, -1.06f);
            cwh0VarG.j(6.939f, 12.75f);
            cwh0VarG.k(2.829f, 2.828f);
            cwh0VarG.c(0.75f, 0.75f, true, false, 1.06f, -1.06f);
            cwh0VarG.j(9.811f, 13.5f);
            cwh0VarG.i(2.439f);
            cwh0VarG.b(3.75f, 3.75f, false, false, 16.0f, 9.75f);
            cwh0VarG.v(-5.0f);
            cwh0VarG.b(3.75f, 3.75f, false, false, 12.25f, 1.0f);
            cwh0VarG.i(-0.75f);
            cwh0VarG.v(1.5f);
            cwh0VarG.e();
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            n6a1 n6a1Var2 = new n6a1(j);
            cwh0 cwh0Var = new cwh0();
            cwh0Var.m(8.0f, 1.85f);
            cwh0Var.k(0.77f, 0.694f);
            cwh0Var.h(6.095f);
            cwh0Var.u(1.488f);
            cwh0Var.o(1.046f, -0.077f, 1.507f, -0.385f);
            cwh0Var.o(0.474f, -0.308f, 0.583f, -0.913f);
            cwh0Var.i(1.32f);
            cwh0Var.u(8.0f);
            cwh0Var.h(8.0f);
            cwh0Var.e();
            a180.a(a180Var, cwh0Var.a, n6a1Var2, 1.0f, 2, 1.0f);
            n6a1 n6a1Var3 = new n6a1(j);
            ArrayList arrayList = new ArrayList(32);
            arrayList.add(new f9s0(8.77f, 2.544f));
            arrayList.add(new e9s0(8.0f, 1.85f));
            arrayList.add(new r9s0(0.693f));
            arrayList.add(b9s0.c);
            a180.a(a180Var, arrayList, n6a1Var3, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            i3p1.b = b180VarB;
        }
        b180 b180VarB2 = l3p1.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.RepeatOnce24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            long j2 = u7h.b;
            n6a1 n6a1Var4 = new n6a1(j2);
            cwh0 cwh0VarG2 = lf51.g(1.0f, 7.0f);
            cwh0VarG2.c(5.0f, 5.0f, false, true, 5.0f, -5.0f);
            rjx.w(cwh0VarG2, 1.0f, 2.0f, 6.0f, 4.0f);
            cwh0VarG2.c(3.0f, 3.0f, false, false, -3.0f, 3.0f);
            cwh0VarG2.v(8.0f);
            cwh0VarG2.c(3.0f, 3.0f, false, false, 3.0f, 3.0f);
            rjx.w(cwh0VarG2, 1.0f, 2.0f, 6.0f, 20.0f);
            cwh0VarG2.c(5.0f, 5.0f, false, true, -5.0f, -5.0f);
            cwh0VarG2.e();
            cwh0VarG2.l(18.0f, 4.0f);
            cwh0VarG2.i(-1.0f);
            cwh0VarG2.j(17.0f, 2.0f);
            cwh0VarG2.i(1.0f);
            cwh0VarG2.c(5.0f, 5.0f, false, true, 5.0f, 5.0f);
            cwh0VarG2.v(8.0f);
            cwh0VarG2.c(5.0f, 5.0f, false, true, -5.0f, 5.0f);
            rjx.w(cwh0VarG2, -7.202f, -2.0f, 18.0f, 18.0f);
            cwh0VarG2.c(3.0f, 3.0f, false, false, 3.0f, -3.0f);
            cwh0VarG2.j(21.0f, 7.0f);
            cwh0VarG2.c(3.0f, 3.0f, false, false, -3.0f, -3.0f);
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var4, 1.0f, 2, 1.0f);
            n6a1 n6a1Var5 = new n6a1(j2);
            cwh0 cwh0VarG3 = lf51.g(14.5f, 15.288f);
            cwh0VarG3.c(1.0f, 1.0f, false, true, 0.0f, 1.414f);
            cwh0VarG3.j(12.202f, 19.0f);
            cwh0VarG3.k(2.298f, 2.298f);
            cwh0VarG3.c(1.0f, 1.0f, false, true, -1.414f, 1.415f);
            cwh0VarG3.j(9.373f, 19.0f);
            cwh0VarG3.k(3.713f, -3.712f);
            cwh0VarG3.c(1.0f, 1.0f, false, true, 1.414f, 0.0f);
            cwh0VarG3.l(11.967f, 3.202f);
            cwh0VarG3.k(1.008f, 0.91f);
            cwh0VarG3.h(9.559f);
            cwh0VarG3.v(-1.4f);
            cwh0VarG3.o(1.316f, -0.098f, 1.918f, -0.49f);
            cwh0VarG3.g(0.602f, -0.392f, 0.649f, -0.649f, 0.742f, -1.162f);
            cwh0VarG3.i(1.75f);
            cwh0VarG3.u(11.0f);
            cwh0VarG3.i(-2.002f);
            cwh0VarG3.e();
            a180.a(a180Var2, cwh0VarG3.a, n6a1Var5, 1.0f, 2, 1.0f);
            n6a1 n6a1Var6 = new n6a1(j2);
            ArrayList arrayList2 = new ArrayList(32);
            arrayList2.add(new n9s0(12.975f, 4.112f));
            arrayList2.add(new m9s0(-1.008f, -0.91f));
            arrayList2.add(new r9s0(0.91f));
            arrayList2.add(b9s0.c);
            a180.a(a180Var2, arrayList2, n6a1Var6, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            l3p1.b = b180VarB2;
        }
        c = new asx(new dsx(b180VarB, b180VarB2), null);
        CREATOR = new jrx((byte) 16);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof asx);
    }

    public final int hashCode() {
        return -1577586223;
    }

    public final String toString() {
        return "RepeatOnce";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
