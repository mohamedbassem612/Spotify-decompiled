package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gta0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ mta0 a;

    public gta0(mta0 mta0Var) {
        this.a = mta0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        fta0 fta0Var;
        if (onmVar instanceof fta0) {
            fta0Var = (fta0) onmVar;
            int i = fta0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                fta0Var.b = i - Integer.MIN_VALUE;
            } else {
                fta0Var = new fta0(this, onmVar);
            }
        } else {
            fta0Var = new fta0(this, onmVar);
        }
        Object obj2 = fta0Var.a;
        int i2 = fta0Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            pra0 pra0Var = new pra0(this.a.i.a());
            fta0Var.b = 1;
            Object objB = r261Var.b(pra0Var, fta0Var);
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
