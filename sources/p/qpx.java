package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qpx extends hux {
    public static final Parcelable.Creator<qpx> CREATOR;
    public static final qpx c;
    public static final byte d;

    static {
        b180 b180VarB = smo1.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.PaperPlane16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(15.317f, 7.262f);
            cwh0VarG.g(0.684f, 0.254f, 0.684f, 1.232f, 0.0f, 1.486f);
            cwh0VarG.k(-12.579f, 5.64f);
            cwh0VarG.g(-0.85f, 0.397f, -1.5f, -0.321f, -1.134f, -1.23f);
            cwh0VarG.k(1.841f, -4.357f);
            cwh0VarG.c(0.28f, 0.28f, false, true, 0.219f, -0.149f);
            cwh0VarG.k(6.191f, -0.647f);
            cwh0VarG.k(-6.19f, -0.646f);
            cwh0VarG.c(0.28f, 0.28f, false, true, -0.218f, -0.152f);
            cwh0VarG.k(-1.843f, -4.45f);
            cwh0VarG.g(-0.365f, -0.908f, 0.285f, -1.532f, 1.134f, -1.135f);
            cwh0VarG.e();
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            smo1.b = b180VarB;
        }
        b180 b180VarB2 = wmo1.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.PaperPlane24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(22.248f, 10.921f);
            cwh0VarG2.g(1.003f, 0.371f, 1.003f, 1.801f, 0.0f, 2.173f);
            cwh0VarG2.j(3.815f, 21.337f);
            cwh0VarG2.g(-1.245f, 0.579f, -2.198f, -0.47f, -1.662f, -1.798f);
            cwh0VarG2.k(2.698f, -6.369f);
            cwh0VarG2.c(0.41f, 0.41f, false, true, 0.32f, -0.217f);
            cwh0VarG2.k(9.073f, -0.946f);
            cwh0VarG2.k(-9.07f, -0.944f);
            cwh0VarG2.c(0.4f, 0.4f, false, true, -0.321f, -0.222f);
            cwh0VarG2.k(-2.7f, -6.503f);
            cwh0VarG2.g(-0.536f, -1.327f, 0.417f, -2.24f, 1.662f, -1.66f);
            cwh0VarG2.e();
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            wmo1.b = b180VarB2;
        }
        c = new qpx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new yox((byte) 17);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof qpx);
    }

    public final int hashCode() {
        return -2090375355;
    }

    public final String toString() {
        return "PaperPlane";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
