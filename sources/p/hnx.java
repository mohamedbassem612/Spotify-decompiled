package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hnx extends hux {
    public static final Parcelable.Creator<hnx> CREATOR;
    public static final hnx c;
    public static final byte d;

    static {
        b180 b180VarB = bwp0.c;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Follow16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(4.765f, 1.423f);
            cwh0VarG.g(-0.42f, 0.459f, -0.713f, 0.992f, -0.903f, 1.554f);
            cwh0VarG.g(-0.144f, 0.421f, -0.264f, 1.173f, -0.22f, 1.894f);
            cwh0VarG.g(0.077f, 1.321f, 0.638f, 2.408f, 1.399f, 3.316f);
            cwh0VarG.v(0.002f);
            cwh0VarG.k(0.083f, 0.098f);
            cwh0VarG.g(0.611f, 0.293f, 1.16f, 0.696f, 1.621f, 1.183f);
            cwh0VarG.c(2.24f, 2.24f, false, false, -0.426f, -2.092f);
            cwh0VarG.k(-0.127f, -0.153f);
            cwh0VarG.k(-0.002f, -0.001f);
            cwh0VarG.g(-0.612f, -0.73f, -0.997f, -1.52f, -1.051f, -2.442f);
            cwh0VarG.g(-0.032f, -0.54f, 0.066f, -1.097f, 0.143f, -1.323f);
            cwh0VarG.c(2.85f, 2.85f, false, true, 0.589f, -1.022f);
            cwh0VarG.c(2.89f, 2.89f, false, true, 4.258f, 0.0f);
            cwh0VarG.g(0.261f, 0.284f, 0.456f, 0.628f, 0.59f, 1.022f);
            cwh0VarG.g(0.076f, 0.226f, 0.175f, 0.783f, 0.143f, 1.323f);
            cwh0VarG.g(-0.055f, 0.921f, -0.44f, 1.712f, -1.052f, 2.442f);
            cwh0VarG.k(-0.002f, 0.001f);
            cwh0VarG.k(-0.127f, 0.153f);
            cwh0VarG.c(2.25f, 2.25f, false, false, 0.603f, 3.39f);
            cwh0VarG.k(2.209f, 1.275f);
            cwh0VarG.c(3.25f, 3.25f, false, true, 1.605f, 2.457f);
            cwh0VarG.i(-5.99f);
            cwh0VarG.c(5.5f, 5.5f, false, true, -0.594f, 1.5f);
            cwh0VarG.i(8.259f);
            cwh0VarG.k(-0.184f, -1.665f);
            cwh0VarG.c(4.75f, 4.75f, false, false, -2.346f, -3.591f);
            cwh0VarG.k(-2.209f, -1.275f);
            cwh0VarG.c(0.75f, 0.75f, false, true, -0.201f, -1.13f);
            cwh0VarG.k(0.126f, -0.152f);
            cwh0VarG.i(0.001f);
            cwh0VarG.g(0.76f, -0.909f, 1.32f, -1.995f, 1.399f, -3.316f);
            cwh0VarG.g(0.043f, -0.721f, -0.077f, -1.473f, -0.22f, -1.894f);
            cwh0VarG.c(4.5f, 4.5f, false, false, -0.644f, -1.24f);
            cwh0VarG.v(-0.002f);
            cwh0VarG.i(-0.002f);
            cwh0VarG.c(4.388f, 4.388f, false, false, -6.728f, -0.312f);
            cwh0VarG.l(2.0f, 12.5f);
            cwh0VarG.v(-2.0f);
            cwh0VarG.i(1.5f);
            cwh0VarG.v(2.0f);
            cwh0VarG.i(2.0f);
            cwh0VarG.u(14.0f);
            cwh0VarG.i(-2.0f);
            cwh0VarG.v(2.0f);
            cwh0VarG.h(2.0f);
            cwh0VarG.v(-2.0f);
            cwh0VarG.h(0.0f);
            cwh0VarG.v(-1.5f);
            cwh0VarG.e();
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            bwp0.c = b180VarB;
        }
        b180 b180VarB2 = acq0.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Follow24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0Var = new cwh0();
            cwh0Var.l(4.99f, 3.0f);
            cwh0Var.i(2.993f);
            cwh0Var.v(2.0f);
            cwh0Var.j(4.99f, 5.0f);
            cwh0Var.v(3.0f);
            cwh0Var.j(2.994f, 8.0f);
            cwh0Var.j(2.994f, 5.0f);
            cwh0Var.j(0.0f, 5.0f);
            cwh0Var.j(0.0f, 3.0f);
            cwh0Var.i(2.994f);
            cwh0Var.j(2.994f, 0.0f);
            cwh0Var.i(1.995f);
            cwh0Var.e();
            cwh0Var.l(12.278f, 2.467f);
            cwh0Var.c(5.49f, 5.49f, false, true, 6.275f, 1.322f);
            cwh0Var.c(5.5f, 5.5f, false, true, 1.133f, 1.953f);
            cwh0Var.g(0.18f, 0.532f, 0.33f, 1.474f, 0.277f, 2.378f);
            cwh0Var.g(-0.098f, 1.659f, -0.8f, 3.02f, -1.749f, 4.156f);
            cwh0Var.k(-0.432f, 0.52f);
            cwh0Var.c(0.5f, 0.5f, false, false, 0.134f, 0.752f);
            cwh0Var.k(3.59f, 2.077f);
            cwh0Var.b(5.0f, 5.0f, false, true, 24.0f, 19.955f);
            cwh0Var.j(24.0f, 22.0f);
            cwh0Var.j(4.99f, 22.0f);
            cwh0Var.v(-2.045f);
            cwh0Var.c(5.0f, 5.0f, false, true, 2.494f, -4.33f);
            cwh0Var.k(3.59f, -2.077f);
            cwh0Var.c(0.5f, 0.5f, false, false, 0.133f, -0.753f);
            cwh0Var.k(-0.43f, -0.518f);
            cwh0Var.k(-0.002f, -0.001f);
            cwh0Var.g(-0.949f, -1.135f, -1.65f, -2.497f, -1.749f, -4.156f);
            cwh0Var.g(-0.053f, -0.904f, 0.097f, -1.846f, 0.277f, -2.378f);
            cwh0Var.c(5.5f, 5.5f, false, true, 1.133f, -1.953f);
            cwh0Var.c(5.5f, 5.5f, false, true, 1.842f, -1.322f);
            cwh0Var.l(14.494f, 4.0f);
            cwh0Var.c(3.5f, 3.5f, false, false, -2.586f, 1.14f);
            cwh0Var.c(3.5f, 3.5f, false, false, -0.715f, 1.245f);
            cwh0Var.g(-0.092f, 0.272f, -0.213f, 0.954f, -0.174f, 1.617f);
            cwh0Var.g(0.066f, 1.124f, 0.536f, 2.092f, 1.287f, 2.99f);
            cwh0Var.k(0.001f, 0.002f);
            cwh0Var.k(0.433f, 0.52f);
            cwh0Var.c(2.503f, 2.503f, false, true, -0.669f, 3.767f);
            cwh0Var.k(-3.589f, 2.076f);
            cwh0Var.c(3.0f, 3.0f, false, false, -1.497f, 2.598f);
            rjx.B(cwh0Var, 6.985f, 20.0f, 15.02f, -0.045f);
            cwh0Var.c(3.0f, 3.0f, false, false, -1.498f, -2.598f);
            cwh0Var.k(-3.589f, -2.076f);
            cwh0Var.c(2.503f, 2.503f, false, true, -0.669f, -3.766f);
            cwh0Var.k(0.433f, -0.52f);
            cwh0Var.k(0.002f, -0.003f);
            cwh0Var.g(0.75f, -0.898f, 1.22f, -1.866f, 1.287f, -2.99f);
            cwh0Var.g(0.039f, -0.663f, -0.082f, -1.345f, -0.174f, -1.617f);
            cwh0Var.g(-0.163f, -0.48f, -0.4f, -0.9f, -0.715f, -1.245f);
            cwh0Var.b(3.5f, 3.5f, false, false, 14.494f, 4.0f);
            a180.a(a180Var2, cwh0Var.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            acq0.b = b180VarB2;
        }
        dsx dsxVar = new dsx(b180VarB, b180VarB2);
        b180 b180VarB3 = hqq0.c;
        if (b180VarB3 == null) {
            a180 a180Var3 = new a180("Encore.Vector.FollowActive16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i3 = bui1.a;
            n6a1 n6a1Var3 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(6.278f, 8.26f);
            cwh0VarG2.g(0.243f, 0.291f, 0.322f, 0.659f, 0.256f, 0.998f);
            cwh0VarG2.b(5.5f, 5.5f, false, true, 8.25f, 13.25f);
            cwh0VarG2.b(5.5f, 5.5f, false, true, 7.514f, 16.0f);
            cwh0VarG2.h(16.0f);
            cwh0VarG2.v(-0.672f);
            cwh0VarG2.c(4.0f, 4.0f, false, false, -2.0f, -3.464f);
            cwh0VarG2.k(-3.112f, -1.797f);
            cwh0VarG2.c(1.2f, 1.2f, false, true, -0.322f, -1.808f);
            cwh0VarG2.k(0.487f, -0.584f);
            cwh0VarG2.g(0.757f, -0.904f, 1.28f, -1.94f, 1.352f, -3.177f);
            cwh0VarG2.g(0.042f, -0.696f, -0.079f, -1.418f, -0.2f, -1.775f);
            cwh0VarG2.c(4.0f, 4.0f, false, false, -0.823f, -1.421f);
            cwh0VarG2.c(4.015f, 4.015f, false, false, -5.92f, 0.0f);
            cwh0VarG2.c(4.0f, 4.0f, false, false, -0.823f, 1.421f);
            cwh0VarG2.g(-0.122f, 0.357f, -0.242f, 1.08f, -0.2f, 1.775f);
            cwh0VarG2.g(0.072f, 1.238f, 0.594f, 2.273f, 1.352f, 3.177f);
            rjx.y(cwh0VarG2, 0.487f, 0.584f, 2.0f, 12.5f);
            cwh0VarG2.v(-2.0f);
            cwh0VarG2.i(1.5f);
            cwh0VarG2.v(2.0f);
            cwh0VarG2.i(2.0f);
            cwh0VarG2.u(14.0f);
            cwh0VarG2.i(-2.0f);
            cwh0VarG2.v(2.0f);
            cwh0VarG2.h(2.0f);
            cwh0VarG2.v(-2.0f);
            cwh0VarG2.h(0.0f);
            cwh0VarG2.v(-1.5f);
            cwh0VarG2.e();
            a180.a(a180Var3, cwh0VarG2.a, n6a1Var3, 1.0f, 2, 1.0f);
            b180VarB3 = a180Var3.b();
            hqq0.c = b180VarB3;
        }
        b180 b180VarB4 = rwq0.a;
        if (b180VarB4 == null) {
            a180 a180Var4 = new a180("Encore.Vector.FollowActive24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i4 = bui1.a;
            n6a1 n6a1Var4 = new n6a1(u7h.b);
            cwh0 cwh0Var2 = new cwh0();
            cwh0Var2.l(8.0f, 3.0f);
            cwh0Var2.h(5.0f);
            cwh0Var2.u(0.0f);
            cwh0Var2.h(3.0f);
            cwh0Var2.v(3.0f);
            cwh0Var2.h(0.0f);
            cwh0Var2.v(2.0f);
            cwh0Var2.i(3.0f);
            cwh0Var2.v(3.0f);
            cwh0Var2.i(2.0f);
            cwh0Var2.u(5.0f);
            cwh0Var2.i(3.0f);
            cwh0Var2.e();
            cwh0Var2.l(4.0f, 20.63f);
            cwh0Var2.v(1.428f);
            cwh0Var2.i(19.0f);
            cwh0Var2.v(-1.429f);
            cwh0Var2.c(4.0f, 4.0f, false, false, -2.0f, -3.464f);
            cwh0Var2.k(-4.413f, -2.548f);
            cwh0Var2.c(1.5f, 1.5f, false, true, -0.402f, -2.26f);
            cwh0Var2.k(0.613f, -0.735f);
            cwh0Var2.g(0.95f, -1.133f, 1.604f, -2.432f, 1.696f, -3.983f);
            cwh0Var2.g(0.052f, -0.872f, -0.1f, -1.777f, -0.252f, -2.225f);
            cwh0Var2.c(5.0f, 5.0f, false, false, -1.032f, -1.782f);
            cwh0Var2.c(5.034f, 5.034f, false, false, -7.42f, 0.0f);
            cwh0Var2.c(5.0f, 5.0f, false, false, -1.032f, 1.782f);
            cwh0Var2.g(-0.153f, 0.448f, -0.304f, 1.353f, -0.252f, 2.225f);
            cwh0Var2.g(0.092f, 1.551f, 0.746f, 2.85f, 1.696f, 3.983f);
            cwh0Var2.k(0.613f, 0.736f);
            cwh0Var2.c(1.5f, 1.5f, false, true, -0.402f, 2.26f);
            cwh0Var2.j(6.0f, 17.164f);
            cwh0Var2.c(4.0f, 4.0f, false, false, -2.0f, 3.464f);
            cwh0Var2.e();
            a180.a(a180Var4, cwh0Var2.a, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB4 = a180Var4.b();
            rwq0.a = b180VarB4;
        }
        c = new hnx(dsxVar, new dsx(b180VarB3, b180VarB4));
        d = (byte) 8;
        CREATOR = new mmx((byte) 19);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof hnx);
    }

    public final int hashCode() {
        return 1188201798;
    }

    public final String toString() {
        return "Follow";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
