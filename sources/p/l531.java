package p;

import android.os.Bundle;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class l531 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ m531 a;

    public l531(m531 m531Var) {
        this.a = m531Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        b531 b531Var = (b531) obj;
        xh71.b(this.a.b, new wa71(b531Var.a, (String) null, (cqs0) null, (dqi1) null, b531Var.b, (String) null, (Bundle) null, 110), mno1.h(new mmr0[]{new mmr0("voting.results.share.urls", p7h.H(new String[]{b531Var.c})), new mmr0("voting.results.share.card.accessibility.texts", p7h.H(new String[]{b531Var.d}))}), new vm71("voting-results-share-card"), b531Var.e, (List) null, 16);
        return rih1.a;
    }
}
