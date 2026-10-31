package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class x2m implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ tn01 a;

    public x2m(tn01 tn01Var) {
        this.a = tn01Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        w2m w2mVar;
        if (onmVar instanceof w2m) {
            w2mVar = (w2m) onmVar;
            int i = w2mVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                w2mVar.b = i - Integer.MIN_VALUE;
            } else {
                w2mVar = new w2m(this, onmVar);
            }
        } else {
            w2mVar = new w2m(this, onmVar);
        }
        Object obj2 = w2mVar.a;
        int i2 = w2mVar.b;
        try {
            if (i2 == 0) {
                hm5.M(obj2);
                z1m z1mVar = (z1m) obj;
                tn01 tn01Var = this.a;
                hby hbyVar = z1mVar.a;
                w2mVar.b = 1;
                Object objC = tn01Var.c(hbyVar, w2mVar);
                d9n d9nVar = d9n.a;
                if (objC == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj2);
            }
        } catch (Exception e) {
            Logger.e(e, "ChatContentPicker: Failed to save recent search", new Object[0]);
        }
        return rih1.a;
    }
}
