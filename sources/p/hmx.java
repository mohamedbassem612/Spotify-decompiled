package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hmx extends hux {
    public static final Parcelable.Creator<hmx> CREATOR;
    public static final hmx c;
    public static final byte d;

    static {
        b180 b180VarB = fq7.a;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.DeviceMobile16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            long j = u7h.b;
            n6a1 n6a1Var = new n6a1(j);
            ArrayList arrayList = new ArrayList(32);
            arrayList.add(new f9s0(8.0f, 13.0f));
            arrayList.add(new j9s0(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f));
            arrayList.add(new j9s0(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f));
            a180.a(a180Var, arrayList, n6a1Var, 1.0f, 2, 1.0f);
            n6a1 n6a1Var2 = new n6a1(j);
            cwh0 cwh0VarG = lf51.g(4.75f, 0.0f);
            cwh0VarG.b(1.75f, 1.75f, false, false, 3.0f, 1.75f);
            cwh0VarG.v(12.5f);
            cwh0VarG.g(0.0f, 0.966f, 0.784f, 1.75f, 1.75f, 1.75f);
            cwh0VarG.i(6.5f);
            cwh0VarG.b(1.75f, 1.75f, false, false, 13.0f, 14.25f);
            cwh0VarG.u(1.75f);
            cwh0VarG.b(1.75f, 1.75f, false, false, 11.25f, 0.0f);
            cwh0VarG.e();
            cwh0VarG.l(4.5f, 1.75f);
            cwh0VarG.c(0.25f, 0.25f, false, true, 0.25f, -0.25f);
            cwh0VarG.i(6.5f);
            cwh0VarG.c(0.25f, 0.25f, false, true, 0.25f, 0.25f);
            cwh0VarG.v(12.5f);
            cwh0VarG.c(0.25f, 0.25f, false, true, -0.25f, 0.25f);
            cwh0VarG.i(-6.5f);
            cwh0VarG.c(0.25f, 0.25f, false, true, -0.25f, -0.25f);
            cwh0VarG.e();
            a180.a(a180Var, cwh0VarG.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            fq7.a = b180VarB;
        }
        b180 b180VarB2 = zr7.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.DeviceMobile24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            long j2 = u7h.b;
            n6a1 n6a1Var3 = new n6a1(j2);
            cwh0 cwh0VarG2 = lf51.g(5.0f, 5.0f);
            cwh0VarG2.c(3.0f, 3.0f, false, true, 3.0f, -3.0f);
            cwh0VarG2.i(8.0f);
            cwh0VarG2.c(3.0f, 3.0f, false, true, 3.0f, 3.0f);
            cwh0VarG2.v(14.0f);
            cwh0VarG2.c(3.0f, 3.0f, false, true, -3.0f, 3.0f);
            cwh0VarG2.j(8.0f, 22.0f);
            cwh0VarG2.c(3.0f, 3.0f, false, true, -3.0f, -3.0f);
            cwh0VarG2.e();
            cwh0VarG2.l(8.0f, 4.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, false, -1.0f, 1.0f);
            cwh0VarG2.v(14.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, false, 1.0f, 1.0f);
            cwh0VarG2.i(8.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, false, 1.0f, -1.0f);
            cwh0VarG2.j(17.0f, 5.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, false, -1.0f, -1.0f);
            cwh0VarG2.e();
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var3, 1.0f, 2, 1.0f);
            n6a1 n6a1Var4 = new n6a1(j2);
            ArrayList arrayList2 = new ArrayList(32);
            arrayList2.add(new f9s0(13.25f, 16.75f));
            arrayList2.add(new j9s0(1.25f, 1.25f, 0.0f, true, true, -2.5f, 0.0f));
            arrayList2.add(new j9s0(1.25f, 1.25f, 0.0f, false, true, 2.5f, 0.0f));
            a180.a(a180Var2, arrayList2, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            zr7.b = b180VarB2;
        }
        c = new hmx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new hlx((byte) 25);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof hmx);
    }

    public final int hashCode() {
        return 1438582893;
    }

    public final String toString() {
        return "DeviceMobile";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
