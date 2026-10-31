package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class sg1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ xg1 a;

    public sg1(xg1 xg1Var) {
        this.a = xg1Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        u961 u961Var = this.a.a;
        vnd1 vnd1Var = (vnd1) u961Var.c;
        String str = ((gg1) obj).a;
        i8h1 i8h1Var = (i8h1) vnd1Var.b;
        x6h1 x6h1VarC = ((yok0) vnd1Var.c).b.c();
        x6h1VarC.i.add(new a7h1("add_member_row", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        u961Var.v(str, i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", str)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null));
        return rih1.a;
    }
}
