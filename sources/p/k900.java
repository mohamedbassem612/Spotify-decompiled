package p;

import com.spotify.eventcardinfoservice.v1.EventCardInfoResponse;
import spotify.collection.esperanto.proto.CollectionArtist;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class k900 {
    public final EventCardInfoResponse a;
    public final CollectionArtist b;

    public k900(EventCardInfoResponse eventCardInfoResponse, CollectionArtist collectionArtist) {
        this.a = eventCardInfoResponse;
        this.b = collectionArtist;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k900)) {
            return false;
        }
        k900 k900Var = (k900) obj;
        return this.a.equals(k900Var.a) && this.b.equals(k900Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
