package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lno0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ qno0 a;

    public lno0(qno0 qno0Var) {
        this.a = qno0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        kno0 kno0Var;
        if (onmVar instanceof kno0) {
            kno0Var = (kno0) onmVar;
            int i = kno0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                kno0Var.b = i - Integer.MIN_VALUE;
            } else {
                kno0Var = new kno0(this, onmVar);
            }
        } else {
            kno0Var = new kno0(this, onmVar);
        }
        Object obj2 = kno0Var.a;
        int i2 = kno0Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            m441 m441Var = new m441(new l4f0(this.a, (tlo0) obj, (lnm) null, (byte) 16));
            q5g0 q5g0Var = new q5g0(r261Var, (byte) 24);
            kno0Var.b = 1;
            Object objCollect = m441Var.collect(q5g0Var, kno0Var);
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
