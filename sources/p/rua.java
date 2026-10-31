package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rua implements fn51 {
    public final uua a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public rua(uua uuaVar, long j, long j2, long j3, long j4, long j5) {
        this.a = uuaVar;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
    }

    @Override // p.fn51
    public final en51 b(long j) {
        pn51 pn51Var = new pn51(j, tua.h(this.a.b(j), 0L, this.c, this.d, this.e, this.f));
        return new en51(pn51Var, pn51Var);
    }

    @Override // p.fn51
    public final boolean d() {
        return true;
    }

    @Override // p.fn51
    public final long g() {
        return this.b;
    }

    public final long l(long j) {
        return this.a.b(j);
    }
}
