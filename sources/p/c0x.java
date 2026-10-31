package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class c0x implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ List a;

    public c0x(List list) {
        this.a = list;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        b0x b0xVar;
        if (onmVar instanceof b0x) {
            b0xVar = (b0x) onmVar;
            int i = b0xVar.b;
            if ((i & os00.INVALID_ID) != 0) {
                b0xVar.b = i - os00.INVALID_ID;
            } else {
                b0xVar = new b0x(this, onmVar);
            }
        } else {
            b0xVar = new b0x(this, onmVar);
        }
        Object obj2 = b0xVar.a;
        int i2 = b0xVar.b;
        if (i2 == 0) {
            hm5.M(obj2);
            m441 m441Var = new m441(new rzu(this.a, ((o4w0) obj).a, (lnm) null, (byte) 6));
            wmk wmkVar = new wmk(r261Var, (byte) 23);
            b0xVar.b = 1;
            Object objCollect = m441Var.collect(wmkVar, b0xVar);
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
