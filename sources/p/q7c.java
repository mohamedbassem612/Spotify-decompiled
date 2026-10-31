package p;

import com.spotify.browse.clientnative.mobius.BrowseEvent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class q7c implements BrowseEvent {
    public final boolean a;

    public q7c(boolean z) {
        this.a = z;
    }

    @Override // com.spotify.browse.clientnative.mobius.BrowseEvent
    public final String breadcrumb() {
        return "PersonalizationStateChanged: dsaEnabled=" + this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q7c) && this.a == ((q7c) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
