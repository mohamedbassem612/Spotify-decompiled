package p;

import com.spotify.player.model.PlayOrigin;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class o701 implements uot0 {
    public final /* synthetic */ q2p0 a;

    public o701(q2p0 q2p0Var) {
        this.a = q2p0Var;
    }

    public final PlayOrigin get() {
        q2p0 q2p0Var = this.a;
        return PlayOrigin.builder(q2p0Var.f().getName()).viewUri(q2p0Var.e().a).build();
    }
}
