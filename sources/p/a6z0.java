package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class a6z0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ ro30 a;

    public a6z0(ro30 ro30Var) {
        this.a = ro30Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        z5z0 z5z0Var;
        if (onmVar instanceof z5z0) {
            z5z0Var = (z5z0) onmVar;
            int i = z5z0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                z5z0Var.b = i - Integer.MIN_VALUE;
            } else {
                z5z0Var = new z5z0(this, onmVar);
            }
        } else {
            z5z0Var = new z5z0(this, onmVar);
        }
        Object obj2 = z5z0Var.a;
        int i2 = z5z0Var.b;
        rih1 rih1Var = rih1.a;
        if (i2 != 0) {
            if (i2 == 1) {
                hm5.M(obj2);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj2);
        mr20 mr20VarR = ((goq) this.a.b).r();
        klp0 klp0Var = new klp0(r261Var, (byte) 13);
        z5z0Var.b = 1;
        Object objCollect = mr20VarR.collect(new g6z0(klp0Var, (byte) 0), z5z0Var);
        d9n d9nVar = d9n.a;
        if (objCollect != d9nVar) {
            objCollect = rih1Var;
        }
        return objCollect == d9nVar ? d9nVar : rih1Var;
    }
}
