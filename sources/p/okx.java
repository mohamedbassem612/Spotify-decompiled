package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class okx extends hux {
    public static final Parcelable.Creator<okx> CREATOR;
    public static final okx c;

    static {
        b180 b180VarB = j2p1.a;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Attach16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(13.795f, 3.08f);
            cwh0VarG.c(2.175f, 2.175f, false, false, -3.077f, 0.0f);
            cwh0VarG.k(-6.19f, 6.19f);
            cwh0VarG.c(0.717f, 0.717f, true, false, 1.014f, 1.014f);
            cwh0VarG.k(6.226f, -6.227f);
            cwh0VarG.c(0.742f, 0.742f, true, true, 1.05f, 1.05f);
            cwh0VarG.k(-6.226f, 6.226f);
            cwh0VarG.b(2.201f, 2.201f, true, true, 3.479f, 8.22f);
            cwh0VarG.k(6.19f, -6.189f);
            cwh0VarG.c(3.66f, 3.66f, false, true, 5.176f, 5.176f);
            cwh0VarG.k(-6.19f, 6.19f);
            cwh0VarG.c(5.119f, 5.119f, true, true, -7.239f, -7.24f);
            cwh0VarG.k(4.126f, -4.126f);
            cwh0VarG.c(0.742f, 0.742f, false, true, 1.05f, 1.05f);
            cwh0VarG.j(2.466f, 7.207f);
            cwh0VarG.c(3.634f, 3.634f, false, false, 5.14f, 5.14f);
            cwh0VarG.k(6.189f, -6.19f);
            cwh0VarG.g(0.85f, -0.85f, 0.85f, -2.227f, 0.0f, -3.076f);
            cwh0VarG.e();
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            j2p1.a = b180VarB;
        }
        b180 b180VarB2 = l2p1.a;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Attach24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(20.071f, 5.343f);
            cwh0VarG2.c(3.0f, 3.0f, false, false, -4.243f, 0.0f);
            cwh0VarG2.k(-8.485f, 8.485f);
            cwh0VarG2.c(1.0f, 1.0f, false, false, 1.414f, 1.415f);
            cwh0VarG2.k(8.536f, -8.536f);
            cwh0VarG2.c(1.0f, 1.0f, true, true, 1.414f, 1.414f);
            cwh0VarG2.k(-8.535f, 8.536f);
            cwh0VarG2.c(3.0f, 3.0f, false, true, -4.243f, -4.243f);
            cwh0VarG2.k(8.485f, -8.485f);
            cwh0VarG2.b(5.0f, 5.0f, false, true, 21.485f, 11.0f);
            cwh0VarG2.j(13.0f, 19.485f);
            cwh0VarG2.c(7.0f, 7.0f, true, true, -9.9f, -9.9f);
            cwh0VarG2.j(8.757f, 3.93f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 1.415f, 1.414f);
            cwh0VarG2.j(4.515f, 11.0f);
            cwh0VarG2.c(5.0f, 5.0f, false, false, 7.07f, 7.071f);
            cwh0VarG2.k(8.486f, -8.485f);
            cwh0VarG2.c(3.0f, 3.0f, false, false, 0.0f, -4.243f);
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            l2p1.a = b180VarB2;
        }
        c = new okx(new dsx(b180VarB, b180VarB2), null);
        CREATOR = new ckx((byte) 11);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof okx);
    }

    public final int hashCode() {
        return 1049901018;
    }

    public final String toString() {
        return "Attach";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
