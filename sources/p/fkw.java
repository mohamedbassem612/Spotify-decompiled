package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fkw implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ alw a;

    public fkw(alw alwVar) {
        this.a = alwVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        yjw yjwVar;
        if (onmVar instanceof yjw) {
            yjwVar = (yjw) onmVar;
            int i = yjwVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                yjwVar.b = i - Integer.MIN_VALUE;
            } else {
                yjwVar = new yjw(this, onmVar);
            }
        } else {
            yjwVar = new yjw(this, onmVar);
        }
        Object obj2 = yjwVar.a;
        int i2 = yjwVar.b;
        byte b = 1;
        lnm lnmVar = null;
        if (i2 == 0) {
            hm5.M(obj2);
            lt20 lt20Var = new lt20(new k6e0(new k6e0(new p1e0(d3p1.F((d0r) this.a.c.b, xei1.a, ((sbw) obj).a), (byte) 6), (byte) 0), b), new w1e0(3, lnmVar, (byte) 6), (byte) 0);
            wmk wmkVar = new wmk(r261Var, (byte) 13);
            yjwVar.b = 1;
            Object objCollect = lt20Var.collect(wmkVar, yjwVar);
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
