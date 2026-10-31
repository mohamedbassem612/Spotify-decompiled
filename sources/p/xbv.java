package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xbv implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ iu30 a;

    public xbv(gqb0 gqb0Var) {
        this.a = gqb0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        wbv wbvVar;
        if (onmVar instanceof wbv) {
            wbvVar = (wbv) onmVar;
            int i = wbvVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                wbvVar.b = i - Integer.MIN_VALUE;
            } else {
                wbvVar = new wbv(this, onmVar);
            }
        } else {
            wbvVar = new wbv(this, onmVar);
        }
        Object obj2 = wbvVar.a;
        int i2 = wbvVar.b;
        if (i2 == 0) {
            hm5.M(obj2);
            mr20 mr20Var = (mr20) this.a.invoke((lbv) obj);
            wmk wmkVar = new wmk(r261Var, (byte) 5);
            wbvVar.b = 1;
            Object objCollect = mr20Var.collect(wmkVar, wbvVar);
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
