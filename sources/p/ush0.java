package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ush0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ xsh0 a;

    public ush0(xsh0 xsh0Var) {
        this.a = xsh0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        tsh0 tsh0Var;
        if (onmVar instanceof tsh0) {
            tsh0Var = (tsh0) onmVar;
            int i = tsh0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                tsh0Var.b = i - Integer.MIN_VALUE;
            } else {
                tsh0Var = new tsh0(this, onmVar);
            }
        } else {
            tsh0Var = new tsh0(this, onmVar);
        }
        Object obj2 = tsh0Var.a;
        int i2 = tsh0Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            zrh0 zrh0Var = new zrh0(this.a.a.b(((erh0) obj).a));
            tsh0Var.b = 1;
            Object objB = r261Var.b(zrh0Var, tsh0Var);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
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
