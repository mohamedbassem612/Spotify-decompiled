package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xmx extends hux {
    public static final Parcelable.Creator<xmx> CREATOR;
    public static final xmx c;
    public static final byte d;

    static {
        b180 b180VarB = yto.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Edit16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(11.838f, 0.714f);
            cwh0VarG.c(2.438f, 2.438f, false, true, 3.448f, 3.448f);
            cwh0VarG.k(-9.841f, 9.841f);
            cwh0VarG.g(-0.358f, 0.358f, -0.79f, 0.633f, -1.267f, 0.806f);
            cwh0VarG.k(-3.173f, 1.146f);
            cwh0VarG.c(0.75f, 0.75f, false, true, -0.96f, -0.96f);
            cwh0VarG.k(1.146f, -3.173f);
            cwh0VarG.g(0.173f, -0.476f, 0.448f, -0.909f, 0.806f, -1.267f);
            rjx.y(cwh0VarG, 9.84f, -9.84f, 14.225f, 1.774f);
            cwh0VarG.c(0.94f, 0.94f, false, false, -1.327f, 0.0f);
            cwh0VarG.k(-9.84f, 9.842f);
            cwh0VarG.c(1.95f, 1.95f, false, false, -0.456f, 0.716f);
            cwh0VarG.j(2.0f, 14.002f);
            cwh0VarG.k(1.669f, -0.604f);
            cwh0VarG.c(1.95f, 1.95f, false, false, 0.716f, -0.455f);
            cwh0VarG.k(9.841f, -9.841f);
            cwh0VarG.c(0.94f, 0.94f, false, false, 0.0f, -1.327f);
            cwh0VarG.e();
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            yto.b = b180VarB;
        }
        b180 b180VarB2 = rwq.c;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Edit24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(17.318f, 1.975f);
            cwh0VarG2.c(3.329f, 3.329f, true, true, 4.707f, 4.707f);
            cwh0VarG2.j(8.451f, 20.256f);
            cwh0VarG2.g(-0.49f, 0.49f, -1.082f, 0.867f, -1.735f, 1.103f);
            cwh0VarG2.j(2.34f, 22.94f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, -1.28f, -1.28f);
            cwh0VarG2.k(1.581f, -4.376f);
            cwh0VarG2.c(4.7f, 4.7f, false, true, 1.103f, -1.735f);
            cwh0VarG2.e();
            cwh0VarG2.l(20.611f, 3.389f);
            cwh0VarG2.c(1.33f, 1.33f, false, false, -1.88f, 0.0f);
            cwh0VarG2.j(5.159f, 16.963f);
            cwh0VarG2.g(-0.283f, 0.283f, -0.5f, 0.624f, -0.636f, 1.0f);
            cwh0VarG2.k(-0.857f, 2.372f);
            cwh0VarG2.k(2.371f, -0.857f);
            cwh0VarG2.c(2.7f, 2.7f, false, false, 1.001f, -0.636f);
            cwh0VarG2.j(20.611f, 5.268f);
            cwh0VarG2.c(1.33f, 1.33f, false, false, 0.0f, -1.879f);
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            rwq.c = b180VarB2;
        }
        c = new xmx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new mmx((byte) 9);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof xmx);
    }

    public final int hashCode() {
        return -47965985;
    }

    public final String toString() {
        return "Edit";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
