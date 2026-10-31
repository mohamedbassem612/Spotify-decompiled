package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ry80 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ bz80 a;

    public ry80(bz80 bz80Var) {
        this.a = bz80Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        qy80 qy80Var;
        tx80 tx80Var;
        if (onmVar instanceof qy80) {
            qy80Var = (qy80) onmVar;
            int i = qy80Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                qy80Var.b = i - Integer.MIN_VALUE;
            } else {
                qy80Var = new qy80(this, onmVar);
            }
        } else {
            qy80Var = new qy80(this, onmVar);
        }
        Object obj2 = qy80Var.a;
        int i2 = qy80Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            tx80 tx80Var2 = (tx80) obj;
            try {
                bz80 bz80Var = this.a;
                fq2 fq2Var = bz80Var.i;
                String str = tx80Var2.a;
                gp21 gp21Var = new gp21(473, "home_dj", (String) null, "spotify:home", (String) null, (String) null, (rq2) null, (tv80) null, new uya1(bz80Var.t.x() && tx80Var2.b, tx80Var2.c), false);
                qy80Var.d = tx80Var2;
                qy80Var.b = 1;
                Object objZ = fq2Var.z(str, gp21Var, qy80Var);
                d9n d9nVar = d9n.a;
                if (objZ == d9nVar) {
                    return d9nVar;
                }
            } catch (Exception e) {
                e = e;
                tx80Var = tx80Var2;
                n57.t("Effect handling failed for " + tx80Var, e);
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tx80Var = qy80Var.d;
            try {
                hm5.M(obj2);
            } catch (Exception e2) {
                e = e2;
                n57.t("Effect handling failed for " + tx80Var, e);
            }
        }
        return rih1.a;
    }
}
