package p;

import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u0001H§@¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u0001H§@¢\u0006\u0004\b\u0004\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00012\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0001H§@¢\u0006\u0004\b\t\u0010\u0003J!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0005H'¢\u0006\u0004\b\f\u0010\rJM\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0010\u001a\u00020\u000e2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0005H'¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0001H§@¢\u0006\u0004\b\u0015\u0010\u0003J\u0010\u0010\u0016\u001a\u00020\u0001H§@¢\u0006\u0004\b\u0016\u0010\u0003J\u001b\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u000bH'¢\u0006\u0004\b\u0019\u0010\u001aø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001bÀ\u0006\u0001"}, d2 = {"Lp/t9m1;", "", "d", "(Lp/lnm;)Ljava/lang/Object;", "b", "", "sampleId", "i", "(Ljava/lang/String;Lp/lnm;)Ljava/lang/Object;", "h", "startingStoryId", "Lio/reactivex/rxjava3/core/Single;", "a", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/Single;", "", "useLongText", "useFallbackImage", "locale", "username", "g", "(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/Single;", "f", "e", "Lp/sy21;", "Ljava/lang/Void;", "c", "()Lio/reactivex/rxjava3/core/Single;", "src_main_java_com_spotify_campaigns_wrappedendpoint-wrappedendpoint"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface t9m1 {
    @ay30("campaigns-service/v1/campaigns/wrapped/consumer")
    Single<Object> a(@u0z0("startingStoryId") String startingStoryId);

    @ay30("campaigns-service/v1/campaigns/wrapped/consumer/partial-list")
    Object b(lnm<Object> lnmVar);

    @juo("campaigns-service/v1/campaigns/wrapped/consumer/archive/viewed")
    Single<sy21<Void>> c();

    @ay30("campaigns-service/v1/campaigns/wrapped/consumer/sample-list")
    Object d(lnm<Object> lnmVar);

    @juo("campaigns-service/v1/campaigns/wrapped/consumer/viewcount")
    Object e(lnm<Object> lnmVar);

    @ay30("campaigns-service/v1/campaigns/wrapped/consumer/languages")
    Object f(lnm<Object> lnmVar);

    @ay30("campaigns-service/v1/campaigns/wrapped/consumer/debug")
    Single<Object> g(@u0z0("useLongText") boolean useLongText, @u0z0("useFallbackImage") boolean useFallbackImage, @u0z0("locale") String locale, @u0z0("useUsername") String username, @u0z0("startingStoryId") String startingStoryId);

    @ay30("campaigns-service/v1/campaigns/wrapped/consumer/sample")
    Object h(lnm<Object> lnmVar);

    @ay30("campaigns-service/v1/campaigns/wrapped/consumer/sample/{sampleId}")
    Object i(@t8s0("sampleId") String str, lnm<Object> lnmVar);
}
