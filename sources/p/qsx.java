package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qsx extends hux {
    public static final Parcelable.Creator<qsx> CREATOR;
    public static final qsx c;
    public static final byte d;

    static {
        b180 b180VarB = i6p1.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Sort16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0Var = new cwh0();
            cwh0Var.l(0.5f, 5.0f);
            cwh0Var.i(15.0f);
            cwh0Var.j(15.5f, 3.5f);
            rjx.u(cwh0Var, 0.5f, 3.5f, 15.5f, 8.75f);
            rjx.x(cwh0Var, 0.5f, 8.75f, -1.5f, 15.0f);
            cwh0Var.l(15.5f, 12.5f);
            cwh0Var.j(0.5f, 12.5f);
            rjx.r(cwh0Var, 0.5f, 11.0f, 15.0f);
            a180.a(a180Var, cwh0Var.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            i6p1.b = b180VarB;
        }
        b180 b180VarB2 = j6p1.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Sort24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarI = ydh.i(21.0f, 8.0f, 3.0f, 8.0f);
            rjx.r(cwh0VarI, 3.0f, 6.0f, 18.0f);
            cwh0VarI.l(21.0f, 18.0f);
            rjx.x(cwh0VarI, 3.0f, 18.0f, -2.0f, 18.0f);
            rjx.z(cwh0VarI, 3.0f, 13.0f, 18.0f, -2.0f);
            cwh0VarI.j(3.0f, 11.0f);
            cwh0VarI.e();
            a180.a(a180Var2, cwh0VarI.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            j6p1.b = b180VarB2;
        }
        c = new qsx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new psx((byte) 0);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof qsx);
    }

    public final int hashCode() {
        return -47538061;
    }

    public final String toString() {
        return "Sort";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
