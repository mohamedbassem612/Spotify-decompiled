package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zmx extends hux {
    public static final Parcelable.Creator<zmx> CREATOR;
    public static final zmx c;
    public static final byte d;

    static {
        b180 b180VarB = k1u.d;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Enhance16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(5.295f, 4.5f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.747f, 0.682f);
            cwh0VarG.g(0.06f, 0.65f, 0.334f, 1.68f, 0.954f, 2.572f);
            cwh0VarG.g(0.606f, 0.87f, 1.527f, 1.596f, 2.927f, 1.75f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.0f, 1.491f);
            cwh0VarG.g(-1.4f, 0.154f, -2.321f, 0.88f, -2.927f, 1.751f);
            cwh0VarG.c(5.7f, 5.7f, false, false, -0.954f, 2.572f);
            cwh0VarG.c(0.75f, 0.75f, false, true, -1.493f, 0.0f);
            cwh0VarG.c(5.7f, 5.7f, false, false, -0.954f, -2.572f);
            cwh0VarG.g(-0.606f, -0.87f, -1.527f, -1.597f, -2.927f, -1.75f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.0f, -1.492f);
            cwh0VarG.g(1.4f, -0.154f, 2.321f, -0.88f, 2.927f, -1.75f);
            cwh0VarG.g(0.62f, -0.892f, 0.894f, -1.922f, 0.954f, -2.572f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.746f, -0.682f);
            cwh0VarG.m(-2.2f, 5.75f);
            cwh0VarG.c(5.7f, 5.7f, false, true, 1.732f, 1.64f);
            cwh0VarG.o(0.266f, 0.386f, 0.468f, 0.785f);
            cwh0VarG.o(0.203f, -0.4f, 0.47f, -0.785f);
            cwh0VarG.c(5.7f, 5.7f, false, true, 1.73f, -1.64f);
            cwh0VarG.c(5.7f, 5.7f, false, true, -1.73f, -1.64f);
            cwh0VarG.c(7.0f, 7.0f, false, true, -0.47f, -0.785f);
            cwh0VarG.o(-0.202f, 0.4f, -0.468f, 0.785f);
            cwh0VarG.c(5.7f, 5.7f, false, true, -1.732f, 1.64f);
            cwh0VarG.m(5.884f, -6.448f);
            cwh0VarG.g(1.603f, -0.508f, 2.434f, -1.776f, 2.798f, -2.83f);
            cwh0VarG.g(0.04f, -0.114f, 0.406f, -0.114f, 0.446f, 0.0f);
            cwh0VarG.g(0.364f, 1.054f, 1.195f, 2.322f, 2.798f, 2.83f);
            cwh0VarG.g(0.115f, 0.036f, 0.115f, 0.36f, 0.0f, 0.396f);
            cwh0VarG.g(-1.603f, 0.508f, -2.434f, 1.775f, -2.798f, 2.83f);
            cwh0VarG.g(-0.04f, 0.114f, -0.406f, 0.114f, -0.446f, 0.0f);
            cwh0VarG.g(-0.364f, -1.055f, -1.195f, -2.322f, -2.798f, -2.83f);
            cwh0VarG.g(-0.115f, -0.036f, -0.115f, -0.36f, 0.0f, -0.396f);
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            k1u.d = b180VarB;
        }
        b180 b180VarB2 = b2u.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Enhance24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(10.0f, 1.5f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 0.995f, 0.906f);
            cwh0VarG2.g(0.123f, 1.289f, 0.685f, 3.314f, 1.963f, 5.078f);
            cwh0VarG2.g(1.257f, 1.734f, 3.197f, 3.21f, 6.147f, 3.521f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 0.0f, 1.99f);
            cwh0VarG2.g(-2.95f, 0.31f, -4.89f, 1.787f, -6.148f, 3.521f);
            cwh0VarG2.g(-1.277f, 1.764f, -1.84f, 3.789f, -1.962f, 5.078f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, -1.99f, 0.0f);
            cwh0VarG2.g(-0.123f, -1.289f, -0.685f, -3.315f, -1.962f, -5.078f);
            cwh0VarG2.g(-1.258f, -1.734f, -3.198f, -3.21f, -6.148f, -3.522f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 0.0f, -1.989f);
            cwh0VarG2.g(2.95f, -0.31f, 4.89f, -1.787f, 6.148f, -3.521f);
            cwh0VarG2.g(1.277f, -1.764f, 1.84f, -3.79f, 1.961f, -5.078f);
            cwh0VarG2.b(1.0f, 1.0f, false, true, 10.0f, 1.5f);
            cwh0VarG2.l(4.702f, 12.0f);
            cwh0VarG2.g(1.708f, 0.817f, 3.004f, 2.024f, 3.96f, 3.343f);
            cwh0VarG2.b(12.6f, 12.6f, false, true, 10.0f, 17.698f);
            cwh0VarG2.g(0.343f, -0.788f, 0.784f, -1.59f, 1.338f, -2.355f);
            cwh0VarG2.g(0.956f, -1.319f, 2.252f, -2.526f, 3.96f, -3.343f);
            cwh0VarG2.g(-1.708f, -0.817f, -3.005f, -2.024f, -3.96f, -3.343f);
            cwh0VarG2.b(12.6f, 12.6f, false, true, 10.0f, 6.301f);
            cwh0VarG2.c(12.6f, 12.6f, false, true, -1.338f, 2.356f);
            cwh0VarG2.f(7.706f, 9.976f, 6.41f, 11.183f, 4.702f, 12.0f);
            cwh0VarG2.m(12.277f, -8.198f);
            cwh0VarG2.g(1.602f, -0.508f, 2.434f, -1.776f, 2.798f, -2.83f);
            cwh0VarG2.g(0.04f, -0.114f, 0.406f, -0.114f, 0.446f, 0.0f);
            cwh0VarG2.g(0.364f, 1.054f, 1.196f, 2.322f, 2.798f, 2.83f);
            cwh0VarG2.g(0.115f, 0.036f, 0.115f, 0.36f, 0.0f, 0.396f);
            cwh0VarG2.g(-1.602f, 0.508f, -2.434f, 1.775f, -2.798f, 2.83f);
            cwh0VarG2.g(-0.04f, 0.114f, -0.406f, 0.114f, -0.446f, 0.0f);
            cwh0VarG2.g(-0.364f, -1.055f, -1.196f, -2.322f, -2.798f, -2.83f);
            cwh0VarG2.g(-0.115f, -0.036f, -0.115f, -0.36f, 0.0f, -0.396f);
            cwh0VarG2.l(21.5f, 19.597f);
            cwh0VarG2.c(1.5f, 1.5f, true, true, -3.0f, 0.0f);
            cwh0VarG2.c(1.5f, 1.5f, false, true, 3.0f, 0.0f);
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            b2u.b = b180VarB2;
        }
        dsx dsxVar = new dsx(b180VarB, b180VarB2);
        b180 b180VarB3 = h7w.b;
        if (b180VarB3 == null) {
            a180 a180Var3 = new a180("Encore.Vector.EnhanceActive16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i3 = bui1.a;
            n6a1 n6a1Var3 = new n6a1(u7h.b);
            cwh0 cwh0VarG3 = lf51.g(11.777f, 0.972f);
            cwh0VarG3.g(-0.364f, 1.054f, -1.195f, 2.322f, -2.798f, 2.83f);
            cwh0VarG3.g(-0.115f, 0.036f, -0.115f, 0.36f, 0.0f, 0.396f);
            cwh0VarG3.g(1.603f, 0.508f, 2.434f, 1.775f, 2.798f, 2.83f);
            cwh0VarG3.g(0.04f, 0.114f, 0.406f, 0.114f, 0.446f, 0.0f);
            cwh0VarG3.g(0.364f, -1.055f, 1.195f, -2.322f, 2.798f, -2.83f);
            cwh0VarG3.g(0.115f, -0.036f, 0.115f, -0.36f, 0.0f, -0.396f);
            cwh0VarG3.g(-1.603f, -0.508f, -2.434f, -1.776f, -2.798f, -2.83f);
            cwh0VarG3.g(-0.04f, -0.114f, -0.406f, -0.114f, -0.446f, 0.0f);
            cwh0VarG3.l(5.295f, 4.5f);
            cwh0VarG3.c(0.75f, 0.75f, false, true, 0.747f, 0.682f);
            cwh0VarG3.g(0.06f, 0.65f, 0.334f, 1.68f, 0.954f, 2.572f);
            cwh0VarG3.g(0.606f, 0.87f, 1.527f, 1.596f, 2.927f, 1.75f);
            cwh0VarG3.c(0.75f, 0.75f, false, true, 0.0f, 1.491f);
            cwh0VarG3.g(-1.4f, 0.154f, -2.321f, 0.88f, -2.927f, 1.751f);
            cwh0VarG3.c(5.7f, 5.7f, false, false, -0.954f, 2.572f);
            cwh0VarG3.c(0.75f, 0.75f, false, true, -1.493f, 0.0f);
            cwh0VarG3.c(5.7f, 5.7f, false, false, -0.954f, -2.572f);
            cwh0VarG3.g(-0.606f, -0.87f, -1.527f, -1.597f, -2.927f, -1.75f);
            cwh0VarG3.c(0.75f, 0.75f, false, true, 0.0f, -1.492f);
            cwh0VarG3.g(1.4f, -0.154f, 2.321f, -0.88f, 2.927f, -1.75f);
            cwh0VarG3.g(0.62f, -0.892f, 0.894f, -1.922f, 0.954f, -2.572f);
            cwh0VarG3.c(0.75f, 0.75f, false, true, 0.746f, -0.682f);
            a180.a(a180Var3, cwh0VarG3.a, n6a1Var3, 1.0f, 2, 1.0f);
            b180VarB3 = a180Var3.b();
            h7w.b = b180VarB3;
        }
        b180 b180VarB4 = lvx.b;
        if (b180VarB4 == null) {
            a180 a180Var4 = new a180("Encore.Vector.EnhanceActive24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i4 = bui1.a;
            n6a1 n6a1Var4 = new n6a1(u7h.b);
            cwh0 cwh0VarG4 = lf51.g(16.979f, 3.802f);
            cwh0VarG4.g(1.602f, -0.508f, 2.434f, -1.776f, 2.798f, -2.83f);
            cwh0VarG4.g(0.04f, -0.114f, 0.406f, -0.114f, 0.446f, 0.0f);
            cwh0VarG4.g(0.364f, 1.054f, 1.196f, 2.322f, 2.798f, 2.83f);
            cwh0VarG4.g(0.115f, 0.036f, 0.115f, 0.36f, 0.0f, 0.396f);
            cwh0VarG4.g(-1.602f, 0.508f, -2.434f, 1.775f, -2.798f, 2.83f);
            cwh0VarG4.g(-0.04f, 0.114f, -0.406f, 0.114f, -0.446f, 0.0f);
            cwh0VarG4.g(-0.364f, -1.055f, -1.196f, -2.322f, -2.798f, -2.83f);
            cwh0VarG4.g(-0.115f, -0.036f, -0.115f, -0.36f, 0.0f, -0.396f);
            cwh0VarG4.m(-5.984f, -1.396f);
            cwh0VarG4.c(1.0f, 1.0f, false, false, -1.99f, 0.0f);
            cwh0VarG4.f(8.881f, 3.695f, 8.32f, 5.72f, 7.042f, 7.484f);
            cwh0VarG4.g(-1.258f, 1.734f, -3.198f, 3.21f, -6.148f, 3.521f);
            cwh0VarG4.c(1.0f, 1.0f, false, false, 0.0f, 1.99f);
            cwh0VarG4.g(2.95f, 0.31f, 4.89f, 1.786f, 6.148f, 3.521f);
            cwh0VarG4.g(1.277f, 1.763f, 1.84f, 3.789f, 1.961f, 5.078f);
            cwh0VarG4.c(1.0f, 1.0f, false, false, 1.992f, 0.0f);
            cwh0VarG4.g(0.122f, -1.29f, 0.684f, -3.315f, 1.961f, -5.078f);
            cwh0VarG4.g(1.258f, -1.735f, 3.198f, -3.21f, 6.148f, -3.522f);
            cwh0VarG4.c(1.0f, 1.0f, false, false, 0.0f, -1.989f);
            cwh0VarG4.g(-2.95f, -0.31f, -4.89f, -1.787f, -6.148f, -3.521f);
            cwh0VarG4.g(-1.277f, -1.764f, -1.84f, -3.79f, -1.962f, -5.078f);
            cwh0VarG4.e();
            cwh0VarG4.l(20.0f, 21.097f);
            cwh0VarG4.c(1.5f, 1.5f, true, false, 0.0f, -3.0f);
            cwh0VarG4.c(1.5f, 1.5f, false, false, 0.0f, 3.0f);
            a180.a(a180Var4, cwh0VarG4.a, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB4 = a180Var4.b();
            lvx.b = b180VarB4;
        }
        c = new zmx(dsxVar, new dsx(b180VarB3, b180VarB4));
        d = (byte) 8;
        CREATOR = new mmx((byte) 11);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof zmx);
    }

    public final int hashCode() {
        return 1554361273;
    }

    public final String toString() {
        return "Enhance";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
