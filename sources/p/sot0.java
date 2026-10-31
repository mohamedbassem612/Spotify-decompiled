package p;

import com.spotify.player.model.PlayOrigin;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class sot0 {
    public static PlayOrigin a(gn10 gn10Var, String str, lik1 lik1Var, a690 a690Var) {
        return PlayOrigin.builder(gn10Var.getName()).featureVersion(str).viewUri(lik1Var.a).referrerIdentifier(a690Var.a.getName()).build();
    }
}
