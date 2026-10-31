package p;

import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor$Companion;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class my50 {
    public final jy50 a;
    public final zx50 b;
    public final Function0 c;
    public final Function0 d;
    public final iu30 e;
    public final iu30 f;
    public final yx50 g;
    public final vx50 h;
    public final vu30 i;
    public final vu30 j;
    public final boolean k;
    public final String l;
    public final jx50 m;
    public final dy50 n;
    public final iu30 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final iu30 f12p;
    public final boolean q;
    public final nx50 r;

    public my50(jy50 jy50Var, zx50 zx50Var, Function0 function0, Function0 function1, iu30 iu30Var, iu30 iu30Var2, yx50 yx50Var, vx50 vx50Var, vu30 vu30Var, vu30 vu30Var2, boolean z, String str, jx50 jx50Var, dy50 dy50Var, v3v0 v3v0Var, nx50 nx50Var, int i) {
        iu30 iu30Var3 = hm11.U0;
        zx50 zx50Var2 = (i & 2) != 0 ? null : zx50Var;
        Function0 function2 = (i & 4) != 0 ? null : function0;
        yx50 yx50Var2 = (i & 64) != 0 ? wx50.a : yx50Var;
        vx50 vx50Var2 = (i & 128) != 0 ? null : vx50Var;
        vu30 vu30Var3 = (i & 256) != 0 ? null : vu30Var;
        vu30 vu30Var4 = (i & NativeMediaProcessor$Companion.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0 ? null : vu30Var2;
        boolean z2 = (i & 1024) != 0 ? false : z;
        String str2 = (i & 2048) != 0 ? null : str;
        jx50 jx50Var2 = (i & 4096) != 0 ? null : jx50Var;
        v3v0 v3v0Var2 = (32768 & i) != 0 ? null : v3v0Var;
        iu30Var3 = (65536 & i) != 0 ? null : iu30Var3;
        boolean z3 = (131072 & i) == 0;
        nx50 nx50Var2 = (i & 262144) != 0 ? mx50.a : nx50Var;
        this.a = jy50Var;
        this.b = zx50Var2;
        this.c = function2;
        this.d = function1;
        this.e = iu30Var;
        this.f = iu30Var2;
        this.g = yx50Var2;
        this.h = vx50Var2;
        this.i = vu30Var3;
        this.j = vu30Var4;
        this.k = z2;
        this.l = str2;
        this.m = jx50Var2;
        this.n = dy50Var;
        this.o = v3v0Var2;
        this.f12p = iu30Var3;
        this.q = z3;
        this.r = nx50Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof my50)) {
            return false;
        }
        my50 my50Var = (my50) obj;
        return this.a.equals(my50Var.a) && u890.j(this.b, my50Var.b) && u890.j(this.c, my50Var.c) && u890.j(this.d, my50Var.d) && this.e.equals(my50Var.e) && u890.j(this.f, my50Var.f) && this.g.equals(my50Var.g) && u890.j(this.h, my50Var.h) && u890.j(this.i, my50Var.i) && u890.j(this.j, my50Var.j) && this.k == my50Var.k && u890.j(this.l, my50Var.l) && u890.j(this.m, my50Var.m) && u890.j(this.n, my50Var.n) && u890.j(this.o, my50Var.o) && u890.j(this.f12p, my50Var.f12p) && this.q == my50Var.q && this.r.equals(my50Var.r);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        zx50 zx50Var = this.b;
        int iHashCode2 = (iHashCode + (zx50Var == null ? 0 : zx50Var.hashCode())) * 31;
        Function0 function0 = this.c;
        int iHashCode3 = (iHashCode2 + (function0 == null ? 0 : function0.hashCode())) * 31;
        Function0 function1 = this.d;
        int iG = ktd.g(this.e, (iHashCode3 + (function1 == null ? 0 : function1.hashCode())) * 31, 31);
        iu30 iu30Var = this.f;
        int iHashCode4 = (this.g.hashCode() + ((iG + (iu30Var == null ? 0 : iu30Var.hashCode())) * 31)) * 31;
        vx50 vx50Var = this.h;
        int iHashCode5 = (iHashCode4 + (vx50Var == null ? 0 : vx50Var.hashCode())) * 31;
        vu30 vu30Var = this.i;
        int iHashCode6 = (iHashCode5 + (vu30Var == null ? 0 : vu30Var.hashCode())) * 31;
        vu30 vu30Var2 = this.j;
        int iG2 = xcg1.g((iHashCode6 + (vu30Var2 == null ? 0 : vu30Var2.hashCode())) * 31, 31, this.k);
        String str = this.l;
        int iHashCode7 = (iG2 + (str == null ? 0 : str.hashCode())) * 31;
        jx50 jx50Var = this.m;
        int iHashCode8 = (iHashCode7 + (jx50Var == null ? 0 : jx50Var.hashCode())) * 31;
        dy50 dy50Var = this.n;
        int iHashCode9 = (iHashCode8 + (dy50Var == null ? 0 : dy50Var.hashCode())) * 961;
        iu30 iu30Var2 = this.o;
        int iHashCode10 = (iHashCode9 + (iu30Var2 == null ? 0 : iu30Var2.hashCode())) * 31;
        iu30 iu30Var3 = this.f12p;
        return this.r.hashCode() + xcg1.g((iHashCode10 + (iu30Var3 != null ? iu30Var3.hashCode() : 0)) * 31, 31, this.q);
    }
}
