package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ecb implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ scb a;

    public ecb(scb scbVar) {
        this.a = scbVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        d520 d520Var = this.a.a;
        String str = ((nbb) obj).a;
        ((k1i) d520Var.c).m(38, jj8.g);
        teb tebVar = (teb) d520Var.b;
        ((ohv0) tebVar.e).a(new khv0(((gp41) tebVar.d).a, "email_username_submit", Collections.singletonMap("is_email_input", String.valueOf(ihc1.h0(str, "@", false)))));
        return rih1.a;
    }
}
