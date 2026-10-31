package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zsx extends hux {
    public static final Parcelable.Creator<zsx> CREATOR;
    public static final zsx c;
    public static final byte d;

    static {
        b180 b180VarB = s8p1.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.StarBadge16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(8.0f, 0.0f);
            cwh0VarG.c(8.0f, 8.0f, true, true, 0.0f, 16.0f);
            cwh0VarG.b(8.0f, 8.0f, false, true, 8.0f, 0.0f);
            cwh0VarG.m(0.0f, 2.876f);
            cwh0VarG.c(0.42f, 0.42f, false, false, -0.387f, 0.26f);
            cwh0VarG.j(6.462f, 5.992f);
            cwh0VarG.k(-3.046f, 0.195f);
            cwh0VarG.c(0.418f, 0.418f, false, false, -0.374f, 0.532f);
            cwh0VarG.g(0.023f, 0.08f, 0.07f, 0.152f, 0.135f, 0.205f);
            cwh0VarG.k(2.277f, 1.884f);
            cwh0VarG.k(-0.678f, 3.062f);
            cwh0VarG.c(0.42f, 0.42f, false, false, 0.17f, 0.432f);
            cwh0VarG.c(0.42f, 0.42f, false, false, 0.464f, 0.008f);
            cwh0VarG.j(8.0f, 10.638f);
            cwh0VarG.k(2.59f, 1.672f);
            cwh0VarG.c(0.417f, 0.417f, false, false, 0.634f, -0.44f);
            cwh0VarG.k(-0.68f, -3.062f);
            cwh0VarG.k(2.278f, -1.884f);
            cwh0VarG.c(0.417f, 0.417f, false, false, -0.238f, -0.737f);
            cwh0VarG.k(-3.046f, -0.195f);
            cwh0VarG.k(-1.151f, -2.856f);
            cwh0VarG.b(0.42f, 0.42f, false, false, 8.0f, 2.876f);
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            s8p1.b = b180VarB;
        }
        b180 b180VarB2 = t8p1.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.StarBadge24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(12.0f, 1.0f);
            cwh0VarG2.g(6.075f, 0.0f, 11.0f, 4.925f, 11.0f, 11.0f);
            cwh0VarG2.q(-4.925f, 11.0f, -11.0f, 11.0f);
            cwh0VarG2.p(1.0f, 18.075f, 1.0f, 12.0f);
            cwh0VarG2.p(5.925f, 1.0f, 12.0f, 1.0f);
            cwh0VarG2.m(0.0f, 3.52f);
            cwh0VarG2.c(0.61f, 0.61f, false, false, -0.567f, 0.383f);
            cwh0VarG2.k(-1.689f, 4.19f);
            cwh0VarG2.k(-4.467f, 0.284f);
            cwh0VarG2.c(0.612f, 0.612f, false, false, -0.35f, 1.082f);
            cwh0VarG2.k(3.34f, 2.762f);
            cwh0VarG2.k(-0.994f, 4.492f);
            cwh0VarG2.c(0.611f, 0.611f, false, false, 0.928f, 0.645f);
            cwh0VarG2.j(12.0f, 15.906f);
            cwh0VarG2.k(3.8f, 2.454f);
            cwh0VarG2.c(0.612f, 0.612f, false, false, 0.927f, -0.647f);
            cwh0VarG2.k(-0.994f, -4.491f);
            cwh0VarG2.k(3.34f, -2.762f);
            cwh0VarG2.c(0.613f, 0.613f, false, false, -0.015f, -0.955f);
            cwh0VarG2.c(0.6f, 0.6f, false, false, -0.335f, -0.127f);
            cwh0VarG2.k(-4.467f, -0.285f);
            cwh0VarG2.k(-1.69f, -4.189f);
            cwh0VarG2.b(0.61f, 0.61f, false, false, 12.0f, 4.521f);
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            t8p1.b = b180VarB2;
        }
        c = new zsx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new psx((byte) 9);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof zsx);
    }

    public final int hashCode() {
        return -46622020;
    }

    public final String toString() {
        return "StarBadge";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
