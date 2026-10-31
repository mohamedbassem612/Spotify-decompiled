package p;

import kotlin.Metadata;
import spotify.transcript_search.v1.SearchRequest;
import spotify.transcript_search.v1.SearchResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lp/dil1;", "", "Lspotify/transcript_search/v1/SearchRequest;", "data", "Lp/sy21;", "Lspotify/transcript_search/v1/SearchResponse;", "a", "(Lspotify/transcript_search/v1/SearchRequest;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_pagematch_endpoint-endpoint"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface dil1 {
    @u360({"Content-Type: application/x-protobuf", "Accept: application/protobuf"})
    @wyq0("transcript-search-api/v1/search")
    Object a(@elb SearchRequest searchRequest, lnm<? super sy21<SearchResponse>> lnmVar);
}
