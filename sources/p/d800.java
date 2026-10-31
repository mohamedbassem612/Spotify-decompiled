package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class d800 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ f800 a;

    public d800(f800 f800Var) {
        this.a = f800Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        u9u0 u9u0Var = this.a.b;
        g3p1 g3p1Var = ((b800) obj).a;
        boolean z = g3p1Var instanceof y8u0;
        d9n d9nVar = d9n.a;
        if (z) {
            y8u0 y8u0Var = (y8u0) g3p1Var;
            Object objD = u9u0Var.d(y8u0Var.c, y8u0Var.d, onmVar);
            if (objD == d9nVar) {
                return objD;
            }
        } else if (g3p1Var instanceof a9u0) {
            Object objE = u9u0Var.e(((a9u0) g3p1Var).c, onmVar);
            if (objE == d9nVar) {
                return objE;
            }
        } else {
            if (!(g3p1Var instanceof w8u0)) {
                eg.o();
                return null;
            }
            Object objC = u9u0Var.c(((w8u0) g3p1Var).c, onmVar);
            if (objC == d9nVar) {
                return objC;
            }
        }
        return rih1.a;
    }
}
