package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ei60 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ ii60 a;

    public ei60(ii60 ii60Var) {
        this.a = ii60Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        di60 di60Var;
        if (onmVar instanceof di60) {
            di60Var = (di60) onmVar;
            int i = di60Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                di60Var.b = i - Integer.MIN_VALUE;
            } else {
                di60Var = new di60(this, onmVar);
            }
        } else {
            di60Var = new di60(this, onmVar);
        }
        Object obj2 = di60Var.a;
        int i2 = di60Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            ezc ezcVarF = h4p1.f(new f530(this.a, (ki60) obj, (lnm) null, (byte) 15));
            cg00 cg00Var = new cg00(r261Var, (byte) 15);
            di60Var.b = 1;
            Object objCollect = ezcVarF.collect(cg00Var, di60Var);
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
