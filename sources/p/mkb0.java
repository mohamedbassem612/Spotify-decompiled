package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class mkb0 implements ky11, r8n {
    public final o8n a;
    public final vu30 b;
    public final llm c;
    public faa0 d;

    public mkb0(o8n o8nVar, vu30 vu30Var) {
        this.a = o8nVar;
        this.b = vu30Var;
        this.c = smo1.e(o8nVar.y(this));
    }

    public final /* bridge */ m8n A(n8n n8nVar) {
        return jmo1.j(this, n8nVar);
    }

    public final /* bridge */ o8n C(n8n n8nVar) {
        return jmo1.p(this, n8nVar);
    }

    @Override // p.ky11
    public final void b() {
        faa0 faa0Var = this.d;
        if (faa0Var != null) {
            op71.o(faa0Var, "Old job was still running!");
        }
        this.d = c921.y(this.c, (o8n) null, 0, this.b, 3);
    }

    @Override // p.ky11
    public final void f() {
        faa0 faa0Var = this.d;
        if (faa0Var != null) {
            faa0Var.d(new tzb0());
        }
        this.d = null;
    }

    public final n8n getKey() {
        return olj0.T0;
    }

    @Override // p.ky11
    public final void h() {
        faa0 faa0Var = this.d;
        if (faa0Var != null) {
            faa0Var.d(new tzb0());
        }
        this.d = null;
    }

    public final /* bridge */ Object o(Object obj, vu30 vu30Var) {
        return jmo1.i(this, obj, vu30Var);
    }

    public final void p(Throwable th, o8n o8nVar) throws Throwable {
        y3k y3kVar = (y3k) o8nVar.A(y3k.b);
        if (y3kVar != null) {
            jm5.r(th, new og(y3kVar, this, (byte) 18));
        }
        r8n r8nVarA = this.a.A(olj0.T0);
        if (r8nVarA == null) {
            throw th;
        }
        r8nVarA.p(th, o8nVar);
    }

    public final /* bridge */ o8n y(o8n o8nVar) {
        return jmo1.r(this, o8nVar);
    }
}
