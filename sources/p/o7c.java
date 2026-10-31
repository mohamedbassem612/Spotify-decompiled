package p;

import com.spotify.browse.clientnative.mobius.BrowseEvent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class o7c implements BrowseEvent {
    public static final o7c a = new o7c();

    @Override // com.spotify.browse.clientnative.mobius.BrowseEvent
    public final String breadcrumb() {
        return "Foregrounded";
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof o7c);
    }

    public final int hashCode() {
        return -1381080802;
    }

    public final String toString() {
        return "Foregrounded";
    }
}
