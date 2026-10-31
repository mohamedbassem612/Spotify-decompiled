package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dpx extends hux {
    public static final Parcelable.Creator<dpx> CREATOR;
    public static final dpx c;
    public static final byte d;

    static {
        b180 b180VarB = o0c.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Moon16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            int i2 = u7h.l;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(6.866f, 0.447f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.119f, 0.789f);
            cwh0VarG.c(6.3f, 6.3f, false, false, -0.526f, 2.538f);
            cwh0VarG.g(0.0f, 3.522f, 2.863f, 6.38f, 6.4f, 6.38f);
            cwh0VarG.g(0.575f, 0.0f, 1.13f, -0.075f, 1.659f, -0.216f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.88f, 1.024f);
            cwh0VarG.c(7.9f, 7.9f, false, true, -7.248f, 4.744f);
            cwh0VarG.g(-4.361f, 0.0f, -7.9f, -3.526f, -7.9f, -7.88f);
            cwh0VarG.g(0.0f, -3.65f, 2.484f, -6.715f, 5.854f, -7.614f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.762f, 0.235f);
            cwh0VarG.m(-1.75f, 1.759f);
            cwh0VarG.c(6.38f, 6.38f, false, false, -3.366f, 5.62f);
            cwh0VarG.g(0.0f, 3.521f, 2.863f, 6.38f, 6.4f, 6.38f);
            cwh0VarG.c(6.4f, 6.4f, false, false, 5.128f, -2.563f);
            cwh0VarG.c(8.0f, 8.0f, false, true, -0.42f, 0.011f);
            cwh0VarG.g(-4.36f, 0.0f, -7.9f, -3.526f, -7.9f, -7.88f);
            cwh0VarG.o(0.002f, -0.806f, 0.157f, -1.568f);
            cwh0VarG.e();
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            o0c.b = b180VarB;
        }
        b180 b180VarB2 = u890.f;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Moon24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i3 = bui1.a;
            int i4 = u7h.l;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(11.18f, 1.506f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 0.125f, 1.063f);
            cwh0VarG2.c(8.7f, 8.7f, false, false, -0.855f, 3.776f);
            cwh0VarG2.c(8.735f, 8.735f, false, false, 10.829f, 8.482f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 1.14f, 1.404f);
            cwh0VarG2.c(10.74f, 10.74f, false, true, -9.683f, 6.094f);
            cwh0VarG2.g(-5.928f, 0.0f, -10.734f, -4.806f, -10.734f, -10.735f);
            cwh0VarG2.g(0.0f, -5.043f, 3.477f, -9.272f, 8.163f, -10.424f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 1.015f, 0.34f);
            cwh0VarG2.m(-2.43f, 2.31f);
            cwh0VarG2.c(8.735f, 8.735f, true, false, 10.787f, 13.258f);
            cwh0VarG2.c(10.0f, 10.0f, false, true, -0.352f, 0.006f);
            cwh0VarG2.g(-5.929f, 0.0f, -10.735f, -4.807f, -10.735f, -10.735f);
            cwh0VarG2.g(0.0f, -0.87f, 0.104f, -1.718f, 0.3f, -2.529f);
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            u890.f = b180VarB2;
        }
        dsx dsxVar = new dsx(b180VarB, b180VarB2);
        b180 b180VarB3 = gho1.c;
        if (b180VarB3 == null) {
            a180 a180Var3 = new a180("Encore.Vector.MoonActive16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i5 = bui1.a;
            long j = u7h.b;
            n6a1 n6a1Var3 = new n6a1(j);
            cwh0 cwh0VarG3 = lf51.g(6.64f, 0.51f);
            cwh0VarG3.c(0.75f, 0.75f, false, false, -0.784f, -0.228f);
            cwh0VarG3.f(2.614f, 1.262f, 0.25f, 4.267f, 0.25f, 7.825f);
            cwh0VarG3.g(0.0f, 4.355f, 3.539f, 7.881f, 7.9f, 7.881f);
            cwh0VarG3.c(7.9f, 7.9f, false, false, 7.163f, -4.553f);
            cwh0VarG3.c(0.75f, 0.75f, false, false, -0.897f, -1.036f);
            cwh0VarG3.c(6.4f, 6.4f, false, true, -1.86f, 0.274f);
            cwh0VarG3.g(-3.536f, 0.0f, -6.4f, -2.859f, -6.4f, -6.381f);
            cwh0VarG3.g(0.0f, -0.963f, 0.214f, -1.875f, 0.596f, -2.692f);
            cwh0VarG3.b(0.75f, 0.75f, false, false, 6.64f, 0.509f);
            cwh0VarG3.e();
            cwh0VarG3.l(4.828f, 2.37f);
            cwh0VarG3.b(6.37f, 6.37f, false, false, 1.75f, 7.825f);
            cwh0VarG3.g(0.0f, 3.522f, 2.863f, 6.381f, 6.4f, 6.381f);
            cwh0VarG3.c(6.4f, 6.4f, false, false, 4.948f, -2.333f);
            cwh0VarG3.c(8.0f, 8.0f, false, true, -0.541f, 0.018f);
            cwh0VarG3.g(-4.361f, 0.0f, -7.9f, -3.527f, -7.9f, -7.881f);
            cwh0VarG3.o(0.002f, -0.844f, 0.171f, -1.64f);
            a180.a(a180Var3, cwh0VarG3.a, n6a1Var3, 1.0f, 2, 1.0f);
            n6a1 n6a1Var4 = new n6a1(j);
            ArrayList arrayList = new ArrayList(32);
            arrayList.add(new f9s0(14.633f, 10.835f));
            arrayList.add(new j9s0(7.2f, 7.2f, 0.0f, false, true, -2.076f, 0.306f));
            arrayList.add(new k9s0(-3.95f, 0.0f, -7.15f, -3.193f, -7.15f, -7.131f));
            arrayList.add(new k9s0(0.0f, -1.076f, 0.239f, -2.095f, 0.666f, -3.01f));
            arrayList.add(new c9s0(3.137f, 1.887f, 1.0f, 4.607f, 1.0f, 7.825f));
            arrayList.add(new k9s0(0.0f, 3.938f, 3.201f, 7.131f, 7.15f, 7.131f));
            arrayList.add(new j9s0(7.15f, 7.15f, 0.0f, false, false, 6.483f, -4.12f));
            arrayList.add(b9s0.c);
            a180.a(a180Var3, arrayList, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB3 = a180Var3.b();
            gho1.c = b180VarB3;
        }
        b180 b180VarB4 = iho1.l;
        if (b180VarB4 == null) {
            a180 a180Var4 = new a180("Encore.Vector.MoonActive24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i6 = bui1.a;
            n6a1 n6a1Var5 = new n6a1(u7h.b);
            cwh0 cwh0VarG4 = lf51.g(10.999f, 2.674f);
            cwh0VarG4.c(1.0f, 1.0f, false, false, -1.154f, -1.429f);
            cwh0VarG4.f(5.321f, 2.507f, 2.0f, 6.658f, 2.0f, 11.587f);
            cwh0VarG4.g(0.0f, 5.928f, 4.806f, 10.735f, 10.735f, 10.735f);
            cwh0VarG4.g(4.128f, 0.0f, 7.71f, -2.331f, 9.506f, -5.744f);
            cwh0VarG4.c(1.0f, 1.0f, false, false, -1.154f, -1.428f);
            cwh0VarG4.c(8.7f, 8.7f, false, true, -2.352f, 0.32f);
            cwh0VarG4.b(8.735f, 8.735f, false, true, 10.0f, 6.735f);
            cwh0VarG4.g(0.0f, -1.468f, 0.361f, -2.849f, 0.999f, -4.06f);
            cwh0VarG4.e();
            a180.a(a180Var4, cwh0VarG4.a, n6a1Var5, 1.0f, 2, 1.0f);
            b180VarB4 = a180Var4.b();
            iho1.l = b180VarB4;
        }
        c = new dpx(dsxVar, new dsx(b180VarB3, b180VarB4));
        d = (byte) 8;
        CREATOR = new yox((byte) 4);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof dpx);
    }

    public final int hashCode() {
        return -47716906;
    }

    public final String toString() {
        return "Moon";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
