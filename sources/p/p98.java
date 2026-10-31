package p;

import com.spotify.playlist4.proto.PlaylistSyncReasonProto;
import kotlin.Metadata;
import spotify.physical_book_to_audiobook_lookup.v1.LookupRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lp/p98;", "", "Lspotify/physical_book_to_audiobook_lookup/v1/LookupRequest;", "data", "Lp/sy21;", "a", "(Lspotify/physical_book_to_audiobook_lookup/v1/LookupRequest;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_pagematch_endpoint-endpoint"}, k = 1, mv = {2, 3, 0}, xi = PlaylistSyncReasonProto.PlaylistSyncCaller.MULTIGET_ADDITIONAL_RESPONSE_VALUE)
public interface p98 {
    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("physical-book-to-audiobook-lookup-api/v1/lookup")
    Object a(@elb LookupRequest lookupRequest, lnm<? super sy21<Object>> lnmVar);
}
