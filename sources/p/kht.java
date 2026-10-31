package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class kht {
    public static final /* synthetic */ int a = 0;

    static {
        ajn0.e("value");
    }

    public static final boolean a(tsi1 tsi1Var) {
        return syo1.s(Collections.singletonList(tsi1Var), s321.Y0, jht.a).booleanValue();
    }

    public static jyc b(jyc jycVar, iu30 iu30Var) {
        return (jyc) syo1.m(Collections.singletonList(jycVar), new lhc((byte) 7), new kuo(new p811(), iu30Var));
    }

    public static final kf30 c(n9r n9rVar) {
        lf30 lf30VarF = iht.f(n9rVar);
        if (!lf30VarF.d()) {
            lf30VarF = null;
        }
        if (lf30VarF != null) {
            return lf30VarF.i();
        }
        return null;
    }

    public static final beg d(pf5 pf5Var) {
        jfg jfgVarS = pf5Var.getType().t0().s();
        if (jfgVarS instanceof beg) {
            return (beg) jfgVarS;
        }
        return null;
    }

    public static final g6b0 e(n9r n9rVar) {
        return iht.c(n9rVar).e();
    }

    public static final heg f(jfg jfgVar) {
        n9r n9rVarK;
        heg hegVarF;
        if (jfgVar == null || (n9rVarK = jfgVar.k()) == null) {
            return null;
        }
        if (n9rVarK instanceof dzq0) {
            return new heg(((ezq0) ((dzq0) n9rVarK)).f, jfgVar.getName());
        }
        if (!(n9rVarK instanceof kfg) || (hegVarF = f((jfg) n9rVarK)) == null) {
            return null;
        }
        return hegVarF.d(jfgVar.getName());
    }

    public static final kf30 g(n9r n9rVar) {
        kf30 kf30VarG = iht.g(n9rVar);
        return kf30VarG != null ? kf30VarG : iht.f(n9rVar.k()).a(n9rVar.getName()).i();
    }

    public static final void h(zim0 zim0Var) {
        if (zim0Var.t(cgj1.a) == null) {
            return;
        }
        bhn0.d();
    }

    public static final jyc i(jyc jycVar) {
        return jycVar instanceof rdy0 ? ((rdy0) jycVar).i : jycVar;
    }
}
