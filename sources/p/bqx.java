package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bqx extends hux {
    public static final Parcelable.Creator<bqx> CREATOR;
    public static final bqx c;

    static {
        b180 b180VarB = vqo1.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.PlaybackSpeed0Point6x16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
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
            cwh0VarQ.l(12.885f, 8.17f);
            cwh0VarQ.o(-0.61f, 0.0f, -1.11f, -0.18f);
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
            cwh0VarQ.c(3.1f, 3.1f, false, false, -0.19f, 1.16f);
            cwh0VarQ.i(-0.06f);
            cwh0VarQ.o(0.1f, -0.26f, 0.34f, -0.52f);
            cwh0VarQ.s(0.6f, -0.43f);
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
            cwh0VarQ.c(1.1f, 1.1f, false, false, -0.4f, 0.43f);
            cwh0VarQ.o(-0.13f, 0.27f, -0.13f, 0.6f);
            cwh0VarQ.o(0.0f, 0.35f, 0.13f, 0.63f);
            cwh0VarQ.o(0.14f, 0.28f, 0.4f, 0.45f);
            cwh0VarQ.o(0.27f, 0.16f, 0.64f, 0.16f);
            cwh0VarQ.l(8.49f, 8.1f);
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
            cwh0VarQ.m(-4.338f, 0.07f);
            cwh0VarQ.o(-0.95f, 0.0f, -1.61f, -0.48f);
            cwh0VarQ.s(-0.99f, -1.32f);
            cwh0VarQ.s(-0.33f, -1.92f);
            cwh0VarQ.g(0.0f, -1.08f, 0.11f, -1.36f, 0.33f, -1.92f);
            cwh0VarQ.o(0.33f, -0.84f, 0.99f, -1.32f);
            cwh0VarQ.s(1.61f, -0.48f);
            cwh0VarQ.o(0.94f, 0.0f, 1.6f, 0.48f);
            cwh0VarQ.s(0.99f, 1.33f);
            cwh0VarQ.o(0.34f, 0.84f, 0.34f, 1.91f);
            cwh0VarQ.s(-0.34f, 1.92f);
            cwh0VarQ.o(-0.33f, 0.84f, -0.99f, 1.32f);
            cwh0VarQ.s(-1.6f, 0.48f);
            cwh0VarQ.m(0.0f, -1.39f);
            cwh0VarQ.o(0.45f, 0.0f, 0.76f, -0.27f);
            cwh0VarQ.s(0.46f, -0.79f);
            cwh0VarQ.s(0.15f, -1.28f);
            cwh0VarQ.o(0.0f, -0.75f, -0.15f, -1.26f);
            cwh0VarQ.o(-0.15f, -0.52f, -0.46f, -0.79f);
            cwh0VarQ.s(-0.76f, -0.27f);
            cwh0VarQ.o(-0.46f, 0.0f, -0.77f, 0.27f);
            cwh0VarQ.o(-0.3f, 0.27f, -0.46f, 0.79f);
            cwh0VarQ.o(-0.15f, 0.51f, -0.15f, 1.26f);
            cwh0VarQ.o(0.0f, 0.76f, 0.15f, 1.28f);
            cwh0VarQ.o(0.16f, 0.52f, 0.46f, 0.79f);
            cwh0VarQ.o(0.31f, 0.27f, 0.77f, 0.27f);
            a180.a(a180Var, cwh0VarQ.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            vqo1.b = b180VarB;
        }
        b180 b180VarB2 = zqo1.e;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.PlaybackSpeed0Point6x24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
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
            cwh0VarQ2.l(18.01f, 12.64f);
            cwh0VarQ2.o(-0.944f, 0.0f, -1.728f, -0.289f);
            cwh0VarQ2.c(3.8f, 3.8f, false, true, -1.328f, -0.88f);
            cwh0VarQ2.o(-0.687f, -0.687f, -1.04f, -1.76f);
            cwh0VarQ2.o(-0.351f, -1.071f, -0.352f, -2.528f);
            cwh0VarQ2.o(0.0f, -2.0f, 0.592f, -3.44f);
            cwh0VarQ2.o(0.609f, -1.456f, 1.712f, -2.224f);
            cwh0VarQ2.o(1.12f, -0.784f, 2.624f, -0.784f);
            cwh0VarQ2.o(0.801f, 0.0f, 1.536f, 0.256f);
            cwh0VarQ2.o(0.736f, 0.24f, 1.248f, 0.608f);
            cwh0VarQ2.v(2.304f);
            cwh0VarQ2.o(-0.351f, -0.48f, -1.088f, -0.832f);
            cwh0VarQ2.c(3.45f, 3.45f, false, false, -1.536f, -0.352f);
            cwh0VarQ2.o(-0.944f, 0.0f, -1.616f, 0.528f);
            cwh0VarQ2.o(-0.672f, 0.513f, -1.024f, 1.424f);
            cwh0VarQ2.o(-0.335f, 0.897f, -0.32f, 2.016f);
            cwh0VarQ2.i(-0.096f);
            cwh0VarQ2.c(2.5f, 2.5f, false, true, 0.528f, -0.864f);
            cwh0VarQ2.o(0.384f, -0.432f, 0.992f, -0.736f);
            cwh0VarQ2.c(3.0f, 3.0f, false, true, 1.376f, -0.304f);
            cwh0VarQ2.o(1.12f, 0.0f, 1.92f, 0.512f);
            cwh0VarQ2.o(0.801f, 0.497f, 1.2f, 1.344f);
            cwh0VarQ2.o(0.4f, 0.849f, 0.4f, 1.904f);
            cwh0VarQ2.c(4.5f, 4.5f, false, true, -0.464f, 2.016f);
            cwh0VarQ2.c(3.73f, 3.73f, false, true, -1.376f, 1.504f);
            cwh0VarQ2.o(-0.912f, 0.576f, -2.16f, 0.576f);
            cwh0VarQ2.e();
            cwh0VarQ2.l(17.882f, 10.767f);
            cwh0VarQ2.o(0.624f, 0.0f, 1.088f, -0.272f);
            cwh0VarQ2.o(0.465f, -0.288f, 0.704f, -0.768f);
            cwh0VarQ2.o(0.24f, -0.495f, 0.24f, -1.12f);
            cwh0VarQ2.o(0.0f, -0.576f, -0.24f, -1.056f);
            cwh0VarQ2.c(1.7f, 1.7f, false, false, -0.704f, -0.736f);
            cwh0VarQ2.c(2.1f, 2.1f, false, false, -1.088f, -0.272f);
            cwh0VarQ2.o(-0.655f, 0.0f, -1.12f, 0.272f);
            cwh0VarQ2.c(1.8f, 1.8f, false, false, -0.688f, 0.752f);
            cwh0VarQ2.o(-0.24f, 0.464f, -0.24f, 1.04f);
            cwh0VarQ2.o(0.0f, 0.609f, 0.24f, 1.104f);
            cwh0VarQ2.o(0.24f, 0.48f, 0.688f, 0.768f);
            cwh0VarQ2.o(0.465f, 0.288f, 1.12f, 0.288f);
            cwh0VarQ2.m(-6.138f, 1.76f);
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
            cwh0VarQ2.c(1.4f, 1.4f, false, true, -0.672f, 0.16f);
            cwh0VarQ2.m(-6.208f, 0.113f);
            cwh0VarQ2.o(-1.488f, 0.0f, -2.528f, -0.769f);
            cwh0VarQ2.o(-1.024f, -0.768f, -1.552f, -2.112f);
            cwh0VarQ2.n(0.943f, 8.415f, 0.944f, 6.687f);
            cwh0VarQ2.o(0.0f, -1.728f, 0.512f, -3.072f);
            cwh0VarQ2.o(0.528f, -1.344f, 1.552f, -2.112f);
            cwh0VarQ2.n(4.047f, 0.735f, 5.536f, 0.735f);
            cwh0VarQ2.o(1.471f, 0.0f, 2.512f, 0.768f);
            cwh0VarQ2.o(1.04f, 0.769f, 1.552f, 2.128f);
            cwh0VarQ2.o(0.528f, 1.344f, 0.528f, 3.056f);
            cwh0VarQ2.o(0.0f, 1.713f, -0.528f, 3.072f);
            cwh0VarQ2.o(-0.513f, 1.344f, -1.552f, 2.112f);
            cwh0VarQ2.s(-2.512f, 0.768f);
            cwh0VarQ2.e();
            cwh0VarQ2.l(5.536f, 10.64f);
            cwh0VarQ2.o(0.784f, 0.0f, 1.312f, -0.465f);
            cwh0VarQ2.o(0.528f, -0.48f, 0.784f, -1.36f);
            cwh0VarQ2.o(0.272f, -0.88f, 0.272f, -2.144f);
            cwh0VarQ2.o(0.0f, -1.248f, -0.272f, -2.112f);
            cwh0VarQ2.o(-0.256f, -0.879f, -0.784f, -1.344f);
            cwh0VarQ2.o(-0.529f, -0.48f, -1.312f, -0.48f);
            cwh0VarQ2.o(-0.784f, 0.0f, -1.312f, 0.48f);
            cwh0VarQ2.o(-0.528f, 0.465f, -0.8f, 1.344f);
            cwh0VarQ2.o(-0.256f, 0.864f, -0.256f, 2.112f);
            cwh0VarQ2.o(0.0f, 1.265f, 0.256f, 2.144f);
            cwh0VarQ2.o(0.272f, 0.88f, 0.8f, 1.36f);
            cwh0VarQ2.o(0.529f, 0.465f, 1.312f, 0.464f);
            cwh0VarQ2.e();
            a180.a(a180Var2, cwh0VarQ2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            zqo1.e = b180VarB2;
        }
        c = new bqx(new dsx(b180VarB, b180VarB2), null);
        CREATOR = new yox((byte) 28);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof bqx);
    }

    public final int hashCode() {
        return -1957225735;
    }

    public final String toString() {
        return "PlaybackSpeed0Point6x";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
