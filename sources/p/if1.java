package p;

import android.app.Activity;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class if1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ kf1 a;

    public if1(kf1 kf1Var) {
        this.a = kf1Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        u961 u961Var = this.a.a;
        ffe1 ffe1Var = (ffe1) u961Var.c;
        String str = ((df1) obj).c;
        i8h1 i8h1Var = (i8h1) ((jwo) ffe1Var.b).get();
        x6h1 x6h1VarC = ((yok0) ffe1Var.c).b.c();
        x6h1VarC.i.add(new a7h1("cta_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        huj.b((lzn0) u961Var.d, (Activity) u961Var.a, (ryf) u961Var.b, oxf.b, str, i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null));
        return rih1.a;
    }
}
