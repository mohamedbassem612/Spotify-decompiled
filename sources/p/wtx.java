package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wtx extends hux {
    public static final Parcelable.Creator<wtx> CREATOR;
    public static final wtx c;
    public static final byte d;

    static {
        b180 b180VarB = mym.c;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.VerifiedCheck16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            long j = u7h.b;
            n6a1 n6a1Var = new n6a1(j);
            ArrayList arrayList = new ArrayList(32);
            arrayList.add(new f9s0(11.658f, 6.492f));
            arrayList.add(new j9s0(0.75f, 0.75f, 0.0f, false, false, -1.06f, -1.06f));
            arrayList.add(new e9s0(6.647f, 9.38f));
            arrayList.add(new e9s0(5.446f, 8.177f));
            arrayList.add(new j9s0(0.75f, 0.75f, 0.0f, true, false, -1.06f, 1.06f));
            arrayList.add(new m9s0(2.263f, 2.265f));
            arrayList.add(b9s0.c);
            a180.a(a180Var, arrayList, n6a1Var, 1.0f, 2, 1.0f);
            n6a1 n6a1Var2 = new n6a1(j);
            cwh0 cwh0VarG = lf51.g(8.866f, 0.406f);
            cwh0VarG.c(1.18f, 1.18f, false, false, -1.69f, 0.0f);
            cwh0VarG.j(5.561f, 2.06f);
            cwh0VarG.k(-2.312f, -0.027f);
            cwh0VarG.c(1.18f, 1.18f, false, false, -1.195f, 1.195f);
            cwh0VarG.j(2.08f, 5.54f);
            cwh0VarG.j(0.427f, 7.155f);
            cwh0VarG.c(1.18f, 1.18f, false, false, 0.0f, 1.69f);
            cwh0VarG.j(2.08f, 10.46f);
            cwh0VarG.k(-0.027f, 2.313f);
            cwh0VarG.c(1.18f, 1.18f, false, false, 1.195f, 1.194f);
            cwh0VarG.k(2.312f, -0.027f);
            cwh0VarG.k(1.615f, 1.654f);
            cwh0VarG.c(1.18f, 1.18f, false, false, 1.69f, 0.0f);
            cwh0VarG.k(1.615f, -1.654f);
            cwh0VarG.k(2.312f, 0.027f);
            cwh0VarG.c(1.18f, 1.18f, false, false, 1.195f, -1.194f);
            cwh0VarG.k(-0.027f, -2.313f);
            cwh0VarG.k(1.654f, -1.615f);
            cwh0VarG.c(1.18f, 1.18f, false, false, 0.0f, -1.69f);
            cwh0VarG.j(13.961f, 5.54f);
            cwh0VarG.k(0.027f, -2.312f);
            cwh0VarG.c(1.18f, 1.18f, false, false, -1.195f, -1.195f);
            rjx.y(cwh0VarG, -2.312f, 0.027f, 6.538f, 3.206f);
            cwh0VarG.j(8.021f, 1.688f);
            cwh0VarG.j(9.504f, 3.206f);
            cwh0VarG.g(0.225f, 0.231f, 0.536f, 0.36f, 0.859f, 0.356f);
            cwh0VarG.k(2.122f, -0.025f);
            cwh0VarG.k(-0.026f, 2.122f);
            cwh0VarG.c(1.18f, 1.18f, false, false, 0.356f, 0.858f);
            cwh0VarG.j(14.333f, 8.0f);
            cwh0VarG.k(-1.518f, 1.483f);
            cwh0VarG.c(1.18f, 1.18f, false, false, -0.356f, 0.859f);
            cwh0VarG.k(0.026f, 2.121f);
            cwh0VarG.k(-2.122f, -0.025f);
            cwh0VarG.c(1.18f, 1.18f, false, false, -0.86f, 0.356f);
            cwh0VarG.k(-1.482f, 1.518f);
            cwh0VarG.k(-1.483f, -1.518f);
            cwh0VarG.c(1.18f, 1.18f, false, false, -0.859f, -0.356f);
            cwh0VarG.k(-2.122f, 0.025f);
            cwh0VarG.k(0.026f, -2.121f);
            cwh0VarG.c(1.18f, 1.18f, false, false, -0.356f, -0.86f);
            cwh0VarG.j(1.709f, 8.0f);
            cwh0VarG.k(1.518f, -1.483f);
            cwh0VarG.c(1.18f, 1.18f, false, false, 0.356f, -0.858f);
            cwh0VarG.k(-0.026f, -2.122f);
            cwh0VarG.k(2.122f, 0.025f);
            cwh0VarG.c(1.18f, 1.18f, false, false, 0.86f, -0.356f);
            cwh0VarG.e();
            a180.a(a180Var, cwh0VarG.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            mym.c = b180VarB;
        }
        b180 b180VarB2 = bin.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.VerifiedCheck24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            long j2 = u7h.b;
            n6a1 n6a1Var3 = new n6a1(j2);
            cwh0 cwh0VarI = ydh.i(12.0f, 2.147f, 9.63f, 4.574f);
            cwh0VarI.c(1.66f, 1.66f, false, true, -1.206f, 0.5f);
            cwh0VarI.k(-3.39f, -0.04f);
            cwh0VarI.k(0.04f, 3.39f);
            cwh0VarI.g(0.005f, 0.454f, -0.176f, 0.89f, -0.5f, 1.207f);
            cwh0VarI.j(2.147f, 12.0f);
            cwh0VarI.k(2.427f, 2.37f);
            cwh0VarI.g(0.324f, 0.316f, 0.505f, 0.752f, 0.5f, 1.206f);
            cwh0VarI.k(-0.04f, 3.39f);
            cwh0VarI.k(3.39f, -0.04f);
            cwh0VarI.g(0.454f, -0.005f, 0.89f, 0.176f, 1.207f, 0.5f);
            cwh0VarI.j(12.0f, 21.853f);
            cwh0VarI.k(2.37f, -2.427f);
            cwh0VarI.c(1.66f, 1.66f, false, true, 1.206f, -0.5f);
            cwh0VarI.k(3.39f, 0.04f);
            cwh0VarI.k(-0.04f, -3.39f);
            cwh0VarI.g(-0.005f, -0.454f, 0.176f, -0.89f, 0.5f, -1.207f);
            cwh0VarI.j(21.853f, 12.0f);
            cwh0VarI.k(-2.427f, -2.37f);
            cwh0VarI.c(1.66f, 1.66f, false, true, -0.5f, -1.206f);
            cwh0VarI.k(0.04f, -3.39f);
            cwh0VarI.k(-3.39f, 0.04f);
            cwh0VarI.c(1.66f, 1.66f, false, true, -1.207f, -0.5f);
            cwh0VarI.e();
            cwh0VarI.l(10.814f, 0.5f);
            cwh0VarI.c(1.66f, 1.66f, false, true, 2.372f, 0.0f);
            cwh0VarI.k(2.512f, 2.572f);
            cwh0VarI.k(3.595f, -0.043f);
            cwh0VarI.c(1.66f, 1.66f, false, true, 1.678f, 1.678f);
            cwh0VarI.k(-0.043f, 3.595f);
            cwh0VarI.k(2.572f, 2.512f);
            cwh0VarI.g(0.667f, 0.65f, 0.667f, 1.722f, 0.0f, 2.372f);
            cwh0VarI.k(-2.572f, 2.512f);
            cwh0VarI.k(0.043f, 3.595f);
            cwh0VarI.c(1.66f, 1.66f, false, true, -1.678f, 1.678f);
            cwh0VarI.k(-3.595f, -0.043f);
            cwh0VarI.k(-2.512f, 2.572f);
            cwh0VarI.c(1.66f, 1.66f, false, true, -2.372f, 0.0f);
            cwh0VarI.k(-2.512f, -2.572f);
            cwh0VarI.k(-3.595f, 0.043f);
            cwh0VarI.c(1.66f, 1.66f, false, true, -1.678f, -1.678f);
            cwh0VarI.k(0.043f, -3.595f);
            cwh0VarI.j(0.5f, 13.186f);
            cwh0VarI.c(1.66f, 1.66f, false, true, 0.0f, -2.372f);
            cwh0VarI.k(2.572f, -2.512f);
            cwh0VarI.k(-0.043f, -3.595f);
            cwh0VarI.c(1.66f, 1.66f, false, true, 1.678f, -1.678f);
            cwh0VarI.k(3.595f, 0.043f);
            cwh0VarI.e();
            a180.a(a180Var2, cwh0VarI.a, n6a1Var3, 1.0f, 2, 1.0f);
            n6a1 n6a1Var4 = new n6a1(j2);
            ArrayList arrayList2 = new ArrayList(32);
            arrayList2.add(new f9s0(17.398f, 8.207f));
            arrayList2.add(new j9s0(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.414f));
            arrayList2.add(new m9s0(-7.425f, 7.425f));
            arrayList2.add(new m9s0(-3.308f, -3.308f));
            arrayList2.add(new j9s0(1.0f, 1.0f, 0.0f, false, true, 1.414f, -1.414f));
            arrayList2.add(new m9s0(1.894f, 1.894f));
            arrayList2.add(new m9s0(6.011f, -6.011f));
            arrayList2.add(new j9s0(1.0f, 1.0f, 0.0f, false, true, 1.414f, 0.0f));
            a180.a(a180Var2, arrayList2, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            bin.b = b180VarB2;
        }
        dsx dsxVar = new dsx(b180VarB, b180VarB2);
        b180 b180VarB3 = kkn.d;
        if (b180VarB3 == null) {
            a180 a180Var3 = new a180("Encore.Vector.VerifiedCheckActive16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i3 = bui1.a;
            n6a1 n6a1Var5 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(7.155f, 0.406f);
            cwh0VarG2.c(1.18f, 1.18f, false, true, 1.69f, 0.0f);
            cwh0VarG2.j(10.46f, 2.06f);
            cwh0VarG2.k(2.312f, -0.027f);
            cwh0VarG2.c(1.18f, 1.18f, false, true, 1.195f, 1.194f);
            cwh0VarG2.j(13.94f, 5.54f);
            cwh0VarG2.k(1.654f, 1.615f);
            cwh0VarG2.c(1.18f, 1.18f, false, true, 0.0f, 1.69f);
            cwh0VarG2.j(13.94f, 10.46f);
            cwh0VarG2.k(0.027f, 2.312f);
            cwh0VarG2.c(1.18f, 1.18f, false, true, -1.195f, 1.195f);
            cwh0VarG2.k(-2.312f, -0.027f);
            cwh0VarG2.k(-1.615f, 1.654f);
            cwh0VarG2.c(1.18f, 1.18f, false, true, -1.69f, 0.0f);
            cwh0VarG2.j(5.54f, 13.94f);
            cwh0VarG2.k(-2.312f, 0.027f);
            cwh0VarG2.c(1.18f, 1.18f, false, true, -1.195f, -1.195f);
            cwh0VarG2.k(0.027f, -2.312f);
            cwh0VarG2.j(0.406f, 8.845f);
            cwh0VarG2.c(1.18f, 1.18f, false, true, 0.0f, -1.69f);
            cwh0VarG2.j(2.06f, 5.54f);
            cwh0VarG2.k(-0.027f, -2.313f);
            cwh0VarG2.c(1.18f, 1.18f, false, true, 1.195f, -1.194f);
            rjx.y(cwh0VarG2, 2.312f, 0.027f, 11.658f, 6.473f);
            cwh0VarG2.c(0.75f, 0.75f, false, false, -1.06f, -1.06f);
            cwh0VarG2.j(6.647f, 9.36f);
            cwh0VarG2.j(5.446f, 8.157f);
            cwh0VarG2.c(0.75f, 0.75f, true, false, -1.06f, 1.06f);
            cwh0VarG2.k(2.264f, 2.265f);
            cwh0VarG2.e();
            a180.a(a180Var3, cwh0VarG2.a, n6a1Var5, 1.0f, 2, 1.0f);
            b180VarB3 = a180Var3.b();
            kkn.d = b180VarB3;
        }
        b180 b180VarB4 = nln.d;
        if (b180VarB4 == null) {
            a180 a180Var4 = new a180("Encore.Vector.VerifiedCheckActive24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i4 = bui1.a;
            n6a1 n6a1Var6 = new n6a1(u7h.b);
            cwh0 cwh0VarG3 = lf51.g(10.814f, 0.5f);
            cwh0VarG3.c(1.66f, 1.66f, false, true, 2.372f, 0.0f);
            cwh0VarG3.k(2.512f, 2.572f);
            cwh0VarG3.k(3.595f, -0.043f);
            cwh0VarG3.c(1.66f, 1.66f, false, true, 1.678f, 1.678f);
            cwh0VarG3.k(-0.043f, 3.595f);
            cwh0VarG3.k(2.572f, 2.512f);
            cwh0VarG3.g(0.667f, 0.65f, 0.667f, 1.722f, 0.0f, 2.372f);
            cwh0VarG3.k(-2.572f, 2.512f);
            cwh0VarG3.k(0.043f, 3.595f);
            cwh0VarG3.c(1.66f, 1.66f, false, true, -1.678f, 1.678f);
            cwh0VarG3.k(-3.595f, -0.043f);
            cwh0VarG3.k(-2.512f, 2.572f);
            cwh0VarG3.c(1.66f, 1.66f, false, true, -2.372f, 0.0f);
            cwh0VarG3.k(-2.512f, -2.572f);
            cwh0VarG3.k(-3.595f, 0.043f);
            cwh0VarG3.c(1.66f, 1.66f, false, true, -1.678f, -1.678f);
            cwh0VarG3.k(0.043f, -3.595f);
            cwh0VarG3.j(0.5f, 13.186f);
            cwh0VarG3.c(1.66f, 1.66f, false, true, 0.0f, -2.372f);
            cwh0VarG3.k(2.572f, -2.512f);
            cwh0VarG3.k(-0.043f, -3.595f);
            cwh0VarG3.c(1.66f, 1.66f, false, true, 1.678f, -1.678f);
            rjx.y(cwh0VarG3, 3.595f, 0.043f, 17.398f, 9.62f);
            cwh0VarG3.c(1.0f, 1.0f, false, false, -1.414f, -1.413f);
            cwh0VarG3.k(-6.011f, 6.01f);
            cwh0VarG3.k(-1.894f, -1.893f);
            cwh0VarG3.c(1.0f, 1.0f, false, false, -1.414f, 1.414f);
            cwh0VarG3.k(3.308f, 3.308f);
            cwh0VarG3.e();
            a180.a(a180Var4, cwh0VarG3.a, n6a1Var6, 1.0f, 2, 1.0f);
            b180VarB4 = a180Var4.b();
            nln.d = b180VarB4;
        }
        c = new wtx(dsxVar, new dsx(b180VarB3, b180VarB4));
        d = (byte) 8;
        CREATOR = new utx((byte) 1);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof wtx);
    }

    public final int hashCode() {
        return 288524267;
    }

    public final String toString() {
        return "VerifiedCheck";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
