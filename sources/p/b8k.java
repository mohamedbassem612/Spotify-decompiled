package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class b8k implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ yqg a;

    public b8k(yqg yqgVar) {
        this.a = yqgVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        a8k a8kVar;
        if (onmVar instanceof a8k) {
            a8kVar = (a8k) onmVar;
            int i = a8kVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                a8kVar.b = i - Integer.MIN_VALUE;
            } else {
                a8kVar = new a8k(this, onmVar);
            }
        } else {
            a8kVar = new a8k(this, onmVar);
        }
        Object obj2 = a8kVar.a;
        int i2 = a8kVar.b;
        if (i2 == 0) {
            hm5.M(obj2);
            m441 m441Var = new m441(new d6((e7k) obj, this.a, (lnm) null, (byte) 3));
            z6f z6fVar = new z6f(r261Var, (byte) 13);
            a8kVar.b = 1;
            Object objCollect = m441Var.collect(z6fVar, a8kVar);
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
