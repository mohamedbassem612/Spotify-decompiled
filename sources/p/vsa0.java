package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vsa0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ mta0 a;

    public vsa0(mta0 mta0Var) {
        this.a = mta0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        usa0 usa0Var;
        if (onmVar instanceof usa0) {
            usa0Var = (usa0) onmVar;
            int i = usa0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                usa0Var.b = i - Integer.MIN_VALUE;
            } else {
                usa0Var = new usa0(this, onmVar);
            }
        } else {
            usa0Var = new usa0(this, onmVar);
        }
        Object obj2 = usa0Var.a;
        int i2 = usa0Var.b;
        rih1 rih1Var = rih1.a;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    hm5.M(obj2);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj2);
            fq2 fq2Var = this.a.b;
            usa0Var.b = 1;
            Object objC = fq2Var.d.c(usa0Var);
            d9n d9nVar = d9n.a;
            if (objC != d9nVar) {
                objC = rih1Var;
            }
            return objC == d9nVar ? d9nVar : rih1Var;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            n57.t("Failed to clear cached response", e2);
            return rih1Var;
        }
    }
}
