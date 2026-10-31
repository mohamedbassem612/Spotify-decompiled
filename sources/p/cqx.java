package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cqx extends hux {
    public static final Parcelable.Creator<cqx> CREATOR;
    public static final cqx c;

    static {
        b180 b180VarB = bro1.a;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.PlaybackSpeed0Point7x16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
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
            cwh0VarQ.l(10.699f, 8.0f);
            cwh0VarQ.c(8.0f, 8.0f, false, true, 0.39f, -2.15f);
            cwh0VarQ.c(10.0f, 10.0f, false, true, 0.91f, -2.05f);
            cwh0VarQ.c(8.4f, 8.4f, false, true, 1.23f, -1.63f);
            cwh0VarQ.i(-2.62f);
            cwh0VarQ.v(0.97f);
            cwh0VarQ.i(-1.29f);
            rjx.B(cwh0VarQ, 9.319f, 0.9f, 5.34f, 1.31f);
            cwh0VarQ.c(8.3f, 8.3f, false, false, -1.61f, 2.55f);
            cwh0VarQ.o(-0.6f, 1.46f, -0.66f, 3.24f);
            cwh0VarQ.e();
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
            bro1.a = b180VarB;
        }
        b180 b180VarB2 = ero1.a;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.PlaybackSpeed0Point7x24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
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
            cwh0VarQ2.l(16.14f, 12.367f);
            cwh0VarQ2.c(13.2f, 13.2f, false, true, 0.624f, -3.504f);
            cwh0VarQ2.c(16.6f, 16.6f, false, true, 1.456f, -3.328f);
            cwh0VarQ2.o(0.895f, -1.551f, 1.984f, -2.688f);
            rjx.s(cwh0VarQ2, -4.432f, 15.772f, 4.4f, -1.856f);
            rjx.B(cwh0VarQ2, 13.916f, 1.007f, 8.352f, 1.888f);
            cwh0VarQ2.o(-1.632f, 1.776f, -2.624f, 4.192f);
            cwh0VarQ2.s(-1.088f, 5.28f);
            cwh0VarQ2.e();
            cwh0VarQ2.l(13.26f, 12.527f);
            cwh0VarQ2.o(-0.369f, 0.0f, -0.689f, -0.16f);
            cwh0VarQ2.c(1.4f, 1.4f, false, true, -0.512f, -0.464f);
            cwh0VarQ2.c(1.3f, 1.3f, false, true, -0.176f, -0.672f);
            cwh0VarQ2.o(0.0f, -0.352f, 0.176f, -0.64f);
            cwh0VarQ2.o(0.192f, -0.288f, 0.512f, -0.448f);
            cwh0VarQ2.o(0.32f, -0.176f, 0.688f, -0.176f);
            cwh0VarQ2.o(0.369f, 0.0f, 0.672f, 0.176f);
            cwh0VarQ2.o(0.304f, 0.16f, 0.48f, 0.448f);
            cwh0VarQ2.o(0.192f, 0.288f, 0.192f, 0.64f);
            cwh0VarQ2.s(-0.192f, 0.656f);
            cwh0VarQ2.c(1.3f, 1.3f, false, true, -0.48f, 0.48f);
            cwh0VarQ2.o(-0.303f, 0.16f, -0.672f, 0.16f);
            cwh0VarQ2.e();
            cwh0VarQ2.l(7.051f, 12.64f);
            cwh0VarQ2.o(-1.487f, 0.0f, -2.528f, -0.769f);
            cwh0VarQ2.o(-1.023f, -0.768f, -1.552f, -2.112f);
            cwh0VarQ2.o(-0.512f, -1.344f, -0.512f, -3.072f);
            cwh0VarQ2.s(0.512f, -3.072f);
            cwh0VarQ2.n(3.5f, 2.271f, 4.523f, 1.503f);
            cwh0VarQ2.n(5.564f, 0.735f, 7.051f, 0.735f);
            cwh0VarQ2.o(1.473f, 0.0f, 2.512f, 0.768f);
            cwh0VarQ2.o(1.04f, 0.769f, 1.552f, 2.128f);
            cwh0VarQ2.o(0.528f, 1.344f, 0.528f, 3.056f);
            cwh0VarQ2.o(0.0f, 1.713f, -0.528f, 3.072f);
            cwh0VarQ2.o(-0.511f, 1.344f, -1.552f, 2.112f);
            cwh0VarQ2.s(-2.512f, 0.768f);
            cwh0VarQ2.e();
            cwh0VarQ2.l(7.051f, 10.64f);
            cwh0VarQ2.o(0.784f, 0.0f, 1.312f, -0.465f);
            cwh0VarQ2.o(0.528f, -0.48f, 0.784f, -1.36f);
            cwh0VarQ2.o(0.273f, -0.88f, 0.272f, -2.144f);
            cwh0VarQ2.o(0.0f, -1.248f, -0.272f, -2.112f);
            cwh0VarQ2.o(-0.256f, -0.879f, -0.784f, -1.344f);
            cwh0VarQ2.o(-0.528f, -0.48f, -1.312f, -0.48f);
            cwh0VarQ2.s(-1.312f, 0.48f);
            cwh0VarQ2.o(-0.528f, 0.465f, -0.8f, 1.344f);
            cwh0VarQ2.o(-0.255f, 0.864f, -0.256f, 2.112f);
            cwh0VarQ2.o(0.0f, 1.265f, 0.256f, 2.144f);
            cwh0VarQ2.o(0.273f, 0.88f, 0.8f, 1.36f);
            cwh0VarQ2.o(0.529f, 0.465f, 1.312f, 0.464f);
            cwh0VarQ2.e();
            a180.a(a180Var2, cwh0VarQ2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            ero1.a = b180VarB2;
        }
        c = new cqx(new dsx(b180VarB, b180VarB2), null);
        CREATOR = new yox((byte) 29);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof cqx);
    }

    public final int hashCode() {
        return -1957225704;
    }

    public final String toString() {
        return "PlaybackSpeed0Point7x";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
