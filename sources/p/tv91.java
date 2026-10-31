package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class tv91 extends cqb1 {
    public long c;

    public tv91(long j, long j2) {
        super(j);
        this.c = j2;
    }

    @Override // p.cqb1
    public final void a(cqb1 cqb1Var) {
        this.c = ((tv91) cqb1Var).c;
    }

    @Override // p.cqb1
    public final cqb1 b() {
        return c(pv91.h().g());
    }

    @Override // p.cqb1
    public final cqb1 c(long j) {
        return new tv91(j, this.c);
    }
}
