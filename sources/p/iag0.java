package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class iag0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ mag0 a;

    public iag0(mag0 mag0Var) {
        this.a = mag0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        hag0 hag0Var;
        if (onmVar instanceof hag0) {
            hag0Var = (hag0) onmVar;
            int i = hag0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                hag0Var.b = i - Integer.MIN_VALUE;
            } else {
                hag0Var = new hag0(this, onmVar);
            }
        } else {
            hag0Var = new hag0(this, onmVar);
        }
        Object obj2 = hag0Var.a;
        int i2 = hag0Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            cag0 cag0Var = (cag0) obj;
            lt20 lt20Var = new lt20(new m441(new l4f0(this.a, cag0Var, (lnm) null, (byte) 2)), new ew0(cag0Var, (lnm) null, (byte) 29), (byte) 0);
            q5g0 q5g0Var = new q5g0(r261Var, (byte) 4);
            hag0Var.b = 1;
            Object objCollect = lt20Var.collect(q5g0Var, hag0Var);
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
