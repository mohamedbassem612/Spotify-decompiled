package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class opb1 extends cqb1 {
    public d9 c;
    public int d;
    public int e;

    public opb1(long j, d9 d9Var) {
        super(j);
        this.c = d9Var;
    }

    @Override // p.cqb1
    public final void a(cqb1 cqb1Var) {
        synchronized (nho1.a) {
            this.c = ((opb1) cqb1Var).c;
            this.d = ((opb1) cqb1Var).d;
            this.e = ((opb1) cqb1Var).e;
        }
    }

    @Override // p.cqb1
    public final cqb1 b() {
        return c(pv91.h().g());
    }

    @Override // p.cqb1
    public final cqb1 c(long j) {
        return new opb1(j, this.c);
    }
}
