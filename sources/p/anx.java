package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class anx extends hux {
    public static final Parcelable.Creator<anx> CREATOR;
    public static final anx c;
    public static final byte d;

    static {
        b180 b180VarB = s110.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.EnhanceBadge16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(1.0f, 0.0f);
            cwh0VarG.c(1.0f, 1.0f, false, false, -1.0f, 1.0f);
            cwh0VarG.v(14.0f);
            cwh0VarG.c(1.0f, 1.0f, false, false, 1.0f, 1.0f);
            cwh0VarG.i(14.0f);
            cwh0VarG.c(1.0f, 1.0f, false, false, 1.0f, -1.0f);
            cwh0VarG.j(16.0f, 1.0f);
            cwh0VarG.c(1.0f, 1.0f, false, false, -1.0f, -1.0f);
            cwh0VarG.e();
            cwh0VarG.l(8.975f, 4.287f);
            cwh0VarG.g(1.268f, -0.448f, 1.959f, -1.448f, 2.288f, -2.318f);
            cwh0VarG.g(0.042f, -0.113f, 0.432f, -0.113f, 0.474f, 0.0f);
            cwh0VarG.g(0.33f, 0.87f, 1.02f, 1.87f, 2.288f, 2.318f);
            cwh0VarG.g(0.113f, 0.04f, 0.113f, 0.386f, 0.0f, 0.426f);
            cwh0VarG.g(-1.268f, 0.448f, -1.959f, 1.448f, -2.288f, 2.319f);
            cwh0VarG.g(-0.042f, 0.112f, -0.432f, 0.112f, -0.474f, 0.0f);
            cwh0VarG.g(-0.33f, -0.87f, -1.02f, -1.871f, -2.288f, -2.319f);
            cwh0VarG.g(-0.113f, -0.04f, -0.113f, -0.386f, 0.0f, -0.426f);
            cwh0VarG.l(1.893f, 9.33f);
            cwh0VarG.g(2.347f, -0.647f, 3.474f, -2.68f, 3.904f, -4.25f);
            cwh0VarG.g(0.033f, -0.118f, 0.373f, -0.118f, 0.406f, 0.0f);
            cwh0VarG.g(0.43f, 1.57f, 1.557f, 3.603f, 3.904f, 4.25f);
            cwh0VarG.g(0.115f, 0.032f, 0.115f, 0.308f, 0.0f, 0.34f);
            cwh0VarG.g(-2.347f, 0.648f, -3.474f, 2.68f, -3.904f, 4.25f);
            cwh0VarG.g(-0.033f, 0.118f, -0.373f, 0.118f, -0.406f, 0.0f);
            cwh0VarG.g(-0.43f, -1.57f, -1.557f, -3.602f, -3.904f, -4.25f);
            cwh0VarG.g(-0.115f, -0.032f, -0.115f, -0.308f, 0.0f, -0.34f);
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            s110.b = b180VarB;
        }
        b180 b180VarB2 = mp10.d;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.EnhanceBadge24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(3.0f, 1.0f);
            cwh0VarG2.c(2.0f, 2.0f, false, false, -2.0f, 2.0f);
            cwh0VarG2.v(18.0f);
            cwh0VarG2.c(2.0f, 2.0f, false, false, 2.0f, 2.0f);
            cwh0VarG2.i(18.0f);
            cwh0VarG2.c(2.0f, 2.0f, false, false, 2.0f, -2.0f);
            cwh0VarG2.j(23.0f, 3.0f);
            cwh0VarG2.c(2.0f, 2.0f, false, false, -2.0f, -2.0f);
            cwh0VarG2.e();
            cwh0VarG2.l(14.975f, 6.302f);
            cwh0VarG2.g(1.268f, -0.447f, 1.959f, -1.448f, 2.288f, -2.318f);
            cwh0VarG2.g(0.042f, -0.113f, 0.432f, -0.113f, 0.474f, 0.0f);
            cwh0VarG2.g(0.33f, 0.87f, 1.02f, 1.871f, 2.288f, 2.318f);
            cwh0VarG2.g(0.113f, 0.04f, 0.113f, 0.387f, 0.0f, 0.427f);
            cwh0VarG2.g(-1.268f, 0.447f, -1.959f, 1.448f, -2.288f, 2.318f);
            cwh0VarG2.g(-0.042f, 0.113f, -0.432f, 0.113f, -0.474f, 0.0f);
            cwh0VarG2.g(-0.33f, -0.87f, -1.02f, -1.87f, -2.288f, -2.318f);
            cwh0VarG2.g(-0.113f, -0.04f, -0.113f, -0.386f, 0.0f, -0.427f);
            cwh0VarG2.l(19.5f, 18.0f);
            cwh0VarG2.c(1.5f, 1.5f, true, true, -3.0f, 0.0f);
            cwh0VarG2.c(1.5f, 1.5f, false, true, 3.0f, 0.0f);
            cwh0VarG2.l(2.99f, 12.352f);
            cwh0VarG2.f(7.389f, 11.47f, 9.27f, 7.9f, 9.833f, 5.485f);
            cwh0VarG2.g(0.027f, -0.118f, 0.307f, -0.118f, 0.334f, 0.0f);
            cwh0VarG2.g(0.563f, 2.414f, 2.444f, 5.984f, 6.843f, 6.867f);
            cwh0VarG2.g(0.119f, 0.024f, 0.119f, 0.272f, 0.0f, 0.296f);
            cwh0VarG2.g(-4.4f, 0.883f, -6.28f, 4.454f, -6.843f, 6.867f);
            cwh0VarG2.g(-0.027f, 0.118f, -0.307f, 0.118f, -0.334f, 0.0f);
            cwh0VarG2.g(-0.563f, -2.413f, -2.444f, -5.984f, -6.843f, -6.867f);
            cwh0VarG2.g(-0.119f, -0.024f, -0.119f, -0.272f, 0.0f, -0.296f);
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            mp10.d = b180VarB2;
        }
        c = new anx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new mmx((byte) 12);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof anx);
    }

    public final int hashCode() {
        return -827495574;
    }

    public final String toString() {
        return "EnhanceBadge";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
