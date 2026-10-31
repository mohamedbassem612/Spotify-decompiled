package p;

import android.os.Bundle;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class nsg1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ psg1 a;

    public nsg1(psg1 psg1Var) {
        this.a = psg1Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        psg1 psg1Var = this.a;
        ptf1 ptf1Var = psg1Var.a;
        i8h1 i8h1Var = (i8h1) ptf1Var.b;
        x6h1 x6h1VarC = ((rrk0) ptf1Var.c).b.c();
        x6h1VarC.i.add(new a7h1("pdp_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        psg1Var.b.f(new dwn0("spotify:premium-destination", "", false, false, 0, 0, false, (a690) null, (Bundle) null, new bwn0(i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:premium-destination")), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null))));
        return rih1.a;
    }
}
