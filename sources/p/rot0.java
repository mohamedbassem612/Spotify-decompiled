package p;

import com.spotify.player.model.PlayOrigin;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rot0 {
    public final String a;

    public rot0(String str) {
        this.a = str;
    }

    public final PlayOrigin a(String str) {
        return PlayOrigin.builder("your-library").featureVersion(this.a).viewUri(str).referrerIdentifier("your-library").build();
    }
}
