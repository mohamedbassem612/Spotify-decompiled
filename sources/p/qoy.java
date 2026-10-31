package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qoy implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ p811 a;
    public final /* synthetic */ xoy b;

    public qoy(p811 p811Var, xoy xoyVar) {
        this.a = p811Var;
        this.b = xoyVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        poy poyVar;
        uoy uoyVar;
        if (onmVar instanceof poy) {
            poyVar = (poy) onmVar;
            int i = poyVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                poyVar.b = i - Integer.MIN_VALUE;
            } else {
                poyVar = new poy(this, onmVar);
            }
        } else {
            poyVar = new poy(this, onmVar);
        }
        Object obj2 = poyVar.a;
        int i2 = poyVar.b;
        byte b = 1;
        if (i2 == 0) {
            hm5.M(obj2);
            aoy aoyVar = (aoy) obj;
            this.a.a = aoyVar.b;
            koy koyVar = aoyVar.a;
            xoy xoyVar = this.b;
            d0r d0rVar = xoyVar.t;
            int i3 = koyVar.b;
            String str = koyVar.a;
            int iC = l1d.C(i3);
            byte b2 = 0;
            if (iC == 0) {
                uoyVar = new uoy(d3p1.F(d0rVar, zoy.a, koyVar), xoyVar, koyVar, b2);
            } else if (iC == 1) {
                uoyVar = h5p1.r(d3p1.F(d0rVar, zoy.a, koyVar), d3p1.H(d0rVar, xoyVar.e.a, new e1q0(str)), d3p1.H(d0rVar, (o3r) xoyVar.f.d, new i1q0(str, str)), d3p1.H(d0rVar, xoyVar.g.b, new e1q0(str)), new woy(xoyVar, koyVar, (lnm) null, (byte) 0));
            } else {
                if (iC != 2) {
                    eg.o();
                    return null;
                }
                uoyVar = new uoy(d3p1.F(d0rVar, zoy.b, koyVar), xoyVar, koyVar, b);
            }
            wmk wmkVar = new wmk(r261Var, (byte) 27);
            poyVar.b = 1;
            Object objCollect = uoyVar.collect(wmkVar, poyVar);
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
