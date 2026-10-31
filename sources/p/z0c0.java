package p;

import com.spotify.collection_esperanto.proto.CollectionUnplayedRequest;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.internal.functions.Functions;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class z0c0 implements arg0 {
    public final r5h a;

    public z0c0(r5h r5hVar) {
        this.a = r5hVar;
    }

    public final Completable a(String[] strArr) {
        l7h l7hVarO = CollectionUnplayedRequest.o();
        l7hVarO.n(f46.G(strArr));
        Completable completableIgnoreElement = this.a.callSingle("spotify.collection_esperanto.proto.CollectionService", "RemoveUnplayed", (CollectionUnplayedRequest) l7hVarO.build()).map(xbp1.Q0).ignoreElement();
        completableIgnoreElement.getClass();
        return completableIgnoreElement.o(Functions.h);
    }

    public final Completable b(String[] strArr) {
        l7h l7hVarO = CollectionUnplayedRequest.o();
        l7hVarO.n(f46.G(strArr));
        Completable completableIgnoreElement = this.a.callSingle("spotify.collection_esperanto.proto.CollectionService", "AddUnplayed", (CollectionUnplayedRequest) l7hVarO.build()).map(drm0.P0).ignoreElement();
        completableIgnoreElement.getClass();
        return completableIgnoreElement.o(Functions.h);
    }
}
