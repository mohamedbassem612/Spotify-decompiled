package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ab8 implements yt11 {
    public final /* synthetic */ byte a = 0;
    public final vgm b;
    public final lik1 c;
    public final Object d;
    public final Object e;

    public ab8(f1n0 f1n0Var, vgm vgmVar, Function0 function0, lik1 lik1Var) {
        this.d = f1n0Var;
        this.b = vgmVar;
        this.e = function0;
        this.c = lik1Var;
    }

    public final Object a(unb1 unb1Var, tv80 tv80Var, onm onmVar) {
        Object objF;
        String str;
        Object objH;
        byte b = this.a;
        d9n d9nVar = d9n.a;
        Object obj = this.d;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return ((unb1Var instanceof jmb1) && tv80Var != null && (objF = f1n0.f((f1n0) obj, ((jmb1) unb1Var).a.a, tv80Var, onmVar)) == d9nVar) ? objF : rih1Var;
            default:
                jmb1 jmb1Var = unb1Var instanceof jmb1 ? (jmb1) unb1Var : null;
                return (jmb1Var == null || (str = jmb1Var.a.d) == null || tv80Var == null || (objH = ((yzc0) obj).h(new uzc0(str), tv80Var, ejy0.a, onmVar)) != d9nVar) ? rih1Var : objH;
        }
    }

    public final s9d1 b() {
        switch (this.a) {
        }
        return null;
    }

    public final Object c(unb1 unb1Var, tv80 tv80Var, onm onmVar) {
        Object objY;
        byte b = this.a;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                if (!(unb1Var instanceof jmb1) || tv80Var == null) {
                    return rih1Var;
                }
                fns fnsVar = igu.a;
                Object objY2 = fn31.Y(pyf0.a.f, new hb1(this, unb1Var, tv80Var, (lnm) null, (byte) 22), onmVar);
                return objY2 == d9nVar ? objY2 : rih1Var;
            default:
                jmb1 jmb1Var = unb1Var instanceof jmb1 ? (jmb1) unb1Var : null;
                return (jmb1Var == null || tv80Var == null || (objY = fn31.Y((q8n) this.e, new ku91(this, jmb1Var, tv80Var, (lnm) null, (byte) 1), onmVar)) != d9nVar) ? rih1Var : objY;
        }
    }

    public ab8(yzc0 yzc0Var, vgm vgmVar, lik1 lik1Var, q8n q8nVar) {
        this.d = yzc0Var;
        this.b = vgmVar;
        this.c = lik1Var;
        this.e = q8nVar;
    }
}
