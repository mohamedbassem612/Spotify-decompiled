package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qsh1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ kly0 a;

    public qsh1(kly0 kly0Var) {
        this.a = kly0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        psh1 psh1Var;
        if (onmVar instanceof psh1) {
            psh1Var = (psh1) onmVar;
            int i = psh1Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                psh1Var.b = i - Integer.MIN_VALUE;
            } else {
                psh1Var = new psh1(this, onmVar);
            }
        } else {
            psh1Var = new psh1(this, onmVar);
        }
        Object obj2 = psh1Var.a;
        int i2 = psh1Var.b;
        try {
            if (i2 == 0) {
                hm5.M(obj2);
                msh1 msh1Var = (msh1) obj;
                wr2 wr2Var = (jr2) this.a.get();
                String str = msh1Var.a;
                String str2 = msh1Var.b;
                ith1 ith1Var = msh1Var.c;
                gs2 gs2Var = new gs2(str2, ith1Var.b, ith1Var.a);
                psh1Var.b = 1;
                Object objJ = wr2Var.j(str, gs2Var, psh1Var);
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
