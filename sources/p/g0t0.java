package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class g0t0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ l0t0 a;

    public g0t0(l0t0 l0t0Var) {
        this.a = l0t0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        f0t0 f0t0Var;
        if (onmVar instanceof f0t0) {
            f0t0Var = (f0t0) onmVar;
            int i = f0t0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                f0t0Var.b = i - Integer.MIN_VALUE;
            } else {
                f0t0Var = new f0t0(this, onmVar);
            }
        } else {
            f0t0Var = new f0t0(this, onmVar);
        }
        Object obj2 = f0t0Var.a;
        int i2 = f0t0Var.b;
        rih1 rih1Var = rih1.a;
        if (i2 != 0) {
            if (i2 == 1) {
                hm5.M(obj2);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj2);
        ytp0 ytp0Var = this.a.a;
        qes qesVar = (qes) ytp0Var.c;
        ima1 ima1Var = qesVar.a;
        mr20 mr20VarU = rqt0.u(new ht20(new wef(c4p1.F(ima1Var.o(), ima1Var, o1t0.b, h9a1.X0), (byte) 27), new n5s(qesVar, (lnm) null, (byte) 5)));
        klp0 klp0Var = new klp0(r261Var, (byte) 2);
        f0t0Var.b = 1;
        Object objCollect = mr20VarU.collect(new xhr0(new s4q0(klp0Var, ytp0Var, (byte) 8), (byte) 29), f0t0Var);
        d9n d9nVar = d9n.a;
        if (objCollect != d9nVar) {
            objCollect = rih1Var;
        }
        if (objCollect != d9nVar) {
            objCollect = rih1Var;
        }
        return objCollect == d9nVar ? d9nVar : rih1Var;
    }
}
