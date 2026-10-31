package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wws extends cxs implements Comparable {
    public final int e;
    public final int f;

    public wws(int i, pnf1 pnf1Var, int i2, zws zwsVar, int i3) {
        super(i, pnf1Var, i2);
        this.e = jca.u(i3, zwsVar.B0) ? 1 : 0;
        this.f = this.d.c();
    }

    @Override // p.cxs
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f, ((wws) obj).f);
    }
}
