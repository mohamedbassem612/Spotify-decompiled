package p;

import com.spotify.playlist4.proto.PlaylistSyncReasonProto;
import com.spotify.playlistediting.history.apiimpl.proto.ListHistoryEntriesRequest;
import com.spotify.playlistediting.history.apiimpl.proto.ListHistoryEntriesResponse;
import com.spotify.playlistediting.history.apiimpl.proto.RestoreToEntryRequest;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u0007H§@¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lp/tgy;", "", "Lcom/spotify/playlistediting/history/apiimpl/proto/ListHistoryEntriesRequest;", "request", "Lcom/spotify/playlistediting/history/apiimpl/proto/ListHistoryEntriesResponse;", "b", "(Lcom/spotify/playlistediting/history/apiimpl/proto/ListHistoryEntriesRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/playlistediting/history/apiimpl/proto/RestoreToEntryRequest;", "a", "(Lcom/spotify/playlistediting/history/apiimpl/proto/RestoreToEntryRequest;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_playlistediting_history_apiimpl-apiimpl"}, k = 1, mv = {2, 3, 0}, xi = PlaylistSyncReasonProto.PlaylistSyncCaller.MULTIGET_ADDITIONAL_RESPONSE_VALUE)
public interface tgy {
    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("entity-history/v1/restore-to-entry")
    Object a(@elb RestoreToEntryRequest restoreToEntryRequest, lnm<Object> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("entity-history/v1/list-history-entries")
    Object b(@elb ListHistoryEntriesRequest listHistoryEntriesRequest, lnm<? super ListHistoryEntriesResponse> lnmVar);
}
