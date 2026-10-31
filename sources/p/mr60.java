package p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mr60 implements okf1 {
    public final nr60 a;
    public final sn4 b;

    public mr60(nr60 nr60Var, sn4 sn4Var) {
        this.a = nr60Var;
        this.b = sn4Var;
    }

    @Override // p.okf1
    public final nkf1 a(q2p0 q2p0Var) {
        return this.a.g(q2p0Var).h();
    }

    @Override // p.okf1
    public final boolean b(kkf1 kkf1Var) {
        ContextTrack contextTrack = kkf1Var.a;
        sn4 sn4Var = this.b;
        return (s3o1.v(contextTrack, sn4Var.b()) || (sn4Var.b() && kkf1Var.c && !l4o1.F(contextTrack))) && kkf1Var.b;
    }
}
