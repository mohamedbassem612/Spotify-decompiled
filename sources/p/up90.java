package p;

import io.reactivex.rxjava3.core.Single;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class up90 {
    public final c9c0 a;
    public final sjb1 b;
    public final tq90 c;
    public final t0a0 d;
    public final lx91 e;

    public up90(c9c0 c9c0Var, sjb1 sjb1Var, tq90 tq90Var, t0a0 t0a0Var, lx91 lx91Var) {
        this.a = c9c0Var;
        this.b = sjb1Var;
        this.c = tq90Var;
        this.d = t0a0Var;
        this.e = lx91Var;
    }

    public final int a(hr90 hr90Var, boolean z) {
        pp90 pp90Var = (pp90) this.a.b.current().getValue();
        if (pp90Var == null) {
            return 2;
        }
        if (!z) {
            this.c.a(pp90Var, hr90Var);
            return 1;
        }
        boolean z2 = pp90Var.h.b.e;
        xx91 xx91Var = this.e;
        if (z2) {
            xx91Var.p.onNext(new n3a1(hr90Var));
            return 1;
        }
        xx91Var.p.onNext(new z3a1(hr90Var));
        return 1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, onm onmVar) {
        qp90 qp90Var;
        if (onmVar instanceof qp90) {
            qp90Var = (qp90) onmVar;
            int i = qp90Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qp90Var.c = i - Integer.MIN_VALUE;
            } else {
                qp90Var = new qp90(this, onmVar);
            }
        } else {
            qp90Var = new qp90(this, onmVar);
        }
        Object objA = qp90Var.a;
        int i2 = qp90Var.c;
        if (i2 == 0) {
            hm5.M(objA);
            pp90 pp90Var = (pp90) this.a.b.current().getValue();
            if (pp90Var == null) {
                return ra21.a;
            }
            qp90Var.c = 1;
            objA = this.d.a(pp90Var, str, qp90Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objA);
        }
        return ((Boolean) objA).booleanValue() ? sa21.a : qa21.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, onm onmVar) {
        rp90 rp90Var;
        if (onmVar instanceof rp90) {
            rp90Var = (rp90) onmVar;
            int i = rp90Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                rp90Var.c = i - Integer.MIN_VALUE;
            } else {
                rp90Var = new rp90(this, onmVar);
            }
        } else {
            rp90Var = new rp90(this, onmVar);
        }
        Object objB = rp90Var.a;
        int i2 = rp90Var.c;
        if (i2 == 0) {
            hm5.M(objB);
            rp90Var.c = 1;
            objB = b(str, rp90Var);
            Object obj = d9n.a;
            if (objB == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objB);
        }
        return Boolean.valueOf(u890.j(objB, sa21.a));
    }

    public final al61 d(Function0 function0) {
        if (((pp90) this.a.b.current().getValue()) == null) {
            return yk61.a;
        }
        try {
            function0.invoke();
            return zk61.a;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            return new xk61(e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(pjb1 pjb1Var, fjb1 fjb1Var, onm onmVar) {
        tp90 tp90Var;
        if (onmVar instanceof tp90) {
            tp90Var = (tp90) onmVar;
            int i = tp90Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tp90Var.c = i - Integer.MIN_VALUE;
            } else {
                tp90Var = new tp90(this, onmVar);
            }
        } else {
            tp90Var = new tp90(this, onmVar);
        }
        Object objJ = tp90Var.a;
        int i2 = tp90Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            Single singleB = this.b.b(pjb1Var, fjb1Var);
            tp90Var.c = 1;
            objJ = fc11.j(singleB, tp90Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        return objJ;
    }
}
