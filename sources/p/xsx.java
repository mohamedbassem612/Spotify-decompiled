package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xsx extends hux {
    public static final Parcelable.Creator<xsx> CREATOR;
    public static final xsx c;
    public static final byte d;

    static {
        b180 b180VarB = i8p1.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Star16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(8.0f, 0.355f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.696f, 0.47f);
            cwh0VarG.k(1.812f, 4.493f);
            cwh0VarG.k(4.79f, 0.306f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.43f, 1.326f);
            cwh0VarG.k(-3.582f, 2.963f);
            cwh0VarG.k(1.067f, 4.82f);
            cwh0VarG.c(0.75f, 0.75f, false, true, -1.139f, 0.792f);
            cwh0VarG.j(8.0f, 12.895f);
            cwh0VarG.k(-4.074f, 2.63f);
            cwh0VarG.c(0.75f, 0.75f, false, true, -1.139f, -0.792f);
            cwh0VarG.k(1.067f, -4.82f);
            cwh0VarG.j(0.272f, 6.95f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.43f, -1.326f);
            cwh0VarG.k(4.79f, -0.306f);
            cwh0VarG.j(7.304f, 0.825f);
            cwh0VarG.b(0.75f, 0.75f, false, true, 8.0f, 0.355f);
            cwh0VarG.m(0.0f, 2.756f);
            cwh0VarG.j(6.707f, 6.316f);
            cwh0VarG.c(0.75f, 0.75f, false, true, -0.648f, 0.468f);
            cwh0VarG.j(2.686f, 7.0f);
            cwh0VarG.k(2.478f, 2.05f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.254f, 0.74f);
            cwh0VarG.k(-0.772f, 3.485f);
            cwh0VarG.k(2.947f, -1.902f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.814f, 0.0f);
            cwh0VarG.k(2.947f, 1.902f);
            cwh0VarG.k(-0.772f, -3.485f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.254f, -0.74f);
            cwh0VarG.j(13.314f, 7.0f);
            cwh0VarG.k(-3.373f, -0.215f);
            cwh0VarG.c(0.75f, 0.75f, false, true, -0.648f, -0.468f);
            cwh0VarG.j(8.0f, 3.11f);
            cwh0VarG.e();
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            i8p1.b = b180VarB;
        }
        b180 b180VarB2 = k8p1.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Star24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(12.0f, 0.06f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 0.927f, 0.626f);
            cwh0VarG2.k(2.765f, 6.856f);
            cwh0VarG2.k(7.309f, 0.466f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 0.573f, 1.769f);
            cwh0VarG2.k(-5.466f, 4.521f);
            cwh0VarG2.k(1.628f, 7.35f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, -1.519f, 1.056f);
            cwh0VarG2.j(12.0f, 18.69f);
            cwh0VarG2.k(-6.217f, 4.014f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, -1.519f, -1.057f);
            cwh0VarG2.k(1.627f, -7.349f);
            cwh0VarG2.j(0.425f, 9.777f);
            cwh0VarG2.b(1.0f, 1.0f, false, true, 1.0f, 8.008f);
            cwh0VarG2.k(7.309f, -0.466f);
            cwh0VarG2.j(11.073f, 0.686f);
            cwh0VarG2.b(1.0f, 1.0f, false, true, 12.0f, 0.06f);
            cwh0VarG2.m(0.0f, 3.674f);
            cwh0VarG2.k(-2.073f, 5.14f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, -0.863f, 0.624f);
            cwh0VarG2.k(-5.42f, 0.346f);
            cwh0VarG2.k(3.993f, 3.303f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 0.34f, 0.986f);
            cwh0VarG2.k(-1.234f, 5.57f);
            cwh0VarG2.k(4.715f, -3.043f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 1.084f, 0.0f);
            cwh0VarG2.k(4.715f, 3.043f);
            cwh0VarG2.k(-1.233f, -5.57f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 0.339f, -0.986f);
            cwh0VarG2.k(3.993f, -3.303f);
            cwh0VarG2.k(-5.42f, -0.346f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, -0.864f, -0.624f);
            cwh0VarG2.e();
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            k8p1.b = b180VarB2;
        }
        c = new xsx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new psx((byte) 7);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof xsx);
    }

    public final int hashCode() {
        return -47533785;
    }

    public final String toString() {
        return "Star";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
