package p;

import com.spotify.trending.v1.TnyLocationSuggestRequest;
import com.spotify.trending.v1.TnyLocationSuggestResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lp/yne0;", "", "Lcom/spotify/trending/v1/TnyLocationSuggestRequest;", "request", "Lcom/spotify/trending/v1/TnyLocationSuggestResponse;", "a", "(Lcom/spotify/trending/v1/TnyLocationSuggestRequest;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_trendingnearyou_datasource-datasource"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface yne0 {
    @u360({svt.d, "Accept: application/x-protobuf"})
    @wyq0("trending-near-you/v1/locations:suggest")
    Object a(@elb TnyLocationSuggestRequest tnyLocationSuggestRequest, lnm<? super TnyLocationSuggestResponse> lnmVar);
}
