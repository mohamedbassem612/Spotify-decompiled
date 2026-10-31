package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class aak implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ xrk a;
    public final /* synthetic */ uu00 b;
    public final /* synthetic */ q8n c;

    public aak(xrk xrkVar, uu00 uu00Var, q8n q8nVar) {
        this.a = xrkVar;
        this.b = uu00Var;
        this.c = q8nVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        z9k z9kVar;
        mr20 huzVar;
        if (onmVar instanceof z9k) {
            z9kVar = (z9k) onmVar;
            int i = z9kVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                z9kVar.b = i - Integer.MIN_VALUE;
            } else {
                z9kVar = new z9k(this, onmVar);
            }
        } else {
            z9kVar = new z9k(this, onmVar);
        }
        Object obj2 = z9kVar.a;
        int i2 = z9kVar.b;
        if (i2 == 0) {
            hm5.M(obj2);
            s9k s9kVar = (s9k) obj;
            xrk xrkVar = this.a;
            if (xrkVar.b) {
                o3r o3rVar = hr21.a;
                huzVar = o4p1.r(rqt0.u(new mgb(hr21.b(s9kVar.a, this.b), xrkVar, (byte) 28)), this.c);
            } else {
                huzVar = new huz(new yak(false), (byte) 10);
            }
            z6f z6fVar = new z6f(r261Var, (byte) 17);
            z9kVar.b = 1;
            Object objCollect = huzVar.collect(z6fVar, z9kVar);
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
