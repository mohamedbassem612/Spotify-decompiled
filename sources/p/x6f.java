package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class x6f implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ cce a;

    public x6f(cce cceVar) {
        this.a = cceVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        char c;
        String str;
        int i = ((o5f) obj).a;
        cce cceVar = this.a;
        i8h1 i8h1Var = (i8h1) cceVar.b;
        ovk0 ovk0Var = (ovk0) ((idd1) cceVar.d).getValue();
        int iC = l1d.C(i);
        if (iC == 0) {
            c = 1;
        } else {
            if (iC != 1) {
                eg.o();
                return null;
            }
            c = 2;
        }
        ovk0Var.getClass();
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        if (c == 1) {
            str = "open_spotify_com";
        } else {
            if (c != 2) {
                throw null;
            }
            str = "spotify_link";
        }
        i8h1Var.m(new w7h1("", "", z7h1Var, new x7h1("paste_spotify_link", 1, Collections.singletonMap("link_type", str)), ovk0Var.a, r6h1.c, System.currentTimeMillis()), (xj61) null);
        return rih1.a;
    }
}
