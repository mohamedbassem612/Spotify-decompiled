package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.functions.Consumer;
import p.fn31;
import p.o8n;
import p.smo1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class u7m0 implements Connectable {
    public final /* synthetic */ o8n a;
    public final /* synthetic */ l2 b;

    public /* synthetic */ u7m0(o8n o8nVar, l2 l2Var) {
        this.a = o8nVar;
        this.b = l2Var;
    }

    public final Connection L(final Consumer consumer) {
        MobiusCoroutines.Companion companion = MobiusCoroutines.Companion.a;
        final llm llmVarE = smo1.e(this.a);
        final l2 l2Var = this.b;
        return new Connection<Object>() { // from class: com.spotify.mobius.coroutines.MobiusCoroutines$Companion$effectHandler$1$1
            public final void accept(Object obj) {
                fn31.T(llmVarE, (o8n) null, 0, new MobiusCoroutines$Companion$effectHandler$1$1$accept$1(l2Var, obj, consumer, null), 3);
            }

            public final void dispose() {
                smo1.r(llmVarE, "Effect Handler disposed");
            }
        };
    }
}
