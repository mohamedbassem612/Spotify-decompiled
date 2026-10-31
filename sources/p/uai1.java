package p;

import com.spotify.userhighlight.v1.CreateUserHighlightRequest;
import com.spotify.userhighlight.v1.CreateUserHighlightResponse;
import com.spotify.userhighlight.v1.RecommendUserHighlightRangeRequest;
import com.spotify.userhighlight.v1.RecommendUserHighlightRangeResponse;
import com.spotify.userhighlight.v1.UpdateUserHighlightRequest;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\u00012\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0011\u0010\u0012ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"Lp/uai1;", "", "Lcom/spotify/userhighlight/v1/CreateUserHighlightRequest;", "request", "Lcom/spotify/userhighlight/v1/CreateUserHighlightResponse;", "b", "(Lcom/spotify/userhighlight/v1/CreateUserHighlightRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/userhighlight/v1/RecommendUserHighlightRangeRequest;", "Lcom/spotify/userhighlight/v1/RecommendUserHighlightRangeResponse;", "a", "(Lcom/spotify/userhighlight/v1/RecommendUserHighlightRangeRequest;Lp/lnm;)Ljava/lang/Object;", "", "uri", "d", "(Ljava/lang/String;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/userhighlight/v1/UpdateUserHighlightRequest;", "Lp/rih1;", "c", "(Ljava/lang/String;Lcom/spotify/userhighlight/v1/UpdateUserHighlightRequest;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_entitysegments_userhighlightdataimpl-userhighlightdataimpl"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface uai1 {
    @u360({"content-type: application/x-protobuf", "accept: application/x-protobuf"})
    @wyq0("user-highlight/v1/user-highlights/range-recommendations")
    Object a(@elb RecommendUserHighlightRangeRequest recommendUserHighlightRangeRequest, lnm<? super RecommendUserHighlightRangeResponse> lnmVar);

    @u360({"content-type: application/x-protobuf", "accept: application/x-protobuf"})
    @wyq0("user-highlight/v1/user-highlights")
    Object b(@elb CreateUserHighlightRequest createUserHighlightRequest, lnm<? super CreateUserHighlightResponse> lnmVar);

    @yxq0("user-highlight/v1/user-highlights/{uri}")
    @u360({"content-type: application/x-protobuf", "accept: application/x-protobuf"})
    Object c(@t8s0(encoded = true, value = "uri") String str, @elb UpdateUserHighlightRequest updateUserHighlightRequest, lnm<? super rih1> lnmVar);

    @ay30("user-highlight/v1/user-highlights/{uri}")
    @u360({"content-type: application/x-protobuf", "accept: application/x-protobuf"})
    Object d(@t8s0(encoded = true, value = "uri") String str, lnm<Object> lnmVar);
}
