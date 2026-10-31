package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class uoh1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ yoh1 a;

    public uoh1(yoh1 yoh1Var) {
        this.a = yoh1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        toh1 toh1Var;
        if (onmVar instanceof toh1) {
            toh1Var = (toh1) onmVar;
            int i = toh1Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                toh1Var.b = i - Integer.MIN_VALUE;
            } else {
                toh1Var = new toh1(this, onmVar);
            }
        } else {
            toh1Var = new toh1(this, onmVar);
        }
        Object obj2 = toh1Var.a;
        int i2 = toh1Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            m441 m441Var = new m441(new vxg1(this.a, (noh1) obj, (lnm) null, (byte) 6));
            aud1 aud1Var = new aud1(r261Var, (byte) 2);
            toh1Var.b = 1;
            Object objCollect = m441Var.collect(aud1Var, toh1Var);
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
