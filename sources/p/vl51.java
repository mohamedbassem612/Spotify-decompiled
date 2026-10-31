package p;

import com.spotify.messages.BetamaxPlaybackSession;
import com.spotify.p4p.ucp.seedsearch.v1.GetSeedSearchResultsRequest;
import com.spotify.p4p.ucp.seedsearch.v1.GetSeedSearchResultsResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lp/vl51;", "", "Lcom/spotify/p4p/ucp/seedsearch/v1/GetSeedSearchResultsRequest;", "request", "Lcom/spotify/p4p/ucp/seedsearch/v1/GetSeedSearchResultsResponse;", "a", "(Lcom/spotify/p4p/ucp/seedsearch/v1/GetSeedSearchResultsRequest;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_promptedplaylists_seedsearchimpl-seedsearchimpl"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public interface vl51 {
    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("ucp-p4p/seed-search")
    Object a(@elb GetSeedSearchResultsRequest getSeedSearchResultsRequest, lnm<? super GetSeedSearchResultsResponse> lnmVar);
}
