package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class stx extends hux {
    public static final Parcelable.Creator<stx> CREATOR;
    public static final stx c;
    public static final byte d;

    static {
        b180 b180VarB;
        b180 b180Var = sqe.c;
        if (b180Var != null) {
            b180VarB = b180Var;
        } else {
            a180 a180Var = new a180("Encore.Vector.UploadAlt16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            long j = u7h.b;
            n6a1 n6a1Var = new n6a1(j);
            cwh0 cwh0VarG = lf51.g(4.995f, 7.255f);
            cwh0VarG.c(0.75f, 0.75f, false, false, 1.06f, 0.0f);
            cwh0VarG.j(7.25f, 6.061f);
            cwh0VarG.u(12.0f);
            cwh0VarG.c(0.75f, 0.75f, false, false, 1.5f, 0.0f);
            cwh0VarG.u(6.06f);
            cwh0VarG.k(1.195f, 1.195f);
            cwh0VarG.c(0.75f, 0.75f, true, false, 1.06f, -1.06f);
            cwh0VarG.j(8.0f, 3.189f);
            cwh0VarG.k(-0.528f, 0.528f);
            cwh0VarG.k(-0.005f, 0.005f);
            cwh0VarG.k(-2.472f, 2.473f);
            cwh0VarG.c(0.75f, 0.75f, false, false, 0.0f, 1.06f);
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            n6a1 n6a1Var2 = new n6a1(j);
            ArrayList arrayList = new ArrayList(32);
            arrayList.add(new f9s0(0.0f, 8.0f));
            arrayList.add(new j9s0(8.0f, 8.0f, 0.0f, true, false, 16.0f, 0.0f));
            arrayList.add(new a9s0(8.0f, 8.0f, 0.0f, false, false, 0.0f, 8.0f));
            arrayList.add(new n9s0(8.0f, 6.5f));
            arrayList.add(new j9s0(6.5f, 6.5f, 0.0f, true, true, 0.0f, -13.0f));
            arrayList.add(new j9s0(6.5f, 6.5f, 0.0f, false, true, 0.0f, 13.0f));
            a180.a(a180Var, arrayList, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            sqe.c = b180VarB;
        }
        b180 b180VarB2 = upf.c;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.UploadAlt24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            long j2 = u7h.b;
            n6a1 n6a1Var3 = new n6a1(j2);
            ArrayList arrayList2 = new ArrayList(32);
            arrayList2.add(new f9s0(12.0f, 21.0f));
            arrayList2.add(new j9s0(9.0f, 9.0f, 0.0f, true, true, 0.0f, -18.0f));
            arrayList2.add(new j9s0(9.0f, 9.0f, 0.0f, false, true, 0.0f, 18.0f));
            arrayList2.add(new f9s0(1.0f, 12.0f));
            arrayList2.add(new k9s0(0.0f, 6.075f, 4.925f, 11.0f, 11.0f, 11.0f));
            arrayList2.add(new p9s0(11.0f, -4.925f, 11.0f, -11.0f));
            arrayList2.add(new h9s0(18.075f, 1.0f, 12.0f, 1.0f));
            arrayList2.add(new h9s0(1.0f, 5.925f, 1.0f, 12.0f));
            a180.a(a180Var2, arrayList2, n6a1Var3, 1.0f, 2, 1.0f);
            n6a1 n6a1Var4 = new n6a1(j2);
            cwh0 cwh0VarG2 = lf51.g(12.0f, 17.95f);
            cwh0VarG2.c(1.0f, 1.0f, false, false, 1.0f, -1.0f);
            cwh0VarG2.u(9.464f);
            cwh0VarG2.k(1.793f, 1.793f);
            cwh0VarG2.c(1.0f, 1.0f, true, false, 1.414f, -1.414f);
            cwh0VarG2.j(12.0f, 5.636f);
            cwh0VarG2.j(7.793f, 9.843f);
            cwh0VarG2.c(1.0f, 1.0f, false, false, 1.414f, 1.414f);
            cwh0VarG2.j(11.0f, 9.464f);
            cwh0VarG2.v(7.486f);
            cwh0VarG2.c(1.0f, 1.0f, false, false, 1.0f, 1.0f);
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            upf.c = b180VarB2;
        }
        dsx dsxVar = new dsx(b180VarB, b180VarB2);
        b180 b180VarB3 = qtg.c;
        if (b180VarB3 == null) {
            a180 a180Var3 = new a180("Encore.Vector.UploadAltActive16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i3 = bui1.a;
            n6a1 n6a1Var5 = new n6a1(u7h.b);
            cwh0 cwh0VarG3 = lf51.g(0.0f, 8.0f);
            cwh0VarG3.c(8.0f, 8.0f, true, false, 16.0f, 0.0f);
            cwh0VarG3.b(8.0f, 8.0f, false, false, 0.0f, 8.0f);
            cwh0VarG3.m(4.995f, -0.745f);
            cwh0VarG3.c(0.75f, 0.75f, false, true, 0.0f, -1.06f);
            cwh0VarG3.j(8.0f, 3.189f);
            cwh0VarG3.k(3.005f, 3.006f);
            cwh0VarG3.c(0.75f, 0.75f, false, true, -1.06f, 1.06f);
            cwh0VarG3.j(8.75f, 6.061f);
            cwh0VarG3.u(12.0f);
            cwh0VarG3.c(0.75f, 0.75f, false, true, -1.5f, 0.0f);
            cwh0VarG3.u(6.06f);
            cwh0VarG3.j(6.055f, 7.256f);
            cwh0VarG3.c(0.75f, 0.75f, false, true, -1.06f, 0.0f);
            cwh0VarG3.e();
            a180.a(a180Var3, cwh0VarG3.a, n6a1Var5, 1.0f, 2, 1.0f);
            b180VarB3 = a180Var3.b();
            qtg.c = b180VarB3;
        }
        b180 b180VarB4 = dug.b;
        if (b180VarB4 == null) {
            a180 a180Var4 = new a180("Encore.Vector.UploadAltActive24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i4 = bui1.a;
            n6a1 n6a1Var6 = new n6a1(u7h.b);
            cwh0 cwh0VarG4 = lf51.g(1.0f, 12.0f);
            cwh0VarG4.g(0.0f, 6.075f, 4.925f, 11.0f, 11.0f, 11.0f);
            cwh0VarG4.q(11.0f, -4.925f, 11.0f, -11.0f);
            cwh0VarG4.p(18.075f, 1.0f, 12.0f, 1.0f);
            cwh0VarG4.p(1.0f, 5.925f, 1.0f, 12.0f);
            cwh0VarG4.m(12.0f, 4.95f);
            cwh0VarG4.c(1.0f, 1.0f, false, true, -2.0f, 0.0f);
            cwh0VarG4.u(9.464f);
            cwh0VarG4.k(-1.793f, 1.793f);
            cwh0VarG4.c(1.0f, 1.0f, false, true, -1.414f, -1.414f);
            cwh0VarG4.j(12.0f, 5.636f);
            cwh0VarG4.k(4.207f, 4.207f);
            cwh0VarG4.c(1.0f, 1.0f, false, true, -1.414f, 1.415f);
            cwh0VarG4.j(13.0f, 9.463f);
            cwh0VarG4.v(7.486f);
            cwh0VarG4.e();
            a180.a(a180Var4, cwh0VarG4.a, n6a1Var6, 1.0f, 2, 1.0f);
            b180VarB4 = a180Var4.b();
            dug.b = b180VarB4;
        }
        c = new stx(dsxVar, new dsx(b180VarB3, b180VarB4));
        d = (byte) 8;
        CREATOR = new psx((byte) 28);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof stx);
    }

    public final int hashCode() {
        return -927434189;
    }

    public final String toString() {
        return "UploadAlt";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
