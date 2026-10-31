package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wtd implements yzq {
    public final jpr0 a;
    public final jpr0 b;
    public final jpr0 c;
    public final jpr0 d;
    public final jpr0 e;
    public final jpr0 f;
    public final jpr0 g;
    public final jpr0 h;
    public final jpr0 i;
    public final jpr0 j;
    public final jpr0 k;
    public final jpr0 l;
    public final jpr0 m;
    public final jpr0 n;
    public final jpr0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final jpr0 f85p;
    public final jpr0 q;
    public final jpr0 r;
    public final jpr0 s;

    public wtd(jpr0 jpr0Var, jpr0 jpr0Var2, jpr0 jpr0Var3, jpr0 jpr0Var4, jpr0 jpr0Var5, jpr0 jpr0Var6, jpr0 jpr0Var7, jpr0 jpr0Var8, jpr0 jpr0Var9, jpr0 jpr0Var10, jpr0 jpr0Var11, jpr0 jpr0Var12, jpr0 jpr0Var13, jpr0 jpr0Var14, jpr0 jpr0Var15, jpr0 jpr0Var16, jpr0 jpr0Var17, jpr0 jpr0Var18, jpr0 jpr0Var19, int i) {
        jpr0 jpr0Var20 = (i & 2048) != 0 ? new jpr0((Set) null) : jpr0Var12;
        jpr0 jpr0Var21 = (i & 4096) != 0 ? new jpr0((Set) null) : jpr0Var13;
        jpr0 jpr0Var22 = (i & 8192) != 0 ? new jpr0((Set) null) : jpr0Var14;
        jpr0 jpr0Var23 = (i & 16384) != 0 ? new jpr0((Set) null) : jpr0Var15;
        jpr0 jpr0Var24 = (32768 & i) != 0 ? new jpr0((Set) null) : jpr0Var16;
        jpr0 jpr0Var25 = (65536 & i) != 0 ? new jpr0((Set) null) : jpr0Var17;
        jpr0 jpr0Var26 = (131072 & i) != 0 ? new jpr0((Set) null) : jpr0Var18;
        jpr0 jpr0Var27 = (i & 262144) != 0 ? new jpr0((Set) null) : jpr0Var19;
        this.a = jpr0Var;
        this.b = jpr0Var2;
        this.c = jpr0Var3;
        this.d = jpr0Var4;
        this.e = jpr0Var5;
        this.f = jpr0Var6;
        this.g = jpr0Var7;
        this.h = jpr0Var8;
        this.i = jpr0Var9;
        this.j = jpr0Var10;
        this.k = jpr0Var11;
        this.l = jpr0Var20;
        this.m = jpr0Var21;
        this.n = jpr0Var22;
        this.o = jpr0Var23;
        this.f85p = jpr0Var24;
        this.q = jpr0Var25;
        this.r = jpr0Var26;
        this.s = jpr0Var27;
    }

    @Override // p.yzq
    public final boolean match(Object obj) {
        xtd xtdVar = (xtd) obj;
        if (!this.a.a(xtdVar.a) || !this.b.a(xtdVar.b)) {
            return false;
        }
        if (!this.c.a(Boolean.valueOf(xtdVar.c)) || !this.d.a(xtdVar.d) || !this.e.a(xtdVar.e)) {
            return false;
        }
        if (!this.f.a(Boolean.valueOf(xtdVar.f)) || !this.g.a(xtdVar.g) || !this.h.a(xtdVar.h)) {
            return false;
        }
        if (!this.i.a(Boolean.valueOf(xtdVar.i)) || !this.j.a(xtdVar.j)) {
            return false;
        }
        if (!this.k.a(Boolean.valueOf(xtdVar.k))) {
            return false;
        }
        if (!this.l.a(Boolean.valueOf(xtdVar.l))) {
            return false;
        }
        if (!this.m.a(Boolean.valueOf(xtdVar.m))) {
            return false;
        }
        if (!this.n.a(Boolean.valueOf(xtdVar.n))) {
            return false;
        }
        if (!this.o.a(Boolean.valueOf(xtdVar.o))) {
            return false;
        }
        if (!this.f85p.a(Boolean.valueOf(xtdVar.f89p))) {
            return false;
        }
        if (!this.q.a(Boolean.valueOf(xtdVar.q))) {
            return false;
        }
        if (this.r.a(Boolean.valueOf(xtdVar.r))) {
            return this.s.a(Boolean.valueOf(xtdVar.s));
        }
        return false;
    }
}
