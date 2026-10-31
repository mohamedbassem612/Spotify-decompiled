package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ctx extends hux {
    public static final Parcelable.Creator<ctx> CREATOR;
    public static final ctx c;
    public static final byte d;

    static {
        b180 b180VarB = g9p1.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Stop16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(2.0f, 2.7f);
            cwh0VarG.c(0.7f, 0.7f, false, true, 0.7f, -0.7f);
            cwh0VarG.i(10.6f);
            cwh0VarG.c(0.7f, 0.7f, false, true, 0.7f, 0.7f);
            cwh0VarG.v(10.6f);
            cwh0VarG.c(0.7f, 0.7f, false, true, -0.7f, 0.7f);
            cwh0VarG.h(2.7f);
            cwh0VarG.c(0.7f, 0.7f, false, true, -0.7f, -0.7f);
            cwh0VarG.e();
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            g9p1.b = b180VarB;
        }
        b180 b180VarB2 = i9p1.c;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Stop24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(5.0f, 5.7f);
            cwh0VarG2.c(0.7f, 0.7f, false, true, 0.7f, -0.7f);
            cwh0VarG2.i(12.6f);
            cwh0VarG2.c(0.7f, 0.7f, false, true, 0.7f, 0.7f);
            cwh0VarG2.v(12.6f);
            cwh0VarG2.c(0.7f, 0.7f, false, true, -0.7f, 0.7f);
            cwh0VarG2.h(5.7f);
            cwh0VarG2.c(0.7f, 0.7f, false, true, -0.7f, -0.7f);
            cwh0VarG2.e();
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            i9p1.c = b180VarB2;
        }
        c = new ctx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new psx((byte) 12);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ctx);
    }

    public final int hashCode() {
        return -47533353;
    }

    public final String toString() {
        return "Stop";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
