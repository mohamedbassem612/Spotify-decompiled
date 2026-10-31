package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class x7n1 extends v7n1 {
    public final /* synthetic */ bsd1 b;
    public final /* synthetic */ x5n1 c;
    public final /* synthetic */ c5n1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x7n1(c5n1 c5n1Var, bsd1 bsd1Var, bsd1 bsd1Var2, x5n1 x5n1Var) {
        super(bsd1Var);
        this.b = bsd1Var2;
        this.c = x5n1Var;
        this.d = c5n1Var;
    }

    @Override // p.v7n1
    public final void b() {
        synchronized (this.d.f) {
            try {
                c5n1 c5n1Var = this.d;
                bsd1 bsd1Var = this.b;
                c5n1Var.e.add(bsd1Var);
                bsd1Var.a.b(new bym1(c5n1Var, bsd1Var, (byte) 2));
                if (this.d.l.getAndIncrement() > 0) {
                    this.d.b.b("Already connected to the service.", new Object[0]);
                }
                c5n1.b(this.d, this.c);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
