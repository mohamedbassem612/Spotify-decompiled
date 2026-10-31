package p;

import com.spotify.campfire.chatcontentpickerpage.gifs.proto.PopularRequest;
import com.spotify.campfire.chatcontentpickerpage.gifs.proto.PopularResponse;
import com.spotify.campfire.chatcontentpickerpage.gifs.proto.SearchRequest;
import com.spotify.campfire.chatcontentpickerpage.gifs.proto.SearchResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lp/cs40;", "", "Lcom/spotify/campfire/chatcontentpickerpage/gifs/proto/SearchRequest;", "request", "Lcom/spotify/campfire/chatcontentpickerpage/gifs/proto/SearchResponse;", "b", "(Lcom/spotify/campfire/chatcontentpickerpage/gifs/proto/SearchRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/campfire/chatcontentpickerpage/gifs/proto/PopularRequest;", "Lcom/spotify/campfire/chatcontentpickerpage/gifs/proto/PopularResponse;", "a", "(Lcom/spotify/campfire/chatcontentpickerpage/gifs/proto/PopularRequest;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_campfire_chatcontentpickerpage_gifs-gifs"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface cs40 {
    @wyq0("gif-proxy/v1/popular")
    Object a(@elb PopularRequest popularRequest, lnm<? super PopularResponse> lnmVar);

    @wyq0("gif-proxy/v1/search")
    Object b(@elb SearchRequest searchRequest, lnm<? super SearchResponse> lnmVar);
}
