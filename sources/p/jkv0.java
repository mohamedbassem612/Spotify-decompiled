package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import io.reactivex.rxjava3.core.Completable;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jkv0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ skv0 a;

    public jkv0(skv0 skv0Var) {
        this.a = skv0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2, types: [p.bkv0] */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        hkv0 hkv0Var;
        m231 m231Var;
        ?? r5;
        skv0 skv0Var = this.a;
        if (onmVar instanceof hkv0) {
            hkv0Var = (hkv0) onmVar;
            int i = hkv0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                hkv0Var.b = i - Integer.MIN_VALUE;
            } else {
                hkv0Var = new hkv0(this, onmVar);
            }
        } else {
            hkv0Var = new hkv0(this, onmVar);
        }
        Object obj2 = hkv0Var.a;
        int i2 = hkv0Var.b;
        m231 m231Var2 = rih1.a;
        try {
            if (i2 == 0) {
                hm5.M(obj2);
                zjv0 zjv0Var = (zjv0) obj;
                Completable completableD = skv0Var.a.d(zjv0Var.a, (tv80) null, false);
                hkv0Var.d = zjv0Var;
                hkv0Var.b = 1;
                Object objI = fc11.i(completableD, hkv0Var);
                d9n d9nVar = d9n.a;
                obj = zjv0Var;
                if (objI == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                zjv0 zjv0Var2 = hkv0Var.d;
                hm5.M(obj2);
                obj = zjv0Var2;
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
