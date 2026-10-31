package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class woh1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ yoh1 a;

    public woh1(yoh1 yoh1Var) {
        this.a = yoh1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        voh1 voh1Var;
        if (onmVar instanceof voh1) {
            voh1Var = (voh1) onmVar;
            int i = voh1Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                voh1Var.b = i - Integer.MIN_VALUE;
            } else {
                voh1Var = new voh1(this, onmVar);
            }
        } else {
            voh1Var = new voh1(this, onmVar);
        }
        Object obj2 = voh1Var.a;
        int i2 = voh1Var.b;
        lnm lnmVar = null;
        if (i2 == 0) {
            hm5.M(obj2);
            lt20 lt20Var = new lt20(new m441(new xoh1(this.a, (moh1) obj, lnmVar, (byte) 0)), new q8t0(3, null, (byte) 28), (byte) 0);
            aud1 aud1Var = new aud1(r261Var, (byte) 3);
            voh1Var.b = 1;
            Object objCollect = lt20Var.collect(aud1Var, voh1Var);
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
