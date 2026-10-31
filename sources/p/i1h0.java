package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class i1h0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ b2h0 a;

    public i1h0(b2h0 b2h0Var) {
        this.a = b2h0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        h1h0 h1h0Var;
        if (onmVar instanceof h1h0) {
            h1h0Var = (h1h0) onmVar;
            int i = h1h0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                h1h0Var.b = i - Integer.MIN_VALUE;
            } else {
                h1h0Var = new h1h0(this, onmVar);
            }
        } else {
            h1h0Var = new h1h0(this, onmVar);
        }
        Object obj2 = h1h0Var.a;
        int i2 = h1h0Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            c0h0 c0h0Var = (c0h0) obj;
            b2h0 b2h0Var = this.a;
            h28 h28Var = b2h0Var.Y0;
            long j = c0h0Var.a;
            m441 m441Var = new m441(new k1e0(b2h0Var, c0h0Var, (lnm) null, (byte) 6));
            h28Var.getClass();
            bge bgeVarG = h4p1.g(new g28((Object) m441Var, (Object) h28Var, j, (lnm) null, (byte) 0));
            q5g0 q5g0Var = new q5g0(r261Var, (byte) 10);
            h1h0Var.b = 1;
            Object objCollect = bgeVarG.collect(q5g0Var, h1h0Var);
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
