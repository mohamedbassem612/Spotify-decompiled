package p;

import com.spotify.player.model.Context$Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public enum kv4 implements z0z {
    NONE(Context$Metadata.SHUFFLE_ALGORITHM_NONE),
    /* JADX INFO: Fake field, exist only in values array */
    LEAVEBEHIND_AD("leavebehind_ad");

    public final String a;

    kv4(String str) {
        this.a = str;
    }

    public final String value() {
        return this.a;
    }
}
