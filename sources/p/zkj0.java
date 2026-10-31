package p;

import android.content.Context;
import com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ShowDecorationPolicy;
import spotify.collection.esperanto.proto.CollectionEpisodeDecorationPolicy;
import spotify.collection.esperanto.proto.CollectionShowDecorationPolicy;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zkj0 {
    public static final CollectionEpisodeDecorationPolicy d;
    public final Context a;
    public final r5h b;
    public final a7z c;

    static {
        k3h k3hVarO = CollectionEpisodeDecorationPolicy.o();
        k3hVarO.r((EpisodeDecorationPolicy) EpisodeDecorationPolicy.newBuilder().setName(true).setLength(true).build());
        c7h c7hVarN = CollectionShowDecorationPolicy.n();
        c7hVarN.s(ShowDecorationPolicy.newBuilder().setName(true).build());
        k3hVarO.u((CollectionShowDecorationPolicy) c7hVarN.build());
        d = k3hVarO.build();
    }

    public zkj0(Context context, r5h r5hVar, a7z a7zVar) {
        this.a = context;
        this.b = r5hVar;
        this.c = a7zVar;
    }
}
