package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vpx extends hux {
    public static final Parcelable.Creator<vpx> CREATOR;
    public static final vpx c;
    public static final byte d;

    static {
        b180 b180VarB = poo1.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.PictureInPicture16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            long j = u7h.b;
            n6a1 n6a1Var = new n6a1(j);
            cwh0 cwh0VarG = lf51.g(16.0f, 2.45f);
            cwh0VarG.g(0.0f, -0.8f, -0.65f, -1.45f, -1.45f, -1.45f);
            cwh0VarG.h(1.45f);
            cwh0VarG.f(0.65f, 1.0f, 0.0f, 1.65f, 0.0f, 2.45f);
            cwh0VarG.v(11.1f);
            cwh0VarG.f(0.0f, 14.35f, 0.65f, 15.0f, 1.45f, 15.0f);
            cwh0VarG.i(5.557f);
            cwh0VarG.v(-1.5f);
            cwh0VarG.h(1.5f);
            cwh0VarG.v(-11.0f);
            cwh0VarG.i(13.0f);
            cwh0VarG.u(7.0f);
            cwh0VarG.h(16.0f);
            cwh0VarG.e();
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            n6a1 n6a1Var2 = new n6a1(j);
            cwh0 cwh0VarG2 = lf51.g(15.25f, 9.007f);
            cwh0VarG2.c(0.75f, 0.75f, false, true, 0.75f, 0.75f);
            cwh0VarG2.v(4.493f);
            cwh0VarG2.c(0.75f, 0.75f, false, true, -0.75f, 0.75f);
            cwh0VarG2.h(9.325f);
            cwh0VarG2.c(0.75f, 0.75f, false, true, -0.75f, -0.75f);
            cwh0VarG2.u(9.757f);
            cwh0VarG2.c(0.75f, 0.75f, false, true, 0.75f, -0.75f);
            cwh0VarG2.e();
            a180.a(a180Var, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            poo1.b = b180VarB;
        }
        b180 b180VarB2 = too1.a;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.PictureInPicture24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            long j2 = u7h.b;
            n6a1 n6a1Var3 = new n6a1(j2);
            cwh0 cwh0VarG3 = lf51.g(1.0f, 19.0f);
            cwh0VarG3.c(2.0f, 2.0f, false, false, 2.0f, 2.0f);
            cwh0VarG3.i(8.17f);
            cwh0VarG3.g(-0.11f, -0.313f, -0.17f, -0.65f, -0.17f, -1.0f);
            cwh0VarG3.v(-1.0f);
            cwh0VarG3.h(3.0f);
            cwh0VarG3.u(5.0f);
            cwh0VarG3.i(18.0f);
            cwh0VarG3.v(7.0f);
            cwh0VarG3.i(1.0f);
            cwh0VarG3.g(0.35f, 0.0f, 0.687f, 0.06f, 1.0f, 0.17f);
            cwh0VarG3.u(5.0f);
            cwh0VarG3.c(2.0f, 2.0f, false, false, -2.0f, -2.0f);
            cwh0VarG3.h(3.0f);
            cwh0VarG3.c(2.0f, 2.0f, false, false, -2.0f, 2.0f);
            cwh0VarG3.e();
            a180.a(a180Var2, cwh0VarG3.a, n6a1Var3, 1.0f, 2, 1.0f);
            n6a1 n6a1Var4 = new n6a1(j2);
            cwh0 cwh0VarG4 = lf51.g(14.0f, 21.0f);
            cwh0VarG4.c(1.0f, 1.0f, false, true, -1.0f, -1.0f);
            cwh0VarG4.v(-5.0f);
            cwh0VarG4.c(1.0f, 1.0f, false, true, 1.0f, -1.0f);
            cwh0VarG4.i(8.0f);
            cwh0VarG4.c(1.0f, 1.0f, false, true, 1.0f, 1.0f);
            cwh0VarG4.v(5.0f);
            cwh0VarG4.c(1.0f, 1.0f, false, true, -1.0f, 1.0f);
            cwh0VarG4.e();
            a180.a(a180Var2, cwh0VarG4.a, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            too1.a = b180VarB2;
        }
        c = new vpx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new yox((byte) 22);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof vpx);
    }

    public final int hashCode() {
        return -112371696;
    }

    public final String toString() {
        return "PictureInPicture";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
