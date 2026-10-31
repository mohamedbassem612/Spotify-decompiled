package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zlx extends hux {
    public static final Parcelable.Creator<zlx> CREATOR;
    public static final zlx c;
    public static final byte d;

    static {
        b180 b180VarB;
        b180 b180Var = tgp1.b;
        if (b180Var != null) {
            b180VarB = b180Var;
        } else {
            a180 a180Var = new a180("Encore.Vector.ConnectToDevices16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            long j = u7h.b;
            n6a1 n6a1Var = new n6a1(j);
            cwh0 cwh0VarG = lf51.g(6.0f, 2.75f);
            cwh0VarG.f(6.0f, 1.784f, 6.784f, 1.0f, 7.75f, 1.0f);
            cwh0VarG.i(6.5f);
            cwh0VarG.g(0.966f, 0.0f, 1.75f, 0.784f, 1.75f, 1.75f);
            cwh0VarG.v(10.5f);
            cwh0VarG.b(1.75f, 1.75f, false, true, 14.25f, 15.0f);
            cwh0VarG.i(-6.5f);
            cwh0VarG.b(1.75f, 1.75f, false, true, 6.0f, 13.25f);
            cwh0VarG.e();
            cwh0VarG.l(7.75f, 2.5f);
            cwh0VarG.c(0.25f, 0.25f, false, false, -0.25f, 0.25f);
            cwh0VarG.v(10.5f);
            cwh0VarG.g(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f);
            cwh0VarG.i(6.5f);
            cwh0VarG.c(0.25f, 0.25f, false, false, 0.25f, -0.25f);
            cwh0VarG.j(14.5f, 2.75f);
            cwh0VarG.c(0.25f, 0.25f, false, false, -0.25f, -0.25f);
            cwh0VarG.e();
            cwh0VarG.l(1.75f, 2.5f);
            cwh0VarG.c(0.25f, 0.25f, false, false, -0.25f, 0.25f);
            cwh0VarG.v(6.5f);
            cwh0VarG.g(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f);
            cwh0VarG.j(4.0f, 9.5f);
            cwh0VarG.j(4.0f, 11.0f);
            cwh0VarG.j(1.75f, 11.0f);
            cwh0VarG.b(1.75f, 1.75f, false, true, 0.0f, 9.25f);
            cwh0VarG.v(-6.5f);
            cwh0VarG.f(0.0f, 1.784f, 0.784f, 1.0f, 1.75f, 1.0f);
            cwh0VarG.j(4.0f, 1.0f);
            cwh0VarG.v(1.5f);
            cwh0VarG.e();
            cwh0VarG.l(4.0f, 15.0f);
            rjx.x(cwh0VarG, 2.0f, 15.0f, -1.5f, 2.0f);
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            n6a1 n6a1Var2 = new n6a1(j);
            ArrayList arrayList = new ArrayList(32);
            arrayList.add(new f9s0(13.0f, 10.0f));
            arrayList.add(new j9s0(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f));
            arrayList.add(new j9s0(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f));
            arrayList.add(new n9s0(-1.0f, -5.0f));
            arrayList.add(new j9s0(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f));
            arrayList.add(new j9s0(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f));
            a180.a(a180Var, arrayList, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            tgp1.b = b180VarB;
        }
        b180 b180VarB2 = xa4.c;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.ConnectToDevices24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            long j2 = u7h.b;
            n6a1 n6a1Var3 = new n6a1(j2);
            cwh0 cwh0VarG2 = lf51.g(10.0f, 19.0f);
            cwh0VarG2.c(3.0f, 3.0f, false, false, 3.0f, 3.0f);
            cwh0VarG2.i(8.0f);
            cwh0VarG2.c(3.0f, 3.0f, false, false, 3.0f, -3.0f);
            cwh0VarG2.j(24.0f, 5.0f);
            cwh0VarG2.c(3.0f, 3.0f, false, false, -3.0f, -3.0f);
            cwh0VarG2.i(-8.0f);
            cwh0VarG2.c(3.0f, 3.0f, false, false, -3.0f, 3.0f);
            cwh0VarG2.e();
            cwh0VarG2.l(13.0f, 20.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, -1.0f, -1.0f);
            cwh0VarG2.j(12.0f, 5.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 1.0f, -1.0f);
            cwh0VarG2.i(8.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 1.0f, 1.0f);
            cwh0VarG2.v(14.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, -1.0f, 1.0f);
            cwh0VarG2.e();
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var3, 1.0f, 2, 1.0f);
            n6a1 n6a1Var4 = new n6a1(j2);
            cwh0 cwh0VarG3 = lf51.g(18.25f, 7.25f);
            cwh0VarG3.c(1.25f, 1.25f, true, false, -2.5f, 0.0f);
            cwh0VarG3.c(1.25f, 1.25f, false, false, 2.5f, 0.0f);
            cwh0VarG3.l(17.0f, 16.0f);
            cwh0VarG3.c(1.5f, 1.5f, true, true, 0.0f, -3.0f);
            cwh0VarG3.c(1.5f, 1.5f, false, true, 0.0f, 3.0f);
            cwh0VarG3.m(-3.5f, -1.5f);
            cwh0VarG3.c(3.5f, 3.5f, true, false, 7.0f, 0.0f);
            cwh0VarG3.c(3.5f, 3.5f, false, false, -7.0f, 0.0f);
            cwh0VarG3.l(0.0f, 4.0f);
            cwh0VarG3.c(2.0f, 2.0f, false, true, 2.0f, -2.0f);
            rjx.w(cwh0VarG3, 5.0f, 2.0f, 2.0f, 4.0f);
            cwh0VarG3.v(11.0f);
            cwh0VarG3.i(5.0f);
            cwh0VarG3.v(2.0f);
            cwh0VarG3.j(2.0f, 17.0f);
            cwh0VarG3.c(2.0f, 2.0f, false, true, -2.0f, -2.0f);
            hrt.o(cwh0VarG3, 7.0f, 22.0f, 4.0f, 22.0f);
            cwh0VarG3.v(-2.0f);
            cwh0VarG3.i(3.0f);
            cwh0VarG3.e();
            a180.a(a180Var2, cwh0VarG3.a, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            xa4.c = b180VarB2;
        }
        c = new zlx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new hlx((byte) 17);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof zlx);
    }

    public final int hashCode() {
        return 528885613;
    }

    public final String toString() {
        return "ConnectToDevices";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
