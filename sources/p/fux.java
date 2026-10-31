package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fux extends hux {
    public static final Parcelable.Creator<fux> CREATOR;
    public static final fux c;
    public static final byte d;

    static {
        b180 b180VarB = pxd0.k;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.X16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(2.47f, 2.47f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 1.06f, 0.0f);
            cwh0VarG.j(8.0f, 6.94f);
            cwh0VarG.k(4.47f, -4.47f);
            cwh0VarG.c(0.75f, 0.75f, true, true, 1.06f, 1.06f);
            cwh0VarG.j(9.06f, 8.0f);
            cwh0VarG.k(4.47f, 4.47f);
            cwh0VarG.c(0.75f, 0.75f, true, true, -1.06f, 1.06f);
            cwh0VarG.j(8.0f, 9.06f);
            cwh0VarG.k(-4.47f, 4.47f);
            cwh0VarG.c(0.75f, 0.75f, false, true, -1.06f, -1.06f);
            cwh0VarG.j(6.94f, 8.0f);
            cwh0VarG.j(2.47f, 3.53f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.0f, -1.06f);
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            pxd0.k = b180VarB;
        }
        b180 b180VarB2 = qxd0.c;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.X24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(3.293f, 3.293f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 1.414f, 0.0f);
            cwh0VarG2.j(12.0f, 10.586f);
            cwh0VarG2.k(7.293f, -7.293f);
            cwh0VarG2.c(1.0f, 1.0f, true, true, 1.414f, 1.414f);
            cwh0VarG2.j(13.414f, 12.0f);
            cwh0VarG2.k(7.293f, 7.293f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, -1.414f, 1.414f);
            cwh0VarG2.j(12.0f, 13.414f);
            cwh0VarG2.k(-7.293f, 7.293f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, -1.414f, -1.414f);
            cwh0VarG2.j(10.586f, 12.0f);
            cwh0VarG2.j(3.293f, 4.707f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 0.0f, -1.414f);
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            qxd0.c = b180VarB2;
        }
        c = new fux(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new hbn1((byte) 19);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof fux);
    }

    public final int hashCode() {
        return -949072445;
    }

    public final String toString() {
        return "X";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
