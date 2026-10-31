package p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tkn0 implements okf1 {
    public final ukn0 a;

    public tkn0(ukn0 ukn0Var) {
        this.a = ukn0Var;
    }

    @Override // p.okf1
    public final nkf1 a(q2p0 q2p0Var) {
        return this.a.mo911g(q2p0Var).c();
    }

    @Override // p.okf1
    public final boolean b(kkf1 kkf1Var) {
        ContextTrack contextTrack = kkf1Var.a;
        return l4o1.O(contextTrack) && nhc1.Y(contextTrack.uri(), "spotify:media:", false);
    }
}
