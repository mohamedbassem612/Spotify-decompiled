package p;

import com.spotify.pam.showvalue.YourPremiumRequest;
import com.spotify.pam.showvalue.YourPremiumResponse;
import com.spotify.pam.v2.GetAstroOnManagementRequest;
import com.spotify.pam.v2.GetAstroOnManagementResponse;
import com.spotify.pam.v2.GetAudiobookConsiderationRequest;
import com.spotify.pam.v2.GetAudiobookConsiderationResponse;
import com.spotify.pam.v2.GetAvailablePlansViewRequest;
import com.spotify.pam.v2.GetAvailablePlansViewResponse;
import com.spotify.pam.v2.GetBillingViewRequest;
import com.spotify.pam.v2.GetBillingViewResponse;
import com.spotify.pam.v2.GetDenominationSelectionRequest;
import com.spotify.pam.v2.GetDenominationSelectionResponse;
import com.spotify.pam.v2.GetPlanConsiderationRequest;
import com.spotify.pam.v2.GetPlanDetailsViewRequest;
import com.spotify.pam.v2.GetPlanDetailsViewResponse;
import com.spotify.pam.v2.GetPlanOverviewViewRequest;
import com.spotify.pam.v2.GetPlanOverviewViewResponse;
import com.spotify.pam.v2.GetYourPremiumBadgeRequest;
import com.spotify.pam.v2.GetYourPremiumBadgeResponse;
import com.spotify.pamviewservice.v1.proto.PremiumPlanRow;
import com.spotify.playlist4.proto.PlaylistSyncReasonProto;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u0000 .2\u00020\u0001:\u0001/J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u000bH§@¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u00102\b\b\u0003\u0010\u0003\u001a\u00020\u000fH'¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\b\u0003\u0010\u0003\u001a\u00020\u0013H§@¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\b\u0003\u0010\u0003\u001a\u00020\u0017H§@¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\b\u0003\u0010\u0003\u001a\u00020\u001bH§@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u0010H'¢\u0006\u0004\b \u0010!J\u001f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00102\b\b\u0003\u0010\u0003\u001a\u00020\"H'¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\b\u0003\u0010\u0003\u001a\u00020&H§@¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\b\u0001\u0010\u0003\u001a\u00020*H§@¢\u0006\u0004\b,\u0010-ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00060À\u0006\u0001"}, d2 = {"Lp/enr0;", "", "Lcom/spotify/pam/v2/GetAudiobookConsiderationRequest;", "body", "Lcom/spotify/pam/v2/GetAudiobookConsiderationResponse;", "l", "(Lcom/spotify/pam/v2/GetAudiobookConsiderationRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/pam/v2/GetAstroOnManagementRequest;", "Lcom/spotify/pam/v2/GetAstroOnManagementResponse;", "n", "(Lcom/spotify/pam/v2/GetAstroOnManagementRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/pam/v2/GetPlanDetailsViewRequest;", "Lcom/spotify/pam/v2/GetPlanDetailsViewResponse;", "j", "(Lcom/spotify/pam/v2/GetPlanDetailsViewRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/pam/v2/GetPlanConsiderationRequest;", "Lio/reactivex/rxjava3/core/Single;", "b", "(Lcom/spotify/pam/v2/GetPlanConsiderationRequest;)Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/pam/v2/GetAvailablePlansViewRequest;", "Lcom/spotify/pam/v2/GetAvailablePlansViewResponse;", "q", "(Lcom/spotify/pam/v2/GetAvailablePlansViewRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/pam/v2/GetPlanOverviewViewRequest;", "Lcom/spotify/pam/v2/GetPlanOverviewViewResponse;", "c", "(Lcom/spotify/pam/v2/GetPlanOverviewViewRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/pam/v2/GetBillingViewRequest;", "Lcom/spotify/pam/v2/GetBillingViewResponse;", "h", "(Lcom/spotify/pam/v2/GetBillingViewRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/pamviewservice/v1/proto/PremiumPlanRow;", "g", "()Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/pam/v2/GetYourPremiumBadgeRequest;", "Lcom/spotify/pam/v2/GetYourPremiumBadgeResponse;", "p", "(Lcom/spotify/pam/v2/GetYourPremiumBadgeRequest;)Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/pam/showvalue/YourPremiumRequest;", "Lcom/spotify/pam/showvalue/YourPremiumResponse;", "d", "(Lcom/spotify/pam/showvalue/YourPremiumRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/pam/v2/GetDenominationSelectionRequest;", "Lcom/spotify/pam/v2/GetDenominationSelectionResponse;", "e", "(Lcom/spotify/pam/v2/GetDenominationSelectionRequest;Lp/lnm;)Ljava/lang/Object;", "a", "p/dnr0", "src_main_java_com_spotify_premiumaccountmanagement_endpoints-endpoints"}, k = 1, mv = {2, 3, 0}, xi = PlaylistSyncReasonProto.PlaylistSyncCaller.MULTIGET_ADDITIONAL_RESPONSE_VALUE)
public interface enr0 {
    public static final dnr0 a = dnr0.a;

