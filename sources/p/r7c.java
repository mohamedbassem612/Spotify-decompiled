package p;

import com.spotify.browse.clientnative.mobius.BrowseEvent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class r7c implements BrowseEvent {
    public final String a;

    public r7c(String str) {
        this.a = str;
    }

    @Override // com.spotify.browse.clientnative.mobius.BrowseEvent
    public final String breadcrumb() {
        return "SectionDismissed: sectionId=".concat(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r7c) && this.a.equals(((r7c) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
