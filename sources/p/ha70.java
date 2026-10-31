package p;

import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public enum ha70 {
    DEFAULT,
    CIRCULAR,
    CIRCULAR_WITH_RIPPLE,
    SQUARE_WITH_RIPPLE;

    public final HubsImmutableComponentBundle a = HubsImmutableComponentBundle.b.a.I("style", this).o();

    ha70() {
    }
}
