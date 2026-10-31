package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class grx extends hux {
    public static final Parcelable.Creator<grx> CREATOR;
    public static final grx c;
    public static final byte d;

    static {
        b180 b180VarB = syo1.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Playlist16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0Var = new cwh0();
            cwh0Var.l(4.0f, 1.0f);
            cwh0Var.i(11.0f);
            cwh0Var.v(11.75f);
            cwh0Var.b(2.75f, 2.75f, true, true, 12.25f, 10.0f);
            rjx.s(cwh0Var, 1.25f, 13.5f, 2.5f, -8.0f);
            cwh0Var.v(10.25f);
            cwh0Var.b(2.75f, 2.75f, true, true, 2.75f, 10.0f);
            rjx.u(cwh0Var, 4.0f, 10.0f, 4.0f, 11.5f);
            cwh0Var.j(2.75f, 11.5f);
            cwh0Var.b(1.25f, 1.25f, true, false, 4.0f, 12.75f);
            cwh0Var.e();
            cwh0Var.l(13.5f, 11.5f);
            cwh0Var.i(-1.25f);
            cwh0Var.c(1.25f, 1.25f, true, false, 1.25f, 1.25f);
            cwh0Var.e();
            a180.a(a180Var, cwh0Var.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            syo1.b = b180VarB;
        }
        b180 b180VarB2 = tyo1.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Playlist24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0Var2 = new cwh0();
            cwh0Var2.l(6.0f, 3.0f);
            cwh0Var2.i(15.0f);
            cwh0Var2.v(15.167f);
            cwh0Var2.c(3.5f, 3.5f, true, true, -3.5f, -3.5f);
            cwh0Var2.j(19.0f, 14.667f);
            cwh0Var2.j(19.0f, 5.0f);
            cwh0Var2.j(8.0f, 5.0f);
            cwh0Var2.v(13.167f);
            cwh0Var2.c(3.5f, 3.5f, true, true, -3.5f, -3.5f);
            rjx.u(cwh0Var2, 6.0f, 14.667f, 6.0f, 16.667f);
            cwh0Var2.j(4.5f, 16.667f);
            cwh0Var2.c(1.5f, 1.5f, true, false, 1.5f, 1.5f);
            cwh0Var2.e();
            cwh0Var2.l(19.0f, 16.667f);
            cwh0Var2.i(-1.5f);
            cwh0Var2.c(1.5f, 1.5f, true, false, 1.5f, 1.5f);
            cwh0Var2.e();
            a180.a(a180Var2, cwh0Var2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            tyo1.b = b180VarB2;
        }
        c = new grx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new dqx((byte) 28);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof grx);
    }

    public final int hashCode() {
        return 978303527;
    }

    public final String toString() {
        return "Playlist";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
