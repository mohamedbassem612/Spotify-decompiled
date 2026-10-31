package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dmx extends hux {
    public static final Parcelable.Creator<dmx> CREATOR;
    public static final dmx c;
    public static final byte d;

    static {
        b180 b180VarB = j82.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.DestinationPin16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            long j = u7h.b;
            n6a1 n6a1Var = new n6a1(j);
            cwh0 cwh0VarG = lf51.g(8.0f, 1.562f);
            cwh0VarG.c(4.732f, 4.732f, false, false, -3.47f, 7.95f);
            cwh0VarG.k(0.013f, 0.014f);
            cwh0VarG.j(8.0f, 13.646f);
            cwh0VarG.k(3.456f, -4.12f);
            cwh0VarG.k(0.013f, -0.013f);
            cwh0VarG.b(4.732f, 4.732f, false, false, 8.0f, 1.563f);
            cwh0VarG.e();
            cwh0VarG.l(1.768f, 6.294f);
            cwh0VarG.c(6.232f, 6.232f, true, true, 10.813f, 4.225f);
            cwh0VarG.j(8.0f, 15.98f);
            cwh0VarG.k(-4.582f, -5.46f);
            cwh0VarG.c(6.2f, 6.2f, false, true, -1.65f, -4.225f);
            cwh0VarG.e();
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            n6a1 n6a1Var2 = new n6a1(j);
            ArrayList arrayList = new ArrayList(32);
            arrayList.add(new f9s0(8.0f, 5.05f));
            arrayList.add(new j9s0(1.243f, 1.243f, 0.0f, true, false, 0.0f, 2.488f));
            arrayList.add(new a9s0(1.243f, 1.243f, 0.0f, false, false, 8.0f, 5.05f));
            arrayList.add(new f9s0(5.257f, 6.295f));
            arrayList.add(new j9s0(2.743f, 2.743f, 0.0f, true, true, 5.486f, 0.0f));
            arrayList.add(new j9s0(2.743f, 2.743f, 0.0f, false, true, -5.486f, 0.0f));
            a180.a(a180Var, arrayList, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            j82.b = b180VarB;
        }
        b180 b180VarB2 = rc2.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.DestinationPin24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            long j2 = u7h.b;
            n6a1 n6a1Var3 = new n6a1(j2);
            cwh0 cwh0VarG2 = lf51.g(12.0f, 2.465f);
            cwh0VarG2.c(7.25f, 7.25f, false, false, -5.32f, 12.177f);
            cwh0VarG2.k(0.018f, 0.018f);
            cwh0VarG2.j(12.0f, 20.979f);
            cwh0VarG2.k(5.302f, -6.318f);
            cwh0VarG2.k(0.017f, -0.018f);
            cwh0VarG2.b(7.25f, 7.25f, false, false, 12.0f, 2.466f);
            cwh0VarG2.e();
            cwh0VarG2.l(2.75f, 9.715f);
            cwh0VarG2.c(9.25f, 9.25f, true, true, 16.052f, 6.268f);
            cwh0VarG2.j(12.0f, 24.09f);
            cwh0VarG2.k(-6.803f, -8.107f);
            cwh0VarG2.b(9.22f, 9.22f, false, true, 2.75f, 9.715f);
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var3, 1.0f, 2, 1.0f);
            n6a1 n6a1Var4 = new n6a1(j2);
            ArrayList arrayList2 = new ArrayList(32);
            arrayList2.add(new f9s0(12.0f, 7.715f));
            arrayList2.add(new j9s0(2.0f, 2.0f, 0.0f, true, false, 0.0f, 4.0f));
            arrayList2.add(new j9s0(2.0f, 2.0f, 0.0f, false, false, 0.0f, -4.0f));
            arrayList2.add(new n9s0(-4.0f, 2.0f));
            arrayList2.add(new j9s0(4.0f, 4.0f, 0.0f, true, true, 8.0f, 0.0f));
            arrayList2.add(new j9s0(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f));
            a180.a(a180Var2, arrayList2, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            rc2.b = b180VarB2;
        }
        c = new dmx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new hlx((byte) 21);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof dmx);
    }

    public final int hashCode() {
        return 1398519612;
    }

    public final String toString() {
        return "DestinationPin";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
