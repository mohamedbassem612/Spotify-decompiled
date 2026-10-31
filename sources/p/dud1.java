package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dud1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ fud1 a;

    public dud1(fud1 fud1Var) {
        this.a = fud1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        cud1 cud1Var;
        fud1 fud1Var = this.a;
        w35 w35Var = fud1Var.d;
        if (onmVar instanceof cud1) {
            cud1Var = (cud1) onmVar;
            int i = cud1Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                cud1Var.b = i - Integer.MIN_VALUE;
            } else {
                cud1Var = new cud1(this, onmVar);
            }
        } else {
            cud1Var = new cud1(this, onmVar);
        }
        Object obj2 = cud1Var.a;
        int i2 = cud1Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            m441 m441Var = new m441(new gud1(w35Var.g(), w35Var.f(), fud1Var.b, null));
            aud1 aud1Var = new aud1(r261Var, (byte) 1);
            cud1Var.b = 1;
            Object objCollect = m441Var.collect(aud1Var, cud1Var);
            d9n d9nVar = d9n.a;
            if (objCollect == d9nVar) {
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
