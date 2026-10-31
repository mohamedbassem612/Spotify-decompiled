package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class zjx0 implements o2i0 {
    public final k2r a;
    public final pjq0 b;
    public final k9r c;
    public final ij81 d;
    public final int e;
    public boolean f;

    public zjx0(k2r k2rVar, vyr vyrVar) {
        pjq0 pjq0Var = new pjq0(vyrVar, (byte) 27);
        k9r k9rVar = new k9r();
        ij81 ij81Var = new ij81(-1, (byte) 12);
        this.a = k2rVar;
        this.b = pjq0Var;
        this.c = k9rVar;
        this.d = ij81Var;
        this.e = 1048576;
        this.f = true;
    }

    @Override // p.o2i0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final akx0 b(yoh0 yoh0Var) {
        yoh0Var.b.getClass();
        return new akx0(yoh0Var, this.a, this.b, this.c.b(yoh0Var), this.d, this.e, this.f, null);
    }

    public zjx0(k2r k2rVar) {
        this(k2rVar, new vyr());
    }
}
