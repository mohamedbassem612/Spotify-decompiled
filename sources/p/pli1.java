package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class pli1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ cmi1 a;

    public pli1(cmi1 cmi1Var) {
        this.a = cmi1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        oli1 oli1Var;
        if (onmVar instanceof oli1) {
            oli1Var = (oli1) onmVar;
            int i = oli1Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                oli1Var.b = i - Integer.MIN_VALUE;
            } else {
                oli1Var = new oli1(this, onmVar);
            }
        } else {
            oli1Var = new oli1(this, onmVar);
        }
        Object obj2 = oli1Var.a;
        int i2 = oli1Var.b;
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
        m441 m441Var = new m441(new m311(this.a.d, ((zki1) obj).a, lnmVar, (byte) 17));
        aud1 aud1Var = new aud1(r261Var, (byte) 9);
        oli1Var.b = 1;
        Object objCollect = m441Var.collect(new qzh1(aud1Var, (byte) 8), oli1Var);
        d9n d9nVar = d9n.a;
        if (objCollect != d9nVar) {
            objCollect = rih1Var;
        }
        return objCollect == d9nVar ? d9nVar : rih1Var;
    }
}
