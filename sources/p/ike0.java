package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ike0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ nl51 a;
    public final /* synthetic */ esg b;

    public ike0(nl51 nl51Var, esg esgVar) {
        this.a = nl51Var;
        this.b = esgVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        hke0 hke0Var;
        if (onmVar instanceof hke0) {
            hke0Var = (hke0) onmVar;
            int i = hke0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                hke0Var.b = i - Integer.MIN_VALUE;
            } else {
                hke0Var = new hke0(this, onmVar);
            }
        } else {
            hke0Var = new hke0(this, onmVar);
        }
        Object obj2 = hke0Var.a;
        int i2 = hke0Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            bke0 bke0Var = (bke0) obj;
            nhe0 nhe0Var = bke0Var.c;
            String str = bke0Var.d;
            hke0Var.b = 1;
            Object objK = this.a.k(nhe0Var, str, hke0Var);
            d9n d9nVar = d9n.a;
            if (objK == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj2);
        }
        this.b.a.e();
        return rih1.a;
    }
}
