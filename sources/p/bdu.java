package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bdu implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ cdu a;

    public bdu(cdu cduVar) {
        this.a = cduVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        adu aduVar;
        if (onmVar instanceof adu) {
            aduVar = (adu) onmVar;
            int i = aduVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                aduVar.b = i - Integer.MIN_VALUE;
            } else {
                aduVar = new adu(this, onmVar);
            }
        } else {
            aduVar = new adu(this, onmVar);
        }
        Object obj2 = aduVar.a;
        int i2 = aduVar.b;
        if (i2 == 0) {
            hm5.M(obj2);
            m441 m441Var = new m441(new d6((ucu) obj, this.a.b, (lnm) null, (byte) 8));
            wmk wmkVar = new wmk(r261Var, (byte) 3);
            aduVar.b = 1;
            Object objCollect = m441Var.collect(wmkVar, aduVar);
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
