package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mtx extends hux {
    public static final Parcelable.Creator<mtx> CREATOR;
    public static final mtx c;
    public static final byte d;

    static {
        b180 b180VarB = j82.c;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Translation16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(5.215f, 0.0f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.75f, 0.75f);
            cwh0VarG.v(1.111f);
            cwh0VarG.h(9.57f);
            cwh0VarG.c(0.75f, 0.75f, true, true, 0.0f, 1.5f);
            cwh0VarG.h(8.167f);
            cwh0VarG.b(7.8f, 7.8f, false, true, 6.3f, 8.203f);
            cwh0VarG.c(5.87f, 5.87f, false, false, 3.09f, 1.223f);
            cwh0VarG.k(1.325f, -3.034f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 1.374f, 0.0f);
            cwh0VarG.k(3.739f, 8.558f);
            cwh0VarG.c(0.75f, 0.75f, true, true, -1.375f, 0.6f);
            cwh0VarG.k(-1.023f, -2.34f);
            cwh0VarG.h(9.373f);
            cwh0VarG.j(8.35f, 15.55f);
            cwh0VarG.c(0.75f, 0.75f, true, true, -1.374f, -0.6f);
            cwh0VarG.k(1.786f, -4.09f);
            cwh0VarG.c(7.4f, 7.4f, false, true, -3.55f, -1.607f);
            cwh0VarG.c(7.8f, 7.8f, false, true, -4.257f, 1.674f);
            cwh0VarG.c(0.75f, 0.75f, true, true, -0.116f, -1.495f);
            cwh0VarG.c(6.3f, 6.3f, false, false, 3.313f, -1.255f);
            cwh0VarG.c(7.4f, 7.4f, false, true, -1.405f, -2.823f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 1.455f, -0.365f);
            cwh0VarG.c(5.9f, 5.9f, false, false, 1.037f, 2.144f);
            cwh0VarG.c(6.3f, 6.3f, false, false, 1.428f, -3.772f);
            cwh0VarG.h(0.86f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.0f, -1.5f);
            cwh0VarG.i(3.605f);
            cwh0VarG.u(0.75f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.75f, -0.75f);
            cwh0VarG.m(4.813f, 11.71f);
            cwh0VarG.i(2.746f);
            rjx.C(cwh0VarG, -1.373f, -3.144f, -1.373f, 3.143f);
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            j82.c = b180VarB;
        }
        b180 b180VarB2 = rc2.c;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Translation24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(8.16f, 1.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 1.0f, 1.0f);
            cwh0VarG2.v(1.567f);
            cwh0VarG2.i(5.006f);
            cwh0VarG2.c(1.0f, 1.0f, true, true, 0.0f, 2.0f);
            cwh0VarG2.i(-1.969f);
            cwh0VarG2.c(10.72f, 10.72f, false, true, -2.593f, 6.718f);
            cwh0VarG2.c(8.14f, 8.14f, false, false, 4.333f, 1.72f);
            cwh0VarG2.k(1.838f, -4.21f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 1.833f, 0.0f);
            cwh0VarG2.j(22.764f, 21.6f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, -1.833f, 0.8f);
            cwh0VarG2.k(-1.42f, -3.249f);
            cwh0VarG2.i(-5.64f);
            cwh0VarG2.k(-1.42f, 3.25f);
            cwh0VarG2.c(1.0f, 1.0f, true, true, -1.832f, -0.801f);
            cwh0VarG2.k(2.482f, -5.683f);
            cwh0VarG2.c(10.14f, 10.14f, false, true, -4.946f, -2.233f);
            cwh0VarG2.c(10.7f, 10.7f, false, true, -5.875f, 2.32f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, -0.154f, -1.995f);
            cwh0VarG2.c(8.7f, 8.7f, false, false, 4.615f, -1.758f);
            cwh0VarG2.c(10.15f, 10.15f, false, true, -1.953f, -3.91f);
            cwh0VarG2.c(1.0f, 1.0f, true, true, 1.94f, -0.486f);
            cwh0VarG2.b(8.15f, 8.15f, false, false, 8.19f, 10.86f);
            cwh0VarG2.c(8.72f, 8.72f, false, false, 2.006f, -5.293f);
            cwh0VarG2.h(2.152f);
            cwh0VarG2.c(1.0f, 1.0f, true, true, 0.0f, -2.0f);
            cwh0VarG2.h(7.16f);
            cwh0VarG2.u(2.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 1.0f, -1.0f);
            cwh0VarG2.m(6.585f, 16.151f);
            cwh0VarG2.i(3.893f);
            cwh0VarG2.k(-1.947f, -4.457f);
            cwh0VarG2.e();
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            rc2.c = b180VarB2;
        }
        dsx dsxVar = new dsx(b180VarB, b180VarB2);
        b180 b180VarB3 = jm5.c;
        if (b180VarB3 == null) {
            a180 a180Var3 = new a180("Encore.Vector.TranslationActive16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i3 = bui1.a;
            long j = u7h.b;
            n6a1 n6a1Var3 = new n6a1(j);
            ArrayList arrayList = new ArrayList(32);
            arrayList.add(new f9s0(11.605f, 10.674f));
            arrayList.add(new d9s0(9.854f));
            arrayList.add(new m9s0(0.876f, -2.004f));
            arrayList.add(b9s0.c);
            a180.a(a180Var3, arrayList, n6a1Var3, 1.0f, 2, 1.0f);
            n6a1 n6a1Var4 = new n6a1(j);
            cwh0 cwh0VarG3 = lf51.g(1.0f, 0.0f);
            cwh0VarG3.c(1.0f, 1.0f, false, false, -1.0f, 1.0f);
            cwh0VarG3.v(14.0f);
            cwh0VarG3.c(1.0f, 1.0f, false, false, 1.0f, 1.0f);
            cwh0VarG3.i(14.0f);
            cwh0VarG3.c(1.0f, 1.0f, false, false, 1.0f, -1.0f);
            cwh0VarG3.j(16.0f, 1.0f);
            cwh0VarG3.c(1.0f, 1.0f, false, false, -1.0f, -1.0f);
            cwh0VarG3.e();
            cwh0VarG3.l(6.515f, 2.027f);
            cwh0VarG3.v(0.744f);
            cwh0VarG3.j(9.26f, 2.771f);
            cwh0VarG3.c(0.75f, 0.75f, true, true, 0.0f, 1.5f);
            cwh0VarG3.i(-0.983f);
            cwh0VarG3.c(6.4f, 6.4f, false, true, -1.429f, 3.713f);
            cwh0VarG3.c(4.56f, 4.56f, false, false, 2.174f, 0.848f);
            cwh0VarG3.k(1.02f, -2.336f);
            cwh0VarG3.c(0.75f, 0.75f, false, true, 1.375f, 0.0f);
            cwh0VarG3.k(3.0f, 6.867f);
            cwh0VarG3.c(0.75f, 0.75f, false, true, -1.375f, 0.6f);
            cwh0VarG3.k(-0.782f, -1.789f);
            cwh0VarG3.j(9.2f, 12.174f);
            cwh0VarG3.k(-0.782f, 1.79f);
            cwh0VarG3.c(0.75f, 0.75f, true, true, -1.375f, -0.6f);
            cwh0VarG3.k(1.359f, -3.11f);
            cwh0VarG3.b(6.1f, 6.1f, false, true, 5.76f, 9.04f);
            cwh0VarG3.c(6.4f, 6.4f, false, true, -3.403f, 1.302f);
            cwh0VarG3.c(0.75f, 0.75f, false, true, -0.116f, -1.495f);
            cwh0VarG3.b(4.9f, 4.9f, false, false, 4.7f, 7.958f);
            cwh0VarG3.c(6.1f, 6.1f, false, true, -1.06f, -2.2f);
            cwh0VarG3.c(0.75f, 0.75f, true, true, 1.455f, -0.365f);
            cwh0VarG3.g(0.138f, 0.55f, 0.375f, 1.06f, 0.693f, 1.512f);
            cwh0VarG3.c(4.9f, 4.9f, false, false, 0.985f, -2.634f);
            cwh0VarG3.j(2.271f, 4.271f);
            cwh0VarG3.c(0.75f, 0.75f, false, true, 0.0f, -1.5f);
            cwh0VarG3.i(2.744f);
            cwh0VarG3.v(-0.744f);
            cwh0VarG3.c(0.75f, 0.75f, false, true, 1.5f, 0.0f);
            a180.a(a180Var3, cwh0VarG3.a, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB3 = a180Var3.b();
            jm5.c = b180VarB3;
        }
        b180 b180VarB4 = lm5.c;
        if (b180VarB4 == null) {
            a180 a180Var4 = new a180("Encore.Vector.TranslationActive24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i4 = bui1.a;
            long j2 = u7h.b;
            n6a1 n6a1Var5 = new n6a1(j2);
            ArrayList arrayList2 = new ArrayList(32);
            arrayList2.add(new n9s0(15.753f, 12.842f));
            arrayList2.add(new m9s0(1.252f, 2.866f));
            arrayList2.add(new l9s0(-2.504f));
            arrayList2.add(b9s0.c);
            a180.a(a180Var4, arrayList2, n6a1Var5, 1.0f, 2, 1.0f);
            n6a1 n6a1Var6 = new n6a1(j2);
            cwh0 cwh0VarG4 = lf51.g(3.0f, 1.0f);
            cwh0VarG4.c(2.0f, 2.0f, false, false, -2.0f, 2.0f);
            cwh0VarG4.v(18.0f);
            cwh0VarG4.c(2.0f, 2.0f, false, false, 2.0f, 2.0f);
            cwh0VarG4.i(18.0f);
            cwh0VarG4.c(2.0f, 2.0f, false, false, 2.0f, -2.0f);
            cwh0VarG4.j(23.0f, 3.0f);
            cwh0VarG4.c(2.0f, 2.0f, false, false, -2.0f, -2.0f);
            hrt.u(cwh0VarG4, 9.928f, 3.787f, 1.054f, 3.805f);
            cwh0VarG4.c(1.0f, 1.0f, true, true, 0.0f, 2.0f);
            cwh0VarG4.j(12.35f, 6.841f);
            cwh0VarG4.c(8.77f, 8.77f, false, true, -1.98f, 5.142f);
            cwh0VarG4.c(6.3f, 6.3f, false, false, 3.053f, 1.194f);
            cwh0VarG4.k(1.413f, -3.233f);
            cwh0VarG4.c(1.0f, 1.0f, false, true, 1.833f, 0.0f);
            cwh0VarG4.k(4.124f, 9.443f);
            cwh0VarG4.c(1.0f, 1.0f, true, true, -1.832f, 0.8f);
            cwh0VarG4.k(-1.083f, -2.479f);
            cwh0VarG4.i(-4.251f);
            cwh0VarG4.k(-1.083f, 2.48f);
            cwh0VarG4.c(1.0f, 1.0f, true, true, -1.833f, -0.8f);
            cwh0VarG4.k(1.883f, -4.313f);
            cwh0VarG4.c(8.3f, 8.3f, false, true, -3.674f, -1.684f);
            cwh0VarG4.c(8.77f, 8.77f, false, true, -4.68f, 1.799f);
            cwh0VarG4.c(1.0f, 1.0f, true, true, -0.155f, -1.995f);
            cwh0VarG4.c(6.77f, 6.77f, false, false, 3.423f, -1.245f);
            cwh0VarG4.c(8.3f, 8.3f, false, true, -1.471f, -3.04f);
            cwh0VarG4.c(1.0f, 1.0f, false, true, 1.94f, -0.488f);
            cwh0VarG4.c(6.3f, 6.3f, false, false, 0.981f, 2.125f);
            cwh0VarG4.c(6.77f, 6.77f, false, false, 1.39f, -3.706f);
            cwh0VarG4.j(4.122f, 6.841f);
            cwh0VarG4.c(1.0f, 1.0f, true, true, 0.0f, -2.0f);
            cwh0VarG4.i(3.806f);
            cwh0VarG4.j(7.928f, 3.787f);
            cwh0VarG4.c(1.0f, 1.0f, true, true, 2.0f, 0.0f);
            a180.a(a180Var4, cwh0VarG4.a, n6a1Var6, 1.0f, 2, 1.0f);
            b180VarB4 = a180Var4.b();
            lm5.c = b180VarB4;
        }
        c = new mtx(dsxVar, new dsx(b180VarB3, b180VarB4));
        d = (byte) 8;
        CREATOR = new psx((byte) 22);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof mtx);
    }

    public final int hashCode() {
        return -788767172;
    }

    public final String toString() {
        return "Translation";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
