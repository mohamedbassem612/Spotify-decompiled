package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tsa0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ mta0 a;

    public tsa0(mta0 mta0Var) {
        this.a = mta0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.coroutines.flow.internal.AbortFlowException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) throws AbortFlowException {
        ssa0 ssa0Var;
        if (onmVar instanceof ssa0) {
            ssa0Var = (ssa0) onmVar;
            int i = ssa0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ssa0Var.b = i - Integer.MIN_VALUE;
            } else {
                ssa0Var = new ssa0(this, onmVar);
            }
        } else {
            ssa0Var = new ssa0(this, onmVar);
        }
        Object obj2 = ssa0Var.a;
        int i2 = ssa0Var.b;
        try {
            if (i2 == 0) {
                hm5.M(obj2);
                jsa0 jsa0Var = (jsa0) obj;
                rqa0 rqa0Var = this.a.c;
                String str = jsa0Var.a;
                String str2 = jsa0Var.b;
                ssa0Var.b = 1;
                Object objA = rqa0Var.a(str, str2, ssa0Var);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
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
            n57.t("Failed to update draft cache", e2);
        }
        return rih1.a;
    }
}
