package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ikx extends hux {
    public static final Parcelable.Creator<ikx> CREATOR;
    public static final ikx c;
    public static final byte d;

    static {
        b180 b180VarB = n1p1.a;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.ArrowLeft16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, true, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(8.81f, 1.0f);
            cwh0VarG.b(0.749f, 0.749f, false, false, 7.53f, 0.47f);
            cwh0VarG.j(0.0f, 7.99f);
            cwh0VarG.k(7.53f, 7.521f);
            cwh0VarG.c(0.75f, 0.75f, false, false, 1.234f, -0.815f);
            cwh0VarG.c(0.8f, 0.8f, false, false, -0.174f, -0.243f);
            cwh0VarG.j(2.87f, 8.74f);
            cwh0VarG.i(12.38f);
            cwh0VarG.c(0.75f, 0.75f, true, false, 0.0f, -1.498f);
            cwh0VarG.h(2.87f);
            cwh0VarG.k(5.72f, -5.713f);
            cwh0VarG.g(0.14f, -0.14f, 0.22f, -0.331f, 0.22f, -0.53f);
            cwh0VarG.e();
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            n1p1.a = b180VarB;
        }
        b180 b180VarB2 = o1p1.a;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.ArrowLeft24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(13.414f, 3.5f);
            cwh0VarG2.c(0.999f, 0.999f, false, false, -1.707f, -0.707f);
            cwh0VarG2.k(-9.207f, 9.2f);
            cwh0VarG2.k(9.207f, 9.202f);
            cwh0VarG2.c(1.0f, 1.0f, true, false, 1.414f, -1.413f);
            cwh0VarG2.j(6.335f, 13.0f);
            cwh0VarG2.h(20.5f);
            cwh0VarG2.c(1.0f, 1.0f, false, false, 0.0f, -2.0f);
            cwh0VarG2.h(6.322f);
            cwh0VarG2.k(6.799f, -6.794f);
            cwh0VarG2.c(1.0f, 1.0f, false, false, 0.293f, -0.707f);
            cwh0VarG2.e();
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            o1p1.a = b180VarB2;
        }
        c = new ikx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new ckx((byte) 5);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ikx);
    }

    public final int hashCode() {
        return 1102261755;
    }

    public final String toString() {
        return "ArrowLeft";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
