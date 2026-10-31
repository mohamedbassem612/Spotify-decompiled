package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class umw implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ ke71 a;

    public umw(ke71 ke71Var) {
        this.a = ke71Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        tmw tmwVar;
        if (onmVar instanceof tmw) {
            tmwVar = (tmw) onmVar;
            int i = tmwVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                tmwVar.b = i - Integer.MIN_VALUE;
            } else {
                tmwVar = new tmw(this, onmVar);
            }
        } else {
            tmwVar = new tmw(this, onmVar);
        }
        Object obj2 = tmwVar.a;
        int i2 = tmwVar.b;
        if (i2 == 0) {
            hm5.M(obj2);
            ezc ezcVarF = h4p1.f(new q721((ifw) obj, this.a, (lnm) null, (byte) 9));
            wmk wmkVar = new wmk(r261Var, (byte) 19);
            tmwVar.b = 1;
            Object objCollect = ezcVarF.collect(wmkVar, tmwVar);
            d9n d9nVar = d9n.a;
            if (objCollect == d9nVar) {
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
