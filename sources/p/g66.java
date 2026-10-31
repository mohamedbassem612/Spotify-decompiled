package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class g66 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ y66 a;

    public g66(y66 y66Var) {
        this.a = y66Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        q56 q56Var = (q56) obj;
        o46 o46VarC = this.a.l.c();
        boolean z = o46VarC instanceof mmu0;
        rih1 rih1Var = rih1.a;
        if (z) {
            ((mmu0) o46VarC).b.a.put(q56Var.a, q56Var.b);
        }
        return rih1Var;
    }
}
