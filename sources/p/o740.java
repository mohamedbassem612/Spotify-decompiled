package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.ContextTrack$Metadata;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeFlatten;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeMap;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeSwitchIfEmpty;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class o740 implements owo0 {
    public final uu00 a;
    public final sp00 b;
    public final rzo0 c;

    public o740(uu00 uu00Var, sp00 sp00Var, rzo0 rzo0Var) {
        this.a = uu00Var;
        this.b = sp00Var;
        this.c = rzo0Var;
    }

    @Override // p.owo0
    public final Maybe b(ContextTrack contextTrack) {
        String strA0 = l4o1.a0(contextTrack, ContextTrack$Metadata.KEY_CONTEXT_URI);
        String strUri = contextTrack.uri();
        zu00 zu00Var = this.a;
        MaybeMap maybeMapF = pqo.j(strUri, zu00Var).f(d710.d);
        if (strA0 == null) {
            return maybeMapF;
        }
        Maybe maybeFirstElement = zu00Var.b(new oi("gated-content-related-entity", false, new kq00(strA0, (byte) 25))).filter(e710.d).onErrorComplete().firstElement();
        yjp1 yjp1Var = new yjp1(strA0, (byte) 9);
        maybeFirstElement.getClass();
        return new MaybeSwitchIfEmpty(new MaybeFlatten(maybeFirstElement, yjp1Var).f(new n740(contextTrack, strA0, (byte) 0)), maybeMapF);
    }

    @Override // p.owo0
    public final tka0 e() {
        return rc11.a.b(gxo0.class);
    }

    @Override // p.owo0
    public final void f(ji50 ji50Var) {
        m740 m740Var = new m740(this, (byte) 0);
        Set set = z540.a;
        r640 r640Var = r640.d;
        bp30 bp30Var = bp30.W0;
        LinkedHashMap linkedHashMap = ji50Var.b;
        linkedHashMap.put(exo0.class, r4o1.Q(r640Var, set, m740Var, bp30Var));
        m740 m740Var2 = new m740(this, (byte) 1);
        linkedHashMap.put(fxo0.class, r4o1.Q(r640.f, bmr0.a, m740Var2, bp30.X0));
    }
}
