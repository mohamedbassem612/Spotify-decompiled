package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bll1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ p811 a;
    public final /* synthetic */ cll1 b;
    public final /* synthetic */ p811 c;

    public bll1(p811 p811Var, cll1 cll1Var, p811 p811Var2) {
        this.a = p811Var;
        this.b = cll1Var;
        this.c = p811Var2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        all1 all1Var;
        if (onmVar instanceof all1) {
            all1Var = (all1) onmVar;
            int i = all1Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                all1Var.b = i - Integer.MIN_VALUE;
            } else {
                all1Var = new all1(this, onmVar);
            }
        } else {
            all1Var = new all1(this, onmVar);
        }
        Object obj2 = all1Var.a;
        int i2 = all1Var.b;
        if (i2 != 0) {
            if (i2 == 1) {
                hm5.M(obj2);
                return rih1.a;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj2);
        dt71 dt71VarE = mgo1.e(0, 0, 0, 7);
        p811 p811Var = this.a;
        faa0 faa0Var = (faa0) p811Var.a;
        if (faa0Var != null) {
            faa0Var.d((CancellationException) null);
        }
        cll1 cll1Var = this.b;
        p811Var.a = fn31.T(zso1.H(cll1Var.h.e().getLifecycle()), flo1.l(cll1Var.a, op71.f()), 0, new ukl1(this.c, dt71VarE, (lnm) null, (byte) 0), 2);
        aud1 aud1Var = new aud1(r261Var, (byte) 17);
        all1Var.b = 1;
        dt71VarE.collect(aud1Var, all1Var);
        return d9n.a;
    }
}
