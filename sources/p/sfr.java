package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sfr implements a4l {
    public final zfr a;
    public final llm b;
    public final bpb1 c = gio1.b(z6x.a);
    public xab1 d;

    public sfr(zfr zfrVar, q8n q8nVar) {
        this.a = zfrVar;
        this.b = i3a.k(q8nVar);
    }

    public final void a() {
        xab1 xab1Var = this.d;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.d = null;
        this.c.m((Object) null, z6x.a);
    }

    public final void b() {
        xab1 xab1Var = this.d;
        if (xab1Var == null || !xab1Var.isActive()) {
            this.d = fn31.T(this.b, (o8n) null, 0, new n1o(this, null, (byte) 6), 3);
        }
    }
}
