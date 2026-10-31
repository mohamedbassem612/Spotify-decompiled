package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ici1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ mci1 a;

    public ici1(mci1 mci1Var) {
        this.a = mci1Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        e821 e821Var = this.a.a;
        String str = ((eci1) obj).a;
        edi1 edi1Var = (edi1) e821Var.d;
        i8h1 i8h1VarA = edi1Var.a();
        x6h1 x6h1VarC = edi1Var.b.b.c();
        x6h1VarC.i.add(new a7h1("support_site_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        i8h1VarA.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", str)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
        z710.d((z710) e821Var.c, str, false, 6);
        return rih1.a;
    }
}
