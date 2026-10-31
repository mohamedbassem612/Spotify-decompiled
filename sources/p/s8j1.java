package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class s8j1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ x8j1 a;

    public s8j1(x8j1 x8j1Var) {
        this.a = x8j1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        r8j1 r8j1Var;
        if (onmVar instanceof r8j1) {
            r8j1Var = (r8j1) onmVar;
            int i = r8j1Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                r8j1Var.b = i - Integer.MIN_VALUE;
            } else {
                r8j1Var = new r8j1(this, onmVar);
            }
        } else {
            r8j1Var = new r8j1(this, onmVar);
        }
        Object obj2 = r8j1Var.a;
        int i2 = r8j1Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            m7j1 m7j1Var = (m7j1) obj;
            x8j1 x8j1Var = this.a;
            xkb1 xkb1Var = new xkb1(o4p1.l(x8j1Var.d.T(cto1.q(x8j1Var.e), m7j1Var.a, m7j1Var.b)), (byte) 12);
            aud1 aud1Var = new aud1(r261Var, (byte) 14);
            r8j1Var.b = 1;
            Object objCollect = xkb1Var.collect(aud1Var, r8j1Var);
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
