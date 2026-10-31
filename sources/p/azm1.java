package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class azm1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ gzm1 a;

    public azm1(gzm1 gzm1Var) {
        this.a = gzm1Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        cik1 cik1Var = this.a.a;
        ptf1 ptf1Var = (ptf1) cik1Var.d;
        i8h1 i8h1Var = (i8h1) ((tsq) ptf1Var.c).get();
        ksk0 ksk0Var = (ksk0) ptf1Var.b;
        x6h1 x6h1VarC = ksk0Var.c.c();
        x6h1VarC.i.add(new a7h1("management_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        y6h1 y6h1VarA = x6h1VarC.a();
        String str = ((qym1) obj).a;
        cik1Var.f(str, i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), y6h1VarA, ksk0Var.b, System.currentTimeMillis()), (xj61) null));
        return rih1.a;
    }
}
