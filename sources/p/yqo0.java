package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yqo0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ cro0 a;

    public yqo0(cro0 cro0Var) {
        this.a = cro0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        xqo0 xqo0Var;
        if (onmVar instanceof xqo0) {
            xqo0Var = (xqo0) onmVar;
            int i = xqo0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                xqo0Var.b = i - Integer.MIN_VALUE;
            } else {
                xqo0Var = new xqo0(this, onmVar);
            }
        } else {
            xqo0Var = new xqo0(this, onmVar);
        }
        Object obj2 = xqo0Var.a;
        int i2 = xqo0Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            cro0 cro0Var = this.a;
            dto0 dto0Var = cro0Var.d;
            hro0 hro0Var = new hro0(dto0Var.a.g(cro0Var.a));
            xqo0Var.b = 1;
            Object objB = r261Var.b(hro0Var, xqo0Var);
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
