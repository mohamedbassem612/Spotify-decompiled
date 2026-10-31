package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ltx extends hux {
    public static final Parcelable.Creator<ltx> CREATOR;
    public static final ltx c;
    public static final byte d;

    static {
        b180 b180VarB = si1.d;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Track16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarP = rjx.p(10.0f, 2.0f, 9.5f);
            cwh0VarP.c(2.75f, 2.75f, true, true, -2.75f, -2.75f);
            ydh.k(cwh0VarP, 8.5f, 8.75f, 8.5f, 2.0f);
            cwh0VarP.l(8.5f, 10.25f);
            cwh0VarP.j(7.25f, 10.25f);
            cwh0VarP.b(1.25f, 1.25f, true, false, 8.5f, 11.5f);
            cwh0VarP.e();
            a180.a(a180Var, cwh0VarP.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            si1.d = b180VarB;
        }
        b180 b180VarB2 = sj1.h;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Track24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarP2 = rjx.p(15.0f, 4.0f, 12.167f);
            cwh0VarP2.c(3.5f, 3.5f, true, true, -3.5f, -3.5f);
            ydh.k(cwh0VarP2, 13.0f, 12.667f, 13.0f, 4.0f);
            cwh0VarP2.l(13.0f, 14.667f);
            cwh0VarP2.i(-1.5f);
            cwh0VarP2.c(1.5f, 1.5f, true, false, 1.5f, 1.5f);
            cwh0VarP2.e();
            a180.a(a180Var2, cwh0VarP2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            sj1.h = b180VarB2;
        }
        c = new ltx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new psx((byte) 21);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ltx);
    }

    public final int hashCode() {
        return -1472683754;
    }

    public final String toString() {
        return "Track";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
