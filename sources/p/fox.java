package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fox extends hux {
    public static final Parcelable.Creator<fox> CREATOR;
    public static final fox c;
    public static final byte d;

    static {
        b180 b180VarB = oqn1.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Lab16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0Var = new cwh0();
            cwh0Var.l(4.96f, 0.004f);
            cwh0Var.i(6.08f);
            cwh0Var.j(11.04f, 6.46f);
            cwh0Var.k(3.734f, 6.468f);
            cwh0Var.g(0.789f, 1.367f, -0.198f, 3.075f, -1.776f, 3.075f);
            cwh0Var.j(3.002f, 16.003f);
            cwh0Var.g(-1.578f, 0.0f, -2.565f, -1.708f, -1.776f, -3.075f);
            rjx.u(cwh0Var, 4.96f, 6.46f, 6.46f, 1.504f);
            cwh0Var.v(5.359f);
            cwh0Var.k(-3.935f, 6.816f);
            cwh0Var.c(0.55f, 0.55f, false, false, 0.477f, 0.825f);
            cwh0Var.i(9.996f);
            cwh0Var.c(0.55f, 0.55f, false, false, 0.477f, -0.825f);
            cwh0Var.j(9.539f, 6.863f);
            cwh0Var.v(-5.36f);
            cwh0Var.e();
            a180.a(a180Var, cwh0Var.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            oqn1.b = b180VarB;
        }
        b180 b180VarB2 = qqn1.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Lab24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0Var2 = new cwh0();
            cwh0Var2.l(8.0f, 1.0f);
            cwh0Var2.i(8.0f);
            cwh0Var2.v(8.474f);
            cwh0Var2.k(5.24f, 9.076f);
            cwh0Var2.g(0.886f, 1.533f, -0.221f, 3.45f, -1.992f, 3.45f);
            cwh0Var2.j(4.752f, 22.0f);
            cwh0Var2.g(-1.77f, 0.0f, -2.877f, -1.917f, -1.992f, -3.45f);
            rjx.u(cwh0Var2, 8.0f, 9.474f, 10.0f, 3.0f);
            cwh0Var2.v(7.01f);
            cwh0Var2.k(-5.508f, 9.54f);
            cwh0Var2.c(0.3f, 0.3f, false, false, 0.26f, 0.45f);
            cwh0Var2.i(14.496f);
            cwh0Var2.c(0.3f, 0.3f, false, false, 0.26f, -0.45f);
            ydh.k(cwh0Var2, 14.0f, 10.01f, 14.0f, 3.0f);
            a180.a(a180Var2, cwh0Var2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            qqn1.b = b180VarB2;
        }
        c = new fox(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new hbn1((byte) 17);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof fox);
    }

    public final int hashCode() {
        return -1525561320;
    }

    public final String toString() {
        return "Lab";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
