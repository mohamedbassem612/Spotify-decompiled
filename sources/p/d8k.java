package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class d8k implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ hpd0 a;

    public d8k(hpd0 hpd0Var) {
        this.a = hpd0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        c8k c8kVar;
        if (onmVar instanceof c8k) {
            c8kVar = (c8k) onmVar;
            int i = c8kVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                c8kVar.b = i - Integer.MIN_VALUE;
            } else {
                c8kVar = new c8k(this, onmVar);
            }
        } else {
            c8kVar = new c8k(this, onmVar);
        }
        Object obj2 = c8kVar.a;
        int i2 = c8kVar.b;
        if (i2 == 0) {
            hm5.M(obj2);
            m441 m441Var = new m441(new vs0(this.a, (b7k) obj, false, (lnm) null, (byte) 29));
            z6f z6fVar = new z6f(r261Var, (byte) 14);
            c8kVar.b = 1;
            Object objCollect = m441Var.collect(z6fVar, c8kVar);
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
