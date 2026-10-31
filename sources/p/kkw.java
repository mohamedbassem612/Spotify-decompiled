package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kkw implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ hlw a;

    public kkw(hlw hlwVar) {
        this.a = hlwVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        hkw hkwVar;
        lt20 huzVar;
        if (onmVar instanceof hkw) {
            hkwVar = (hkw) onmVar;
            int i = hkwVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                hkwVar.b = i - Integer.MIN_VALUE;
            } else {
                hkwVar = new hkw(this, onmVar);
            }
        } else {
            hkwVar = new hkw(this, onmVar);
        }
        Object obj2 = hkwVar.a;
        int i2 = hkwVar.b;
        if (i2 == 0) {
            hm5.M(obj2);
            fad0 fad0Var = this.a.e;
            String str = ((ibw) obj).a;
            if (z6b1.b(str)) {
                boolean zC = z6b1.c(str);
                d0r d0rVar = (d0r) fad0Var.b;
                huzVar = zC ? new lt20(new b8d0(new p1e0(d3p1.F(d0rVar, nxc0.a, str), (byte) 2), fad0Var, (byte) 9), new rf2(3, (lnm) null, (byte) 29), (byte) 0) : new lt20(new huz(new p1e0(d3p1.F(d0rVar, ibm.a, str), (byte) 0), (byte) 24), new rf2(3, (lnm) null, (byte) 27), (byte) 0);
            } else {
                huzVar = new huz(j5i1.a, (byte) 10);
            }
            wmk wmkVar = new wmk(r261Var, (byte) 15);
            hkwVar.b = 1;
            Object objCollect = huzVar.collect(wmkVar, hkwVar);
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
