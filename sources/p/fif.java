package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class fif implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ gp0 a;
    public final /* synthetic */ q8n b;
    public final /* synthetic */ bfd c;
    public final /* synthetic */ s1q0 d;

    public fif(gp0 gp0Var, q8n q8nVar, bfd bfdVar, s1q0 s1q0Var) {
        this.a = gp0Var;
        this.b = q8nVar;
        this.c = bfdVar;
        this.d = s1q0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objCollect = new m441(new qk3((byte) 2, obj, this.a, this.b, this.c, this.d, (lnm) null)).collect(new z6f(r261Var, (byte) 3), onmVar);
        return objCollect == d9n.a ? objCollect : rih1.a;
    }
}
