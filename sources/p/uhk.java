package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uhk implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ rm5 a;
    public final /* synthetic */ dg8 b;
    public final /* synthetic */ kba c;
    public final /* synthetic */ kt91 d;
    public final /* synthetic */ yqg e;
    public final /* synthetic */ boolean f;

    public uhk(rm5 rm5Var, dg8 dg8Var, kba kbaVar, kt91 kt91Var, yqg yqgVar, boolean z) {
        this.a = rm5Var;
        this.b = dg8Var;
        this.c = kbaVar;
        this.d = kt91Var;
        this.e = yqgVar;
        this.f = z;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objCollect = new m441(new fx2(obj, (lnm) null, this.a, this.b, this.c, this.d, this.e, this.f)).collect(new z6f(r261Var, (byte) 21), onmVar);
        return objCollect == d9n.a ? objCollect : rih1.a;
    }
}
