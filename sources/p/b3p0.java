package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class b3p0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ qmu a;

    public b3p0(qmu qmuVar) {
        this.a = qmuVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        a3p0 a3p0Var;
        x2p0 x2p0Var;
        if (onmVar instanceof a3p0) {
            a3p0Var = (a3p0) onmVar;
            int i = a3p0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                a3p0Var.b = i - Integer.MIN_VALUE;
            } else {
                a3p0Var = new a3p0(this, onmVar);
            }
        } else {
            a3p0Var = new a3p0(this, onmVar);
        }
        Object obj2 = a3p0Var.a;
        int i2 = a3p0Var.b;
        qmu qmuVar = this.a;
        rih1 rih1Var = d9n.a;
        rih1 rih1Var2 = rih1.a;
        if (i2 == 0) {
            hm5.M(obj2);
            x2p0Var = (x2p0) obj;
            a3p0Var.d = r261Var;
            a3p0Var.e = x2p0Var;
            a3p0Var.b = 1;
            cx80 cx80Var = qmuVar.d;
            if (cx80Var != null) {
                cx80Var.cancel();
            }
            nw80 nw80Var = (nw80) qmuVar.a.get();
            cx80 cx80VarD = nw80Var != null ? nw80Var.d(qmuVar.b) : null;
            qmuVar.d = cx80VarD;
            if (cx80VarD != null) {
                cx80VarD.d();
            }
            if (rih1Var2 != rih1Var) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(obj2);
                return rih1Var2;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        x2p0Var = a3p0Var.e;
        r261Var = a3p0Var.d;
        hm5.M(obj2);
        mr20 mr20Var = qmuVar.e;
        q5g0 q5g0Var = new q5g0(r261Var, (byte) 27);
        a3p0Var.d = null;
        a3p0Var.e = null;
        a3p0Var.b = 2;
        Object objCollect = mr20Var.collect(new ygi0(q5g0Var, x2p0Var, (byte) 19), a3p0Var);
        if (objCollect != rih1Var) {
            objCollect = rih1Var2;
        }
        return objCollect == rih1Var ? rih1Var : rih1Var2;
    }
}
