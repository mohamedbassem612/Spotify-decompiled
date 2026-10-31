package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jkw implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ glw a;

    public jkw(glw glwVar) {
        this.a = glwVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        gkw gkwVar;
        lt20 huzVar;
        if (onmVar instanceof gkw) {
            gkwVar = (gkw) onmVar;
            int i = gkwVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                gkwVar.b = i - Integer.MIN_VALUE;
            } else {
                gkwVar = new gkw(this, onmVar);
            }
        } else {
            gkwVar = new gkw(this, onmVar);
        }
        Object obj2 = gkwVar.a;
        int i2 = gkwVar.b;
        lnm lnmVar = null;
        if (i2 == 0) {
            hm5.M(obj2);
            v6a0 v6a0Var = this.a.e;
            String str = ((jbw) obj).a;
            byte b = 10;
            if (z6b1.b(str)) {
                boolean zC = z6b1.c(str);
                d0r d0rVar = (d0r) v6a0Var.b;
                huzVar = zC ? new lt20(new b8d0(new p1e0(d3p1.F(d0rVar, oxc0.a, str), (byte) 3), v6a0Var, b), new w1e0(3, lnmVar, (byte) 0), (byte) 0) : new lt20(new huz(new p1e0(d3p1.F(d0rVar, jbm.a, str), (byte) 1), (byte) 25), new rf2(3, (lnm) null, (byte) 28), (byte) 0);
            } else {
                huzVar = new huz(bw00.a, (byte) 10);
            }
            wmk wmkVar = new wmk(r261Var, (byte) 14);
            gkwVar.b = 1;
            Object objCollect = huzVar.collect(wmkVar, gkwVar);
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
