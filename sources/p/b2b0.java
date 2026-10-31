package p;

import com.spotify.kidsrequest.v1.ApproveArtistRequestsRequest;
import com.spotify.kidsrequest.v1.ApproveArtistRequestsResponse;
import com.spotify.kidsrequest.v1.CancelRequestRequest;
import com.spotify.kidsrequest.v1.CreateRequestRequest;
import com.spotify.kidsrequest.v1.CreateRequestResponse;
import com.spotify.kidsrequest.v1.GetDecisionsSummaryResponse;
import com.spotify.kidsrequest.v1.GetMyRequestsResponse;
import com.spotify.kidsrequest.v1.GetPendingRequestsResponse;
import com.spotify.kidsrequest.v1.GetRequestStatusRequest;
import com.spotify.kidsrequest.v1.GetRequestStatusResponse;
import com.spotify.kidsrequest.v1.ListChildrenAllowlistSettingsResponse;
import com.spotify.kidsrequest.v1.ResolveRequestRequest;
import com.spotify.kidsrequest.v1.SetChildRequestSettingsRequest;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0012\u001a\u00020\u00012\b\b\u0001\u0010\u0010\u001a\u00020\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\b\u0001\u0010\u0003\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\b\u0001\u0010\u0018\u001a\u00020\u000bH§@¢\u0006\u0004\b\u001a\u0010\u000fJ\u0010\u0010\u001c\u001a\u00020\u001bH§@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eH§@¢\u0006\u0004\b\u001f\u0010\u001dJ$\u0010!\u001a\u00020\u00012\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0003\u001a\u00020 H§@¢\u0006\u0004\b!\u0010\"J$\u0010$\u001a\u00020\u00012\b\b\u0001\u0010\u0010\u001a\u00020\u000b2\b\b\u0001\u0010\u0003\u001a\u00020#H§@¢\u0006\u0004\b$\u0010%ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006&À\u0006\u0001"}, d2 = {"Lp/b2b0;", "", "Lcom/spotify/kidsrequest/v1/CreateRequestRequest;", "request", "Lcom/spotify/kidsrequest/v1/CreateRequestResponse;", "a", "(Lcom/spotify/kidsrequest/v1/CreateRequestRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/kidsrequest/v1/GetRequestStatusRequest;", "Lcom/spotify/kidsrequest/v1/GetRequestStatusResponse;", "c", "(Lcom/spotify/kidsrequest/v1/GetRequestStatusRequest;Lp/lnm;)Ljava/lang/Object;", "", "childId", "Lcom/spotify/kidsrequest/v1/GetPendingRequestsResponse;", "j", "(Ljava/lang/String;Lp/lnm;)Ljava/lang/Object;", "requestId", "Lcom/spotify/kidsrequest/v1/ResolveRequestRequest;", "d", "(Ljava/lang/String;Lcom/spotify/kidsrequest/v1/ResolveRequestRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/kidsrequest/v1/ApproveArtistRequestsRequest;", "Lcom/spotify/kidsrequest/v1/ApproveArtistRequestsResponse;", "g", "(Lcom/spotify/kidsrequest/v1/ApproveArtistRequestsRequest;Lp/lnm;)Ljava/lang/Object;", "since", "Lcom/spotify/kidsrequest/v1/GetDecisionsSummaryResponse;", "f", "Lcom/spotify/kidsrequest/v1/GetMyRequestsResponse;", "e", "(Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/kidsrequest/v1/ListChildrenAllowlistSettingsResponse;", "b", "Lcom/spotify/kidsrequest/v1/SetChildRequestSettingsRequest;", "h", "(Ljava/lang/String;Lcom/spotify/kidsrequest/v1/SetChildRequestSettingsRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/kidsrequest/v1/CancelRequestRequest;", "i", "(Ljava/lang/String;Lcom/spotify/kidsrequest/v1/CancelRequestRequest;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_genalphablocking_datasourceimpl-datasourceimpl"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface b2b0 {
    @u360({svt.d, "Accept: application/x-protobuf"})
    @wyq0("kids-request/v1/request")
    Object a(@elb CreateRequestRequest createRequestRequest, lnm<? super CreateRequestResponse> lnmVar);

    @ay30("kids-request/v1/settings/allowlist")
    @u360({"Accept: application/x-protobuf"})
    Object b(lnm<? super ListChildrenAllowlistSettingsResponse> lnmVar);

    @u360({svt.d, "Accept: application/x-protobuf"})
    @wyq0("kids-request/v1/request-status")
    Object c(@elb GetRequestStatusRequest getRequestStatusRequest, lnm<? super GetRequestStatusResponse> lnmVar);

    @u360({svt.d, "Accept: application/x-protobuf"})
    @wyq0("kids-request/v1/request/{request_id}/resolve")
    Object d(@t8s0("request_id") String str, @elb ResolveRequestRequest resolveRequestRequest, lnm<Object> lnmVar);

    @ay30("kids-request/v1/my-requests")
    @u360({"Accept: application/x-protobuf"})
    Object e(lnm<? super GetMyRequestsResponse> lnmVar);

    @ay30("kids-request/v1/decisions-summary")
    @u360({"Accept: application/x-protobuf"})
    Object f(@u0z0("since") String str, lnm<? super GetDecisionsSummaryResponse> lnmVar);

    @u360({svt.d, "Accept: application/x-protobuf"})
    @wyq0("kids-request/v1/artist-requests/approve")
    Object g(@elb ApproveArtistRequestsRequest approveArtistRequestsRequest, lnm<? super ApproveArtistRequestsResponse> lnmVar);

    @u360({svt.d, "Accept: application/x-protobuf"})
    @wyq0("kids-request/v1/children/{child_id}/settings")
    Object h(@t8s0("child_id") String str, @elb SetChildRequestSettingsRequest setChildRequestSettingsRequest, lnm<Object> lnmVar);

    @u360({"Accept: application/x-protobuf"})
    @wyq0("kids-request/v1/request/{request_id}/cancel")
    Object i(@t8s0("request_id") String str, @elb CancelRequestRequest cancelRequestRequest, lnm<Object> lnmVar);

    @ay30("kids-request/v1/children/{child_id}/pending-requests")
    @u360({svt.d, "Accept: application/x-protobuf"})
    Object j(@t8s0("child_id") String str, lnm<? super GetPendingRequestsResponse> lnmVar);
}
