package p;

import com.spotify.cosmos.util.policy.proto.EpisodePlayedStateDecorationPolicy;
import io.reactivex.rxjava3.functions.Supplier;
import spotify.collection.esperanto.proto.CollectionDecorateRequest;
import spotify.collection.esperanto.proto.CollectionEpisodeDecorationPolicy;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zes implements Supplier {
    public final /* synthetic */ hur a;
    public final /* synthetic */ String b;

    public zes(hur hurVar, String str) {
        this.a = hurVar;
        this.b = str;
    }

    public final Object get() {
        r5h r5hVar = (r5h) this.a.b;
        e3h e3hVarP = CollectionDecorateRequest.p();
        k3h k3hVarO = CollectionEpisodeDecorationPolicy.o();
        k3hVarO.s(EpisodePlayedStateDecorationPolicy.newBuilder().setPlayable(true));
        e3hVarP.t(k3hVarO);
        e3hVarP.q(this.b);
        return r5hVar.e(e3hVarP.build());
    }
}
