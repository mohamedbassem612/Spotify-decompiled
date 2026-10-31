package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class cj0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ i44 a;
    public final /* synthetic */ ao0 b;

    public cj0(i44 i44Var, ao0 ao0Var) {
        this.a = i44Var;
        this.b = ao0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        co0 co0Var;
        bm21 bm21Var = (bm21) obj;
        if (!this.a.c()) {
            int iC = l1d.C(bm21Var.a);
            if (iC == 0) {
                co0Var = co0.Z;
            } else if (iC == 1) {
                co0Var = co0.h1;
            } else if (iC == 2) {
                co0Var = co0.j1;
            } else if (iC == 3) {
                co0Var = co0.k1;
            } else {
                if (iC != 4) {
                    eg.o();
                    return null;
                }
                co0Var = co0.l1;
            }
            co0 co0Var2 = co0Var;
            ao0.a(this.b, co0Var2, bm21Var.b, (Long) null, (String) null, (String) null, 124);
        }
        return rih1.a;
    }
}
