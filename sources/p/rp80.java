package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class rp80 {
    public sp80 a;
    public iu30 b;
    public u601 c;
    public final ien0 d = new ien0(q6x.b);
    public int e;
    public op80 f;
    public op80 g;
    public o8n h;
    public op80 i;
    public final qp80 j;
    public llm k;

    public rp80(sp80 sp80Var) {
        this.a = sp80Var;
        this.b = new ft30(this.a, (byte) 14);
        fns fnsVar = igu.a;
        this.h = pyf0.a;
        this.j = new qp80(this);
    }

    public final op80 a(op80 op80Var) {
        if (op80Var.equals(this.f) && !this.a.a()) {
            op80 op80Var2 = this.i;
            if (op80Var2 != null) {
                return op80Var2;
            }
            u890.C("output");
            throw null;
        }
        f(this.b, op80Var);
        op80 op80Var3 = this.i;
        if (op80Var3 != null) {
            return op80Var3;
        }
        u890.C("output");
        throw null;
    }

    public final void b(u601 u601Var, o8n o8nVar) {
        dem1.v();
        this.h = o8nVar;
        if (this.c == u601Var) {
            op80 op80Var = (op80) u601Var.getValue();
            if (!u890.j(op80Var, this.g) || this.a.a()) {
                f(this.b, op80Var);
                return;
            }
            return;
        }
        llm llmVar = this.k;
        if (llmVar != null) {
            smo1.q(llmVar);
        }
        this.c = u601Var;
        f(this.b, (op80) u601Var.getValue());
        if (this.e > 0) {
            e();
        }
    }

    public final void c() {
        int i = this.e - 1;
        this.e = i;
        if (i == 0) {
            llm llmVar = this.k;
            if (llmVar != null) {
                smo1.q(llmVar);
            }
            this.k = null;
        }
    }

    public final void d(sp80 sp80Var) {
        this.a = sp80Var;
        this.f = null;
        ft30 ft30Var = new ft30(sp80Var, (byte) 15);
        this.b = ft30Var;
        u601 u601Var = this.c;
        if (u601Var != null) {
            f(ft30Var, (op80) u601Var.getValue());
        }
    }

    public final void e() {
        u601 u601Var = this.c;
        if (u601Var == null) {
            return;
        }
        llm llmVar = this.k;
        if (llmVar != null) {
            smo1.q(llmVar);
        }
        this.k = null;
        op80 op80Var = (op80) u601Var.getValue();
        if (!u890.j(op80Var, this.g) || this.a.a()) {
            f(this.b, op80Var);
        }
        llm llmVarE = smo1.e(this.h.y(op71.f()));
        c921.y(llmVarE, (o8n) null, 0, new x060(u601Var, this, (lnm) null, (byte) 22), 3);
        this.k = llmVarE;
    }

    public final void f(iu30 iu30Var, op80 op80Var) {
        op80 op80Var2 = (op80) iu30Var.invoke(op80Var);
        if ((op80Var2 instanceof wch) && ((wch) op80Var2).b(op80Var)) {
            eg.m("It seems that you are including parent environment when returning the environment. Only return the changes you want to be add to the environment.");
            return;
        }
        op80Var.getClass();
        op80 op80VarK = j6p1.k(op80Var, op80Var2);
        this.d.c(op80VarK);
        this.i = op80VarK;
        this.f = op80Var;
        this.g = op80Var;
    }
}
