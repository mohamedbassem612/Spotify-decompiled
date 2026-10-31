package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.wrapped.v1.proto.CardShareConfiguration;
import com.spotify.wrapped.v1.proto.ConsumerShareRequestParameters;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class h9m1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ cik1 a;

    public h9m1(cik1 cik1Var) {
        this.a = cik1Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        c9m1 c9m1Var = (c9m1) obj;
        CardShareConfiguration cardShareConfiguration = c9m1Var.c;
        if (cik1.h(cardShareConfiguration, c9m1Var.b)) {
            mmr0 mmr0VarA = p1p1.A(cardShareConfiguration, c9m1Var.d, c9m1Var.e);
            CardShareConfiguration cardShareConfiguration2 = (CardShareConfiguration) mmr0VarA.a;
            int iIntValue = ((Number) mmr0VarA.b).intValue();
            this.a.n(c9m1Var.b, c9m1Var.a, cardShareConfiguration2, (ConsumerShareRequestParameters) null, iIntValue, (tv80) null);
        }
        return rih1.a;
    }
}
