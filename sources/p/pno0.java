package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pno0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ qno0 a;

    public pno0(qno0 qno0Var) {
        this.a = qno0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        ono0 ono0Var;
        if (onmVar instanceof ono0) {
            ono0Var = (ono0) onmVar;
            int i = ono0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ono0Var.b = i - Integer.MIN_VALUE;
            } else {
                ono0Var = new ono0(this, onmVar);
            }
        } else {
            ono0Var = new ono0(this, onmVar);
        }
        Object obj2 = ono0Var.a;
        int i2 = ono0Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            m441 m441Var = new m441(new l4f0(this.a, (tlo0) obj, (lnm) null, (byte) 16));
            q5g0 q5g0Var = new q5g0(r261Var, (byte) 26);
            ono0Var.b = 1;
            Object objCollect = m441Var.collect(q5g0Var, ono0Var);
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
