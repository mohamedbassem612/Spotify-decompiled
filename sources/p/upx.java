package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class upx extends hux {
    public static final Parcelable.Creator<upx> CREATOR;
    public static final upx c;
    public static final byte d;

    static {
        b180 b180VarB;
        b180 b180Var = boo1.b;
        if (b180Var != null) {
            b180VarB = b180Var;
        } else {
            a180 a180Var = new a180("Encore.Vector.Payment16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            long j = u7h.b;
            n6a1 n6a1Var = new n6a1(j);
            ArrayList arrayList = new ArrayList(32);
            arrayList.add(new f9s0(4.0f, 11.5f));
            arrayList.add(new l9s0(4.0f));
            arrayList.add(new s9s0(10.0f));
            arrayList.add(new d9s0(4.0f));
            arrayList.add(b9s0.c);
            a180.a(a180Var, arrayList, n6a1Var, 1.0f, 2, 1.0f);
            n6a1 n6a1Var2 = new n6a1(j);
            cwh0 cwh0VarG = lf51.g(0.0f, 3.75f);
            cwh0VarG.f(0.0f, 2.784f, 0.784f, 2.0f, 1.75f, 2.0f);
            cwh0VarG.i(12.5f);
            cwh0VarG.g(0.966f, 0.0f, 1.75f, 0.784f, 1.75f, 1.75f);
            cwh0VarG.v(9.5f);
            cwh0VarG.b(1.75f, 1.75f, false, true, 14.25f, 15.0f);
            cwh0VarG.j(1.75f, 15.0f);
            cwh0VarG.b(1.75f, 1.75f, false, true, 0.0f, 13.25f);
            cwh0VarG.e();
            cwh0VarG.l(1.75f, 3.5f);
            cwh0VarG.c(0.25f, 0.25f, false, false, -0.25f, 0.25f);
            cwh0VarG.j(1.5f, 6.0f);
            cwh0VarG.i(13.0f);
            cwh0VarG.j(14.5f, 3.75f);
            cwh0VarG.c(0.25f, 0.25f, false, false, -0.25f, -0.25f);
            cwh0VarG.e();
            cwh0VarG.l(1.5f, 13.25f);
            cwh0VarG.g(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f);
            cwh0VarG.i(12.5f);
            cwh0VarG.c(0.25f, 0.25f, false, false, 0.25f, -0.25f);
            rjx.r(cwh0VarG, 14.5f, 7.5f, -13.0f);
            a180.a(a180Var, cwh0VarG.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            boo1.b = b180VarB;
        }
        b180 b180VarB2 = foo1.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Payment24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            long j2 = u7h.b;
            n6a1 n6a1Var3 = new n6a1(j2);
            ArrayList arrayList2 = new ArrayList(32);
            arrayList2.add(new f9s0(6.0f, 16.0f));
            arrayList2.add(new l9s0(5.0f));
            arrayList2.add(new r9s0(-2.0f));
            arrayList2.add(new d9s0(6.0f));
            arrayList2.add(b9s0.c);
            a180.a(a180Var2, arrayList2, n6a1Var3, 1.0f, 2, 1.0f);
            n6a1 n6a1Var4 = new n6a1(j2);
            cwh0 cwh0VarG2 = lf51.g(1.0f, 6.0f);
            cwh0VarG2.c(3.0f, 3.0f, false, true, 3.0f, -3.0f);
            cwh0VarG2.i(16.0f);
            cwh0VarG2.c(3.0f, 3.0f, false, true, 3.0f, 3.0f);
            cwh0VarG2.v(12.0f);
            cwh0VarG2.c(3.0f, 3.0f, false, true, -3.0f, 3.0f);
            cwh0VarG2.j(4.0f, 21.0f);
            cwh0VarG2.c(3.0f, 3.0f, false, true, -3.0f, -3.0f);
            cwh0VarG2.e();
            cwh0VarG2.l(4.0f, 5.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, false, -1.0f, 1.0f);
            cwh0VarG2.v(2.0f);
            cwh0VarG2.i(18.0f);
            cwh0VarG2.j(21.0f, 6.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, false, -1.0f, -1.0f);
            cwh0VarG2.e();
            cwh0VarG2.l(3.0f, 18.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, false, 1.0f, 1.0f);
            cwh0VarG2.i(16.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, false, 1.0f, -1.0f);
            cwh0VarG2.v(-8.0f);
            cwh0VarG2.j(3.0f, 10.0f);
            cwh0VarG2.e();
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            foo1.b = b180VarB2;
        }
        dsx dsxVar = new dsx(b180VarB, b180VarB2);
        b180 b180VarB3 = ioo1.c;
        if (b180VarB3 == null) {
            a180 a180Var3 = new a180("Encore.Vector.PaymentActive16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i3 = bui1.a;
            n6a1 n6a1Var5 = new n6a1(u7h.b);
            cwh0 cwh0VarG3 = lf51.g(1.75f, 2.0f);
            cwh0VarG3.b(1.75f, 1.75f, false, false, 0.0f, 3.75f);
            cwh0VarG3.u(6.0f);
            cwh0VarG3.i(16.0f);
            cwh0VarG3.u(3.75f);
            cwh0VarG3.b(1.75f, 1.75f, false, false, 14.25f, 2.0f);
            cwh0VarG3.e();
            cwh0VarG3.l(0.0f, 13.25f);
            cwh0VarG3.u(7.5f);
            cwh0VarG3.i(16.0f);
            cwh0VarG3.v(5.75f);
            cwh0VarG3.b(1.75f, 1.75f, false, true, 14.25f, 15.0f);
            cwh0VarG3.h(1.75f);
            cwh0VarG3.b(1.75f, 1.75f, false, true, 0.0f, 13.25f);
            cwh0VarG3.m(4.0f, -1.75f);
            cwh0VarG3.i(4.0f);
            cwh0VarG3.u(10.0f);
            cwh0VarG3.h(4.0f);
            cwh0VarG3.e();
            a180.a(a180Var3, cwh0VarG3.a, n6a1Var5, 1.0f, 2, 1.0f);
            b180VarB3 = a180Var3.b();
            ioo1.c = b180VarB3;
        }
        b180 b180VarB4 = loo1.c;
        if (b180VarB4 == null) {
            a180 a180Var4 = new a180("Encore.Vector.PaymentActive24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i4 = bui1.a;
            n6a1 n6a1Var6 = new n6a1(u7h.b);
            cwh0 cwh0VarG4 = lf51.g(1.0f, 6.0f);
            cwh0VarG4.c(3.0f, 3.0f, false, true, 3.0f, -3.0f);
            cwh0VarG4.i(16.0f);
            cwh0VarG4.c(3.0f, 3.0f, false, true, 3.0f, 3.0f);
            cwh0VarG4.v(2.0f);
            cwh0VarG4.j(1.0f, 8.0f);
            cwh0VarG4.e();
            rjx.z(cwh0VarG4, 1.0f, 10.0f, 22.0f, 8.0f);
            cwh0VarG4.c(3.0f, 3.0f, false, true, -3.0f, 3.0f);
            cwh0VarG4.j(4.0f, 21.0f);
            cwh0VarG4.c(3.0f, 3.0f, false, true, -3.0f, -3.0f);
            cwh0VarG4.e();
            cwh0VarG4.l(6.0f, 16.0f);
            cwh0VarG4.i(5.0f);
            cwh0VarG4.v(-2.0f);
            cwh0VarG4.j(6.0f, 14.0f);
            cwh0VarG4.e();
            a180.a(a180Var4, cwh0VarG4.a, n6a1Var6, 1.0f, 2, 1.0f);
            b180VarB4 = a180Var4.b();
            loo1.c = b180VarB4;
        }
        c = new upx(dsxVar, new dsx(b180VarB3, b180VarB4));
        d = (byte) 8;
        CREATOR = new yox((byte) 21);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof upx);
    }

    public final int hashCode() {
        return -1924130031;
    }

    public final String toString() {
        return "Payment";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
