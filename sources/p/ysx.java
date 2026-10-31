package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ysx extends hux {
    public static final Parcelable.Creator<ysx> CREATOR;
    public static final ysx c;
    public static final byte d;

    static {
        b180 b180VarB = n8p1.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.StarAlt16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(8.696f, 0.825f);
            cwh0VarG.c(0.75f, 0.75f, false, false, -1.392f, 0.0f);
            cwh0VarG.j(5.492f, 5.318f);
            cwh0VarG.k(-4.79f, 0.306f);
            cwh0VarG.c(0.75f, 0.75f, false, false, -0.43f, 1.326f);
            cwh0VarG.k(3.582f, 2.963f);
            cwh0VarG.k(-1.067f, 4.82f);
            cwh0VarG.c(0.75f, 0.75f, false, false, 1.14f, 0.792f);
            cwh0VarG.j(8.0f, 12.895f);
            cwh0VarG.k(4.074f, 2.63f);
            cwh0VarG.c(0.75f, 0.75f, false, false, 1.139f, -0.792f);
            cwh0VarG.k(-1.067f, -4.82f);
            cwh0VarG.k(3.582f, -2.963f);
            cwh0VarG.c(0.75f, 0.75f, false, false, -0.43f, -1.326f);
            cwh0VarG.k(-4.79f, -0.306f);
            cwh0VarG.e();
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            n8p1.b = b180VarB;
        }
        b180 b180VarB2 = p8p1.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.StarAlt24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(12.927f, 0.686f);
            cwh0VarG2.c(1.0f, 1.0f, false, false, -1.854f, 0.0f);
            cwh0VarG2.j(8.308f, 7.542f);
            cwh0VarG2.k(-7.309f, 0.466f);
            cwh0VarG2.c(1.0f, 1.0f, false, false, -0.574f, 1.769f);
            cwh0VarG2.k(5.466f, 4.521f);
            cwh0VarG2.k(-1.627f, 7.35f);
            cwh0VarG2.c(1.0f, 1.0f, false, false, 1.519f, 1.056f);
            cwh0VarG2.j(12.0f, 18.69f);
            cwh0VarG2.k(6.217f, 4.014f);
            cwh0VarG2.c(1.0f, 1.0f, false, false, 1.519f, -1.057f);
            cwh0VarG2.k(-1.628f, -7.349f);
            cwh0VarG2.k(5.466f, -4.521f);
            cwh0VarG2.c(1.0f, 1.0f, false, false, -0.573f, -1.769f);
            cwh0VarG2.k(-7.309f, -0.466f);
            cwh0VarG2.e();
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            p8p1.b = b180VarB2;
        }
        c = new ysx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new psx((byte) 8);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ysx);
    }

    public final int hashCode() {
        return 1260284674;
    }

    public final String toString() {
        return "StarAlt";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
