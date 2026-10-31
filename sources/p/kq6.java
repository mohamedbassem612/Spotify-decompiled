package p;

import com.spotify.cosmos.util.policy.proto.ArtistDecorationPolicy;
import spotify.collection.esperanto.proto.CollectionArtistDecorationPolicy;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kq6 {
    public static final CollectionArtistDecorationPolicy b;
    public final r5h a;

    static {
        l0h l0hVarO = CollectionArtistDecorationPolicy.o();
        l0hVarO.n((ArtistDecorationPolicy) ArtistDecorationPolicy.newBuilder().setName(true).setLink(true).setPortraits(true).build());
        b = l0hVarO.build();
    }

    public kq6(r5h r5hVar) {
        this.a = r5hVar;
    }
}
