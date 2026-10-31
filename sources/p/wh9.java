package p;

import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wh9 implements lh9 {
    public final kh9 a;
    public final ni9 b;
    public final c9n c;
    public final llm d;
    public final dt71 e;
    public final ConcurrentLinkedQueue f;
    public jh9 g;

    public wh9(kh9 kh9Var, ni9 ni9Var, q8n q8nVar) {
        llm llmVarX = l1d.x(q8nVar);
        this.a = kh9Var;
        this.b = ni9Var;
        this.c = llmVarX;
        llm llmVarX2 = l1d.x(q8nVar);
        this.d = llmVarX2;
        dt71 dt71VarE = mgo1.e(0, 0, 0, 7);
        this.e = dt71VarE;
        this.f = new ConcurrentLinkedQueue();
        l4p1.u(llmVarX2, f5p1.q(dt71VarE, new u98(this)));
    }

    public final void b(jh9 jh9Var) {
        e(new nh9(jh9Var));
    }

    public final void c(pf9 pf9Var) {
        e(new ph9(pf9Var));
    }

    public final void clear() {
        e(mh9.a);
    }

    public final void d(jh9 jh9Var) {
        e(new qh9(jh9Var));
    }

    public final void e(rh9 rh9Var) {
        c921.y(this.d, (o8n) null, 0, new k96(this, rh9Var, (lnm) null, (byte) 21), 3);
    }

    public final void f() {
        jh9 jh9Var;
        if (this.g == null && (jh9Var = (jh9) this.f.poll()) != null) {
            this.g = jh9Var;
            c9n c9nVar = this.c;
            op71.r(c9nVar.J());
            l4p1.u(c9nVar, f5p1.q(u4p1.b0(new uh9(h4p1.l(new vh9(((Number) this.b.g.b()).intValue(), (lnm) null, (byte) 0)), jh9Var, (byte) 0), new ry5(this, jh9Var, (lnm) null, (byte) 14)), new ry5(this, (lnm) null, (byte) 15)));
        }
    }

    public final void a(String str) {
    }
}
