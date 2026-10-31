package p;

import android.app.Activity;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class l88 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ n88 a;

    public l88(n88 n88Var) {
        this.a = n88Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        yu3 yu3Var = this.a.a;
        hhr hhrVar = (hhr) yu3Var.e;
        yok0 yok0VarA = hhr.a(3);
        i8h1 i8h1Var = hhrVar.a;
        x6h1 x6h1VarC = yok0VarA.b.c();
        x6h1VarC.i.add(new a7h1("request_addon_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        tv80 tv80VarM = i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
        huj.b((lzn0) yu3Var.d, (Activity) yu3Var.b, (ryf) yu3Var.c, oxf.b, ((g88) obj).b, tv80VarM);
        return rih1.a;
    }
}
