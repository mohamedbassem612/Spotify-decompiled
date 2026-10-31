package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class aux extends hux {
    public static final Parcelable.Creator<aux> CREATOR;
    public static final aux c;
    public static final byte d;

    static {
        b180 b180VarB = s110.c;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.VolumeOff16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            long j = u7h.b;
            n6a1 n6a1Var = new n6a1(j);
            cwh0 cwh0VarG = lf51.g(13.86f, 5.47f);
            cwh0VarG.c(0.75f, 0.75f, false, false, -1.061f, 0.0f);
            cwh0VarG.k(-1.47f, 1.47f);
            cwh0VarG.k(-1.47f, -1.47f);
            cwh0VarG.b(0.75f, 0.75f, false, false, 8.8f, 6.53f);
            cwh0VarG.j(10.269f, 8.0f);
            cwh0VarG.k(-1.47f, 1.47f);
            cwh0VarG.c(0.75f, 0.75f, true, false, 1.06f, 1.06f);
            cwh0VarG.k(1.47f, -1.47f);
            cwh0VarG.k(1.47f, 1.47f);
            cwh0VarG.c(0.75f, 0.75f, false, false, 1.06f, -1.06f);
            cwh0VarG.j(12.39f, 8.0f);
            cwh0VarG.k(1.47f, -1.47f);
            cwh0VarG.c(0.75f, 0.75f, false, false, 0.0f, -1.06f);
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            n6a1 n6a1Var2 = new n6a1(j);
            cwh0 cwh0VarG2 = lf51.g(10.116f, 1.5f);
            cwh0VarG2.b(0.75f, 0.75f, false, false, 8.991f, 0.85f);
            cwh0VarG2.k(-6.925f, 4.0f);
            cwh0VarG2.c(3.64f, 3.64f, false, false, -1.33f, 4.967f);
            cwh0VarG2.c(3.64f, 3.64f, false, false, 1.33f, 1.332f);
            cwh0VarG2.k(6.925f, 4.0f);
            cwh0VarG2.c(0.75f, 0.75f, false, false, 1.125f, -0.649f);
            cwh0VarG2.v(-1.906f);
            cwh0VarG2.c(4.7f, 4.7f, false, true, -1.5f, -0.694f);
            cwh0VarG2.v(1.3f);
            cwh0VarG2.j(2.817f, 9.852f);
            cwh0VarG2.c(2.14f, 2.14f, false, true, -0.781f, -2.92f);
            cwh0VarG2.g(0.187f, -0.324f, 0.456f, -0.594f, 0.78f, -0.782f);
            cwh0VarG2.k(5.8f, -3.35f);
            cwh0VarG2.v(1.3f);
            cwh0VarG2.g(0.45f, -0.313f, 0.956f, -0.55f, 1.5f, -0.694f);
            cwh0VarG2.e();
            a180.a(a180Var, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            s110.c = b180VarB;
        }
        b180 b180VarB2 = mp10.e;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.VolumeOff24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var3 = new n6a1(u7h.b);
            cwh0 cwh0VarG3 = lf51.g(17.293f, 15.207f);
            cwh0VarG3.c(1.0f, 1.0f, false, false, 1.414f, 0.0f);
            cwh0VarG3.k(1.793f, -1.793f);
            cwh0VarG3.k(1.793f, 1.793f);
            cwh0VarG3.c(1.0f, 1.0f, false, false, 1.414f, -1.414f);
            cwh0VarG3.j(21.914f, 12.0f);
            cwh0VarG3.k(1.793f, -1.793f);
            cwh0VarG3.c(1.0f, 1.0f, false, false, -1.414f, -1.414f);
            cwh0VarG3.j(20.5f, 10.586f);
            cwh0VarG3.k(-1.793f, -1.793f);
            cwh0VarG3.c(1.0f, 1.0f, true, false, -1.414f, 1.414f);
            cwh0VarG3.j(19.086f, 12.0f);
            cwh0VarG3.k(-1.793f, 1.793f);
            cwh0VarG3.c(1.0f, 1.0f, false, false, 0.0f, 1.414f);
            cwh0VarG3.l(14.5f, 1.134f);
            cwh0VarG3.b(1.0f, 1.0f, false, true, 15.0f, 2.0f);
            cwh0VarG3.v(20.0f);
            cwh0VarG3.c(1.0f, 1.0f, false, true, -1.5f, 0.866f);
            cwh0VarG3.j(2.846f, 16.712f);
            cwh0VarG3.c(5.445f, 5.445f, false, true, 0.0f, -9.424f);
            cwh0VarG3.j(13.5f, 1.135f);
            cwh0VarG3.c(1.0f, 1.0f, false, true, 1.0f, 0.0f);
            cwh0VarG3.e();
            cwh0VarG3.l(3.847f, 9.02f);
            cwh0VarG3.c(3.444f, 3.444f, false, false, 0.0f, 5.96f);
            cwh0VarG3.j(13.0f, 20.268f);
            cwh0VarG3.u(3.732f);
            cwh0VarG3.e();
            a180.a(a180Var2, cwh0VarG3.a, n6a1Var3, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            mp10.e = b180VarB2;
        }
        dsx dsxVar = new dsx(b180VarB, b180VarB2);
        b180 b180VarB3 = e130.c;
        if (b180VarB3 == null) {
            a180 a180Var3 = new a180("Encore.Vector.VolumeOffActive16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i3 = bui1.a;
            n6a1 n6a1Var4 = new n6a1(u7h.b);
            cwh0 cwh0VarG4 = lf51.g(9.741f, 0.85f);
            cwh0VarG4.c(0.75f, 0.75f, false, true, 0.375f, 0.65f);
            cwh0VarG4.v(13.0f);
            cwh0VarG4.c(0.75f, 0.75f, false, true, -1.125f, 0.65f);
            cwh0VarG4.k(-6.925f, -4.0f);
            cwh0VarG4.c(3.64f, 3.64f, false, true, -1.33f, -4.967f);
            cwh0VarG4.c(3.64f, 3.64f, false, true, 1.33f, -1.332f);
            cwh0VarG4.k(6.925f, -4.0f);
            cwh0VarG4.c(0.75f, 0.75f, false, true, 0.75f, 0.0f);
            cwh0VarG4.e();
            cwh0VarG4.l(14.67f, 5.87f);
            cwh0VarG4.c(0.75f, 0.75f, false, true, 1.06f, 1.06f);
            cwh0VarG4.j(14.66f, 8.0f);
            cwh0VarG4.k(1.07f, 1.07f);
            cwh0VarG4.c(0.75f, 0.75f, true, true, -1.06f, 1.06f);
            cwh0VarG4.j(13.6f, 9.06f);
            cwh0VarG4.k(-1.07f, 1.07f);
            cwh0VarG4.c(0.75f, 0.75f, false, true, -1.06f, -1.06f);
            cwh0VarG4.j(12.54f, 8.0f);
            cwh0VarG4.k(-1.07f, -1.07f);
            cwh0VarG4.c(0.75f, 0.75f, true, true, 1.06f, -1.06f);
            cwh0VarG4.k(1.07f, 1.07f);
            cwh0VarG4.e();
            a180.a(a180Var3, cwh0VarG4.a, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB3 = a180Var3.b();
            e130.c = b180VarB3;
        }
        b180 b180VarB4 = up30.b;
        if (b180VarB4 == null) {
            a180 a180Var4 = new a180("Encore.Vector.VolumeOffActive24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i4 = bui1.a;
            n6a1 n6a1Var5 = new n6a1(u7h.b);
            cwh0 cwh0VarG5 = lf51.g(14.5f, 1.134f);
            cwh0VarG5.b(1.0f, 1.0f, false, true, 15.0f, 2.0f);
            cwh0VarG5.v(20.0f);
            cwh0VarG5.c(1.0f, 1.0f, false, true, -1.5f, 0.866f);
            cwh0VarG5.j(2.846f, 16.712f);
            cwh0VarG5.c(5.445f, 5.445f, false, true, 0.0f, -9.424f);
            cwh0VarG5.j(13.5f, 1.135f);
            cwh0VarG5.c(1.0f, 1.0f, false, true, 1.0f, 0.0f);
            cwh0VarG5.e();
            cwh0VarG5.l(18.707f, 8.818f);
            cwh0VarG5.c(1.0f, 1.0f, true, false, -1.414f, 1.414f);
            cwh0VarG5.j(19.06f, 12.0f);
            cwh0VarG5.k(-1.768f, 1.768f);
            cwh0VarG5.c(1.0f, 1.0f, false, false, 1.414f, 1.414f);
            cwh0VarG5.k(1.768f, -1.768f);
            cwh0VarG5.k(1.768f, 1.768f);
            cwh0VarG5.c(1.0f, 1.0f, false, false, 1.414f, -1.414f);
            cwh0VarG5.j(21.889f, 12.0f);
            cwh0VarG5.k(1.768f, -1.768f);
            cwh0VarG5.c(1.0f, 1.0f, false, false, -1.414f, -1.414f);
            cwh0VarG5.k(-1.768f, 1.768f);
            cwh0VarG5.e();
            a180.a(a180Var4, cwh0VarG5.a, n6a1Var5, 1.0f, 2, 1.0f);
            b180VarB4 = a180Var4.b();
            up30.b = b180VarB4;
        }
        c = new aux(dsxVar, new dsx(b180VarB3, b180VarB4));
        d = (byte) 8;
        CREATOR = new utx((byte) 5);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof aux);
    }

    public final int hashCode() {
        return 168512;
    }

    public final String toString() {
        return "VolumeOff";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
