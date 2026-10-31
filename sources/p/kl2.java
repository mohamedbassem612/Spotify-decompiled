package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kl2 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ wl2 a;

    public kl2(wl2 wl2Var) {
        this.a = wl2Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        kp5 kp5Var = this.a.a;
        cn2 cn2Var = (cn2) kp5Var.g;
        i8h1 i8h1VarA = cn2Var.a();
        x6h1 x6h1VarC = cn2Var.b.b.c();
        x6h1VarC.i.add(new a7h1("why_link", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        i8h1VarA.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", "https://support.spotify.com/article/managed-accounts/plain/")), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
        z710.d((z710) kp5Var.d, "https://support.spotify.com/article/managed-accounts/plain/", false, 6);
        return rih1.a;
    }
}
