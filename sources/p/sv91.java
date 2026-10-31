package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class sv91 extends cqb1 {
    public int c;

    public sv91(long j, int i) {
        super(j);
        this.c = i;
    }

    @Override // p.cqb1
    public final void a(cqb1 cqb1Var) {
        this.c = ((sv91) cqb1Var).c;
    }

    @Override // p.cqb1
    public final cqb1 b() {
        return c(pv91.h().g());
    }

    @Override // p.cqb1
    public final cqb1 c(long j) {
        return new sv91(j, this.c);
    }
}
