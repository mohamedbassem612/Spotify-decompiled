package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ezm1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ gzm1 a;

    public ezm1(gzm1 gzm1Var) {
        this.a = gzm1Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        rym1 rym1Var = (rym1) obj;
        cik1 cik1Var = this.a.a;
        ptf1 ptf1Var = (ptf1) cik1Var.d;
        byte b = rym1Var.a;
        String str = rym1Var.b;
        i8h1 i8h1Var = (i8h1) ((tsq) ptf1Var.c).get();
        ksk0 ksk0Var = (ksk0) ptf1Var.b;
        Integer numValueOf = Integer.valueOf(b);
        x6h1 x6h1VarC = ksk0Var.c.c();
        x6h1VarC.i.add(new a7h1("plan_upsell_card", (String) null, numValueOf, str, (String) null));
        x6h1VarC.j = true;
        cik1Var.f(str, i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), x6h1VarC.a(), ksk0Var.b, System.currentTimeMillis()), (xj61) null));
        return rih1.a;
    }
}
