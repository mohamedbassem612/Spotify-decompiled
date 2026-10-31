package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cak implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ yqg a;
    public final /* synthetic */ rm5 b;

    public cak(yqg yqgVar, rm5 rm5Var) {
        this.a = yqgVar;
        this.b = rm5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        bak bakVar;
        if (onmVar instanceof bak) {
            bakVar = (bak) onmVar;
            int i = bakVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                bakVar.b = i - Integer.MIN_VALUE;
            } else {
                bakVar = new bak(this, onmVar);
            }
        } else {
            bakVar = new bak(this, onmVar);
        }
        Object obj2 = bakVar.a;
        int i2 = bakVar.b;
        if (i2 == 0) {
            hm5.M(obj2);
            m441 m441Var = new m441(new mug((t9k) obj, this.a, this.b, (lnm) null));
            z6f z6fVar = new z6f(r261Var, (byte) 18);
            bakVar.b = 1;
            Object objCollect = m441Var.collect(z6fVar, bakVar);
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
