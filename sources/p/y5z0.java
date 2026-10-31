package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class y5z0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ ro30 a;

    public y5z0(ro30 ro30Var) {
        this.a = ro30Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        x5z0 x5z0Var;
        if (onmVar instanceof x5z0) {
            x5z0Var = (x5z0) onmVar;
            int i = x5z0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                x5z0Var.b = i - Integer.MIN_VALUE;
            } else {
                x5z0Var = new x5z0(this, onmVar);
            }
        } else {
            x5z0Var = new x5z0(this, onmVar);
        }
        Object obj2 = x5z0Var.a;
        int i2 = x5z0Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            ro30 ro30Var = this.a;
            lt20 lt20Var = new lt20(new h5y0(new lt20(new u70(((c9c0) ((g23) ro30Var.b).b).b.current(), (byte) 14), new vv70(ro30Var, (lnm) null, (byte) 2), (byte) 0), (byte) 9), new ob00(3, null, (byte) 25), (byte) 0);
            klp0 klp0Var = new klp0(r261Var, (byte) 12);
            x5z0Var.b = 1;
            Object objCollect = lt20Var.collect(klp0Var, x5z0Var);
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
