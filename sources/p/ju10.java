package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ju10 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ mu10 a;

    public ju10(mu10 mu10Var) {
        this.a = mu10Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        iu10 iu10Var;
        if (onmVar instanceof iu10) {
            iu10Var = (iu10) onmVar;
            int i = iu10Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                iu10Var.b = i - Integer.MIN_VALUE;
            } else {
                iu10Var = new iu10(this, onmVar);
            }
        } else {
            iu10Var = new iu10(this, onmVar);
        }
        Object obj2 = iu10Var.a;
        int i2 = iu10Var.b;
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
        xe01 xe01Var = this.a.d.b;
        cg00 cg00Var = new cg00(r261Var, (byte) 10);
        iu10Var.b = 1;
        Object objCollect = xe01Var.a.collect(new o010(cg00Var, (byte) 14), iu10Var);
        d9n d9nVar = d9n.a;
        if (objCollect != d9nVar) {
            objCollect = rih1Var;
        }
        return objCollect == d9nVar ? d9nVar : rih1Var;
    }
}
