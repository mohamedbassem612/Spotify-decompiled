package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class sw80 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ qmu a;

    public sw80(qmu qmuVar) {
        this.a = qmuVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        rw80 rw80Var;
        if (onmVar instanceof rw80) {
            rw80Var = (rw80) onmVar;
            int i = rw80Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                rw80Var.b = i - Integer.MIN_VALUE;
            } else {
                rw80Var = new rw80(this, onmVar);
            }
        } else {
            rw80Var = new rw80(this, onmVar);
        }
        Object obj2 = rw80Var.a;
        int i2 = rw80Var.b;
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
        mr20 mr20Var = this.a.e;
        cg00 cg00Var = new cg00(r261Var, (byte) 18);
        rw80Var.b = 1;
        Object objCollect = mr20Var.collect(new gw60(cg00Var, (byte) 22), rw80Var);
        d9n d9nVar = d9n.a;
        if (objCollect != d9nVar) {
            objCollect = rih1Var;
        }
        return objCollect == d9nVar ? d9nVar : rih1Var;
    }
}
