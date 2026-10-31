package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class c9c0 implements omo, v89, gq90, hq90, yt90 {
    public final /* synthetic */ d2k a;
    public final omo b;
    public final v89 c;
    public final gq90 d;
    public final hq90 e;

    /* JADX WARN: Multi-variable type inference failed */
    public c9c0(omo omoVar, v89 v89Var, gq90 gq90Var, hq90 hq90Var, xap xapVar, b9c0 b9c0Var, y8c0 y8c0Var, d9c0 d9c0Var) {
        this.a = new d2k(new yt90[]{b9c0Var, y8c0Var, d9c0Var});
        this.b = omoVar;
        this.c = v89Var;
        this.d = gq90Var;
        this.e = hq90Var;
    }

    public final zob1 a() {
        return this.e.a();
    }

    public final zob1 available() {
        return this.c.available();
    }

    public final zob1 b() {
        return this.d.b();
    }

    public final zob1 current() {
        return this.b.current();
    }

    @Override // p.yt90
    public final void start() {
        this.a.start();
    }

    @Override // p.yt90
    public final void stop() {
        this.a.stop();
    }
}
