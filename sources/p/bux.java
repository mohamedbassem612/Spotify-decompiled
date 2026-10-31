package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bux extends hux {
    public static final Parcelable.Creator<bux> CREATOR;
    public static final bux c;
    public static final byte d;

    static {
        b180 b180VarB = gm50.c;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.VolumeOneWave16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(9.741f, 0.85f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.375f, 0.65f);
            cwh0VarG.v(13.0f);
            cwh0VarG.c(0.75f, 0.75f, false, true, -1.125f, 0.65f);
            cwh0VarG.k(-6.925f, -4.0f);
            cwh0VarG.c(3.64f, 3.64f, false, true, -1.33f, -4.967f);
            cwh0VarG.c(3.64f, 3.64f, false, true, 1.33f, -1.332f);
            cwh0VarG.k(6.925f, -4.0f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.75f, 0.0f);
            cwh0VarG.e();
            cwh0VarG.l(2.817f, 6.15f);
            cwh0VarG.c(2.14f, 2.14f, false, false, 0.0f, 3.7f);
            cwh0VarG.k(5.8f, 3.35f);
            cwh0VarG.j(8.617f, 2.8f);
            cwh0VarG.e();
            cwh0VarG.l(11.5f, 10.44f);
            cwh0VarG.j(11.5f, 5.56f);
            cwh0VarG.c(2.75f, 2.75f, false, true, 0.0f, 4.88f);
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            gm50.c = b180VarB;
        }
        b180 b180VarB2 = x760.c;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.VolumeOneWave24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(14.5f, 1.134f);
            cwh0VarG2.b(1.0f, 1.0f, false, true, 15.0f, 2.0f);
            cwh0VarG2.v(20.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, -1.5f, 0.866f);
            cwh0VarG2.j(2.846f, 16.712f);
            cwh0VarG2.c(5.445f, 5.445f, false, true, 0.0f, -9.424f);
            cwh0VarG2.j(13.5f, 1.135f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 1.0f, 0.0f);
            cwh0VarG2.e();
            cwh0VarG2.l(3.847f, 9.02f);
            cwh0VarG2.c(3.444f, 3.444f, false, false, 0.0f, 5.96f);
            cwh0VarG2.j(13.0f, 20.268f);
            cwh0VarG2.u(3.732f);
            cwh0VarG2.e();
            cwh0VarG2.l(17.0f, 16.032f);
            cwh0VarG2.u(7.968f);
            cwh0VarG2.c(4.5f, 4.5f, false, true, 0.0f, 8.064f);
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            x760.c = b180VarB2;
        }
        c = new bux(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new utx((byte) 6);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof bux);
    }

    public final int hashCode() {
        return 1236346576;
    }

    public final String toString() {
        return "VolumeOneWave";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
