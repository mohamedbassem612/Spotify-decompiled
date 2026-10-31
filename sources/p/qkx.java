package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qkx extends hux {
    public static final Parcelable.Creator<qkx> CREATOR;
    public static final qkx c;
    public static final byte d;

    static {
        b180 b180VarB = t2p1.a;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.AudiobookAuthor16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            long j = u7h.b;
            n6a1 n6a1Var = new n6a1(j);
            cwh0 cwh0Var = new cwh0();
            cwh0Var.l(13.5f, 12.525f);
            cwh0Var.u(6.874f);
            cwh0Var.k(1.5f, -1.5f);
            cwh0Var.v(8.65f);
            cwh0Var.i(-3.45f);
            cwh0Var.b(5.3f, 5.3f, false, false, 8.0f, 15.382f);
            cwh0Var.k(-0.5f, 0.447f);
            cwh0Var.k(-0.5f, -0.447f);
            cwh0Var.c(5.3f, 5.3f, false, false, -3.55f, -1.356f);
            cwh0Var.h(0.0f);
            cwh0Var.u(1.013f);
            cwh0Var.i(3.45f);
            cwh0Var.g(1.516f, 0.0f, 2.917f, 0.495f, 4.05f, 1.331f);
            cwh0Var.c(6.8f, 6.8f, false, true, 4.05f, -1.33f);
            cwh0Var.i(1.446f);
            cwh0Var.k(-1.5f, 1.5f);
            cwh0Var.b(5.3f, 5.3f, false, false, 8.25f, 3.658f);
            cwh0Var.v(9.715f);
            cwh0Var.c(6.8f, 6.8f, false, true, 3.3f, -0.85f);
            rjx.t(cwh0Var, 1.95f, 6.75f, 3.659f);
            cwh0Var.c(5.3f, 5.3f, false, false, -3.3f, -1.146f);
            cwh0Var.h(1.5f);
            cwh0Var.v(10.012f);
            cwh0Var.i(1.95f);
            cwh0Var.c(6.8f, 6.8f, false, true, 3.3f, 0.85f);
            cwh0Var.u(3.658f);
            cwh0Var.e();
            a180.a(a180Var, cwh0Var.a, n6a1Var, 1.0f, 2, 1.0f);
            n6a1 n6a1Var2 = new n6a1(j);
            ArrayList arrayList = new ArrayList(32);
            arrayList.add(new n9s0(9.66f, 7.513f));
            arrayList.add(new m9s0(1.287f, -0.465f));
            arrayList.add(new k9s0(0.15f, -0.055f, 0.288f, -0.142f, 0.402f, -0.256f));
            arrayList.add(new m9s0(4.45f, -4.45f));
            arrayList.add(new j9s0(0.684f, 0.684f, 0.0f, true, false, -0.967f, -0.968f));
            arrayList.add(new m9s0(-4.451f, 4.45f));
            arrayList.add(new k9s0(-0.114f, 0.114f, -0.2f, 0.251f, -0.255f, 0.403f));
            arrayList.add(b9s0.c);
            a180.a(a180Var, arrayList, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            t2p1.a = b180VarB;
        }
        b180 b180VarB2 = u2p1.a;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.AudiobookAuthor24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            long j2 = u7h.b;
            n6a1 n6a1Var3 = new n6a1(j2);
            cwh0 cwh0Var2 = new cwh0();
            cwh0Var2.l(20.0f, 13.432f);
            cwh0Var2.u(19.0f);
            cwh0Var2.i(-3.0f);
            cwh0Var2.g(-1.82f, 0.0f, -3.53f, 0.487f, -5.0f, 1.338f);
            cwh0Var2.u(6.755f);
            cwh0Var2.b(7.96f, 7.96f, false, true, 16.983f, 5.0f);
            cwh0Var2.k(2.0f, -2.0f);
            cwh0Var2.h(17.0f);
            cwh0Var2.c(9.96f, 9.96f, false, false, -6.0f, 2.0f);
            cwh0Var2.c(9.96f, 9.96f, false, false, -6.0f, -2.0f);
            cwh0Var2.h(0.0f);
            cwh0Var2.v(18.0f);
            cwh0Var2.i(5.0f);
            cwh0Var2.g(2.05f, 0.0f, 3.917f, 0.77f, 5.333f, 2.037f);
            cwh0Var2.k(0.667f, 0.597f);
            cwh0Var2.k(0.667f, -0.597f);
            cwh0Var2.b(7.97f, 7.97f, false, true, 17.0f, 21.0f);
            cwh0Var2.i(5.0f);
            cwh0Var2.v(-9.568f);
            cwh0Var2.e();
            cwh0Var2.l(10.0f, 6.755f);
            cwh0Var2.v(13.583f);
            cwh0Var2.b(9.96f, 9.96f, false, false, 5.0f, 19.0f);
            cwh0Var2.h(2.0f);
            cwh0Var2.u(5.0f);
            cwh0Var2.i(3.0f);
            cwh0Var2.c(7.96f, 7.96f, false, true, 5.0f, 1.755f);
            a180.a(a180Var2, cwh0Var2.a, n6a1Var3, 1.0f, 2, 1.0f);
            n6a1 n6a1Var4 = new n6a1(j2);
            cwh0 cwh0VarQ = rjx.q(14.293f, 13.414f, 1.97f, -0.712f);
            cwh0VarQ.g(0.23f, -0.083f, 0.44f, -0.217f, 0.615f, -0.39f);
            cwh0VarQ.k(6.815f, -6.816f);
            cwh0VarQ.c(1.048f, 1.048f, false, false, -1.482f, -1.482f);
            cwh0VarQ.k(-6.815f, 6.815f);
            cwh0VarQ.c(1.7f, 1.7f, false, false, -0.391f, 0.616f);
            cwh0VarQ.k(-0.712f, 1.97f);
            cwh0VarQ.e();
            a180.a(a180Var2, cwh0VarQ.a, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            u2p1.a = b180VarB2;
        }
        c = new qkx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new ckx((byte) 13);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof qkx);
    }

    public final int hashCode() {
        return 337226805;
    }

    public final String toString() {
        return "AudiobookAuthor";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
