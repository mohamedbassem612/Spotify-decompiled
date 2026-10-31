package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class box extends hux {
    public static final Parcelable.Creator<box> CREATOR;
    public static final box c;
    public static final byte d;

    static {
        b180 b180VarB = yon1.c;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Image16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            long j = u7h.b;
            n6a1 n6a1Var = new n6a1(j);
            ArrayList arrayList = new ArrayList(32);
            arrayList.add(new f9s0(11.988f, 7.1f));
            arrayList.add(new j9s0(1.088f, 1.088f, 0.0f, true, false, 0.0f, -2.175f));
            arrayList.add(new j9s0(1.088f, 1.088f, 0.0f, false, false, 0.0f, 2.175f));
            a180.a(a180Var, arrayList, n6a1Var, 1.0f, 2, 1.0f);
            n6a1 n6a1Var2 = new n6a1(j);
            cwh0 cwh0Var = new cwh0();
            cwh0Var.l(0.0f, 2.0f);
            cwh0Var.i(16.0f);
            cwh0Var.v(14.0f);
            rjx.u(cwh0Var, 0.0f, 16.0f, 1.5f, 3.5f);
            cwh0Var.v(6.415f);
            cwh0Var.k(2.772f, -3.296f);
            cwh0Var.c(1.05f, 1.05f, false, true, 1.608f, 0.0f);
            cwh0Var.k(2.161f, 2.576f);
            cwh0Var.c(0.25f, 0.25f, false, false, 0.317f, 0.056f);
            cwh0Var.k(0.793f, -0.458f);
            cwh0Var.c(2.75f, 2.75f, false, true, 2.75f, 0.0f);
            cwh0Var.k(2.599f, 1.5f);
            cwh0Var.j(14.5f, 3.5f);
            cwh0Var.e();
            rjx.z(cwh0Var, 1.5f, 14.5f, 13.0f, -2.474f);
            cwh0Var.k(-3.349f, -1.934f);
            cwh0Var.c(1.25f, 1.25f, false, false, -1.25f, 0.0f);
            cwh0Var.k(-0.793f, 0.458f);
            cwh0Var.c(1.75f, 1.75f, false, true, -2.216f, -0.39f);
            ydh.k(cwh0Var, 5.075f, 7.993f, 1.5f, 12.245f);
            a180.a(a180Var, cwh0Var.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            yon1.c = b180VarB;
        }
        b180 b180VarB2 = cpn1.e;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Image24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            long j2 = u7h.b;
            n6a1 n6a1Var3 = new n6a1(j2);
            ArrayList arrayList2 = new ArrayList(32);
            arrayList2.add(new f9s0(17.5f, 10.0f));
            arrayList2.add(new j9s0(1.5f, 1.5f, 0.0f, true, false, 0.0f, -3.0f));
            arrayList2.add(new j9s0(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f));
            a180.a(a180Var2, arrayList2, n6a1Var3, 1.0f, 2, 1.0f);
            n6a1 n6a1Var4 = new n6a1(j2);
            cwh0 cwh0Var2 = new cwh0();
            cwh0Var2.l(1.0f, 3.0f);
            cwh0Var2.i(22.0f);
            cwh0Var2.v(18.0f);
            rjx.u(cwh0Var2, 1.0f, 21.0f, 3.0f, 5.0f);
            cwh0Var2.v(8.977f);
            cwh0Var2.k(3.972f, -4.722f);
            cwh0Var2.c(1.3f, 1.3f, false, true, 1.99f, 0.0f);
            cwh0Var2.k(3.273f, 3.901f);
            cwh0Var2.k(1.75f, -1.01f);
            cwh0Var2.c(3.0f, 3.0f, false, true, 3.0f, 0.0f);
            ydh.k(cwh0Var2, 21.0f, 14.465f, 21.0f, 5.0f);
            rjx.z(cwh0Var2, 3.0f, 19.0f, 18.0f, -2.226f);
            cwh0Var2.k(-5.016f, -2.896f);
            cwh0Var2.c(1.0f, 1.0f, false, false, -1.0f, 0.0f);
            cwh0Var2.k(-1.749f, 1.01f);
            cwh0Var2.c(2.0f, 2.0f, false, true, -2.532f, -0.446f);
            ydh.k(cwh0Var2, 7.966f, 11.18f, 3.0f, 17.084f);
            a180.a(a180Var2, cwh0Var2.a, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            cpn1.e = b180VarB2;
        }
        c = new box(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new snx((byte) 8);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof box);
    }

    public final int hashCode() {
        return -1482991322;
    }

    public final String toString() {
        return "Image";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
