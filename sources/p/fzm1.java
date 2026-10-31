package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class fzm1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ gzm1 a;

    public fzm1(gzm1 gzm1Var) {
        this.a = gzm1Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        mym1 mym1Var = (mym1) obj;
        ptf1 ptf1Var = (ptf1) this.a.a.d;
        byte b = mym1Var.a;
        String str = mym1Var.b;
        i8h1 i8h1Var = (i8h1) ((tsq) ptf1Var.c).get();
        ksk0 ksk0Var = (ksk0) ptf1Var.b;
        Integer numValueOf = Integer.valueOf(b);
        x6h1 x6h1VarC = ksk0Var.c.c();
        x6h1VarC.i.add(new a7h1("plan_upsell_card", (String) null, numValueOf, str, (String) null));
        x6h1VarC.j = true;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, ksk0Var.b, System.currentTimeMillis()), (xj61) null);
        return rih1.a;
    }
}
