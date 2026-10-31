package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class dgd1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ l7m0 a;
    public final /* synthetic */ myq0 b;

    public dgd1(l7m0 l7m0Var, myq0 myq0Var) {
        this.a = l7m0Var;
        this.b = myq0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        cgd1 cgd1Var;
        if (onmVar instanceof cgd1) {
            cgd1Var = (cgd1) onmVar;
            int i = cgd1Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                cgd1Var.b = i - Integer.MIN_VALUE;
            } else {
                cgd1Var = new cgd1(this, onmVar);
            }
        } else {
            cgd1Var = new cgd1(this, onmVar);
        }
        Object obj2 = cgd1Var.a;
        int i2 = cgd1Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            List listM = p7h.M(new xgd1[]{new xgd1(new kwc(2131963016), 2131233208, 2131232002, 1, ypn0.a), new xgd1(new kwc(2131963017), 2131233213, 2131232776, ((k84) this.a.b).k() ? 1 : 2, lqn0.a), new xgd1(new kwc(2131963015), 2131233204, 2131231521, 1, upn0.a), new xgd1(new kwc(2131963018), 2131233216, 2131231656, 2, cqn0.a)});
            sgd1 sgd1Var = new sgd1(listM);
            this.b.n(((xgd1) o7h.q0(listM)).e.getUri());
            cgd1Var.b = 1;
            Object objB = r261Var.b(sgd1Var, cgd1Var);
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
