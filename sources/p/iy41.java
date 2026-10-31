package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class iy41 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        hy41 hy41Var;
        if (onmVar instanceof hy41) {
            hy41Var = (hy41) onmVar;
            int i = hy41Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                hy41Var.b = i - Integer.MIN_VALUE;
            } else {
                hy41Var = new hy41(this, onmVar);
            }
        } else {
            hy41Var = new hy41(this, onmVar);
        }
        Object obj2 = hy41Var.a;
        int i2 = hy41Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            l151 l151Var = new l151(((fx41) obj).a);
            hy41Var.b = 1;
            Object objB = r261Var.b(l151Var, hy41Var);
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
