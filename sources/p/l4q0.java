package p;

import com.spotify.ondemandtrials.trialstartimpl.proto.CheckEligibilityRequest;
import com.spotify.ondemandtrials.trialstartimpl.proto.CheckEligibilityResponse;
import com.spotify.ondemandtrials.trialstartimpl.proto.GetTrialRequest;
import com.spotify.ondemandtrials.trialstartimpl.proto.GetTrialResponse;
import com.spotify.ondemandtrials.trialstartimpl.proto.StartTrialRequest;
import com.spotify.ondemandtrials.trialstartimpl.proto.StartTrialResponse;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\nH§@¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u0003\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0010\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Lp/l4q0;", "", "Lcom/spotify/ondemandtrials/trialstartimpl/proto/StartTrialRequest;", "request", "Lcom/spotify/ondemandtrials/trialstartimpl/proto/StartTrialResponse;", "a", "(Lcom/spotify/ondemandtrials/trialstartimpl/proto/StartTrialRequest;Lp/lnm;)Ljava/lang/Object;", "Lp/rih1;", "b", "(Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/ondemandtrials/trialstartimpl/proto/CheckEligibilityRequest;", "Lcom/spotify/ondemandtrials/trialstartimpl/proto/CheckEligibilityResponse;", "d", "(Lcom/spotify/ondemandtrials/trialstartimpl/proto/CheckEligibilityRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/ondemandtrials/trialstartimpl/proto/GetTrialRequest;", "Lcom/spotify/ondemandtrials/trialstartimpl/proto/GetTrialResponse;", "c", "(Lcom/spotify/ondemandtrials/trialstartimpl/proto/GetTrialRequest;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_ondemandtrials_trialstartimpl-trialstartimpl"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public interface l4q0 {
    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("trials-facade/v2/start-trial")
    Object a(@elb StartTrialRequest startTrialRequest, lnm<? super StartTrialResponse> lnmVar);

    @wyq0("trials-facade/start-trial")
    Object b(lnm<? super rih1> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("trial-metadata/get-trial")
    Object c(@elb GetTrialRequest getTrialRequest, lnm<? super GetTrialResponse> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("trials-facade/check-eligibility/on-demand")
    Object d(@elb CheckEligibilityRequest checkEligibilityRequest, lnm<? super CheckEligibilityResponse> lnmVar);
}
