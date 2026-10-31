package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class epx extends hux {
    public static final Parcelable.Creator<epx> CREATOR;
    public static final epx c;

    static {
        b180 b180VarB = nho1.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.MoonOff16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(6.866f, 0.447f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.119f, 0.789f);
            cwh0VarG.c(6.3f, 6.3f, false, false, -0.526f, 2.538f);
            cwh0VarG.g(0.0f, 1.305f, 0.393f, 2.52f, 1.068f, 3.53f);
            cwh0VarG.k(6.187f, -6.186f);
            cwh0VarG.c(0.744f, 0.744f, false, true, 1.051f, 1.052f);
            cwh0VarG.j(2.1f, 14.836f);
            cwh0VarG.c(0.744f, 0.744f, false, true, -1.052f, -1.052f);
            cwh0VarG.k(0.98f, -0.979f);
            cwh0VarG.b(7.83f, 7.83f, false, true, 0.25f, 7.826f);
            cwh0VarG.g(0.0f, -3.65f, 2.484f, -6.715f, 5.854f, -7.614f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.762f, 0.235f);
            cwh0VarG.m(-3.772f, 11.29f);
            cwh0VarG.k(3.355f, -3.355f);
            cwh0VarG.c(7.83f, 7.83f, false, true, -1.491f, -4.608f);
            cwh0VarG.o(0.002f, -0.806f, 0.157f, -1.567f);
            cwh0VarG.b(6.38f, 6.38f, false, false, 1.75f, 7.826f);
            cwh0VarG.c(6.34f, 6.34f, false, false, 1.344f, 3.912f);
            hrt.o(cwh0VarG, 8.768f, 10.517f, 9.868f, 9.417f);
            cwh0VarG.g(0.893f, 0.47f, 1.91f, 0.737f, 2.991f, 0.737f);
            cwh0VarG.g(0.575f, 0.0f, 1.13f, -0.075f, 1.659f, -0.216f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.88f, 1.024f);
            cwh0VarG.c(7.9f, 7.9f, false, true, -7.248f, 4.744f);
            cwh0VarG.c(7.9f, 7.9f, false, true, -3.67f, -0.9f);
            cwh0VarG.k(1.124f, -1.125f);
            cwh0VarG.g(0.78f, 0.338f, 1.64f, 0.525f, 2.546f, 0.525f);
            cwh0VarG.c(6.4f, 6.4f, false, false, 5.128f, -2.563f);
            cwh0VarG.c(7.9f, 7.9f, false, true, -4.51f, -1.126f);
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            nho1.b = b180VarB;
        }
        b180 b180VarB2 = ila0.h;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.MoonOff24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            int i3 = u7h.l;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(22.23f, 1.412f);
            cwh0VarG2.c(1.0f, 1.0f, false, false, -1.413f, 0.0f);
            cwh0VarG2.k(-9.235f, 9.235f);
            cwh0VarG2.c(8.74f, 8.74f, false, true, -1.132f, -4.302f);
            cwh0VarG2.c(8.7f, 8.7f, false, true, 0.855f, -3.776f);
            cwh0VarG2.c(1.0f, 1.0f, false, false, -1.14f, -1.403f);
            cwh0VarG2.f(5.48f, 2.318f, 2.002f, 6.547f, 2.002f, 11.59f);
            cwh0VarG2.g(0.0f, 2.43f, 0.807f, 4.67f, 2.167f, 6.47f);
            cwh0VarG2.j(1.81f, 20.418f);
            cwh0VarG2.c(1.0f, 1.0f, true, false, 1.414f, 1.414f);
            cwh0VarG2.j(22.232f, 2.826f);
            cwh0VarG2.c(1.0f, 1.0f, false, false, 0.0f, -1.414f);
            cwh0VarG2.e();
            cwh0VarG2.l(10.125f, 12.105f);
            cwh0VarG2.k(-4.519f, 4.518f);
            cwh0VarG2.b(8.734f, 8.734f, false, true, 8.75f, 3.816f);
            cwh0VarG2.g(-0.196f, 0.811f, -0.3f, 1.66f, -0.3f, 2.53f);
            cwh0VarG2.g(0.0f, 2.118f, 0.614f, 4.094f, 1.674f, 5.758f);
            hrt.o(cwh0VarG2, 13.09f, 15.183f, 14.533f, 13.74f);
            cwh0VarG2.c(8.74f, 8.74f, false, false, 6.746f, 1.087f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 1.14f, 1.404f);
            cwh0VarG2.c(10.74f, 10.74f, false, true, -9.683f, 6.094f);
            cwh0VarG2.g(-1.951f, 0.0f, -3.78f, -0.52f, -5.357f, -1.43f);
            cwh0VarG2.k(1.482f, -1.483f);
            cwh0VarG2.k(0.136f, 0.066f);
            cwh0VarG2.c(8.736f, 8.736f, false, false, 10.54f, -2.404f);
            cwh0VarG2.c(10.7f, 10.7f, false, true, -6.447f, -1.891f);
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            ila0.h = b180VarB2;
        }
        c = new epx(new dsx(b180VarB, b180VarB2), null);
        CREATOR = new yox((byte) 5);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof epx);
    }

    public final int hashCode() {
        return 99907513;
    }

    public final String toString() {
        return "MoonOff";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
