package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class usx extends hux {
    public static final Parcelable.Creator<usx> CREATOR;
    public static final usx c;

    static {
        b180 b180VarB = w6p1.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Speedometer16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(14.5f, 9.042f);
            cwh0VarG.f(14.5f, 5.425f, 11.586f, 2.5f, 8.0f, 2.5f);
            cwh0VarG.p(1.5f, 5.425f, 1.5f, 9.042f);
            cwh0VarG.c(6.54f, 6.54f, false, false, 1.952f, 4.674f);
            cwh0VarG.c(0.75f, 0.75f, true, true, -1.053f, 1.068f);
            cwh0VarG.b(8.04f, 8.04f, false, true, 0.0f, 9.042f);
            cwh0VarG.f(0.0f, 4.605f, 3.578f, 1.0f, 8.0f, 1.0f);
            cwh0VarG.q(8.0f, 3.605f, 8.0f, 8.042f);
            cwh0VarG.c(8.04f, 8.04f, false, true, -2.4f, 5.742f);
            cwh0VarG.c(0.75f, 0.75f, false, true, -1.052f, -1.068f);
            cwh0VarG.b(6.54f, 6.54f, false, false, 14.5f, 9.042f);
            cwh0VarG.l(8.75f, 9.0f);
            cwh0VarG.c(0.75f, 0.75f, true, false, -1.5f, 0.0f);
            cwh0VarG.c(0.75f, 0.75f, false, false, 1.5f, 0.0f);
            cwh0VarG.m(1.5f, 0.0f);
            cwh0VarG.c(2.25f, 2.25f, true, true, -1.282f, -2.03f);
            cwh0VarG.k(1.502f, -1.5f);
            cwh0VarG.c(0.75f, 0.75f, true, true, 1.06f, 1.06f);
            cwh0VarG.k(-1.502f, 1.501f);
            cwh0VarG.g(0.14f, 0.294f, 0.222f, 0.622f, 0.222f, 0.969f);
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            w6p1.b = b180VarB;
        }
        b180 b180VarB2 = z6p1.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Speedometer24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            long j = u7h.b;
            n6a1 n6a1Var2 = new n6a1(j);
            cwh0 cwh0VarG2 = lf51.g(12.0f, 3.0f);
            cwh0VarG2.g(6.066f, 0.0f, 11.0f, 4.871f, 11.0f, 10.9f);
            cwh0VarG2.g(0.0f, 2.794f, -1.062f, 5.344f, -2.805f, 7.27f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, -1.483f, -1.34f);
            cwh0VarG2.b(8.8f, 8.8f, false, false, 21.0f, 13.9f);
            cwh0VarG2.f(21.0f, 8.995f, 16.98f, 5.0f, 12.0f, 5.0f);
            cwh0VarG2.q(-9.0f, 3.995f, -9.0f, 8.9f);
            cwh0VarG2.g(0.0f, 2.277f, 0.864f, 4.353f, 2.288f, 5.93f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, -1.483f, 1.34f);
            cwh0VarG2.b(10.8f, 10.8f, false, true, 1.0f, 13.9f);
            cwh0VarG2.f(1.0f, 7.871f, 5.934f, 3.0f, 12.0f, 3.0f);
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            n6a1 n6a1Var3 = new n6a1(j);
            cwh0 cwh0VarG3 = lf51.g(15.793f, 8.793f);
            cwh0VarG3.c(1.0f, 1.0f, true, true, 1.414f, 1.414f);
            cwh0VarG3.k(-2.503f, 2.502f);
            cwh0VarG3.g(0.187f, 0.392f, 0.296f, 0.828f, 0.296f, 1.291f);
            cwh0VarG3.c(3.0f, 3.0f, true, true, -3.0f, -3.0f);
            cwh0VarG3.g(0.463f, 0.0f, 0.899f, 0.108f, 1.29f, 0.295f);
            cwh0VarG3.e();
            cwh0VarG3.l(12.0f, 13.0f);
            cwh0VarG3.c(1.0f, 1.0f, true, false, 0.0f, 2.0f);
            cwh0VarG3.c(1.0f, 1.0f, false, false, 0.0f, -2.0f);
            a180.a(a180Var2, cwh0VarG3.a, n6a1Var3, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            z6p1.b = b180VarB2;
        }
        c = new usx(new dsx(b180VarB, b180VarB2), null);
        CREATOR = new psx((byte) 4);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof usx);
    }

    public final int hashCode() {
        return -370183412;
    }

    public final String toString() {
        return "Speedometer";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
