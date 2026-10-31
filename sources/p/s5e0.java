package p;

import com.spotify.cosmos.util.policy.proto.TrackDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.TrackPlayedStateDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.TrackSyncDecorationPolicy;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import spotify.collection.esperanto.proto.CollectionTrackDecorationPolicy;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class s5e0 implements ObservableTransformer {
    public static final CollectionTrackDecorationPolicy b;
    public final r5h a;

    static {
        TrackDecorationPolicy trackDecorationPolicyBuild = TrackDecorationPolicy.newBuilder().setLink(true).setIsExplicit(true).setIs19PlusOnly(true).build();
        TrackPlayedStateDecorationPolicy trackPlayedStateDecorationPolicyBuild = TrackPlayedStateDecorationPolicy.newBuilder().setPlayable(true).setPlayabilityRestriction(true).build();
        TrackSyncDecorationPolicy trackSyncDecorationPolicyBuild = TrackSyncDecorationPolicy.newBuilder().setOfflineState(true).build();
        k7h k7hVarN = CollectionTrackDecorationPolicy.n();
        k7hVarN.z(trackDecorationPolicyBuild);
        k7hVarN.w(trackPlayedStateDecorationPolicyBuild);
        k7hVarN.x(trackSyncDecorationPolicyBuild);
        b = k7hVarN.build();
    }

    public s5e0(r5h r5hVar) {
        this.a = r5hVar;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.flatMap(new dg90(this, (byte) 15));
    }
}
