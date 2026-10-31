package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bud1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ fud1 a;

    public bud1(fud1 fud1Var) {
        this.a = fud1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        ztd1 ztd1Var;
        if (onmVar instanceof ztd1) {
            ztd1Var = (ztd1) onmVar;
            int i = ztd1Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ztd1Var.b = i - Integer.MIN_VALUE;
            } else {
                ztd1Var = new ztd1(this, onmVar);
            }
        } else {
            ztd1Var = new ztd1(this, onmVar);
        }
        Object obj2 = ztd1Var.a;
        int i2 = ztd1Var.b;
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
        ve01 ve01Var = this.a.b.b;
        aud1 aud1Var = new aud1(r261Var, (byte) 0);
        ztd1Var.b = 1;
        Object objCollect = ve01Var.a.collect(new qmd1(aud1Var, (byte) 4), ztd1Var);
        d9n d9nVar = d9n.a;
        if (objCollect != d9nVar) {
            objCollect = rih1Var;
        }
        return objCollect == d9nVar ? d9nVar : rih1Var;
    }
}
