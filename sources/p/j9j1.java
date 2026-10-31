package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class j9j1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ qaj1 a;
    public final /* synthetic */ ao0 b;

    public j9j1(qaj1 qaj1Var, ao0 ao0Var) {
        this.a = qaj1Var;
        this.b = ao0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        i9j1 i9j1Var;
        feu feuVar;
        if (onmVar instanceof i9j1) {
            i9j1Var = (i9j1) onmVar;
            int i = i9j1Var.b;
            if ((i & os00.INVALID_ID) != 0) {
                i9j1Var.b = i - os00.INVALID_ID;
            } else {
                i9j1Var = new i9j1(this, onmVar);
            }
        } else {
            i9j1Var = new i9j1(this, onmVar);
        }
        Object obj2 = i9j1Var.a;
        int i2 = i9j1Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            feuVar = (feu) obj;
            vu30 vu30Var = this.a.d.b;
            gq0 gq0Var = new gq0(feuVar.a.a());
            i9j1Var.d = feuVar;
            i9j1Var.b = 1;
            Object objInvoke = vu30Var.invoke(gq0Var, i9j1Var);
            d9n d9nVar = d9n.a;
            if (objInvoke == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            feuVar = i9j1Var.d;
            hm5.M(obj2);
        }
        if (feuVar.b) {
            ao0.a(this.b, co0.g, feuVar.a.a(), (Long) null, (String) null, (String) null, 124);
        }
        return rih1.a;
    }
}
