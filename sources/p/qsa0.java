package p;

import android.os.Bundle;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qsa0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ mta0 a;

    public qsa0(mta0 mta0Var) {
        this.a = mta0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        psa0 psa0Var;
        if (onmVar instanceof psa0) {
            psa0Var = (psa0) onmVar;
            int i = psa0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                psa0Var.b = i - Integer.MIN_VALUE;
            } else {
                psa0Var = new psa0(this, onmVar);
            }
        } else {
            psa0Var = new psa0(this, onmVar);
        }
        Object obj2 = psa0Var.a;
        int i2 = psa0Var.b;
        try {
            if (i2 == 0) {
                hm5.M(obj2);
                fsa0 fsa0Var = (fsa0) obj;
                boolean z = fsa0Var.c;
                mta0 mta0Var = this.a;
                Bundle bundleC = rrn1.C(z ? null : mta0Var.b.h(), fsa0Var.a, fsa0Var.b, fsa0Var.c, fsa0Var.d);
                fns fnsVar = igu.a;
                bs50 bs50Var = pyf0.a;
                y160 y160Var = new y160(mta0Var, bundleC, (lnm) null, (byte) 19);
                psa0Var.b = 1;
                Object objY = fn31.Y(bs50Var, y160Var, psa0Var);
                d9n d9nVar = d9n.a;
                if (objY == d9nVar) {
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
            n57.t("Failed to navigate to Martini chat", e2);
        }
        return rih1.a;
    }
}
