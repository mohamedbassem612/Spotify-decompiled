package p;

import com.spotify.collection_platform.esperanto.proto.CollectionPlatformEsperantoItemsResponse;
import com.spotify.collection_platform.esperanto.proto.CollectionPlatformItemsRequest;
import com.spotify.show_esperanto.proto.MarkShowAsPlayedResponse;
import com.spotify.show_esperanto.proto.Status;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class k4h implements wsg0 {
    public final w4h a;

    public k4h(w4h w4hVar) {
        this.a = w4hVar;
    }

    public static MarkShowAsPlayedResponse c(Throwable th) {
        zsg0 zsg0VarO = MarkShowAsPlayedResponse.o();
        stb1 stb1VarP = Status.p();
        stb1VarP.n(ttb1.INTERNAL_ERROR);
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        stb1VarP.q(message);
        zsg0VarO.n((Status) stb1VarP.build());
        return (MarkShowAsPlayedResponse) zsg0VarO.build();
    }

    public static MarkShowAsPlayedResponse d(CollectionPlatformEsperantoItemsResponse collectionPlatformEsperantoItemsResponse) {
        zsg0 zsg0VarO = MarkShowAsPlayedResponse.o();
        stb1 stb1VarP = Status.p();
        stb1VarP.n(collectionPlatformEsperantoItemsResponse.n().o() == 200 ? ttb1.SUCCESS : ttb1.INTERNAL_ERROR);
        stb1VarP.q(collectionPlatformEsperantoItemsResponse.n().q());
        zsg0VarO.n((Status) stb1VarP.build());
        return (MarkShowAsPlayedResponse) zsg0VarO.build();
    }

    public final Single a(String str, String str2) {
        u4h u4hVarQ = CollectionPlatformItemsRequest.q();
        u4hVarQ.t(w5h.e);
        u4hVarQ.r(str);
        return this.a.b(u4hVarQ.build()).map(new t2b(this, (byte) 2)).onErrorReturn(new hfb(this, (byte) 2));
    }

    public final Single b(String str, String str2) {
        u4h u4hVarQ = CollectionPlatformItemsRequest.q();
        u4hVarQ.t(w5h.e);
        u4hVarQ.r(str);
        return this.a.a(u4hVarQ.build()).map(new fza(this, (byte) 2)).onErrorReturn(new a0b(this, (byte) 2));
    }
}
