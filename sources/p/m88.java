package p;

import android.app.Activity;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class m88 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ n88 a;

    public m88(n88 n88Var) {
        this.a = n88Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        f88 f88Var = (f88) obj;
        yu3 yu3Var = this.a.a;
        int iOrdinal = f88Var.a.ordinal();
        int i = (iOrdinal == 0 || iOrdinal != 1) ? 1 : 2;
        hhr hhrVar = (hhr) yu3Var.e;
        String str = f88Var.b;
        yok0 yok0VarA = hhr.a(i);
        i8h1 i8h1Var = hhrVar.a;
        x6h1 x6h1VarC = yok0VarA.b.c();
        x6h1VarC.i.add(new a7h1("addon_to_subscription_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        huj.b((lzn0) yu3Var.d, (Activity) yu3Var.b, (ryf) yu3Var.c, oxf.b, str, i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null));
        return rih1.a;
    }
}
