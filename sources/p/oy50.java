package p;

import android.widget.FrameLayout;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class oy50 {
    public final iac0 a;
    public final ycm b;
    public final q8u0 c;
    public final jyo d;
    public final axr e;
    public final ze81 f;
    public final d771 g;
    public final rzo h;
    public final cq6 i;
    public final d0r j;
    public final vbq k;
    public final ieq l;
    public final xf4 m;
    public final String n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final kko f88p;
    public final zob1 q;

    public oy50(iac0 iac0Var, ycm ycmVar, q8u0 q8u0Var, jyo jyoVar, axr axrVar, ze81 ze81Var, d771 d771Var, rzo rzoVar, cq6 cq6Var, d0r d0rVar, tbq tbqVar, ubq ubqVar, vbq vbqVar, ieq ieqVar, wbq wbqVar, xbq xbqVar, xf4 xf4Var, String str, String str2, kko kkoVar, ky50 ky50Var, zob1 zob1Var) {
        this.a = iac0Var;
        this.b = ycmVar;
        this.c = q8u0Var;
        this.d = jyoVar;
        this.e = axrVar;
        this.f = ze81Var;
        this.g = d771Var;
        this.h = rzoVar;
        this.i = cq6Var;
        this.j = d0rVar;
        this.k = vbqVar;
        this.l = ieqVar;
        this.m = xf4Var;
        this.n = str;
        this.o = str2;
        this.f88p = kkoVar;
        this.q = zob1Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final maa a(k260 k260Var) throws NoWhenBranchMatchedException {
        if (k260Var == uq71.a) {
            return t3k1.H(this.h.a(this.f88p), new ny50(this, (byte) 6));
        }
        if (k260Var == uq71.b) {
            return t3k1.H(ycm.a(this.b), new ny50(this, (byte) 7));
        }
        um8 um8Var = um8.a;
        d771 d771Var = this.g;
        if (k260Var == um8Var) {
            return t3k1.H(q1o1.u(d771Var.a(), (qim0) null, (FrameLayout.LayoutParams) null, 7), new ny50(this, (byte) 8));
        }
        if (k260Var == mb6.d) {
            return t3k1.H(q1o1.u(d771Var.a(), (qim0) null, (FrameLayout.LayoutParams) null, 7), new ny50(this, (byte) 9));
        }
        if (k260Var == mb6.b) {
            return t3k1.H(this.d.a(this.c, new bz0((byte) 12)), new ny50(this, (byte) 10));
        }
        mb6 mb6Var = mb6.a;
        zob1 zob1Var = this.q;
        if (k260Var == mb6Var) {
            return t3k1.H(this.e.a(zob1Var, this.a), new ny50(this, (byte) 11));
        }
        if (k260Var == mb6.c) {
            return t3k1.H(q1o1.u(this.f, (qim0) null, (FrameLayout.LayoutParams) null, 7), new ny50(this, (byte) 12));
        }
        bmj0 bmj0Var = bmj0.a;
        d0r d0rVar = this.j;
        xf4 xf4Var = this.m;
        if (k260Var == bmj0Var) {
            return xf4Var.k() ? obg1.s(ubq.a(d0rVar), new ny50(this, (byte) 13)) : t3k1.H(tbq.a(zob1Var), new ny50(this, (byte) 2));
        }
        if (k260Var == n3j1.a) {
            return xf4Var.s() ? obg1.s(this.l.a(d0rVar), new ny50(this, (byte) 3)) : t3k1.H(this.k.a(zob1Var), new ny50(this, (byte) 4));
        }
        if (k260Var == i7a.a) {
            return t3k1.H(this.i.a(zob1Var, d0rVar, xf4Var.k()), new ny50(this, (byte) 5));
        }
        eg.o();
        return null;
    }
}
