package p;

import com.spotify.ratingsandreviews.ratings.model.proto.RateRequest;
import io.reactivex.rxjava3.core.Completable;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\nJ,\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000bH§@¢\u0006\u0004\b\u000f\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Lp/itz0;", "", "", "showUri", "Lcom/spotify/ratingsandreviews/ratings/model/proto/RateRequest;", "rateRequest", "Lio/reactivex/rxjava3/core/Completable;", "b", "(Ljava/lang/String;Lcom/spotify/ratingsandreviews/ratings/model/proto/RateRequest;)Lio/reactivex/rxjava3/core/Completable;", "a", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/Completable;", "", "unreportedConsumptionMs", "Lp/sy21;", "Ljava/lang/Void;", "c", "(Ljava/lang/String;Ljava/lang/Long;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_ratings_ratingsandreviews-ratingsandreviews"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface itz0 {
    static /* synthetic */ Object d(itz0 itz0Var, String str, Long l, lnm lnmVar, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: getEligibility");
            return null;
        }
        if ((i & 2) != 0) {
            l = null;
        }
        return itz0Var.c(str, l, lnmVar);
    }

    @juo("ratings/v1/rating/show/{showUri}")
    Completable a(@t8s0("showUri") String showUri);

    @wyq0("ratings/v1/rating/show/{showUri}")
    Completable b(@t8s0("showUri") String showUri, @elb RateRequest rateRequest);

    @ay30("ratings/v2/rating/eligibility/show/{showUri}")
    Object c(@t8s0("showUri") String str, @u0z0("unreported_consumption_ms") Long l, lnm<? super sy21<Void>> lnmVar);
}
