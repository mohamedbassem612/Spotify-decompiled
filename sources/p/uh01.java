package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class uh01 implements tyq {
    public final psw N0;
    public final o3r X;
    public final ljm0 Y;
    public final ia00 Z;
    public final d0r a;
    public final ji01 b;
    public final i1r0 c;
    public final kt91 d;
    public final dma1 e;
    public final boolean f;
    public final k740 g;
    public final boolean h;
    public final ewn0 i;
    public final ezc t;

    public uh01(d0r d0rVar, ji01 ji01Var, i1r0 i1r0Var, kt91 kt91Var, dma1 dma1Var, boolean z, g0l g0lVar, k740 k740Var, boolean z2, ewn0 ewn0Var) {
        this.a = d0rVar;
        this.b = ji01Var;
        this.c = i1r0Var;
        this.d = kt91Var;
        this.e = dma1Var;
        this.f = z;
        this.g = k740Var;
        this.h = z2;
        this.i = ewn0Var;
        this.t = yoi1.g(((inr) g0lVar).d().map(p5x0.e).distinctUntilChanged());
        oa01 oa01Var = oa01.c1;
        this.X = w3p1.n(new l4r(hjx0.a, 1, oa01.e1, new j4r(oa01Var), th01.b), new l4r(new xv00(rc11.a.b(zg01.class)), 1, th01.c, new j4r(oa01.d1), th01.d), atz0.R0);
        oa01 oa01Var2 = oa01.b1;
        fns fnsVar = igu.a;
        this.Y = h7w.B(oa01Var2, pyf0.a, (iu30) null, new g001(this, (byte) 9), 4);
        this.Z = n3o1.q(this).a(kxz0.R0, kxz0.S0);
        j2i j2iVar = new j2i(757582038, new m04(this, (byte) 7), true);
        ien0 ien0Var = qsw.a;
        this.N0 = new psw(j2iVar, (byte) 0);
    }

    public static final boolean g(uh01 uh01Var) {
        return !uh01Var.e.h(vh01.a, false);
    }

    public static final mh01 i(ah01 ah01Var, bi01 bi01Var) {
        return new mh01(new ih01(new ci01(bi01Var, ah01Var.a)));
    }

    public final rqw a() {
        return this.Z;
    }

    public final jsw c() {
        return this.N0;
    }

    public final d0r e() {
        return this.a;
    }

    public final mqw getBehavior() {
        return this.Y;
    }

    public final f4r getData() {
        return this.X;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0024  */
    public final Object h(ah01 ah01Var, x440 x440Var, tto1 tto1Var, boolean z, boolean z2, tqw tqwVar, r9y0 r9y0Var, onm onmVar) {
        sh01 sh01Var;
        tto1 tto1Var2;
        r9y0 r9y0Var2;
        ou80 ou80Var;
        ah01 ah01Var2 = ah01Var;
        if (onmVar instanceof sh01) {
            sh01Var = (sh01) onmVar;
            int i = sh01Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                sh01Var.f = i - Integer.MIN_VALUE;
            } else {
                sh01Var = new sh01(this, onmVar);
            }
        } else {
            sh01Var = new sh01(this, onmVar);
        }
        Object objC = sh01Var.d;
        int i2 = sh01Var.f;
        kt91 kt91Var = this.d;
        rih1 rih1Var = rih1.a;
        if (i2 == 0) {
            hm5.M(objC);
            if ((x440Var instanceof r440) || (x440Var instanceof w440) || (x440Var instanceof q440)) {
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131960925});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                kt91Var.k(new er91((fs91) null, "", 2131960925, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                return rih1Var;
            }
            if (x440Var instanceof p440) {
                this.c.a(ah01Var2.a);
                return rih1Var;
            }
            tto1 fh01Var = tto1Var;
            boolean z3 = !(fh01Var instanceof gh01) || z;
            if (!z2 && z3) {
                r9y0Var.invoke(i(ah01Var2, xh01.a));
                return rih1Var;
            }
            if (z) {
                fh01Var = new fh01(fh01Var.m());
            }
            if (fh01Var instanceof gh01) {
                r9y0Var.invoke(i(ah01Var2, new yh01(((gh01) fh01Var).b)));
                return rih1Var;
            }
            r9y0Var.invoke(nh01.a);
            String str = (tqwVar == null || (ou80Var = n3o1.y(tqwVar).a) == null) ? null : ou80Var.a;
            sh01Var.a = ah01Var2;
            sh01Var.b = r9y0Var;
            sh01Var.c = fh01Var;
            sh01Var.f = 1;
            objC = ((ui01) this.b).c(str, sh01Var);
            d9n d9nVar = d9n.a;
            if (objC == d9nVar) {
                return d9nVar;
            }
            tto1Var2 = fh01Var;
            r9y0Var2 = r9y0Var;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tto1 tto1Var3 = sh01Var.c;
            r9y0Var2 = sh01Var.b;
            ah01 ah01Var3 = sh01Var.a;
            hm5.M(objC);
            tto1Var2 = tto1Var3;
            ah01Var2 = ah01Var3;
        }
        ii01 ii01Var = (ii01) objC;
        r9y0Var2.invoke(oh01.a);
        if (u890.j(ii01Var, hi01.a)) {
            bma1 bma1Var = vh01.a;
            dma1 dma1Var = this.e;
            if (!dma1Var.h(bma1Var, false)) {
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131960924});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                kt91Var.k(new er91((fs91) null, "", 2131960924, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                hma1 hma1VarEdit = dma1Var.edit();
                hma1VarEdit.a(bma1Var, true);
                hma1VarEdit.g();
            }
            return rih1Var;
        }
        if (u890.j(ii01Var, ei01.a)) {
            r9y0Var2.invoke(i(ah01Var2, new yh01(tto1Var2.m())));
            return rih1Var;
        }
        if (u890.j(ii01Var, fi01.a)) {
            r9y0Var2.invoke(i(ah01Var2, zh01.a));
            return rih1Var;
        }
        if (u890.j(ii01Var, gi01.a)) {
            r9y0Var2.invoke(i(ah01Var2, ai01.a));
            return rih1Var;
        }
        eg.o();
        return null;
    }
}
