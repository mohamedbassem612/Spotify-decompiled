package p;

import com.spotify.userinteractivityservice.usercomments.v1.proto.Comment;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class rph {
    public final String a;
    public final ace0 b;
    public final ace0 c;
    public final ace0 d;
    public final ace0 e;
    public final ace0 f;
    public final njb0 g;
    public final kmh h;
    public final String i;
    public final boolean j;
    public final String k;
    public final cqs0 l;
    public final Set m;
    public final boolean n;
    public final cqs0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Comment f12p;
    public final cqs0 q;
    public final u380 r;
    public final boolean s;

    public rph(String str, njb0 njb0Var, boolean z) {
        obe0 obe0Var = new obe0();
        obe0 obe0Var2 = new obe0();
        obe0 obe0Var3 = new obe0();
        obe0 obe0Var4 = new obe0();
        obe0 obe0Var5 = new obe0();
        dqs0 dqs0Var = dqs0.e;
        this(str, obe0Var, obe0Var2, obe0Var3, obe0Var4, obe0Var5, njb0Var, imh.a, "", false, null, dqs0Var, w7x.a, z, dqs0Var, null, dqs0Var, lqs0.d, false);
    }

    public static rph a(rph rphVar, ace0 ace0Var, ace0 ace0Var2, ace0 ace0Var3, ace0 ace0Var4, ace0 ace0Var5, njb0 njb0Var, kmh kmhVar, String str, boolean z, String str2, cqs0 cqs0Var, LinkedHashSet linkedHashSet, boolean z2, cqs0 cqs0Var2, Comment comment, cqs0 cqs0Var3, u380 u380Var, boolean z3, int i) {
        String str3 = rphVar.a;
        ace0 ace0Var6 = (i & 2) != 0 ? rphVar.b : ace0Var;
        ace0 ace0Var7 = (i & 4) != 0 ? rphVar.c : ace0Var2;
        ace0 ace0Var8 = (i & 8) != 0 ? rphVar.d : ace0Var3;
        ace0 ace0Var9 = (i & 16) != 0 ? rphVar.e : ace0Var4;
        ace0 ace0Var10 = (i & 32) != 0 ? rphVar.f : ace0Var5;
        njb0 njb0Var2 = (i & 64) != 0 ? rphVar.g : njb0Var;
        kmh kmhVar2 = (i & 128) != 0 ? rphVar.h : kmhVar;
        String str4 = (i & 256) != 0 ? rphVar.i : str;
        boolean z4 = (i & 512) != 0 ? rphVar.j : z;
        String str5 = (i & 1024) != 0 ? rphVar.k : str2;
        cqs0 cqs0Var4 = (i & 2048) != 0 ? rphVar.l : cqs0Var;
        Set set = (i & 4096) != 0 ? rphVar.m : linkedHashSet;
        boolean z5 = (i & 8192) != 0 ? rphVar.n : z2;
        cqs0 cqs0Var5 = (i & 16384) != 0 ? rphVar.o : cqs0Var2;
        Comment comment2 = (i & 32768) != 0 ? rphVar.f12p : comment;
        cqs0 cqs0Var6 = (i & 65536) != 0 ? rphVar.q : cqs0Var3;
        u380 u380Var2 = (i & 131072) != 0 ? rphVar.r : u380Var;
        boolean z6 = (i & 262144) != 0 ? rphVar.s : z3;
        rphVar.getClass();
        return new rph(str3, ace0Var6, ace0Var7, ace0Var8, ace0Var9, ace0Var10, njb0Var2, kmhVar2, str4, z4, str5, cqs0Var4, set, z5, cqs0Var5, comment2, cqs0Var6, u380Var2, z6);
    }

    public final Comment b(String str) {
        ijh ijhVar;
        uge1 uge1Var;
        ace0 ace0Var = this.b;
        Object obj = null;
        ebe0 ebe0Var = ace0Var instanceof ebe0 ? (ebe0) ace0Var : null;
        if (ebe0Var == null || (ijhVar = (ijh) ebe0Var.a) == null || (uge1Var = ijhVar.b) == null) {
            return null;
        }
        for (Object obj2 : uge1Var.a) {
            if (u890.j(((Comment) obj2).r(), str)) {
                obj = obj2;
                break;
            }
        }
        return (Comment) obj;
    }

    public final boolean c() {
        return ((this.b instanceof obe0) || (this.c instanceof obe0) || (this.d instanceof obe0) || (this.e instanceof obe0) || (this.f instanceof obe0)) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rph)) {
            return false;
        }
        rph rphVar = (rph) obj;
        return u890.j(this.a, rphVar.a) && u890.j(this.b, rphVar.b) && u890.j(this.c, rphVar.c) && u890.j(this.d, rphVar.d) && u890.j(this.e, rphVar.e) && u890.j(this.f, rphVar.f) && u890.j(this.g, rphVar.g) && u890.j(this.h, rphVar.h) && u890.j(this.i, rphVar.i) && this.j == rphVar.j && u890.j(this.k, rphVar.k) && u890.j(this.l, rphVar.l) && u890.j(this.m, rphVar.m) && this.n == rphVar.n && u890.j(this.o, rphVar.o) && u890.j(this.f12p, rphVar.f12p) && u890.j(this.q, rphVar.q) && u890.j(this.r, rphVar.r) && this.s == rphVar.s;
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        njb0 njb0Var = this.g;
        int iG = xcg1.g(cy30.d((this.h.hashCode() + ((iHashCode + (njb0Var == null ? 0 : njb0Var.hashCode())) * 31)) * 31, 31, this.i), 31, this.j);
        String str = this.k;
        int iHashCode2 = (this.o.hashCode() + xcg1.g(gvg.c((this.l.hashCode() + ((iG + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.m), 31, this.n)) * 31;
        Comment comment = this.f12p;
        return Boolean.hashCode(this.s) + ((this.r.hashCode() + ((this.q.hashCode() + ((iHashCode2 + (comment != null ? comment.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public rph(String str, ace0 ace0Var, ace0 ace0Var2, ace0 ace0Var3, ace0 ace0Var4, ace0 ace0Var5, njb0 njb0Var, kmh kmhVar, String str2, boolean z, String str3, cqs0 cqs0Var, Set set, boolean z2, cqs0 cqs0Var2, Comment comment, cqs0 cqs0Var3, u380 u380Var, boolean z3) {
        this.a = str;
        this.b = ace0Var;
        this.c = ace0Var2;
        this.d = ace0Var3;
        this.e = ace0Var4;
        this.f = ace0Var5;
        this.g = njb0Var;
        this.h = kmhVar;
        this.i = str2;
        this.j = z;
        this.k = str3;
        this.l = cqs0Var;
        this.m = set;
        this.n = z2;
        this.o = cqs0Var2;
        this.f12p = comment;
        this.q = cqs0Var3;
        this.r = u380Var;
        this.s = z3;
    }
}
