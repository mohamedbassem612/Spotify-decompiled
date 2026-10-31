package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vlx extends hux {
    public static final Parcelable.Creator<vlx> CREATOR;
    public static final vlx c;

    static {
        b180 b180VarB = sap1.a;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.CollaborativePlaylist16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(2.5f, 5.0f);
            cwh0VarG.c(2.5f, 2.5f, true, false, 0.0f, -5.0f);
            cwh0VarG.c(2.5f, 2.5f, false, false, 0.0f, 5.0f);
            cwh0VarG.m(11.0f, -2.5f);
            cwh0VarG.i(-6.0f);
            cwh0VarG.b(5.0f, 5.0f, false, false, 7.271f, 1.0f);
            cwh0VarG.j(15.0f, 1.0f);
            cwh0VarG.v(11.75f);
            cwh0VarG.b(2.75f, 2.75f, true, true, 12.25f, 10.0f);
            rjx.v(cwh0VarG, 1.25f, 13.5f, 11.5f, -1.25f);
            cwh0VarG.c(1.25f, 1.25f, true, false, 1.25f, 1.25f);
            cwh0VarG.e();
            cwh0VarG.l(5.5f, 6.5f);
            cwh0VarG.g(-0.448f, 0.337f, -0.954f, 0.6f, -1.5f, 0.771f);
            cwh0VarG.j(4.0f, 10.0f);
            cwh0VarG.j(2.75f, 10.0f);
            cwh0VarG.c(2.75f, 2.75f, true, false, 2.75f, 2.75f);
            cwh0VarG.e();
            cwh0VarG.l(4.0f, 11.5f);
            cwh0VarG.v(1.25f);
            cwh0VarG.c(1.25f, 1.25f, true, true, -1.25f, -1.25f);
            cwh0VarG.e();
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            sap1.a = b180VarB;
        }
        b180 b180VarB2 = uap1.a;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.CollaborativePlaylist24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(4.5f, 7.5f);
            cwh0VarG2.c(3.0f, 3.0f, true, false, 0.0f, -6.0f);
            cwh0VarG2.c(3.0f, 3.0f, false, false, 0.0f, 6.0f);
            cwh0VarG2.m(6.0f, -3.0f);
            cwh0VarG2.o(0.0f, 0.252f, -0.02f, 0.5f);
            cwh0VarG2.j(19.0f, 5.0f);
            cwh0VarG2.v(9.667f);
            cwh0VarG2.i(-1.5f);
            cwh0VarG2.c(3.5f, 3.5f, true, false, 3.5f, 3.5f);
            cwh0VarG2.j(21.0f, 3.0f);
            cwh0VarG2.j(10.311f, 3.0f);
            cwh0VarG2.g(0.123f, 0.48f, 0.189f, 0.982f, 0.189f, 1.5f);
            cwh0VarG2.l(19.0f, 16.667f);
            cwh0VarG2.v(1.5f);
            cwh0VarG2.c(1.5f, 1.5f, true, true, -1.5f, -1.5f);
            cwh0VarG2.e();
            cwh0VarG2.l(6.0f, 10.311f);
            cwh0VarG2.c(6.0f, 6.0f, false, false, 2.0f, -0.937f);
            cwh0VarG2.v(8.793f);
            cwh0VarG2.c(3.5f, 3.5f, true, true, -3.5f, -3.5f);
            rjx.u(cwh0VarG2, 6.0f, 14.667f, 6.0f, 16.667f);
            cwh0VarG2.j(4.5f, 16.667f);
            cwh0VarG2.c(1.5f, 1.5f, true, false, 1.5f, 1.5f);
            cwh0VarG2.e();
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            uap1.a = b180VarB2;
        }
        c = new vlx(new dsx(b180VarB, b180VarB2), null);
        CREATOR = new hlx((byte) 13);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof vlx);
    }

    public final int hashCode() {
        return 1721546194;
    }

    public final String toString() {
        return "CollaborativePlaylist";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
