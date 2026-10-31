package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class e1h0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ iu30 a;

    public e1h0(iu30 iu30Var) {
        this.a = iu30Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        d1h0 d1h0Var;
        if (onmVar instanceof d1h0) {
            d1h0Var = (d1h0) onmVar;
            int i = d1h0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                d1h0Var.b = i - Integer.MIN_VALUE;
            } else {
                d1h0Var = new d1h0(this, onmVar);
            }
        } else {
            d1h0Var = new d1h0(this, onmVar);
        }
        Object obj2 = d1h0Var.a;
        int i2 = d1h0Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            mr20 mr20Var = (mr20) this.a.invoke((uzg0) obj);
            q5g0 q5g0Var = new q5g0(r261Var, (byte) 8);
            d1h0Var.b = 1;
            Object objCollect = mr20Var.collect(q5g0Var, d1h0Var);
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
