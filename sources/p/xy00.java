package p;

import com.spotify.cosmos.util.policy.proto.ArtistCollectionDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.TrackCollectionDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.TrackDecorationPolicy;
import kotlin.jvm.functions.Function0;
import spotify.collection.esperanto.proto.CollectionTrackDecorationPolicy;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class xy00 extends hab0 implements Function0 {
    public static final xy00 a = new xy00(0);

    public final Object invoke() {
        k7h k7hVarN = CollectionTrackDecorationPolicy.n();
        k7hVarN.y(TrackDecorationPolicy.newBuilder().setIs19PlusOnly(true).setIsExplicit(true).setPlayable(true));
        k7hVarN.t(TrackCollectionDecorationPolicy.newBuilder().setIsBanned(true));
        k7hVarN.q(ArtistCollectionDecorationPolicy.newBuilder().setIsBanned(true));
        return k7hVarN.build();
    }
}
