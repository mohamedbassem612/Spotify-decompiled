package p;

import com.spotify.player.model.PlayOrigin;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class cge0 {
    public static final PlayOrigin a;

    static {
        PlayOrigin.Builder builder = PlayOrigin.builder("external-integration-service");
        a690 a690Var = b690.a;
        a = builder.referrerIdentifier("external-integration-service").build();
    }
}
