package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class z9j1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ waj1 a;
    public final /* synthetic */ ao0 b;

    public z9j1(waj1 waj1Var, ao0 ao0Var) {
        this.a = waj1Var;
        this.b = ao0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        w9j1 w9j1Var;
        geu geuVar;
        if (onmVar instanceof w9j1) {
            w9j1Var = (w9j1) onmVar;
            int i = w9j1Var.b;
            if ((i & os00.INVALID_ID) != 0) {
                w9j1Var.b = i - os00.INVALID_ID;
            } else {
                w9j1Var = new w9j1(this, onmVar);
            }
        } else {
            w9j1Var = new w9j1(this, onmVar);
        }
        Object obj2 = w9j1Var.a;
        int i2 = w9j1Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            geuVar = (geu) obj;
            vu30 vu30Var = this.a.a.b;
            gq0 gq0Var = new gq0(geuVar.a.a());
            w9j1Var.d = geuVar;
            w9j1Var.b = 1;
            Object objInvoke = vu30Var.invoke(gq0Var, w9j1Var);
            d9n d9nVar = d9n.a;
            if (objInvoke == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            geuVar = w9j1Var.d;
            hm5.M(obj2);
        }
        if (geuVar.b) {
            ao0.a(this.b, co0.g, geuVar.a.a(), (Long) null, (String) null, (String) null, 124);
        }
        return rih1.a;
    }
}
