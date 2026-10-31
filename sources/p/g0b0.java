package p;

import com.spotify.kidsgraduation.v1.AcceptTermsRequest;
import com.spotify.kidsgraduation.v1.AcknowledgeDeclinedGraduationRequest;
import com.spotify.kidsgraduation.v1.GetPrivacyPolicyAcceptanceRequest;
import com.spotify.kidsgraduation.v1.GetPrivacyPolicyAcceptanceResponse;
import com.spotify.kidsgraduation.v1.PendingGraduationRequest;
import com.spotify.kidsgraduation.v1.PendingGraduationResponse;
import com.spotify.kidsgraduation.v1.PostponeGraduationRequest;
import com.spotify.kidsgraduation.v1.RequestGraduationRequest;
import com.spotify.kidsgraduation.v1.RespondToGraduationRequest;
import com.spotify.kidsgraduation.v1.ValidateGraduationRequest;
import com.spotify.kidsgraduation.v1.ValidateGraduationResponse;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\bH'¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\fH'¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0012\u001a\u00020\u000f2\b\b\u0001\u0010\u0003\u001a\u00020\fH§@¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0014H'¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u0018H'¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u001bH'¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001f\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u001eH'¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00042\b\b\u0001\u0010\u0003\u001a\u00020!H'¢\u0006\u0004\b#\u0010$ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006%À\u0006\u0001"}, d2 = {"Lp/g0b0;", "", "Lcom/spotify/kidsgraduation/v1/ValidateGraduationRequest;", "request", "Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/kidsgraduation/v1/ValidateGraduationResponse;", "j", "(Lcom/spotify/kidsgraduation/v1/ValidateGraduationRequest;)Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/kidsgraduation/v1/RequestGraduationRequest;", "Lio/reactivex/rxjava3/core/Completable;", "g", "(Lcom/spotify/kidsgraduation/v1/RequestGraduationRequest;)Lio/reactivex/rxjava3/core/Completable;", "Lcom/spotify/kidsgraduation/v1/PostponeGraduationRequest;", "e", "(Lcom/spotify/kidsgraduation/v1/PostponeGraduationRequest;)Lio/reactivex/rxjava3/core/Completable;", "Lp/rih1;", "c", "(Lcom/spotify/kidsgraduation/v1/RequestGraduationRequest;Lp/lnm;)Ljava/lang/Object;", "d", "(Lcom/spotify/kidsgraduation/v1/PostponeGraduationRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/kidsgraduation/v1/GetPrivacyPolicyAcceptanceRequest;", "Lcom/spotify/kidsgraduation/v1/GetPrivacyPolicyAcceptanceResponse;", "i", "(Lcom/spotify/kidsgraduation/v1/GetPrivacyPolicyAcceptanceRequest;)Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/kidsgraduation/v1/AcceptTermsRequest;", "b", "(Lcom/spotify/kidsgraduation/v1/AcceptTermsRequest;)Lio/reactivex/rxjava3/core/Completable;", "Lcom/spotify/kidsgraduation/v1/AcknowledgeDeclinedGraduationRequest;", "a", "(Lcom/spotify/kidsgraduation/v1/AcknowledgeDeclinedGraduationRequest;)Lio/reactivex/rxjava3/core/Completable;", "Lcom/spotify/kidsgraduation/v1/RespondToGraduationRequest;", "f", "(Lcom/spotify/kidsgraduation/v1/RespondToGraduationRequest;)Lio/reactivex/rxjava3/core/Completable;", "Lcom/spotify/kidsgraduation/v1/PendingGraduationRequest;", "Lcom/spotify/kidsgraduation/v1/PendingGraduationResponse;", "h", "(Lcom/spotify/kidsgraduation/v1/PendingGraduationRequest;)Lio/reactivex/rxjava3/core/Single;", "src_main_java_com_spotify_genalphagraduation_graduationimpl-graduationimpl"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface g0b0 {
    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("/spotify.kidsgraduation.v1.GraduationRequestService/AcknowledgeDeclinedGraduation")
    Completable a(@elb AcknowledgeDeclinedGraduationRequest request);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("/spotify.kidsgraduation.v1.GraduationRequestService/AcceptTerms")
    Completable b(@elb AcceptTermsRequest request);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("/spotify.kidsgraduation.v1.GraduationRequestService/RequestGraduation")
    Object c(@elb RequestGraduationRequest requestGraduationRequest, lnm<? super rih1> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("/spotify.kidsgraduation.v1.GraduationRequestService/PostponeGraduation")
    Object d(@elb PostponeGraduationRequest postponeGraduationRequest, lnm<? super rih1> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("/spotify.kidsgraduation.v1.GraduationRequestService/PostponeGraduation")
    Completable e(@elb PostponeGraduationRequest request);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("/spotify.kidsgraduation.v1.GraduationRequestService/RespondToGraduation")
    Completable f(@elb RespondToGraduationRequest request);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("/spotify.kidsgraduation.v1.GraduationRequestService/RequestGraduation")
    Completable g(@elb RequestGraduationRequest request);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("/spotify.kidsgraduation.v1.GraduationRequestService/PendingGraduation")
    Single<PendingGraduationResponse> h(@elb PendingGraduationRequest request);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("/spotify.kidsgraduation.v1.GraduationRequestService/GetPrivacyPolicyAcceptance")
    Single<GetPrivacyPolicyAcceptanceResponse> i(@elb GetPrivacyPolicyAcceptanceRequest request);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("/spotify.kidsgraduation.v1.KidsGraduationService/ValidateGraduation")
    Single<ValidateGraduationResponse> j(@elb ValidateGraduationRequest request);
}
