package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import io.reactivex.rxjava3.core.Completable;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fkv0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ skv0 a;

    public fkv0(skv0 skv0Var) {
        this.a = skv0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2, types: [p.bkv0] */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        dkv0 dkv0Var;
        m231 m231Var;
        ?? r5;
        skv0 skv0Var = this.a;
        if (onmVar instanceof dkv0) {
            dkv0Var = (dkv0) onmVar;
            int i = dkv0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                dkv0Var.b = i - Integer.MIN_VALUE;
            } else {
                dkv0Var = new dkv0(this, onmVar);
            }
        } else {
            dkv0Var = new dkv0(this, onmVar);
        }
        Object obj2 = dkv0Var.a;
        int i2 = dkv0Var.b;
        m231 m231Var2 = rih1.a;
        try {
            if (i2 == 0) {
                hm5.M(obj2);
                xjv0 xjv0Var = (xjv0) obj;
                Completable completableD = skv0Var.a.d(xjv0Var.a, (tv80) null, true);
                dkv0Var.d = xjv0Var;
                dkv0Var.b = 1;
                Object objI = fc11.i(completableD, dkv0Var);
                d9n d9nVar = d9n.a;
                obj = xjv0Var;
                if (objI == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xjv0 xjv0Var2 = dkv0Var.d;
                hm5.M(obj2);
                obj = xjv0Var2;
            }
            m231Var = m231Var2;
            r5 = obj;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            m231Var = new m231(th);
            r5 = obj;
        }
        Throwable thA = e331.a(m231Var);
        if (thA != null) {
            Logger.e(thA, "%s", new Object[]{skv0.a(r5)});
        }
        return m231Var2;
    }
}
