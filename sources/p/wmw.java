package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class wmw implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ ke71 a;

    public wmw(ke71 ke71Var) {
        this.a = ke71Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        vmw vmwVar;
        if (onmVar instanceof vmw) {
            vmwVar = (vmw) onmVar;
            int i = vmwVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                vmwVar.b = i - Integer.MIN_VALUE;
            } else {
                vmwVar = new vmw(this, onmVar);
            }
        } else {
            vmwVar = new vmw(this, onmVar);
        }
        Object obj2 = vmwVar.a;
        int i2 = vmwVar.b;
        if (i2 == 0) {
            hm5.M(obj2);
            ezc ezcVarF = h4p1.f(new q721(this.a, (jfw) obj, (lnm) null, (byte) 10));
            wmk wmkVar = new wmk(r261Var, (byte) 20);
            vmwVar.b = 1;
            Object objCollect = ezcVarF.collect(wmkVar, vmwVar);
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
