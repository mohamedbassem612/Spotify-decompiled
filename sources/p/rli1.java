package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class rli1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ cmi1 a;

    public rli1(cmi1 cmi1Var) {
        this.a = cmi1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        qli1 qli1Var;
        if (onmVar instanceof qli1) {
            qli1Var = (qli1) onmVar;
            int i = qli1Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                qli1Var.b = i - Integer.MIN_VALUE;
            } else {
                qli1Var = new qli1(this, onmVar);
            }
        } else {
            qli1Var = new qli1(this, onmVar);
        }
        Object obj2 = qli1Var.a;
        int i2 = qli1Var.b;
        lnm lnmVar = null;
        rih1 rih1Var = rih1.a;
        if (i2 != 0) {
            if (i2 == 1) {
                hm5.M(obj2);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj2);
        m441 m441Var = new m441(new m311(this.a.d, ((yki1) obj).a, lnmVar, (byte) 17));
        aud1 aud1Var = new aud1(r261Var, (byte) 10);
        qli1Var.b = 1;
        Object objCollect = m441Var.collect(new qzh1(aud1Var, (byte) 9), qli1Var);
        d9n d9nVar = d9n.a;
        if (objCollect != d9nVar) {
            objCollect = rih1Var;
        }
        return objCollect == d9nVar ? d9nVar : rih1Var;
    }
}
