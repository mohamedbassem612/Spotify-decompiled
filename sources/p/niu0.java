package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class niu0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ jr2 a;

    public niu0(jr2 jr2Var) {
        this.a = jr2Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        miu0 miu0Var;
        if (onmVar instanceof miu0) {
            miu0Var = (miu0) onmVar;
            int i = miu0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                miu0Var.b = i - Integer.MIN_VALUE;
            } else {
                miu0Var = new miu0(this, onmVar);
            }
        } else {
            miu0Var = new miu0(this, onmVar);
        }
        Object obj2 = miu0Var.a;
        int i2 = miu0Var.b;
        try {
            if (i2 == 0) {
                hm5.M(obj2);
                fju0 fju0Var = (fju0) obj;
                wr2 wr2Var = this.a;
                String str = fju0Var.a;
                hs2 hs2Var = new hs2(fju0Var.d, fju0Var.b, fju0Var.c);
                miu0Var.b = 1;
                Object objJ = wr2Var.j(str, hs2Var, miu0Var);
                d9n d9nVar = d9n.a;
                if (objJ == d9nVar) {
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
