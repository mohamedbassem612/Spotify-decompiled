package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cox extends hux {
    public static final Parcelable.Creator<cox> CREATOR;
    public static final cox c;
    public static final byte d;

    static {
        b180 b180VarB;
        b180 b180Var = qpn1.b;
        if (b180Var != null) {
            b180VarB = b180Var;
        } else {
            a180 a180Var = new a180("Encore.Vector.ImageAlt16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            long j = u7h.b;
            n6a1 n6a1Var = new n6a1(j);
            ArrayList arrayList = new ArrayList(32);
            arrayList.add(new f9s0(11.0f, 3.75f));
            arrayList.add(new j9s0(1.25f, 1.25f, 0.0f, true, false, 0.0f, 2.5f));
            arrayList.add(new j9s0(1.25f, 1.25f, 0.0f, false, false, 0.0f, -2.5f));
            a180.a(a180Var, arrayList, n6a1Var, 1.0f, 2, 1.0f);
            n6a1 n6a1Var2 = new n6a1(j);
            cwh0 cwh0Var = new cwh0();
            cwh0Var.l(0.0f, 0.0f);
            cwh0Var.v(16.0f);
            cwh0Var.i(16.0f);
            rjx.u(cwh0Var, 16.0f, 0.0f, 14.5f, 1.5f);
            cwh0Var.v(13.0f);
            cwh0Var.j(14.5f, 13.0f);
            cwh0Var.k(-3.334f, -1.708f);
            cwh0Var.c(1.46f, 1.46f, false, false, -1.27f, -0.06f);
            cwh0Var.j(8.0f, 12.182f);
            cwh0Var.k(-2.13f, -2.8f);
            cwh0Var.c(1.018f, 1.018f, false, false, -1.577f, -0.016f);
            cwh0Var.j(1.5f, 12.5f);
            cwh0Var.v(-11.0f);
            cwh0Var.e();
            a180.a(a180Var, cwh0Var.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            qpn1.b = b180VarB;
        }
        b180 b180VarB2 = eth.i;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.ImageAlt24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            int i3 = u7h.l;
            long j2 = u7h.b;
            n6a1 n6a1Var3 = new n6a1(j2);
            ArrayList arrayList2 = new ArrayList(32);
            arrayList2.add(new f9s0(17.5f, 5.0f));
            arrayList2.add(new j9s0(1.5f, 1.5f, 0.0f, true, false, 0.0f, 3.0f));
            arrayList2.add(new j9s0(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f));
            a180.a(a180Var2, arrayList2, n6a1Var3, 1.0f, 2, 1.0f);
            n6a1 n6a1Var4 = new n6a1(j2);
            cwh0 cwh0Var2 = new cwh0();
            cwh0Var2.l(1.0f, 1.0f);
            cwh0Var2.v(22.0f);
            cwh0Var2.i(22.0f);
            rjx.u(cwh0Var2, 23.0f, 1.0f, 21.0f, 3.0f);
            cwh0Var2.v(16.5f);
            cwh0Var2.k(-4.647f, -2.535f);
            cwh0Var2.c(2.0f, 2.0f, false, false, -1.746f, -0.082f);
            cwh0Var2.j(12.0f, 18.0f);
            cwh0Var2.k(-2.929f, -3.661f);
            cwh0Var2.c(1.4f, 1.4f, false, false, -2.169f, -0.022f);
            ydh.k(cwh0Var2, 3.0f, 19.0f, 3.0f, 3.0f);
            a180.a(a180Var2, cwh0Var2.a, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            eth.i = b180VarB2;
        }
        dsx dsxVar = new dsx(b180VarB, b180VarB2);
        b180 b180VarB3 = upn1.b;
        if (b180VarB3 == null) {
            a180 a180Var3 = new a180("Encore.Vector.ImageAltActive16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i4 = bui1.a;
            n6a1 n6a1Var5 = new n6a1(u7h.b);
            cwh0 cwh0Var3 = new cwh0();
            cwh0Var3.l(16.0f, 0.0f);
            cwh0Var3.j(0.0f, 0.0f);
            cwh0Var3.v(16.0f);
            rjx.t(cwh0Var3, 16.0f, 11.0f, 3.75f);
            cwh0Var3.c(1.25f, 1.25f, true, true, 0.0f, 2.5f);
            cwh0Var3.c(1.25f, 1.25f, false, true, 0.0f, -2.5f);
            cwh0Var3.l(1.5f, 12.5f);
            cwh0Var3.k(2.793f, -3.134f);
            cwh0Var3.c(1.018f, 1.018f, false, true, 1.577f, 0.016f);
            cwh0Var3.k(2.13f, 2.8f);
            cwh0Var3.k(1.896f, -0.95f);
            cwh0Var3.g(0.41f, -0.176f, 0.878f, -0.153f, 1.27f, 0.06f);
            rjx.x(cwh0Var3, 14.5f, 13.0f, 1.5f, -13.0f);
            a180.a(a180Var3, cwh0Var3.a, n6a1Var5, 1.0f, 2, 1.0f);
            b180VarB3 = a180Var3.b();
            upn1.b = b180VarB3;
        }
        b180 b180VarB4 = xpn1.b;
        if (b180VarB4 == null) {
            a180 a180Var4 = new a180("Encore.Vector.ImageAltActive24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i5 = bui1.a;
            n6a1 n6a1Var6 = new n6a1(u7h.b);
            cwh0 cwh0Var4 = new cwh0();
            cwh0Var4.l(1.0f, 1.0f);
            cwh0Var4.v(22.0f);
            cwh0Var4.i(22.0f);
            rjx.u(cwh0Var4, 23.0f, 1.0f, 17.5f, 5.0f);
            cwh0Var4.c(1.5f, 1.5f, true, true, 0.0f, 3.0f);
            cwh0Var4.c(1.5f, 1.5f, false, true, 0.0f, -3.0f);
            cwh0Var4.l(3.0f, 19.0f);
            cwh0Var4.k(3.902f, -4.683f);
            cwh0Var4.c(1.4f, 1.4f, false, true, 2.17f, 0.022f);
            cwh0Var4.j(12.0f, 18.0f);
            cwh0Var4.k(2.607f, -1.117f);
            cwh0Var4.c(2.0f, 2.0f, false, true, 1.746f, 0.082f);
            cwh0Var4.j(21.0f, 19.5f);
            ydh.k(cwh0Var4, 21.0f, 21.0f, 3.0f, 21.0f);
            a180.a(a180Var4, cwh0Var4.a, n6a1Var6, 1.0f, 2, 1.0f);
            b180VarB4 = a180Var4.b();
            xpn1.b = b180VarB4;
        }
        c = new cox(dsxVar, new dsx(b180VarB3, b180VarB4));
        d = (byte) 8;
        CREATOR = new snx((byte) 9);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof cox);
    }

    public final int hashCode() {
        return -1760801117;
    }

    public final String toString() {
        return "ImageAlt";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
