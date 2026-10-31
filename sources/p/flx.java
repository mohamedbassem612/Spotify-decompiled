package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class flx extends hux {
    public static final Parcelable.Creator<flx> CREATOR;
    public static final flx c;

    static {
        b180 b180VarB = w6p1.a;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.ChartLine16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            long j = u7h.b;
            n6a1 n6a1Var = new n6a1(j);
            ArrayList arrayList = new ArrayList(32);
            arrayList.add(new f9s0(0.0f, 16.0f));
            arrayList.add(new s9s0(0.0f));
            arrayList.add(new l9s0(1.5f));
            arrayList.add(new r9s0(14.5f));
            arrayList.add(new d9s0(16.0f));
            arrayList.add(new s9s0(16.0f));
            arrayList.add(b9s0.c);
            a180.a(a180Var, arrayList, n6a1Var, 1.0f, 2, 1.0f);
            n6a1 n6a1Var2 = new n6a1(j);
            cwh0 cwh0VarG = lf51.g(14.85f, 0.837f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.313f, 1.014f);
            cwh0VarG.k(-4.5f, 8.5f);
            cwh0VarG.c(0.75f, 0.75f, false, true, -1.287f, 0.065f);
            cwh0VarG.k(-2.334f, -3.5f);
            cwh0VarG.k(-2.894f, 4.962f);
            cwh0VarG.c(0.75f, 0.75f, true, true, -1.296f, -0.756f);
            cwh0VarG.k(3.5f, -6.0f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 1.272f, -0.038f);
            cwh0VarG.k(2.302f, 3.453f);
            cwh0VarG.k(3.911f, -7.388f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 1.014f, -0.312f);
            cwh0VarG.e();
            a180.a(a180Var, cwh0VarG.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            w6p1.a = b180VarB;
        }
        b180 b180VarB2 = z6p1.a;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.ChartLine24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            long j2 = u7h.b;
            n6a1 n6a1Var3 = new n6a1(j2);
            ArrayList arrayList2 = new ArrayList(32);
            arrayList2.add(new f9s0(2.0f, 22.0f));
            arrayList2.add(new s9s0(2.0f));
            arrayList2.add(new l9s0(2.0f));
            arrayList2.add(new r9s0(18.0f));
            arrayList2.add(new l9s0(18.0f));
            arrayList2.add(new r9s0(2.0f));
            arrayList2.add(b9s0.c);
            a180.a(a180Var2, arrayList2, n6a1Var3, 1.0f, 2, 1.0f);
            n6a1 n6a1Var4 = new n6a1(j2);
            cwh0 cwh0VarG2 = lf51.g(20.486f, 3.126f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 0.388f, 1.36f);
            cwh0VarG2.k(-5.485f, 9.858f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, -1.732f, 0.029f);
            cwh0VarG2.k(-2.577f, -4.296f);
            cwh0VarG2.k(-3.186f, 6.37f);
            cwh0VarG2.c(1.0f, 1.0f, true, true, -1.788f, -0.894f);
            cwh0VarG2.k(4.0f, -8.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 1.752f, -0.067f);
            cwh0VarG2.k(2.624f, 4.374f);
            cwh0VarG2.k(4.644f, -8.346f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 1.36f, -0.388f);
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            z6p1.a = b180VarB2;
        }
        c = new flx(new dsx(b180VarB, b180VarB2), null);
        CREATOR = new ckx((byte) 28);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof flx);
    }

    public final int hashCode() {
        return -585453763;
    }

    public final String toString() {
        return "ChartLine";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
