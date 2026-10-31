package p;

import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jt3 implements Connection {
    public final /* synthetic */ p811 a;
    public final /* synthetic */ llm b;
    public final /* synthetic */ p811 c;
    public final /* synthetic */ Consumer d;
    public final /* synthetic */ g931 e;
    public final /* synthetic */ bt3 f;

    public jt3(p811 p811Var, llm llmVar, p811 p811Var2, Consumer consumer, g931 g931Var, bt3 bt3Var) {
        this.a = p811Var;
        this.b = llmVar;
        this.c = p811Var2;
        this.d = consumer;
        this.e = g931Var;
        this.f = bt3Var;
    }

    public final void accept(Object obj) {
        by41 by41Var = (by41) obj;
        boolean z = by41Var instanceof xx41;
        llm llmVar = this.b;
        Consumer consumer = this.d;
        if (z) {
            p811 p811Var = this.a;
            faa0 faa0Var = (faa0) p811Var.a;
            if (faa0Var != null) {
                faa0Var.d((CancellationException) null);
            }
            p811Var.a = fn31.T(llmVar, (o8n) null, 0, new c6(consumer, by41Var, this.e, (lnm) null, (byte) 23), 3);
            return;
        }
        if (by41Var.equals(ay41.a)) {
            p811 p811Var2 = this.c;
            faa0 faa0Var2 = (faa0) p811Var2.a;
            if (faa0Var2 != null) {
                faa0Var2.d((CancellationException) null);
            }
            p811Var2.a = fn31.T(llmVar, (o8n) null, 0, new ht3(consumer, null, (byte) 0), 3);
            return;
        }
        boolean z2 = by41Var instanceof zx41;
        bt3 bt3Var = this.f;
        if (z2) {
            fn31.T(llmVar, (o8n) null, 0, new k2(bt3Var, by41Var, (lnm) null, (byte) 24), 3);
            return;
        }
        if (by41Var.equals(jx41.a)) {
            fn31.T(llmVar, (o8n) null, 0, new it3(bt3Var, null, (byte) 0), 3);
        } else if (by41Var.equals(ix41.a)) {
            fn31.T(llmVar, (o8n) null, 0, new it3(bt3Var, null, (byte) 1), 3);
        } else {
            eg.o();
        }
    }

    public final void dispose() {
        smo1.p(this.b, (CancellationException) null);
    }
}
