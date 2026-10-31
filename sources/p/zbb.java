package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zbb implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ scb a;

    public zbb(scb scbVar) {
        this.a = scbVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        d520 d520Var = this.a.a;
        i8h1 i8h1Var = (i8h1) d520Var.f;
        vzl0 vzl0Var = (vzl0) d520Var.g;
        vzl0Var.getClass();
        x6h1 x6h1VarC = vzl0Var.a.c();
        x6h1VarC.i.add(new a7h1("login_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        w6b1 w6b1VarA = f7b1.a(blc0.va);
        String str = w6b1VarA != null ? (String) o7h.s0(w6b1VarA.c) : null;
        if (str == null) {
            str = "";
        }
        i8h1Var.j(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), y6h1VarA, r6h1.c, System.currentTimeMillis()));
        return rih1.a;
    }
}
