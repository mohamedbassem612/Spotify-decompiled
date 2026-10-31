package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tox extends hux {
    public static final Parcelable.Creator<tox> CREATOR;
    public static final tox c;
    public static final byte d;

    static {
        b180 b180VarB = i3o1.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Menu16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarI = ydh.i(15.5f, 13.5f, 0.5f, 13.5f);
            rjx.r(cwh0VarI, 0.5f, 12.0f, 15.0f);
            cwh0VarI.l(15.5f, 8.75f);
            rjx.x(cwh0VarI, 0.5f, 8.75f, -1.5f, 15.0f);
            cwh0VarI.l(15.5f, 4.0f);
            cwh0VarI.j(0.5f, 4.0f);
            rjx.r(cwh0VarI, 0.5f, 2.5f, 15.0f);
            a180.a(a180Var, cwh0VarI.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            i3o1.b = b180VarB;
        }
        b180 b180VarB2 = n3o1.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Menu24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarI2 = ydh.i(21.0f, 6.0f, 3.0f, 6.0f);
            rjx.r(cwh0VarI2, 3.0f, 4.0f, 18.0f);
            cwh0VarI2.l(21.0f, 20.0f);
            rjx.x(cwh0VarI2, 3.0f, 20.0f, -2.0f, 18.0f);
            cwh0VarI2.l(21.0f, 13.0f);
            rjx.x(cwh0VarI2, 3.0f, 13.0f, -2.0f, 18.0f);
            a180.a(a180Var2, cwh0VarI2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            n3o1.b = b180VarB2;
        }
        c = new tox(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new snx((byte) 25);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof tox);
    }

    public final int hashCode() {
        return -47726540;
    }

    public final String toString() {
        return "Menu";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
