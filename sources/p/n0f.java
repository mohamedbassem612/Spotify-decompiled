package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class n0f implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ o0f a;

    public n0f(o0f o0fVar) {
        this.a = o0fVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        m0f m0fVar;
        if (onmVar instanceof m0f) {
            m0fVar = (m0f) onmVar;
            int i = m0fVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                m0fVar.b = i - Integer.MIN_VALUE;
            } else {
                m0fVar = new m0f(this, onmVar);
            }
        } else {
            m0fVar = new m0f(this, onmVar);
        }
        Object obj2 = m0fVar.a;
        int i2 = m0fVar.b;
        lnm lnmVar = null;
        if (i2 == 0) {
            hm5.M(obj2);
            kye kyeVar = (kye) obj;
            ip31 ip31Var = this.a.r;
            String str = kyeVar.a;
            boolean z = kyeVar.b;
            jed0 jed0Var = (jed0) ip31Var.c;
            lmf lmfVar = new lmf(jed0Var.b(), (byte) 3);
            cg60 cg60Var = new cg60(jed0Var.d(), (byte) 3);
            gqo0 gqo0Var = (gqo0) ip31Var.h;
            mr20 mr20VarK = gqo0Var.k(pcf.d(6, str, (String) null), new dqo0(gqo0Var, null, (byte) 1));
            fpf fpfVar = (fpf) ip31Var.d;
            lt20 lt20Var = new lt20(new mnc0(rqt0.u(h5p1.q(lmfVar, cg60Var, mr20VarK, rqt0.u(new ht20(new wef(fpfVar.b.s(fpf.h), (byte) 2), new hsc(fpfVar, lnmVar, (byte) 20))), (wen0) fpfVar.c.getValue(), new pfd0(ip31Var, z, str, null))), (byte) 16), new rf2(3, (lnm) null, (byte) 24), (byte) 0);
            k91 k91Var = new k91(r261Var, (byte) 29);
            m0fVar.b = 1;
            Object objCollect = lt20Var.collect(k91Var, m0fVar);
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
