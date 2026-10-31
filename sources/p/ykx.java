package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ykx extends hux {
    public static final Parcelable.Creator<ykx> CREATOR;
    public static final ykx c;

    static {
        b180 b180VarB;
        b180 b180Var;
        b180 b180Var2 = f5p1.a;
        if (b180Var2 != null) {
            b180VarB = b180Var2;
        } else {
            a180 a180Var = new a180("Encore.Vector.Browse16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            long j = u7h.b;
            n6a1 n6a1Var = new n6a1(j);
            cwh0 cwh0VarG = lf51.g(0.404f, 6.278f);
            cwh0VarG.b(0.75f, 0.75f, false, true, 0.987f, 6.0f);
            cwh0VarG.i(14.0f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.733f, 0.906f);
            cwh0VarG.k(-1.81f, 8.5f);
            cwh0VarG.c(0.75f, 0.75f, false, true, -0.733f, 0.594f);
            cwh0VarG.h(2.797f);
            cwh0VarG.c(0.75f, 0.75f, false, true, -0.734f, -0.594f);
            cwh0VarG.k(-1.81f, -8.5f);
            cwh0VarG.c(0.75f, 0.75f, false, true, 0.15f, -0.628f);
            cwh0VarG.e();
            cwh0VarG.l(1.914f, 7.5f);
            cwh0VarG.k(1.49f, 7.0f);
            cwh0VarG.i(9.166f);
            cwh0VarG.k(1.49f, -7.0f);
            cwh0VarG.e();
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            n6a1 n6a1Var2 = new n6a1(j);
            cwh0 cwh0VarG2 = lf51.g(9.987f, 11.0f);
            cwh0VarG2.g(0.0f, 0.736f, -0.896f, 1.333f, -2.0f, 1.333f);
            cwh0VarG2.q(-2.0f, -0.597f, -2.0f, -1.333f);
            cwh0VarG2.q(0.895f, -1.333f, 2.0f, -1.333f);
            cwh0VarG2.q(2.0f, 0.597f, 2.0f, 1.333f);
            cwh0VarG2.l(2.0f, 1.25f);
            cwh0VarG2.b(0.75f, 0.75f, false, true, 2.75f, 0.5f);
            cwh0VarG2.i(10.5f);
            cwh0VarG2.c(0.75f, 0.75f, false, true, 0.75f, 0.75f);
            cwh0VarG2.u(4.0f);
            cwh0VarG2.i(-1.5f);
            cwh0VarG2.u(2.0f);
            cwh0VarG2.i(-9.0f);
            cwh0VarG2.v(2.0f);
            cwh0VarG2.h(2.0f);
            cwh0VarG2.e();
            a180.a(a180Var, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            f5p1.a = b180VarB;
        }
        b180 b180VarB2 = h5p1.a;
        if (b180VarB2 != null) {
            b180Var = b180VarB;
        } else {
            a180 a180Var2 = new a180("Encore.Vector.Browse24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            long j2 = u7h.b;
            n6a1 n6a1Var3 = new n6a1(j2);
            ArrayList arrayList = new ArrayList(32);
            arrayList.add(new f9s0(15.0f, 15.5f));
            arrayList.add(new k9s0(0.0f, 1.105f, -1.343f, 2.0f, -3.0f, 2.0f));
            arrayList.add(new p9s0(-3.0f, -0.895f, -3.0f, -2.0f));
            arrayList.add(new p9s0(1.343f, -2.0f, 3.0f, -2.0f));
            arrayList.add(new p9s0(3.0f, 0.895f, 3.0f, 2.0f));
            a180.a(a180Var2, arrayList, n6a1Var3, 1.0f, 2, 1.0f);
            n6a1 n6a1Var4 = new n6a1(j2);
            cwh0 cwh0VarG3 = lf51.g(1.513f, 9.37f);
            cwh0VarG3.b(1.0f, 1.0f, false, true, 2.291f, 9.0f);
            cwh0VarG3.i(19.418f);
            cwh0VarG3.c(1.0f, 1.0f, false, true, 0.979f, 1.208f);
            cwh0VarG3.k(-2.339f, 11.0f);
            cwh0VarG3.c(1.0f, 1.0f, false, true, -0.978f, 0.792f);
            cwh0VarG3.h(4.63f);
            cwh0VarG3.c(1.0f, 1.0f, false, true, -0.978f, -0.792f);
            cwh0VarG3.k(-2.339f, -11.0f);
            cwh0VarG3.c(1.0f, 1.0f, false, true, 0.201f, -0.837f);
            cwh0VarG3.e();
            cwh0VarG3.l(3.525f, 11.0f);
            cwh0VarG3.k(1.913f, 9.0f);
            cwh0VarG3.i(13.123f);
            cwh0VarG3.k(1.913f, -9.0f);
            cwh0VarG3.e();
            cwh0VarG3.l(4.0f, 2.0f);
            cwh0VarG3.c(1.0f, 1.0f, false, true, 1.0f, -1.0f);
            cwh0VarG3.i(14.0f);
            cwh0VarG3.c(1.0f, 1.0f, false, true, 1.0f, 1.0f);
            cwh0VarG3.v(4.0f);
            cwh0VarG3.i(-2.0f);
            cwh0VarG3.u(3.0f);
            cwh0VarG3.h(6.0f);
            cwh0VarG3.v(3.0f);
            cwh0VarG3.h(4.0f);
            cwh0VarG3.e();
            a180.a(a180Var2, cwh0VarG3.a, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            h5p1.a = b180VarB2;
            b180Var = b180VarB;
        }
        dsx dsxVar = new dsx(b180Var, b180VarB2);
        b180 b180VarB3 = k5p1.a;
        if (b180VarB3 == null) {
            a180 a180Var3 = new a180("Encore.Vector.BrowseActive16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i3 = bui1.a;
            n6a1 n6a1Var5 = new n6a1(u7h.b);
            cwh0 cwh0VarG4 = lf51.g(2.0f, 1.2f);
            cwh0VarG4.c(0.7f, 0.7f, false, true, 0.7f, -0.7f);
            cwh0VarG4.i(10.6f);
            cwh0VarG4.c(0.7f, 0.7f, false, true, 0.7f, 0.7f);
            cwh0VarG4.u(4.0f);
            cwh0VarG4.h(2.0f);
            cwh0VarG4.e();
            cwh0VarG4.l(0.987f, 6.0f);
            cwh0VarG4.c(0.75f, 0.75f, false, false, -0.734f, 0.906f);
            cwh0VarG4.k(1.81f, 8.5f);
            cwh0VarG4.c(0.75f, 0.75f, false, false, 0.733f, 0.594f);
            cwh0VarG4.i(10.38f);
            cwh0VarG4.c(0.75f, 0.75f, false, false, 0.734f, -0.594f);
            cwh0VarG4.k(1.81f, -8.5f);
            cwh0VarG4.b(0.75f, 0.75f, false, false, 14.987f, 6.0f);
            cwh0VarG4.e();
            cwh0VarG4.l(8.0f, 13.0f);
            cwh0VarG4.g(-1.657f, 0.0f, -3.0f, -0.895f, -3.0f, -2.0f);
            cwh0VarG4.q(1.343f, -2.0f, 3.0f, -2.0f);
            cwh0VarG4.q(3.0f, 0.895f, 3.0f, 2.0f);
            cwh0VarG4.q(-1.343f, 2.0f, -3.0f, 2.0f);
            a180.a(a180Var3, cwh0VarG4.a, n6a1Var5, 1.0f, 2, 1.0f);
            b180VarB3 = a180Var3.b();
            k5p1.a = b180VarB3;
        }
        b180 b180VarB4 = t5p1.a;
        if (b180VarB4 == null) {
            a180 a180Var4 = new a180("Encore.Vector.BrowseActive24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i4 = bui1.a;
            n6a1 n6a1Var6 = new n6a1(u7h.b);
            cwh0 cwh0VarG5 = lf51.g(4.0f, 2.0f);
            cwh0VarG5.c(1.0f, 1.0f, false, true, 1.0f, -1.0f);
            cwh0VarG5.i(14.0f);
            cwh0VarG5.c(1.0f, 1.0f, false, true, 1.0f, 1.0f);
            cwh0VarG5.v(4.0f);
            cwh0VarG5.h(4.0f);
            cwh0VarG5.e();
            cwh0VarG5.l(1.513f, 9.37f);
            cwh0VarG5.b(1.0f, 1.0f, false, true, 2.291f, 9.0f);
            cwh0VarG5.h(21.71f);
            cwh0VarG5.c(1.0f, 1.0f, false, true, 0.978f, 1.208f);
            cwh0VarG5.k(-2.17f, 10.208f);
            cwh0VarG5.b(2.0f, 2.0f, false, true, 18.562f, 22.0f);
            cwh0VarG5.h(5.438f);
            cwh0VarG5.c(2.0f, 2.0f, false, true, -1.956f, -1.584f);
            cwh0VarG5.k(-2.17f, -10.208f);
            cwh0VarG5.c(1.0f, 1.0f, false, true, 0.201f, -0.837f);
            cwh0VarG5.e();
            cwh0VarG5.l(12.0f, 17.834f);
            cwh0VarG5.g(1.933f, 0.0f, 3.5f, -1.044f, 3.5f, -2.333f);
            cwh0VarG5.q(-1.567f, -2.333f, -3.5f, -2.333f);
            cwh0VarG5.p(8.5f, 14.21f, 8.5f, 15.5f);
            cwh0VarG5.q(1.567f, 2.333f, 3.5f, 2.333f);
            cwh0VarG5.e();
            a180.a(a180Var4, cwh0VarG5.a, n6a1Var6, 1.0f, 2, 1.0f);
            b180VarB4 = a180Var4.b();
            t5p1.a = b180VarB4;
        }
        c = new ykx(dsxVar, new dsx(b180VarB3, b180VarB4));
        CREATOR = new ckx((byte) 21);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ykx);
    }

    public final int hashCode() {
        return 1076555807;
    }

    public final String toString() {
        return "Browse";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
