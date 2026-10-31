package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ws0 implements dwo {
    public final xs0 a;
    public final vt0 b;
    public final zwz0 c;
    public final xob1 d;
    public final llm e;

    public ws0(q8n q8nVar, xs0 xs0Var, a44 a44Var, vt0 vt0Var, zwz0 zwz0Var, crd crdVar, xob1 xob1Var, Context context, kly0 kly0Var) {
        this.a = xs0Var;
        this.b = vt0Var;
        this.c = zwz0Var;
        this.d = xob1Var;
        llm llmVarE = smo1.e(q8nVar);
        this.e = llmVarE;
        if (!a44Var.f() || xoi1.b(context) || ((drd) crdVar).a() || !(((lrw0) kly0Var.get()).b instanceof sze1)) {
            xs0Var.a(false);
        } else if (a44Var.b()) {
            c921.y(llmVarE, (o8n) null, 0, new vs0(this, (lnm) null, (byte) 0), 3);
        } else {
            c921.y(llmVarE, (o8n) null, 0, new us0(this, (lnm) null), 3);
        }
    }

    public final void shutdown() {
        smo1.q(this.e);
        vt0 vt0Var = this.b;
        op71.r(vt0Var.i.a);
        vt0Var.j.l((Object) null);
    }
}
