package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lnx extends hux {
    public static final Parcelable.Creator<lnx> CREATOR;
    public static final lnx c;

    static {
        b180 b180VarB = poz0.a;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Gif16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            long j = u7h.b;
            n6a1 n6a1Var = new n6a1(j);
            cwh0 cwh0VarG = lf51.g(5.167f, 5.419f);
            cwh0VarG.o(0.672f, 0.0f, 1.178f, 0.201f);
            cwh0VarG.o(0.505f, 0.202f, 0.81f, 0.568f);
            cwh0VarG.o(0.312f, 0.367f, 0.389f, 0.838f);
            cwh0VarG.i(-1.51f);
            cwh0VarG.c(0.64f, 0.64f, false, false, -0.174f, -0.242f);
            cwh0VarG.c(0.75f, 0.75f, false, false, -0.298f, -0.166f);
            cwh0VarG.c(1.2f, 1.2f, false, false, -0.402f, -0.062f);
            cwh0VarG.o(-0.332f, 0.0f, -0.602f, 0.173f);
            cwh0VarG.o(-0.27f, 0.166f, -0.423f, 0.499f);
            cwh0VarG.c(1.95f, 1.95f, false, false, -0.146f, 0.796f);
            cwh0VarG.o(0.0f, 0.471f, 0.153f, 0.797f);
            cwh0VarG.o(0.16f, 0.319f, 0.422f, 0.485f);
            cwh0VarG.o(0.27f, 0.159f, 0.624f, 0.159f);
            cwh0VarG.o(0.312f, 0.0f, 0.534f, -0.11f);
            cwh0VarG.c(0.76f, 0.76f, false, false, 0.339f, -0.305f);
            cwh0VarG.c(0.9f, 0.9f, false, false, 0.118f, -0.465f);
            cwh0VarG.h(4.967f);
            cwh0VarG.u(7.532f);
            cwh0VarG.i(2.597f);
            cwh0VarG.v(2.93f);
            cwh0VarG.h(6.262f);
            cwh0VarG.u(9.82f);
            cwh0VarG.g(-0.083f, 0.222f, -0.224f, 0.34f, -0.478f, 0.511f);
            cwh0VarG.o(-0.381f, 0.25f, -0.956f, 0.25f);
            cwh0VarG.o(-0.616f, 0.0f, -1.15f, -0.298f);
            cwh0VarG.c(2.3f, 2.3f, false, true, -0.86f, -0.873f);
            cwh0VarG.n(2.5f, 8.835f, 2.5f, 8.072f);
            cwh0VarG.o(0.0f, -0.775f, 0.333f, -1.378f);
            cwh0VarG.s(0.935f, -0.935f);
            cwh0VarG.o(0.61f, -0.34f, 1.399f, -0.34f);
            cwh0VarG.m(4.42f, 5.044f);
            cwh0VarG.h(8.16f);
            cwh0VarG.u(5.544f);
            rjx.v(cwh0VarG, 1.427f, 13.5f, 6.688f, -1.815f);
            cwh0VarG.v(0.88f);
            cwh0VarG.i(1.62f);
            cwh0VarG.v(1.121f);
            cwh0VarG.i(-1.62f);
            cwh0VarG.v(1.774f);
            cwh0VarG.h(10.25f);
            cwh0VarG.u(5.544f);
            cwh0VarG.i(3.25f);
            cwh0VarG.e();
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            n6a1 n6a1Var2 = new n6a1(j);
            cwh0 cwh0VarG2 = lf51.g(14.0f, 0.0f);
            cwh0VarG2.c(2.0f, 2.0f, false, true, 2.0f, 2.0f);
            cwh0VarG2.v(12.0f);
            cwh0VarG2.c(2.0f, 2.0f, false, true, -2.0f, 2.0f);
            cwh0VarG2.h(2.0f);
            cwh0VarG2.c(2.0f, 2.0f, false, true, -2.0f, -2.0f);
            cwh0VarG2.u(2.0f);
            cwh0VarG2.c(2.0f, 2.0f, false, true, 2.0f, -2.0f);
            cwh0VarG2.e();
            cwh0VarG2.l(2.0f, 1.5f);
            cwh0VarG2.c(0.5f, 0.5f, false, false, -0.5f, 0.5f);
            cwh0VarG2.v(12.0f);
            cwh0VarG2.c(0.5f, 0.5f, false, false, 0.5f, 0.5f);
            cwh0VarG2.i(12.0f);
            cwh0VarG2.c(0.5f, 0.5f, false, false, 0.5f, -0.5f);
            cwh0VarG2.u(2.0f);
            cwh0VarG2.c(0.5f, 0.5f, false, false, -0.5f, -0.5f);
            cwh0VarG2.e();
            a180.a(a180Var, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            poz0.a = b180VarB;
        }
        b180 b180VarB2 = ot11.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Gif24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            long j2 = u7h.b;
            n6a1 n6a1Var3 = new n6a1(j2);
            cwh0 cwh0VarG3 = lf51.g(7.874f, 8.275f);
            cwh0VarG3.o(0.961f, 0.0f, 1.688f, 0.296f);
            cwh0VarG3.c(2.9f, 2.9f, false, true, 1.165f, 0.828f);
            cwh0VarG3.o(0.45f, 0.522f, 0.572f, 1.217f);
            cwh0VarG3.h(9.265f);
            cwh0VarG3.c(1.0f, 1.0f, false, false, -0.277f, -0.398f);
            cwh0VarG3.c(1.15f, 1.15f, false, false, -0.47f, -0.277f);
            cwh0VarG3.c(1.9f, 1.9f, false, false, -0.644f, -0.102f);
            cwh0VarG3.o(-0.541f, 0.0f, -0.97f, 0.265f);
            cwh0VarG3.o(-0.42f, 0.267f, -0.665f, 0.788f);
            cwh0VarG3.o(-0.234f, 0.51f, -0.235f, 1.237f);
            cwh0VarG3.o(0.0f, 0.716f, 0.245f, 1.217f);
            cwh0VarG3.o(0.246f, 0.49f, 0.675f, 0.756f);
            cwh0VarG3.o(0.429f, 0.255f, 0.981f, 0.255f);
            cwh0VarG3.o(0.501f, 0.0f, 0.849f, -0.173f);
            cwh0VarG3.o(0.358f, -0.184f, 0.542f, -0.501f);
            cwh0VarG3.o(0.183f, -0.327f, 0.183f, -0.756f);
            cwh0VarG3.k(-0.002f, -0.044f);
            cwh0VarG3.k(-1.899f, 0.003f);
            cwh0VarG3.v(-1.462f);
            cwh0VarG3.i(3.752f);
            cwh0VarG3.v(4.293f);
            cwh0VarG3.h(9.571f);
            cwh0VarG3.v(-0.987f);
            cwh0VarG3.g(-0.122f, 0.334f, -0.323f, 0.524f, -0.705f, 0.783f);
            cwh0VarG3.o(-0.563f, 0.378f, -1.41f, 0.378f);
            cwh0VarG3.o(-0.942f, 0.0f, -1.728f, -0.45f);
            cwh0VarG3.c(3.3f, 3.3f, false, true, -1.257f, -1.298f);
            cwh0VarG3.n(4.0f, 13.294f, 4.0f, 12.17f);
            cwh0VarG3.o(0.0f, -1.136f, 0.49f, -2.024f);
            cwh0VarG3.c(3.47f, 3.47f, false, true, 1.37f, -1.38f);
            cwh0VarG3.o(0.88f, -0.49f, 2.014f, -0.49f);
            cwh0VarG3.m(6.351f, 7.441f);
            cwh0VarG3.i(-1.922f);
            cwh0VarG3.u(8.459f);
            rjx.v(cwh0VarG3, 1.922f, 20.0f, 10.023f, -2.77f);
            cwh0VarG3.v(1.462f);
            cwh0VarG3.i(2.473f);
            cwh0VarG3.v(1.534f);
            cwh0VarG3.h(17.23f);
            cwh0VarG3.v(2.698f);
            cwh0VarG3.i(-1.922f);
            cwh0VarG3.u(8.459f);
            cwh0VarG3.h(20.0f);
            cwh0VarG3.e();
            a180.a(a180Var2, cwh0VarG3.a, n6a1Var3, 1.0f, 2, 1.0f);
            n6a1 n6a1Var4 = new n6a1(j2);
            cwh0 cwh0VarG4 = lf51.g(18.0f, 1.0f);
            cwh0VarG4.c(5.0f, 5.0f, false, true, 5.0f, 5.0f);
            cwh0VarG4.v(12.0f);
            cwh0VarG4.c(5.0f, 5.0f, false, true, -5.0f, 5.0f);
            cwh0VarG4.h(6.0f);
            cwh0VarG4.c(5.0f, 5.0f, false, true, -5.0f, -5.0f);
            cwh0VarG4.u(6.0f);
            cwh0VarG4.c(5.0f, 5.0f, false, true, 5.0f, -5.0f);
            cwh0VarG4.e();
            cwh0VarG4.l(6.0f, 3.0f);
            cwh0VarG4.c(3.0f, 3.0f, false, false, -3.0f, 3.0f);
            cwh0VarG4.v(12.0f);
            cwh0VarG4.c(3.0f, 3.0f, false, false, 3.0f, 3.0f);
            cwh0VarG4.i(12.0f);
            cwh0VarG4.c(3.0f, 3.0f, false, false, 3.0f, -3.0f);
            cwh0VarG4.u(6.0f);
            cwh0VarG4.c(3.0f, 3.0f, false, false, -3.0f, -3.0f);
            cwh0VarG4.e();
            a180.a(a180Var2, cwh0VarG4.a, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            ot11.b = b180VarB2;
        }
        dsx dsxVar = new dsx(b180VarB, b180VarB2);
        b180 b180VarB3 = c921.a;
        if (b180VarB3 == null) {
            a180 a180Var3 = new a180("Encore.Vector.GifActive16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i3 = bui1.a;
            n6a1 n6a1Var5 = new n6a1(u7h.b);
            cwh0 cwh0VarG5 = lf51.g(14.0f, 0.0f);
            cwh0VarG5.c(2.0f, 2.0f, false, true, 2.0f, 2.0f);
            cwh0VarG5.v(12.0f);
            cwh0VarG5.c(2.0f, 2.0f, false, true, -2.0f, 2.0f);
            cwh0VarG5.j(2.0f, 16.0f);
            cwh0VarG5.c(2.0f, 2.0f, false, true, -2.0f, -2.0f);
            cwh0VarG5.j(0.0f, 2.0f);
            cwh0VarG5.c(2.0f, 2.0f, false, true, 2.0f, -2.0f);
            cwh0VarG5.e();
            cwh0VarG5.l(5.167f, 5.419f);
            cwh0VarG5.o(-0.79f, 0.0f, -1.4f, 0.34f);
            cwh0VarG5.c(2.34f, 2.34f, false, false, -0.934f, 0.935f);
            cwh0VarG5.n(2.5f, 7.297f, 2.5f, 8.072f);
            cwh0VarG5.o(0.0f, 0.763f, 0.318f, 1.338f);
            cwh0VarG5.o(0.326f, 0.568f, 0.86f, 0.873f);
            cwh0VarG5.o(0.534f, 0.298f, 1.15f, 0.298f);
            cwh0VarG5.o(0.575f, 0.0f, 0.956f, -0.25f);
            cwh0VarG5.g(0.254f, -0.17f, 0.395f, -0.313f, 0.478f, -0.534f);
            cwh0VarG5.v(0.666f);
            cwh0VarG5.i(1.302f);
            cwh0VarG5.v(-2.93f);
            cwh0VarG5.j(4.967f, 7.533f);
            cwh0VarG5.v(1.052f);
            cwh0VarG5.i(1.212f);
            cwh0VarG5.o(0.0f, 0.263f, -0.118f, 0.465f);
            cwh0VarG5.c(0.76f, 0.76f, false, true, -0.34f, 0.304f);
            cwh0VarG5.o(-0.22f, 0.11f, -0.533f, 0.11f);
            cwh0VarG5.o(-0.352f, 0.0f, -0.624f, -0.158f);
            cwh0VarG5.c(1.2f, 1.2f, false, true, -0.422f, -0.485f);
            cwh0VarG5.c(1.9f, 1.9f, false, true, -0.153f, -0.797f);
            cwh0VarG5.o(0.0f, -0.471f, 0.146f, -0.796f);
            cwh0VarG5.c(1.11f, 1.11f, false, true, 1.025f, -0.672f);
            cwh0VarG5.o(0.23f, 0.0f, 0.402f, 0.062f);
            cwh0VarG5.o(0.18f, 0.055f, 0.298f, 0.166f);
            cwh0VarG5.o(0.118f, 0.105f, 0.173f, 0.242f);
            cwh0VarG5.i(1.51f);
            cwh0VarG5.c(1.7f, 1.7f, false, false, -0.388f, -0.838f);
            cwh0VarG5.c(2.0f, 2.0f, false, false, -0.81f, -0.568f);
            cwh0VarG5.c(3.2f, 3.2f, false, false, -1.178f, -0.201f);
            cwh0VarG5.m(2.993f, 0.125f);
            cwh0VarG5.v(4.919f);
            cwh0VarG5.i(1.427f);
            rjx.u(cwh0VarG5, 9.587f, 5.544f, 10.251f, 5.544f);
            cwh0VarG5.v(4.919f);
            cwh0VarG5.i(1.434f);
            cwh0VarG5.j(11.685f, 8.689f);
            rjx.s(cwh0VarG5, 1.62f, 13.305f, 7.567f, -1.62f);
            cwh0VarG5.v(-0.88f);
            ydh.k(cwh0VarG5, 13.5f, 6.687f, 13.5f, 5.545f);
            a180.a(a180Var3, cwh0VarG5.a, n6a1Var5, 1.0f, 2, 1.0f);
            b180VarB3 = a180Var3.b();
            c921.a = b180VarB3;
        }
        b180 b180VarB4 = fn31.f;
        if (b180VarB4 == null) {
            a180 a180Var4 = new a180("Encore.Vector.GifActive24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i4 = bui1.a;
            n6a1 n6a1Var6 = new n6a1(u7h.b);
            cwh0 cwh0VarG6 = lf51.g(18.0f, 1.0f);
            cwh0VarG6.c(5.0f, 5.0f, false, true, 5.0f, 5.0f);
            cwh0VarG6.v(12.0f);
            cwh0VarG6.c(5.0f, 5.0f, false, true, -5.0f, 5.0f);
            cwh0VarG6.j(6.0f, 23.0f);
            cwh0VarG6.c(5.0f, 5.0f, false, true, -5.0f, -5.0f);
            cwh0VarG6.j(1.0f, 6.0f);
            cwh0VarG6.c(5.0f, 5.0f, false, true, 5.0f, -5.0f);
            cwh0VarG6.e();
            cwh0VarG6.l(7.875f, 8.275f);
            cwh0VarG6.o(-1.134f, 0.0f, -2.014f, 0.49f);
            cwh0VarG6.c(3.47f, 3.47f, false, false, -1.37f, 1.38f);
            cwh0VarG6.o(-0.49f, 0.89f, -0.491f, 2.025f);
            cwh0VarG6.o(0.0f, 1.124f, 0.47f, 1.973f);
            cwh0VarG6.o(0.47f, 0.848f, 1.258f, 1.298f);
            cwh0VarG6.o(0.787f, 0.45f, 1.728f, 0.45f);
            cwh0VarG6.o(0.847f, 0.0f, 1.41f, -0.378f);
            cwh0VarG6.g(0.382f, -0.26f, 0.583f, -0.453f, 0.705f, -0.786f);
            cwh0VarG6.v(0.99f);
            cwh0VarG6.i(1.76f);
            cwh0VarG6.v(-4.293f);
            cwh0VarG6.j(7.577f, 11.424f);
            cwh0VarG6.v(1.462f);
            cwh0VarG6.j(9.48f, 12.886f);
            cwh0VarG6.v(0.04f);
            cwh0VarG6.o(0.0f, 0.43f, -0.184f, 0.757f);
            cwh0VarG6.c(1.3f, 1.3f, false, true, -0.542f, 0.5f);
            cwh0VarG6.o(-0.348f, 0.175f, -0.849f, 0.174f);
            cwh0VarG6.o(-0.552f, 0.0f, -0.981f, -0.255f);
            cwh0VarG6.c(1.83f, 1.83f, false, true, -0.675f, -0.756f);
            cwh0VarG6.o(-0.245f, -0.501f, -0.245f, -1.217f);
            cwh0VarG6.o(0.0f, -0.726f, 0.235f, -1.237f);
            cwh0VarG6.o(0.246f, -0.522f, 0.664f, -0.787f);
            cwh0VarG6.o(0.43f, -0.267f, 0.972f, -0.266f);
            cwh0VarG6.o(0.368f, 0.0f, 0.644f, 0.102f);
            cwh0VarG6.o(0.286f, 0.093f, 0.47f, 0.277f);
            cwh0VarG6.o(0.194f, 0.173f, 0.276f, 0.398f);
            cwh0VarG6.j(11.3f, 10.616f);
            cwh0VarG6.c(2.5f, 2.5f, false, false, -0.573f, -1.217f);
            cwh0VarG6.c(2.9f, 2.9f, false, false, -1.165f, -0.828f);
            cwh0VarG6.o(-0.726f, -0.296f, -1.687f, -0.296f);
            cwh0VarG6.m(4.428f, 0.184f);
            cwh0VarG6.v(7.258f);
            cwh0VarG6.i(1.922f);
            rjx.u(cwh0VarG6, 14.225f, 8.459f, 15.308f, 8.459f);
            cwh0VarG6.v(7.258f);
            cwh0VarG6.i(1.922f);
            cwh0VarG6.v(-2.698f);
            cwh0VarG6.i(2.474f);
            cwh0VarG6.v(-1.534f);
            cwh0VarG6.j(17.23f, 11.485f);
            cwh0VarG6.v(-1.462f);
            ydh.k(cwh0VarG6, 20.0f, 10.023f, 20.0f, 8.46f);
            a180.a(a180Var4, cwh0VarG6.a, n6a1Var6, 1.0f, 2, 1.0f);
            b180VarB4 = a180Var4.b();
            fn31.f = b180VarB4;
        }
        c = new lnx(dsxVar, new dsx(b180VarB3, b180VarB4));
        CREATOR = new mmx((byte) 23);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof lnx);
    }

    public final int hashCode() {
        return -1525565873;
    }

    public final String toString() {
        return "Gif";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
