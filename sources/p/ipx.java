package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ipx extends hux {
    public static final Parcelable.Creator<ipx> CREATOR;
    public static final ipx c;
    public static final byte d;

    static {
        b180 b180VarB = xio1.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.NotificationNew16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            long j = u7h.b;
            n6a1 n6a1Var = new n6a1(j);
            cwh0 cwh0Var = new cwh0();
            cwh0Var.l(13.5f, 5.71f);
            cwh0Var.v(2.857f);
            cwh0Var.k(2.193f, 3.809f);
            cwh0Var.c(0.75f, 0.75f, false, true, -0.65f, 1.124f);
            cwh0Var.h(10.5f);
            cwh0Var.c(2.5f, 2.5f, false, true, -5.0f, 0.0f);
            cwh0Var.h(0.957f);
            cwh0Var.c(0.75f, 0.75f, false, true, -0.65f, -1.124f);
            cwh0Var.j(2.5f, 8.569f);
            cwh0Var.u(5.5f);
            cwh0Var.b(5.5f, 5.5f, false, true, 8.521f, 0.024f);
            cwh0Var.c(4.0f, 4.0f, false, false, -0.49f, 1.476f);
            cwh0Var.h(8.0f);
            cwh0Var.c(4.0f, 4.0f, false, false, -4.0f, 4.0f);
            cwh0Var.v(3.27f);
            cwh0Var.c(0.75f, 0.75f, false, true, -0.1f, 0.373f);
            cwh0Var.j(2.255f, 12.0f);
            cwh0Var.i(11.49f);
            cwh0Var.j(12.1f, 9.142f);
            cwh0Var.c(0.75f, 0.75f, false, true, -0.1f, -0.374f);
            cwh0Var.u(6.0f);
            cwh0Var.c(4.0f, 4.0f, false, false, 1.5f, -0.29f);
            cwh0Var.l(8.0f, 14.5f);
            cwh0Var.c(1.0f, 1.0f, false, false, 1.0f, -1.0f);
            cwh0Var.h(7.0f);
            cwh0Var.c(1.0f, 1.0f, false, false, 1.0f, 1.0f);
            a180.a(a180Var, cwh0Var.a, n6a1Var, 1.0f, 2, 1.0f);
            n6a1 n6a1Var2 = new n6a1(j);
            ArrayList arrayList = new ArrayList(32);
            arrayList.add(new f9s0(14.0f, 2.0f));
            arrayList.add(new j9s0(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f));
            arrayList.add(new j9s0(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f));
            a180.a(a180Var, arrayList, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            xio1.b = b180VarB;
        }
        b180 b180VarB2 = ajo1.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.NotificationNew24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            long j2 = u7h.b;
            n6a1 n6a1Var3 = new n6a1(j2);
            cwh0 cwh0Var2 = new cwh0();
            cwh0Var2.l(17.5f, 10.5f);
            cwh0Var2.v(3.877f);
            cwh0Var2.j(19.587f, 18.0f);
            cwh0Var2.h(4.414f);
            cwh0Var2.j(6.5f, 14.378f);
            cwh0Var2.u(8.5f);
            cwh0Var2.c(5.5f, 5.5f, false, true, 5.187f, -5.491f);
            cwh0Var2.c(6.0f, 6.0f, false, true, 0.922f, -1.985f);
            cwh0Var2.b(7.5f, 7.5f, false, false, 4.5f, 8.5f);
            cwh0Var2.v(5.344f);
            cwh0Var2.j(0.954f, 20.0f);
            cwh0Var2.i(7.582f);
            cwh0Var2.c(3.5f, 3.5f, true, false, 6.929f, 0.0f);
            cwh0Var2.i(7.581f);
            cwh0Var2.j(19.5f, 13.842f);
            cwh0Var2.v(-3.684f);
            cwh0Var2.c(6.0f, 6.0f, false, true, -2.0f, 0.342f);
            cwh0Var2.m(-7.0f, 10.0f);
            cwh0Var2.o(0.001f, -0.265f, 0.085f, -0.5f);
            cwh0Var2.i(2.83f);
            cwh0Var2.c(1.5f, 1.5f, true, true, -2.915f, 0.5f);
            a180.a(a180Var2, cwh0Var2.a, n6a1Var3, 1.0f, 2, 1.0f);
            n6a1 n6a1Var4 = new n6a1(j2);
            ArrayList arrayList2 = new ArrayList(32);
            arrayList2.add(new f9s0(14.5f, 4.5f));
            arrayList2.add(new j9s0(3.0f, 3.0f, 0.0f, true, false, 6.0f, 0.0f));
            arrayList2.add(new j9s0(3.0f, 3.0f, 0.0f, false, false, -6.0f, 0.0f));
            a180.a(a180Var2, arrayList2, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            ajo1.b = b180VarB2;
        }
        c = new ipx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new yox((byte) 9);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ipx);
    }

    public final int hashCode() {
        return 833628864;
    }

    public final String toString() {
        return "NotificationNew";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
