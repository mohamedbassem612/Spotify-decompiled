package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rox extends hux {
    public static final Parcelable.Creator<rox> CREATOR;
    public static final rox c;
    public static final byte d;

    static {
        b180 b180VarB = q1o1.d;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Medal16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarI = ydh.i(6.547f, 1.598f, 5.799f, 0.362f);
            cwh0VarI.b(0.75f, 0.75f, false, false, 5.157f, 0.0f);
            cwh0VarI.j(0.75f, 0.0f);
            cwh0VarI.c(0.75f, 0.75f, false, false, -0.64f, 1.138f);
            cwh0VarI.k(2.96f, 4.894f);
            cwh0VarI.c(7.0f, 7.0f, false, true, 1.182f, -0.945f);
            cwh0VarI.j(2.081f, 1.5f);
            cwh0VarI.i(2.653f);
            cwh0VarI.k(0.937f, 1.548f);
            cwh0VarI.e();
            cwh0VarI.l(6.684f, 6.175f);
            cwh0VarI.c(5.0f, 5.0f, true, false, 2.632f, 9.65f);
            cwh0VarI.c(5.0f, 5.0f, false, false, -2.632f, -9.65f);
            cwh0VarI.l(8.0f, 14.5f);
            cwh0VarI.c(3.5f, 3.5f, true, true, 0.0f, -7.0f);
            cwh0VarI.c(3.5f, 3.5f, false, true, 0.0f, 7.0f);
            cwh0VarI.l(9.637f, 4.192f);
            cwh0VarI.b(7.0f, 7.0f, false, false, 8.0f, 4.0f);
            cwh0VarI.j(10.201f, 0.362f);
            cwh0VarI.b(0.75f, 0.75f, false, true, 10.843f, 0.0f);
            cwh0VarI.i(4.407f);
            cwh0VarI.c(0.75f, 0.75f, false, true, 0.641f, 1.138f);
            cwh0VarI.k(-2.96f, 4.893f);
            cwh0VarI.c(7.0f, 7.0f, false, false, -1.182f, -0.944f);
            cwh0VarI.k(2.17f, -3.587f);
            cwh0VarI.i(-2.653f);
            cwh0VarI.k(-1.63f, 2.692f);
            cwh0VarI.e();
            a180.a(a180Var, cwh0VarI.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            q1o1.d = b180VarB;
        }
        b180 b180VarB2 = p2o1.c;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Medal24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarQ = rjx.q(4.685f, 4.0f, 2.224f, 4.078f);
            cwh0VarQ.b(9.0f, 9.0f, false, false, 5.363f, 9.42f);
            cwh0VarQ.k(-3.24f, -5.942f);
            cwh0VarQ.b(1.0f, 1.0f, false, true, 3.0f, 2.0f);
            cwh0VarQ.i(5.545f);
            cwh0VarQ.c(1.0f, 1.0f, false, true, 0.878f, 0.521f);
            cwh0VarQ.k(0.994f, 1.822f);
            cwh0VarQ.k(-1.089f, 2.18f);
            cwh0VarQ.j(7.952f, 4.0f);
            cwh0VarQ.e();
            cwh0VarQ.l(21.894f, 3.447f);
            cwh0VarQ.j(18.81f, 9.616f);
            cwh0VarQ.c(9.0f, 9.0f, false, false, -1.532f, -1.407f);
            cwh0VarQ.j(19.381f, 4.0f);
            cwh0VarQ.i(-3.764f);
            cwh0VarQ.k(-1.389f, 2.778f);
            cwh0VarQ.c(9.0f, 9.0f, false, false, -2.095f, -0.277f);
            cwh0VarQ.k(1.972f, -3.948f);
            cwh0VarQ.b(1.0f, 1.0f, false, true, 15.0f, 2.0f);
            cwh0VarQ.i(6.0f);
            cwh0VarQ.c(1.0f, 1.0f, false, true, 0.894f, 1.447f);
            cwh0VarQ.l(18.5f, 15.5f);
            cwh0VarQ.c(6.5f, 6.5f, true, true, -13.0f, 0.0f);
            cwh0VarQ.c(6.5f, 6.5f, false, true, 13.0f, 0.0f);
            cwh0VarQ.m(-2.0f, 0.0f);
            cwh0VarQ.c(4.5f, 4.5f, true, false, -9.0f, 0.0f);
            cwh0VarQ.c(4.5f, 4.5f, false, false, 9.0f, 0.0f);
            a180.a(a180Var2, cwh0VarQ.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            p2o1.c = b180VarB2;
        }
        dsx dsxVar = new dsx(b180VarB, b180VarB2);
        b180 b180VarB3 = u2o1.b;
        if (b180VarB3 == null) {
            a180 a180Var3 = new a180("Encore.Vector.MedalActive16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i3 = bui1.a;
            n6a1 n6a1Var3 = new n6a1(u7h.b);
            cwh0 cwh0VarI2 = ydh.i(6.547f, 1.598f, 5.799f, 0.362f);
            cwh0VarI2.b(0.75f, 0.75f, false, false, 5.157f, 0.0f);
            cwh0VarI2.j(0.75f, 0.0f);
            cwh0VarI2.c(0.75f, 0.75f, false, false, -0.64f, 1.138f);
            cwh0VarI2.k(2.96f, 4.894f);
            cwh0VarI2.g(0.44f, -0.437f, 0.936f, -0.815f, 1.479f, -1.123f);
            rjx.y(cwh0VarI2, 1.999f, -3.311f, 6.684f, 6.175f);
            cwh0VarI2.c(5.0f, 5.0f, true, false, 2.632f, 9.65f);
            cwh0VarI2.c(5.0f, 5.0f, false, false, -2.632f, -9.65f);
            cwh0VarI2.m(6.246f, -0.144f);
            cwh0VarI2.b(6.98f, 6.98f, false, false, 8.0f, 4.0f);
            cwh0VarI2.j(10.201f, 0.362f);
            cwh0VarI2.b(0.75f, 0.75f, false, true, 10.843f, 0.0f);
            cwh0VarI2.i(4.407f);
            cwh0VarI2.c(0.75f, 0.75f, false, true, 0.641f, 1.138f);
            cwh0VarI2.k(-2.96f, 4.893f);
            cwh0VarI2.e();
            a180.a(a180Var3, cwh0VarI2.a, n6a1Var3, 1.0f, 2, 1.0f);
            b180VarB3 = a180Var3.b();
            u2o1.b = b180VarB3;
        }
        b180 b180VarB4 = y2o1.c;
        if (b180VarB4 == null) {
            a180 a180Var4 = new a180("Encore.Vector.MedalActive24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i4 = bui1.a;
            n6a1 n6a1Var4 = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(9.211f, 9.627f);
            cwh0VarG.c(6.5f, 6.5f, false, false, -2.553f, 2.168f);
            cwh0VarG.c(6.5f, 6.5f, true, false, 2.553f, -2.168f);
            cwh0VarG.l(12.132f, 6.5f);
            cwh0VarG.c(8.98f, 8.98f, false, true, 6.678f, 3.116f);
            cwh0VarG.k(3.084f, -6.169f);
            cwh0VarG.b(1.0f, 1.0f, false, false, 21.0f, 2.0f);
            cwh0VarG.i(-6.0f);
            cwh0VarG.c(1.0f, 1.0f, false, false, -0.894f, 0.553f);
            cwh0VarG.e();
            cwh0VarG.l(5.363f, 9.421f);
            cwh0VarG.k(-3.24f, -5.942f);
            cwh0VarG.b(1.0f, 1.0f, false, true, 3.0f, 2.0f);
            cwh0VarG.i(5.545f);
            cwh0VarG.c(1.0f, 1.0f, false, true, 0.878f, 0.521f);
            cwh0VarG.k(0.994f, 1.822f);
            cwh0VarG.k(-1.315f, 2.634f);
            cwh0VarG.b(9.0f, 9.0f, false, false, 5.363f, 9.42f);
            cwh0VarG.e();
            a180.a(a180Var4, cwh0VarG.a, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB4 = a180Var4.b();
            y2o1.c = b180VarB4;
        }
        c = new rox(dsxVar, new dsx(b180VarB3, b180VarB4));
        d = (byte) 8;
        CREATOR = new snx((byte) 23);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof rox);
    }

    public final int hashCode() {
        return -1479532862;
    }

    public final String toString() {
        return "Medal";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
