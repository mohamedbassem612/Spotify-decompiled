package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gsx extends hux {
    public static final Parcelable.Creator<gsx> CREATOR;
    public static final gsx c;
    public static final byte d;

    static {
        b180 b180VarB = k4p1.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Shuffle16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            long j = u7h.b;
            n6a1 n6a1Var = new n6a1(j);
            cwh0 cwh0VarG = lf51.g(13.151f, 0.922f);
            cwh0VarG.c(0.75f, 0.75f, true, false, -1.06f, 1.06f);
            cwh0VarG.j(13.109f, 3.0f);
            cwh0VarG.h(11.16f);
            cwh0VarG.c(3.75f, 3.75f, false, false, -2.873f, 1.34f);
            cwh0VarG.k(-6.173f, 7.356f);
            cwh0VarG.b(2.25f, 2.25f, false, true, 0.39f, 12.5f);
            cwh0VarG.h(0.0f);
            cwh0VarG.u(14.0f);
            cwh0VarG.i(0.391f);
            cwh0VarG.c(3.75f, 3.75f, false, false, 2.873f, -1.34f);
            cwh0VarG.k(6.173f, -7.356f);
            cwh0VarG.c(2.25f, 2.25f, false, true, 1.724f, -0.804f);
            cwh0VarG.i(1.947f);
            cwh0VarG.k(-1.017f, 1.018f);
            cwh0VarG.c(0.75f, 0.75f, false, false, 1.06f, 1.06f);
            rjx.u(cwh0VarG, 15.98f, 3.75f, 0.391f, 3.5f);
            cwh0VarG.h(0.0f);
            cwh0VarG.u(2.0f);
            cwh0VarG.i(0.391f);
            cwh0VarG.g(1.109f, 0.0f, 2.16f, 0.49f, 2.873f, 1.34f);
            cwh0VarG.j(4.89f, 5.277f);
            cwh0VarG.k(-0.979f, 1.167f);
            cwh0VarG.k(-1.796f, -2.14f);
            cwh0VarG.b(2.25f, 2.25f, false, false, 0.39f, 3.5f);
            cwh0VarG.e();
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            n6a1 n6a1Var2 = new n6a1(j);
            cwh0 cwh0VarQ = rjx.q(7.5f, 10.723f, 0.98f, -1.167f);
            cwh0VarQ.k(0.957f, 1.14f);
            cwh0VarQ.c(2.25f, 2.25f, false, false, 1.724f, 0.804f);
            cwh0VarQ.i(1.947f);
            cwh0VarQ.k(-1.017f, -1.018f);
            cwh0VarQ.c(0.75f, 0.75f, true, true, 1.06f, -1.06f);
            cwh0VarQ.k(2.829f, 2.828f);
            cwh0VarQ.k(-2.829f, 2.828f);
            cwh0VarQ.c(0.75f, 0.75f, true, true, -1.06f, -1.06f);
            cwh0VarQ.j(13.109f, 13.0f);
            cwh0VarQ.h(11.16f);
            cwh0VarQ.c(3.75f, 3.75f, false, true, -2.873f, -1.34f);
            cwh0VarQ.k(-0.787f, -0.938f);
            cwh0VarQ.e();
            a180.a(a180Var, cwh0VarQ.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            k4p1.b = b180VarB;
        }
        b180 b180VarB2 = l4p1.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Shuffle24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            long j2 = u7h.b;
            n6a1 n6a1Var3 = new n6a1(j2);
            cwh0 cwh0VarG2 = lf51.g(18.788f, 3.702f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 1.414f, -1.414f);
            cwh0VarG2.j(23.914f, 6.0f);
            cwh0VarG2.k(-3.712f, 3.712f);
            cwh0VarG2.c(1.0f, 1.0f, true, true, -1.414f, -1.414f);
            cwh0VarG2.j(20.086f, 7.0f);
            cwh0VarG2.i(-1.518f);
            cwh0VarG2.c(5.0f, 5.0f, false, false, -3.826f, 1.78f);
            cwh0VarG2.k(-7.346f, 8.73f);
            cwh0VarG2.c(7.0f, 7.0f, false, true, -5.356f, 2.494f);
            cwh0VarG2.h(1.0f);
            cwh0VarG2.v(-2.0f);
            cwh0VarG2.i(1.04f);
            cwh0VarG2.c(5.0f, 5.0f, false, false, 3.826f, -1.781f);
            cwh0VarG2.k(7.345f, -8.73f);
            cwh0VarG2.b(7.0f, 7.0f, false, true, 18.569f, 5.0f);
            cwh0VarG2.i(1.518f);
            cwh0VarG2.k(-1.298f, -1.298f);
            cwh0VarG2.e();
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var3, 1.0f, 2, 1.0f);
            n6a1 n6a1Var4 = new n6a1(j2);
            cwh0 cwh0VarG3 = lf51.g(18.788f, 14.289f);
            cwh0VarG3.c(1.0f, 1.0f, false, false, 0.0f, 1.414f);
            cwh0VarG3.j(20.086f, 17.0f);
            cwh0VarG3.i(-1.518f);
            cwh0VarG3.c(5.0f, 5.0f, false, true, -3.826f, -1.78f);
            cwh0VarG3.k(-1.403f, -1.668f);
            cwh0VarG3.k(-1.306f, 1.554f);
            cwh0VarG3.k(1.178f, 1.4f);
            cwh0VarG3.b(7.0f, 7.0f, false, false, 18.568f, 19.0f);
            cwh0VarG3.i(1.518f);
            cwh0VarG3.k(-1.298f, 1.298f);
            cwh0VarG3.c(1.0f, 1.0f, true, false, 1.414f, 1.414f);
            cwh0VarG3.j(23.914f, 18.0f);
            cwh0VarG3.k(-3.712f, -3.713f);
            cwh0VarG3.c(1.0f, 1.0f, false, false, -1.414f, 0.0f);
            cwh0VarG3.e();
            cwh0VarG3.l(7.396f, 6.49f);
            cwh0VarG3.k(2.023f, 2.404f);
            cwh0VarG3.k(-1.307f, 1.553f);
            cwh0VarG3.k(-2.246f, -2.67f);
            cwh0VarG3.c(5.0f, 5.0f, false, false, -3.826f, -1.78f);
            cwh0VarG3.h(1.0f);
            cwh0VarG3.v(-2.0f);
            cwh0VarG3.i(1.04f);
            cwh0VarG3.b(7.0f, 7.0f, false, true, 7.396f, 6.49f);
            a180.a(a180Var2, cwh0VarG3.a, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            l4p1.b = b180VarB2;
        }
        c = new gsx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new jrx((byte) 21);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof gsx);
    }

    public final int hashCode() {
        return 934883332;
    }

    public final String toString() {
        return "Shuffle";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
