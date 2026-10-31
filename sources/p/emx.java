package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class emx extends hux {
    public static final Parcelable.Creator<emx> CREATOR;
    public static final emx c;
    public static final byte d;

    static {
        b180 b180VarB = jm5.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.DeviceArm16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            long j = u7h.b;
            n6a1 n6a1Var = new n6a1(j);
            ArrayList arrayList = new ArrayList(32);
            arrayList.add(new f9s0(11.5f, 9.5f));
            arrayList.add(new j9s0(1.5f, 1.5f, 0.0f, true, false, 0.0f, -3.0f));
            arrayList.add(new j9s0(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f));
            a180.a(a180Var, arrayList, n6a1Var, 1.0f, 2, 1.0f);
            n6a1 n6a1Var2 = new n6a1(j);
            cwh0 cwh0VarG = lf51.g(1.75f, 3.0f);
            cwh0VarG.b(1.75f, 1.75f, false, false, 0.0f, 4.75f);
            cwh0VarG.v(6.5f);
            cwh0VarG.f(0.0f, 12.216f, 0.784f, 13.0f, 1.75f, 13.0f);
            cwh0VarG.h(2.0f);
            cwh0VarG.v(1.25f);
            cwh0VarG.c(0.75f, 0.75f, false, false, 1.5f, 0.0f);
            cwh0VarG.u(13.0f);
            cwh0VarG.i(9.0f);
            cwh0VarG.v(1.25f);
            cwh0VarG.c(0.75f, 0.75f, false, false, 1.5f, 0.0f);
            cwh0VarG.u(13.0f);
            cwh0VarG.i(0.25f);
            cwh0VarG.b(1.75f, 1.75f, false, false, 16.0f, 11.25f);
            cwh0VarG.v(-6.5f);
            cwh0VarG.b(1.75f, 1.75f, false, false, 14.25f, 3.0f);
            cwh0VarG.e();
            cwh0VarG.l(1.5f, 4.75f);
            cwh0VarG.c(0.25f, 0.25f, false, true, 0.25f, -0.25f);
            cwh0VarG.i(12.5f);
            cwh0VarG.c(0.25f, 0.25f, false, true, 0.25f, 0.25f);
            cwh0VarG.v(6.5f);
            cwh0VarG.c(0.25f, 0.25f, false, true, -0.25f, 0.25f);
            cwh0VarG.h(1.75f);
            cwh0VarG.c(0.25f, 0.25f, false, true, -0.25f, -0.25f);
            cwh0VarG.e();
            a180.a(a180Var, cwh0VarG.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            jm5.b = b180VarB;
        }
        b180 b180VarB2 = lm5.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.DeviceArm24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            long j2 = u7h.b;
            n6a1 n6a1Var3 = new n6a1(j2);
            ArrayList arrayList2 = new ArrayList(32);
            arrayList2.add(new f9s0(16.5f, 7.0f));
            arrayList2.add(new j9s0(3.5f, 3.5f, 0.0f, true, false, 0.0f, 7.0f));
            arrayList2.add(new j9s0(3.5f, 3.5f, 0.0f, false, false, 0.0f, -7.0f));
            arrayList2.add(new f9s0(15.0f, 10.5f));
            arrayList2.add(new j9s0(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f));
            arrayList2.add(new j9s0(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f));
            a180.a(a180Var2, arrayList2, n6a1Var3, 1.0f, 2, 1.0f);
            n6a1 n6a1Var4 = new n6a1(j2);
            cwh0 cwh0VarG2 = lf51.g(3.0f, 3.0f);
            cwh0VarG2.c(3.0f, 3.0f, false, false, -3.0f, 3.0f);
            cwh0VarG2.v(9.0f);
            cwh0VarG2.c(3.0f, 3.0f, false, false, 3.0f, 3.0f);
            cwh0VarG2.v(2.0f);
            cwh0VarG2.c(1.0f, 1.0f, true, false, 2.0f, 0.0f);
            cwh0VarG2.v(-2.0f);
            cwh0VarG2.i(14.0f);
            cwh0VarG2.v(2.0f);
            cwh0VarG2.c(1.0f, 1.0f, true, false, 2.0f, 0.0f);
            cwh0VarG2.v(-2.0f);
            cwh0VarG2.c(3.0f, 3.0f, false, false, 3.0f, -3.0f);
            cwh0VarG2.j(24.0f, 6.0f);
            cwh0VarG2.c(3.0f, 3.0f, false, false, -3.0f, -3.0f);
            hrt.o(cwh0VarG2, 21.0f, 16.0f, 3.0f, 16.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, -1.0f, -1.0f);
            cwh0VarG2.j(2.0f, 6.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 1.0f, -1.0f);
            cwh0VarG2.i(18.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 1.0f, 1.0f);
            cwh0VarG2.v(9.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, -1.0f, 1.0f);
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            lm5.b = b180VarB2;
        }
        c = new emx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new hlx((byte) 22);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof emx);
    }

    public final int hashCode() {
        return -2141319567;
    }

    public final String toString() {
        return "DeviceArm";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
