package p;

import com.spotify.collection_platform.esperanto.proto.CollectionPlatformItemsRequest;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.internal.functions.Functions;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class x5h implements arg0 {
    public final w4h a;

    public x5h(w4h w4hVar) {
        this.a = w4hVar;
    }

    public final Completable a(String[] strArr) {
        u4h u4hVarQ = CollectionPlatformItemsRequest.q();
        u4hVarQ.t(w5h.e);
        u4hVarQ.n(f46.G(strArr));
        Completable completableIgnoreElement = this.a.a(u4hVarQ.build()).ignoreElement();
        completableIgnoreElement.getClass();
        return completableIgnoreElement.o(Functions.h);
    }

    public final Completable b(String[] strArr) {
        u4h u4hVarQ = CollectionPlatformItemsRequest.q();
        u4hVarQ.t(w5h.e);
        u4hVarQ.n(f46.G(strArr));
        Completable completableIgnoreElement = this.a.b(u4hVarQ.build()).ignoreElement();
        completableIgnoreElement.getClass();
        return completableIgnoreElement.o(Functions.h);
    }
}
