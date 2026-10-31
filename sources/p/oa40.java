package p;

import com.spotify.kidsentitybanning.banning.v1.BanForSelfRequest;
import com.spotify.kidsentitybanning.banning.v1.BanStatusRequest;
import com.spotify.kidsentitybanning.banning.v1.BanStatusResponse;
import com.spotify.kidsentitybanning.banning.v1.UpdateBanStatusRequest;
import com.spotify.kidsentitybanning.banning.v1.UpdateBanStatusResponse;
import com.spotify.kidsentitybanning.search.v1.ListViewRequest;
import com.spotify.kidsentitybanning.search.v1.ListViewResponse;
import com.spotify.kidsentitybanning.search.v1.SearchRequest;
import com.spotify.kidsentitybanning.search.v1.SearchResponse;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J+\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004H'¢\u0006\u0004\b\b\u0010\tJ&\u0010\n\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0003\u001a\u00020\f2\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004H'¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u0003\u001a\u00020\f2\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0014\u001a\u00020\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00132\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004H'¢\u0006\u0004\b\u0014\u0010\u0015J&\u0010\u0018\u001a\u00020\u00172\b\b\u0001\u0010\u0003\u001a\u00020\u00162\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001c\u001a\u00020\u001b2\b\b\u0001\u0010\u0003\u001a\u00020\u001a2\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\u001c\u0010\u001dø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001eÀ\u0006\u0001"}, d2 = {"Lp/oa40;", "", "Lcom/spotify/kidsentitybanning/banning/v1/BanStatusRequest;", "request", "Lp/fq21;", "requiresRegional", "Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/kidsentitybanning/banning/v1/BanStatusResponse;", "f", "(Lcom/spotify/kidsentitybanning/banning/v1/BanStatusRequest;Lp/fq21;)Lio/reactivex/rxjava3/core/Single;", "n", "(Lcom/spotify/kidsentitybanning/banning/v1/BanStatusRequest;Lp/fq21;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/kidsentitybanning/banning/v1/UpdateBanStatusRequest;", "Lio/reactivex/rxjava3/core/Completable;", "d", "(Lcom/spotify/kidsentitybanning/banning/v1/UpdateBanStatusRequest;Lp/fq21;)Lio/reactivex/rxjava3/core/Completable;", "Lcom/spotify/kidsentitybanning/banning/v1/UpdateBanStatusResponse;", "h", "(Lcom/spotify/kidsentitybanning/banning/v1/UpdateBanStatusRequest;Lp/fq21;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/kidsentitybanning/banning/v1/BanForSelfRequest;", "j", "(Lcom/spotify/kidsentitybanning/banning/v1/BanForSelfRequest;Lp/fq21;)Lio/reactivex/rxjava3/core/Completable;", "Lcom/spotify/kidsentitybanning/search/v1/SearchRequest;", "Lcom/spotify/kidsentitybanning/search/v1/SearchResponse;", "a", "(Lcom/spotify/kidsentitybanning/search/v1/SearchRequest;Lp/fq21;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/kidsentitybanning/search/v1/ListViewRequest;", "Lcom/spotify/kidsentitybanning/search/v1/ListViewResponse;", "m", "(Lcom/spotify/kidsentitybanning/search/v1/ListViewRequest;Lp/fq21;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_genalphablocking_datasourceimpl-datasourceimpl"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface oa40 {
    static /* synthetic */ Completable b(oa40 oa40Var, UpdateBanStatusRequest updateBanStatusRequest, fq21 fq21Var, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: updateBanStatus");
            return null;
        }
        if ((i & 2) != 0) {
            fq21Var = null;
        }
        return oa40Var.d(updateBanStatusRequest, fq21Var);
    }

    static /* synthetic */ Object c(oa40 oa40Var, UpdateBanStatusRequest updateBanStatusRequest, fq21 fq21Var, lnm lnmVar, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: updateBanStatusWithSuspend");
            return null;
        }
        if ((i & 2) != 0) {
            fq21Var = null;
        }
        return oa40Var.h(updateBanStatusRequest, fq21Var, lnmVar);
    }

    static /* synthetic */ Single e(oa40 oa40Var, BanStatusRequest banStatusRequest, fq21 fq21Var, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: getBanStatus");
            return null;
        }
        if ((i & 2) != 0) {
            fq21Var = null;
        }
        return oa40Var.f(banStatusRequest, fq21Var);
    }

    static /* synthetic */ Object g(oa40 oa40Var, BanStatusRequest banStatusRequest, fq21 fq21Var, lnm lnmVar, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: getBanStatusWithSuspend");
            return null;
        }
        if ((i & 2) != 0) {
            fq21Var = null;
        }
        return oa40Var.n(banStatusRequest, fq21Var, lnmVar);
    }

    static /* synthetic */ Object i(oa40 oa40Var, ListViewRequest listViewRequest, fq21 fq21Var, lnm lnmVar, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: listView");
            return null;
        }
        if ((i & 2) != 0) {
            fq21Var = null;
        }
        return oa40Var.m(listViewRequest, fq21Var, lnmVar);
    }

    static /* synthetic */ Completable k(oa40 oa40Var, BanForSelfRequest banForSelfRequest, fq21 fq21Var, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: banForSelf");
            return null;
        }
        if ((i & 2) != 0) {
            fq21Var = null;
        }
        return oa40Var.j(banForSelfRequest, fq21Var);
    }

    static /* synthetic */ Object l(oa40 oa40Var, SearchRequest searchRequest, fq21 fq21Var, lnm lnmVar, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: search");
            return null;
        }
        if ((i & 2) != 0) {
            fq21Var = null;
        }
        return oa40Var.a(searchRequest, fq21Var, lnmVar);
    }

    @u360({svt.d, "Accept: application/x-protobuf"})
    @wyq0("/spotify.kidsentitybanning.search.v1.ParentalHubService/Search")
    Object a(@elb SearchRequest searchRequest, @rod1 fq21 fq21Var, lnm<? super SearchResponse> lnmVar);

    @u360({svt.d, "Accept: application/x-protobuf"})
    @wyq0("/spotify.kidsentitybanning.banning.v1.BanningService/UpdateBanStatus")
    Completable d(@elb UpdateBanStatusRequest request, @rod1 fq21 requiresRegional);

    @u360({svt.d, "Accept: application/x-protobuf"})
    @wyq0("/spotify.kidsentitybanning.banning.v1.BanningService/BanStatus")
    Single<BanStatusResponse> f(@elb BanStatusRequest request, @rod1 fq21 requiresRegional);

    @u360({svt.d, "Accept: application/x-protobuf"})
    @wyq0("/spotify.kidsentitybanning.banning.v1.BanningService/UpdateBanStatus")
    Object h(@elb UpdateBanStatusRequest updateBanStatusRequest, @rod1 fq21 fq21Var, lnm<? super UpdateBanStatusResponse> lnmVar);

    @u360({svt.d, "Accept: application/x-protobuf"})
    @wyq0("/spotify.kidsentitybanning.banning.v1.BanningService/BanForSelf")
    Completable j(@elb BanForSelfRequest request, @rod1 fq21 requiresRegional);

    @u360({svt.d, "Accept: application/x-protobuf"})
    @wyq0("/spotify.kidsentitybanning.search.v1.ParentalHubService/ListView")
    Object m(@elb ListViewRequest listViewRequest, @rod1 fq21 fq21Var, lnm<? super ListViewResponse> lnmVar);

    @u360({svt.d, "Accept: application/x-protobuf"})
    @wyq0("/spotify.kidsentitybanning.banning.v1.BanningService/BanStatus")
    Object n(@elb BanStatusRequest banStatusRequest, @rod1 fq21 fq21Var, lnm<? super BanStatusResponse> lnmVar);
}
