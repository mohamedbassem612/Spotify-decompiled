package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class cqb1 {
    public long a;
    public cqb1 b;

    public cqb1(long j) {
        this.a = j;
    }

    public abstract void a(cqb1 cqb1Var);

    public cqb1 b() {
        return new ldt(pv91.h().g());
    }

    public cqb1 c(long j) {
        cqb1 cqb1VarB = b();
        cqb1VarB.a = j;
        return cqb1VarB;
    }
}
