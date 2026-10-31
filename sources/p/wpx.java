package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wpx extends hux {
    public static final Parcelable.Creator<wpx> CREATOR;
    public static final wpx c;
    public static final byte d;

    static {
        b180 b180VarB = voo1.h;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Pin16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(11.609f, 1.858f);
            cwh0VarG.c(1.22f, 1.22f, false, false, -1.727f, 0.0f);
            cwh0VarG.j(5.92f, 5.82f);
            cwh0VarG.k(-2.867f, 0.768f);
            cwh0VarG.k(6.359f, 6.359f);
            cwh0VarG.k(0.768f, -2.867f);
            cwh0VarG.k(3.962f, -3.963f);
            cwh0VarG.c(1.22f, 1.22f, false, false, 0.0f, -1.726f);
            cwh0VarG.e();
            cwh0VarG.l(8.822f, 0.797f);
            cwh0VarG.c(2.72f, 2.72f, false, true, 3.847f, 0.0f);
            cwh0VarG.k(2.534f, 2.533f);
            cwh0VarG.c(2.72f, 2.72f, false, true, 0.0f, 3.848f);
            cwh0VarG.k(-3.678f, 3.678f);
            cwh0VarG.k(-1.337f, 4.988f);
            cwh0VarG.k(-4.486f, -4.486f);
            cwh0VarG.j(1.28f, 15.78f);
            cwh0VarG.c(0.75f, 0.75f, false, true, -1.06f, -1.06f);
            cwh0VarG.k(4.422f, -4.422f);
            cwh0VarG.j(0.156f, 5.812f);
            cwh0VarG.k(4.987f, -1.337f);
            cwh0VarG.e();
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            voo1.h = b180VarB;
        }
        b180 b180VarB2 = yoo1.c;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Pin24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(17.002f, 3.503f);
            cwh0VarG2.c(1.72f, 1.72f, false, false, -2.43f, 0.0f);
            cwh0VarG2.k(-5.459f, 5.46f);
            cwh0VarG2.k(-4.002f, 1.072f);
            cwh0VarG2.k(8.854f, 8.854f);
            cwh0VarG2.k(1.073f, -4.002f);
            cwh0VarG2.k(5.459f, -5.46f);
            cwh0VarG2.c(1.72f, 1.72f, false, false, 0.0f, -2.43f);
            cwh0VarG2.e();
            cwh0VarG2.l(13.158f, 2.09f);
            cwh0VarG2.c(3.72f, 3.72f, false, true, 5.258f, 0.0f);
            cwh0VarG2.k(3.495f, 3.495f);
            cwh0VarG2.c(3.72f, 3.72f, false, true, 0.0f, 5.258f);
            cwh0VarG2.k(-5.08f, 5.08f);
            cwh0VarG2.k(-1.83f, 6.831f);
            cwh0VarG2.k(-6.17f, -6.17f);
            cwh0VarG2.k(-6.124f, 6.124f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, -1.414f, -1.414f);
            cwh0VarG2.k(6.124f, -6.124f);
            cwh0VarG2.j(1.247f, 9.0f);
            cwh0VarG2.k(6.83f, -1.83f);
            cwh0VarG2.e();
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            yoo1.c = b180VarB2;
        }
        dsx dsxVar = new dsx(b180VarB, b180VarB2);
        b180 b180VarB3 = bpo1.a;
        if (b180VarB3 == null) {
            a180 a180Var3 = new a180("Encore.Vector.PinActive16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i3 = bui1.a;
            n6a1 n6a1Var3 = new n6a1(u7h.b);
            cwh0 cwh0VarG3 = lf51.g(8.822f, 0.797f);
            cwh0VarG3.c(2.72f, 2.72f, false, true, 3.847f, 0.0f);
            cwh0VarG3.k(2.534f, 2.533f);
            cwh0VarG3.c(2.72f, 2.72f, false, true, 0.0f, 3.848f);
            cwh0VarG3.k(-3.678f, 3.678f);
            cwh0VarG3.k(-1.337f, 4.988f);
            cwh0VarG3.k(-4.486f, -4.486f);
            cwh0VarG3.j(1.28f, 15.78f);
            cwh0VarG3.c(0.75f, 0.75f, false, true, -1.06f, -1.06f);
            cwh0VarG3.k(4.422f, -4.422f);
            cwh0VarG3.j(0.156f, 5.812f);
            cwh0VarG3.k(4.987f, -1.337f);
            cwh0VarG3.e();
            a180.a(a180Var3, cwh0VarG3.a, n6a1Var3, 1.0f, 2, 1.0f);
            b180VarB3 = a180Var3.b();
            bpo1.a = b180VarB3;
        }
        b180 b180VarB4 = epo1.b;
        if (b180VarB4 == null) {
            a180 a180Var4 = new a180("Encore.Vector.PinActive24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i4 = bui1.a;
            n6a1 n6a1Var4 = new n6a1(u7h.b);
            cwh0 cwh0VarG4 = lf51.g(13.158f, 2.089f);
            cwh0VarG4.c(3.72f, 3.72f, false, true, 5.258f, 0.0f);
            cwh0VarG4.k(3.495f, 3.495f);
            cwh0VarG4.c(3.72f, 3.72f, false, true, 0.0f, 5.258f);
            cwh0VarG4.k(-5.08f, 5.08f);
            cwh0VarG4.k(-1.83f, 6.831f);
            cwh0VarG4.k(-6.17f, -6.17f);
            cwh0VarG4.k(-6.124f, 6.124f);
            cwh0VarG4.c(1.0f, 1.0f, false, true, -1.414f, -1.414f);
            cwh0VarG4.k(6.124f, -6.124f);
            cwh0VarG4.j(1.247f, 9.0f);
            cwh0VarG4.k(6.83f, -1.83f);
            cwh0VarG4.e();
            a180.a(a180Var4, cwh0VarG4.a, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB4 = a180Var4.b();
            epo1.b = b180VarB4;
        }
        c = new wpx(dsxVar, new dsx(b180VarB3, b180VarB4));
        d = (byte) 8;
        CREATOR = new yox((byte) 23);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof wpx);
    }

    public final int hashCode() {
        return -1525557216;
    }

    public final String toString() {
        return "Pin";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
