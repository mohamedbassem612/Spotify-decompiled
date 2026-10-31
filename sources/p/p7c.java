package p;

import com.spotify.browse.clientnative.mobius.BrowseEvent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class p7c implements BrowseEvent {
    public final int a;

    public p7c(int i) {
        this.a = i;
    }

    @Override // com.spotify.browse.clientnative.mobius.BrowseEvent
    public final String breadcrumb() {
        return f4i1.c(this.a, "OnUIRendered: columnCount=");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p7c) && this.a == ((p7c) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
