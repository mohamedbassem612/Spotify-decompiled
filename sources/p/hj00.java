package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hj00 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ jj00 a;

    public hj00(jj00 jj00Var) {
        this.a = jj00Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        gj00 gj00Var;
        if (onmVar instanceof gj00) {
            gj00Var = (gj00) onmVar;
            int i = gj00Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                gj00Var.b = i - Integer.MIN_VALUE;
            } else {
                gj00Var = new gj00(this, onmVar);
            }
        } else {
            gj00Var = new gj00(this, onmVar);
        }
        Object obj2 = gj00Var.a;
        int i2 = gj00Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            jj00 jj00Var = this.a;
            any anyVar = new any(rqt0.u(yoi1.g(jj00Var.a.a(jj00Var.b.a).a(((skl) obj).a))), (byte) 9);
            cg00 cg00Var = new cg00(r261Var, (byte) 3);
            gj00Var.b = 1;
            Object objCollect = anyVar.collect(cg00Var, gj00Var);
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
