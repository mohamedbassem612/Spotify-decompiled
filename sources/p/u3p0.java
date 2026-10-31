package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class u3p0 implements p2p0 {
    public final dg30 a;
    public final lzn0 b;
    public final cbr0 c;

    public u3p0(dg30 dg30Var, lzn0 lzn0Var, cbr0 cbr0Var) {
        this.a = dg30Var;
        this.b = lzn0Var;
        this.c = cbr0Var;
    }

    @Override // p.p2p0
    public final void a() {
        this.b.e();
    }

    @Override // p.p2p0
    public final void c(yqq0 yqq0Var, boolean z) {
        int iOrdinal = yqq0Var.ordinal();
        int i = 1;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                i = 2;
            } else {
                if (iOrdinal != 2) {
                    eg.o();
                    return;
                }
                i = 4;
            }
        }
        this.c.a(new tc30(i));
    }

    @Override // p.p2p0
    public final void close() {
        this.b.e();
    }

    @Override // p.p2p0
    public final void d(t2u t2uVar, String str) {
        th30 th30VarE0 = this.a.e0();
        if (th30VarE0.U()) {
            return;
        }
        t2uVar.g1(th30VarE0, str);
    }

    @Override // p.p2p0
    public final void b(ou80 ou80Var) {
    }
}
