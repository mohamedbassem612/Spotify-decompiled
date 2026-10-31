package p;

import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ym21 {
    public final Function0 a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();
    public final LinkedHashMap d = new LinkedHashMap();

    public ym21(Function0 function0) {
        this.a = function0;
    }

    public final bas a() {
        return new bas(new v3v0(1, this, ym21.class, "generatePlaybackMetadata", "generatePlaybackMetadata(Lcom/spotify/betamax/player/PlaybackIdentity;)Ljava/util/Map;", 0, (byte) 22), new v3v0(1, this, ym21.class, "removePlaybackMetadata", "removePlaybackMetadata(Lcom/spotify/betamax/player/PlaybackIdentity;)V", 0, (byte) 23));
    }
}
