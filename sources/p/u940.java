package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class u940 implements q940, f961 {
    public final llm a;
    public final s940 b;

    public u940(llm llmVar, s940 s940Var) {
        this.a = llmVar;
        this.b = s940Var;
    }

    public final en10 a(jm10 jm10Var) {
        return this.b.a(jm10Var);
    }

    public final Object getApi() {
        return this.b;
    }

    public final void shutdown() {
        smo1.p(this.a, (CancellationException) null);
    }
}
