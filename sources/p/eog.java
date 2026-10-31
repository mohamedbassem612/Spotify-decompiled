package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class eog implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ yqg a;
    public final /* synthetic */ dmr b;
    public final /* synthetic */ qo71 c;
    public final /* synthetic */ kx70 d;

    public eog(yqg yqgVar, dmr dmrVar, qo71 qo71Var, kx70 kx70Var) {
        this.a = yqgVar;
        this.b = dmrVar;
        this.c = qo71Var;
        this.d = kx70Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        dog dogVar;
        if (onmVar instanceof dog) {
            dogVar = (dog) onmVar;
            int i = dogVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                dogVar.b = i - Integer.MIN_VALUE;
            } else {
                dogVar = new dog(this, onmVar);
            }
        } else {
            dogVar = new dog(this, onmVar);
        }
        Object obj2 = dogVar.a;
        int i2 = dogVar.b;
        if (i2 == 0) {
            hm5.M(obj2);
            jog jogVar = ((nog) obj).c;
            int iB = (int) (this.a.b() - jogVar.d);
            this.b.c(jogVar.e, jogVar.c, iB, jogVar.a, false, 3, jogVar.f, jogVar.g);
            dogVar.b = 1;
            Object objA = this.c.a(dogVar);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj2);
        }
        this.d.invoke();
        return rih1.a;
    }
}
