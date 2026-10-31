package p;

import com.spotify.searchview.proto.AutocompleteViewResponse;
import com.spotify.stream_reporting_esperanto.proto.StreamStartRequestOuterClass$StreamStartRequest;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J&\u0010\u0006\u001a\u00020\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lp/kea1;", "", "", "", "params", "Lcom/spotify/searchview/proto/AutocompleteViewResponse;", "a", "(Ljava/util/Map;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_songdna_searchclient-searchclient"}, k = 1, mv = {2, 3, 0}, xi = StreamStartRequestOuterClass$StreamStartRequest.PREVIEW_IMPRESSION_URI_FIELD_NUMBER)
public interface kea1 {
    @ay30("searchview/v3/autocomplete")
    @u360({"Accept: application/protobuf"})
    Object a(@c1z0 Map<String, String> map, lnm<? super AutocompleteViewResponse> lnmVar);
}
