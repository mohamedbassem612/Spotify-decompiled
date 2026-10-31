package p;

import android.os.Bundle;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class v2w implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ f1n0 a;
    public final /* synthetic */ jut b;

    public v2w(f1n0 f1n0Var, jut jutVar) {
        this.a = f1n0Var;
        this.b = jutVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        jut jutVar = this.b;
        i8h1 i8h1Var = (i8h1) ((ynb0) jutVar.b).get();
        x6h1 x6h1VarC = ((tdl0) jutVar.c).b.c();
        x6h1VarC.i.add(new a7h1("blocked_word_error", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        x6h1VarC2.i.add(new a7h1("platform_rules_link", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = false;
        Object objD = f1n0.d(this.a, new dwn0("https://www.spotify.com/safetyandprivacy/platform-rules", "", false, false, 0, 0, false, (a690) null, (Bundle) null, new bwn0(i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", "https://www.spotify.com/safetyandprivacy/platform-rules")), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null))), onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objD != d9nVar) {
            objD = rih1Var;
        }
        return objD == d9nVar ? objD : rih1Var;
    }
}
