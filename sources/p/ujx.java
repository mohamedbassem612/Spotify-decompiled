package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ujx extends hux {
    public static final Parcelable.Creator<ujx> CREATOR;
    public static final ujx c;
    public static final byte d;

    static {
        b180 b180VarB = nyo1.a;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.AddToPlaylist16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0Var = new cwh0();
            cwh0Var.l(2.0f, 0.0f);
            cwh0Var.v(2.0f);
            cwh0Var.j(0.0f, 2.0f);
            cwh0Var.v(1.5f);
            cwh0Var.i(2.0f);
            cwh0Var.v(2.0f);
            cwh0Var.i(1.5f);
            cwh0Var.v(-2.0f);
            cwh0Var.i(2.0f);
            cwh0Var.j(5.5f, 2.0f);
            cwh0Var.i(-2.0f);
            cwh0Var.j(3.5f, 0.0f);
            cwh0Var.e();
            cwh0Var.l(13.5f, 2.5f);
            cwh0Var.j(8.244f, 2.5f);
            cwh0Var.b(5.5f, 5.5f, false, false, 7.966f, 1.0f);
            cwh0Var.j(15.0f, 1.0f);
            cwh0Var.v(11.75f);
            cwh0Var.b(2.75f, 2.75f, true, true, 12.25f, 10.0f);
            rjx.v(cwh0Var, 1.25f, 13.5f, 11.5f, -1.25f);
            cwh0Var.c(1.25f, 1.25f, true, false, 1.25f, 1.25f);
            cwh0Var.e();
            cwh0Var.l(4.0f, 8.107f);
            cwh0Var.c(5.5f, 5.5f, false, false, 1.5f, -0.593f);
            cwh0Var.v(5.236f);
            cwh0Var.b(2.75f, 2.75f, true, true, 2.75f, 10.0f);
            rjx.u(cwh0Var, 4.0f, 10.0f, 4.0f, 11.5f);
            cwh0Var.j(2.75f, 11.5f);
            cwh0Var.b(1.25f, 1.25f, true, false, 4.0f, 12.75f);
            cwh0Var.e();
            a180.a(a180Var, cwh0Var.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            nyo1.a = b180VarB;
        }
        b180 b180VarB2 = qyo1.a;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.AddToPlaylist24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarI = ydh.i(3.0f, 8.0f, 3.0f, 5.0f);
            cwh0VarI.j(0.0f, 5.0f);
            cwh0VarI.j(0.0f, 3.0f);
            rjx.s(cwh0VarI, 3.0f, 3.0f, 0.0f, 2.0f);
            cwh0VarI.v(3.0f);
            cwh0VarI.i(3.0f);
            cwh0VarI.v(2.0f);
            cwh0VarI.j(5.0f, 5.0f);
            cwh0VarI.v(3.0f);
            cwh0VarI.e();
            cwh0VarI.l(11.0f, 4.0f);
            cwh0VarI.o(0.0f, 0.51f, -0.07f, 1.0f);
            cwh0VarI.j(19.0f, 5.0f);
            cwh0VarI.v(9.667f);
            cwh0VarI.i(-1.5f);
            cwh0VarI.c(3.5f, 3.5f, true, false, 3.5f, 3.5f);
            cwh0VarI.j(21.0f, 3.0f);
            cwh0VarI.j(10.93f, 3.0f);
            cwh0VarI.o(0.07f, 0.49f, 0.07f, 1.0f);
            cwh0VarI.m(8.0f, 12.667f);
            cwh0VarI.v(1.5f);
            cwh0VarI.c(1.5f, 1.5f, true, true, -1.5f, -1.5f);
            cwh0VarI.e();
            cwh0VarI.l(6.0f, 10.71f);
            cwh0VarI.c(7.0f, 7.0f, false, false, 2.0f, -0.965f);
            cwh0VarI.v(8.422f);
            cwh0VarI.c(3.5f, 3.5f, true, true, -3.5f, -3.5f);
            rjx.u(cwh0VarI, 6.0f, 14.667f, 6.0f, 16.667f);
            cwh0VarI.j(4.5f, 16.667f);
            cwh0VarI.c(1.5f, 1.5f, true, false, 1.5f, 1.5f);
            cwh0VarI.e();
            a180.a(a180Var2, cwh0VarI.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            qyo1.a = b180VarB2;
        }
        c = new ujx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new x7w((byte) 22);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ujx);
    }

    public final int hashCode() {
        return -875840071;
    }

    public final String toString() {
        return "AddToPlaylist";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
