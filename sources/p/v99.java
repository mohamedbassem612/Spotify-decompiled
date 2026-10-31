package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class v99 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ z99 a;

    public v99(z99 z99Var) {
        this.a = z99Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        j99 j99Var = (j99) obj;
        ajq0 ajq0Var = this.a.a;
        ptf1 ptf1Var = (ptf1) ajq0Var.c;
        yok0 yok0Var = (yok0) ptf1Var.b;
        z1p z1pVar = (z1p) ptf1Var.c;
        boolean z = j99Var.a;
        b7x b7xVar = b7x.a;
        if (!z) {
            i8h1 i8h1Var = (i8h1) z1pVar.get();
            x6h1 x6h1VarC = yok0Var.b.c();
            x6h1VarC.i.add(new a7h1("plans", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = false;
            i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
        } else if (z) {
            int i = j99Var.b ? 1 : 2;
            i8h1 i8h1Var2 = (i8h1) z1pVar.get();
            x6h1 x6h1VarC2 = yok0Var.b.c();
            x6h1VarC2.i.add(new a7h1("add_ons", (String) null, (Integer) null, (String) null, ktk0.a(i)));
            x6h1VarC2.j = false;
            i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
            ((wpv0) ajq0Var.e).a().b.edit().putBoolean("interacted", true).apply();
        }
        return rih1.a;
    }
}
