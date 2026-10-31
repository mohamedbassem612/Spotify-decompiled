package p;

import com.spotify.player.model.PlayOrigin;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class f701 implements uot0 {
    public final /* synthetic */ gn10 a;
    public final /* synthetic */ lik1 b;

    public f701(gn10 gn10Var, lik1 lik1Var) {
        this.a = gn10Var;
        this.b = lik1Var;
    }

    public final PlayOrigin get() {
        return PlayOrigin.builder(this.a.getName()).viewUri(this.b.a).build();
    }
}
