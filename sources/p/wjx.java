package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wjx extends hux {
    public static final Parcelable.Creator<wjx> CREATOR;
    public static final wjx c;

    static {
        b180 b180VarB = tyo1.a;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.AddedToQueue16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarI = ydh.i(6.46f, 1.5f, 5.4f, 0.44f);
            cwh0VarI.k(-3.0f, 3.0f);
            cwh0VarI.j(1.0f, 2.04f);
            ydh.k(cwh0VarI, -0.06f, 3.1f, 2.4f, 5.56f);
            cwh0VarI.l(7.188f, 6.0f);
            cwh0VarI.g(0.331f, -0.452f, 0.596f, -0.957f, 0.778f, -1.5f);
            cwh0VarI.j(13.5f, 4.5f);
            cwh0VarI.c(1.0f, 1.0f, true, false, 0.0f, -2.0f);
            cwh0VarI.j(8.244f, 2.5f);
            cwh0VarI.b(5.5f, 5.5f, false, false, 7.966f, 1.0f);
            cwh0VarI.j(13.5f, 1.0f);
            cwh0VarI.c(2.5f, 2.5f, false, true, 0.0f, 5.0f);
            hrt.o(cwh0VarI, 16.0f, 10.5f, 2.0f, 10.5f);
            rjx.r(cwh0VarI, 2.0f, 9.0f, 14.0f);
            cwh0VarI.l(16.0f, 15.0f);
            rjx.x(cwh0VarI, 2.0f, 15.0f, -1.5f, 14.0f);
            a180.a(a180Var, cwh0VarI.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            tyo1.a = b180VarB;
        }
        b180 b180VarB2 = vyo1.a;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.AddedToQueue24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarI2 = ydh.i(8.414f, 3.0f, 7.0f, 1.586f);
            cwh0VarI2.k(-3.75f, 3.75f);
            cwh0VarI2.k(-1.75f, -1.75f);
            ydh.k(cwh0VarI2, 0.086f, 5.0f, 3.25f, 8.164f);
            cwh0VarI2.l(11.0f, 4.0f);
            cwh0VarI2.o(0.0f, 0.51f, -0.07f, 1.0f);
            cwh0VarI2.i(7.62f);
            cwh0VarI2.c(1.5f, 1.5f, true, true, 0.0f, 3.0f);
            cwh0VarI2.j(9.745f, 8.0f);
            cwh0VarI2.c(7.0f, 7.0f, false, true, -2.137f, 2.0f);
            cwh0VarI2.j(18.55f, 10.0f);
            cwh0VarI2.c(3.5f, 3.5f, true, false, 0.0f, -7.0f);
            cwh0VarI2.i(-7.62f);
            cwh0VarI2.o(0.07f, 0.49f, 0.07f, 1.0f);
            cwh0VarI2.m(10.0f, 12.0f);
            rjx.x(cwh0VarI2, 3.0f, 16.0f, -2.0f, 18.0f);
            cwh0VarI2.l(21.0f, 22.0f);
            rjx.x(cwh0VarI2, 3.0f, 22.0f, -2.0f, 18.0f);
            a180.a(a180Var2, cwh0VarI2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            vyo1.a = b180VarB2;
        }
        c = new wjx(new dsx(b180VarB, b180VarB2), null);
        CREATOR = new x7w((byte) 24);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof wjx);
    }

    public final int hashCode() {
        return 1216842763;
    }

    public final String toString() {
        return "AddedToQueue";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
