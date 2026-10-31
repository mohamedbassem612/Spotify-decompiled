package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class i4a0 implements t2a0 {
    public final ynb0 a;
    public final b0a0 b;
    public final hq90 c;
    public final llm e;
    public xab1 f;
    public final idd1 d = new idd1(new pr90(this, (byte) 7));
    public final rku g = new rku();

    public i4a0(ynb0 ynb0Var, b0a0 b0a0Var, hq90 hq90Var, q8n q8nVar) {
        this.a = ynb0Var;
        this.b = b0a0Var;
        this.c = hq90Var;
        this.e = us71.h(q8nVar);
    }

    public final void start() {
        this.f = fn31.T(this.e, (o8n) null, 0, new no70(this, (lnm) null, (byte) 14), 3);
    }

    public final void stop() {
        xab1 xab1Var = this.f;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.g.a();
    }
}
