package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ekw implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ hlw a;

    public ekw(hlw hlwVar) {
        this.a = hlwVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        xjw xjwVar;
        if (onmVar instanceof xjw) {
            xjwVar = (xjw) onmVar;
            int i = xjwVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                xjwVar.b = i - Integer.MIN_VALUE;
            } else {
                xjwVar = new xjw(this, onmVar);
            }
        } else {
            xjwVar = new xjw(this, onmVar);
        }
        Object obj2 = xjwVar.a;
        int i2 = xjwVar.b;
        lnm lnmVar = null;
        if (i2 == 0) {
            hm5.M(obj2);
            byte b = 3;
            lt20 lt20Var = new lt20(new huz(new p1e0(d3p1.F(this.a.d.a, pjj0.a, ((pbw) obj).a), (byte) 4), (byte) 27), new w1e0(b, lnmVar, b), (byte) 0);
            wmk wmkVar = new wmk(r261Var, (byte) 12);
            xjwVar.b = 1;
            Object objCollect = lt20Var.collect(wmkVar, xjwVar);
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
