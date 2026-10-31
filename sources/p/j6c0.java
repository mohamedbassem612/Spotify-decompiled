package p;

import com.spotify.libraryimportservice.tmm.GetTransferResultsBannerResponse;
import com.spotify.libraryimportservice.tmm.StoreTransferResultsEngagementRequest;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J$\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lp/j6c0;", "", "Lcom/spotify/libraryimportservice/tmm/GetTransferResultsBannerResponse;", "a", "(Lp/lnm;)Ljava/lang/Object;", "", "transferId", "Lcom/spotify/libraryimportservice/tmm/StoreTransferResultsEngagementRequest;", "request", "Lp/rih1;", "b", "(Ljava/lang/String;Lcom/spotify/libraryimportservice/tmm/StoreTransferResultsEngagementRequest;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_libraryimport_matchresult_impl-impl"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface j6c0 {
    @ay30("library-import/v1/transfer-results-banner")
    @u360({"Accept: application/x-protobuf"})
    Object a(lnm<? super GetTransferResultsBannerResponse> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("library-import/v1/transfer-results-engagement/{transferId}")
    Object b(@t8s0("transferId") String str, @elb StoreTransferResultsEngagementRequest storeTransferResultsEngagementRequest, lnm<? super rih1> lnmVar);
}
