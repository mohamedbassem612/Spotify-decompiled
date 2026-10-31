package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zpx extends hux {
    public static final Parcelable.Creator<zpx> CREATOR;
    public static final zpx c;
    public static final byte d;

    static {
        b180 b180VarB = iqo1.c;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.PlayRecap16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            long j = u7h.b;
            n6a1 n6a1Var = new n6a1(j);
            cwh0 cwh0VarG = lf51.g(3.573f, 2.172f);
            cwh0VarG.c(0.907f, 0.907f, true, false, 1.57f, -0.907f);
            cwh0VarG.c(0.907f, 0.907f, false, false, -1.57f, 0.907f);
            cwh0VarG.l(1.249f, 5.16f);
            cwh0VarG.c(0.907f, 0.907f, true, false, 0.907f, -1.57f);
            cwh0VarG.c(0.907f, 0.907f, false, false, -0.907f, 1.57f);
            cwh0VarG.m(14.777f, 2.843f);
            cwh0VarG.b(8.007f, 8.007f, false, false, 8.02f, -0.003f);
            cwh0VarG.c(0.75f, 0.75f, false, false, 0.0f, 1.5f);
            cwh0VarG.c(6.507f, 6.507f, true, true, -6.506f, 6.506f);
            cwh0VarG.c(0.75f, 0.75f, false, false, -1.5f, 0.0f);
            cwh0VarG.c(8.006f, 8.006f, false, false, 16.013f, 0.0f);
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            n6a1 n6a1Var2 = new n6a1(j);
            ArrayList arrayList = new ArrayList(32);
            arrayList.add(new f9s0(11.313f, 8.433f));
            arrayList.add(new j9s0(0.5f, 0.5f, 0.0f, false, false, 0.0f, -0.866f));
            arrayList.add(new e9s0(6.75f, 4.933f));
            arrayList.add(new j9s0(0.5f, 0.5f, 0.0f, false, false, -0.75f, 0.433f));
            arrayList.add(new r9s0(5.268f));
            arrayList.add(new j9s0(0.5f, 0.5f, 0.0f, false, false, 0.75f, 0.433f));
            arrayList.add(b9s0.c);
            a180.a(a180Var, arrayList, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            iqo1.c = b180VarB;
        }
        b180 b180VarB2 = mqo1.b;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.PlayRecap24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            long j2 = u7h.b;
            n6a1 n6a1Var3 = new n6a1(j2);
            cwh0 cwh0VarG2 = lf51.g(5.873f, 3.965f);
            cwh0VarG2.c(1.25f, 1.25f, true, false, 2.165f, -1.25f);
            cwh0VarG2.c(1.25f, 1.25f, false, false, -2.165f, 1.25f);
            cwh0VarG2.l(2.67f, 8.083f);
            cwh0VarG2.c(1.25f, 1.25f, true, false, 1.25f, -2.165f);
            cwh0VarG2.c(1.25f, 1.25f, false, false, -1.25f, 2.165f);
            cwh0VarG2.l(23.001f, 12.0f);
            cwh0VarG2.g(0.0f, -6.075f, -4.925f, -11.0f, -11.0f, -11.0f);
            cwh0VarG2.c(1.0f, 1.0f, true, false, 0.0f, 2.0f);
            cwh0VarG2.c(9.0f, 9.0f, true, true, -9.0f, 9.0f);
            cwh0VarG2.c(1.0f, 1.0f, true, false, -2.0f, 0.0f);
            cwh0VarG2.g(0.0f, 6.075f, 4.925f, 11.0f, 11.0f, 11.0f);
            cwh0VarG2.q(11.0f, -4.925f, 11.0f, -11.0f);
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var3, 1.0f, 2, 1.0f);
            n6a1 n6a1Var4 = new n6a1(j2);
            ArrayList arrayList2 = new ArrayList(32);
            arrayList2.add(new f9s0(16.911f, 12.433f));
            arrayList2.add(new j9s0(0.5f, 0.5f, 0.0f, false, false, 0.0f, -0.866f));
            arrayList2.add(new e9s0(9.75f, 7.433f));
            arrayList2.add(new j9s0(0.5f, 0.5f, 0.0f, false, false, -0.75f, 0.433f));
            arrayList2.add(new r9s0(8.268f));
            arrayList2.add(new j9s0(0.5f, 0.5f, 0.0f, false, false, 0.75f, 0.433f));
            arrayList2.add(b9s0.c);
            a180.a(a180Var2, arrayList2, n6a1Var4, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            mqo1.b = b180VarB2;
        }
        c = new zpx(new dsx(b180VarB, b180VarB2), null);
        d = (byte) 8;
        CREATOR = new yox((byte) 26);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof zpx);
    }

    public final int hashCode() {
        return 238491702;
    }

    public final String toString() {
        return "PlayRecap";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
