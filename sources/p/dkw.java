package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dkw implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ glw a;

    public dkw(glw glwVar) {
        this.a = glwVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        wjw wjwVar;
        if (onmVar instanceof wjw) {
            wjwVar = (wjw) onmVar;
            int i = wjwVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                wjwVar.b = i - Integer.MIN_VALUE;
            } else {
                wjwVar = new wjw(this, onmVar);
            }
        } else {
            wjwVar = new wjw(this, onmVar);
        }
        Object obj2 = wjwVar.a;
        int i2 = wjwVar.b;
        lnm lnmVar = null;
        if (i2 == 0) {
            hm5.M(obj2);
            lt20 lt20Var = new lt20(new huz(new p1e0(d3p1.F((d0r) this.a.d.b, qjj0.a, ((obw) obj).a), (byte) 5), (byte) 28), new w1e0(3, lnmVar, (byte) 4), (byte) 0);
            wmk wmkVar = new wmk(r261Var, (byte) 11);
            wjwVar.b = 1;
            Object objCollect = lt20Var.collect(wmkVar, wjwVar);
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
