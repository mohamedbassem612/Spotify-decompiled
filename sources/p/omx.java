package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class omx extends hux {
    public static final Parcelable.Creator<omx> CREATOR;
    public static final omx c;
    public static final byte d;

    static {
        b180 b180VarB = qtg.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.DeviceTv16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(0.0f, 2.75f);
            cwh0VarG.f(0.0f, 1.784f, 0.784f, 1.0f, 1.75f, 1.0f);
            cwh0VarG.i(12.5f);
            cwh0VarG.g(0.966f, 0.0f, 1.75f, 0.784f, 1.75f, 1.75f);
            cwh0VarG.v(7.5f);
            cwh0VarG.b(1.75f, 1.75f, false, true, 14.25f, 12.0f);
            cwh0VarG.j(1.75f, 12.0f);
            cwh0VarG.b(1.75f, 1.75f, false, true, 0.0f, 10.25f);
            cwh0VarG.e();
            cwh0VarG.l(1.75f, 2.5f);
            cwh0VarG.c(0.25f, 0.25f, false, false, -0.25f, 0.25f);
            cwh0VarG.v(7.5f);
            cwh0VarG.g(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f);
            cwh0VarG.i(12.5f);
            cwh0VarG.c(0.25f, 0.25f, false, false, 0.25f, -0.25f);
            cwh0VarG.v(-7.5f);
            cwh0VarG.c(0.25f, 0.25f, false, false, -0.25f, -0.25f);
            cwh0VarG.e();
            cwh0VarG.l(4.25f, 15.25f);
            cwh0VarG.b(0.75f, 0.75f, false, true, 5.0f, 14.5f);
            cwh0VarG.i(6.0f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.0f, 1.5f);
            cwh0VarG.j(5.0f, 16.0f);
            cwh0VarG.c(0.75f, 0.75f, false, true, -0.75f, -0.75f);
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            qtg.b = b180VarB;
        }
        b180 b180VarB2 = dug.a;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.DeviceTv24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(4.0f, 2.0f);
            cwh0VarG2.c(3.0f, 3.0f, false, false, -3.0f, 3.0f);
            cwh0VarG2.v(9.0f);
            cwh0VarG2.c(3.0f, 3.0f, false, false, 3.0f, 3.0f);
            cwh0VarG2.i(16.0f);
            cwh0VarG2.c(3.0f, 3.0f, false, false, 3.0f, -3.0f);
            cwh0VarG2.j(23.0f, 5.0f);
            cwh0VarG2.c(3.0f, 3.0f, false, false, -3.0f, -3.0f);
            cwh0VarG2.e();
            cwh0VarG2.l(3.0f, 5.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 1.0f, -1.0f);
            cwh0VarG2.i(16.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 1.0f, 1.0f);
            cwh0VarG2.v(9.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, -1.0f, 1.0f);
            cwh0VarG2.j(4.0f, 15.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, -1.0f, -1.0f);
            cwh0VarG2.e();
            cwh0VarG2.l(7.0f, 21.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 1.0f, -1.0f);
            cwh0VarG2.i(8.0f);
            cwh0VarG2.c(1.0f, 1.0f, true, true, 0.0f, 2.0f);
            cwh0VarG2.j(8.0f, 22.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, -1.0f, -1.0f);
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            dug.a = b180VarB2;
        }
        c = new omx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new mmx((byte) 1);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof omx);
    }

    public final int hashCode() {
        return 208020429;
    }

    public final String toString() {
        return "DeviceTv";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
