package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class v7d0 implements r2g {
    public final zpp a;
    public final dt71 b;
    public final dt71 c;
    public final int d;
    public final yd91 e;
    public final huz f;
    public final ke71 g;

    public v7d0(zpp zppVar) {
        this.a = zppVar;
        dt71 dt71VarE = mgo1.e(0, 1, 0, 5);
        this.b = dt71VarE;
        this.c = dt71VarE;
        this.d = 2;
        this.e = new yd91(3, new nzb0(this, (byte) 21));
        this.f = new huz(Boolean.TRUE, (byte) 10);
        this.g = o381.a;
    }

    @Override // p.xe91
    public final l381 c() {
        return this.g;
    }

    @Override // p.xe91
    public final yd91 d() {
        return this.e;
    }

    @Override // p.xe91
    public final mr20 getShow() {
        return this.f;
    }

    @Override // p.r2g
    public final int getType() {
        return this.d;
    }

    @Override // p.r2g
    public final Integer i() {
        return 1;
    }
}
