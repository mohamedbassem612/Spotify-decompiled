package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ztx extends hux {
    public static final Parcelable.Creator<ztx> CREATOR;
    public static final ztx c;
    public static final byte d;

    static {
        b180 b180VarB;
        b180 b180Var = k1u.e;
        if (b180Var != null) {
            b180VarB = b180Var;
        } else {
            a180 a180Var = new a180("Encore.Vector.Volume16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            long j = u7h.b;
            n6a1 n6a1Var = new n6a1(j);
            cwh0 cwh0VarG = lf51.g(9.741f, 0.85f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.375f, 0.65f);
            cwh0VarG.v(13.0f);
            cwh0VarG.c(0.75f, 0.75f, false, true, -1.125f, 0.65f);
            cwh0VarG.k(-6.925f, -4.0f);
            cwh0VarG.c(3.64f, 3.64f, false, true, -1.33f, -4.967f);
            cwh0VarG.c(3.64f, 3.64f, false, true, 1.33f, -1.332f);
            cwh0VarG.k(6.925f, -4.0f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.75f, 0.0f);
            cwh0VarG.e();
            cwh0VarG.l(2.817f, 6.15f);
            cwh0VarG.c(2.14f, 2.14f, false, false, 0.0f, 3.7f);
            cwh0VarG.k(5.8f, 3.35f);
            cwh0VarG.j(8.617f, 2.8f);
            cwh0VarG.e();
            cwh0VarG.l(11.5f, 10.44f);
            cwh0VarG.j(11.5f, 5.56f);
            cwh0VarG.c(2.75f, 2.75f, false, true, 0.0f, 4.88f);
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            n6a1 n6a1Var2 = new n6a1(j);
            ArrayList arrayList = new ArrayList(32);
            arrayList.add(new f9s0(11.5f, 13.614f));
            arrayList.add(new j9s0(5.752f, 5.752f, 0.0f, false, false, 0.0f, -11.228f));
            arrayList.add(new r9s0(1.55f));
            arrayList.add(new j9s0(4.252f, 4.252f, 0.0f, false, true, 0.0f, 8.127f));
            arrayList.add(b9s0.c);
            a180.a(a180Var, arrayList, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            k1u.e = b180VarB;
        }
        b180 b180VarB2 = b2u.c;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Volume24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            long j2 = u7h.b;
            n6a1 n6a1Var3 = new n6a1(j2);
            cwh0 cwh0VarG2 = lf51.g(14.5f, 1.134f);
            cwh0VarG2.b(1.0f, 1.0f, false, true, 15.0f, 2.0f);
            cwh0VarG2.v(20.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, -1.5f, 0.866f);
            cwh0VarG2.j(2.846f, 16.712f);
            cwh0VarG2.c(5.445f, 5.445f, false, true, 0.0f, -9.424f);
            cwh0VarG2.j(13.5f, 1.135f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 1.0f, 0.0f);
            cwh0VarG2.e();
            cwh0VarG2.l(3.847f, 9.02f);
            cwh0VarG2.c(3.444f, 3.444f, false, false, 0.0f, 5.96f);
            cwh0VarG2.j(13.0f, 20.268f);
            cwh0VarG2.u(3.732f);
            cwh0VarG2.e();
            cwh0VarG2.l(17.0f, 20.127f);
            cwh0VarG2.c(8.504f, 8.504f, false, false, 0.0f, -16.253f);
            cwh0VarG2.v(2.125f);
            cwh0VarG2.c(6.502f, 6.502f, false, true, 0.0f, 12.003f);
            cwh0VarG2.e();
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var3, 1.0f, 2, 1.0f);
            n6a1 n6a1Var4 = new n6a1(j2);
            ArrayList arrayList2 = new ArrayList(32);
            arrayList2.add(new f9s0(17.0f, 16.032f));
            arrayList2.add(new s9s0(7.968f));
            arrayList2.add(new j9s0(4.5f, 4.5f, 0.0f, false, true, 0.0f, 8.064f));
            a180.a(a180Var2, arrayList2, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            b2u.c = b180VarB2;
        }
        dsx dsxVar = new dsx(b180VarB, b180VarB2);
        b180 b180VarB3 = h7w.c;
        if (b180VarB3 == null) {
            a180 a180Var3 = new a180("Encore.Vector.VolumeActive16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i3 = bui1.a;
            long j3 = u7h.b;
            n6a1 n6a1Var5 = new n6a1(j3);
            cwh0 cwh0VarG3 = lf51.g(10.016f, 1.125f);
            cwh0VarG3.b(0.75f, 0.75f, false, false, 8.99f, 0.85f);
            cwh0VarG3.k(-6.925f, 4.0f);
            cwh0VarG3.c(3.64f, 3.64f, false, false, 0.0f, 6.299f);
            cwh0VarG3.k(6.925f, 4.0f);
            cwh0VarG3.c(0.75f, 0.75f, false, false, 1.125f, -0.65f);
            cwh0VarG3.v(-13.0f);
            cwh0VarG3.c(0.75f, 0.75f, false, false, -0.1f, -0.375f);
            cwh0VarG3.e();
            cwh0VarG3.l(11.5f, 5.56f);
            cwh0VarG3.c(2.75f, 2.75f, false, true, 0.0f, 4.88f);
            cwh0VarG3.e();
            a180.a(a180Var3, cwh0VarG3.a, n6a1Var5, 1.0f, 2, 1.0f);
            n6a1 n6a1Var6 = new n6a1(j3);
            ArrayList arrayList3 = new ArrayList(32);
            arrayList3.add(new f9s0(16.0f, 8.0f));
            arrayList3.add(new j9s0(5.75f, 5.75f, 0.0f, false, true, -4.5f, 5.614f));
            arrayList3.add(new r9s0(-1.55f));
            arrayList3.add(new j9s0(4.252f, 4.252f, 0.0f, false, false, 0.0f, -8.127f));
            arrayList3.add(new r9s0(-1.55f));
            arrayList3.add(new a9s0(5.75f, 5.75f, 0.0f, false, true, 16.0f, 8.0f));
            a180.a(a180Var3, arrayList3, n6a1Var6, 1.0f, 2, 1.0f);
            b180VarB3 = a180Var3.b();
            h7w.c = b180VarB3;
        }
        b180 b180VarB4 = lvx.c;
        if (b180VarB4 == null) {
            a180 a180Var4 = new a180("Encore.Vector.VolumeActive24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i4 = bui1.a;
            long j4 = u7h.b;
            n6a1 n6a1Var7 = new n6a1(j4);
            cwh0 cwh0VarG4 = lf51.g(14.5f, 1.134f);
            cwh0VarG4.b(1.0f, 1.0f, false, true, 15.0f, 2.0f);
            cwh0VarG4.v(20.0f);
            cwh0VarG4.c(1.0f, 1.0f, false, true, -1.5f, 0.866f);
            cwh0VarG4.j(2.846f, 16.712f);
            cwh0VarG4.c(5.445f, 5.445f, false, true, 0.0f, -9.424f);
            cwh0VarG4.j(13.5f, 1.135f);
            cwh0VarG4.c(1.0f, 1.0f, false, true, 1.0f, 0.0f);
            cwh0VarG4.e();
            cwh0VarG4.l(17.0f, 20.127f);
            cwh0VarG4.c(8.504f, 8.504f, false, false, 0.0f, -16.253f);
            cwh0VarG4.v(2.125f);
            cwh0VarG4.c(6.502f, 6.502f, false, true, 0.0f, 12.003f);
            cwh0VarG4.e();
            a180.a(a180Var4, cwh0VarG4.a, n6a1Var7, 1.0f, 2, 1.0f);
            n6a1 n6a1Var8 = new n6a1(j4);
            ArrayList arrayList4 = new ArrayList(32);
            arrayList4.add(new f9s0(17.0f, 7.968f));
            arrayList4.add(new j9s0(4.5f, 4.5f, 0.0f, false, true, 0.0f, 8.064f));
            arrayList4.add(b9s0.c);
            a180.a(a180Var4, arrayList4, n6a1Var8, 1.0f, 2, 1.0f);
            b180VarB4 = a180Var4.b();
            lvx.c = b180VarB4;
        }
        c = new ztx(dsxVar, new dsx(b180VarB3, b180VarB4));
        d = (byte) 8;
        CREATOR = new utx((byte) 4);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ztx);
    }

    public final int hashCode() {
        return 1646276783;
    }

    public final String toString() {
        return "Volume";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
