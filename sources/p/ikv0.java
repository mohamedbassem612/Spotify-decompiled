package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import io.reactivex.rxjava3.core.Completable;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ikv0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ rkv0 a;

    public ikv0(rkv0 rkv0Var) {
        this.a = rkv0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2, types: [p.akv0] */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        gkv0 gkv0Var;
        Object m231Var;
        ?? r5;
        rkv0 rkv0Var = this.a;
        if (onmVar instanceof gkv0) {
            gkv0Var = (gkv0) onmVar;
            int i = gkv0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                gkv0Var.b = i - Integer.MIN_VALUE;
            } else {
                gkv0Var = new gkv0(this, onmVar);
            }
        } else {
            gkv0Var = new gkv0(this, onmVar);
        }
        Object obj2 = gkv0Var.a;
        int i2 = gkv0Var.b;
        rih1 rih1Var = rih1.a;
        try {
            if (i2 == 0) {
                hm5.M(obj2);
                yjv0 yjv0Var = (yjv0) obj;
                Completable completableD = rkv0Var.a.d(yjv0Var.a, null, false);
                gkv0Var.d = yjv0Var;
                gkv0Var.b = 1;
                Object objI = fc11.i(completableD, gkv0Var);
                d9n d9nVar = d9n.a;
                obj = yjv0Var;
                if (objI == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                yjv0 yjv0Var2 = gkv0Var.d;
                hm5.M(obj2);
                obj = yjv0Var2;
            }
            m231Var = rih1Var;
            r5 = obj;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            m231Var = new m231(th);
            r5 = obj;
        }
        Throwable thA = e331.a(m231Var);
        if (thA != null) {
            Logger.e(thA, "%s", new Object[]{rkv0.a(r5)});
        }
        return rih1Var;
    }
}
