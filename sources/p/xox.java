package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xox extends hux {
    public static final Parcelable.Creator<xox> CREATOR;
    public static final xox c;
    public static final byte d;

    static {
        b180 b180VarB = l6o1.a;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Microphone16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(13.426f, 2.574f);
            cwh0VarG.c(2.83f, 2.83f, false, false, -4.797f, 1.55f);
            cwh0VarG.k(3.247f, 3.247f);
            cwh0VarG.c(2.831f, 2.831f, false, false, 1.55f, -4.797f);
            cwh0VarG.l(7.881f, 5.498f);
            cwh0VarG.j(2.065f, 12.12f);
            cwh0VarG.c(1.287f, 1.287f, false, false, 1.816f, 1.816f);
            rjx.y(cwh0VarG, 6.62f, -5.817f, 7.12f, 4.094f);
            cwh0VarG.c(4.331f, 4.331f, true, true, 4.786f, 4.786f);
            cwh0VarG.k(-7.034f, 6.182f);
            cwh0VarG.c(2.787f, 2.787f, false, true, -3.933f, -3.933f);
            cwh0VarG.e();
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            l6o1.a = b180VarB;
        }
        b180 b180VarB2 = xfo1.a;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Microphone24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(19.61f, 4.391f);
            cwh0VarG2.c(4.0f, 4.0f, false, false, -6.782f, 2.214f);
            cwh0VarG2.k(4.568f, 4.568f);
            cwh0VarG2.c(4.0f, 4.0f, false, false, 2.214f, -6.781f);
            hrt.o(cwh0VarG2, 15.562f, 12.167f, 11.834f, 8.439f);
            cwh0VarG2.j(3.679f, 17.719f);
            cwh0VarG2.c(1.844f, 1.844f, false, false, 2.602f, 2.602f);
            cwh0VarG2.e();
            cwh0VarG2.l(10.817f, 6.567f);
            cwh0VarG2.c(6.0f, 6.0f, true, true, 6.617f, 6.617f);
            cwh0VarG2.k(-9.832f, 8.64f);
            cwh0VarG2.c(3.844f, 3.844f, false, true, -5.425f, -5.425f);
            cwh0VarG2.e();
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            xfo1.a = b180VarB2;
        }
        dsx dsxVar = new dsx(b180VarB, b180VarB2);
        b180 b180VarB3 = ago1.b;
        if (b180VarB3 == null) {
            a180 a180Var3 = new a180("Encore.Vector.MicrophoneActive16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i3 = bui1.a;
            n6a1 n6a1Var3 = new n6a1(u7h.b);
            cwh0 cwh0VarG3 = lf51.g(9.44f, 0.891f);
            cwh0VarG3.c(4.26f, 4.26f, true, true, 3.171f, 7.895f);
            cwh0VarG3.k(-5.4f, -5.4f);
            cwh0VarG3.b(4.26f, 4.26f, false, true, 9.44f, 0.891f);
            cwh0VarG3.l(6.489f, 5.492f);
            cwh0VarG3.k(-5.412f, 6.157f);
            cwh0VarG3.b(2.318f, 2.318f, false, false, 4.35f, 14.92f);
            cwh0VarG3.k(6.156f, -5.412f);
            cwh0VarG3.e();
            a180.a(a180Var3, cwh0VarG3.a, n6a1Var3, 1.0f, 2, 1.0f);
            b180VarB3 = a180Var3.b();
            ago1.b = b180VarB3;
        }
        b180 b180VarB4 = dgo1.a;
        if (b180VarB4 == null) {
            a180 a180Var4 = new a180("Encore.Vector.MicrophoneActive24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i4 = bui1.a;
            n6a1 n6a1Var4 = new n6a1(u7h.b);
            ArrayList arrayList = new ArrayList(32);
            arrayList.add(new n9s0(16.537f, 13.114f));
            arrayList.add(new m9s0(-5.65f, -5.65f));
            arrayList.add(new e9s0(2.0f, 17.577f));
            arrayList.add(new a9s0(3.134f, 3.134f, 0.0f, false, false, 6.423f, 22.0f));
            b9s0 b9s0Var = b9s0.c;
            arrayList.add(b9s0Var);
            arrayList.add(new f9s0(11.87f, 5.62f));
            arrayList.add(new j9s0(5.511f, 5.511f, 0.0f, true, true, 6.51f, 6.51f));
            arrayList.add(b9s0Var);
            a180.a(a180Var4, arrayList, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB4 = a180Var4.b();
            dgo1.a = b180VarB4;
        }
        c = new xox(dsxVar, new dsx(b180VarB3, b180VarB4));
        d = (byte) 8;
        CREATOR = new snx((byte) 29);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof xox);
    }

    public final int hashCode() {
        return -1366093761;
    }

    public final String toString() {
        return "Microphone";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
