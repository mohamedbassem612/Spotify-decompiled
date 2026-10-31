package p;

import com.spotify.player.model.Context$Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public enum bu4 implements z0z {
    /* JADX INFO: Fake field, exist only in values array */
    NONE(Context$Metadata.SHUFFLE_ALGORITHM_NONE),
    BETA("beta"),
    /* JADX INFO: Fake field, exist only in values array */
    INTERNAL("internal");

    public final String a;

    bu4(String str) {
        this.a = str;
    }

    public final String value() {
        return this.a;
    }
}
