package p;

import com.spotify.referrals.service.v1.GetAccountSettingsReferralsRowRequest;
import com.spotify.referrals.service.v1.GetAccountSettingsReferralsRowResponse;
import com.spotify.referrals.service.v1.GetContextualEntrypointCopyForJamRequest;
import com.spotify.referrals.service.v1.GetContextualEntrypointCopyForJamResponse;
import com.spotify.referrals.service.v1.StoreEngagementRequest;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u000bH§@¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lp/m911;", "", "Lcom/spotify/referrals/service/v1/GetAccountSettingsReferralsRowRequest;", "request", "Lcom/spotify/referrals/service/v1/GetAccountSettingsReferralsRowResponse;", "a", "(Lcom/spotify/referrals/service/v1/GetAccountSettingsReferralsRowRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/referrals/service/v1/StoreEngagementRequest;", "Lp/rih1;", "c", "(Lcom/spotify/referrals/service/v1/StoreEngagementRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/referrals/service/v1/GetContextualEntrypointCopyForJamRequest;", "Lcom/spotify/referrals/service/v1/GetContextualEntrypointCopyForJamResponse;", "b", "(Lcom/spotify/referrals/service/v1/GetContextualEntrypointCopyForJamRequest;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_referrals_service-service"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface m911 {
    @u360({svt.d, "Accept: application/x-protobuf"})
    @wyq0("/referrals-service/spotify.referrals.v1.ReferralsConfigurationGrpc/GetAccountSettingsReferralsRow")
    Object a(@elb GetAccountSettingsReferralsRowRequest getAccountSettingsReferralsRowRequest, lnm<? super GetAccountSettingsReferralsRowResponse> lnmVar);

    @u360({svt.d, "Accept: application/x-protobuf"})
    @wyq0("/referrals-service/spotify.referrals.v1.ReferralsConfigurationGrpc/GetContextualEntrypointCopyForJam")
    Object b(@elb GetContextualEntrypointCopyForJamRequest getContextualEntrypointCopyForJamRequest, lnm<? super GetContextualEntrypointCopyForJamResponse> lnmVar);

    @u360({svt.d, "Accept: application/x-protobuf"})
    @wyq0("/referrals-service/spotify.referrals.v1.ReferralsEntrypointEngagementGrpc/StoreEngagement")
    Object c(@elb StoreEngagementRequest storeEngagementRequest, lnm<? super rih1> lnmVar);
}
