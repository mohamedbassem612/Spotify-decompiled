package p;

import com.spotify.browse.clientnative.mobius.BrowseEvent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class n7c implements BrowseEvent {
    public final int a;

    public n7c(int i) {
        this.a = i;
    }

    @Override // com.spotify.browse.clientnative.mobius.BrowseEvent
    public final String breadcrumb() {
        return f4i1.c(this.a, "ColumnCountChange: columnCount=");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n7c) && this.a == ((n7c) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
