package p;

import com.spotify.kidsview.v1.proto.DeleteManagedAccountResponse;
import com.spotify.kidsview.v1.proto.GetChildrenResponse;
import com.spotify.kidsview.v1.proto.GetDeleteManagedAccountViewResponse;
import com.spotify.kidsview.v1.proto.GetManagedAccountDetailsViewResponse;
import com.spotify.kidsview.v1.proto.GetManagedAccountsViewResponse;
import com.spotify.kidsview.v1.proto.TransitionToManagedAccountRequest;
import com.spotify.kidsview.v1.proto.TransitionToManagedAccountResponse;
import com.spotify.kidsview.v2.proto.GetParentOrGuardianViewResponse;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0006\u0010\u0004J\u001a\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\r\u0010\u0004J\u001a\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\b\u0001\u0010\u0014\u001a\u00020\u0013H§@¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0019\u0010\u0012J\u001a\u0010\u001b\u001a\u00020\u001a2\b\b\u0001\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0004\b\u001b\u0010\u0012ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001cÀ\u0006\u0001"}, d2 = {"Lp/o2b0;", "", "Lcom/spotify/kidsview/v2/proto/GetParentOrGuardianViewResponse;", "e", "(Lp/lnm;)Ljava/lang/Object;", "Lp/rih1;", "h", "", "includeTeenAccounts", "Lcom/spotify/kidsview/v1/proto/GetManagedAccountsViewResponse;", "f", "(ZLp/lnm;)Ljava/lang/Object;", "Lcom/spotify/kidsview/v1/proto/GetChildrenResponse;", "a", "", "childId", "Lcom/spotify/kidsview/v1/proto/GetManagedAccountDetailsViewResponse;", "g", "(Ljava/lang/String;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/kidsview/v1/proto/TransitionToManagedAccountRequest;", "request", "Lcom/spotify/kidsview/v1/proto/TransitionToManagedAccountResponse;", "c", "(Lcom/spotify/kidsview/v1/proto/TransitionToManagedAccountRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/kidsview/v1/proto/GetDeleteManagedAccountViewResponse;", "b", "Lcom/spotify/kidsview/v1/proto/DeleteManagedAccountResponse;", "d", "src_main_java_com_spotify_genalpha_datasourceimpl-datasourceimpl"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public interface o2b0 {
    @ay30("kids-view/v1/children")
    @u360({"Accept: application/x-protobuf"})
    Object a(lnm<? super GetChildrenResponse> lnmVar);

    @ay30("kids-view/v1/delete-managed-account-view/{childId}")
    @u360({"Accept: application/x-protobuf"})
    Object b(@t8s0("childId") String str, lnm<? super GetDeleteManagedAccountViewResponse> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("kids-view/v1/transition-to-managed-account")
    Object c(@elb TransitionToManagedAccountRequest transitionToManagedAccountRequest, lnm<? super TransitionToManagedAccountResponse> lnmVar);

    @juo("kids-view/v1/managed-account/{childId}")
    @u360({"Accept: application/x-protobuf"})
    Object d(@t8s0("childId") String str, lnm<? super DeleteManagedAccountResponse> lnmVar);

    @ay30("kids-view/v2/parent-or-guardian")
    @u360({"Accept: application/x-protobuf"})
    Object e(lnm<? super GetParentOrGuardianViewResponse> lnmVar);

    @ay30("kids-view/v1/managed-accounts-view")
    @u360({"Accept: application/x-protobuf"})
    Object f(@u0z0("include_teen_accounts") boolean z, lnm<? super GetManagedAccountsViewResponse> lnmVar);

    @ay30("kids-view/v1/managed-account-details-view/{childId}")
    @u360({"Accept: application/x-protobuf"})
    Object g(@t8s0("childId") String str, lnm<? super GetManagedAccountDetailsViewResponse> lnmVar);

    @juo("teen-link/parent")
    Object h(lnm<? super rih1> lnmVar);
}
