package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bsx extends hux {
    public static final Parcelable.Creator<bsx> CREATOR;
    public static final bsx c;
    public static final byte d;

    static {
        b180 b180VarB = n3p1.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Replay16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(6.063f, 2.853f);
            cwh0VarG.c(5.5f, 5.5f, true, true, -3.376f, 6.57f);
            cwh0VarG.c(0.75f, 0.75f, false, false, -1.448f, 0.389f);
            cwh0VarG.b(7.0f, 7.0f, true, false, 2.5f, 3.67f);
            cwh0VarG.u(2.0f);
            cwh0VarG.b(0.75f, 0.75f, false, false, 1.0f, 2.0f);
            cwh0VarG.v(4.0f);
            cwh0VarG.i(4.0f);
            cwh0VarG.c(0.75f, 0.75f, false, false, 0.0f, -1.5f);
            cwh0VarG.h(3.757f);
            cwh0VarG.c(5.5f, 5.5f, false, true, 2.306f, -1.647f);
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            n3p1.b = b180VarB;
        }
        b180 b180VarB2 = q3p1.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Replay24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(9.182f, 4.513f);
            cwh0VarG2.c(8.0f, 8.0f, true, true, -4.91f, 9.558f);
            cwh0VarG2.c(1.0f, 1.0f, true, false, -1.931f, 0.517f);
            cwh0VarG2.b(10.0f, 10.0f, true, false, 4.0f, 6.0f);
            cwh0VarG2.u(4.25f);
            cwh0VarG2.c(1.0f, 1.0f, false, false, -2.0f, 0.0f);
            cwh0VarG2.u(9.5f);
            cwh0VarG2.i(5.25f);
            cwh0VarG2.c(1.0f, 1.0f, true, false, 0.0f, -2.0f);
            cwh0VarG2.h(5.386f);
            cwh0VarG2.c(8.0f, 8.0f, false, true, 3.796f, -2.987f);
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            q3p1.b = b180VarB2;
        }
        c = new bsx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new jrx((byte) 17);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof bsx);
    }

    public final int hashCode() {
        return 1522635132;
    }

    public final String toString() {
        return "Replay";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
