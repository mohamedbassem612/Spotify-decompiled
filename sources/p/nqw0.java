package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nqw0 implements yt90 {
    public final l6s a;
    public final l6s b;
    public final llm c;

    public nqw0(l6s l6sVar, l6s l6sVar2, q8n q8nVar) {
        this.a = l6sVar;
        this.b = l6sVar2;
        this.c = i3a.k(q8nVar);
    }

    public final void start() {
        fn31.T(this.c, (o8n) null, 0, new c3u0(this, (lnm) null, (byte) 18), 3);
    }

    public final void stop() {
        op71.q(this.c.a, (CancellationException) null);
    }
}
