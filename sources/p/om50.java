package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class om50 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ gp0 a;
    public final /* synthetic */ q8n b;
    public final /* synthetic */ add c;
    public final /* synthetic */ bfd d;
    public final /* synthetic */ s1q0 e;

    public om50(gp0 gp0Var, q8n q8nVar, add addVar, bfd bfdVar, s1q0 s1q0Var) {
        this.a = gp0Var;
        this.b = q8nVar;
        this.c = addVar;
        this.d = bfdVar;
        this.e = s1q0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objCollect = new m441(new yj6(obj, (lnm) null, this.a, this.b, this.c, this.d, this.e)).collect(new cg00(r261Var, (byte) 12), onmVar);
        return objCollect == d9n.a ? objCollect : rih1.a;
    }
}
