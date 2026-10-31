package p;

import android.app.Activity;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class wta implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ zta a;

    public wta(zta ztaVar) {
        this.a = ztaVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        fta ftaVar = this.a.a;
        ffe1 ffe1Var = (ffe1) ftaVar.d;
        String str = ((eta) obj).a;
        i8h1 i8h1Var = (i8h1) ((z1p) ffe1Var.c).get();
        x6h1 x6h1VarC = ((yok0) ffe1Var.b).b.c();
        x6h1VarC.i.add(new a7h1("receipts_row", (String) null, (Integer) null, str, (String) null));
        x6h1VarC.j = false;
        huj.b((lzn0) ftaVar.e, (Activity) ftaVar.b, (ryf) ftaVar.c, oxf.b, str, i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null));
        return rih1.a;
    }
}
