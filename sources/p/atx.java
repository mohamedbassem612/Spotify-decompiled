package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class atx extends hux {
    public static final Parcelable.Creator<atx> CREATOR;
    public static final atx c;

    static {
        b180 b180VarB = w8p1.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Stations16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(3.65f, 0.25f);
            cwh0VarG.b(0.75f, 0.75f, false, true, 4.4f, 1.0f);
            cwh0VarG.v(14.0f);
            cwh0VarG.c(0.75f, 0.75f, false, true, -1.5f, 0.0f);
            cwh0VarG.j(2.9f, 1.0f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.75f, -0.75f);
            cwh0VarG.l(13.1f, 3.0f);
            cwh0VarG.c(0.75f, 0.75f, false, false, -1.5f, 0.0f);
            cwh0VarG.v(10.0f);
            cwh0VarG.c(0.75f, 0.75f, false, false, 1.5f, 0.0f);
            cwh0VarG.e();
            cwh0VarG.l(7.3f, 4.0f);
            cwh0VarG.c(0.75f, 0.75f, true, false, -1.5f, 0.0f);
            cwh0VarG.v(8.0f);
            cwh0VarG.c(0.75f, 0.75f, false, false, 1.5f, 0.0f);
            cwh0VarG.e();
            cwh0VarG.l(1.5f, 6.0f);
            cwh0VarG.b(0.75f, 0.75f, false, false, 0.0f, 6.0f);
            cwh0VarG.v(4.0f);
            cwh0VarG.c(0.75f, 0.75f, false, false, 1.5f, 0.0f);
            cwh0VarG.e();
            cwh0VarG.l(9.45f, 6.25f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.75f, 0.75f);
            cwh0VarG.v(2.0f);
            cwh0VarG.c(0.75f, 0.75f, false, true, -1.5f, 0.0f);
            cwh0VarG.j(8.7f, 7.0f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.75f, -0.75f);
            cwh0VarG.l(16.0f, 6.0f);
            cwh0VarG.c(0.75f, 0.75f, false, false, -1.5f, 0.0f);
            cwh0VarG.v(4.0f);
            cwh0VarG.c(0.75f, 0.75f, false, false, 1.5f, 0.0f);
            cwh0VarG.e();
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            w8p1.b = b180VarB;
        }
        b180 b180VarB2 = x8p1.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Stations24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(7.0f, 3.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, false, -2.0f, 0.0f);
            cwh0VarG2.v(18.0f);
            cwh0VarG2.c(1.0f, 1.0f, true, false, 2.0f, 0.0f);
            cwh0VarG2.e();
            cwh0VarG2.l(3.0f, 9.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, false, -2.0f, 0.0f);
            cwh0VarG2.v(6.0f);
            cwh0VarG2.c(1.0f, 1.0f, true, false, 2.0f, 0.0f);
            cwh0VarG2.e();
            cwh0VarG2.l(10.0f, 6.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 1.0f, 1.0f);
            cwh0VarG2.v(10.0f);
            cwh0VarG2.c(1.0f, 1.0f, true, true, -2.0f, 0.0f);
            cwh0VarG2.j(9.0f, 7.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 1.0f, -1.0f);
            cwh0VarG2.m(5.0f, 4.0f);
            cwh0VarG2.c(1.0f, 1.0f, true, false, -2.0f, 0.0f);
            cwh0VarG2.v(4.0f);
            cwh0VarG2.c(1.0f, 1.0f, true, false, 2.0f, 0.0f);
            cwh0VarG2.e();
            cwh0VarG2.l(18.0f, 5.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 1.0f, 1.0f);
            cwh0VarG2.v(12.0f);
            cwh0VarG2.c(1.0f, 1.0f, true, true, -2.0f, 0.0f);
            cwh0VarG2.j(17.0f, 6.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 1.0f, -1.0f);
            cwh0VarG2.m(5.0f, 4.0f);
            cwh0VarG2.c(1.0f, 1.0f, true, false, -2.0f, 0.0f);
            cwh0VarG2.v(6.0f);
            cwh0VarG2.c(1.0f, 1.0f, true, false, 2.0f, 0.0f);
            cwh0VarG2.e();
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            x8p1.b = b180VarB2;
        }
        c = new atx(new dsx(b180VarB, b180VarB2), null);
        CREATOR = new psx((byte) 10);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof atx);
    }

    public final int hashCode() {
        return 417160724;
    }

    public final String toString() {
        return "Stations";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
