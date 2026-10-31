package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class c1h0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ iu30 a;

    public c1h0(iu30 iu30Var) {
        this.a = iu30Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        b1h0 b1h0Var;
        if (onmVar instanceof b1h0) {
            b1h0Var = (b1h0) onmVar;
            int i = b1h0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                b1h0Var.b = i - Integer.MIN_VALUE;
            } else {
                b1h0Var = new b1h0(this, onmVar);
            }
        } else {
            b1h0Var = new b1h0(this, onmVar);
        }
        Object obj2 = b1h0Var.a;
        int i2 = b1h0Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            mr20 mr20Var = (mr20) this.a.invoke((rzg0) obj);
            q5g0 q5g0Var = new q5g0(r261Var, (byte) 7);
            b1h0Var.b = 1;
            Object objCollect = mr20Var.collect(q5g0Var, b1h0Var);
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
