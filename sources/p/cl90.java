package p;

import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cl90 implements anc0 {
    public xab1 a;
    public final /* synthetic */ ur00 b;
    public final /* synthetic */ List c;

    public cl90(ur00 ur00Var, List list) {
        this.b = ur00Var;
        this.c = list;
    }

    @Override // p.anc0
    public final void a() {
        xab1 xab1Var = this.a;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
    }

    @Override // p.anc0
    public final void b() {
        ur00 ur00Var = this.b;
        this.a = fn31.T(smo1.e((q8n) ur00Var.f), (o8n) null, 0, new x060(ur00Var, this.c, (lnm) null, (byte) 28), 3);
    }
}
