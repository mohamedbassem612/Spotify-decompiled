package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class v7k implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ rm5 a;
    public final /* synthetic */ xrk b;

    public v7k(rm5 rm5Var, xrk xrkVar) {
        this.a = rm5Var;
        this.b = xrkVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        u7k u7kVar;
        if (onmVar instanceof u7k) {
            u7kVar = (u7k) onmVar;
            int i = u7kVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                u7kVar.b = i - Integer.MIN_VALUE;
            } else {
                u7kVar = new u7k(this, onmVar);
            }
        } else {
            u7kVar = new u7k(this, onmVar);
        }
        Object obj2 = u7kVar.a;
        int i2 = u7kVar.b;
        if (i2 == 0) {
            hm5.M(obj2);
            xrk xrkVar = this.b;
            m441 m441Var = new m441(new us0(this.a, (z6k) obj, xrkVar, (lnm) null, (byte) 20));
            z6f z6fVar = new z6f(r261Var, (byte) 10);
            u7kVar.b = 1;
            Object objCollect = m441Var.collect(z6fVar, u7kVar);
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
