package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ldw0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ pdw0 a;

    public ldw0(pdw0 pdw0Var) {
        this.a = pdw0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        kdw0 kdw0Var;
        if (onmVar instanceof kdw0) {
            kdw0Var = (kdw0) onmVar;
            int i = kdw0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                kdw0Var.b = i - Integer.MIN_VALUE;
            } else {
                kdw0Var = new kdw0(this, onmVar);
            }
        } else {
            kdw0Var = new kdw0(this, onmVar);
        }
        Object obj2 = kdw0Var.a;
        int i2 = kdw0Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            pdw0 pdw0Var = this.a;
            pdw0Var.T0 = null;
            faa0 faa0Var = pdw0Var.Z;
            if (faa0Var != null) {
                faa0Var.d((CancellationException) null);
            }
            pdw0Var.Z = null;
            aru0 aru0Var = pdw0Var.a;
            aru0Var.s();
            aru0Var.r();
            kdw0Var.b = 1;
            Object objB = r261Var.b(hew0.a, kdw0Var);
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
