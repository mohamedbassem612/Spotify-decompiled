package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ynx extends hux {
    public static final Parcelable.Creator<ynx> CREATOR;
    public static final ynx c;
    public static final byte d;

    static {
        b180 b180VarB;
        b180 b180Var = men1.b;
        if (b180Var != null) {
            b180VarB = b180Var;
        } else {
            a180 a180Var = new a180("Encore.Vector.HelpCircle16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            long j = u7h.b;
            n6a1 n6a1Var = new n6a1(j);
            ArrayList arrayList = new ArrayList(32);
            arrayList.add(new f9s0(8.0f, 1.5f));
            arrayList.add(new j9s0(6.5f, 6.5f, 0.0f, true, false, 0.0f, 13.0f));
            arrayList.add(new j9s0(6.5f, 6.5f, 0.0f, false, false, 0.0f, -13.0f));
            arrayList.add(new f9s0(0.0f, 8.0f));
            arrayList.add(new j9s0(8.0f, 8.0f, 0.0f, true, true, 16.0f, 0.0f));
            arrayList.add(new a9s0(8.0f, 8.0f, 0.0f, false, true, 0.0f, 8.0f));
            a180.a(a180Var, arrayList, n6a1Var, 1.0f, 2, 1.0f);
            n6a1 n6a1Var2 = new n6a1(j);
            cwh0 cwh0Var = new cwh0();
            cwh0Var.l(7.25f, 12.026f);
            cwh0Var.v(-1.5f);
            cwh0Var.i(1.5f);
            cwh0Var.v(1.5f);
            cwh0Var.e();
            cwh0Var.l(8.134f, 4.93f);
            cwh0Var.b(1.125f, 1.125f, false, false, 7.06f, 6.39f);
            cwh0Var.k(-1.431f, 0.448f);
            cwh0Var.c(2.625f, 2.625f, true, true, 5.13f, -0.784f);
            cwh0Var.g(0.0f, 0.54f, -0.156f, 1.015f, -0.503f, 1.488f);
            cwh0Var.g(-0.3f, 0.408f, -0.7f, 0.652f, -0.973f, 0.818f);
            cwh0Var.k(-0.112f, 0.068f);
            cwh0Var.g(-0.185f, 0.116f, -0.26f, 0.203f, -0.302f, 0.283f);
            cwh0Var.g(-0.046f, 0.087f, -0.097f, 0.245f, -0.097f, 0.57f);
            cwh0Var.i(-1.5f);
            cwh0Var.g(0.0f, -0.47f, 0.072f, -0.898f, 0.274f, -1.277f);
            cwh0Var.g(0.206f, -0.385f, 0.507f, -0.645f, 0.827f, -0.846f);
            cwh0Var.k(0.147f, -0.092f);
            cwh0Var.g(0.285f, -0.177f, 0.413f, -0.257f, 0.526f, -0.41f);
            cwh0Var.g(0.169f, -0.23f, 0.213f, -0.397f, 0.213f, -0.602f);
            cwh0Var.g(0.0f, -0.622f, -0.503f, -1.125f, -1.125f, -1.125f);
            cwh0Var.e();
            a180.a(a180Var, cwh0Var.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            men1.b = b180VarB;
        }
        b180 b180VarB2 = kln1.a;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.HelpCircle24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            long j2 = u7h.b;
            n6a1 n6a1Var3 = new n6a1(j2);
            ArrayList arrayList2 = new ArrayList(32);
            arrayList2.add(new f9s0(12.0f, 3.0f));
            arrayList2.add(new j9s0(9.0f, 9.0f, 0.0f, true, false, 0.0f, 18.0f));
            arrayList2.add(new j9s0(9.0f, 9.0f, 0.0f, false, false, 0.0f, -18.0f));
            arrayList2.add(new f9s0(1.0f, 12.0f));
            arrayList2.add(new c9s0(1.0f, 5.925f, 5.925f, 1.0f, 12.0f, 1.0f));
            arrayList2.add(new p9s0(11.0f, 4.925f, 11.0f, 11.0f));
            arrayList2.add(new p9s0(-4.925f, 11.0f, -11.0f, 11.0f));
            arrayList2.add(new h9s0(1.0f, 18.075f, 1.0f, 12.0f));
            a180.a(a180Var2, arrayList2, n6a1Var3, 1.0f, 2, 1.0f);
            n6a1 n6a1Var4 = new n6a1(j2);
            cwh0 cwh0VarG = lf51.g(12.162f, 8.0f);
            cwh0VarG.c(1.72f, 1.72f, false, false, -1.643f, 2.235f);
            cwh0VarG.k(-1.909f, 0.597f);
            cwh0VarG.c(3.72f, 3.72f, true, true, 7.273f, -1.111f);
            cwh0VarG.g(0.0f, 0.763f, -0.22f, 1.435f, -0.714f, 2.107f);
            cwh0VarG.g(-0.423f, 0.577f, -0.987f, 0.92f, -1.385f, 1.162f);
            cwh0VarG.k(-0.164f, 0.101f);
            cwh0VarG.g(-0.277f, 0.174f, -0.398f, 0.31f, -0.47f, 0.444f);
            cwh0VarG.g(-0.076f, 0.143f, -0.15f, 0.388f, -0.15f, 0.87f);
            cwh0VarG.u(15.0f);
            cwh0VarG.i(-2.0f);
            cwh0VarG.v(-0.596f);
            cwh0VarG.g(0.0f, -0.675f, 0.102f, -1.279f, 0.386f, -1.812f);
            cwh0VarG.g(0.29f, -0.541f, 0.713f, -0.907f, 1.17f, -1.194f);
            cwh0VarG.k(0.212f, -0.133f);
            cwh0VarG.g(0.412f, -0.256f, 0.614f, -0.382f, 0.788f, -0.62f);
            cwh0VarG.g(0.255f, -0.347f, 0.327f, -0.608f, 0.327f, -0.925f);
            cwh0VarG.g(0.0f, -0.95f, -0.77f, -1.72f, -1.72f, -1.72f);
            hrt.u(cwh0VarG, 11.0f, 19.0f, -2.0f, 2.0f);
            cwh0VarG.v(2.0f);
            cwh0VarG.e();
            a180.a(a180Var2, cwh0VarG.a, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            kln1.a = b180VarB2;
            b180VarB = b180VarB;
        }
        dsx dsxVar = new dsx(b180VarB, b180VarB2);
        b180 b180VarB3 = nmn1.a;
        if (b180VarB3 == null) {
            a180 a180Var3 = new a180("Encore.Vector.HelpCircleActive16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i3 = bui1.a;
            n6a1 n6a1Var5 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(0.0f, 8.0f);
            cwh0VarG2.c(8.0f, 8.0f, true, true, 16.0f, 0.0f);
            cwh0VarG2.b(8.0f, 8.0f, false, true, 0.0f, 8.0f);
            cwh0VarG2.m(7.01f, -1.945f);
            cwh0VarG2.c(1.125f, 1.125f, false, true, 2.25f, 0.0f);
            cwh0VarG2.g(0.0f, 0.205f, -0.045f, 0.372f, -0.214f, 0.601f);
            cwh0VarG2.g(-0.113f, 0.154f, -0.24f, 0.234f, -0.526f, 0.411f);
            cwh0VarG2.k(-0.147f, 0.092f);
            cwh0VarG2.g(-0.32f, 0.201f, -0.62f, 0.46f, -0.827f, 0.846f);
            cwh0VarG2.g(-0.202f, 0.379f, -0.274f, 0.806f, -0.274f, 1.277f);
            cwh0VarG2.i(1.5f);
            cwh0VarG2.g(0.0f, -0.325f, 0.05f, -0.483f, 0.097f, -0.57f);
            cwh0VarG2.g(0.043f, -0.08f, 0.117f, -0.167f, 0.302f, -0.283f);
            cwh0VarG2.k(0.112f, -0.068f);
            cwh0VarG2.g(0.273f, -0.166f, 0.674f, -0.41f, 0.973f, -0.818f);
            cwh0VarG2.g(0.347f, -0.473f, 0.503f, -0.948f, 0.503f, -1.488f);
            cwh0VarG2.c(2.625f, 2.625f, true, false, -5.13f, 0.784f);
            cwh0VarG2.j(7.06f, 6.39f);
            cwh0VarG2.c(1.1f, 1.1f, false, true, -0.05f, -0.336f);
            hrt.u(cwh0VarG2, 7.25f, 10.525f, 1.5f, 1.5f);
            cwh0VarG2.v(-1.5f);
            cwh0VarG2.e();
            a180.a(a180Var3, cwh0VarG2.a, n6a1Var5, 1.0f, 2, 1.0f);
            b180VarB3 = a180Var3.b();
            nmn1.a = b180VarB3;
        }
        b180 b180VarB4 = lnn1.b;
        if (b180VarB4 == null) {
            a180 a180Var4 = new a180("Encore.Vector.HelpCircleActive24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i4 = bui1.a;
            n6a1 n6a1Var6 = new n6a1(u7h.b);
            cwh0 cwh0VarG3 = lf51.g(1.0f, 12.0f);
            cwh0VarG3.f(1.0f, 5.925f, 5.925f, 1.0f, 12.0f, 1.0f);
            cwh0VarG3.q(11.0f, 4.925f, 11.0f, 11.0f);
            cwh0VarG3.q(-4.925f, 11.0f, -11.0f, 11.0f);
            cwh0VarG3.p(1.0f, 18.075f, 1.0f, 12.0f);
            cwh0VarG3.m(9.441f, -2.28f);
            cwh0VarG3.c(1.72f, 1.72f, false, true, 3.442f, 0.0f);
            cwh0VarG3.g(0.0f, 0.317f, -0.072f, 0.578f, -0.327f, 0.926f);
            cwh0VarG3.g(-0.174f, 0.237f, -0.376f, 0.363f, -0.788f, 0.619f);
            cwh0VarG3.k(-0.213f, 0.133f);
            cwh0VarG3.g(-0.456f, 0.287f, -0.88f, 0.653f, -1.169f, 1.194f);
            cwh0VarG3.g(-0.284f, 0.533f, -0.387f, 1.137f, -0.387f, 1.812f);
            cwh0VarG3.u(15.0f);
            cwh0VarG3.i(2.0f);
            cwh0VarG3.v(-0.595f);
            cwh0VarG3.g(0.0f, -0.481f, 0.075f, -0.726f, 0.151f, -0.87f);
            cwh0VarG3.g(0.072f, -0.133f, 0.193f, -0.27f, 0.47f, -0.443f);
            cwh0VarG3.k(0.164f, -0.1f);
            cwh0VarG3.g(0.398f, -0.243f, 0.962f, -0.586f, 1.385f, -1.163f);
            cwh0VarG3.g(0.494f, -0.672f, 0.714f, -1.344f, 0.714f, -2.108f);
            cwh0VarG3.c(3.72f, 3.72f, true, false, -7.273f, 1.112f);
            cwh0VarG3.k(1.91f, -0.597f);
            cwh0VarG3.c(1.7f, 1.7f, false, true, -0.079f, -0.515f);
            hrt.u(cwh0VarG3, 11.0f, 17.0f, 2.0f, 2.0f);
            cwh0VarG3.v(-2.0f);
            cwh0VarG3.e();
            a180.a(a180Var4, cwh0VarG3.a, n6a1Var6, 1.0f, 2, 1.0f);
            b180VarB4 = a180Var4.b();
            lnn1.b = b180VarB4;
        }
        c = new ynx(dsxVar, new dsx(b180VarB3, b180VarB4));
        d = (byte) 8;
        CREATOR = new snx((byte) 5);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ynx);
    }

    public final int hashCode() {
        return -1984120186;
    }

    public final String toString() {
        return "HelpCircle";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
