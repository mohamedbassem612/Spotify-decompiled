package p;

import com.spotify.searchview.proto.AutocompleteViewResponse;
import com.spotify.searchview.proto.MainViewResponse;
import com.spotify.searchview.proto.NativeViewResponse;
import com.spotify.stream_reporting_esperanto.proto.StreamStartRequestOuterClass$StreamStartRequest;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JA\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\b\u0010\tJ<\u0010\n\u001a\u00020\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\n\u0010\u000bJG\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00062\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u000e\u0010\tJG\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\f0\u00062\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0010\u0010\tJ%\u0010\u0012\u001a\u00020\u00112\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0012\u0010\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Lp/rd51;", "", "", "", "params", "headers", "Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/searchview/proto/MainViewResponse;", "a", "(Ljava/util/Map;Ljava/util/Map;)Lio/reactivex/rxjava3/core/Single;", "d", "(Ljava/util/Map;Ljava/util/Map;Lp/lnm;)Ljava/lang/Object;", "Lp/sy21;", "Lcom/spotify/searchview/proto/AutocompleteViewResponse;", "e", "Lcom/spotify/searchview/proto/NativeViewResponse;", "c", "Lio/reactivex/rxjava3/core/Completable;", "b", "(Ljava/util/Map;)Lio/reactivex/rxjava3/core/Completable;", "src_main_java_com_spotify_search_onlineproto-onlineproto"}, k = 1, mv = {2, 3, 0}, xi = StreamStartRequestOuterClass$StreamStartRequest.PREVIEW_IMPRESSION_URI_FIELD_NUMBER)
public interface rd51 {
    @ay30("searchview/v3/search")
    @u360({"Accept: application/protobuf"})
    Single<MainViewResponse> a(@c1z0 Map<String, String> params, @o160 Map<String, String> headers);

    @u360({"Accept: application/protobuf"})
    @wyq0("searchview/v3/delete-recent-query-suggestion")
    Completable b(@c1z0 Map<String, String> params);

    @ay30("searchview/v3/native")
    @u360({"Accept: application/protobuf"})
    Single<sy21<NativeViewResponse>> c(@c1z0 Map<String, String> params, @o160 Map<String, String> headers);

    @ay30("searchview/v3/search")
    @u360({"Accept: application/protobuf"})
    Object d(@c1z0 Map<String, String> map, @o160 Map<String, String> map2, lnm<? super MainViewResponse> lnmVar);

    @ay30("searchview/v3/autocomplete")
    @u360({"Accept: application/protobuf"})
    Single<sy21<AutocompleteViewResponse>> e(@c1z0 Map<String, String> params, @o160 Map<String, String> headers);
}
