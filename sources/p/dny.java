package p;

import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor$Companion;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class dny implements whm0 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final List e;
    public final List f;
    public final boolean g;
    public final boolean h;
    public final jf81 i;
    public final tqb1 j;

    public /* synthetic */ dny(String str, String str2, String str3, tqb1 tqb1Var, int i) {
        jf81 jf81Var = new jf81(1, 2);
        tqb1Var = (i & NativeMediaProcessor$Companion.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0 ? null : tqb1Var;
        z6x z6xVar = z6x.a;
        this(str, str2, str3, 4, z6xVar, z6xVar, false, false, jf81Var, tqb1Var);
    }

    public static dny b(dny dnyVar, String str, int i, List list, List list2, boolean z, boolean z2, jf81 jf81Var, tqb1 tqb1Var, int i2) {
        String str2 = dnyVar.a;
        if ((i2 & 2) != 0) {
            str = dnyVar.b;
        }
        String str3 = str;
        String str4 = dnyVar.c;
        if ((i2 & 8) != 0) {
            i = dnyVar.d;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            list = dnyVar.e;
        }
        List list3 = list;
        List list4 = (i2 & 32) != 0 ? dnyVar.f : list2;
        boolean z3 = (i2 & 64) != 0 ? dnyVar.g : z;
        boolean z4 = (i2 & 128) != 0 ? dnyVar.h : z2;
        jf81 jf81Var2 = (i2 & 256) != 0 ? dnyVar.i : jf81Var;
        tqb1 tqb1Var2 = (i2 & NativeMediaProcessor$Companion.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0 ? dnyVar.j : tqb1Var;
        dnyVar.getClass();
        return new dny(str2, str3, str4, i3, list3, list4, z3, z4, jf81Var2, tqb1Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dny)) {
            return false;
        }
        dny dnyVar = (dny) obj;
        return u890.j(this.a, dnyVar.a) && u890.j(this.b, dnyVar.b) && u890.j(this.c, dnyVar.c) && this.d == dnyVar.d && u890.j(this.e, dnyVar.e) && u890.j(this.f, dnyVar.f) && this.g == dnyVar.g && this.h == dnyVar.h && u890.j(this.i, dnyVar.i) && u890.j(this.j, dnyVar.j);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (this.i.hashCode() + xcg1.g(xcg1.g(f4i1.b(f4i1.b(ab80.k(this.d, (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h)) * 31;
        tqb1 tqb1Var = this.j;
        return iHashCode3 + (tqb1Var != null ? tqb1Var.hashCode() : 0);
    }

    public dny(String str, String str2, String str3, int i, List list, List list2, boolean z, boolean z2, jf81 jf81Var, tqb1 tqb1Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = list;
        this.f = list2;
        this.g = z;
        this.h = z2;
        this.i = jf81Var;
        this.j = tqb1Var;
    }
}
