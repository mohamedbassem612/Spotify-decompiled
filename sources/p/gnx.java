package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gnx extends hux {
    public static final Parcelable.Creator<gnx> CREATOR;
    public static final gnx c;
    public static final byte d;

    static {
        b180 b180VarB;
        b180 b180Var = i1k0.d;
        if (b180Var != null) {
            b180VarB = b180Var;
        } else {
            a180 a180Var = new a180("Encore.Vector.Folder16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(1.75f, 1.0f);
            cwh0VarG.b(1.75f, 1.75f, false, false, 0.0f, 2.75f);
            cwh0VarG.v(11.5f);
            cwh0VarG.f(0.0f, 15.216f, 0.784f, 16.0f, 1.75f, 16.0f);
            cwh0VarG.i(12.5f);
            cwh0VarG.b(1.75f, 1.75f, false, false, 16.0f, 14.25f);
            cwh0VarG.v(-9.5f);
            cwh0VarG.b(1.75f, 1.75f, false, false, 14.25f, 3.0f);
            cwh0VarG.h(7.82f);
            cwh0VarG.k(-0.65f, -1.125f);
            cwh0VarG.b(1.75f, 1.75f, false, false, 5.655f, 1.0f);
            cwh0VarG.e();
            cwh0VarG.l(1.5f, 2.75f);
            cwh0VarG.c(0.25f, 0.25f, false, true, 0.25f, -0.25f);
            cwh0VarG.i(3.905f);
            cwh0VarG.c(0.25f, 0.25f, false, true, 0.216f, 0.125f);
            cwh0VarG.j(6.954f, 4.5f);
            cwh0VarG.i(7.296f);
            cwh0VarG.c(0.25f, 0.25f, false, true, 0.25f, 0.25f);
            cwh0VarG.v(9.5f);
            cwh0VarG.c(0.25f, 0.25f, false, true, -0.25f, 0.25f);
            cwh0VarG.h(1.75f);
            cwh0VarG.c(0.25f, 0.25f, false, true, -0.25f, -0.25f);
            cwh0VarG.e();
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            i1k0.d = b180VarB;
        }
        b180 b180VarB2 = crm0.a;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Folder24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(1.0f, 4.0f);
            cwh0VarG2.c(2.0f, 2.0f, false, true, 2.0f, -2.0f);
            cwh0VarG2.i(5.155f);
            cwh0VarG2.c(3.0f, 3.0f, false, true, 2.598f, 1.5f);
            cwh0VarG2.k(0.866f, 1.5f);
            cwh0VarG2.j(21.0f, 5.0f);
            cwh0VarG2.c(2.0f, 2.0f, false, true, 2.0f, 2.0f);
            cwh0VarG2.v(13.0f);
            cwh0VarG2.c(2.0f, 2.0f, false, true, -2.0f, 2.0f);
            cwh0VarG2.j(3.0f, 22.0f);
            cwh0VarG2.c(2.0f, 2.0f, false, true, -2.0f, -2.0f);
            hrt.o(cwh0VarG2, 8.155f, 4.0f, 3.0f, 4.0f);
            cwh0VarG2.v(16.0f);
            cwh0VarG2.i(18.0f);
            cwh0VarG2.j(21.0f, 7.0f);
            cwh0VarG2.j(10.464f, 7.0f);
            cwh0VarG2.j(9.021f, 4.5f);
            cwh0VarG2.c(1.0f, 1.0f, false, false, -0.866f, -0.5f);
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            crm0.a = b180VarB2;
        }
        dsx dsxVar = new dsx(b180VarB, b180VarB2);
        b180 b180VarB3 = u7n0.b;
        if (b180VarB3 == null) {
            a180 a180Var3 = new a180("Encore.Vector.FolderActive16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i3 = bui1.a;
            n6a1 n6a1Var3 = new n6a1(u7h.b);
            cwh0 cwh0VarG3 = lf51.g(1.75f, 1.0f);
            cwh0VarG3.b(1.75f, 1.75f, false, false, 0.0f, 2.75f);
            cwh0VarG3.v(11.5f);
            cwh0VarG3.f(0.0f, 15.216f, 0.784f, 16.0f, 1.75f, 16.0f);
            cwh0VarG3.i(12.5f);
            cwh0VarG3.b(1.75f, 1.75f, false, false, 16.0f, 14.25f);
            cwh0VarG3.v(-9.5f);
            cwh0VarG3.b(1.75f, 1.75f, false, false, 14.25f, 3.0f);
            cwh0VarG3.h(7.82f);
            cwh0VarG3.k(-0.65f, -1.125f);
            cwh0VarG3.b(1.75f, 1.75f, false, false, 5.655f, 1.0f);
            cwh0VarG3.e();
            a180.a(a180Var3, cwh0VarG3.a, n6a1Var3, 1.0f, 2, 1.0f);
            b180VarB3 = a180Var3.b();
            u7n0.b = b180VarB3;
        }
        b180 b180VarB4 = sjo0.b;
        if (b180VarB4 == null) {
            a180 a180Var4 = new a180("Encore.Vector.FolderActive24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i4 = bui1.a;
            n6a1 n6a1Var4 = new n6a1(u7h.b);
            cwh0 cwh0VarG4 = lf51.g(1.0f, 4.0f);
            cwh0VarG4.c(2.0f, 2.0f, false, true, 2.0f, -2.0f);
            cwh0VarG4.i(5.155f);
            cwh0VarG4.c(3.0f, 3.0f, false, true, 2.598f, 1.5f);
            cwh0VarG4.k(0.866f, 1.5f);
            cwh0VarG4.h(21.0f);
            cwh0VarG4.c(2.0f, 2.0f, false, true, 2.0f, 2.0f);
            cwh0VarG4.v(13.0f);
            cwh0VarG4.c(2.0f, 2.0f, false, true, -2.0f, 2.0f);
            cwh0VarG4.h(3.0f);
            cwh0VarG4.c(2.0f, 2.0f, false, true, -2.0f, -2.0f);
            cwh0VarG4.e();
            a180.a(a180Var4, cwh0VarG4.a, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB4 = a180Var4.b();
            sjo0.b = b180VarB4;
        }
        c = new gnx(dsxVar, new dsx(b180VarB3, b180VarB4));
        d = (byte) 8;
        CREATOR = new mmx((byte) 18);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof gnx);
    }

    public final int hashCode() {
        return 1188193795;
    }

    public final String toString() {
        return "Folder";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
