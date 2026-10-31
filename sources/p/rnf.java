package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class rnf implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ mwn0 a;
    public final /* synthetic */ ynb0 b;

    public rnf(mwn0 mwn0Var, ynb0 ynb0Var) {
        this.a = mwn0Var;
        this.b = ynb0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        qnf qnfVar;
        if (onmVar instanceof qnf) {
            qnfVar = (qnf) onmVar;
            int i = qnfVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                qnfVar.b = i - Integer.MIN_VALUE;
            } else {
                qnfVar = new qnf(this, onmVar);
            }
        } else {
            qnfVar = new qnf(this, onmVar);
        }
        Object obj2 = qnfVar.a;
        int i2 = qnfVar.b;
        if (i2 == 0) {
            hm5.M(obj2);
            onf onfVar = (onf) obj;
            Set set = s4b1.f;
            String strE = pcf.e(uic.x(uic.x(onfVar.a).j()));
            tv80 tv80Var = onfVar.c;
            if (tv80Var != null) {
                lsn0 lsn0Var = new lsn0(strE, tv80Var.a);
                mwn0 mwn0Var = this.a;
                mwn0Var.e(lsn0Var);
                mwn0Var.f(lsn0Var);
            }
            qir0 qir0Var = new qir0(strE);
            t8h1 t8h1Var = (t8h1) this.b.get();
            if (t8h1Var != null) {
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                t8h1.l(t8h1Var, yon1.C0(), qir0Var);
            }
            ynf ynfVar = new ynf(onfVar.b);
            qnfVar.b = 1;
            Object objB = r261Var.b(ynfVar, qnfVar);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj2);
        }
        return rih1.a;
    }
}
