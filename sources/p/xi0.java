package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xi0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ fj0 a;
    public final /* synthetic */ ao0 b;

    public xi0(fj0 fj0Var, ao0 ao0Var) {
        this.a = fj0Var;
        this.b = ao0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        wi0 wi0Var;
        jeu jeuVar;
        if (onmVar instanceof wi0) {
            wi0Var = (wi0) onmVar;
            int i = wi0Var.b;
            if ((i & os00.INVALID_ID) != 0) {
                wi0Var.b = i - os00.INVALID_ID;
            } else {
                wi0Var = new wi0(this, onmVar);
            }
        } else {
            wi0Var = new wi0(this, onmVar);
        }
        Object obj2 = wi0Var.a;
        int i2 = wi0Var.b;
        d9n d9nVar = rih1.a;
        if (i2 == 0) {
            hm5.M(obj2);
            jeu jeuVar2 = (jeu) obj;
            r1t r1tVar = this.a.a.a;
            wi0Var.d = jeuVar2;
            wi0Var.b = 1;
            r1tVar.invoke(wi0Var);
            d9n d9nVar2 = d9n.a;
            if (d9nVar == d9nVar2) {
                return d9nVar2;
            }
            jeuVar = jeuVar2;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jeuVar = wi0Var.d;
            hm5.M(obj2);
        }
        ao0.a(this.b, co0.g, jeuVar.a, (Long) null, (String) null, (String) null, 124);
        ao0.a(this.b, co0.f1, jeuVar.a, (Long) null, (String) null, (String) null, 124);
        return d9nVar;
    }
}
