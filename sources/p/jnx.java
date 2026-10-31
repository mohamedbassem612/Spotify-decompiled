package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jnx extends hux {
    public static final Parcelable.Creator<jnx> CREATOR;
    public static final jnx c;
    public static final byte d;

    static {
        b180 b180VarB = cev0.a;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.GamesConsole16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            long j = u7h.b;
            n6a1 n6a1Var = new n6a1(j);
            cwh0 cwh0VarG = lf51.g(4.423f, 2.5f);
            cwh0VarG.c(1.25f, 1.25f, false, false, -1.224f, 0.995f);
            cwh0VarG.k(-1.652f, 7.923f);
            cwh0VarG.c(1.313f, 1.313f, false, false, 2.423f, 0.925f);
            cwh0VarG.k(1.57f, -2.718f);
            cwh0VarG.b(1.25f, 1.25f, false, true, 6.622f, 9.0f);
            cwh0VarG.i(2.756f);
            cwh0VarG.g(0.447f, 0.0f, 0.86f, 0.238f, 1.083f, 0.625f);
            cwh0VarG.k(1.57f, 2.718f);
            cwh0VarG.c(1.313f, 1.313f, false, false, 2.422f, -0.924f);
            cwh0VarG.k(-1.652f, -7.924f);
            cwh0VarG.c(1.25f, 1.25f, false, false, -1.224f, -0.995f);
            cwh0VarG.e();
            cwh0VarG.l(1.731f, 3.189f);
            cwh0VarG.b(2.75f, 2.75f, false, true, 4.423f, 1.0f);
            cwh0VarG.i(7.154f);
            cwh0VarG.c(2.75f, 2.75f, false, true, 2.692f, 2.189f);
            cwh0VarG.k(1.653f, 7.923f);
            cwh0VarG.c(2.813f, 2.813f, false, true, -5.19f, 1.981f);
            cwh0VarG.j(9.233f, 10.5f);
            cwh0VarG.j(6.766f, 10.5f);
            cwh0VarG.j(5.27f, 13.093f);
            cwh0VarG.c(2.813f, 2.813f, false, true, -5.19f, -1.98f);
            cwh0VarG.k(1.65f, -7.925f);
            cwh0VarG.e();
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            n6a1 n6a1Var2 = new n6a1(j);
            ArrayList arrayList = new ArrayList(32);
            arrayList.add(new f9s0(7.0f, 5.5f));
            arrayList.add(new j9s0(1.25f, 1.25f, 0.0f, true, true, -2.5f, 0.0f));
            arrayList.add(new j9s0(1.25f, 1.25f, 0.0f, false, true, 2.5f, 0.0f));
            arrayList.add(new n9s0(2.0f, 0.0f));
            arrayList.add(new j9s0(1.25f, 1.25f, 0.0f, true, false, 2.5f, 0.0f));
            arrayList.add(new j9s0(1.25f, 1.25f, 0.0f, false, false, -2.5f, 0.0f));
            a180.a(a180Var, arrayList, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            cev0.a = b180VarB;
        }
        b180 b180VarB2 = y7y0.a;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.GamesConsole24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            long j2 = u7h.b;
            n6a1 n6a1Var3 = new n6a1(j2);
            cwh0 cwh0VarG2 = lf51.g(7.041f, 4.0f);
            cwh0VarG2.c(2.5f, 2.5f, false, false, -2.447f, 1.99f);
            cwh0VarG2.j(2.22f, 17.372f);
            cwh0VarG2.c(2.183f, 2.183f, false, false, 4.274f, 0.89f);
            cwh0VarG2.k(0.474f, -2.272f);
            cwh0VarG2.b(2.5f, 2.5f, false, true, 9.415f, 14.0f);
            cwh0VarG2.i(5.17f);
            cwh0VarG2.c(2.5f, 2.5f, false, true, 2.447f, 1.99f);
            cwh0VarG2.k(0.474f, 2.273f);
            cwh0VarG2.c(2.183f, 2.183f, false, false, 4.274f, -0.892f);
            cwh0VarG2.j(19.406f, 5.99f);
            cwh0VarG2.b(2.5f, 2.5f, false, false, 16.96f, 4.0f);
            cwh0VarG2.h(7.04f);
            cwh0VarG2.e();
            cwh0VarG2.l(2.636f, 5.581f);
            cwh0VarG2.b(4.5f, 4.5f, false, true, 7.04f, 2.0f);
            cwh0VarG2.i(9.918f);
            cwh0VarG2.c(4.5f, 4.5f, false, true, 4.405f, 3.581f);
            cwh0VarG2.k(2.374f, 11.382f);
            cwh0VarG2.c(4.183f, 4.183f, true, true, -8.19f, 1.708f);
            cwh0VarG2.k(-0.474f, -2.273f);
            cwh0VarG2.c(0.5f, 0.5f, false, false, -0.49f, -0.398f);
            cwh0VarG2.h(9.416f);
            cwh0VarG2.c(0.5f, 0.5f, false, false, -0.49f, 0.398f);
            cwh0VarG2.k(-0.473f, 2.273f);
            cwh0VarG2.c(4.183f, 4.183f, true, true, -8.19f, -1.708f);
            cwh0VarG2.e();
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var3, 1.0f, 2, 1.0f);
            n6a1 n6a1Var4 = new n6a1(j2);
            ArrayList arrayList2 = new ArrayList(32);
            arrayList2.add(new f9s0(10.0f, 8.75f));
            arrayList2.add(new j9s0(1.75f, 1.75f, 0.0f, true, true, -3.5f, 0.0f));
            arrayList2.add(new j9s0(1.75f, 1.75f, 0.0f, false, true, 3.5f, 0.0f));
            arrayList2.add(new n9s0(4.0f, 0.0f));
            arrayList2.add(new j9s0(1.75f, 1.75f, 0.0f, true, false, 3.5f, 0.0f));
            arrayList2.add(new j9s0(1.75f, 1.75f, 0.0f, false, false, -3.5f, 0.0f));
            a180.a(a180Var2, arrayList2, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            y7y0.a = b180VarB2;
        }
        c = new jnx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new mmx((byte) 21);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof jnx);
    }

    public final int hashCode() {
        return -484973269;
    }

    public final String toString() {
        return "GamesConsole";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
