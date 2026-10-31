package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bg71 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        ag71 ag71Var;
        if (onmVar instanceof ag71) {
            ag71Var = (ag71) onmVar;
            int i = ag71Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ag71Var.b = i - Integer.MIN_VALUE;
            } else {
                ag71Var = new ag71(this, onmVar);
            }
        } else {
            ag71Var = new ag71(this, onmVar);
        }
        Object obj2 = ag71Var.a;
        int i2 = ag71Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            mg71 mg71Var = new mg71(((bh71) obj).c, (String) null);
            ag71Var.b = 1;
            Object objB = r261Var.b(mg71Var, ag71Var);
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
