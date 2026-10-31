package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mud0 implements okf1 {
    public final nud0 a;

    public mud0(nud0 nud0Var) {
        this.a = nud0Var;
    }

    @Override // p.okf1
    public final nkf1 a(q2p0 q2p0Var) {
        return this.a.g(q2p0Var).a();
    }

    @Override // p.okf1
    public final boolean b(kkf1 kkf1Var) {
        return nhc1.Y(kkf1Var.a.uri(), "spotify:room:", false);
    }
}
