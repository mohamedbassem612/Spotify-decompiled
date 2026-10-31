package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jvf0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ kvf0 a;

    public jvf0(kvf0 kvf0Var) {
        this.a = kvf0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        ivf0 ivf0Var;
        if (onmVar instanceof ivf0) {
            ivf0Var = (ivf0) onmVar;
            int i = ivf0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ivf0Var.b = i - Integer.MIN_VALUE;
            } else {
                ivf0Var = new ivf0(this, onmVar);
            }
        } else {
            ivf0Var = new ivf0(this, onmVar);
        }
        Object obj2 = ivf0Var.a;
        int i2 = ivf0Var.b;
        lnm lnmVar = null;
        if (i2 == 0) {
            hm5.M(obj2);
            lt20 lt20Var = new lt20(new m441(new tfe0((Object) this.a.a, (Object) ((bvf0) obj).c, lnmVar, (byte) 9)), new i440(3, (lnm) null, (byte) 10), (byte) 0);
            cg00 cg00Var = new cg00(r261Var, (byte) 29);
            ivf0Var.b = 1;
            Object objCollect = lt20Var.collect(cg00Var, ivf0Var);
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
