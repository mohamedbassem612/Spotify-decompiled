package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class m2 extends x7e0 {
    public final uu00 d;
    public final llm e;
    public xab1 f;
    public final String g;
    public final bpb1 h;
    public final bpb1 i;

    public m2(uu00 uu00Var, u2 u2Var, q8n q8nVar) {
        this.d = uu00Var;
        this.e = smo1.e(q8nVar);
        String entityUri = u2Var.getEntityUri();
        this.g = entityUri == null ? "" : entityUri;
        bpb1 bpb1VarB = gio1.b((Object) null);
        this.h = bpb1VarB;
        this.i = bpb1VarB;
    }

    public final void e() {
        if (d()) {
            return;
        }
        j();
        this.f = l4p1.u(this.e, x4p1.h(f5p1.q(yoi1.g(((zu00) this.d).b(new oi("about-entity-bottomsheet", new j2(this, (byte) 0))).filter(zp8.c).map(new w4b1(this, (byte) 2))), new k2(this, (lnm) null, (byte) 0)), new l2(this, (lnm) null, (byte) 0)));
    }

    public final void f() {
        xab1 xab1Var = this.f;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
    }
}
