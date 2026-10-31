package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class pz90 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ ro30 a;

    public pz90(ro30 ro30Var) {
        this.a = ro30Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        oz90 oz90Var;
        if (onmVar instanceof oz90) {
            oz90Var = (oz90) onmVar;
            int i = oz90Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                oz90Var.b = i - Integer.MIN_VALUE;
            } else {
                oz90Var = new oz90(this, onmVar);
            }
        } else {
            oz90Var = new oz90(this, onmVar);
        }
        Object obj2 = oz90Var.a;
        int i2 = oz90Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            lt20 lt20Var = new lt20(new ry50(this.a.r(), (byte) 19), new i440(3, (lnm) null, (byte) 2), (byte) 0);
            cg00 cg00Var = new cg00(r261Var, (byte) 20);
            oz90Var.b = 1;
            Object objCollect = lt20Var.collect(cg00Var, oz90Var);
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
