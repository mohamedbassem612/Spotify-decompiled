package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class sq1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ fsg a;

    public sq1(fsg fsgVar) {
        this.a = fsgVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        bp1 bp1Var = (bp1) obj;
        fsg fsgVar = this.a;
        lzn0 lzn0Var = fsgVar.b;
        dg30 dg30Var = fsgVar.a;
        boolean zJ = lzn0Var.j(dg30Var);
        x6c0 x6c0Var = fxu0.d;
        if (!zJ) {
            dg30 dg30Var2 = dg30Var instanceof dg30 ? dg30Var : null;
            th30 th30VarE0 = dg30Var2 != null ? dg30Var2.e0() : null;
            zf30 zf30VarG = th30VarE0 != null ? th30VarE0.G("AddToPlaylistFragment") : null;
            if (zf30VarG != null) {
                th30VarE0.getClass();
                nu9 nu9Var = new nu9(th30VarE0);
                nu9Var.m(zf30VarG);
                nu9Var.g(true, true);
            } else {
                fsgVar.c.b(x6c0Var);
            }
        } else if (bp1Var.a) {
            lzn0Var.e();
        } else {
            lzn0Var.b(x6c0Var);
        }
        return rih1.a;
    }
}
