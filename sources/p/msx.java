package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class msx extends hux {
    public static final Parcelable.Creator<msx> CREATOR;
    public static final msx c;
    public static final byte d;

    static {
        b180 b180VarB = t5p1.b;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.SkipForwardAlt16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            long j = u7h.b;
            n6a1 n6a1Var = new n6a1(j);
            cwh0 cwh0VarG = lf51.g(5.0f, 5.402f);
            cwh0VarG.c(0.5f, 0.5f, false, true, 0.75f, -0.433f);
            cwh0VarG.j(9.5f, 7.134f);
            cwh0VarG.u(5.0f);
            cwh0VarG.h(11.0f);
            cwh0VarG.v(6.0f);
            cwh0VarG.h(9.5f);
            cwh0VarG.u(8.866f);
            cwh0VarG.k(-3.75f, 2.165f);
            cwh0VarG.c(0.5f, 0.5f, false, true, -0.75f, -0.433f);
            cwh0VarG.e();
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            n6a1 n6a1Var2 = new n6a1(j);
            ArrayList arrayList = new ArrayList(32);
            arrayList.add(new f9s0(-0.14f, 8.0f));
            arrayList.add(new j9s0(8.0f, 8.0f, 0.0f, true, true, 16.0f, 0.0f));
            arrayList.add(new j9s0(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f));
            arrayList.add(new n9s0(8.0f, -6.5f));
            arrayList.add(new j9s0(6.5f, 6.5f, 0.0f, true, false, 0.0f, 13.0f));
            arrayList.add(new j9s0(6.5f, 6.5f, 0.0f, false, false, 0.0f, -13.0f));
            a180.a(a180Var, arrayList, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            t5p1.b = b180VarB;
        }
        b180 b180VarB2 = w5p1.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.SkipForwardAlt24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            long j2 = u7h.b;
            n6a1 n6a1Var3 = new n6a1(j2);
            cwh0 cwh0VarG2 = lf51.g(8.0f, 8.866f);
            cwh0VarG2.c(0.5f, 0.5f, false, true, 0.75f, -0.433f);
            cwh0VarG2.j(14.0f, 11.464f);
            cwh0VarG2.u(8.3f);
            cwh0VarG2.c(0.3f, 0.3f, false, true, 0.3f, -0.3f);
            cwh0VarG2.i(1.4f);
            cwh0VarG2.c(0.3f, 0.3f, false, true, 0.3f, 0.3f);
            cwh0VarG2.v(7.4f);
            cwh0VarG2.c(0.3f, 0.3f, false, true, -0.3f, 0.3f);
            cwh0VarG2.i(-1.4f);
            cwh0VarG2.c(0.3f, 0.3f, false, true, -0.3f, -0.3f);
            cwh0VarG2.v(-3.164f);
            cwh0VarG2.k(-5.25f, 3.03f);
            cwh0VarG2.c(0.5f, 0.5f, false, true, -0.75f, -0.432f);
            cwh0VarG2.e();
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var3, 1.0f, 2, 1.0f);
            n6a1 n6a1Var4 = new n6a1(j2);
            ArrayList arrayList2 = new ArrayList(32);
            arrayList2.add(new f9s0(1.0f, 12.0f));
            arrayList2.add(new c9s0(1.0f, 5.925f, 5.925f, 1.0f, 12.0f, 1.0f));
            arrayList2.add(new p9s0(11.0f, 4.925f, 11.0f, 11.0f));
            arrayList2.add(new p9s0(-4.925f, 11.0f, -11.0f, 11.0f));
            arrayList2.add(new h9s0(1.0f, 18.075f, 1.0f, 12.0f));
            arrayList2.add(new n9s0(11.0f, -9.0f));
            arrayList2.add(new j9s0(9.0f, 9.0f, 0.0f, true, false, 0.0f, 18.0f));
            arrayList2.add(new j9s0(9.0f, 9.0f, 0.0f, false, false, 0.0f, -18.0f));
            a180.a(a180Var2, arrayList2, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            w5p1.b = b180VarB2;
        }
        c = new msx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new jrx((byte) 27);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof msx);
    }

    public final int hashCode() {
        return 726192152;
    }

    public final String toString() {
        return "SkipForwardAlt";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
