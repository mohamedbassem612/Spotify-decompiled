package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wxt implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        vxt vxtVar;
        if (onmVar instanceof vxt) {
            vxtVar = (vxt) onmVar;
            int i = vxtVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                vxtVar.b = i - Integer.MIN_VALUE;
            } else {
                vxtVar = new vxt(this, onmVar);
            }
        } else {
            vxtVar = new vxt(this, onmVar);
        }
        Object obj2 = vxtVar.a;
        int i2 = vxtVar.b;
        if (i2 == 0) {
            hm5.M(obj2);
            vxtVar.b = 1;
            Object objB = r261Var.b(yxt.a, vxtVar);
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
