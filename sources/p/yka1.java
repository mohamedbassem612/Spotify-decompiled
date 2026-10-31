package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yka1 {
    public final v9c a;
    public final llm b;
    public xab1 c;
    public final bpb1 d;
    public final kr41 e;

    public yka1(v9c v9cVar, q8n q8nVar) {
        this.a = v9cVar;
        this.b = smo1.e(flo1.l(guo1.B(), q8nVar).y(new v62(olj0.T0, (byte) 22)));
        bpb1 bpb1VarB = gio1.b((Object) null);
        this.d = bpb1VarB;
        this.e = new kr41(new any(bpb1VarB, (byte) 18), (byte) 11);
    }

    public final void a() {
        if (this.d.getValue() == null) {
            xab1 xab1Var = this.c;
            if (xab1Var == null || !xab1Var.isActive()) {
                this.c = fn31.T(this.b, (o8n) null, 0, new uk71(this, null), 3);
            }
        }
    }

    public final void b() {
        xab1 xab1Var = this.c;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.c = null;
    }
}
