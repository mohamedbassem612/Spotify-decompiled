package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vv91 extends cqb1 {
    public Object c;

    public vv91(long j, Object obj) {
        super(j);
        this.c = obj;
    }

    @Override // p.cqb1
    public final void a(cqb1 cqb1Var) {
        this.c = ((vv91) cqb1Var).c;
    }

    @Override // p.cqb1
    public final cqb1 b() {
        return new vv91(pv91.h().g(), this.c);
    }

    @Override // p.cqb1
    public final cqb1 c(long j) {
        return new vv91(j, this.c);
    }
}
