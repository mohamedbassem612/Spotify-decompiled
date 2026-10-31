package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fcb implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ scb a;

    public fcb(scb scbVar) {
        this.a = scbVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        d520 d520Var = this.a.a;
        String str = ((pbb) obj).a;
        teb tebVar = (teb) d520Var.b;
        ((ohv0) tebVar.e).a(new jhv0(((gp41) tebVar.d).a, str, "email", ""));
        return rih1.a;
    }
}
