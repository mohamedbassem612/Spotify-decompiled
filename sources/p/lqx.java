package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lqx extends hux {
    public static final Parcelable.Creator<lqx> CREATOR;
    public static final lqx c;

    static {
        b180 b180VarB = kto1.a;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.PlaybackSpeed1Point6x16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            long j = u7h.b;
            n6a1 n6a1Var = new n6a1(j);
            cwh0 cwh0VarQ = rjx.q(13.34f, 12.5f, 1.969f, -1.97f);
            cwh0VarQ.k(-1.06f, -1.06f);
            cwh0VarQ.k(-1.97f, 1.97f);
            cwh0VarQ.k(-1.97f, -1.97f);
            cwh0VarQ.k(-1.06f, 1.06f);
            cwh0VarQ.k(1.969f, 1.97f);
            cwh0VarQ.k(-1.97f, 1.97f);
            cwh0VarQ.k(1.06f, 1.06f);
            cwh0VarQ.k(1.97f, -1.97f);
            cwh0VarQ.k(1.97f, 1.97f);
            rjx.C(cwh0VarQ, 1.06f, -1.06f, -1.969f, -1.97f);
            cwh0VarQ.l(8.34f, 8.1f);
            cwh0VarQ.c(1.0f, 1.0f, false, true, -0.46f, -0.11f);
            cwh0VarQ.c(1.0f, 1.0f, false, true, -0.34f, -0.31f);
            cwh0VarQ.c(0.84f, 0.84f, false, true, -0.12f, -0.44f);
            cwh0VarQ.o(0.0f, -0.24f, 0.12f, -0.43f);
            cwh0VarQ.c(0.9f, 0.9f, false, true, 0.34f, -0.3f);
            cwh0VarQ.c(0.9f, 0.9f, false, true, 0.46f, -0.12f);
            cwh0VarQ.o(0.25f, 0.0f, 0.46f, 0.12f);
            cwh0VarQ.c(0.84f, 0.84f, false, true, 0.33f, 0.3f);
            cwh0VarQ.o(0.12f, 0.19f, 0.12f, 0.43f);
            cwh0VarQ.o(0.0f, 0.23f, -0.12f, 0.43f);
            cwh0VarQ.c(0.9f, 0.9f, false, true, -0.33f, 0.32f);
            cwh0VarQ.c(1.0f, 1.0f, false, true, -0.46f, 0.11f);
            cwh0VarQ.m(-3.435f, -5.0f);
            cwh0VarQ.i(-1.72f);
            cwh0VarQ.j(3.185f, 2.07f);
            cwh0VarQ.o(0.94f, -0.06f, 1.37f, -0.34f);
            cwh0VarQ.o(0.429f, -0.28f, 0.54f, -0.83f);
            cwh0VarQ.i(1.26f);
            cwh0VarQ.j(6.355f, 8.0f);
            cwh0VarQ.i(-1.45f);
            cwh0VarQ.e();
            cwh0VarQ.l(12.734f, 8.17f);
            cwh0VarQ.c(3.3f, 3.3f, false, true, -1.11f, -0.18f);
            cwh0VarQ.c(2.3f, 2.3f, false, true, -0.86f, -0.57f);
            cwh0VarQ.c(2.8f, 2.8f, false, true, -0.66f, -1.1f);
            cwh0VarQ.o(-0.22f, -0.67f, -0.22f, -1.57f);
            cwh0VarQ.o(0.0f, -1.24f, 0.39f, -2.14f);
            cwh0VarQ.o(0.39f, -0.91f, 1.1f, -1.39f);
            cwh0VarQ.o(0.71f, -0.49f, 1.66f, -0.49f);
            cwh0VarQ.o(0.51f, 0.0f, 0.98f, 0.15f);
            cwh0VarQ.s(0.8f, 0.39f);
            cwh0VarQ.v(1.56f);
            cwh0VarQ.o(-0.23f, -0.29f, -0.69f, -0.51f);
            cwh0VarQ.c(2.14f, 2.14f, false, false, -0.97f, -0.23f);
            cwh0VarQ.o(-0.58f, 0.0f, -0.98f, 0.31f);
            cwh0VarQ.s(-0.61f, 0.84f);
            cwh0VarQ.c(3.0f, 3.0f, false, false, -0.19f, 1.027f);
            cwh0VarQ.k(-0.001f, 0.003f);
            cwh0VarQ.g(-0.023f, 0.043f, 0.001f, -0.003f, 0.001f, -0.003f);
            cwh0VarQ.c(1.92f, 1.92f, false, true, 0.88f, -0.817f);
            cwh0VarQ.o(0.37f, -0.18f, 0.84f, -0.18f);
            cwh0VarQ.o(0.7f, 0.0f, 1.2f, 0.31f);
            cwh0VarQ.s(0.75f, 0.84f);
            cwh0VarQ.s(0.25f, 1.18f);
            cwh0VarQ.o(0.0f, 0.67f, -0.3f, 1.26f);
            cwh0VarQ.s(-0.88f, 0.95f);
            cwh0VarQ.g(-0.58f, 0.36f, -0.847f, 0.36f, -1.38f, 0.36f);
            cwh0VarQ.m(-0.09f, -1.29f);
            cwh0VarQ.o(0.36f, 0.0f, 0.63f, -0.16f);
            cwh0VarQ.c(1.0f, 1.0f, false, false, 0.4f, -0.44f);
            cwh0VarQ.o(0.14f, -0.28f, 0.14f, -0.64f);
            cwh0VarQ.o(0.0f, -0.33f, -0.14f, -0.6f);
            cwh0VarQ.c(0.93f, 0.93f, false, false, -0.4f, -0.43f);
            cwh0VarQ.c(1.2f, 1.2f, false, false, -0.63f, -0.16f);
            cwh0VarQ.o(-0.37f, 0.0f, -0.64f, 0.16f);
            cwh0VarQ.o(-0.26f, 0.16f, -0.4f, 0.43f);
            cwh0VarQ.o(-0.13f, 0.27f, -0.13f, 0.6f);
            cwh0VarQ.o(0.0f, 0.35f, 0.13f, 0.63f);
            cwh0VarQ.o(0.14f, 0.28f, 0.4f, 0.45f);
            cwh0VarQ.o(0.27f, 0.16f, 0.64f, 0.16f);
            a180.a(a180Var, cwh0VarQ.a, n6a1Var, 1.0f, 2, 1.0f);
            n6a1 n6a1Var2 = new n6a1(j);
            ArrayList arrayList = new ArrayList(32);
            arrayList.add(new n9s0(11.374f, 4.267f));
            arrayList.add(new m9s0(-0.001f, 0.003f));
            arrayList.add(new k9s0(-0.023f, 0.043f, 0.001f, -0.003f, 0.001f, -0.003f));
            a180.a(a180Var, arrayList, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            kto1.a = b180VarB;
        }
        b180 b180VarB2 = oto1.a;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.PlaybackSpeed1Point6x24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            long j2 = u7h.b;
            n6a1 n6a1Var3 = new n6a1(j2);
            cwh0 cwh0VarQ2 = rjx.q(19.5f, 19.14f, 2.542f, -2.543f);
            cwh0VarQ2.k(-1.414f, -1.414f);
            cwh0VarQ2.k(-2.543f, 2.543f);
            cwh0VarQ2.k(-2.543f, -2.543f);
            cwh0VarQ2.k(-1.414f, 1.414f);
            cwh0VarQ2.k(2.543f, 2.543f);
            cwh0VarQ2.k(-2.543f, 2.543f);
            cwh0VarQ2.k(1.414f, 1.414f);
            cwh0VarQ2.k(2.543f, -2.543f);
            rjx.C(cwh0VarQ2, 2.543f, 2.543f, 1.414f, -1.414f);
            cwh0VarQ2.l(11.144f, 12.527f);
            cwh0VarQ2.c(1.5f, 1.5f, false, true, -0.688f, -0.16f);
            cwh0VarQ2.c(1.44f, 1.44f, false, true, -0.512f, -0.464f);
            cwh0VarQ2.c(1.3f, 1.3f, false, true, -0.176f, -0.672f);
            cwh0VarQ2.o(0.0f, -0.352f, 0.176f, -0.64f);
            cwh0VarQ2.o(0.192f, -0.288f, 0.512f, -0.448f);
            cwh0VarQ2.c(1.4f, 1.4f, false, true, 1.36f, 0.0f);
            cwh0VarQ2.o(0.303f, 0.16f, 0.48f, 0.448f);
            cwh0VarQ2.o(0.192f, 0.288f, 0.192f, 0.64f);
            cwh0VarQ2.s(-0.192f, 0.656f);
            cwh0VarQ2.c(1.3f, 1.3f, false, true, -0.48f, 0.48f);
            cwh0VarQ2.o(-0.304f, 0.16f, -0.672f, 0.16f);
            cwh0VarQ2.l(5.868f, 4.351f);
            cwh0VarQ2.j(3.116f, 4.351f);
            cwh0VarQ2.j(3.116f, 2.895f);
            cwh0VarQ2.o(1.488f, -0.096f, 2.16f, -0.544f);
            cwh0VarQ2.o(0.689f, -0.463f, 0.848f, -1.344f);
            rjx.A(cwh0VarQ2, 1.808f, 11.36f, 5.868f, 12.367f);
            cwh0VarQ2.l(16.322f, 12.351f);
            cwh0VarQ2.c(5.0f, 5.0f, false, false, 1.728f, 0.288f);
            cwh0VarQ2.o(1.248f, 0.0f, 2.16f, -0.576f);
            cwh0VarQ2.c(3.73f, 3.73f, false, false, 1.376f, -1.504f);
            cwh0VarQ2.c(4.5f, 4.5f, false, false, 0.464f, -2.016f);
            cwh0VarQ2.o(0.0f, -1.055f, -0.4f, -1.904f);
            cwh0VarQ2.c(3.1f, 3.1f, false, false, -1.2f, -1.344f);
            cwh0VarQ2.o(-0.8f, -0.512f, -1.92f, -0.512f);
            cwh0VarQ2.o(-0.767f, 0.0f, -1.376f, 0.304f);
            cwh0VarQ2.c(3.3f, 3.3f, false, false, -0.992f, 0.736f);
            cwh0VarQ2.o(-0.28f, 0.315f, -0.431f, 0.628f);
            cwh0VarQ2.c(5.3f, 5.3f, false, true, 0.32f, -1.78f);
            cwh0VarQ2.o(0.351f, -0.911f, 1.023f, -1.424f);
            cwh0VarQ2.o(0.672f, -0.528f, 1.616f, -0.528f);
            cwh0VarQ2.c(3.46f, 3.46f, false, true, 1.536f, 0.352f);
            cwh0VarQ2.o(0.736f, 0.352f, 1.088f, 0.832f);
            cwh0VarQ2.j(21.314f, 1.6f);
            cwh0VarQ2.c(4.5f, 4.5f, false, false, -1.248f, -0.608f);
            cwh0VarQ2.b(4.6f, 4.6f, false, false, 18.53f, 0.735f);
            cwh0VarQ2.o(-1.504f, 0.0f, -2.624f, 0.784f);
            cwh0VarQ2.o(-1.104f, 0.769f, -1.712f, 2.224f);
            cwh0VarQ2.o(-0.592f, 1.44f, -0.592f, 3.44f);
            cwh0VarQ2.o(0.0f, 1.457f, 0.352f, 2.528f);
            cwh0VarQ2.o(0.353f, 1.073f, 1.04f, 1.76f);
            cwh0VarQ2.o(0.56f, 0.576f, 1.328f, 0.88f);
            cwh0VarQ2.m(-0.591f, -5.9f);
            cwh0VarQ2.g(-0.002f, 0.078f, -0.001f, -0.08f, 0.0f, 0.0f);
            cwh0VarQ2.g(0.024f, -0.072f, -0.034f, 0.072f, 0.0f, 0.0f);
            cwh0VarQ2.m(3.28f, 4.044f);
            cwh0VarQ2.o(-0.465f, 0.273f, -1.089f, 0.272f);
            cwh0VarQ2.o(-0.655f, 0.0f, -1.12f, -0.288f);
            cwh0VarQ2.c(1.9f, 1.9f, false, true, -0.688f, -0.768f);
            cwh0VarQ2.o(-0.24f, -0.495f, -0.24f, -1.104f);
            cwh0VarQ2.o(0.0f, -0.576f, 0.24f, -1.04f);
            cwh0VarQ2.o(0.24f, -0.48f, 0.688f, -0.752f);
            cwh0VarQ2.o(0.465f, -0.272f, 1.12f, -0.272f);
            cwh0VarQ2.o(0.624f, 0.0f, 1.088f, 0.272f);
            cwh0VarQ2.o(0.465f, 0.256f, 0.704f, 0.736f);
            cwh0VarQ2.o(0.24f, 0.48f, 0.24f, 1.056f);
            cwh0VarQ2.o(0.0f, 0.624f, -0.24f, 1.12f);
            cwh0VarQ2.o(-0.24f, 0.48f, -0.704f, 0.768f);
            cwh0VarQ2.e();
            a180.a(a180Var2, cwh0VarQ2.a, n6a1Var3, 1.0f, 2, 1.0f);
            n6a1 n6a1Var4 = new n6a1(j2);
            ArrayList arrayList2 = new ArrayList(32);
            arrayList2.add(new f9s0(15.73f, 6.451f));
            arrayList2.add(new k9s0(0.0f, 0.078f, 0.0f, -0.08f, 0.0f, 0.0f));
            arrayList2.add(new k9s0(0.025f, -0.072f, -0.033f, 0.072f, 0.0f, 0.0f));
            a180.a(a180Var2, arrayList2, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            oto1.a = b180VarB2;
        }
        c = new lqx(new dsx(b180VarB, b180VarB2), null);
        CREATOR = new dqx((byte) 7);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof lqx);
    }

    public final int hashCode() {
        return -214415400;
    }

    public final String toString() {
        return "PlaybackSpeed1Point6x";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
