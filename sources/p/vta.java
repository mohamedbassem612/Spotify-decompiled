package p;

import android.app.Activity;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class vta implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ zta a;

    public vta(zta ztaVar) {
        this.a = ztaVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        fta ftaVar = this.a.a;
        String str = nik1.W1.a;
        ffe1 ffe1Var = (ffe1) ftaVar.d;
        i8h1 i8h1Var = (i8h1) ((z1p) ffe1Var.c).get();
        x6h1 x6h1VarC = ((yok0) ffe1Var.b).b.c();
        x6h1VarC.i.add(new a7h1("plan_row", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        huj.b((lzn0) ftaVar.e, (Activity) ftaVar.b, (ryf) ftaVar.c, oxf.b, str, i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("no_action", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null));
        return rih1.a;
    }
}