    static /* synthetic */ Single a(enr0 enr0Var, GetYourPremiumBadgeRequest getYourPremiumBadgeRequest, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: getYourPremiumBadge");
            return null;
        }
        if ((i & 1) != 0) {
            sr40 sr40VarN = GetYourPremiumBadgeRequest.n();
            sr40VarN.n();
            getYourPremiumBadgeRequest = (GetYourPremiumBadgeRequest) sr40VarN.build();
        }
        return enr0Var.p(getYourPremiumBadgeRequest);
    }

    static /* synthetic */ Object f(enr0 enr0Var, GetBillingViewRequest getBillingViewRequest, lnm lnmVar, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: getBillingPage");
            return null;
        }
        if ((i & 1) != 0) {
            gl40 gl40VarN = GetBillingViewRequest.n();
            gl40VarN.n();
            getBillingViewRequest = (GetBillingViewRequest) gl40VarN.build();
        }
        return enr0Var.h(getBillingViewRequest, lnmVar);
    }

    static /* synthetic */ Object i(enr0 enr0Var, GetPlanOverviewViewRequest getPlanOverviewViewRequest, lnm lnmVar, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: getPlanOverviewPage");
            return null;
        }
        if ((i & 1) != 0) {
            to40 to40VarN = GetPlanOverviewViewRequest.n();
            to40VarN.q();
            getPlanOverviewViewRequest = (GetPlanOverviewViewRequest) to40VarN.build();
        }
        return enr0Var.c(getPlanOverviewViewRequest, lnmVar);
    }

    static /* synthetic */ Single k(enr0 enr0Var, GetPlanConsiderationRequest getPlanConsiderationRequest, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: getPlanConsiderationPage");
            return null;
        }
        if ((i & 1) != 0) {
            ro40 ro40VarN = GetPlanConsiderationRequest.n();
            ro40VarN.n();
            getPlanConsiderationRequest = (GetPlanConsiderationRequest) ro40VarN.build();
        }
        return enr0Var.b(getPlanConsiderationRequest);
    }

    static /* synthetic */ Object m(enr0 enr0Var, YourPremiumRequest yourPremiumRequest, lnm lnmVar, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: getShowValuePlanOverview");
            return null;
        }
        if ((i & 1) != 0) {
            zzm1 zzm1VarN = YourPremiumRequest.n();
            zzm1VarN.n();
            yourPremiumRequest = (YourPremiumRequest) zzm1VarN.build();
        }
        return enr0Var.d(yourPremiumRequest, lnmVar);
    }

    static /* synthetic */ Object o(enr0 enr0Var, GetAvailablePlansViewRequest getAvailablePlansViewRequest, lnm lnmVar, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: getAvailablePlansPage");
            return null;
        }
        if ((i & 1) != 0) {
            fl40 fl40VarN = GetAvailablePlansViewRequest.n();
            fl40VarN.n();
            getAvailablePlansViewRequest = (GetAvailablePlansViewRequest) fl40VarN.build();
        }
        return enr0Var.q(getAvailablePlansViewRequest, lnmVar);
    }

    @u360({"Content-Type: application/x-protobuf", "Accept: application/protobuf"})
    @wyq0("pam-view-service/spotify.pam.v2.PamViewService/GetPlanConsideration")
    Single<Object> b(@elb GetPlanConsiderationRequest body);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/protobuf"})
    @wyq0("pam-view-service/spotify.pam.v2.PamViewService/GetPlanOverview")
    Object c(@elb GetPlanOverviewViewRequest getPlanOverviewViewRequest, lnm<? super GetPlanOverviewViewResponse> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/protobuf"})
    @wyq0("pam-view-service/spotify.pam.v2.PamViewService/GetShowValuePlanOverview")
    Object d(@elb YourPremiumRequest yourPremiumRequest, lnm<? super YourPremiumResponse> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/protobuf"})
    @wyq0("pam-view-service/spotify.pam.v2.PamViewService/GetDenominationSelection")
    Object e(@elb GetDenominationSelectionRequest getDenominationSelectionRequest, lnm<? super GetDenominationSelectionResponse> lnmVar);

    @ay30("pam-view-service/v1/GetPremiumPlanRow")
    @u360({"Content-Type: application/x-protobuf", "Accept: application/protobuf"})
    Single<PremiumPlanRow> g();

    @u360({"Content-Type: application/x-protobuf", "Accept: application/protobuf"})
    @wyq0("pam-view-service/spotify.pam.v2.PamViewService/GetBillingView")
    Object h(@elb GetBillingViewRequest getBillingViewRequest, lnm<? super GetBillingViewResponse> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/protobuf"})
    @wyq0("pam-view-service/spotify.pam.v2.PamViewService/GetPlanDetails")
    Object j(@elb GetPlanDetailsViewRequest getPlanDetailsViewRequest, lnm<? super GetPlanDetailsViewResponse> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/protobuf"})
    @wyq0("pam-view-service/spotify.pam.v2.PamViewService/GetAudiobookConsideration")
    Object l(@elb GetAudiobookConsiderationRequest getAudiobookConsiderationRequest, lnm<? super GetAudiobookConsiderationResponse> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/protobuf"})
    @wyq0("pam-view-service/spotify.pam.v2.PamViewService/GetAstroOnManagement")
    Object n(@elb GetAstroOnManagementRequest getAstroOnManagementRequest, lnm<? super GetAstroOnManagementResponse> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/protobuf"})
    @wyq0("pam-view-service/v2/yourpremiumbadge")
    Single<GetYourPremiumBadgeResponse> p(@elb GetYourPremiumBadgeRequest body);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/protobuf"})
    @wyq0("pam-view-service/spotify.pam.v2.PamViewService/GetAvailablePlans")
    Object q(@elb GetAvailablePlansViewRequest getAvailablePlansViewRequest, lnm<? super GetAvailablePlansViewResponse> lnmVar);
}
