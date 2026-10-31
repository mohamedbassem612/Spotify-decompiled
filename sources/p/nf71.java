package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nf71 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ z8c0 a;

    public nf71(z8c0 z8c0Var) {
        this.a = z8c0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        hh71 hh71Var = (hh71) obj;
        j810 j810Var = (j810) this.a.b;
        boolean z = hh71Var.c;
        yg71 yg71Var = hh71Var.d;
        Object objEmit = j810Var.b.emit(new h810(z, yg71Var != null ? yg71Var.a : null, yg71Var != null ? yg71Var.b : null, yg71Var != null ? yg71Var.c : false), onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objEmit != d9nVar) {
            objEmit = rih1Var;
        }
        if (objEmit != d9nVar) {
            objEmit = rih1Var;
        }
        return objEmit == d9nVar ? objEmit : rih1Var;
    }
}
