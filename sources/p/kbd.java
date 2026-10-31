package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kbd implements f961 {
    public final add a;
    public final ov20 b;

    public kbd(add addVar, ov20 ov20Var) {
        this.a = addVar;
        this.b = ov20Var;
    }

    public final mr20 a() {
        return this.a.a.h() ? rqt0.u(new hs6(this.b.c("campfire", "DISABLED_CANNOT_ENABLE"), (byte) 23)) : new huz(Boolean.FALSE, (byte) 10);
    }

    public final mr20 b() {
        return this.a.a.h() ? rqt0.u(new hs6(this.b.c("campfire", "DISABLED_CANNOT_ENABLE"), (byte) 24)) : new huz(Boolean.FALSE, (byte) 10);
    }

    @Override // p.f961
    public final Object getApi() {
        return this;
    }

    @Override // p.dwo
    public final void shutdown() {
    }
}
