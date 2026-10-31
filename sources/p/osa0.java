package p;

import android.os.Bundle;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class osa0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        nsa0 nsa0Var;
        if (onmVar instanceof nsa0) {
            nsa0Var = (nsa0) onmVar;
            int i = nsa0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                nsa0Var.b = i - Integer.MIN_VALUE;
            } else {
                nsa0Var = new nsa0(this, onmVar);
            }
        } else {
            nsa0Var = new nsa0(this, onmVar);
        }
        Object obj2 = nsa0Var.a;
        int i2 = nsa0Var.b;
        try {
            try {
                if (i2 != 0) {
                    if (i2 == 1) {
                        hm5.M(obj2);
                        return rih1.a;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj2);
                if (obj != null) {
                    bhn0.d();
                    return null;
                }
                new Bundle();
                throw null;
            } catch (Exception e) {
                n57.t("Failed to navigate to Martini", e);
            }
        } catch (CancellationException e2) {
            throw e2;
        }
    }
}
