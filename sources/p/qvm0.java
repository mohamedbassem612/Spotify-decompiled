package p;

import com.spotify.familyverify.v1.AcknowledgeQrCodeVerificationStartNotificationRequest;
import com.spotify.familyverify.v1.AcknowledgeQrCodeVerificationStartNotificationResponse;
import com.spotify.familyverify.v1.GetQrCodeVerificationOnboardingRequest;
import com.spotify.familyverify.v1.GetQrCodeVerificationOnboardingResponse;
import com.spotify.familyverify.v1.StartQrCodeVerificationFlowRequest;
import com.spotify.familyverify.v1.StartQrCodeVerificationFlowResponse;
import com.spotify.familyverify.v1.TriggerQrCodeVerificationStartNotificationRequest;
import com.spotify.familyverify.v1.TriggerQrCodeVerificationStartNotificationResponse;
import com.spotify.familyverify.v1.VerifyQrCodeRequest;
import com.spotify.familyverify.v1.VerifyQrCodeResponse;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u000bH§@¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u0003\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u0003\u001a\u00020\u0013H§@¢\u0006\u0004\b\u0015\u0010\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, d2 = {"Lp/qvm0;", "", "Lcom/spotify/familyverify/v1/GetQrCodeVerificationOnboardingRequest;", "request", "Lcom/spotify/familyverify/v1/GetQrCodeVerificationOnboardingResponse;", "a", "(Lcom/spotify/familyverify/v1/GetQrCodeVerificationOnboardingRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/familyverify/v1/StartQrCodeVerificationFlowRequest;", "Lcom/spotify/familyverify/v1/StartQrCodeVerificationFlowResponse;", "b", "(Lcom/spotify/familyverify/v1/StartQrCodeVerificationFlowRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/familyverify/v1/VerifyQrCodeRequest;", "Lcom/spotify/familyverify/v1/VerifyQrCodeResponse;", "c", "(Lcom/spotify/familyverify/v1/VerifyQrCodeRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/familyverify/v1/TriggerQrCodeVerificationStartNotificationRequest;", "Lcom/spotify/familyverify/v1/TriggerQrCodeVerificationStartNotificationResponse;", "d", "(Lcom/spotify/familyverify/v1/TriggerQrCodeVerificationStartNotificationRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/familyverify/v1/AcknowledgeQrCodeVerificationStartNotificationRequest;", "Lcom/spotify/familyverify/v1/AcknowledgeQrCodeVerificationStartNotificationResponse;", "e", "(Lcom/spotify/familyverify/v1/AcknowledgeQrCodeVerificationStartNotificationRequest;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_multiuserplanverification_datasourceimpl-datasourceimpl"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public interface qvm0 {
    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("/spotify.familyverify.v1.MupVerificationMobileViewService/GetQrCodeVerificationOnboarding")
    Object a(@elb GetQrCodeVerificationOnboardingRequest getQrCodeVerificationOnboardingRequest, lnm<? super GetQrCodeVerificationOnboardingResponse> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("/spotify.familyverify.v1.MupVerificationMobileViewService/StartQrCodeVerificationFlow")
    Object b(@elb StartQrCodeVerificationFlowRequest startQrCodeVerificationFlowRequest, lnm<? super StartQrCodeVerificationFlowResponse> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("/spotify.familyverify.v1.MupVerificationMobileViewService/VerifyQrCode")
    Object c(@elb VerifyQrCodeRequest verifyQrCodeRequest, lnm<? super VerifyQrCodeResponse> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("/spotify.familyverify.v1.MupVerificationMobileViewService/TriggerQrCodeVerificationStartNotification")
    Object d(@elb TriggerQrCodeVerificationStartNotificationRequest triggerQrCodeVerificationStartNotificationRequest, lnm<? super TriggerQrCodeVerificationStartNotificationResponse> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("/spotify.familyverify.v1.MupVerificationMobileViewService/AcknowledgeQrCodeVerificationStartNotification")
    Object e(@elb AcknowledgeQrCodeVerificationStartNotificationRequest acknowledgeQrCodeVerificationStartNotificationRequest, lnm<? super AcknowledgeQrCodeVerificationStartNotificationResponse> lnmVar);
}
