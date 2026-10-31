package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xsa0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ mta0 a;

    public xsa0(mta0 mta0Var) {
        this.a = mta0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        wsa0 wsa0Var;
        if (onmVar instanceof wsa0) {
            wsa0Var = (wsa0) onmVar;
            int i = wsa0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                wsa0Var.b = i - Integer.MIN_VALUE;
            } else {
                wsa0Var = new wsa0(this, onmVar);
            }
        } else {
            wsa0Var = new wsa0(this, onmVar);
        }
        Object obj2 = wsa0Var.a;
        int i2 = wsa0Var.b;
        try {
            if (i2 == 0) {
                hm5.M(obj2);
                hsa0 hsa0Var = (hsa0) obj;
                fq2 fq2Var = this.a.b;
                String str = hsa0Var.a;
                wsa0Var.b = 1;
                Object objF = fq2Var.F(str, wsa0Var);
                d9n d9nVar = d9n.a;
                if (objF == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj2);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            n57.t("Failed to start a new cached conversation", e2);
        }
        return rih1.a;
    }
}
