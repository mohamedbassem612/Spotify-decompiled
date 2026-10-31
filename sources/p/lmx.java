package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lmx extends hux {
    public static final Parcelable.Creator<lmx> CREATOR;
    public static final lmx c;
    public static final byte d;

    static {
        b180 b180VarB = d7e.a;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.DeviceSpeaker16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            long j = u7h.b;
            n6a1 n6a1Var = new n6a1(j);
            ArrayList arrayList = new ArrayList(32);
            arrayList.add(new f9s0(8.0f, 6.438f));
            arrayList.add(new k9s0(0.552f, 0.0f, 1.0f, -0.434f, 1.0f, -0.969f));
            arrayList.add(new h9s0(8.552f, 4.5f, 8.0f, 4.5f));
            arrayList.add(new p9s0(-1.0f, 0.434f, -1.0f, 0.969f));
            arrayList.add(new p9s0(0.448f, 0.969f, 1.0f, 0.969f));
            arrayList.add(new n9s0(0.0f, 6.312f));
            arrayList.add(new j9s0(2.25f, 2.25f, 0.0f, true, false, 0.0f, -4.5f));
            arrayList.add(new j9s0(2.25f, 2.25f, 0.0f, false, false, 0.0f, 4.5f));
            a180.a(a180Var, arrayList, n6a1Var, 1.0f, 2, 1.0f);
            n6a1 n6a1Var2 = new n6a1(j);
            cwh0 cwh0VarG = lf51.g(2.002f, 2.75f);
            cwh0VarG.g(0.0f, -0.966f, 0.784f, -1.75f, 1.75f, -1.75f);
            cwh0VarG.i(8.5f);
            cwh0VarG.g(0.966f, 0.0f, 1.75f, 0.784f, 1.75f, 1.75f);
            cwh0VarG.v(11.5f);
            cwh0VarG.c(1.75f, 1.75f, false, true, -1.75f, 1.75f);
            cwh0VarG.i(-8.5f);
            cwh0VarG.c(1.75f, 1.75f, false, true, -1.75f, -1.75f);
            cwh0VarG.e();
            cwh0VarG.l(3.752f, 2.5f);
            cwh0VarG.c(0.25f, 0.25f, false, false, -0.25f, 0.25f);
            cwh0VarG.v(11.5f);
            cwh0VarG.g(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f);
            cwh0VarG.i(8.5f);
            cwh0VarG.c(0.25f, 0.25f, false, false, 0.25f, -0.25f);
            cwh0VarG.j(12.502f, 2.75f);
            cwh0VarG.c(0.25f, 0.25f, false, false, -0.25f, -0.25f);
            cwh0VarG.e();
            a180.a(a180Var, cwh0VarG.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            d7e.a = b180VarB;
        }
        b180 b180VarB2 = vbe.c;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.DeviceSpeaker24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            long j2 = u7h.b;
            n6a1 n6a1Var3 = new n6a1(j2);
            cwh0 cwh0VarG2 = lf51.g(5.0f, 19.0f);
            cwh0VarG2.c(3.0f, 3.0f, false, false, 3.0f, 3.0f);
            cwh0VarG2.i(8.0f);
            cwh0VarG2.c(3.0f, 3.0f, false, false, 3.0f, -3.0f);
            cwh0VarG2.j(19.0f, 5.0f);
            cwh0VarG2.c(3.0f, 3.0f, false, false, -3.0f, -3.0f);
            cwh0VarG2.j(8.0f, 2.0f);
            cwh0VarG2.c(3.0f, 3.0f, false, false, -3.0f, 3.0f);
            cwh0VarG2.e();
            cwh0VarG2.l(8.0f, 20.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, -1.0f, -1.0f);
            cwh0VarG2.j(7.0f, 5.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 1.0f, -1.0f);
            cwh0VarG2.i(8.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, 1.0f, 1.0f);
            cwh0VarG2.v(14.0f);
            cwh0VarG2.c(1.0f, 1.0f, false, true, -1.0f, 1.0f);
            cwh0VarG2.e();
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var3, 1.0f, 2, 1.0f);
            n6a1 n6a1Var4 = new n6a1(j2);
            cwh0 cwh0VarG3 = lf51.g(13.25f, 7.25f);
            cwh0VarG3.c(1.25f, 1.25f, true, false, -2.5f, 0.0f);
            cwh0VarG3.c(1.25f, 1.25f, false, false, 2.5f, 0.0f);
            cwh0VarG3.l(12.0f, 16.0f);
            cwh0VarG3.c(1.5f, 1.5f, true, true, 0.0f, -3.0f);
            cwh0VarG3.c(1.5f, 1.5f, false, true, 0.0f, 3.0f);
            cwh0VarG3.m(-3.5f, -1.5f);
            cwh0VarG3.c(3.5f, 3.5f, true, false, 7.0f, 0.0f);
            cwh0VarG3.c(3.5f, 3.5f, false, false, -7.0f, 0.0f);
            a180.a(a180Var2, cwh0VarG3.a, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            vbe.c = b180VarB2;
        }
        c = new lmx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new hlx((byte) 29);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof lmx);
    }

    public final int hashCode() {
        return -1587355244;
    }

    public final String toString() {
        return "DeviceSpeaker";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
