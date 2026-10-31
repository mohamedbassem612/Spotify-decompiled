package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ntg1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ utg1 a;

    public ntg1(utg1 utg1Var) {
        this.a = utg1Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        ffe1 ffe1Var = this.a.d;
        i8h1 i8h1Var = (i8h1) ffe1Var.b;
        tdl0 tdl0VarE = ffe1Var.e();
        x6h1 x6h1VarC = tdl0VarE.b.c();
        x6h1VarC.i.add(new a7h1("retry_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        y6h1 y6h1VarA = x6h1VarC.a();
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = y6h1VarA;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        k7h1Var.e = tdl0VarE.c;
        i8h1Var.f(k7h1Var.a(), (Set) null);
        return rih1.a;
    }
}
