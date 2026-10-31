package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fge extends age {
    public final fu20 d;
    public final int e;

    public fge(fu20 fu20Var, int i, o8n o8nVar, int i2, int i3) {
        super(o8nVar, i2, i3);
        this.d = fu20Var;
        this.e = i;
    }

    @Override // p.age
    public final String f() {
        return "concurrency=" + this.e;
    }

    @Override // p.age
    public final Object g(ssw0 ssw0Var, lnm lnmVar) {
        Object objCollect = this.d.collect(new ege((faa0) lnmVar.getContext().A(fkj0.W0), l261.a(this.e), ssw0Var, new d561(ssw0Var)), lnmVar);
        return objCollect == d9n.a ? objCollect : rih1.a;
    }

    @Override // p.age
    public final age h(o8n o8nVar, int i, int i2) {
        return new fge(this.d, this.e, o8nVar, i, i2);
    }

    @Override // p.age
    public final jfe j(c9n c9nVar) {
        vu30 hscVar = new hsc(this, (lnm) null, (byte) 7);
        rsw0 rsw0Var = new rsw0(ulo1.o(c9nVar, this.a), mno1.a(this.b, 1, 4));
        rsw0Var.A0(1, rsw0Var, hscVar);
        return rsw0Var;
    }
}
