package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qqb1 extends cqb1 {
    public mqs0 c;
    public int d;

    public qqb1(long j, mqs0 mqs0Var) {
        super(j);
        this.c = mqs0Var;
    }

    public final void a(cqb1 cqb1Var) {
        synchronized (tho1.a) {
            this.c = ((qqb1) cqb1Var).c;
            this.d = ((qqb1) cqb1Var).d;
        }
    }

    public final cqb1 b() {
        return new qqb1(pv91.h().g(), this.c);
    }

    public final cqb1 c(long j) {
        return new qqb1(j, this.c);
    }
}
