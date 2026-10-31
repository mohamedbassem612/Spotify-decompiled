package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class e731 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ g731 a;

    public e731(g731 g731Var) {
        this.a = g731Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        d731 d731Var;
        if (onmVar instanceof d731) {
            d731Var = (d731) onmVar;
            int i = d731Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                d731Var.b = i - Integer.MIN_VALUE;
            } else {
                d731Var = new d731(this, onmVar);
            }
        } else {
            d731Var = new d731(this, onmVar);
        }
        Object obj2 = d731Var.a;
        int i2 = d731Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            Set set = ((y631) obj).a;
            ow9 ow9Var = new ow9(rqt0.u(this.a.b.p(set)), set, (byte) 6);
            klp0 klp0Var = new klp0(r261Var, (byte) 16);
            d731Var.b = 1;
            Object objCollect = ow9Var.collect(klp0Var, d731Var);
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
