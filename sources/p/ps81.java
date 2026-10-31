package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ps81 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        os81 os81Var;
        if (onmVar instanceof os81) {
            os81Var = (os81) onmVar;
            int i = os81Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                os81Var.b = i - Integer.MIN_VALUE;
            } else {
                os81Var = new os81(this, onmVar);
            }
        } else {
            os81Var = new os81(this, onmVar);
        }
        Object obj2 = os81Var.a;
        int i2 = os81Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            os81Var.b = 1;
            Object objB = r261Var.b(ws81.a, os81Var);
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
