package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import io.reactivex.rxjava3.internal.operators.completable.CompletableObserveOn;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xw71 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ dx71 a;

    public xw71(dx71 dx71Var) {
        this.a = dx71Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        ww71 ww71Var;
        if (onmVar instanceof ww71) {
            ww71Var = (ww71) onmVar;
            int i = ww71Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ww71Var.b = i - Integer.MIN_VALUE;
            } else {
                ww71Var = new ww71(this, onmVar);
            }
        } else {
            ww71Var = new ww71(this, onmVar);
        }
        Object obj2 = ww71Var.a;
        int i2 = ww71Var.b;
        try {
            if (i2 == 0) {
                hm5.M(obj2);
                CompletableObserveOn completableObserveOnB = this.a.c.b(((nw71) obj).a, "", 2, "");
                ww71Var.b = 1;
                Object objI = fc11.i(completableObserveOnB, ww71Var);
                d9n d9nVar = d9n.a;
                if (objI == d9nVar) {
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
        } catch (Exception unused) {
        }
        return rih1.a;
    }
}
