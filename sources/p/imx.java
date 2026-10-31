package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class imx extends hux {
    public static final Parcelable.Creator<imx> CREATOR;
    public static final imx c;
    public static final byte d;

    static {
        b180 b180VarB = aq8.d;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.DeviceMultispeaker16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            long j = u7h.b;
            n6a1 n6a1Var = new n6a1(j);
            ArrayList arrayList = new ArrayList(32);
            arrayList.add(new f9s0(11.0f, 12.75f));
            arrayList.add(new j9s0(2.0f, 2.0f, 0.0f, true, false, 0.0f, -4.0f));
            arrayList.add(new j9s0(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f));
            a180.a(a180Var, arrayList, n6a1Var, 1.0f, 2, 1.0f);
            n6a1 n6a1Var2 = new n6a1(j);
            cwh0 cwh0VarG = lf51.g(6.0f, 2.75f);
            cwh0VarG.f(6.0f, 1.784f, 6.783f, 1.0f, 7.75f, 1.0f);
            cwh0VarG.i(6.5f);
            cwh0VarG.g(0.966f, 0.0f, 1.75f, 0.784f, 1.75f, 1.75f);
            cwh0VarG.v(11.5f);
            cwh0VarG.b(1.75f, 1.75f, false, true, 14.25f, 16.0f);
            cwh0VarG.i(-6.5f);
            cwh0VarG.b(1.75f, 1.75f, false, true, 6.0f, 14.25f);
            cwh0VarG.e();
            cwh0VarG.l(7.75f, 2.5f);
            cwh0VarG.c(0.25f, 0.25f, false, false, -0.25f, 0.25f);
            cwh0VarG.v(11.5f);
            cwh0VarG.g(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f);
            cwh0VarG.i(6.5f);
            cwh0VarG.c(0.25f, 0.25f, false, false, 0.25f, -0.25f);
            cwh0VarG.j(14.5f, 2.75f);
            cwh0VarG.c(0.25f, 0.25f, false, false, -0.25f, -0.25f);
            cwh0VarG.e();
            cwh0VarG.l(1.75f, 2.5f);
            cwh0VarG.c(0.25f, 0.25f, false, false, -0.25f, 0.25f);
            cwh0VarG.v(11.5f);
            cwh0VarG.g(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f);
            cwh0VarG.i(2.375f);
            cwh0VarG.j(4.125f, 16.0f);
            cwh0VarG.j(1.75f, 16.0f);
            cwh0VarG.b(1.75f, 1.75f, false, true, 0.0f, 14.25f);
            cwh0VarG.j(0.0f, 2.75f);
            cwh0VarG.f(0.0f, 1.784f, 0.784f, 1.0f, 1.75f, 1.0f);
            cwh0VarG.i(2.375f);
            cwh0VarG.v(1.5f);
            cwh0VarG.e();
            a180.a(a180Var, cwh0VarG.a, n6a1Var2, 1.0f, 2, 1.0f);
            n6a1 n6a1Var3 = new n6a1(j);
            ArrayList arrayList2 = new ArrayList(32);
            arrayList2.add(new f9s0(12.0f, 5.5f));
            arrayList2.add(new j9s0(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f));
            arrayList2.add(new j9s0(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f));
            a180.a(a180Var, arrayList2, n6a1Var3, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            aq8.d = b180VarB;
        }
        b180 b180VarB2 = tx9.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.DeviceMultispeaker24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            long j2 = u7h.b;
            n6a1 n6a1Var4 = new n6a1(j2);
            cwh0 cwh0VarG2 = lf51.g(10.0f, 19.0f);
            cwh0VarG2.c(3.0f, 3.0f, false, false, 3.0f, 3.0f);
            cwh0VarG2.i(8.0f);
            cwh0VarG2.c(3.0f, 3.0f, false, false, 3.0f, -3.0f);
            cwh0VarG2.j(24.0f, 5.0f);
            cwh0VarG2.c(3.0f, 3.0f, false, false, -3.0f, -3.0f);
            cwh0VarG2.i(-8.0f);
            cwh0VarG2.c(3.0f, 3.0f, false, false, -3.0f, 3.0f);
            cwh0VarG2.e();
            cwh0VarG2.l(13.0f, 20.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, -1.0f, -1.0f);
            cwh0VarG2.j(12.0f, 5.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 1.0f, -1.0f);
            cwh0VarG2.i(8.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 1.0f, 1.0f);
            cwh0VarG2.v(14.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, -1.0f, 1.0f);
            cwh0VarG2.e();
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var4, 1.0f, 2, 1.0f);
            n6a1 n6a1Var5 = new n6a1(j2);
            cwh0 cwh0VarG3 = lf51.g(18.25f, 7.25f);
            cwh0VarG3.c(1.25f, 1.25f, true, false, -2.5f, 0.0f);
            cwh0VarG3.c(1.25f, 1.25f, false, false, 2.5f, 0.0f);
            cwh0VarG3.l(17.0f, 16.0f);
            cwh0VarG3.c(1.5f, 1.5f, true, true, 0.0f, -3.0f);
            cwh0VarG3.c(1.5f, 1.5f, false, true, 0.0f, 3.0f);
            cwh0VarG3.m(-3.5f, -1.5f);
            cwh0VarG3.c(3.5f, 3.5f, true, false, 7.0f, 0.0f);
            cwh0VarG3.c(3.5f, 3.5f, false, false, -7.0f, 0.0f);
            cwh0VarG3.l(0.0f, 5.0f);
            cwh0VarG3.c(3.0f, 3.0f, false, true, 3.0f, -3.0f);
            cwh0VarG3.i(4.0f);
            cwh0VarG3.v(2.0f);
            cwh0VarG3.h(3.0f);
            cwh0VarG3.c(1.0f, 1.0f, false, false, -1.0f, 1.0f);
            cwh0VarG3.v(14.0f);
            cwh0VarG3.c(1.0f, 1.0f, false, false, 1.0f, 1.0f);
            cwh0VarG3.i(4.0f);
            cwh0VarG3.v(2.0f);
            cwh0VarG3.h(3.0f);
            cwh0VarG3.c(3.0f, 3.0f, false, true, -3.0f, -3.0f);
            cwh0VarG3.e();
            a180.a(a180Var2, cwh0VarG3.a, n6a1Var5, 1.0f, 2, 1.0f);
            n6a1 n6a1Var6 = new n6a1(j2);
            cwh0 cwh0VarG4 = lf51.g(5.75f, 7.25f);
            cwh0VarG4.f(5.75f, 6.56f, 6.31f, 6.0f, 7.0f, 6.0f);
            cwh0VarG4.v(2.5f);
            cwh0VarG4.g(-0.69f, 0.0f, -1.25f, -0.56f, -1.25f, -1.25f);
            cwh0VarG4.l(7.0f, 16.0f);
            cwh0VarG4.c(1.5f, 1.5f, false, true, 0.0f, -3.0f);
            cwh0VarG4.v(-2.0f);
            cwh0VarG4.c(3.5f, 3.5f, true, false, 0.0f, 7.0f);
            cwh0VarG4.e();
            a180.a(a180Var2, cwh0VarG4.a, n6a1Var6, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            tx9.b = b180VarB2;
        }
        c = new imx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new hlx((byte) 26);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof imx);
    }

    public final int hashCode() {
        return 1532697649;
    }

    public final String toString() {
        return "DeviceMultispeaker";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
