package p;

import android.app.Activity;
import android.os.Bundle;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class s8m0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ l9m0 a;

    public s8m0(l9m0 l9m0Var) {
        this.a = l9m0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Activity activityA;
        tzr0 tzr0Var = this.a.c;
        String str = ((icm1) obj).e;
        if (!ihc1.y0(str) && (activityA = ((e831) tzr0Var.b).a()) != null) {
            xh71 xh71Var = (xh71) ((sjq) new wtp(((fcm1) tzr0Var.c).a.a, activityA).c).get();
            wa71 wa71Var = new wa71(str, (String) null, (cqs0) null, (dqi1) null, (String) null, (String) null, (Bundle) null, 126);
            vm71 vm71Var = new vm71("wrapped-party");
            i8h1 i8h1Var = (i8h1) tzr0Var.d;
            x6h1 x6h1VarC = ((dsk0) tzr0Var.e).b.c();
            x6h1VarC.i.add(new a7h1("webview", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = false;
            xh71.b(xh71Var, wa71Var, (Bundle) null, vm71Var, i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("share", 2, sqg0.J(new mmr0[]{new mmr0("entity_to_be_shared", str), new mmr0("share_id", "")})), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null), Collections.singletonList(dcm1.a), 2);
        }
        return rih1.a;
    }
}
