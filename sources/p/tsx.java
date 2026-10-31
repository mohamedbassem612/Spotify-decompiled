package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tsx extends hux {
    public static final Parcelable.Creator<tsx> CREATOR;
    public static final tsx c;

    static {
        b180 b180VarB = r6p1.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.SpeechBubble16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            long j = u7h.b;
            n6a1 n6a1Var = new n6a1(j);
            cwh0 cwh0VarG = lf51.g(4.2f, 7.0f);
            cwh0VarG.c(1.0f, 1.0f, true, false, 0.0f, -2.0f);
            cwh0VarG.c(1.0f, 1.0f, false, false, 0.0f, 2.0f);
            cwh0VarG.l(9.0f, 6.0f);
            cwh0VarG.c(1.0f, 1.0f, true, true, -2.0f, 0.0f);
            cwh0VarG.c(1.0f, 1.0f, false, true, 2.0f, 0.0f);
            cwh0VarG.m(2.8f, 1.0f);
            cwh0VarG.c(1.0f, 1.0f, true, false, 0.0f, -2.0f);
            cwh0VarG.c(1.0f, 1.0f, false, false, 0.0f, 2.0f);
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            n6a1 n6a1Var2 = new n6a1(j);
            cwh0 cwh0VarG2 = lf51.g(1.75f, 0.0f);
            cwh0VarG2.b(1.75f, 1.75f, false, false, 0.0f, 1.75f);
            cwh0VarG2.v(8.5f);
            cwh0VarG2.f(0.0f, 11.216f, 0.784f, 12.0f, 1.75f, 12.0f);
            cwh0VarG2.i(2.664f);
            cwh0VarG2.j(8.0f, 15.585f);
            cwh0VarG2.j(11.585f, 12.0f);
            cwh0VarG2.i(2.665f);
            cwh0VarG2.b(1.75f, 1.75f, false, false, 16.0f, 10.25f);
            cwh0VarG2.v(-8.5f);
            cwh0VarG2.b(1.75f, 1.75f, false, false, 14.25f, 0.0f);
            cwh0VarG2.e();
            cwh0VarG2.l(1.5f, 1.75f);
            cwh0VarG2.c(0.25f, 0.25f, false, true, 0.25f, -0.25f);
            cwh0VarG2.i(12.5f);
            cwh0VarG2.c(0.25f, 0.25f, false, true, 0.25f, 0.25f);
            cwh0VarG2.v(8.5f);
            cwh0VarG2.c(0.25f, 0.25f, false, true, -0.25f, 0.25f);
            cwh0VarG2.i(-3.286f);
            cwh0VarG2.j(8.0f, 13.464f);
            cwh0VarG2.j(5.036f, 10.5f);
            cwh0VarG2.h(1.75f);
            cwh0VarG2.c(0.25f, 0.25f, false, true, -0.25f, -0.25f);
            cwh0VarG2.e();
            a180.a(a180Var, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            r6p1.b = b180VarB;
        }
        b180 b180VarB2 = t6p1.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.SpeechBubble24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            long j2 = u7h.b;
            n6a1 n6a1Var3 = new n6a1(j2);
            cwh0 cwh0VarG3 = lf51.g(7.25f, 12.0f);
            cwh0VarG3.c(1.25f, 1.25f, true, false, 0.0f, -2.5f);
            cwh0VarG3.c(1.25f, 1.25f, false, false, 0.0f, 2.5f);
            cwh0VarG3.m(6.0f, -1.25f);
            cwh0VarG3.c(1.25f, 1.25f, true, true, -2.5f, 0.0f);
            cwh0VarG3.c(1.25f, 1.25f, false, true, 2.5f, 0.0f);
            cwh0VarG3.m(3.5f, 1.25f);
            cwh0VarG3.c(1.25f, 1.25f, true, false, 0.0f, -2.5f);
            cwh0VarG3.c(1.25f, 1.25f, false, false, 0.0f, 2.5f);
            a180.a(a180Var2, cwh0VarG3.a, n6a1Var3, 1.0f, 2, 1.0f);
            n6a1 n6a1Var4 = new n6a1(j2);
            cwh0 cwh0VarG4 = lf51.g(5.0f, 2.0f);
            cwh0VarG4.c(4.0f, 4.0f, false, false, -4.0f, 4.0f);
            cwh0VarG4.v(9.0f);
            cwh0VarG4.c(4.0f, 4.0f, false, false, 4.0f, 4.0f);
            cwh0VarG4.i(2.586f);
            cwh0VarG4.k(3.707f, 3.707f);
            cwh0VarG4.c(1.0f, 1.0f, false, false, 1.414f, 0.0f);
            cwh0VarG4.j(16.414f, 19.0f);
            cwh0VarG4.h(19.0f);
            cwh0VarG4.c(4.0f, 4.0f, false, false, 4.0f, -4.0f);
            cwh0VarG4.u(6.0f);
            cwh0VarG4.c(4.0f, 4.0f, false, false, -4.0f, -4.0f);
            cwh0VarG4.e();
            cwh0VarG4.l(3.0f, 6.0f);
            cwh0VarG4.c(2.0f, 2.0f, false, true, 2.0f, -2.0f);
            cwh0VarG4.i(14.0f);
            cwh0VarG4.c(2.0f, 2.0f, false, true, 2.0f, 2.0f);
            cwh0VarG4.v(9.0f);
            cwh0VarG4.c(2.0f, 2.0f, false, true, -2.0f, 2.0f);
            cwh0VarG4.i(-3.0f);
            cwh0VarG4.c(1.0f, 1.0f, false, false, -0.707f, 0.293f);
            cwh0VarG4.j(12.0f, 20.586f);
            cwh0VarG4.k(-3.293f, -3.293f);
            cwh0VarG4.b(1.0f, 1.0f, false, false, 8.0f, 17.0f);
            cwh0VarG4.h(5.0f);
            cwh0VarG4.c(2.0f, 2.0f, false, true, -2.0f, -2.0f);
            cwh0VarG4.e();
            a180.a(a180Var2, cwh0VarG4.a, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            t6p1.b = b180VarB2;
        }
        c = new tsx(new dsx(b180VarB, b180VarB2), null);
        CREATOR = new psx((byte) 3);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof tsx);
    }

    public final int hashCode() {
        return 826998243;
    }

    public final String toString() {
        return "SpeechBubble";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
