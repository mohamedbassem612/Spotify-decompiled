package p;

import com.spotify.eventcardinfoservice.v1.EventCardInfoResponse;
import spotify.collection.esperanto.proto.CollectionArtist;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class g900 implements h900 {
    public final EventCardInfoResponse a;
    public final CollectionArtist b;

    public g900(EventCardInfoResponse eventCardInfoResponse, CollectionArtist collectionArtist) {
        this.a = eventCardInfoResponse;
        this.b = collectionArtist;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g900)) {
            return false;
        }
        g900 g900Var = (g900) obj;
        return this.a.equals(g900Var.a) && this.b.equals(g900Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
