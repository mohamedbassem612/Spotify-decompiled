package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class tnf implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ mwn0 a;
    public final /* synthetic */ ynb0 b;

    public tnf(mwn0 mwn0Var, ynb0 ynb0Var) {
        this.a = mwn0Var;
        this.b = ynb0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        snf snfVar;
        t8h1 t8h1Var;
        if (onmVar instanceof snf) {
            snfVar = (snf) onmVar;
            int i = snfVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                snfVar.b = i - Integer.MIN_VALUE;
            } else {
                snfVar = new snf(this, onmVar);
            }
        } else {
            snfVar = new snf(this, onmVar);
        }
        Object obj2 = snfVar.a;
        int i2 = snfVar.b;
        if (i2 == 0) {
            hm5.M(obj2);
            yrn0 yrn0Var = new yrn0((ou80) null);
            mwn0 mwn0Var = this.a;
            mwn0Var.e(yrn0Var);
            mwn0Var.f(yrn0Var);
            String str = ((nnf) obj).a;
            qir0 qir0Var = str != null ? new qir0(str) : null;
            if (qir0Var != null && (t8h1Var = (t8h1) this.b.get()) != null) {
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                t8h1.l(t8h1Var, yon1.C0(), qir0Var);
            }
            snfVar.b = 1;
            Object objB = r261Var.b(xnf.a, snfVar);
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
