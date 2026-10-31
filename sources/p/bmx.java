package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bmx extends hux {
    public static final Parcelable.Creator<bmx> CREATOR;
    public static final bmx c;
    public static final byte d;

    static {
        b180 b180VarB = dro.f;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.CoverCreation16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            long j = u7h.b;
            n6a1 n6a1Var = new n6a1(j);
            cwh0 cwh0VarG = lf51.g(0.0f, 1.75f);
            cwh0VarG.f(0.0f, 0.784f, 0.784f, 0.0f, 1.75f, 0.0f);
            cwh0VarG.h(12.5f);
            cwh0VarG.j(11.0f, 1.5f);
            cwh0VarG.h(1.75f);
            cwh0VarG.c(0.25f, 0.25f, false, false, -0.25f, 0.25f);
            cwh0VarG.v(12.5f);
            cwh0VarG.g(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f);
            cwh0VarG.i(12.5f);
            cwh0VarG.c(0.25f, 0.25f, false, false, 0.25f, -0.25f);
            cwh0VarG.v(-4.233f);
            cwh0VarG.k(1.5f, -1.5f);
            cwh0VarG.v(5.733f);
            cwh0VarG.b(1.75f, 1.75f, false, true, 14.25f, 16.0f);
            cwh0VarG.h(1.75f);
            cwh0VarG.b(1.75f, 1.75f, false, true, 0.0f, 14.25f);
            cwh0VarG.e();
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            n6a1 n6a1Var2 = new n6a1(j);
            cwh0 cwh0VarG2 = lf51.g(2.627f, 5.392f);
            cwh0VarG2.g(1.677f, -0.422f, 2.463f, -1.763f, 2.75f, -2.77f);
            cwh0VarG2.g(0.021f, -0.073f, 0.225f, -0.073f, 0.246f, 0.001f);
            cwh0VarG2.g(0.287f, 1.006f, 1.073f, 2.347f, 2.75f, 2.769f);
            cwh0VarG2.g(0.074f, 0.018f, 0.074f, 0.198f, 0.0f, 0.216f);
            cwh0VarG2.g(-1.677f, 0.422f, -2.463f, 1.763f, -2.75f, 2.77f);
            cwh0VarG2.g(-0.021f, 0.073f, -0.225f, 0.073f, -0.246f, 0.0f);
            cwh0VarG2.g(-0.287f, -1.007f, -1.073f, -2.348f, -2.75f, -2.77f);
            cwh0VarG2.g(-0.074f, -0.018f, -0.074f, -0.198f, 0.0f, -0.216f);
            cwh0VarG2.l(15.62f, 3.075f);
            cwh0VarG2.c(1.25f, 1.25f, false, false, -1.768f, 0.0f);
            cwh0VarG2.j(7.161f, 9.766f);
            cwh0VarG2.c(0.1f, 0.1f, false, false, -0.02f, 0.028f);
            cwh0VarG2.k(-1.389f, 2.882f);
            cwh0VarG2.c(0.2f, 0.2f, false, false, 0.267f, 0.267f);
            cwh0VarG2.k(2.882f, -1.39f);
            cwh0VarG2.c(0.1f, 0.1f, false, false, 0.028f, -0.019f);
            cwh0VarG2.k(6.691f, -6.691f);
            cwh0VarG2.c(1.25f, 1.25f, false, false, 0.0f, -1.768f);
            a180.a(a180Var, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            dro.f = b180VarB;
        }
        b180 b180VarB2 = fae1.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.CoverCreation24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            long j2 = u7h.b;
            n6a1 n6a1Var3 = new n6a1(j2);
            cwh0 cwh0VarP = rjx.p(0.0f, 3.0f, 18.0f);
            cwh0VarP.c(3.0f, 3.0f, false, false, 3.0f, 3.0f);
            cwh0VarP.i(18.0f);
            cwh0VarP.c(3.0f, 3.0f, false, false, 3.0f, -3.0f);
            cwh0VarP.u(11.0f);
            cwh0VarP.k(-2.0f, 2.0f);
            cwh0VarP.v(8.0f);
            cwh0VarP.c(1.0f, 1.0f, false, true, -1.0f, 1.0f);
            cwh0VarP.h(3.0f);
            cwh0VarP.c(1.0f, 1.0f, false, true, -1.0f, -1.0f);
            cwh0VarP.u(3.0f);
            cwh0VarP.c(1.0f, 1.0f, false, true, 1.0f, -1.0f);
            cwh0VarP.i(14.556f);
            cwh0VarP.k(1.98f, -2.0f);
            cwh0VarP.h(3.0f);
            cwh0VarP.c(3.0f, 3.0f, false, false, -3.0f, 3.0f);
            a180.a(a180Var2, cwh0VarP.a, n6a1Var3, 1.0f, 2, 1.0f);
            n6a1 n6a1Var4 = new n6a1(j2);
            cwh0 cwh0VarG3 = lf51.g(3.887f, 7.847f);
            cwh0VarG3.g(2.407f, -0.6f, 3.532f, -2.525f, 3.94f, -3.966f);
            cwh0VarG3.g(0.03f, -0.104f, 0.317f, -0.104f, 0.346f, 0.0f);
            cwh0VarG3.g(0.408f, 1.44f, 1.533f, 3.365f, 3.94f, 3.966f);
            cwh0VarG3.g(0.105f, 0.027f, 0.105f, 0.28f, 0.0f, 0.306f);
            cwh0VarG3.g(-2.407f, 0.601f, -3.532f, 2.525f, -3.94f, 3.966f);
            cwh0VarG3.g(-0.03f, 0.104f, -0.317f, 0.104f, -0.346f, 0.0f);
            cwh0VarG3.g(-0.408f, -1.44f, -1.533f, -3.365f, -3.94f, -3.966f);
            cwh0VarG3.g(-0.105f, -0.027f, -0.105f, -0.28f, 0.0f, -0.306f);
            cwh0VarG3.m(19.581f, -4.315f);
            cwh0VarG3.c(1.786f, 1.786f, false, false, -2.526f, 0.0f);
            cwh0VarG3.j(10.404f, 14.07f);
            cwh0VarG3.c(0.1f, 0.1f, false, false, -0.018f, 0.025f);
            cwh0VarG3.k(-2.382f, 4.632f);
            cwh0VarG3.c(0.2f, 0.2f, false, false, 0.27f, 0.27f);
            cwh0VarG3.k(4.631f, -2.383f);
            cwh0VarG3.c(0.1f, 0.1f, false, false, 0.025f, -0.018f);
            cwh0VarG3.j(23.468f, 6.058f);
            cwh0VarG3.c(1.786f, 1.786f, false, false, 0.0f, -2.526f);
            a180.a(a180Var2, cwh0VarG3.a, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            fae1.b = b180VarB2;
        }
        c = new bmx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new hlx((byte) 19);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof bmx);
    }

    public final int hashCode() {
        return 1739666561;
    }

    public final String toString() {
        return "CoverCreation";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
