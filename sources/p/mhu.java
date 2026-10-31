package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mhu implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ zhu a;
    public final /* synthetic */ ao0 b;

    public mhu(zhu zhuVar, ao0 ao0Var) {
        this.a = zhuVar;
        this.b = ao0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        lhu lhuVar;
        deu deuVar;
        if (onmVar instanceof lhu) {
            lhuVar = (lhu) onmVar;
            int i = lhuVar.b;
            if ((i & os00.INVALID_ID) != 0) {
                lhuVar.b = i - os00.INVALID_ID;
            } else {
                lhuVar = new lhu(this, onmVar);
            }
        } else {
            lhuVar = new lhu(this, onmVar);
        }
        Object obj2 = lhuVar.a;
        int i2 = lhuVar.b;
        if (i2 == 0) {
            hm5.M(obj2);
            deuVar = (deu) obj;
            vu30 vu30Var = this.a.b;
            gq0 gq0Var = new gq0(deuVar.a.a());
            lhuVar.d = deuVar;
            lhuVar.b = 1;
            Object objInvoke = vu30Var.invoke(gq0Var, lhuVar);
            d9n d9nVar = d9n.a;
            if (objInvoke == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            deuVar = lhuVar.d;
            hm5.M(obj2);
        }
        Iterator it = deuVar.b.iterator();
        while (it.hasNext()) {
            ao0.a(this.b, (co0) it.next(), deuVar.a.a(), (Long) null, (String) null, (String) null, 124);
        }
        return rih1.a;
    }
}
