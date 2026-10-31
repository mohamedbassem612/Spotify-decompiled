package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bi21 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ ei21 a;

    public bi21(ei21 ei21Var) {
        this.a = ei21Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        vh21 vh21Var = (vh21) obj;
        boolean z = vh21Var.a;
        ei21 ei21Var = this.a;
        if (!z) {
            hyy0 hyy0Var = ei21Var.f;
            i8h1 i8h1Var = (i8h1) hyy0Var.b;
            x6h1 x6h1VarC = ((urk0) hyy0Var.c).b.c();
            x6h1VarC.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = false;
            y6h1 y6h1VarA = x6h1VarC.a();
            b7x b7xVar = b7x.a;
            i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
        }
        ei21Var.d.c().a(vh21Var.a ? new y231(gr10.a) : l231.a);
        return rih1.a;
    }
}
