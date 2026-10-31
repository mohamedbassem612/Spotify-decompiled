package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class suy0 implements awh0 {
    public final jks a;
    public final g0l b;
    public final zor c;
    public final m0s d;
    public final q8n e;
    public llm f;

    public suy0(jks jksVar, g0l g0lVar, zor zorVar, m0s m0sVar, q8n q8nVar) {
        this.a = jksVar;
        this.b = g0lVar;
        this.c = zorVar;
        this.d = m0sVar;
        this.e = q8nVar;
        this.f = i3a.k(q8nVar);
    }

    public final void a() {
        fn31.T(this.f, (o8n) null, 0, new ruy0(this, null, (byte) 1), 3);
    }

    public final void b() {
        smo1.p(this.f, (CancellationException) null);
        llm llmVarK = i3a.k(this.e);
        this.f = llmVarK;
        fn31.T(llmVarK, (o8n) null, 0, new ruy0(this, null, (byte) 0), 3);
    }
}
